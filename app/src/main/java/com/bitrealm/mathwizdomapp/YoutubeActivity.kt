package com.bitrealm.mathwizdomapp

import android.annotation.SuppressLint
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.MenuItem
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.activity.OnBackPressedCallback
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.edit
import androidx.core.view.GravityCompat
import androidx.core.view.WindowCompat
import androidx.core.view.WindowInsetsCompat
import androidx.core.view.WindowInsetsControllerCompat
import androidx.drawerlayout.widget.DrawerLayout
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.bitrealm.mathwizdomapp.adapters.YoutubeLinksAdapter
import com.bitrealm.mathwizdomapp.database.AppDatabase
import com.bitrealm.mathwizdomapp.dialogs.VolumeControlDialog
import com.bitrealm.mathwizdomapp.repository.UserRepository
import com.bitrealm.mathwizdomapp.utils.MusicManager
import com.bitrealm.mathwizdomapp.utils.NavigationHelper
import com.bitrealm.mathwizdomapp.utils.loadAvatarUri
import com.google.android.material.navigation.NavigationView
import kotlinx.coroutines.launch

class YoutubeActivity : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {

    private lateinit var drawerLayout: DrawerLayout
    private lateinit var navigationView: NavigationView
    private lateinit var btnBack: ImageButton
    private lateinit var btnSpeaker: ImageButton
    private lateinit var tvTitle: TextView
    private lateinit var rvYoutubeLinks: RecyclerView
    private lateinit var ivAnimal: ImageView

    private lateinit var userRepository: UserRepository
    private var userIdentifier: String = ""
    private var quarter: Int = 1
    private var lessonNumber: Int = 1

    private val quarterAnimals = mapOf(
        1 to R.drawable.cat,
        2 to R.drawable.bird,
        3 to R.drawable.dragon,
        4 to R.drawable.fox
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_youtube)

        setupImmersiveMode()

        val database = AppDatabase.getDatabase(this)
        userRepository = UserRepository(database.userDao())

        userIdentifier = intent.getStringExtra("USER_IDENTIFIER") ?: ""
        quarter = intent.getIntExtra("QUARTER", 1)
        lessonNumber = intent.getIntExtra("LESSON_NUMBER", 1)

        initViews()
        setupUI()
        setupNavigationDrawer()
        setupListeners()
        setupBackPressHandler()
        loadUserData()
        loadYoutubeLinks()
    }

    override fun onResume() {
        super.onResume()
        MusicManager.play()
    }

    override fun onPause() {
        super.onPause()
        MusicManager.pause()
    }

    private fun initViews() {
        drawerLayout = findViewById(R.id.drawerLayout)
        navigationView = findViewById(R.id.navigationView)
        btnBack = findViewById(R.id.btnBack)
        btnSpeaker = findViewById(R.id.btnSpeaker)
        tvTitle = findViewById(R.id.tvYoutubeTitle)
        rvYoutubeLinks = findViewById(R.id.rvYoutubeLinks)
        ivAnimal = findViewById(R.id.ivAnimal)
    }

    @SuppressLint("SetTextI18n")
    private fun setupUI() {
        tvTitle.text = "LESSON $lessonNumber - YOUTUBE VIDEOS"
        ivAnimal.setImageResource(quarterAnimals[quarter] ?: R.drawable.cat)
    }

    private fun setupNavigationDrawer() {
        navigationView.setNavigationItemSelectedListener(this)
    }

    private fun setupListeners() {
        btnBack.setOnClickListener {
            finish()
        }

        btnSpeaker.setOnClickListener {
            showVolumeDialog()
        }
    }

    private fun showVolumeDialog() {
        val dialog = VolumeControlDialog(this)
        dialog.show()
        dialog.window?.setBackgroundDrawableResource(android.R.color.transparent)
    }

    private fun setupBackPressHandler() {
        onBackPressedDispatcher.addCallback(this, object : OnBackPressedCallback(true) {
            override fun handleOnBackPressed() {
                if (drawerLayout.isDrawerOpen(GravityCompat.START)) {
                    drawerLayout.closeDrawer(GravityCompat.START)
                } else {
                    finish()
                }
            }
        })
    }

    private fun loadYoutubeLinks() {
        val youtubeLinks = getYoutubeLinksForLesson(quarter, lessonNumber)

        if (youtubeLinks.isEmpty()) {
            Toast.makeText(this, "No YouTube videos available for this lesson", Toast.LENGTH_SHORT).show()
            return
        }

        rvYoutubeLinks.layoutManager = LinearLayoutManager(this)
        val adapter = YoutubeLinksAdapter(youtubeLinks) { url ->
            openYoutubeLink(url)
        }
        rvYoutubeLinks.adapter = adapter
    }

    @SuppressLint("UseKtx")
    private fun openYoutubeLink(url: String) {
        try {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
            startActivity(intent)
        } catch (_: Exception) {
            Toast.makeText(this, "Could not open YouTube link", Toast.LENGTH_SHORT).show()
        }
    }

    private fun getYoutubeLinksForLesson(quarter: Int, lessonNumber: Int): List<YoutubeLink> {
        return when (quarter) {
            1 -> getQuarter1Links(lessonNumber)
            2 -> getQuarter2Links(lessonNumber)
            3 -> getQuarter3Links(lessonNumber)
            4 -> getQuarter4Links(lessonNumber)
            else -> emptyList()
        }
    }

    private fun getQuarter1Links(lessonNumber: Int): List<YoutubeLink> {
        return when (lessonNumber) {
            1 -> listOf(
                YoutubeLink("Similar and Dissimilar Fractions", "https://youtu.be/xqIeq5JaAdo?si=1lEjMA2PmkEnQqpy", "DEPED TV"),
                YoutubeLink("Similar and Dissimilar Fractions", "https://www.youtube.com/watch?v=_46tgcv1drY", "Ms. Jessa's Tutorial"),
                YoutubeLink("Add Simple and Mixed Fractions", "https://www.youtube.com/watch?v=uDd2BcuMgXI", "DEPED TV"),
                YoutubeLink("Add Simple and Mixed Fractions", "https://www.youtube.com/watch?v=icrgiBxrrR0", "Sir Marion"),
                YoutubeLink("Subtract Simple and Mixed Fractions", "https://youtu.be/05PqnV90vyM?si=uYVD8zqvuqefrFwU", "DEPED TV"),
                YoutubeLink("Subtract Simple and Mixed Fractions", "https://www.youtube.com/watch?v=OTm3YwUCOME", "Sir Marion")
            )
            2 -> listOf(
                YoutubeLink("Routine and Non-routine Problems", "https://youtu.be/RYtBXYRJFOY?si=BVY1mj__VHrHVL4x", "DEPED TV"),
                YoutubeLink("Routine and Non-routine Problems", "https://www.youtube.com/watch?v=LAjcpEc3lBY", "MATHster Kids")
            )
            3 -> listOf(
                YoutubeLink("Multiplies Simple Fractions and Mixed Fractions", "https://youtu.be/pQi8i5hv9pc?si=fKlvp45A52sa4fTH", "DEPED TV"),
                YoutubeLink("Multiplies Simple Fractions", "https://www.youtube.com/watch?v=alstJ37BoZo", "Math with Mr. J"),
                YoutubeLink("Cancellation Method", "https://www.youtube.com/watch?v=TtQUtySj9Ac", "MATH TEACHER GON"),
                YoutubeLink("Multiplies Mixed Numbers", "https://www.youtube.com/watch?v=gMJBu8BXhgU", "Math with Mr. J")
            )
            4 -> listOf(
                YoutubeLink("Problem Solving with Multiplication", "https://youtu.be/D-qhjxGEEfQ?si=jZd_2xFbAxf-cZEE", "DEPED TV"),
                YoutubeLink("Problem Solving with Multiplication", "https://www.youtube.com/watch?v=wExX0QYwM8E", "Math is Fun")
            )
            5 -> listOf(
                YoutubeLink("Dividing Simple Fractions and Mixed Fractions", "https://youtu.be/2WW8yHqVpT0?si=2pjrXk_62SbdAc-k", "DEPED TV"),
                YoutubeLink("Dividing Simple Fractions", "https://www.youtube.com/watch?v=RAKwouL-lTc", "Math with Mr. J"),
                YoutubeLink("Dividing Mixed Fractions", "https://www.youtube.com/watch?v=cARsEw-s8Fg", "Math with Mr. J")
            )
            6 -> listOf(
                YoutubeLink("Problem Solving with Division", "https://youtu.be/7nzx37HgRdw?si=aPUEjTwCtHZty3Ih", "DEPED TV"),
                YoutubeLink("Problem Solving with Division", "https://www.youtube.com/watch?v=9uCxZk7sDpY", "Math is Fun")
            )
            7 -> listOf(
                YoutubeLink("Rounding Off Decimals", "https://youtu.be/Q7xI1_YUsRw?si=B35bA-U7ZJwwzEZV", "DEPED TV"),
                YoutubeLink("Adding and Subtracting Decimals", "https://youtu.be/-3EcOEkm4IM?si=b2T7RUAvY1bO1yPJ", "DEPED TV"),
                YoutubeLink("Rounding Off Decimals", "https://www.youtube.com/watch?v=P7ozJW8LSxw", "Math with Mr. J"),
                YoutubeLink("Adding and Subtracting Decimals", "https://www.youtube.com/watch?v=PnwLv6khwk8", "Math with Mr. J")
            )
            8 -> listOf(
                YoutubeLink("Problem Solving with Addition and Subtraction", "https://youtu.be/BvXaLe6h_bY?si=0kOBB2tQk-tPkEJH", "DEPED TV"),
                YoutubeLink("Problem Solving with Decimals", "https://www.youtube.com/watch?v=xrdTnPlWcH8", "Mr. Math Deontoy")
            )
            9 -> listOf(
                YoutubeLink("Multiplying Decimals", "https://youtu.be/MC7j2Gc_d0M?si=lc6zamLlDTRWaOiT", "DEPED TV"),
                YoutubeLink("Multiplying Decimals", "https://www.youtube.com/watch?v=Dm028SSei88", "Math with Mr. J")
            )
            10 -> listOf(
                YoutubeLink("Multiplying Decimals by Powers of 10", "https://youtu.be/MC7j2Gc_d0M?si=lc6zamLlDTRWaOiT", "DEPED TV"),
                YoutubeLink("Multiplying by Powers of 10", "https://www.youtube.com/watch?v=v2qLlJ7KwHk", "Math with Mr. J")
            )
            11 -> listOf(
                YoutubeLink("Word Problems with Multiplying Decimals", "https://youtu.be/o5Rw7YLPVYc?si=1xL4llWplIqSsziv", "DEPED TV"),
                YoutubeLink("Word Problems with Decimals", "https://www.youtube.com/watch?v=NpCQ9IThSgk", "Teacher Frell")
            )
            12 -> listOf(
                YoutubeLink("Multi-step Problem Solving", "https://youtu.be/ufIEG-GVb6M?si=MGAC4qk8wLpOmCfE", "DEPED TV"),
                YoutubeLink("Multi-step Problem Solving", "https://www.youtube.com/watch?v=ZsRcZo-Km60", "Teacher Frell")
            )
            13 -> listOf(
                YoutubeLink("Division of Whole and Decimal Numbers", "https://youtu.be/vdTr-crzz3s?si=Ym6sdWSbODGt2Byw", "DEPED TV"),
                YoutubeLink("Division of Decimals", "https://www.youtube.com/watch?v=Val4TmjHXRY", "Math with Mr. J")
            )
            14 -> listOf(
                YoutubeLink("Dividing Decimals by 10", "https://youtu.be/S5aSb7sZB1Y?si=Efmt4fwOwK2PuU9p", "DEPED TV"),
                YoutubeLink("Dividing by Powers of 10", "https://www.youtube.com/watch?v=aa8R5tSHEng", "Let's Do Math")
            )
            15 -> listOf(
                YoutubeLink("Rational and Irrational Numbers", "https://youtu.be/e1DMfwEuf-k?si=Wry-CtV_MLgqYp7F", "DEPED TV"),
                YoutubeLink("Terminating and Non-terminating Decimals", "https://youtu.be/ko4jOGQDOFw?si=3AKtXNQmKDHvUAIK", "DEPED TV"),
                YoutubeLink("Rational and Irrational Numbers", "https://www.youtube.com/watch?v=4IQZ83iUBjI", "Let's Do Math"),
                YoutubeLink("Terminating and Non-terminating Decimals", "https://www.youtube.com/watch?v=Jf_-FfaMMZM", "Math with Mr. J")
            )
            16 -> listOf(
                YoutubeLink("Problem Solving with Division of Decimals", "https://youtu.be/JwArItx-wrI?si=Zlb82nvVWQVhm7VS", "DEPED TV"),
                YoutubeLink("Problem Solving with Division", "https://www.youtube.com/watch?v=_GeSlide", "SIR EFREN VILLAESTER")
            )
            17 -> listOf(
                YoutubeLink("Problem Solving with Multiplication of Decimals", "https://youtu.be/o5Rw7YLPVYc?si=1y0yegOzO9Z22g5g", "DEPED TV"),
                YoutubeLink("Problem Solving with All Operations", "https://www.youtube.com/watch?v=E8jD1W4SaBY&t=193s", "Teacher Frell")
            )
            else -> emptyList()
        }
    }

    private fun getQuarter2Links(lessonNumber: Int): List<YoutubeLink> {
        return when (lessonNumber) {
            1 -> listOf(
                YoutubeLink("Relating Fraction and Ratio", "https://www.youtube.com/live/KSCVgaON3Mk?si=2UaWsHaASqf-38aw", "DEPED TV"),
                YoutubeLink("Relating Fraction and Ratio", "https://www.youtube.com/watch?v=aAaVkrYJQVg", "Teacher Frell")
            )
            2 -> listOf(
                YoutubeLink("Concept of Ratio and Proportion", "https://youtu.be/ZYgUqBqY0AM?si=j0E19Tjm1FHn-0r4", "DEPED TV"),
                YoutubeLink("Proportion", "https://www.youtube.com/watch?v=wT8tGc-SwKk", "Math with Mr. J"),
                YoutubeLink("Types of Proportion", "https://www.youtube.com/watch?v=fPQQsGL74CA", "Sheena Doria")
            )
            3 -> listOf(
                YoutubeLink("Percentage, Rate and Base", "https://youtu.be/UkjZpJPVHHM?si=WdjVuIRDo9x2gN18", "DEPED TV"),
                YoutubeLink("Percentage, Rate, and Base", "https://www.youtube.com/watch?v=aV8bgQ73L4w", "Math is Fun"),
                YoutubeLink("Finding Percentage, Rate, and Base", "https://www.youtube.com/watch?v=WIkfkR15ElM", "Sheena Doria"),
                YoutubeLink("Routine and Non-routine Problems", "https://www.youtube.com/watch?v=tDpJEpbdNw4", "Math is Fun")
            )
            4 -> listOf(
                YoutubeLink("Solving Discount and Sale Price", "https://www.youtube.com/watch?v=UTaVBeDkig0", "Math is Fun"),
                YoutubeLink("Solving Markup Price", "https://www.youtube.com/watch?v=Uvd89SAbFB4", "Sheena Doria"),
                YoutubeLink("Solving Commission", "https://www.youtube.com/watch?v=YSWpoyEhYzA", "Sheena Doria"),
                YoutubeLink("Solving Sales Tax", "https://www.youtube.com/watch?v=nNhGLjHjNc8", "Math with Mr. J"),
                YoutubeLink("Solving Simple Interest", "https://www.youtube.com/watch?v=AdF-8ydl0mk", "What's Up Dude")
            )
            5 -> listOf(
                YoutubeLink("Exponent and Base", "https://www.youtube.com/watch?v=A8IBkgbnRYQ", "DEPED TV"),
                YoutubeLink("Exponent and Base", "https://www.youtube.com/watch?v=O1QFagsKL58", "Math is Fun")
            )
            6 -> listOf(
                YoutubeLink("GEMDAS", "https://www.youtube.com/watch?v=j5qJoUqsv1E", "DEPED TV"),
                YoutubeLink("GEMDAS", "https://www.youtube.com/watch?v=HLhW00sZs1s", "Teacher Frell")
            )
            7 -> listOf(
                YoutubeLink("Integers", "https://youtu.be/kGVrWOXwUeE?si=HBnE7S7QLKBASpPT", "DEPED TV"),
                YoutubeLink("Integers", "https://www.youtube.com/watch?v=gKRCx0OCCqg", "Math is Fun")
            )
            8 -> listOf(
                YoutubeLink("Number Line", "https://youtu.be/eYZsa37-OQ8?si=1QCfnecyGPU5g1Tq", "DEPED TV"),
                YoutubeLink("Number Line", "https://www.youtube.com/watch?v=1ayVZUEoMH8", "Sheena Doria")
            )
            9 -> listOf(
                YoutubeLink("Adding and Subtracting Integers using Algebra Tiles", "https://www.youtube.com/watch?v=WJnGgwVzhBQ", "DEPED TV"),
                YoutubeLink("Adding and Subtracting Integers", "https://www.youtube.com/watch?v=Js9sVSFpyFE", "Mathispower4u")
            )
            10 -> listOf(
                YoutubeLink("Basic Operations on Integers", "https://www.youtube.com/watch?v=qMXSYgTp3LY", "DEPED TV"),
                YoutubeLink("Basic Operations on Integers", "https://www.youtube.com/watch?v=O6bRgxVRoZ4", "Math with Mr. J")
            )
            11 -> listOf(
                YoutubeLink("Routine and Non-routine Problems with Integers", "https://youtu.be/NQUrX7iIf-M?si=uLXgg7BNwvMavIeE", "DEPED TV"),
                YoutubeLink("Routine and Non-routine Problems", "https://www.youtube.com/watch?v=1S3Mzr3yUW8", "Math is Fun")
            )
            else -> emptyList()
        }
    }

    private fun getQuarter3Links(lessonNumber: Int): List<YoutubeLink> {
        return when (lessonNumber) {
            1 -> listOf(
                YoutubeLink("Plane and Solid Figures", "https://www.youtube.com/watch?v=2xzwHrGONEc", "DEPED TV"),
                YoutubeLink("Plane and Solid Figures", "https://www.youtube.com/watch?v=TWu15v8eJ4A", "Teacher Lee YT")
            )
            2 -> listOf(
                YoutubeLink("Formulating Rules for Sequence", "https://www.youtube.com/watch?v=H6r1kEEqvYA", "DEPED TV"),
                YoutubeLink("Formulating Rules for Sequence", "https://www.youtube.com/watch?v=JVXiNx3ZcSo", "MATH & ENGLISH TV")
            )
            3 -> listOf(
                YoutubeLink("Expressions and Equations", "https://www.youtube.com/watch?v=QvxWrYtzrtM", "Cognito"),
                YoutubeLink("Translating Word Phrases", "https://www.youtube.com/watch?v=yCU2-3_x4C0", "KATHLEEN HERNANDEZ"),
                YoutubeLink("Variable and Constant", "https://www.youtube.com/watch?v=_CoI83FTCbo", "Theresa Reedy")
            )
            4 -> listOf(
                YoutubeLink("Algebraic Expression and Equation", "https://www.youtube.com/watch?v=9BXFmrjUflo", "Sheena Doria"),
                YoutubeLink("Four Basic Rules for Solving Equations", "https://www.youtube.com/watch?v=kWOTmyoaWJg", "The Organic Chemistry Tutor")
            )
            5 -> listOf(
                YoutubeLink("Speed, Distance and Time", "https://www.youtube.com/watch?v=3flIGBGCoN8", "DEPED TV"),
                YoutubeLink("Speed", "https://www.youtube.com/watch?v=dZ_oI7WbQTo", "Sheena Doria"),
                YoutubeLink("Distance and Time", "https://www.youtube.com/watch?v=zAo2dyOChYc", "Sheena Doria")
            )
            6 -> listOf(
                YoutubeLink("Area of Composite Figures", "https://www.youtube.com/watch?v=cmz59saqnbs", "DEPED TV"),
                YoutubeLink("Area of Composite Figures", "https://www.youtube.com/watch?v=TxTJtKa14I4", "SIR EFREN VILLAESTER")
            )
            7 -> listOf(
                YoutubeLink("Surface Area of Solid Figures", "https://www.youtube.com/watch?v=2tCZWBnmWH4", "DEPED TV"),
                YoutubeLink("Surface Area of Solid Figures", "https://www.youtube.com/watch?v=hn_g0uSQQsQ", "MATH & ENGLISH TV")
            )
            8 -> listOf(
                YoutubeLink("Problem Solving with Surface Area", "https://www.youtube.com/live/2tCZWBnmWH4?si=ZgdmSZn38plP5ciM", "DEPED TV"),
                YoutubeLink("Finding Surface Area", "https://youtu.be/_5hqEOGKFKw?si=TNUfgCQgLSk-Rtxh", "DEPED TV"),
                YoutubeLink("Problem Solving with Surface Area", "https://www.youtube.com/watch?v=YvHTeADh5Es", "Math with Ms Sun")
            )
            else -> emptyList()
        }
    }

    private fun getQuarter4Links(lessonNumber: Int): List<YoutubeLink> {
        return when (lessonNumber) {
            1 -> listOf(
                YoutubeLink("Volume of Prisms and Pyramids", "https://www.youtube.com/live/fiagxfuK-Pg?si=YjcmzA9A11rdXsq4", "DEPED TV"),
                YoutubeLink("Understanding Volume of 3D Shapes", "https://youtu.be/EYPKaPykRUs?si=u8TnZ_V93zusNxP_", "DEPED TV"),
                YoutubeLink("Volume of Prisms and Pyramids", "https://www.youtube.com/watch?v=WY95RxDM9L0", "SIR EFREN VILLAESTER")
            )
            2 -> listOf(
                YoutubeLink("Volume of Cylinders, Pyramids, Cones, and Spheres", "https://youtu.be/n9lb9GxLjuY?si=WAUHImxez7gnN9sh", "DEPED TV"),
                YoutubeLink("Finding Volume of Solid Figures", "https://youtu.be/MH2QH952b34?si=70qgf5yxW5qWkhrd", "DEPED TV"),
                YoutubeLink("Volume of Solid Figures", "https://www.youtube.com/watch?v=72iYB3XVJxM", "Math is Fun")
            )
            3 -> listOf(
                YoutubeLink("Electric and Water Meter Readings", "https://www.youtube.com/live/aRx4yjKM-yM?si=TSKksL1gMMEn2Yjk", "DEPED TV"),
                YoutubeLink("Electric Meter", "https://www.youtube.com/watch?v=hpUxdQbYMm4", "SEAMEO INNOTECH"),
                YoutubeLink("Water Meter", "https://www.youtube.com/watch?v=gfdPzlybOV4", "Mike Jhared"),
                YoutubeLink("Computing Meter Consumption", "https://www.youtube.com/watch?v=KcGwv3umjJ8", "SIR EFREN VILLAESTER")
            )
            4 -> listOf(
                YoutubeLink("Constructing Pie Graph", "https://youtu.be/zHx4rl1_zdE?si=g3KDzrv0tQ05lTDu", "DEPED TV"),
                YoutubeLink("Pie Graph Tutorial", "https://www.youtube.com/live/cHuKsLD6Ol0?si=yBUoJFTODQ9KXOjQ", "DEPED TV"),
                YoutubeLink("Constructing Pie Graph", "https://www.youtube.com/watch?v=Y42vARgDr_s", "Rodil Raymundo")
            )
            5 -> listOf(
                YoutubeLink("Problem Solving with Pie Graph", "https://www.youtube.com/live/Hgslu2tyoZY?si=fphSJkY7LASwMCkq", "DEPED TV"),
                YoutubeLink("Problem Solving with Pie Graph", "https://www.youtube.com/watch?v=bZBeAsuuMZg&t=245s", "MATH & ENGLISH TV")
            )
            6 -> listOf(
                YoutubeLink("Probability", "https://youtu.be/G5x2mEfIrb8?si=EgxRgzUnP1H7LM5-", "DEPED TV"),
                YoutubeLink("Probability", "https://www.youtube.com/watch?v=WFInqAojy6A", "Val Live")
            )
            7 -> listOf(
                YoutubeLink("Listing Outcomes and Tree Diagrams", "https://youtu.be/mgr_TsUqjg8?si=qqNodoyn2Zubftca", "DEPED TV"),
                YoutubeLink("Listing Outcomes and Tree Diagrams", "https://www.youtube.com/watch?v=tpry4CAhoIw", "Teacher Jem Rymon")
            )
            8 -> listOf(
                YoutubeLink("Simple Predictions of Events", "https://youtu.be/R2SyP9XTshE?si=3QusQk0hjiOPuN6-", "DEPED TV"),
                YoutubeLink("Making Predictions", "https://youtu.be/Ay5pnC-0bVI?si=l5mozIqZ9ru25YIj", "DEPED TV"),
                YoutubeLink("Simple Predictions of Events", "https://www.youtube.com/watch?v=wp5q-OUHf20", "Cynde The Thrifty")
            )
            9 -> listOf(
                YoutubeLink("Experimental and Theoretical Probability", "https://youtu.be/xXCBI_vquGI?si=Tk2-SuvVcoLhogM7", "DEPED TV"),
                YoutubeLink("Solving Probability Problems", "https://youtu.be/0pJB4_t3ewE?si=gg0XiJ2QD1sK-BhU", "DEPED TV"),
                        YoutubeLink("Experimental and Theoretical Probability", "https://www.youtube.com/watch?v=CkGtOAuSgGA", "KATHLEEN HERNANDEZ")
            )
            else -> emptyList()
        }
    }

    @SuppressLint("UseKtx")
    private fun loadUserData() {
        lifecycleScope.launch {
            try {
                val user = userRepository.getUserByIdentifier(userIdentifier)
                user?.let {
                    runOnUiThread {
                        val headerView = navigationView.getHeaderView(0)
                        val navHeaderUserName = headerView.findViewById<TextView>(R.id.navHeaderUserName)
                        val navHeaderAvatar = headerView.findViewById<com.google.android.material.imageview.ShapeableImageView>(R.id.navHeaderAvatar)

                        navHeaderUserName.text = it.fullName

                        navHeaderAvatar.loadAvatarUri(it.avatarUri, R.drawable.ic_profile)
                    }
                }
            } catch (e: Exception) {
                println("Error loading user: ${e.message}")
            }
        }
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.nav_home -> {
                val intent = Intent(this, QuarterSelectionActivity::class.java)
                intent.putExtra("USER_IDENTIFIER", userIdentifier)
                intent.flags = Intent.FLAG_ACTIVITY_CLEAR_TOP
                startActivity(intent)
                finish()
            }

            R.id.nav_profile -> {
                val intent = Intent(this, DashboardActivity::class.java)
                intent.putExtra("USER_IDENTIFIER", userIdentifier)
                startActivity(intent)
            }

            R.id.nav_progress -> {
                val intent = Intent(this, ProgressActivity::class.java)
                intent.putExtra("USER_IDENTIFIER", userIdentifier)
                startActivity(intent)
            }

            R.id.nav_about -> {
                NavigationHelper.showAboutDialog(this)
            }

            R.id.nav_logout -> {
                showLogoutDialog()
                return true
            }
        }
        drawerLayout.closeDrawer(GravityCompat.START)
        return true
    }

    private fun showLogoutDialog() {
        AlertDialog.Builder(this)
            .setTitle("Logout")
            .setMessage("Are you sure you want to logout?")
            .setPositiveButton("Yes") { dialog, _ ->
                logout()
                dialog.dismiss()
            }
            .setNegativeButton("No") { dialog, _ ->
                dialog.dismiss()
            }
            .show()
    }

    private fun logout() {
        val prefs = getSharedPreferences("app_prefs", MODE_PRIVATE)
        prefs.edit { clear() }

        val intent = Intent(this, SelectionActivity::class.java)
        intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
        startActivity(intent)
        finish()

        Toast.makeText(this, "Logged out successfully", Toast.LENGTH_SHORT).show()
    }

    private fun setupImmersiveMode() {
        WindowCompat.setDecorFitsSystemWindows(window, false)
        val windowInsetsController = WindowCompat.getInsetsController(window, window.decorView)
        windowInsetsController.apply {
            isAppearanceLightStatusBars = true
            isAppearanceLightNavigationBars = true
            hide(WindowInsetsCompat.Type.statusBars())
            hide(WindowInsetsCompat.Type.navigationBars())
            systemBarsBehavior = WindowInsetsControllerCompat.BEHAVIOR_SHOW_TRANSIENT_BARS_BY_SWIPE
        }
    }

    override fun onWindowFocusChanged(hasFocus: Boolean) {
        super.onWindowFocusChanged(hasFocus)
        if (hasFocus) {
            setupImmersiveMode()
        }
    }
}

// Updated data class for YouTube links with owner
data class YoutubeLink(
    val title: String,
    val url: String,
    val owner: String = "Unknown"
)