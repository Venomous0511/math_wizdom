package com.bitrealm.mathwizdomapp.data

import com.bitrealm.mathwizdomapp.models.*

object ActivityDataProvider {

    fun getActivitiesForLesson(quarter: Int, lessonNumber: Int): List<Activity> {
        return when ("${quarter}_$lessonNumber") {
            // ----------- QUARTER 1 -----------
            "1_1" -> getQuarter1Lesson1Activities()
            "1_2" -> getQuarter1Lesson2Activities()
            "1_3" -> getQuarter1Lesson3Activities()
            "1_4" -> getQuarter1Lesson4Activities()
            "1_5" -> getQuarter1Lesson5Activities()
            "1_6" -> getQuarter1Lesson6Activities()
            "1_7" -> getQuarter1Lesson7Activities()
            "1_8" -> getQuarter1Lesson8Activities()
            "1_9" -> getQuarter1Lesson9Activities()
            "1_10" -> getQuarter1Lesson10Activities()
            "1_11" -> getQuarter1Lesson11Activities()
            "1_12" -> getQuarter1Lesson12Activities()
            "1_13" -> getQuarter1Lesson13Activities()
            "1_14" -> getQuarter1Lesson14Activities()
            "1_15" -> getQuarter1Lesson15Activities()
            "1_16" -> getQuarter1Lesson16Activities()
            "1_17" -> getQuarter1Lesson17Activities()

            // ----------- QUARTER 2 -----------
            "2_1" -> getQuarter2Lesson1Activities()
            "2_2" -> getQuarter2Lesson2Activities()
            "2_3" -> getQuarter2Lesson3Activities()
            "2_4" -> getQuarter2Lesson4Activities()
            "2_5" -> getQuarter2Lesson5Activities()
            "2_6" -> getQuarter2Lesson6Activities()
            "2_7" -> getQuarter2Lesson7Activities()
            "2_8" -> getQuarter2Lesson8Activities()
            "2_9" -> getQuarter2Lesson9Activities()
            "2_10" -> getQuarter2Lesson10Activities()
            "2_11" -> getQuarter2Lesson11Activities()

            // ----------- QUARTER 3 -----------
            "3_1" -> getQuarter3Lesson1Activities()
            "3_2" -> getQuarter3Lesson2Activities()
            "3_3" -> getQuarter3Lesson3Activities()
            "3_4" -> getQuarter3Lesson4Activities()
            "3_5" -> getQuarter3Lesson5Activities()
            "3_6" -> getQuarter3Lesson6Activities()
            else -> emptyList()
        }
    }

    // ------------------- QUARTER 1 -------------------
    private fun getQuarter1Lesson1Activities(): List<Activity> {
        return listOf(
            // Activity 1: Similar or Dissimilar
            Activity(
                id = 1,
                quarter = 1,
                lessonNumber = 1,
                activityNumber = 1,
                title = "Identifying Similar and Dissimilar Fractions",
                type = ActivityType.MULTIPLE_CHOICE,
                questions = listOf(
                    Question.MultipleChoice(
                        id = 1,
                        text = "1/2 and 1/4",
                        options = listOf("Similar", "Dissimilar"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 2,
                        text = "2/3 and 2/6",
                        options = listOf("Similar", "Dissimilar"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 3,
                        text = "5/6 and 1/3",
                        options = listOf("Similar", "Dissimilar"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 4,
                        text = "2/5 and 3/10",
                        options = listOf("Similar", "Dissimilar"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 5,
                        text = "3 2/3 and 6 1/6",
                        options = listOf("Similar", "Dissimilar"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 6,
                        text = "8/11 and 5/6",
                        options = listOf("Similar", "Dissimilar"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 7,
                        text = "6/15 and 7/8",
                        options = listOf("Similar", "Dissimilar"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 8,
                        text = "4/6 and 4/5",
                        options = listOf("Similar", "Dissimilar"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 9,
                        text = "9/10 and 2/3",
                        options = listOf("Similar", "Dissimilar"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 10,
                        text = "7/14 and 2/3",
                        options = listOf("Similar", "Dissimilar"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 11,
                        text = "3/8 and 5/12",
                        options = listOf("Similar", "Dissimilar"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 12,
                        text = "1/9 and 2/7",
                        options = listOf("Similar", "Dissimilar"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 13,
                        text = "4/11 and 3/13",
                        options = listOf("Similar", "Dissimilar"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 14,
                        text = "2 1/4 and 3 2/5",
                        options = listOf("Similar", "Dissimilar"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 15,
                        text = "5 3/7 and 2 1/9",
                        options = listOf("Similar", "Dissimilar"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 16,
                        text = "2 1/3 and 1 2/3",
                        options = listOf("Similar", "Dissimilar"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 17,
                        text = "3/5 and 2/5",
                        options = listOf("Similar", "Dissimilar"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 18,
                        text = "1 1/2 and 2 1/2",
                        options = listOf("Similar", "Dissimilar"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 19,
                        text = "3 1/4 and 2 3/4",
                        options = listOf("Similar", "Dissimilar"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 20,
                        text = "5 1/2 and 2 1/2",
                        options = listOf("Similar", "Dissimilar"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 21,
                        text = "4/7 and 3/7",
                        options = listOf("Similar", "Dissimilar"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 22,
                        text = "1/8 and 3/8",
                        options = listOf("Similar", "Dissimilar"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 23,
                        text = "4 1/3 and 3 2/3",
                        options = listOf("Similar", "Dissimilar"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 24,
                        text = "4/8 and 1/8",
                        options = listOf("Similar", "Dissimilar"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 25,
                        text = "2 2/5 and 1 3/5",
                        options = listOf("Similar", "Dissimilar"),
                        correctAnswer = 0
                    ),
                )
            ),

            // Activity 2: Matching Type
            Activity(
                id = 2,
                quarter = 1,
                lessonNumber = 1,
                activityNumber = 2,
                title = "Matching Type",
                type = ActivityType.DRAG_DROP,
                questions = listOf(
                    Question.DragDrop(
                        id = 1,
                        text = "Solve the fractions in Column A. Then, choose the correct answer from Column B and drag it into the corresponding box in Column A.",
                        columnA = listOf(
                            "1/10 + 9/10 =",
                            "2/5 + 1/5 =",
                            "3/8 + 2/8 =",
                            "1/4 + 2/4 =",
                            "2/7 + 3/7 =",
                            "4/9 + 2/9 =",
                            "1/6 + 4/6 =",
                            "3/10 + 5/10 =",
                            "2/12 + 7/12 =",
                            "5/8 - 1/8 =",
                            "7/10 - 3/10 =",
                            "8/9 - 2/9 =",
                            "5/6 - 1/6 =",
                            "9/12 - 4/12 =",
                            "6/7 - 2/7 =",
                            "2 1/4 + 1 2/4 =",
                            "3 2/5 + 2 1/5 =",
                            "4 1/3 + 2 2/3 =",
                            "5 2/6 + 1 3/6 =",
                            "3 3/8 + 2 4/8 =",
                            "4 4/5 - 2 1/5 =",
                            "6 5/7 - 3 2/7 =",
                            "5 7/9 - 2 3/9 =",
                            "7 5/10 - 4 2/10 =",
                            "8 6/12 - 3 4/12 ="
                        ),
                        columnB = listOf(
                            "1",          // Answer for #1: 1/10 + 9/10
                            "3/5",        // Answer for #2: 2/5 + 1/5
                            "5/8",        // Answer for #3: 3/8 + 2/8
                            "3/4",        // Answer for #4: 1/4 + 2/4
                            "5/7",        // Answer for #5: 2/7 + 3/7
                            "2/3",        // Answer for #6: 4/9 + 2/9
                            "5/6",        // Answer for #7: 1/6 + 4/6
                            "4/5",        // Answer for #8: 3/10 + 5/10
                            "3/4",        // Answer for #9: 2/12 + 7/12
                            "1/2",        // Answer for #10: 5/8 - 1/8
                            "2/5",        // Answer for #11: 7/10 - 3/10
                            "2/3",        // Answer for #12: 8/9 - 2/9
                            "2/3",        // Answer for #13: 5/6 - 1/6
                            "5/12",       // Answer for #14: 9/12 - 4/12
                            "4/7",        // Answer for #15: 6/7 - 2/7
                            "3 3/4",      // Answer for #16: 2 1/4 + 1 2/4
                            "5 3/5",      // Answer for #17: 3 2/5 + 2 1/5
                            "7",          // Answer for #18: 4 1/3 + 2 2/3
                            "6 5/6",      // Answer for #19: 5 2/6 + 1 3/6
                            "5 7/8",      // Answer for #20: 3 3/8 + 2 4/8
                            "2 3/5",      // Answer for #21: 4 4/5 - 2 1/5
                            "3 3/7",      // Answer for #22: 6 5/7 - 3 2/7
                            "3 4/9",      // Answer for #23: 5 7/9 - 2 3/9
                            "3 3/10",     // Answer for #24: 7 5/10 - 4 2/10
                            "5 2/12"      // Answer for #25: 8 6/12 - 3 4/12
                        ),
                        correctMatches = mapOf(
                            0 to 0,   // 1/10 + 9/10 = 1
                            1 to 1,   // 2/5 + 1/5 = 3/5
                            2 to 2,   // 3/8 + 2/8 = 5/8
                            3 to 3,   // 1/4 + 2/4 = 3/4
                            4 to 4,   // 2/7 + 3/7 = 5/7
                            5 to 5,   // 4/9 + 2/9 = 2/3
                            6 to 6,   // 1/6 + 4/6 = 5/6
                            7 to 7,   // 3/10 + 5/10 = 4/5
                            8 to 8,   // 2/12 + 7/12 = 3/4
                            9 to 9,   // 5/8 - 1/8 = 1/2
                            10 to 10, // 7/10 - 3/10 = 2/5
                            11 to 11, // 8/9 - 2/9 = 2/3
                            12 to 12, // 5/6 - 1/6 = 2/3
                            13 to 13, // 9/12 - 4/12 = 5/12
                            14 to 14, // 6/7 - 2/7 = 4/7
                            15 to 15, // 2 1/4 + 1 2/4 = 3 3/4
                            16 to 16, // 3 2/5 + 2 1/5 = 5 3/5
                            17 to 17, // 4 1/3 + 2 2/3 = 7
                            18 to 18, // 5 2/6 + 1 3/6 = 6 5/6
                            19 to 19, // 3 3/8 + 2 4/8 = 5 7/8
                            20 to 20, // 4 4/5 - 2 1/5 = 2 3/5
                            21 to 21, // 6 5/7 - 3 2/7 = 3 3/7
                            22 to 22, // 5 7/9 - 2 3/9 = 3 4/9
                            23 to 23, // 7 5/10 - 4 2/10 = 3 3/10
                            24 to 24  // 8 6/12 - 3 4/12 = 5 2/12
                        )
                    )
                )
            ),
        )
    }

    private fun getQuarter1Lesson2Activities(): List<Activity> {
        return listOf(
            // Activity 1: Routine and Non-Routine Problems - Addition (Video-based)
            Activity(
                id = 1,
                quarter = 1,
                lessonNumber = 2,
                activityNumber = 1,
                title = "Solve Routine and Non-Routine Problems Involving Addition of Fractions",
                type = ActivityType.ROUTINE_PROBLEM,
                questions = listOf(
                    Question.RoutineProblem(
                        id = 1,
                        text = "",
                        videoFileName = "activity_1-n1.mp4",
                        description = "Routine Problem - Addition of Fractions"
                    ),
                    Question.RoutineProblem(
                        id = 2,
                        text = "",
                        videoFileName = "activity_1-n2.mp4",
                        description = "Non-Routine Problem - Addition of Fractions"
                    ),
                    Question.RoutineProblem(
                        id = 3,
                        text = "",
                        videoFileName = "activity_1-n3.mp4",
                        description = "Routine Problem - Mixed Fractions"
                    ),
                    Question.RoutineProblem(
                        id = 4,
                        text = "",
                        videoFileName = "activity_1-n4.mp4",
                        description = "Non-Routine Problem - Word Problem"
                    ),
                    Question.RoutineProblem(
                        id = 5,
                        text = "",
                        videoFileName = "activity_1-n5.mp4",
                        description = "Routine Problem - Simple Fractions"
                    ),
                    Question.RoutineProblem(
                        id = 6,
                        text = "",
                        videoFileName = "activity_1-n6.mp4",
                        description = "Non-Routine Problem - Multi-step"
                    ),
                    Question.RoutineProblem(
                        id = 7,
                        text = "",
                        videoFileName = "activity_1-n7.mp4",
                        description = "Routine Problem - Real-world Application"
                    )
                )
            ),

            // Activity 2: Non-Routine Problems - Subtraction (Video-based)
            Activity(
                id = 2,
                quarter = 1,
                lessonNumber = 2,
                activityNumber = 2,
                title = "Solve Non-Routine Problems Involving Subtraction of Fractions",
                type = ActivityType.ROUTINE_PROBLEM,
                questions = listOf(
                    Question.RoutineProblem(
                        id = 1,
                        text = "",
                        videoFileName = "activity_2-n1.mp4",
                        description = "Non-Routine Problem - Subtraction of Fractions"
                    ),
                    Question.RoutineProblem(
                        id = 2,
                        text = "",
                        videoFileName = "activity_2-n2.mp4",
                        description = "Non-Routine Problem - Mixed Fractions Subtraction"
                    ),
                    Question.RoutineProblem(
                        id = 3,
                        text = "",
                        videoFileName = "activity_2-n3.mp4",
                        description = "Non-Routine Problem - Word Problem with Subtraction"
                    ),
                    Question.RoutineProblem(
                        id = 4,
                        text = "",
                        videoFileName = "activity_2-n4.mp4",
                        description = "Non-Routine Problem - Multi-step Subtraction"
                    ),
                    Question.RoutineProblem(
                        id = 5,
                        text = "",
                        videoFileName = "activity_2-n5.mp4",
                        description = "Non-Routine Problem - Real-world Subtraction"
                    ),
                    Question.RoutineProblem(
                        id = 6,
                        text = "",
                        videoFileName = "activity_2-n6.mp4",
                        description = "Non-Routine Problem - Complex Subtraction"
                    ),
                    Question.RoutineProblem(
                        id = 7,
                        text = "",
                        videoFileName = "activity_2-n7.mp4",
                        description = "Non-Routine Problem - Application Problem"
                    )
                )
            ),
        )
    }

    private fun getQuarter1Lesson3Activities(): List<Activity> {
        return listOf(
            // Activity 1: Multiply Simple and Mixed Fractions
            Activity(
                id = 1,
                quarter = 1,
                lessonNumber = 3,
                activityNumber = 1,
                title = "Multiply Simple and Mixed Fractions",
                type = ActivityType.MULTIPLE_CHOICE,
                questions = listOf(
                    Question.MultipleChoice(
                        id = 1,
                        text = "2/3 × 3/4 = 3/4",
                        options = listOf("True", "False"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 2,
                        text = "5/6 × 4/5 = 1/3",
                        options = listOf("True", "False"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 3,
                        text = "7/8 × 3/4 = 2/3",
                        options = listOf("True", "False"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 4,
                        text = "3/5 × 2/3 = 5/10",
                        options = listOf("True", "False"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 5,
                        text = "9/10 × 4/5 = 45/50",
                        options = listOf("True", "False"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 6,
                        text = "2/3 × 4/5 = 8/15",
                        options = listOf("True", "False"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 7,
                        text = "5/6 × 3/4 = 5/8",
                        options = listOf("True", "False"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 8,
                        text = "7/8 × 2/3 = 7/12",
                        options = listOf("True", "False"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 9,
                        text = "3/5 × 2/7 = 6/35",
                        options = listOf("True", "False"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 10,
                        text = "1/4 × 5/6 = 5/24",
                        options = listOf("True", "False"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 11,
                        text = "1/8 × 2/8 = 2/16",
                        options = listOf("True", "False"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 12,
                        text = "2/3 × 1/3 = 3/6",
                        options = listOf("True", "False"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 13,
                        text = "5/6 × 4/6 = 20/6",
                        options = listOf("True", "False"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 14,
                        text = "7/10 × 3/10 = 4/10",
                        options = listOf("True", "False"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 15,
                        text = "3/5 × 1/5 = 12/5",
                        options = listOf("True", "False"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 16,
                        text = "4/5 × 3 1/3 = 12/3",
                        options = listOf("True", "False"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 17,
                        text = "2 2/5 × 3/7 = 4/5",
                        options = listOf("True", "False"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 18,
                        text = "5/6 × 4 1/2 = 3 3/5",
                        options = listOf("True", "False"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 19,
                        text = "3 3/4 × 7/10 = 25/8",
                        options = listOf("True", "False"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 20,
                        text = "2 3/5 × 4/9 = 17/45",
                        options = listOf("True", "False"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 21,
                        text = "1 4/9 × 2 2/3 = 323/27",
                        options = listOf("True", "False"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 22,
                        text = "3 2/5 × 1 3/4 = 51/20",
                        options = listOf("True", "False"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 23,
                        text = "2 3/4 × 8/15 = 22 11/20",
                        options = listOf("True", "False"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 24,
                        text = "4 9/10 × 2 5/6 = 135/60",
                        options = listOf("True", "False"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 25,
                        text = "11 3/4 × 1 7/8 = 221/32",
                        options = listOf("True", "False"),
                        correctAnswer = 0
                    )
                )
            ),

            // Activity 2: Multiply Simple and Mixed Fractions 4 choices
            Activity(
                id = 2,
                quarter = 1,
                lessonNumber = 3,
                activityNumber = 2,
                title = "Multiply Simple and Mixed Fractions",
                type = ActivityType.MULTIPLE_CHOICE,
                questions = listOf(
                    Question.MultipleChoice(
                        id = 1,
                        text = "4/6 × 1/6 =",
                        options = listOf("4/36", "1/3", "1/9", "4/20"),
                        correctAnswer = 2
                    ),
                    Question.MultipleChoice(
                        id = 2,
                        text = "11/12 × 11/12 =",
                        options = listOf("121/144", "121/4", "6", "12"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 3,
                        text = "1/2 × 1/2 =",
                        options = listOf("1/4", "1/2", "1/3", "1/5"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 4,
                        text = "3/4 × 2/4 =",
                        options = listOf("2/3", "6/5", "3 3/4", "3/8"),
                        correctAnswer = 3
                    ),
                    Question.MultipleChoice(
                        id = 5,
                        text = "1/20 × 1/10 =",
                        options = listOf("1", "1 1/2", "1/4", "1/200"),
                        correctAnswer = 3
                    ),
                    Question.MultipleChoice(
                        id = 6,
                        text = "5/6 × 5/30 =",
                        options = listOf("5/36", "5/30", "6/36", "6/30"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 7,
                        text = "6/9 × 6/27 =",
                        options = listOf("4", "4/20", "4/27", "1/27"),
                        correctAnswer = 2
                    ),
                    Question.MultipleChoice(
                        id = 8,
                        text = "3/8 × 3/8 =",
                        options = listOf("3/8", "1/3", "1/8", "9/64"),
                        correctAnswer = 3
                    ),
                    Question.MultipleChoice(
                        id = 9,
                        text = "2/9 × 6/18 =",
                        options = listOf("12/162", "6/32", "2/27", "1/20"),
                        correctAnswer = 2
                    ),
                    Question.MultipleChoice(
                        id = 10,
                        text = "3/6 × 9/30 =",
                        options = listOf("3/20", "1/15", "27/180", "11/80"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 11,
                        text = "3/4 × 3/4 =",
                        options = listOf("9/16", "3/5", "3", "5"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 12,
                        text = "1/5 × 2/5 =",
                        options = listOf("9/16", "2/25", "1/9", "6/2"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 13,
                        text = "1/11 × 1/11 =",
                        options = listOf("11/20", "1/30", "1", "1/121"),
                        correctAnswer = 3
                    ),
                    Question.MultipleChoice(
                        id = 14,
                        text = "2/7 × 3/14 =",
                        options = listOf("2/48", "22/49", "3/49", "1/49"),
                        correctAnswer = 2
                    ),
                    Question.MultipleChoice(
                        id = 15,
                        text = "2 1/5 × 1/3 =",
                        options = listOf("2/49", "2/45", "2/4", "1/2"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 16,
                        text = "6 1/2 × 1/2 =",
                        options = listOf("4/3", "3 1/4", "1/4", "3"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 17,
                        text = "2 5/6 × 1/3 =",
                        options = listOf("7/8", "6/8", "17/18", "16/18"),
                        correctAnswer = 2
                    ),
                    Question.MultipleChoice(
                        id = 18,
                        text = "9 6/7 × 1/5 =",
                        options = listOf("4 3/4", "3/3", "34/35", "134/35"),
                        correctAnswer = 3
                    ),
                    Question.MultipleChoice(
                        id = 19,
                        text = "1/2 × 7 3/4 =",
                        options = listOf("7/8", "3 7/8", "3/6", "7/36"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 20,
                        text = "8 2/3 × 2/3 =",
                        options = listOf("7/9", "5 7/9", "5 1/9", "1/7"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 21,
                        text = "5 1/2 × 5 1/2 =",
                        options = listOf("30 1/40", "30", "1/4", "4/30"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 22,
                        text = "3 8/9 × 1 3/4 =",
                        options = listOf("20/36", "29/36", "29/30", "6 29/36"),
                        correctAnswer = 3
                    ),
                    Question.MultipleChoice(
                        id = 23,
                        text = "5 1/2 × 1 1/2 =",
                        options = listOf("8 4/6", "8 1/4", "8 1/3", "8 1/2"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 24,
                        text = "16/9 × 4 2/5 =",
                        options = listOf("7", "1/3", "7 1/3", "7 1/2"),
                        correctAnswer = 2
                    ),
                    Question.MultipleChoice(
                        id = 25,
                        text = "19/10 × 2 7/8 =",
                        options = listOf("53 7/80", "3 7/80", "5 1/8", "3/8"),
                        correctAnswer = 0
                    )
                )
            ),
        )
    }
    private fun getQuarter1Lesson4Activities(): List<Activity> {
        return listOf(
            // Activity 1: Labelling
            Activity(
                id = 1,
                quarter = 1,
                lessonNumber = 4,
                activityNumber = 1,
                title = "Mathematical Expression",
                type = ActivityType.DRAG_DROP,
                questions = listOf(
                    Question.DragDrop(
                        id = 1,
                        text = "Examine the given mathematical phrases and determine their correct expressions. Drag the correct expression to match its corresponding mathematical phrase.",
                        columnA = listOf(
                            "Five times eight",
                            "The product of seven and six",
                            "Nine multiplied by four",
                            "Twice fifteen",
                            "Triple twelve",
                            "Fourfold twenty-five",
                            "Seven times eleven",
                            "The product of twenty and five",
                            "Eight multiplied by thirteen",
                            "Double thirty-two",
                            "Six times fourteen",
                            "The product of nine and twenty",
                            "Triple twenty-four",
                            "Double fifty",
                            "Fivefold sixteen",
                            "The product of thirty and three",
                            "Seven multiplied by nineteen",
                            "Quadruple twenty-two",
                            "Ten times twelve",
                            "Double seventy-five",
                            "Triple eighteen",
                            "Double forty-five",
                            "Six times seventeen",
                            "The product of eight and twenty-one",
                            "Quadruple thirty-six"
                        ),
                        columnB = listOf(
                            "5 × 8",
                            "7 × 6",
                            "9 × 4",
                            "2 × 15",
                            "3 × 12",
                            "4 × 25",
                            "7 × 11",
                            "20 × 5",
                            "8 × 13",
                            "2 × 32",
                            "6 × 14",
                            "9 × 20",
                            "3 × 24",
                            "2 × 50",
                            "5 × 16",
                            "30 × 3",
                            "7 × 19",
                            "4 × 22",
                            "10 × 12",
                            "2 × 75",
                            "3 × 18",
                            "2 × 45",
                            "6 × 17",
                            "8 × 21",
                            "4 × 36"
                        ),
                        correctMatches = mapOf(
                            0 to 0,   // Five times eight = 5 × 8
                            1 to 1,   // The product of seven and six = 7 × 6
                            2 to 2,   // Nine multiplied by four = 9 × 4
                            3 to 3,   // Twice fifteen = 2 × 15
                            4 to 4,   // Triple twelve = 3 × 12
                            5 to 5,   // Fourfold twenty-five = 4 × 25
                            6 to 6,   // Seven times eleven = 7 × 11
                            7 to 7,   // The product of twenty and five = 20 × 5
                            8 to 8,   // Eight multiplied by thirteen = 8 × 13
                            9 to 9,   // Double thirty-two = 2 × 32
                            10 to 10, // Six times fourteen = 6 × 14
                            11 to 11, // The product of nine and twenty = 9 × 20
                            12 to 12, // Triple twenty-four = 3 × 24
                            13 to 13, // Double fifty = 2 × 50
                            14 to 14, // Fivefold sixteen = 5 × 16
                            15 to 15, // The product of thirty and three = 30 × 3
                            16 to 16, // Seven multiplied by nineteen = 7 × 19
                            17 to 17, // Quadruple twenty-two = 4 × 22
                            18 to 18, // Ten times twelve = 10 × 12
                            19 to 19, // Double seventy-five = 2 × 75
                            20 to 20, // Triple eighteen = 3 × 18
                            21 to 21, // Double forty-five = 2 × 45
                            22 to 22, // Six times seventeen = 6 × 17
                            23 to 23, // The product of eight and twenty-one = 8 × 21
                            24 to 24  // Quadruple thirty-six = 4 × 36
                        )
                    )
                )
            ),

            // Activity 2: Routine and Non-Routine Problems - Multiplication (Video-based)
            Activity(
                id = 2,
                quarter = 1,
                lessonNumber = 4,
                activityNumber = 2,
                title = "Solve Routine or Non-routine Problems Involving Multiplication, Without or With Subtraction of Fractions and Mixed Fractions",
                type = ActivityType.ROUTINE_PROBLEM,
                questions = listOf(
                    Question.RoutineProblem(
                        id = 1,
                        text = "",
                        videoFileName = "activity_2-n1.mp4",
                        description = "Routine or Non-routine Problem - Multiplication Without or With Subtraction of Fractions and Mixed Fractions"
                    ),
                    Question.RoutineProblem(
                        id = 2,
                        text = "",
                        videoFileName = "activity_2-n2.mp4",
                        description = "Routine or Non-routine Problem - Multiplication Without or With Subtraction of Fractions and Mixed Fractions"
                    ),
                    Question.RoutineProblem(
                        id = 3,
                        text = "",
                        videoFileName = "activity_2-n3.mp4",
                        description = "Routine or Non-routine Problem - Multiplication Without or With Subtraction of Fractions and Mixed Fractions"
                    ),
                    Question.RoutineProblem(
                        id = 4,
                        text = "",
                        videoFileName = "activity_2-n4.mp4",
                        description = "Routine or Non-routine Problem - Multiplication Without or With Subtraction of Fractions and Mixed Fractions"
                    ),
                    Question.RoutineProblem(
                        id = 5,
                        text = "",
                        videoFileName = "activity_2-n5.mp4",
                        description = "Routine or Non-routine Problem - Multiplication Without or With Subtraction of Fractions and Mixed Fractions"
                    ),
                    Question.RoutineProblem(
                        id = 6,
                        text = "",
                        videoFileName = "activity_2-n6.mp4",
                        description = "Routine or Non-routine Problem - Multiplication Without or With Subtraction of Fractions and Mixed Fractions"
                    ),
                    Question.RoutineProblem(
                        id = 7,
                        text = "",
                        videoFileName = "activity_2-n7.mp4",
                        description = "Routine or Non-routine Problem - Multiplication Without or With Subtraction of Fractions and Mixed Fractions"
                    )
                )
            ),
        )
    }

    private fun getQuarter1Lesson5Activities(): List<Activity> {
        return listOf(
            // Activity 1: Matching Type
            Activity(
                id = 1,
                quarter = 1,
                lessonNumber = 5,
                activityNumber = 1,
                title = "Divide Simple and Mixed Fractions",
                type = ActivityType.WIRE_MATCHING,
                questions = listOf(
                    Question.WireMatching(
                        id = 1,
                        text = "Solve the given fractions in Column A. Then, draw a line to match it with the correct answer in Column B.",
                        columnA = listOf(
                            "3/4 ÷ 1/2 =",
                            "7/8 ÷ 1/4 =",
                            "5/8 ÷ 2/3 =",
                            "7/9 ÷ 5/6 =",
                            "2/3 ÷ 4/7 =",
                            "5/8 ÷ 3/4 =",
                            "3/5 ÷ 2/7 =",
                            "7/8 ÷ 3/4 =",
                            "4/5 ÷ 3/8 =",
                            "7/10 ÷ 5/6 =",
                            "1/2 ÷ 2 =",
                            "6/7 ÷ 2 =",
                            "9/10 ÷ 4 =",
                            "6/7 ÷ 7 =",
                            "6 ÷ 3/7 =",
                            "2 1/3 ÷ 2/3 =",
                            "5/6 ÷ 1 1/2 =",
                            "2 1/2 ÷ 5/6 =",
                            "5 2/3 ÷ 4/5 =",
                            "2 10/11 ÷ 6/11 =",
                            "1 1/4 ÷ 2 1/2 =",
                            "19/11 ÷ 19/11 =",
                            "9 1/2 ÷ 2 1/2 =",
                            "5 2/5 ÷ 3 1/3 =",
                            "7 1/2 ÷ 4 1/3 ="
                        ),
                        columnB = listOf(
                            "1 1/2", "3 1/2", "15/16", "14/15", "1 1/6",
                            "5/6", "21/10", "1 1/6", "22/15", "21/25",
                            "1/4", "3/7", "9/40", "6/49", "14",
                            "3 1/2", "5/9", "3", "7 1/12", "5 1/3",
                            "1/2", "1", "3 4/5", "13/150", "1 19/26"
                        ),
                        correctMatches = mapOf(
                            0 to 0, 1 to 1, 2 to 2, 3 to 3, 4 to 4,
                            5 to 5, 6 to 6, 7 to 7, 8 to 8, 9 to 9,
                            10 to 10, 11 to 11, 12 to 12, 13 to 13, 14 to 14,
                            15 to 15, 16 to 16, 17 to 17, 18 to 18, 19 to 19,
                            20 to 20, 21 to 21, 22 to 22, 23 to 23, 24 to 24
                        )
                    )
                )
            ),

            // Activity 2: Division
            Activity(
                id = 2,
                quarter = 1,
                lessonNumber = 5,
                activityNumber = 2,
                title = "Divides Simple and Mixed Fractions",
                type = ActivityType.DRAG_DROP,
                questions = listOf(
                    Question.DragDrop(
                        id = 1,
                        text = "Solve the given fractions and drag the correct answer to the box.",
                        columnA = listOf(
                            "8/9 ÷ 1/2 =",
                            "1/8 ÷ 1/4 =",
                            "5/7 ÷ 1/3 =",
                            "1/10 ÷ 1/6 =",
                            "4/5 ÷ 4/6 =",
                            "2/9 ÷ 1/2 =",
                            "1/4 ÷ 1/3 =",
                            "3/6 ÷ 2/4 =",
                            "3/5 ÷ 2/3 =",
                            "1/4 ÷ 5/8 =",
                            "3 1/2 ÷ 6/7 =",
                            "1/2 ÷ 3 3/4 =",
                            "5 1/2 ÷ 10/11 =",
                            "6/8 ÷ 4 1/3 =",
                            "1 2/3 ÷ 6/7 =",
                            "4 ÷ 2/3 =",
                            "9 ÷ 1/10 =",
                            "10 ÷ 1/2 =",
                            "8/9 ÷ 3 =",
                            "7 ÷ 3/4 =",
                            "8 1/4 ÷ 19/11 =",
                            "4 1/4 ÷ 6 4/5 =",
                            "3 4/5 ÷ 2 3/4 =",
                            "5 6/7 ÷ 1 2/3 =",
                            "9 1/3 ÷ 2 3/4 ="
                        ),
                        columnB = listOf(
                            "1 7/9",
                            "1/2",
                            "2 1/7",
                            "3/5",
                            "1 1/5",
                            "4/9",
                            "3/4",
                            "1",
                            "9/10",
                            "2/5",
                            "4 1/12",
                            "2/15",
                            "6 1/20",
                            "9/52",
                            "1 17/18",
                            "6",
                            "90",
                            "20",
                            "8/27",
                            "9 1/3",
                            "4 43/80",
                            "5/8",
                            "1 21/55",
                            "3 18/35",
                            "3 13/33"
                        ),
                        correctMatches = mapOf(
                            0 to 0,   // 8/9 ÷ 1/2 = 1 7/9
                            1 to 1,   // 1/8 ÷ 1/4 = 1/2
                            2 to 2,   // 5/7 ÷ 1/3 = 2 1/7
                            3 to 3,   // 1/10 ÷ 1/6 = 3/5
                            4 to 4,   // 4/5 ÷ 4/6 = 1 1/5
                            5 to 5,   // 2/9 ÷ 1/2 = 4/9
                            6 to 6,   // 1/4 ÷ 1/3 = 3/4
                            7 to 7,   // 3/6 ÷ 2/4 = 1
                            8 to 8,   // 3/5 ÷ 2/3 = 9/10
                            9 to 9,   // 1/4 ÷ 5/8 = 2/5
                            10 to 10, // 3 1/2 ÷ 6/7 = 4 1/12
                            11 to 11, // 1/2 ÷ 3 3/4 = 2/15
                            12 to 12, // 5 1/2 ÷ 10/11 = 6 1/20
                            13 to 13, // 6/8 ÷ 4 1/3 = 9/52
                            14 to 14, // 1 2/3 ÷ 6/7 = 1 17/18
                            15 to 15, // 4 ÷ 2/3 = 6
                            16 to 16, // 9 ÷ 1/10 = 90
                            17 to 17, // 10 ÷ 1/2 = 20
                            18 to 18, // 8/9 ÷ 3 = 8/27
                            19 to 19, // 7 ÷ 3/4 = 9 1/3
                            20 to 20, // 8 1/4 ÷ 19/11 = 4 43/80
                            21 to 21, // 4 1/4 ÷ 6 4/5 = 5/8
                            22 to 22, // 3 4/5 ÷ 2 3/4 = 1 21/55
                            23 to 23, // 5 6/7 ÷ 1 2/3 = 3 18/35
                            24 to 24  // 9 1/3 ÷ 2 3/4 = 3 13/33
                        )
                    )
                )
            ),
        )
    }

    private fun getQuarter1Lesson6Activities(): List<Activity> {
        return listOf(
            // Activity 1: Terms in Division
            Activity(
                id = 1,
                quarter = 1,
                lessonNumber = 6,
                activityNumber = 1,
                title = "Terms in Division",
                type = ActivityType.MULTIPLE_CHOICE,
                questions = listOf(
                    Question.MultipleChoice(
                        id = 1,
                        text = "A pizza was cut into 8 equal slices. If Ana ate 3/8 of it, what fraction of the pizza is left?",
                        options = listOf("True", "False"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 2,
                        text = "A recipe needs 2/3 cup of sugar. If the cook makes 4 batches, how many cups of sugar are needed in all?",
                        options = listOf("True", "False"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 3,
                        text = "The quotient of 3/4 ÷ 1/2 tells how many halves are in three-fourths. What is the answer?",
                        options = listOf("True", "False"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 4,
                        text = "Maria had 7/8 of a cake. She ate 1/4 of it. How much cake does she have left?",
                        options = listOf("True", "False"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 5,
                        text = "A ribbon 5/6 meter long was cut into 5 equal pieces. What is the length of each piece?",
                        options = listOf("True", "False"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 6,
                        text = "A farmer harvested 3/4 of a sack of rice in the morning and 2/5 of a sack in the afternoon. How much rice did he harvest in all?",
                        options = listOf("True", "False"),
                        correctAnswer =1
                    ),
                    Question.MultipleChoice(
                        id = 7,
                        text = "A farmer had 7/8 kilograms of rice. He divided it by 2 bags equally. How much rice was in each bag?",
                        options = listOf("True", "False"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 8,
                        text = "A bottle contains 2/3 liters of juice. If 3 bottles are filled, how many liters of juice are there in total?",
                        options = listOf("True", "False"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 9,
                        text = "The average of 1/2, 3/4, and 2/3 ?",
                        options = listOf("True", "False"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 10,
                        text = "Liza had 5/6 kilograms of flour. She used 1/3 kilogram for baking. How much flour is left?",
                        options = listOf("True", "False"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 11,
                        text = "A chocolate bar measuring 2/3 was split into 4 equal parts. What fraction is each part?",
                        options = listOf("True", "False"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 12,
                        text = "A car traveled 2/5 of a kilometer in the morning and 3/10 kilometer in the afternoon. What is the total distance traveled?",
                        options = listOf("True", "False"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 13,
                        text = "The quotient of 5/6 ÷ 1/3 shows how many one-thirds are in five-sixths. What is the result?",
                        options = listOf("True", "False"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 14,
                        text = "A pack of meat weighs 34 kilogram. If 6 packs are bought, how many kilograms of meat are there?",
                        options = listOf("True", "False"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 15,
                        text = "A rope 9/10 meter long was cut into 3 equal parts. How long is each part?",
                        options = listOf("True", "False"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 16,
                        text = "A class drank 1/2 gallon of milk in the morning and 2/3 gallon in the afternoon. How much milk did they drink in total?",
                        options = listOf("True", "False"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 17,
                        text = "A farmer split 2/5 of a sack of corn into 10 equal bags. What fraction of the sack is in each bag?",
                        options = listOf("True", "False"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 18,
                        text = "A tailor used 2/5 meter of cloth for one shirt. If he makes 8 shirts, how many meters of cloth will he need?",
                        options = listOf("True", "False"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 19,
                        text = "The average of 2/5 and 4/5?",
                        options = listOf("True", "False"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 20,
                        text = "Ana had 9/10 meters of ribbon. She cut 2/5 meters for decoration. How much ribbon remains?",
                        options = listOf("True", "False"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 21,
                        text = "A piece of wood 3/4 meter long was divided by 3 equal parts. How long is each part?",
                        options = listOf("True", "False"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 22,
                        text = "The quotient of 7/8 ÷ 1/4 gives the number of fourths in seven-eighths. What is the answer?",
                        options = listOf("True", "False"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 23,
                        text = "A stick 1/2 meter long was cut into 2 equal pieces. What is the length of each piece?",
                        options = listOf("True", "False"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 24,
                        text = "The average of 2/3, 5/6, and 1/2?",
                        options = listOf("True", "False"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 25,
                        text = "A chocolate bar 4/5 was split into 2 friends equally. How much does each receive?\n",
                        options = listOf("True", "False"),
                        correctAnswer = 0
                    )
                )
            ),

            // Activity 2: Routine and Non-Routine Problems - Multiplication (Video-based)
            Activity(
                id = 2,
                quarter = 1,
                lessonNumber = 6,
                activityNumber = 2,
                title = "Solve Routine or Non-routine Problems Involving Division, Without or With Subtraction of Fractions and Mixed Fractions",
                type = ActivityType.ROUTINE_PROBLEM,
                questions = listOf(
                    Question.RoutineProblem(
                        id = 1,
                        text = "",
                        videoFileName = "activity_2-n1.mp4",
                        description = "Routine or Non-routine Problem - Multiplication Without or With Subtraction of Fractions and Mixed Fractions"
                    ),
                    Question.RoutineProblem(
                        id = 2,
                        text = "",
                        videoFileName = "activity_2-n2.mp4",
                        description = "Routine or Non-routine Problem - Multiplication Without or With Subtraction of Fractions and Mixed Fractions"
                    ),
                    Question.RoutineProblem(
                        id = 3,
                        text = "",
                        videoFileName = "activity_2-n3.mp4",
                        description = "Routine or Non-routine Problem - Multiplication Without or With Subtraction of Fractions and Mixed Fractions"
                    ),
                    Question.RoutineProblem(
                        id = 4,
                        text = "",
                        videoFileName = "activity_2-n4.mp4",
                        description = "Routine or Non-routine Problem - Multiplication Without or With Subtraction of Fractions and Mixed Fractions"
                    ),
                    Question.RoutineProblem(
                        id = 5,
                        text = "",
                        videoFileName = "activity_2-n5.mp4",
                        description = "Routine or Non-routine Problem - Multiplication Without or With Subtraction of Fractions and Mixed Fractions"
                    ),
                    Question.RoutineProblem(
                        id = 6,
                        text = "",
                        videoFileName = "activity_2-n6.mp4",
                        description = "Routine or Non-routine Problem - Multiplication Without or With Subtraction of Fractions and Mixed Fractions"
                    ),
                    Question.RoutineProblem(
                        id = 7,
                        text = "",
                        videoFileName = "activity_2-n7.mp4",
                        description = "Routine or Non-routine Problem - Multiplication Without or With Subtraction of Fractions and Mixed Fractions"
                    )
                )
            ),
        )
    }

    private fun getQuarter1Lesson7Activities(): List<Activity> {
        return listOf(
            // Activity 1: Adds Decimals and Mixed Decimals Through Ten Thousandths
            Activity(
                id = 1,
                quarter = 1,
                lessonNumber = 7,
                activityNumber = 1,
                title = "Adds Decimals and Mixed Decimals Through Ten Thousandths",
                type = ActivityType.MULTIPLE_CHOICE,
                questions = listOf(
                    Question.MultipleChoice(
                        id = 1,
                        text = "12.3456 + 7.892 = 20.236",
                        options = listOf("True", "False"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 2,
                        text = "5.6789 + 3.124 = 815.00",
                        options = listOf("True", "False"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 3,
                        text = "4.5678 + 8.910 = 10.98",
                        options = listOf("True", "False"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 4,
                        text = "10.0001 + 0.999 = 10.889",
                        options = listOf("True", "False"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 5,
                        text = "9.8765 + 1.234 = 11.1123",
                        options = listOf("True", "False"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 6,
                        text = "6.5432 + 3.456 = 9.9788",
                        options = listOf("True", "False"),
                        correctAnswer =1
                    ),
                    Question.MultipleChoice(
                        id = 7,
                        text = "15.1234 + 4.876 = 18.9994",
                        options = listOf("True", "False"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 8,
                        text = "2.3456 + 7.653 = 9.9333",
                        options = listOf("True", "False"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 9,
                        text = "3.1415 + 2.718 = 3.8595",
                        options = listOf("True", "False"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 10,
                        text = "11.1111 + 8.888 = 20.9999",
                        options = listOf("True", "False"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 11,
                        text = "14.5678 + 5.4322 = 60 ",
                        options = listOf("True", "False"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 12,
                        text = "1.2345 + 8.7655 = 1",
                        options = listOf("True", "False"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 13,
                        text = "7.8912 + 3.4567 = 11.3479",
                        options = listOf("True", "False"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 14,
                        text = "20.0233 + 0.0001 = 20.0234",
                        options = listOf("True", "False"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 15,
                        text = "5.5555 + 4.4435 = 9.999",
                        options = listOf("True", "False"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 16,
                        text = "15.6789 + 4.5678 = 20.2467",
                        options = listOf("True", "False"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 17,
                        text = "20.0000 + 5.4663 =25.4663",
                        options = listOf("True", "False"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 18,
                        text = "10.0000 + 3.1415 = 13.1415",
                        options = listOf("True", "False"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 19,
                        text = "9.8765 + 1.2345 = 11.111",
                        options = listOf("True", "False"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 20,
                        text = "12.3456 + 2.3456 = 14.6912",
                        options = listOf("True", "False"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 21,
                        text = "8.9101 + 4.5678 = 13.4779",
                        options = listOf("True", "False"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 22,
                        text = "6.5432 + 2.7182 = 9.2614",
                        options = listOf("True", "False"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 23,
                        text = "7.6543 + 5.4321 = 13.0864",
                        options = listOf("True", "False"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 24,
                        text = "18.0000 + 9.9999 = 27.9999",
                        options = listOf("True", "False"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 25,
                        text = "4.5678 + 1.2345 = 5.8023",
                        options = listOf("True", "False"),
                        correctAnswer = 0
                    )
                )
            ),

            // Activity 2: Subtract Decimals and Mixed Decimals Through Ten Thousandths
            Activity(
                id = 2,
                quarter = 1,
                lessonNumber = 7,
                activityNumber = 2,
                title = "Subtract Decimals and Mixed Decimals Through Ten Thousandths",
                type = ActivityType.DRAG_DROP,
                questions = listOf(
                    Question.DragDrop(
                        id = 1,
                        text = "Solve the given decimals in Column A. Then, select the correct answer from Column B and drag it to the corresponding box in Column A.",
                        columnA = listOf(
                            "13.2468 - 6.752 =",
                            "6.9415 - 6.855 =",
                            "9.9999 - 0.001 =",
                            "2.9222 - 2.778 =",
                            "11.1111 - 3.333 =",
                            "7.5678 - 6.322 =",
                            "10.0010 - 4.990 =",
                            "3.3333 - 1.667 =",
                            "8.8888 - 1.112 =",
                            "7.1234 - 2.876 =",
                            "5.6789 - 3.3211 =",
                            "6.5432 - 4.4568 =",
                            "11.0001 - 8.9999 =",
                            "9.1415  - 3.8585 =",
                            "12.3456 - 7.6544 =",
                            "10.0000 - 2.3456 =",
                            "18.8888 - 8.8888 =",
                            "7.6543 - 4.3210 =",
                            "16.0000 - 5.6789 =",
                            "3.4567 - 1.2345 =",
                            "25.0000 - 10.1234 =",
                            "9.8765 - 3.4567 =",
                            "12.3456 - 3.3456 =",
                            "5.3486 - 2.1116 =",
                            "15.5555 - 8.5555 ="
                        ),
                        columnB = listOf(
                            "6.4948",          // Answer for #1
                            "0.0865",        // Answer for #2
                            "9.9989",        // Answer for #3
                            "0.1442",        // Answer for #4
                            "7.7781",        // Answer for #5
                            "1.2458",        // Answer for #6
                            "5.011",        // Answer for #7
                            "1.6663",        // Answer for #8
                            "7.7768",        // Answer for #9
                            "4.2474",        // Answer for #10
                            "2.3578",        // Answer for #11
                            "2.0864",        // Answer for #12
                            "2.0002",        // Answer for #13
                            "5.283",       // Answer for #14
                            "4.6912",        // Answer for #15
                            "7.6544",      // Answer for #16
                            "10",      // Answer for #17
                            "3.3333",          // Answer for #18
                            "10.3211",      // Answer for #19
                            "2.2222",      // Answer for #20
                            "14.8766",      // Answer for #21
                            "6.4198",      // Answer for #22
                            "9",      // Answer for #23
                            "3.237",     // Answer for #24
                            "7"      // Answer for #25
                        ),
                        correctMatches = mapOf(
                            0 to 0,   // 1/10 + 9/10 = 1
                            1 to 1,   // 2/5 + 1/5 = 3/5
                            2 to 2,   // 3/8 + 2/8 = 5/8
                            3 to 3,   // 1/4 + 2/4 = 3/4
                            4 to 4,   // 2/7 + 3/7 = 5/7
                            5 to 5,   // 4/9 + 2/9 = 2/3
                            6 to 6,   // 1/6 + 4/6 = 5/6
                            7 to 7,   // 3/10 + 5/10 = 4/5
                            8 to 8,   // 2/12 + 7/12 = 3/4
                            9 to 9,   // 5/8 - 1/8 = 1/2
                            10 to 10, // 7/10 - 3/10 = 2/5
                            11 to 11, // 8/9 - 2/9 = 2/3
                            12 to 12, // 5/6 - 1/6 = 2/3
                            13 to 13, // 9/12 - 4/12 = 5/12
                            14 to 14, // 6/7 - 2/7 = 4/7
                            15 to 15, // 2 1/4 + 1 2/4 = 3 3/4
                            16 to 16, // 3 2/5 + 2 1/5 = 5 3/5
                            17 to 17, // 4 1/3 + 2 2/3 = 7
                            18 to 18, // 5 2/6 + 1 3/6 = 6 5/6
                            19 to 19, // 3 3/8 + 2 4/8 = 5 7/8
                            20 to 20, // 4 4/5 - 2 1/5 = 2 3/5
                            21 to 21, // 6 5/7 - 3 2/7 = 3 3/7
                            22 to 22, // 5 7/9 - 2 3/9 = 3 4/9
                            23 to 23, // 7 5/10 - 4 2/10 = 3 3/10
                            24 to 24  // 8 6/12 - 3 4/12 = 5 2/12
                        )
                    )
                )
            ),
        )
    }

    private fun getQuarter1Lesson8Activities(): List<Activity> {
        return listOf(
            // Activity 1: Routine and Non-Routine Problems - Addition Decimals (Video-based)
            Activity(
                id = 1,
                quarter = 1,
                lessonNumber = 8,
                activityNumber = 1,
                title = "Solve Routine or Non-routine Problems Involving Addition of Decimals and Mixed Decimals",
                type = ActivityType.ROUTINE_PROBLEM,
                questions = listOf(
                    Question.RoutineProblem(
                        id = 1,
                        text = "",
                        videoFileName = "activity_1-n1.mp4",
                        description = "Solve Routine or Non-routine Problems Involving Addition of Decimals and Mixed Decimals"
                    ),
                    Question.RoutineProblem(
                        id = 2,
                        text = "",
                        videoFileName = "activity_1-n2.mp4",
                        description = "Solve Routine or Non-routine Problems Involving Addition of Decimals and Mixed Decimals"
                    ),
                    Question.RoutineProblem(
                        id = 3,
                        text = "",
                        videoFileName = "activity_1-n3.mp4",
                        description = "Solve Routine or Non-routine Problems Involving Addition of Decimals and Mixed Decimals"
                    ),
                    Question.RoutineProblem(
                        id = 4,
                        text = "",
                        videoFileName = "activity_1-n4.mp4",
                        description = "Solve Routine or Non-routine Problems Involving Addition of Decimals and Mixed Decimals"
                    ),
                    Question.RoutineProblem(
                        id = 5,
                        text = "",
                        videoFileName = "activity_1-n5.mp4",
                        description = "Solve Routine or Non-routine Problems Involving Addition of Decimals and Mixed Decimals"
                    ),
                    Question.RoutineProblem(
                        id = 6,
                        text = "",
                        videoFileName = "activity_1-n6.mp4",
                        description = "Solve Routine or Non-routine Problems Involving Addition of Decimals and Mixed Decimals"
                    ),
                    Question.RoutineProblem(
                        id = 7,
                        text = "",
                        videoFileName = "activity_1-n7.mp4",
                        description = "Solve Routine or Non-routine Problems Involving Addition of Decimals and Mixed Decimals"
                    )
                )
            ),


            // Activity 2: Routine and Non-Routine Problems - Subtraction Decimals (Video-based)
            Activity(
                id = 2,
                quarter = 1,
                lessonNumber = 8,
                activityNumber = 2,
                title = "Solve Routine or Non-routine Problems Involving Subtraction of Decimals",
                type = ActivityType.ROUTINE_PROBLEM,
                questions = listOf(
                    Question.RoutineProblem(
                        id = 1,
                        text = "",
                        videoFileName = "activity_2-n1.mp4",
                        description = "Solve Routine or Non-routine Problems Involving Subtraction of Decimals"
                    ),
                    Question.RoutineProblem(
                        id = 2,
                        text = "",
                        videoFileName = "activity_2-n2.mp4",
                        description = "Solve Routine or Non-routine Problems Involving Subtraction of Decimals"
                    ),
                    Question.RoutineProblem(
                        id = 3,
                        text = "",
                        videoFileName = "activity_2-n3.mp4",
                        description = "Solve Routine or Non-routine Problems Involving Subtraction of Decimals"
                    ),
                    Question.RoutineProblem(
                        id = 4,
                        text = "",
                        videoFileName = "activity_2-n4.mp4",
                        description = "Solve Routine or Non-routine Problems Involving Subtraction of Decimals"
                    ),
                    Question.RoutineProblem(
                        id = 5,
                        text = "",
                        videoFileName = "activity_2-n5.mp4",
                        description = "Solve Routine or Non-routine Problems Involving Subtraction of Decimals"
                    ),
                    Question.RoutineProblem(
                        id = 6,
                        text = "",
                        videoFileName = "activity_2-n6.mp4",
                        description = "Solve Routine or Non-routine Problems Involving Subtraction of Decimals"
                    ),
                    Question.RoutineProblem(
                        id = 7,
                        text = "",
                        videoFileName = "activity_2-n7.mp4",
                        description = "Solve Routine or Non-routine Problems Involving Subtraction of Decimals"
                    )
                )
            ),
        )
    }

    private fun getQuarter1Lesson9Activities(): List<Activity> {
        return listOf(
            // Activity 1: Multiply Decimals and Mixed Decimals with up to 2 Decimal Places
            Activity(
                id = 1,
                quarter = 1,
                lessonNumber = 9,
                activityNumber = 1,
                title = "Multiply Decimals and Mixed Decimals with up to 2 Decimal Places",
                type = ActivityType.MULTIPLE_CHOICE,
                questions = listOf(
                    Question.MultipleChoice(
                        id = 1,
                        text = "2.25 × 0.8 =",
                        options = listOf("1.8", "1.9", "1.2", "0.8"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 2,
                        text = "3.65 × 0.6 =",
                        options = listOf("2.19", "19", "2", "2.18"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 3,
                        text = "2.75 × 0.2 =",
                        options = listOf("0.55", "5.55", "0.11", "65"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 4,
                        text = "5.45 × 0.9 =",
                        options = listOf("4.905", "4.095", "4", "0.95"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 5,
                        text = "1.55 × 0.3 =",
                        options = listOf("0.465", "465", "0.654", "0.789"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 6,
                        text = "8.17 × 0.5 =",
                        options = listOf("465", "4.085", "485", "1.408"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 7,
                        text = "4.26 × 0.4 =",
                        options = listOf("1.804", "1.704", "1.7.01", "1574 "),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 8,
                        text = "3.21 × 0.5 =",
                        options = listOf("1.805", "1.605", "1.705", "1.905"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 9,
                        text = "4.06 × 0.3 =",
                        options = listOf("1.128", "1.218", "1.219", "2.218"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 10,
                        text = "1.75 × 0.7 =",
                        options = listOf("1.8", "1.225", "1.552", "225"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 11,
                        text = "0.19 × 0.9 =",
                        options = listOf("0.9", "0.17", "0.171", "81"),
                        correctAnswer = 2
                    ),
                    Question.MultipleChoice(
                        id = 12,
                        text = "0.12 × 0.8 =",
                        options = listOf("0.20", "0.86", "0.096", "69"),
                        correctAnswer = 2
                    ),
                    Question.MultipleChoice(
                        id = 13,
                        text = "0.13 × 0.4 =",
                        options = listOf("0.021", "0.25", "0.052", "0.52"),
                        correctAnswer = 2
                    ),
                    Question.MultipleChoice(
                        id = 14,
                        text = "0.11 × 0.6 =",
                        options = listOf("0.6", "0.0006", "0.066", "0.66"),
                        correctAnswer = 2
                    ),
                    Question.MultipleChoice(
                        id = 15,
                        text = "0.14 × 0.9 =",
                        options = listOf("0.123", "0.113", "0.126", "0.165"),
                        correctAnswer = 2
                    ),
                    Question.MultipleChoice(
                        id = 16,
                        text = "1.11 × 3.15 =",
                        options = listOf("4.28", "2.18", "1.81", "3.4965"),
                        correctAnswer = 3
                    ),
                    Question.MultipleChoice(
                        id = 17,
                        text = "2.89 × 2.25 =",
                        options = listOf("6.2565", "6.0544", "6.502556", "6.5025"),
                        correctAnswer = 2
                    ),
                    Question.MultipleChoice(
                        id = 18,
                        text = "3.63 × 1.45 =",
                        options = listOf("4.2635", "5.2536", "5.6532", "5.2635"),
                        correctAnswer = 3
                    ),
                    Question.MultipleChoice(
                        id = 19,
                        text = "4.16 × 1.63 =",
                        options = listOf("67808", "67.808", "0.6708", "6.7808"),
                        correctAnswer = 3
                    ),
                    Question.MultipleChoice(
                        id = 20,
                        text = "5.22 × 2.11 =",
                        options = listOf("11.0124", "1.0142", "11.142", "11.0142"),
                        correctAnswer = 3
                    ),
                    Question.MultipleChoice(
                        id = 21,
                        text = "8.51 × 1.98 =",
                        options = listOf("16.8498", "16.8497", "16.9784", "6.8498"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 22,
                        text = "4.36 × 7.27 =",
                        options = listOf("1.11", "31.6972", "31.8952", "35.6972"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 23,
                        text = "3.15 × 1.09 =",
                        options = listOf("2.4356", "4.1568", "3.4335", "3.4567"),
                        correctAnswer = 2
                    ),
                    Question.MultipleChoice(
                        id = 24,
                        text = "1.08 × 5.03 =",
                        options = listOf("5.6844", "5.7824", "54324", "5.4324"),
                        correctAnswer = 3
                    ),
                    Question.MultipleChoice(
                        id = 25,
                        text = "5.40 × 1.11 =",
                        options = listOf("5.994", "5.995", "5", "5995"),
                        correctAnswer = 0
                    )
                )
            ),

            // Activity 2: Multiply Decimals and Mixed Decimals with up to 2 Decimal Places
            Activity(
                id = 2,
                quarter = 1,
                lessonNumber = 9,
                activityNumber = 2,
                title = "Multiply Decimals and Mixed Decimals with up to 2 Decimal Places",
                type = ActivityType.WIRE_MATCHING,
                questions = listOf(
                    Question.WireMatching(
                        id = 1,
                        text = "Solve the given decimals in Column A. Then, choose the correct answer from Column B and cross-match it with its corresponding item in Column A.",
                        columnA = listOf(
                            "1.29 × 0.2 =",
                            "7.23 × 0.4 =",
                            "3.55 × 0.7 =",
                            "1.33 × 0.6 =",
                            "5.29 × 0.6 =",
                            "6.65 × 0.2 =",
                            "2.44 × 0.5 =",
                            "3.12 × 0.3 =",
                            "1.85 × 0.5 =",
                            "5.61 × 0.3 =",
                            "0.21 × 0.7 =",
                            "0.95 × 0.9 =",
                            "0.34 × 0.4 =",
                            "0.14 × 0.8 =",
                            "0.51 × 0.2 =",
                            "1.35 × 1.18 =",
                            "2.26 × 3.26 =",
                            "6.45 × 2.20 =",
                            "4.48 × 5.11 =",
                            "1.44 × 1.59 =",
                            "9.18 × 5.15 =",
                            "2.31 × 7.45 =",
                            "5.23 × 1.15 =",
                            "5.55 × 2.27 =",
                            "9.60 × 8.91 ="
                        ),
                        columnB = listOf(
                            "0.258",
                            "2.892",
                            "2.485",
                            "0.798",
                            "3.174",
                            "1.33",
                            "1.22",
                            "0.936",
                            "0.925",
                            "1.683",
                            "0.147",
                            "0.855",
                            "0.136",
                            "0.112",
                            "0.102",
                            "1.593",
                            "7.3676",
                            "14.19",
                            "22.8928",
                            "2.2896",
                            "47.277",
                            "17.2095",
                            "6.0145",
                            "12.5985",
                            "85.536"
                        ),
                        correctMatches = mapOf(
                            0 to 0,   // 1.29 × 0.2 = 0.258
                            1 to 1,   // 7.23 × 0.4 = 2.892
                            2 to 2,   // 3.55 × 0.7 = 2.485
                            3 to 3,   // 1.33 × 0.6 = 0.798
                            4 to 4,   // 5.29 × 0.6 = 3.174
                            5 to 5,   // 6.65 × 0.2 = 1.33
                            6 to 6,   // 2.44 × 0.5 = 1.22
                            7 to 7,   // 3.12 × 0.3 = 0.936
                            8 to 8,   // 1.85 × 0.5 = 0.925
                            9 to 9,   // 5.61 × 0.3 = 1.683
                            10 to 10, // 0.21 × 0.7 = 0.147
                            11 to 11, // 0.95 × 0.9 = 0.855
                            12 to 12, // 0.34 × 0.4 = 0.136
                            13 to 13, // 0.14 × 0.8 = 0.112
                            14 to 14, // 0.51 × 0.2 = 0.102
                            15 to 15, // 1.35 × 1.18 = 1.593
                            16 to 16, // 2.26 × 3.26 = 7.3676
                            17 to 17, // 6.45 × 2.20 = 14.19
                            18 to 18, // 4.48 × 5.11 = 22.8928
                            19 to 19, // 1.44 × 1.59 = 2.2896
                            20 to 20, // 9.18 × 5.15 = 47.277
                            21 to 21, // 2.31 × 7.45 = 17.2095
                            22 to 22, // 5.23 × 1.15 = 6.0145
                            23 to 23, // 5.55 × 2.27 = 12.5985
                            24 to 24  // 9.60 × 8.91 = 85.536
                        )
                    )
                )
            ),
        )
    }

    private fun getQuarter1Lesson10Activities(): List<Activity> {
        return listOf(
            // Activity 1: Multiply Decimals up to 2 Decimal Places by 0.1, 0.01, 10, and 100
            Activity(
                id = 1,
                quarter = 1,
                lessonNumber = 10,
                activityNumber = 1,
                title = "Multiply Decimals up to 2 Decimal Places by 0.1, 0.01, 10, and 100",
                type = ActivityType.MULTIPLE_CHOICE,
                questions = listOf(
                    Question.MultipleChoice(
                        id = 1,
                        text = "0.59 × 0.1 = 0.059",
                        options = listOf("True", "False"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 2,
                        text = "0.64 × 0.1 = 0.064",
                        options = listOf("True", "False"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 3,
                        text = "0.31 × 0.1 = 0.031",
                        options = listOf("True", "False"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 4,
                        text = "0.19 × 0.1 = 0.019",
                        options = listOf("True", "False"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 5,
                        text = "0.28 × 0.1 = 0.028",
                        options = listOf("True", "False"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 6,
                        text = "0.43 × 0.1 = 0.043",
                        options = listOf("True", "False"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 7,
                        text = "0.99 × 0.1 = 0.099",
                        options = listOf("True", "False"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 8,
                        text = "0.36 × 0.1 = 0.036",
                        options = listOf("True", "False"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 9,
                        text = "0.47 × 0.1 = 0.047",
                        options = listOf("True", "False"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 10,
                        text = "0.94 × 0.1 = 0.094",
                        options = listOf("True", "False"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 11,
                        text = "0.63 × 0.01 = 0.0063",
                        options = listOf("True", "False"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 12,
                        text = "0.77 × 0.01 = 0.0077",
                        options = listOf("True", "False"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 13,
                        text = "0.34 × 0.01 = 0.0034",
                        options = listOf("True", "False"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 14,
                        text = "0.96 × 0.01 = 0.0086",
                        options = listOf("True", "False"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 15,
                        text = "0.51 × 0.01 = 0.5111",
                        options = listOf("True", "False"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 16,
                        text = "0.23 × 10 = 2.5",
                        options = listOf("True", "False"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 17,
                        text = "0.39 × 10 = 5.9",
                        options = listOf("True", "False"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 18,
                        text = "0.69 × 10 = 69",
                        options = listOf("True", "False"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 19,
                        text = "0.87 × 10 = 8.8",
                        options = listOf("True", "False"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 20,
                        text = "0.71 × 10 = 7",
                        options = listOf("True", "False"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 21,
                        text = "0.09 × 100 = 90",
                        options = listOf("True", "False"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 22,
                        text = "0.81 × 100 = 71",
                        options = listOf("True", "False"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 23,
                        text = "0.22 × 100 = 20",
                        options = listOf("True", "False"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 24,
                        text = "0.91 × 100 = 191",
                        options = listOf("True", "False"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 25,
                        text = "0.13 × 100 = 3",
                        options = listOf("True", "False"),
                        correctAnswer = 1
                    )
                )
            ),

            // Activity 2: Divide Whole Numbers By Decimals
            Activity(
                id = 2,
                quarter = 1,
                lessonNumber = 10,
                activityNumber = 2,
                title = "Multiply Decimals up to 2 Decimal Places by 0.1, 0.01, 10, and 100",
                type = ActivityType.DRAG_DROP,
                questions = listOf(
                    Question.DragDrop(
                        id = 1,
                        text = "Solve the given decimals in Column A. Then, select the correct answer from Column B and drag it to the corresponding box in Column A.",
                        columnA = listOf(
                            "0.17 × 0.1 =",
                            "0.97 × 0.1 =",
                            "0.65 × 0.1 =",
                            "0.29 × 0.1 =",
                            "0.86 × 0.1 =",
                            "0.79 × 0.1 =",
                            "0.49 × 0.1 =",
                            "0.32 × 0.1 =",
                            "0.14 × 0.1 =",
                            "0.10 × 0.1 =",
                            "0.47 × 0.01 =",
                            "0.55 × 0.01 =",
                            "0.89 × 0.01 =",
                            "0.24 × 0.01 =",
                            "0.15 × 0.01 =",
                            "0.92 × 10 =",
                            "0.52 × 10 =",
                            "0.11 × 10 =",
                            "0.41 × 10 =",
                            "0.93 × 10 =",
                            "0.07 × 100 =",
                            "0.76 × 100 =",
                            "0.68 × 100 =",
                            "0.53 × 100 =",
                            "0.12 × 100 ="
                        ),
                        columnB = listOf(
                            "0.017",     // Answer for #1: 0.17 × 0.1
                            "0.097",     // Answer for #2: 0.97 × 0.1
                            "0.065",     // Answer for #3: 0.65 × 0.1
                            "0.029",     // Answer for #4: 0.29 × 0.1
                            "0.086",     // Answer for #5: 0.86 × 0.1
                            "0.079",     // Answer for #6: 0.79 × 0.1
                            "0.049",     // Answer for #7: 0.49 × 0.1
                            "0.032",     // Answer for #8: 0.32 × 0.1
                            "0.014",     // Answer for #9: 0.14 × 0.1
                            "0.01",      // Answer for #10: 0.10 × 0.1
                            "0.0047",    // Answer for #11: 0.47 × 0.01
                            "0.0055",    // Answer for #12: 0.55 × 0.01
                            "0.0089",    // Answer for #13: 0.89 × 0.01
                            "0.0024",    // Answer for #14: 0.24 × 0.01
                            "0.0015",    // Answer for #15: 0.15 × 0.01
                            "9.2",       // Answer for #16: 0.92 × 10
                            "5.2",       // Answer for #17: 0.52 × 10
                            "1.1",       // Answer for #18: 0.11 × 10
                            "4.1",       // Answer for #19: 0.41 × 10
                            "9.3",       // Answer for #20: 0.93 × 10
                            "7",         // Answer for #21: 0.07 × 100
                            "76",        // Answer for #22: 0.76 × 100
                            "68",        // Answer for #23: 0.68 × 100
                            "53",        // Answer for #24: 0.53 × 100
                            "12"         // Answer for #25: 0.12 × 100
                        ),
                        correctMatches = mapOf(
                            0 to 0,   // 0.17 × 0.1 = 0.017
                            1 to 1,   // 0.97 × 0.1 = 0.097
                            2 to 2,   // 0.65 × 0.1 = 0.065
                            3 to 3,   // 0.29 × 0.1 = 0.029
                            4 to 4,   // 0.86 × 0.1 = 0.086
                            5 to 5,   // 0.79 × 0.1 = 0.079
                            6 to 6,   // 0.49 × 0.1 = 0.049
                            7 to 7,   // 0.32 × 0.1 = 0.032
                            8 to 8,   // 0.14 × 0.1 = 0.014
                            9 to 9,   // 0.10 × 0.1 = 0.01
                            10 to 10, // 0.47 × 0.01 = 0.0047
                            11 to 11, // 0.55 × 0.01 = 0.0055
                            12 to 12, // 0.89 × 0.01 = 0.0089
                            13 to 13, // 0.24 × 0.01 = 0.0024
                            14 to 14, // 0.15 × 0.01 = 0.0015
                            15 to 15, // 0.92 × 10 = 9.2
                            16 to 16, // 0.52 × 10 = 5.2
                            17 to 17, // 0.11 × 10 = 1.1
                            18 to 18, // 0.41 × 10 = 4.1
                            19 to 19, // 0.93 × 10 = 9.3
                            20 to 20, // 0.07 × 100 = 7
                            21 to 21, // 0.76 × 100 = 76
                            22 to 22, // 0.68 × 100 = 68
                            23 to 23, // 0.53 × 100 = 53
                            24 to 24  // 0.12 × 100 = 12
                        )
                    )
                )
            ),
        )
    }

    private fun getQuarter1Lesson11Activities(): List<Activity> {
        return listOf(
            // Activity 1: Routine and Non-Routine Problems - Multiplication Decimals including money (Video-based)
            Activity(
                id = 1,
                quarter = 1,
                lessonNumber = 11,
                activityNumber = 1,
                title = "Solve Routine or Non-routine Problems Involving Multiplication of Decimals and Mixed Decimals, Including Money",
                type = ActivityType.ROUTINE_PROBLEM,
                questions = listOf(
                    Question.RoutineProblem(
                        id = 1,
                        text = "",
                        videoFileName = "activity_1-n1.mp4",
                        description = "Solve Routine or Non-routine Problems Involving Addition of Decimals and Mixed Decimals, Including Money"
                    ),
                    Question.RoutineProblem(
                        id = 2,
                        text = "",
                        videoFileName = "activity_1-n2.mp4",
                        description = "Solve Routine or Non-routine Problems Involving Addition of Decimals and Mixed Decimals, Including Money"
                    ),
                    Question.RoutineProblem(
                        id = 3,
                        text = "",
                        videoFileName = "activity_1-n3.mp4",
                        description = "Solve Routine or Non-routine Problems Involving Addition of Decimals and Mixed Decimals, Including Money"
                    ),
                    Question.RoutineProblem(
                        id = 4,
                        text = "",
                        videoFileName = "activity_1-n4.mp4",
                        description = "Solve Routine or Non-routine Problems Involving Addition of Decimals and Mixed Decimals, Including Money"
                    ),
                    Question.RoutineProblem(
                        id = 5,
                        text = "",
                        videoFileName = "activity_1-n5.mp4",
                        description = "Solve Routine or Non-routine Problems Involving Addition of Decimals and Mixed Decimals, Including Money"
                    ),
                    Question.RoutineProblem(
                        id = 6,
                        text = "",
                        videoFileName = "activity_1-n6.mp4",
                        description = "Solve Routine or Non-routine Problems Involving Addition of Decimals and Mixed Decimals, Including Money"
                    ),
                    Question.RoutineProblem(
                        id = 7,
                        text = "",
                        videoFileName = "activity_1-n7.mp4",
                        description = "Solve Routine or Non-routine Problems Involving Addition of Decimals and Mixed Decimals, Including Money"
                    )
                )
            ),


            // Activity 2: Routine and Non-Routine Problems - Multiplication Decimals including money (Video-based)
            Activity(
                id = 2,
                quarter = 1,
                lessonNumber = 11,
                activityNumber = 2,
                title = "Solve Routine or Non-routine Problems Involving Multiplication of Decimals and Mixed Decimals, Including Money",
                type = ActivityType.ROUTINE_PROBLEM,
                questions = listOf(
                    Question.RoutineProblem(
                        id = 1,
                        text = "",
                        videoFileName = "activity_2-n1.mp4",
                        description = "Solve Routine or Non-routine Problems Involving Addition of Decimals and Mixed Decimals, Including Money"
                    ),
                    Question.RoutineProblem(
                        id = 2,
                        text = "",
                        videoFileName = "activity_2-n2.mp4",
                        description = "Solve Routine or Non-routine Problems Involving Addition of Decimals and Mixed Decimals, Including Money"
                    ),
                    Question.RoutineProblem(
                        id = 3,
                        text = "",
                        videoFileName = "activity_2-n3.mp4",
                        description = "Solve Routine or Non-routine Problems Involving Addition of Decimals and Mixed Decimals, Including Money"
                    ),
                    Question.RoutineProblem(
                        id = 4,
                        text = "",
                        videoFileName = "activity_2-n4.mp4",
                        description = "Solve Routine or Non-routine Problems Involving Addition of Decimals and Mixed Decimals, Including Money"
                    ),
                    Question.RoutineProblem(
                        id = 5,
                        text = "",
                        videoFileName = "activity_2-n5.mp4",
                        description = "Solve Routine or Non-routine Problems Involving Addition of Decimals and Mixed Decimals, Including Money"
                    ),
                    Question.RoutineProblem(
                        id = 6,
                        text = "",
                        videoFileName = "activity_2-n6.mp4",
                        description = "Solve Routine or Non-routine Problems Involving Addition of Decimals and Mixed Decimals, Including Money"
                    ),
                    Question.RoutineProblem(
                        id = 7,
                        text = "",
                        videoFileName = "activity_2-n7.mp4",
                        description = "Solve Routine or Non-routine Problems Involving Addition of Decimals and Mixed Decimals, Including Money"
                    )
                )
            ),
        )
    }

    private fun getQuarter1Lesson12Activities(): List<Activity> {
        return listOf(
            // Activity 1: Multi-Step Problems - Multiplication, Adding, or Subtracting Decimals and Whole Numbers related to money (Video-based)
            Activity(
                id = 1,
                quarter = 1,
                lessonNumber = 12,
                activityNumber = 1,
                title = "Solve Multi-Step Problems, Involving Multiplying, Adding, or Subtracting Decimals, Mixed Decimals and Whole Numbers, such as those Related to Money",
                type = ActivityType.ROUTINE_PROBLEM,
                questions = listOf(
                    Question.RoutineProblem(
                        id = 1,
                        text = "",
                        videoFileName = "activity_1-n1.mp4",
                        description = "Solve Multi-Step Problems, Involving Multiplying, Adding, or Subtracting Decimals, Mixed Decimals and Whole Numbers, such as those Related to Money"
                    ),
                    Question.RoutineProblem(
                        id = 2,
                        text = "",
                        videoFileName = "activity_1-n2.mp4",
                        description = "Solve Multi-Step Problems, Involving Multiplying, Adding, or Subtracting Decimals, Mixed Decimals and Whole Numbers, such as those Related to Money"
                    ),
                    Question.RoutineProblem(
                        id = 3,
                        text = "",
                        videoFileName = "activity_1-n3.mp4",
                        description = "Solve Multi-Step Problems, Involving Multiplying, Adding, or Subtracting Decimals, Mixed Decimals and Whole Numbers, such as those Related to Money"
                    ),
                    Question.RoutineProblem(
                        id = 4,
                        text = "",
                        videoFileName = "activity_1-n4.mp4",
                        description = "Solve Multi-Step Problems, Involving Multiplying, Adding, or Subtracting Decimals, Mixed Decimals and Whole Numbers, such as those Related to Money"
                    ),
                    Question.RoutineProblem(
                        id = 5,
                        text = "",
                        videoFileName = "activity_1-n5.mp4",
                        description = "Solve Multi-Step Problems, Involving Multiplying, Adding, or Subtracting Decimals, Mixed Decimals and Whole Numbers, such as those Related to Money"
                    ),
                    Question.RoutineProblem(
                        id = 6,
                        text = "",
                        videoFileName = "activity_1-n6.mp4",
                        description = "Solve Multi-Step Problems, Involving Multiplying, Adding, or Subtracting Decimals, Mixed Decimals and Whole Numbers, such as those Related to Money"
                    ),
                    Question.RoutineProblem(
                        id = 7,
                        text = "",
                        videoFileName = "activity_1-n7.mp4",
                        description = "Solve Multi-Step Problems, Involving Multiplying, Adding, or Subtracting Decimals, Mixed Decimals and Whole Numbers, such as those Related to Money"
                    )
                )
            ),


            // Activity 2: Multi-Step Problems - Multiplication, Adding, or Subtracting Decimals and Whole Numbers related to money (Video-based)
            Activity(
                id = 2,
                quarter = 1,
                lessonNumber = 12,
                activityNumber = 2,
                title = "Solve Multi-Step Problems, Involving Multiplying, Adding, or Subtracting Decimals, Mixed Decimals and Whole Numbers, such as those Related to Money",
                type = ActivityType.ROUTINE_PROBLEM,
                questions = listOf(
                    Question.RoutineProblem(
                        id = 1,
                        text = "",
                        videoFileName = "activity_2-n1.mp4",
                        description = "Solve Multi-Step Problems, Involving Multiplying, Adding, or Subtracting Decimals, Mixed Decimals and Whole Numbers, such as those Related to Money"
                    ),
                    Question.RoutineProblem(
                        id = 2,
                        text = "",
                        videoFileName = "activity_2-n2.mp4",
                        description = "Solve Multi-Step Problems, Involving Multiplying, Adding, or Subtracting Decimals, Mixed Decimals and Whole Numbers, such as those Related to Money"
                    ),
                    Question.RoutineProblem(
                        id = 3,
                        text = "",
                        videoFileName = "activity_2-n3.mp4",
                        description = "Solve Multi-Step Problems, Involving Multiplying, Adding, or Subtracting Decimals, Mixed Decimals and Whole Numbers, such as those Related to Money"
                    ),
                    Question.RoutineProblem(
                        id = 4,
                        text = "",
                        videoFileName = "activity_2-n4.mp4",
                        description = "Solve Multi-Step Problems, Involving Multiplying, Adding, or Subtracting Decimals, Mixed Decimals and Whole Numbers, such as those Related to Money"
                    ),
                    Question.RoutineProblem(
                        id = 5,
                        text = "",
                        videoFileName = "activity_2-n5.mp4",
                        description = "Solve Multi-Step Problems, Involving Multiplying, Adding, or Subtracting Decimals, Mixed Decimals and Whole Numbers, such as those Related to Money"
                    ),
                    Question.RoutineProblem(
                        id = 6,
                        text = "",
                        videoFileName = "activity_2-n6.mp4",
                        description = "Solve Multi-Step Problems, Involving Multiplying, Adding, or Subtracting Decimals, Mixed Decimals and Whole Numbers, such as those Related to Money"
                    ),
                    Question.RoutineProblem(
                        id = 7,
                        text = "",
                        videoFileName = "activity_2-n7.mp4",
                        description = "Solve Multi-Step Problems, Involving Multiplying, Adding, or Subtracting Decimals, Mixed Decimals and Whole Numbers, such as those Related to Money"
                    )
                )
            ),
        )
    }

    private fun getQuarter1Lesson13Activities(): List<Activity> {
        return listOf(
            // Activity 1: Divide Whole Numbers by Decimals
            Activity(
                id = 1,
                quarter = 1,
                lessonNumber = 13,
                activityNumber = 1,
                title = "Divide Whole Numbers by Decimals (up to Two Decimal Places), Decimals by Whole Numbers, and Mixed Decimals (up to Two Decimal Places)",
                type = ActivityType.DRAG_DROP,
                questions = listOf(
                    Question.DragDrop(
                        id = 1,
                        text = "Solve the given decimals and select the correct answer by dragging and dropping it into the box provided.",
                        columnA = listOf(
                            "5 ÷ 0.21 =",
                            "6 ÷ 0.31 =",
                            "8 ÷ 0.15 =",
                            "9 ÷ 0.09 =",
                            "12 ÷ 0.15 =",
                            "15 ÷ 0.52 =",
                            "21 ÷ 0.40 =",
                            "25 ÷ 0.80 =",
                            "30 ÷ 0.06 =",
                            "40 ÷ 0.15 =",
                            "0.12 ÷ 1 =",
                            "0.71 ÷ 2 =",
                            "0.12 ÷ 2 =",
                            "0.18 ÷ 10 =",
                            "0.12 ÷ 8 =",
                            "0.05 ÷ 9 =",
                            "0.16 ÷ 7 =",
                            "0.04 ÷ 6 =",
                            "0.10 ÷ 3 =",
                            "0.02 ÷ 4 =",
                            "0.11 ÷ 1.11 =",
                            "0.25 ÷ 3.20 =",
                            "0.35 ÷ 1.03 =",
                            "0.14 ÷ 5.10 =",
                            "0.13 ÷ 1.63 ="
                        ),
                        columnB = listOf(
                            "23.81",      // Answer for #1: 5 ÷ 0.21
                            "19.355",     // Answer for #2: 6 ÷ 0.31
                            "53.333",     // Answer for #3: 8 ÷ 0.15
                            "100",        // Answer for #4: 9 ÷ 0.09
                            "80",         // Answer for #5: 12 ÷ 0.15
                            "28.846",     // Answer for #6: 15 ÷ 0.52
                            "52.5",       // Answer for #7: 21 ÷ 0.40
                            "31.25",      // Answer for #8: 25 ÷ 0.80
                            "500",        // Answer for #9: 30 ÷ 0.06
                            "266.667",    // Answer for #10: 40 ÷ 0.15
                            "0.12",       // Answer for #11: 0.12 ÷ 1
                            "0.355",      // Answer for #12: 0.71 ÷ 2
                            "0.06",       // Answer for #13: 0.12 ÷ 2
                            "0.018",      // Answer for #14: 0.18 ÷ 10
                            "0.015",      // Answer for #15: 0.12 ÷ 8
                            "0.006",      // Answer for #16: 0.05 ÷ 9
                            "0.023",      // Answer for #17: 0.16 ÷ 7
                            "0.007",      // Answer for #18: 0.04 ÷ 6
                            "0.033",      // Answer for #19: 0.10 ÷ 3
                            "0.005",      // Answer for #20: 0.02 ÷ 4
                            "0.099",      // Answer for #21: 0.11 ÷ 1.11
                            "0.078",      // Answer for #22: 0.25 ÷ 3.20
                            "0.34",       // Answer for #23: 0.35 ÷ 1.03
                            "0.027",      // Answer for #24: 0.14 ÷ 5.10
                            "0.08"        // Answer for #25: 0.13 ÷ 1.63
                        ),
                        correctMatches = mapOf(
                            0 to 0,   // 5 ÷ 0.21 = 23.81
                            1 to 1,   // 6 ÷ 0.31 = 19.355
                            2 to 2,   // 8 ÷ 0.15 = 53.333
                            3 to 3,   // 9 ÷ 0.09 = 100
                            4 to 4,   // 12 ÷ 0.15 = 80
                            5 to 5,   // 15 ÷ 0.52 = 28.846
                            6 to 6,   // 21 ÷ 0.40 = 52.5
                            7 to 7,   // 25 ÷ 0.80 = 31.25
                            8 to 8,   // 30 ÷ 0.06 = 500
                            9 to 9,   // 40 ÷ 0.15 = 266.667
                            10 to 10, // 0.12 ÷ 1 = 0.12
                            11 to 11, // 0.71 ÷ 2 = 0.355
                            12 to 12, // 0.12 ÷ 2 = 0.06
                            13 to 13, // 0.18 ÷ 10 = 0.018
                            14 to 14, // 0.12 ÷ 8 = 0.015
                            15 to 15, // 0.05 ÷ 9 = 0.006
                            16 to 16, // 0.16 ÷ 7 = 0.023
                            17 to 17, // 0.04 ÷ 6 = 0.007
                            18 to 18, // 0.10 ÷ 3 = 0.033
                            19 to 19, // 0.02 ÷ 4 = 0.005
                            20 to 20, // 0.11 ÷ 1.11 = 0.099
                            21 to 21, // 0.25 ÷ 3.20 = 0.078
                            22 to 22, // 0.35 ÷ 1.03 = 0.34
                            23 to 23, // 0.14 ÷ 5.10 = 0.027
                            24 to 24  // 0.13 ÷ 1.63 = 0.08
                        )
                    )
                )
            ),

            // Activity 2: Divide Whole Numbers by Decimals
            Activity(
                id = 2,
                quarter = 1,
                lessonNumber = 13,
                activityNumber = 2,
                title = "Divide Whole Numbers by Decimals (up to Two Decimal Places), Decimals by Whole Numbers, and Mixed Decimals (up to Two Decimal Places)",
                type = ActivityType.WIRE_MATCHING,
                questions = listOf(
                    Question.WireMatching(
                        id = 1,
                        text = "Solve the following decimals provided. Select the correct answer from Column B and cross-match it with the appropriate option in Column A.",
                        columnA = listOf(
                            "1 ÷ 0.25 =",
                            "13 ÷ 0.20 =",
                            "15 ÷ 0.03 =",
                            "37 ÷ 0.37 =",
                            "23 ÷ 0.32 =",
                            "9 ÷ 0.24 =",
                            "19 ÷ 0.20 =",
                            "31 ÷ 0.32 =",
                            "42 ÷ 0.10 =",
                            "5 ÷ 0.50 =",
                            "0.50 ÷ 2 =",
                            "0.68 ÷ 4 =",
                            "0.34 ÷ 5 =",
                            "0.22 ÷ 8 =",
                            "0.47 ÷ 10 =",
                            "0.20 ÷ 16 =",
                            "0.09 ÷ 6 =",
                            "0.06 ÷ 1 =",
                            "0.39 ÷ 3 =",
                            "0.48 ÷ 12 =",
                            "0.13 ÷ 7.13 =",
                            "0.09 ÷ 2.01 =",
                            "0.15 ÷ 4.06 =",
                            "0.26 ÷ 9.20 =",
                            "0.36 ÷ 6.30 ="
                        ),
                        columnB = listOf(
                            "4",        // Answer for #1: 1 ÷ 0.25
                            "65",       // Answer for #2: 13 ÷ 0.20
                            "500",      // Answer for #3: 15 ÷ 0.03
                            "100",      // Answer for #4: 37 ÷ 0.37
                            "71.875",   // Answer for #5: 23 ÷ 0.32
                            "37.5",     // Answer for #6: 9 ÷ 0.24
                            "95",       // Answer for #7: 19 ÷ 0.20
                            "96.875",   // Answer for #8: 31 ÷ 0.32
                            "420",      // Answer for #9: 42 ÷ 0.10
                            "10",       // Answer for #10: 5 ÷ 0.50
                            "0.25",     // Answer for #11: 0.50 ÷ 2
                            "0.17",     // Answer for #12: 0.68 ÷ 4
                            "0.068",    // Answer for #13: 0.34 ÷ 5
                            "0.028",    // Answer for #14: 0.22 ÷ 8
                            "0.047",    // Answer for #15: 0.47 ÷ 10
                            "0.013",    // Answer for #16: 0.20 ÷ 16
                            "0.015",    // Answer for #17: 0.09 ÷ 6
                            "0.06",     // Answer for #18: 0.06 ÷ 1
                            "0.13",     // Answer for #19: 0.39 ÷ 3
                            "0.04",     // Answer for #20: 0.48 ÷ 12
                            "0.018",    // Answer for #21: 0.13 ÷ 7.13
                            "0.045",    // Answer for #22: 0.09 ÷ 2.01
                            "0.037",    // Answer for #23: 0.15 ÷ 4.06
                            "0.028",    // Answer for #24: 0.26 ÷ 9.20
                            "0.057"     // Answer for #25: 0.36 ÷ 6.30
                        ),
                        correctMatches = mapOf(
                            0 to 0,   // 1 ÷ 0.25 = 4
                            1 to 1,   // 13 ÷ 0.20 = 65
                            2 to 2,   // 15 ÷ 0.03 = 500
                            3 to 3,   // 37 ÷ 0.37 = 100
                            4 to 4,   // 23 ÷ 0.32 = 71.875
                            5 to 5,   // 9 ÷ 0.24 = 37.5
                            6 to 6,   // 19 ÷ 0.20 = 95
                            7 to 7,   // 31 ÷ 0.32 = 96.875
                            8 to 8,   // 42 ÷ 0.10 = 420
                            9 to 9,   // 5 ÷ 0.50 = 10
                            10 to 10, // 0.50 ÷ 2 = 0.25
                            11 to 11, // 0.68 ÷ 4 = 0.17
                            12 to 12, // 0.34 ÷ 5 = 0.068
                            13 to 13, // 0.22 ÷ 8 = 0.028
                            14 to 14, // 0.47 ÷ 10 = 0.047
                            15 to 15, // 0.20 ÷ 16 = 0.013
                            16 to 16, // 0.09 ÷ 6 = 0.015
                            17 to 17, // 0.06 ÷ 1 = 0.06
                            18 to 18, // 0.39 ÷ 3 = 0.13
                            19 to 19, // 0.48 ÷ 12 = 0.04
                            20 to 20, // 0.13 ÷ 7.13 = 0.018
                            21 to 21, // 0.09 ÷ 2.01 = 0.045
                            22 to 22, // 0.15 ÷ 4.06 = 0.037
                            23 to 23, // 0.26 ÷ 9.20 = 0.028
                            24 to 24  // 0.36 ÷ 6.30 = 0.057
                        )
                    )
                )
            ),
        )
    }

    private fun getQuarter1Lesson14Activities(): List<Activity> {
        return listOf(
            // Activity 1: Divide Decimals with up to Four Decimal Places by 0.1, 0.01
            Activity(
                id = 1,
                quarter = 1,
                lessonNumber = 14,
                activityNumber = 1,
                title = "Divide Decimals with up to Four Decimal Places by 0.1, 0.01",
                type = ActivityType.MULTIPLE_CHOICE,
                questions = listOf(
                    Question.MultipleChoice(
                        id = 1,
                        text = "0.1234 ÷ 0.1 =",
                        options = listOf("1.234", "123.4", "1.23", "12.34"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 2,
                        text = "0.9876 ÷ 0.1 =",
                        options = listOf("0.19876", "9.88", "9.876", "98.76"),
                        correctAnswer = 2
                    ),
                    Question.MultipleChoice(
                        id = 3,
                        text = "0.4567 ÷ 0.1 =",
                        options = listOf("4.567", "45.67", "4.57", "0.14567"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 4,
                        text = "0.8123 ÷ 0.1 =",
                        options = listOf("1.8123", "8.123", "1.812", "8.124"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 5,
                        text = "0.2345 ÷ 0.1 =",
                        options = listOf("3", "2.345", "2.35", "0.2345"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 6,
                        text = "0.6789 ÷ 0.1 =",
                        options = listOf("0.68", "0.7", "0.16789", "6.789"),
                        correctAnswer = 3
                    ),
                    Question.MultipleChoice(
                        id = 7,
                        text = "0.3456 ÷ 0.1 =",
                        options = listOf("34.56", "0.3456", "0.35", "3.456"),
                        correctAnswer = 3
                    ),
                    Question.MultipleChoice(
                        id = 8,
                        text = "0.5432 ÷ 0.1 =",
                        options = listOf("5.432", "05.432", "0.4532", "0.543"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 9,
                        text = "0.8765 ÷ 0.1 =",
                        options = listOf("1.8765", "8.765", "0.8765", "18765"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 10,
                        text = "0.6543 ÷ 0.1 =",
                        options = listOf("6.54", "0.6543", "6.543", "0.65"),
                        correctAnswer = 2
                    ),
                    Question.MultipleChoice(
                        id = 11,
                        text = "0.1234 ÷ 0.01 =",
                        options = listOf("0.012345", "0.123", "12.34", "1.234"),
                        correctAnswer = 2
                    ),
                    Question.MultipleChoice(
                        id = 12,
                        text = "0.9876 ÷ 0.01 =",
                        options = listOf("1.9876", "987.6", "0.9876", "98.76"),
                        correctAnswer = 3
                    ),
                    Question.MultipleChoice(
                        id = 13,
                        text = "0.4567 ÷ 0.01 =",
                        options = listOf("45.67", "456.7", "0.4567", "0.14567"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 14,
                        text = "0.8123 ÷ 0.01 =",
                        options = listOf("812.3", "81.23", "0.8123", "0.8"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 15,
                        text = "0.2345 ÷ 0.01 =",
                        options = listOf("0.012345", "2.345", "23.45", "234.5"),
                        correctAnswer = 2
                    ),
                    Question.MultipleChoice(
                        id = 16,
                        text = "0.6789 ÷ 0.01 =",
                        options = listOf("0.6789", "0.67.89", "0.68", "67.89"),
                        correctAnswer = 3
                    ),
                    Question.MultipleChoice(
                        id = 17,
                        text = "0.3456 ÷ 0.01 =",
                        options = listOf("34.56", "0.3456", "0.35", "0.34.56"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 18,
                        text = "0.5432 ÷ 0.01 =",
                        options = listOf("54.32", "5.432", "0.54", "0.5"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 19,
                        text = "0.8765 ÷ 0.01 =",
                        options = listOf("87.56", "87.65", "0.8765", "0.88"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 20,
                        text = "0.6543 ÷ 0.01 =",
                        options = listOf("1.65", "1.6543", "65.43", "0.6543"),
                        correctAnswer = 2
                    ),
                    Question.MultipleChoice(
                        id = 21,
                        text = "0.1234 ÷ 0.001 =",
                        options = listOf("123.4", "1.234", "1.23", "0.1234"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 22,
                        text = "0.9876 ÷ 0.001 =",
                        options = listOf("1.98", "987.6", "1.9876", "0.9876"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 23,
                        text = "0.4567 ÷ 0.001 =",
                        options = listOf("4567", "46", "456.7", "0.46"),
                        correctAnswer = 2
                    ),
                    Question.MultipleChoice(
                        id = 24,
                        text = "0.8123 ÷ 0.001 =",
                        options = listOf("1.238", "0.8123", "0.001", "812.3"),
                        correctAnswer = 3
                    ),
                    Question.MultipleChoice(
                        id = 25,
                        text = "0.2345 ÷ 0.001 =",
                        options = listOf("0.2345", "0.235", "2345", "234.5"),
                        correctAnswer = 3
                    )
                )
            ),

            // Activity 2: Divide Decimals with up to Two Decimal Places by 10, 100, and 1,000
            Activity(
                id = 2,
                quarter = 1,
                lessonNumber = 14,
                activityNumber = 2,
                title = "Divide Decimals with up to Two Decimal Places by 10, 100, and 1,000",
                type = ActivityType.DRAG_DROP,
                questions = listOf(
                    Question.DragDrop(
                        id = 1,
                        text = "Solve the following decimals provided. Choose the right answer from column B and drag and drop it into the box provided in column A.",
                        columnA = listOf(
                            "0.12 ÷ 10 =",
                            "0.56 ÷ 10 =",
                            "0.89 ÷ 10 =",
                            "0.34 ÷ 10 =",
                            "0.78 ÷ 10 =",
                            "0.65 ÷ 10 =",
                            "0.23 ÷ 10 =",
                            "0.91 ÷ 10 =",
                            "0.47 ÷ 10 =",
                            "0.82 ÷ 10 =",
                            "0.45 ÷ 100 =",
                            "0.67 ÷ 100 =",
                            "0.39 ÷ 100 =",
                            "0.82 ÷ 100 =",
                            "0.61 ÷ 100 =",
                            "0.24 ÷ 100 =",
                            "0.88 ÷ 100 =",
                            "0.33 ÷ 100 =",
                            "0.13 ÷ 100 =",
                            "0.01 ÷ 100 =",
                            "0.11 ÷ 1000 =",
                            "0.34 ÷ 1000 =",
                            "0.12 ÷ 1000 =",
                            "0.58 ÷ 1000 =",
                            "0.45 ÷ 1000 ="
                        ),
                        columnB = listOf(
                            "0.012",      // Answer for #1: 0.12 ÷ 10
                            "0.056",      // Answer for #2: 0.56 ÷ 10
                            "0.089",      // Answer for #3: 0.89 ÷ 10
                            "0.034",      // Answer for #4: 0.34 ÷ 10
                            "0.078",      // Answer for #5: 0.78 ÷ 10
                            "0.065",      // Answer for #6: 0.65 ÷ 10
                            "0.023",      // Answer for #7: 0.23 ÷ 10
                            "0.091",      // Answer for #8: 0.91 ÷ 10
                            "0.047",      // Answer for #9: 0.47 ÷ 10
                            "0.082",      // Answer for #10: 0.82 ÷ 10
                            "0.005",      // Answer for #11: 0.45 ÷ 100
                            "0.007",      // Answer for #12: 0.67 ÷ 100
                            "0.004",      // Answer for #13: 0.39 ÷ 100
                            "0.008",      // Answer for #14: 0.82 ÷ 100
                            "0.006",      // Answer for #15: 0.61 ÷ 100
                            "0.002",      // Answer for #16: 0.24 ÷ 100
                            "0.009",      // Answer for #17: 0.88 ÷ 100
                            "0.003",      // Answer for #18: 0.33 ÷ 100
                            "0.001",      // Answer for #19: 0.13 ÷ 100
                            "0",          // Answer for #20: 0.01 ÷ 100
                            "0",          // Answer for #21: 0.11 ÷ 1000
                            "0",          // Answer for #22: 0.34 ÷ 1000
                            "0",          // Answer for #23: 0.12 ÷ 1000
                            "0.001",      // Answer for #24: 0.58 ÷ 1000
                            "0"           // Answer for #25: 0.45 ÷ 1000
                        ),
                        correctMatches = mapOf(
                            0 to 0,   // 0.12 ÷ 10 = 0.012
                            1 to 1,   // 0.56 ÷ 10 = 0.056
                            2 to 2,   // 0.89 ÷ 10 = 0.089
                            3 to 3,   // 0.34 ÷ 10 = 0.034
                            4 to 4,   // 0.78 ÷ 10 = 0.078
                            5 to 5,   // 0.65 ÷ 10 = 0.065
                            6 to 6,   // 0.23 ÷ 10 = 0.023
                            7 to 7,   // 0.91 ÷ 10 = 0.091
                            8 to 8,   // 0.47 ÷ 10 = 0.047
                            9 to 9,   // 0.82 ÷ 10 = 0.082
                            10 to 10, // 0.45 ÷ 100 = 0.005
                            11 to 11, // 0.67 ÷ 100 = 0.007
                            12 to 12, // 0.39 ÷ 100 = 0.004
                            13 to 13, // 0.82 ÷ 100 = 0.008
                            14 to 14, // 0.61 ÷ 100 = 0.006
                            15 to 15, // 0.24 ÷ 100 = 0.002
                            16 to 16, // 0.88 ÷ 100 = 0.009
                            17 to 17, // 0.33 ÷ 100 = 0.003
                            18 to 18, // 0.13 ÷ 100 = 0.001
                            19 to 19, // 0.01 ÷ 100 = 0
                            20 to 20, // 0.11 ÷ 1000 = 0
                            21 to 21, // 0.34 ÷ 1000 = 0
                            22 to 22, // 0.12 ÷ 1000 = 0
                            23 to 23, // 0.58 ÷ 1000 = 0.001
                            24 to 24  // 0.45 ÷ 1000 = 0
                        )
                    )
                )
            ),
        )
    }

    private fun getQuarter1Lesson15Activities(): List<Activity> {
        return listOf(
            // Activity 1: Identifying Rational and Irrational Numbers
            Activity(
                id = 1,
                quarter = 1,
                lessonNumber = 15,
                activityNumber = 1,
                title = "Identifying Rational and Irrational Numbers",
                type = ActivityType.MULTIPLE_CHOICE,
                questions = listOf(
                    Question.MultipleChoice(
                        id = 1,
                        text = "1/2",
                        options = listOf("Rational", "Irrational"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 2,
                        text = "3/4",
                        options = listOf("Rational", "Irrational"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 3,
                        text = "0.75",
                        options = listOf("Rational", "Irrational"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 4,
                        text = "5/6",
                        options = listOf("Rational", "Irrational"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 5,
                        text = "2.5",
                        options = listOf("Rational", "Irrational"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 6,
                        text = "7/3",
                        options = listOf("Rational", "Irrational"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 7,
                        text = "-1/4",
                        options = listOf("Rational", "Irrational"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 8,
                        text = "0.2",
                        options = listOf("Rational", "Irrational"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 9,
                        text = "8/9",
                        options = listOf("Rational", "Irrational"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 10,
                        text = "1.25",
                        options = listOf("Rational", "Irrational"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 11,
                        text = "-3/8",
                        options = listOf("Rational", "Irrational"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 12,
                        text = "0.6",
                        options = listOf("Rational", "Irrational"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 13,
                        text = "4/7",
                        options = listOf("Rational", "Irrational"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 14,
                        text = "2/20",
                        options = listOf("Rational", "Irrational"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 15,
                        text = "1/19",
                        options = listOf("Rational", "Irrational"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 16,
                        text = "√2",
                        options = listOf("Rational", "Irrational"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 17,
                        text = "π",
                        options = listOf("Rational", "Irrational"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 18,
                        text = "e",
                        options = listOf("Rational", "Irrational"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 19,
                        text = "√3",
                        options = listOf("Rational", "Irrational"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 20,
                        text = "√5",
                        options = listOf("Rational", "Irrational"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 21,
                        text = "√7",
                        options = listOf("Rational", "Irrational"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 22,
                        text = "φ",
                        options = listOf("Rational", "Irrational"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 23,
                        text = "3√5",
                        options = listOf("Rational", "Irrational"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 24,
                        text = "√6",
                        options = listOf("Rational", "Irrational"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 25,
                        text = "√9",
                        options = listOf("Rational", "Irrational"),
                        correctAnswer = 0
                    )
                )
            ),

            // Activity 2: Identifying Terminating and Repeating (Non-Terminating) Decimals
            Activity(
                id = 2,
                quarter = 1,
                lessonNumber = 15,
                activityNumber = 2,
                title = "Identifying Terminating and Repeating (Non-Terminating) Decimals",
                type = ActivityType.MULTIPLE_CHOICE,
                questions = listOf(
                    Question.MultipleChoice(
                        id = 1,
                        text = "0.5 is Repeating",
                        options = listOf("True", "False"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 2,
                        text = "2.75 is Terminating",
                        options = listOf("True", "False"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 3,
                        text = "3.125 is Repeating",
                        options = listOf("True", "False"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 4,
                        text = "0.4 is Terminating",
                        options = listOf("True", "False"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 5,
                        text = "1.2 is Repeating",
                        options = listOf("True", "False"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 6,
                        text = "5.6 is Terminating",
                        options = listOf("True", "False"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 7,
                        text = "0.08 is Repeating",
                        options = listOf("True", "False"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 8,
                        text = "0.375 is Terminating",
                        options = listOf("True", "False"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 9,
                        text = "9.25 is Repeating",
                        options = listOf("True", "False"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 10,
                        text = "4.6 is Terminating",
                        options = listOf("True", "False"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 11,
                        text = "0.125 is Repeating",
                        options = listOf("True", "False"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 12,
                        text = "0.2 is Terminating",
                        options = listOf("True", "False"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 13,
                        text = "3.0 is Repeating",
                        options = listOf("True", "False"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 14,
                        text = "0.333… is Terminating",
                        options = listOf("True", "False"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 15,
                        text = "0.666… is Repeating",
                        options = listOf("True", "False"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 16,
                        text = "0.142356666644… is Terminating",
                        options = listOf("True", "False"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 17,
                        text = "0.956558454… is Repeating",
                        options = listOf("True", "False"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 18,
                        text = "0.4444… is Terminating",
                        options = listOf("True", "False"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 19,
                        text = "0.121212… is Repeating",
                        options = listOf("True", "False"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 20,
                        text = "0.090909… is Terminating",
                        options = listOf("True", "False"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 21,
                        text = "0.1231254648… is Repeating",
                        options = listOf("True", "False"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 22,
                        text = "0.98989847… is Terminating",
                        options = listOf("True", "False"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 23,
                        text = "0.11111111… is Repeating",
                        options = listOf("True", "False"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 24,
                        text = "0.777888999… is Terminating",
                        options = listOf("True", "False"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 25,
                        text = "0.123456789… is Repeating",
                        options = listOf("True", "False"),
                        correctAnswer = 0
                    )
                )
            ),
        )
    }

    private fun getQuarter1Lesson16Activities(): List<Activity> {
        return listOf(
            // Activity 1: Routine and Non-Routine Problems - Division Decimals and money (Video-based)
            Activity(
                id = 1,
                quarter = 1,
                lessonNumber = 16,
                activityNumber = 1,
                title = "Routine or Non-routine Problems Involving Division of Decimals Numbers and Money",
                type = ActivityType.ROUTINE_PROBLEM,
                questions = listOf(
                    Question.RoutineProblem(
                        id = 1,
                        text = "",
                        videoFileName = "activity_1-n1.mp4",
                        description = "Routine or Non-routine Problems Involving Division of Decimals Numbers and Money"
                    ),
                    Question.RoutineProblem(
                        id = 2,
                        text = "",
                        videoFileName = "activity_1-n2.mp4",
                        description = "Routine or Non-routine Problems Involving Division of Decimals Numbers and Money"
                    ),
                    Question.RoutineProblem(
                        id = 3,
                        text = "",
                        videoFileName = "activity_1-n3.mp4",
                        description = "Routine or Non-routine Problems Involving Division of Decimals Numbers and Money"
                    ),
                    Question.RoutineProblem(
                        id = 4,
                        text = "",
                        videoFileName = "activity_1-n4.mp4",
                        description = "Routine or Non-routine Problems Involving Division of Decimals Numbers and Money"
                    ),
                    Question.RoutineProblem(
                        id = 5,
                        text = "",
                        videoFileName = "activity_1-n5.mp4",
                        description = "Routine or Non-routine Problems Involving Division of Decimals Numbers and Money"
                    ),
                    Question.RoutineProblem(
                        id = 6,
                        text = "",
                        videoFileName = "activity_1-n6.mp4",
                        description = "Routine or Non-routine Problems Involving Division of Decimals Numbers and Money"
                    ),
                    Question.RoutineProblem(
                        id = 7,
                        text = "",
                        videoFileName = "activity_1-n7.mp4",
                        description = "Routine or Non-routine Problems Involving Division of Decimals Numbers and Money"
                    ),
                )
            ),


            // Activity 2: Routine and Non-Routine Problems - Division Decimals including money (Video-based)
            Activity(
                id = 2,
                quarter = 1,
                lessonNumber = 16,
                activityNumber = 2,
                title = "Routine or Non-routine Problems Involving Division of Decimals Numbers and Money",
                type = ActivityType.ROUTINE_PROBLEM,
                questions = listOf(
                    Question.RoutineProblem(
                        id = 1,
                        text = "",
                        videoFileName = "activity_2-n1.mp4",
                        description = "Routine or Non-routine Problems Involving Division of Decimals Numbers and Money"
                    ),
                    Question.RoutineProblem(
                        id = 2,
                        text = "",
                        videoFileName = "activity_2-n2.mp4",
                        description = "Routine or Non-routine Problems Involving Division of Decimals Numbers and Money"
                    ),
                    Question.RoutineProblem(
                        id = 3,
                        text = "",
                        videoFileName = "activity_2-n3.mp4",
                        description = "Routine or Non-routine Problems Involving Division of Decimals Numbers and Money"
                    ),
                    Question.RoutineProblem(
                        id = 4,
                        text = "",
                        videoFileName = "activity_2-n4.mp4",
                        description = "Routine or Non-routine Problems Involving Division of Decimals Numbers and Money"
                    ),
                    Question.RoutineProblem(
                        id = 5,
                        text = "",
                        videoFileName = "activity_2-n5.mp4",
                        description = "Routine or Non-routine Problems Involving Division of Decimals Numbers and Money"
                    ),
                    Question.RoutineProblem(
                        id = 6,
                        text = "",
                        videoFileName = "activity_2-n6.mp4",
                        description = "Routine or Non-routine Problems Involving Division of Decimals Numbers and Money"
                    ),
                    Question.RoutineProblem(
                        id = 7,
                        text = "",
                        videoFileName = "activity_2-n7.mp4",
                        description = "Routine or Non-routine Problems Involving Division of Decimals Numbers and Money"
                    ),
                )
            ),
        )
    }

    private fun getQuarter1Lesson17Activities(): List<Activity> {
        return listOf(
            // Activity 1: Routine and Non-Routine Problems - Any Operations including Decimals, Whole Numbers and Money (Video-based)
//            Activity(
//                id = 1,
//                quarter = 1,
//                lessonNumber = 17,
//                activityNumber = 1,
//                title = "Routine or Non-routine Problems Involving Any of the Operations Including any Decimals, Whole Numbers and Money",
//                type = ActivityType.ROUTINE_PROBLEM,
//                questions = listOf(
//                    Question.RoutineProblem(
//                        id = 1,
//                        text = "",
//                        videoFileName = "activity_1-n1.mp4",
//                        description = "Routine or Non-routine Problems Involving Any of the Operations Including any Decimals, Whole Numbers and Money"
//                    ),
//                    Question.RoutineProblem(
//                        id = 2,
//                        text = "",
//                        videoFileName = "activity_1-n2.mp4",
//                        description = "Routine or Non-routine Problems Involving Any of the Operations Including any Decimals, Whole Numbers and Money"
//                    ),
//                )
//            ),


            // Activity 2: Word Problem to Equation
            Activity(
                id = 2,
                quarter = 1,
                lessonNumber = 17,
                activityNumber = 2,
                title = "Word Problem to Equation",
                type = ActivityType.MULTIPLE_CHOICE,
                questions = listOf(
                    Question.MultipleChoice(
                        id = 1,
                        text = "I am thinking of a number. Four times my number plus 12 equals 60. What is my number?",
                        options = listOf("4x + 12 = 60", "4x – 12 = 60", "x + 4 = 60", "12x + 4 = 60"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 2,
                        text = "I am thinking of a number. Five times my number minus 8 equals 42. What is my number?",
                        options = listOf("5x – 8 = 42", "5x + 8 = 42", "x – 5 = 8", "8x – 5 = 42"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 3,
                        text = "I am thinking of a number. Three more than seven times my number equals 31. What is my number?",
                        options = listOf("7x – 3 = 31", "7x + 3 = 31", "3x + 7 = 31", "3x – 7 = 31"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 4,
                        text = "I am thinking of a number. Twelve less than nine times my number equals 24. What is my number?",
                        options = listOf("9x – 12 = 24", "9x + 12 = 24", "12x – 9 = 24", "x – 9 = 12"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 5,
                        text = "I am thinking of a number. Twice my number plus 15 equals 47. What is my number?",
                        options = listOf("2x + 15 = 47", "2x – 15 = 47", "x + 2 = 15", "15x + 2 = 47"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 6,
                        text = "I am thinking of a number. Six times my number minus 7 equals 41. What is my number?",
                        options = listOf("6x – 7 = 41", "6x + 7 = 41", "x – 6 = 7", "7x – 6 = 41"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 7,
                        text = "I am thinking of a number. Ten more than eight times my number equals 98. What is my number?",
                        options = listOf("10x + 8 = 98", "8x + 10 = 98", "8x – 10 = 98", "x + 8 = 10"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 8,
                        text = "I am thinking of a number. The product of 3 and my number minus 11 equals 25. What is my number?",
                        options = listOf("3x + 11 = 25", "3x – 11 = 25", "x – 3 = 11", "11x – 3 = 25"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 9,
                        text = "I am thinking of a number. The quotient of my number and 5 plus 4 equals 10. What is my number?",
                        options = listOf("x ÷ 5 + 4 = 10", "x ÷ 4 + 5 = 10", "5 ÷ x + 4 = 10", "x + 5 ÷ 4 = 10"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 10,
                        text = "I am thinking of a number. Half my number minus 6 equals 9. What is my number?",
                        options = listOf("x ÷ 6 – 2 = 9", "x ÷ 2 – 6 = 9", "2 ÷ x – 6 = 9", "x – 6 ÷ 2 = 9"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 11,
                        text = "I am thinking of a number. One-third of my number plus 8 equals 20.",
                        options = listOf("x ÷ 8 + 3 = 20", "3 ÷ x + 8 = 20", "x ÷ 3 + 8 = 20", "x + 3 ÷ 8 = 20"),
                        correctAnswer = 2
                    ),
                    Question.MultipleChoice(
                        id = 12,
                        text = "I am thinking of a number. Three times my number plus 4 equals 31.",
                        options = listOf("x + 3 = 4", "4x + 3 = 31", "3x – 4 = 31", "3x + 4 = 31"),
                        correctAnswer = 3
                    ),
                    Question.MultipleChoice(
                        id = 13,
                        text = "I am thinking of a number. The difference between my number and 7 is 15.",
                        options = listOf("7 – x = 15", "x – 7 = 15", "x + 7 = 15", "7x – 1 = 5"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 14,
                        text = "I am thinking of a number. My number minus 9 equals 44.",
                        options = listOf("x ÷ 9 = 44", "x – 9 = 44", "9 – x = 44", "x + 9 = 44"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 15,
                        text = "I am thinking of a number. My number divided by 4 minus 3 equals 5.",
                        options = listOf("x ÷ 3 – 4 = 5", "x ÷ 4 – 3 = 5", "4 ÷ x – 3 = 5", "x – 3 ÷ 4 = 5"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 16,
                        text = "I am thinking of a number. Six times my number plus 2 equals 38.",
                        options = listOf("6x + 2 = 38", "6x – 2 = 38", "2x + 6 = 38", "x + 6 – 2 = 38"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 17,
                        text = "I am thinking of a number. Seven more than my number equals 33.",
                        options = listOf("7 – x = 33", "x + 7 = 33", "x + 33 = 7", "x – 7 = 33"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 18,
                        text = "I am thinking of a number. If I divide my number by 6 and add 5, the result is 11.",
                        options = listOf("x ÷ 6 + 5 = 11", "6 ÷ x + 5 = 11", "x ÷ 5 + 6 = 11", "x + 6 ÷ 5 = 11"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 19,
                        text = "I am thinking of a number. Twice my number minus 18 equals 42.",
                        options = listOf("2x + 18 = 42", "x – 2 = 18", "18x – 2 = 42", "2x – 18 = 42"),
                        correctAnswer = 3
                    ),
                    Question.MultipleChoice(
                        id = 20,
                        text = "I am thinking of a number. Twice my number minus 18 equals 42.",
                        options = listOf("2x + 18 = 42", "x – 2 = 18", "18x – 2 = 42", "2x – 18 = 42"),
                        correctAnswer = 3
                    ),
                    Question.MultipleChoice(
                        id = 21,
                        text = "I am thinking of a number. My number divided by 3 plus 7 equals 19.",
                        options = listOf("x ÷ 7 + 3 = 19", "3 ÷ x + 7 = 19", "x ÷ 3 + 7 = 19", "x + 3 ÷ 7 = 19"),
                        correctAnswer = 2
                    ),
                    Question.MultipleChoice(
                        id = 22,
                        text = "I am thinking of a number. Four times my number minus 5 equals 55.",
                        options = listOf("4x – 5 = 55", "x – 4 = 5", "4x + 5 = 55", "5x – 4 = 55"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 23,
                        text = "I am thinking of a number. My number minus 12 equals 108.",
                        options = listOf("x ÷ 12 = 108", "12 – x = 108", "x + 12 = 108", "x – 12 = 108"),
                        correctAnswer = 3
                    ),
                    Question.MultipleChoice(
                        id = 24,
                        text = "I am thinking of a number. My number divided by 4 plus 9 equals 20.",
                        options = listOf("x ÷ 9 + 4 = 20", "4 ÷ x + 9 = 20", "x ÷ 4 + 9 = 20", "x + 4 ÷ 9 = 20"),
                        correctAnswer = 2
                    ),
                    Question.MultipleChoice(
                        id = 25,
                        text = "I am thinking of a number. Three more than twice my number equals 17.",
                        options = listOf("x + 2 = 3", "3x + 2 = 17", "2x – 3 = 17", "2x + 3 = 17"),
                        correctAnswer = 3
                    )
                )
            ),
        )
    }

    // ------------------- QUARTER 2 -------------------
    private fun getQuarter2Lesson1Activities(): List<Activity> {
        return listOf(
            // Activity 1: Finding the Ratio in Colon Form
            Activity(
                id = 1,
                quarter = 2,
                lessonNumber = 1,
                activityNumber = 1,
                title = "Finding the Ratio in Colon Form",
                type = ActivityType.MULTIPLE_CHOICE,
                questions = listOf(
                    Question.MultipleChoice(
                        id = 1,
                        text = "Ratio of cow to pig?\n🐄🐄 🐷🐷🐷🐷🐷",
                        options = listOf("5:2", "2:5", "3:6", "4:3"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 2,
                        text = "Ratio of turtle to cat?\n🐢🐢🐢 🐱🐱🐱🐱",
                        options = listOf("3:4", "4:3", "3:3", "4:5"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 3,
                        text = "Ratio of burger to ice cream?\n🍔🍔🍔🍔 🍦🍦",
                        options = listOf("5:2", "2:4", "4:2", "3:4"),
                        correctAnswer = 2
                    ),
                    Question.MultipleChoice(
                        id = 4,
                        text = "Ratio of police officer to teacher?\n👮👮 👨‍🏫👨‍🏫👨‍🏫👨‍🏫",
                        options = listOf("5:3", "4:2", "4:3", "2:4"),
                        correctAnswer = 3
                    ),
                    Question.MultipleChoice(
                        id = 5,
                        text = "Ratio of apple to orange?\n🍎🍎🍎🍎 🍊🍊🍊🍊🍊🍊",
                        options = listOf("4:6", "5:6", "4:5", "5:4"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 6,
                        text = "Ratio of kiwi to watermelon?\n🥝🥝🥝🥝🥝 🍉🍉🍉",
                        options = listOf("3:5", "5:3", "4:5", "5:6"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 7,
                        text = "Ratio of king to queen?\n🤴🤴 👸👸👸👸",
                        options = listOf("2:6", "3:6", "2:4", "4:2"),
                        correctAnswer = 2
                    ),
                    Question.MultipleChoice(
                        id = 8,
                        text = "Ratio of heart to circle?\n❤️ ⚪⚪⚪⚪⚪",
                        options = listOf("1:5", "5:1", "3:5", "2:4"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 9,
                        text = "Ratio of foot to hand?\n🦶🦶🦶🦶🦶🦶🦶🦶 ✋✋✋✋✋✋",
                        options = listOf("7:6", "8:6", "6:9", "8:7"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 10,
                        text = "Ratio of cell phone to laptop?\n📱📱📱📱📱 💻💻💻💻",
                        options = listOf("4:5", "5:6", "6:3", "5:4"),
                        correctAnswer = 3
                    ),
                    Question.MultipleChoice(
                        id = 11,
                        text = "Ratio of fork to spoon?\n🍴🍴🍴 🥄",
                        options = listOf("3:1", "1:3", "2:3", "3:2"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 12,
                        text = "Ratio of butterfly to frog?\n🦋🦋🦋🦋🦋🦋🦋 🐸🐸🐸🐸🐸🐸🐸🐸",
                        options = listOf("8:7", "7:8", "7:6", "8:5"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 13,
                        text = "Ratio of facebook to twitter?\n📘📘📘 🐦🐦🐦🐦🐦🐦🐦",
                        options = listOf("4:7", "3:6", "3:7", "5:4"),
                        correctAnswer = 2
                    ),
                    Question.MultipleChoice(
                        id = 14,
                        text = "Ratio of tree to flower?\n🌲🌲🌲🌲🌲🌲 🌸🌸🌸",
                        options = listOf("4:3", "6:4", "3:5", "6:3"),
                        correctAnswer = 3
                    ),
                    Question.MultipleChoice(
                        id = 15,
                        text = "Ratio of mouse to keyboard?\n🖱️🖱️🖱️🖱️ ⌨️⌨️⌨️⌨️⌨️⌨️⌨️⌨️",
                        options = listOf("4:8", "8:4", "5:6", "4:6"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 16,
                        text = "Ratio of lawyer to chef?\n⚖️⚖️⚖️⚖️⚖️ 👨‍🍳👨‍🍳👨‍🍳👨‍🍳👨‍🍳👨‍🍳👨‍🍳",
                        options = listOf("5:6", "5:7", "6:5", "7:5"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 17,
                        text = "Ratio of pencil to notebook?\n✏️✏️✏️✏️✏️✏️ 📓📓📓📓📓",
                        options = listOf("5:6", "5:7", "6:5", "6:7"),
                        correctAnswer = 2
                    ),
                    Question.MultipleChoice(
                        id = 18,
                        text = "Ratio of blueberry to cherry?\n🫐🫐🫐🫐🫐🫐 🍒",
                        options = listOf("2:5", "6:2", "2:4", "6:1"),
                        correctAnswer = 3
                    ),
                    Question.MultipleChoice(
                        id = 19,
                        text = "Ratio of skirt to pants?\n👗👗👗👗👗👗👗👗👗 👖👖👖",
                        options = listOf("9:3", "3:8", "9:4", "8:6"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 20,
                        text = "Ratio of pink socks to blue socks?\n🧦🧦🧦🧦🧦 (pink) \n🧦🧦🧦🧦🧦🧦🧦🧦🧦 (blue)",
                        options = listOf("5:8", "5:9", "8:6", "9:6"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 21,
                        text = "Ratio of chocolate to lollipop?\n🍫🍫🍫🍫 🍭🍭🍭🍭🍭🍭🍭",
                        options = listOf("5:6", "6:5", "4:7", "7:5"),
                        correctAnswer = 2
                    ),
                    Question.MultipleChoice(
                        id = 22,
                        text = "Ratio of pink candy to blue candy?\n🍬🍬🍬 (pink) 🍬🍬 (blue)",
                        options = listOf("3:4", "4:5", "2:4", "3:2"),
                        correctAnswer = 3
                    ),
                    Question.MultipleChoice(
                        id = 23,
                        text = "Ratio of chocolate cake to strawberry cake?\n🍫🍫🍫🍫 🍓",
                        options = listOf("4:1", "1:4", "3:4", "4:2"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 24,
                        text = "Ratio of chili sauce to oil?\n🌶️🌶️🌶️🌶️🌶️🌶️🌶️ 🛢️🛢️🛢️🛢️🛢️🛢️🛢️🛢️",
                        options = listOf("7:6", "7:8", "8:7", "6:5"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 25,
                        text = "Ratio of crying emoji to smiley emoji?\n😢😢😢 😊😊😊😊😊😊😊😊😊😊",
                        options = listOf("3:11", "11:4", "3:10", "10:4"),
                        correctAnswer = 2
                    )
                )
            ),

            // Activity 2: Finding the Ratio in Fraction Form
            Activity(
                id = 2,
                quarter = 2,
                lessonNumber = 1,
                activityNumber = 2,
                title = "Finding the Ratio in Fraction Form",
                type = ActivityType.MULTIPLE_CHOICE,
                questions = listOf(
                    Question.MultipleChoice(
                        id = 1,
                        text = "Ratio of shoulder bag to backpack bag?\n👜👜👜👜👜👜👜👜👜👜 🎒🎒🎒🎒🎒",
                        options = listOf("¹⁰⁄₅", "¹⁰⁄₆", "⁹⁄₅", "⁸⁄₅"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 2,
                        text = "Ratio of plate to bowl?\n🍽️🍽️🍽️🍽️🍽️🍽️🍽️🍽️🍽️🍽️🍽️ 🥣🥣🥣🥣🥣🥣🥣",
                        options = listOf("¹⁰⁄₇", "¹¹⁄₇", "¹⁰⁄₆", "¹¹⁄₅"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 3,
                        text = "Ratio of lion to meat?\n🦁🦁🦁🦁🦁🦁🦁🦁🦁 🥩🥩🥩🥩🥩🥩🥩🥩🥩🥩",
                        options = listOf("⁸⁄₉", "¹⁰⁄₅", "⁹⁄₁₀", "⁹⁄₅"),
                        correctAnswer = 2
                    ),
                    Question.MultipleChoice(
                        id = 4,
                        text = "Ratio of giraffe to elephant?\n🦒🦒🦒🦒🦒🦒 🐘🐘🐘🐘🐘🐘🐘🐘🐘",
                        options = listOf("⁷⁄₈", "⁵⁄₆", "⁸⁄₇", "⁶⁄₉"),
                        correctAnswer = 3
                    ),
                    Question.MultipleChoice(
                        id = 5,
                        text = "Ratio of snake to worm?\n🐍 🪱🪱🪱🪱🪱🪱",
                        options = listOf("¹⁄₆", "²⁄₅", "³⁄₄", "¹⁄₅"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 6,
                        text = "Ratio of eagle to dove?\n🦅🦅 🕊️🕊️🕊️🕊️🕊️🕊️🕊️",
                        options = listOf("³⁄₆", "²⁄₇", "⁴⁄₅", "⁵⁄₈"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 7,
                        text = "Ratio of dinosaur egg to chicken egg?\n🥚🥚 (dino) \n🥚🥚🥚🥚 (chicken)",
                        options = listOf("³⁄₄", "¹⁄₂", "²⁄₄", "³⁄₅"),
                        correctAnswer = 2
                    ),
                    Question.MultipleChoice(
                        id = 8,
                        text = "Ratio of dolphin to shark?\n🐬🐬🐬🐬🐬🐬 🦈🦈🦈🦈🦈🦈🦈🦈🦈🦈",
                        options = listOf("⁷⁄₁₀", "⁷⁄₁₂", "¹⁰⁄₁₁", "⁶⁄₁₀"),
                        correctAnswer = 3
                    ),
                    Question.MultipleChoice(
                        id = 9,
                        text = "Ratio of beetle to cockroach?\n🪲🪲🪲🪲🪲🪲🪲🪲 🪳🪳🪳🪳🪳🪳🪳🪳🪳🪳🪳",
                        options = listOf("⁸⁄₁₁", "⁷⁄₁₀", "⁹⁄₁₂", "⁶⁄₉"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 10,
                        text = "Ratio of ant to lizard?\n🐜🐜 🦎🦎🦎",
                        options = listOf("²⁄₄", "²⁄₃", "⁴⁄₅", "³⁄₅"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 11,
                        text = "Ratio of squid to shrimp?\n🦑🦑🦑🦑 🦐🦐🦐🦐🦐🦐",
                        options = listOf("⁴⁄₉", "⁵⁄₇", "⁴⁄₆", "²⁄₅"),
                        correctAnswer = 2
                    ),
                    Question.MultipleChoice(
                        id = 12,
                        text = "Ratio of mussels to oysters?\n🦪🦪🦪🦪🦪 (mussels) \n🦪🦪🦪🦪🦪🦪 (oysters)",
                        options = listOf("⁵⁄₈", "⁶⁄₈", "⁴⁄₇", "⁵⁄₆"),
                        correctAnswer = 3
                    ),
                    Question.MultipleChoice(
                        id = 13,
                        text = "Ratio of caterpillar to snail?\n🐛🐛🐛🐛🐛 🐌🐌🐌🐌",
                        options = listOf("⁵⁄₄", "⁶⁄₃", "⁷⁄₈", "⁴⁄₅"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 14,
                        text = "Ratio of chess game to snake & ladder?\n♟️♟️♟️♟️♟️♟️♟️♟️ 🎲🎲🎲🎲",
                        options = listOf("⁸⁄₅", "⁸⁄₄", "⁹⁄₇", "⁷⁄₈"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 15,
                        text = "Ratio of basketball to volleyball?\n🏀🏀🏀🏀 🏐🏐🏐🏐🏐🏐🏐🏐🏐",
                        options = listOf("⁴⁄₈", "³⁄₈", "⁴⁄₉", "³⁄₇"),
                        correctAnswer = 2
                    ),
                    Question.MultipleChoice(
                        id = 16,
                        text = "Ratio of hotdog sandwich to fried chicken?\n🌭🌭🌭🌭🌭🌭🌭 🍗🍗🍗🍗🍗🍗",
                        options = listOf("³⁄₄", "⁸⁄₇", "⁶⁄₅", "⁷⁄₆"),
                        correctAnswer = 3
                    ),
                    Question.MultipleChoice(
                        id = 17,
                        text = "Ratio of pizza to fries?\n🍕 🍟🍟",
                        options = listOf("¹⁄₂", "²⁄₃", "³⁄₄", "¹⁄₅"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 18,
                        text = "Ratio of carbonara to spaghetti?\n🍝🍝🍝🍝🍝🍝🍝 (carbonara) \n🍝🍝🍝🍝🍝🍝🍝🍝 (spaghetti)",
                        options = listOf("⁶⁄₉", "⁷⁄₈", "⁵⁄₇", "⁸⁄₉"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 19,
                        text = "Ratio of cake to cupcake?\n🎂 🧁🧁🧁🧁🧁",
                        options = listOf("¹⁄₄", "²⁄₅", "¹⁄₅", "³⁄₄"),
                        correctAnswer = 2
                    ),
                    Question.MultipleChoice(
                        id = 20,
                        text = "Ratio of pair of heels to pair of rubber shoes?\n👠👠👠 👟👟👟👟",
                        options = listOf("⁴⁄₅", "²⁄₃", "⁵⁄₄", "³⁄₄"),
                        correctAnswer = 3
                    ),
                    Question.MultipleChoice(
                        id = 21,
                        text = "Ratio of necklace to ring?\n📿📿📿 💍💍💍💍💍💍💍",
                        options = listOf("³⁄₇", "⁴⁄₉", "²⁄₅", "⁵⁄₆"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 22,
                        text = "Ratio of earrings to bracelet?\n👂👂👂👂 (earrings) \n📿📿📿📿📿📿📿📿📿📿 (bracelet)",
                        options = listOf("³⁄₉", "⁴⁄₁₀", "⁵⁄₈", "⁶⁄₇"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 23,
                        text = "Ratio of onion to tomato?\n🧅🧅 🍅🍅🍅🍅🍅🍅",
                        options = listOf("²⁄₅", "³⁄₇", "²⁄₆", "³⁄₅"),
                        correctAnswer = 2
                    ),
                    Question.MultipleChoice(
                        id = 24,
                        text = "Ratio of airplane to truck?\n✈️✈️✈️✈️ 🚚🚚🚚🚚🚚🚚🚚",
                        options = listOf("⁵⁄₉", "⁴⁄₅", "³⁄₆", "⁴⁄₇"),
                        correctAnswer = 3
                    ),
                    Question.MultipleChoice(
                        id = 25,
                        text = "Ratio of teddy bear to drum?\n🧸🧸🧸🧸🧸🧸🧸🧸🧸 🥁🥁🥁🥁🥁🥁🥁🥁🥁🥁",
                        options = listOf("⁹⁄₁₀", "¹⁰⁄₁₁", "⁸⁄₉", "¹¹⁄₁₂"),
                        correctAnswer = 0
                    )
                )
            ),
        )
    }

    private fun getQuarter2Lesson2Activities(): List<Activity> {
        return listOf(
            // Activity 1: Identifying the Type of Proportion
            Activity(
                id = 1,
                quarter = 2,
                lessonNumber = 2,
                activityNumber = 1,
                title = "Identifying the Type of Proportion",
                type = ActivityType.MULTIPLE_CHOICE,
                questions = listOf(
                    Question.MultipleChoice(
                        id = 1,
                        text = "A teacher divides 48 candies among 4 students in the ratio 2:3:4:5. How many candies does each student receive?",
                        options = listOf("Direct Proportion", "Inverse Proportion", "Partitive Proportion"),
                        correctAnswer = 2
                    ),
                    Question.MultipleChoice(
                        id = 2,
                        text = "In a company, the salary of 3 employees is shared in the ratio 5:7:8. If the total salary is $72,000, how much does each employee get?",
                        options = listOf("Direct Proportion", "Inverse Proportion", "Partitive Proportion"),
                        correctAnswer = 2
                    ),
                    Question.MultipleChoice(
                        id = 3,
                        text = "A group of friends shared $120 in the ratio 3:4:5. How much did each person receive?",
                        options = listOf("Direct Proportion", "Inverse Proportion", "Partitive Proportion"),
                        correctAnswer = 2
                    ),
                    Question.MultipleChoice(
                        id = 4,
                        text = "A bag contains 60 marbles, divided in the ratio 1:2:3:4. How many marbles are in each part?",
                        options = listOf("Direct Proportion", "Inverse Proportion", "Partitive Proportion"),
                        correctAnswer = 2
                    ),
                    Question.MultipleChoice(
                        id = 5,
                        text = "A school divides $500 among 5 students in the ratio 2:3:4:5:6. How much does each student get?",
                        options = listOf("Direct Proportion", "Inverse Proportion", "Partitive Proportion"),
                        correctAnswer = 2
                    ),
                    Question.MultipleChoice(
                        id = 6,
                        text = "In a box, there are 120 pens, divided into three parts in the ratio 4:5:6. How many pens are in each part?",
                        options = listOf("Direct Proportion", "Inverse Proportion", "Partitive Proportion"),
                        correctAnswer = 2
                    ),
                    Question.MultipleChoice(
                        id = 7,
                        text = "A donation of $500 is split between three charities in the ratio 3:4:5. How much does each charity receive?",
                        options = listOf("Direct Proportion", "Inverse Proportion", "Partitive Proportion"),
                        correctAnswer = 2
                    ),
                    Question.MultipleChoice(
                        id = 8,
                        text = "100 books are divided among three people in the ratio 1:2:3. How many books does each person receive?",
                        options = listOf("Direct Proportion", "Inverse Proportion", "Partitive Proportion"),
                        correctAnswer = 2
                    ),
                    Question.MultipleChoice(
                        id = 9,
                        text = "A budget of $1,200 is divided into parts in the ratio 2:4:5. How much money goes into each part?",
                        options = listOf("Direct Proportion", "Inverse Proportion", "Partitive Proportion"),
                        correctAnswer = 2
                    ),
                    Question.MultipleChoice(
                        id = 10,
                        text = "A farm has 90 cows, divided among three fields in the ratio 3:5:7. How many cows are in each field?",
                        options = listOf("Direct Proportion", "Inverse Proportion", "Partitive Proportion"),
                        correctAnswer = 2
                    ),
                    Question.MultipleChoice(
                        id = 11,
                        text = "If 4 workers can complete a task in 6 hours, how long will 8 workers take to finish the same task?",
                        options = listOf("Direct Proportion", "Inverse Proportion", "Partitive Proportion"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 12,
                        text = "A car travels 180 miles in 3 hours. How far will it travel in 5 hours at the same speed?",
                        options = listOf("Direct Proportion", "Inverse Proportion", "Partitive Proportion"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 13,
                        text = "A recipe requires 3 cups of flour for 6 pancakes. How much flour is needed for 18 pancakes?",
                        options = listOf("Direct Proportion", "Inverse Proportion", "Partitive Proportion"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 14,
                        text = "If 5 apples cost $3, how much will 8 apples cost?",
                        options = listOf("Direct Proportion", "Inverse Proportion", "Partitive Proportion"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 15,
                        text = "A machine can produce 100 items in 4 hours. How many items will it produce in 6 hours?",
                        options = listOf("Direct Proportion", "Inverse Proportion", "Partitive Proportion"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 16,
                        text = "If 7 workers can build a house in 10 days, how many days will 14 workers take to build the house?",
                        options = listOf("Direct Proportion", "Inverse Proportion", "Partitive Proportion"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 17,
                        text = "If 6 liters of paint cover 12 square meters, how much area will 9 liters of paint cover?",
                        options = listOf("Direct Proportion", "Inverse Proportion", "Partitive Proportion"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 18,
                        text = "A car uses 5 gallons of fuel to drive 50 miles. How many gallons will it use to drive 150 miles?",
                        options = listOf("Direct Proportion", "Inverse Proportion", "Partitive Proportion"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 19,
                        text = "A factory produces 250 toys in 5 hours. How many toys will it produce in 8 hours?",
                        options = listOf("Direct Proportion", "Inverse Proportion", "Partitive Proportion"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 20,
                        text = "A chef needs 8 cups of rice to serve 16 people. How many cups of rice will he need for 40 people?",
                        options = listOf("Direct Proportion", "Inverse Proportion", "Partitive Proportion"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 21,
                        text = "If 6 workers can complete a task in 12 days, how long will it take 12 workers to complete the same task?",
                        options = listOf("Direct Proportion", "Inverse Proportion", "Partitive Proportion"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 22,
                        text = "If a car travels 240 miles in 4 hours, how long will it take to travel 480 miles at the same speed?",
                        options = listOf("Direct Proportion", "Inverse Proportion", "Partitive Proportion"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 23,
                        text = "The time it takes to complete a project varies inversely with the number of workers. If 10 workers finish it in 8 days, how long will 5 workers take?",
                        options = listOf("Direct Proportion", "Inverse Proportion", "Partitive Proportion"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 24,
                        text = "A tank is being filled by 3 pipes. The tank fills in 9 hours when all pipes are working. How long will it take for 1 pipe to fill the tank?",
                        options = listOf("Direct Proportion", "Inverse Proportion", "Partitive Proportion"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 25,
                        text = "The amount of time it takes to do a job is inversely proportional to the number of workers. If 8 workers can complete it in 5 hours, how many workers are needed to complete it in 3 hours?",
                        options = listOf("Direct Proportion", "Inverse Proportion", "Partitive Proportion"),
                        correctAnswer = 1
                    )
                )
            ),

            // Activity 2: Analyze if Proportion
            Activity(
                id = 2,
                quarter = 2,
                lessonNumber = 2,
                activityNumber = 2,
                title = "Analyze if Proportion",
                type = ActivityType.MULTIPLE_CHOICE,
                questions = listOf(
                    Question.MultipleChoice(
                        id = 1,
                        text = "⁴⁄₈ , ⁶⁄₁₂",
                        options = listOf("Proportion", "Not Proportion"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 2,
                        text = "³⁄₅ , ⁸⁄₁₅",
                        options = listOf("Proportion", "Not Proportion"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 3,
                        text = "⁵⁄₁₀ , ¹⁰⁄₂₀",
                        options = listOf("Proportion", "Not Proportion"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 4,
                        text = "⁷⁄₉ , ³⁄₅",
                        options = listOf("Proportion", "Not Proportion"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 5,
                        text = "²⁄₃ , ⁵⁄₁₀",
                        options = listOf("Proportion", "Not Proportion"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 6,
                        text = "⁶⁄₈ , ⁹⁄₁₂",
                        options = listOf("Proportion", "Not Proportion"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 7,
                        text = "⁴⁄₆ , ¹⁰⁄₁₅",
                        options = listOf("Proportion", "Not Proportion"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 8,
                        text = "⁷⁄₁₀ , ¹⁴⁄₂₀",
                        options = listOf("Proportion", "Not Proportion"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 9,
                        text = "³⁄₅ , ³⁄₄",
                        options = listOf("Proportion", "Not Proportion"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 10,
                        text = "⁶⁄₈ , ¹⁵⁄₂₀",
                        options = listOf("Proportion", "Not Proportion"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 11,
                        text = "³⁄₆ , ¹²⁄₂₄",
                        options = listOf("Proportion", "Not Proportion"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 12,
                        text = "⁵⁄₆ , ¹⁰⁄₁₅",
                        options = listOf("Proportion", "Not Proportion"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 13,
                        text = "⁷⁄₉ , ⁷⁄₉",
                        options = listOf("Proportion", "Not Proportion"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 14,
                        text = "²⁄₅ , ⁸⁄₂₀",
                        options = listOf("Proportion", "Not Proportion"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 15,
                        text = "⁹⁄₁₂ , ⁸⁄₁₀",
                        options = listOf("Proportion", "Not Proportion"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 16,
                        text = "⁴⁄₈ , ³⁄₆",
                        options = listOf("Proportion", "Not Proportion"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 17,
                        text = "³⁄₉ , ⁴⁄₁₂",
                        options = listOf("Proportion", "Not Proportion"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 18,
                        text = "⁵⁄₇ , ¹⁰⁄₁₅",
                        options = listOf("Proportion", "Not Proportion"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 19,
                        text = "⁸⁄₁₆ , ⁸⁄₁₆",
                        options = listOf("Proportion", "Not Proportion"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 20,
                        text = "⁶⁄₉ , ⁵⁄₁₂",
                        options = listOf("Proportion", "Not Proportion"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 21,
                        text = "⁴⁄₅ , ³⁄₆",
                        options = listOf("Proportion", "Not Proportion"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 22,
                        text = "⁶⁄₈ , ⁹⁄₁₆",
                        options = listOf("Proportion", "Not Proportion"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 23,
                        text = "²⁄₄ , ³⁄₈",
                        options = listOf("Proportion", "Not Proportion"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 24,
                        text = "⁴⁄₈ , ⁶⁄₁₂",
                        options = listOf("Proportion", "Not Proportion"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 25,
                        text = "⁷⁄₁₀ , ¹⁴⁄₁₈",
                        options = listOf("Proportion", "Not Proportion"),
                        correctAnswer = 1
                    )
                )
            ),
        )
    }

    private fun getQuarter2Lesson3Activities(): List<Activity> {
        return listOf(
            // Activity 1: Identifying Rate, Base, or Percentage
            Activity(
                id = 1,
                quarter = 2,
                lessonNumber = 3,
                activityNumber = 1,
                title = "Identifying Percentage, Rate and Base",
                type = ActivityType.MULTIPLE_CHOICE,
                questions = listOf(
                    Question.MultipleChoice(
                        id = 1,
                        text = "A person works for <font color='#FF6B6B'><b>40 hours</b></font> and earns $50 per hour, which gives them a total of $2,000.",
                        options = listOf("Rate", "Base", "Percentage"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 2,
                        text = "A store offers a 15% discount on an item priced at <font color='#FF6B6B'><b>$200</b></font>, which results in a $30 discount.",
                        options = listOf("Rate", "Base", "Percentage"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 3,
                        text = "A car travels <font color='#FF6B6B'><b>120 miles</b></font> in 3 hours, giving an average speed of 40 miles per hour.",
                        options = listOf("Rate", "Base", "Percentage"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 4,
                        text = "A bank gives an interest of 5% on a savings balance of <font color='#FF6B6B'><b>$1,000</b></font>, resulting in an interest of $50.",
                        options = listOf("Rate", "Base", "Percentage"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 5,
                        text = "A person saves $200 each month, which is <font color='#FF6B6B'><b>10%</b></font> of their total monthly income.",
                        options = listOf("Rate", "Base", "Percentage"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 6,
                        text = "A store sells a product for $150 after a <font color='#FF6B6B'><b>20%</b></font> increase in the price, resulting in a $30 increase.",
                        options = listOf("Rate", "Base", "Percentage"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 7,
                        text = "A person works 50 hours and earns a total of $2,500. The hourly wage is <font color='#FF6B6B'><b>$50</b></font>.",
                        options = listOf("Rate", "Base", "Percentage"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 8,
                        text = "A student scores 45 out of 60 on a test, which is <font color='#FF6B6B'><b>75%</b></font> of the total questions.",
                        options = listOf("Rate", "Base", "Percentage"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 9,
                        text = "A factory produces <font color='#FF6B6B'><b>500 items</b></font>, and 40% of them are defective. The number of defective items is 200.",
                        options = listOf("Rate", "Base", "Percentage"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 10,
                        text = "A salary of $60,000 includes a <font color='#FF6B6B'><b>10%</b></font> bonus, which is $6,000.",
                        options = listOf("Rate", "Base", "Percentage"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 11,
                        text = "A store gives a <font color='#FF6B6B'><b>25%</b></font> discount on a $80 item, so the discount is $20.",
                        options = listOf("Rate", "Base", "Percentage"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 12,
                        text = "A car's fuel efficiency is <font color='#FF6B6B'><b>30 miles per gallon</b></font>, and it drives 240 miles on a full tank.",
                        options = listOf("Rate", "Base", "Percentage"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 13,
                        text = "A loan of $10,000 has an interest rate of <font color='#FF6B6B'><b>5% per year</b></font>, giving an interest of $500.",
                        options = listOf("Rate", "Base", "Percentage"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 14,
                        text = "A worker earns <font color='#FF6B6B'><b>$600 per week</b></font> and works for 40 hours.",
                        options = listOf("Rate", "Base", "Percentage"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 15,
                        text = "A person spends <font color='#FF6B6B'><b>15%</b></font> of their income, which is $750 on groceries.",
                        options = listOf("Rate", "Base", "Percentage"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 16,
                        text = "A sales representative receives a 10% commission on <font color='#FF6B6B'><b>$500</b></font> in sales, which is $50.",
                        options = listOf("Rate", "Base", "Percentage"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 17,
                        text = "A student is asked to solve <font color='#FF6B6B'><b>120 problems</b></font>, and 75% of them are correct.",
                        options = listOf("Rate", "Base", "Percentage"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 18,
                        text = "A person's income increases by <font color='#FF6B6B'><b>12%</b></font>, making an extra $1,200.",
                        options = listOf("Rate", "Base", "Percentage"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 19,
                        text = "A factory makes 800 items, and 10% of them are defective, which equals <font color='#FF6B6B'><b>80 items</b></font>.",
                        options = listOf("Rate", "Base", "Percentage"),
                        correctAnswer = 2
                    ),
                    Question.MultipleChoice(
                        id = 20,
                        text = "A person invests $500 at a 5% interest rate, which generates <font color='#FF6B6B'><b>$25 in interest</b></font>.",
                        options = listOf("Rate", "Base", "Percentage"),
                        correctAnswer = 2
                    ),
                    Question.MultipleChoice(
                        id = 21,
                        text = "A company increases its prices by 8% on items that were originally priced at $200. The price increase is <font color='#FF6B6B'><b>$16</b></font>.",
                        options = listOf("Rate", "Base", "Percentage"),
                        correctAnswer = 2
                    ),
                    Question.MultipleChoice(
                        id = 22,
                        text = "A student gets 80% on a test with 50 questions. That means they got <font color='#FF6B6B'><b>40 questions correct</b></font>.",
                        options = listOf("Rate", "Base", "Percentage"),
                        correctAnswer = 2
                    ),
                    Question.MultipleChoice(
                        id = 23,
                        text = "A loan has an interest rate of 10%, which gives an interest of <font color='#FF6B6B'><b>$100</b></font> on a principal amount of $1,000.",
                        options = listOf("Rate", "Base", "Percentage"),
                        correctAnswer = 2
                    ),
                    Question.MultipleChoice(
                        id = 24,
                        text = "A product was originally $250, but now it is marked down by 25%, meaning a discount of <font color='#FF6B6B'><b>$62.50</b></font>.",
                        options = listOf("Rate", "Base", "Percentage"),
                        correctAnswer = 2
                    ),
                    Question.MultipleChoice(
                        id = 25,
                        text = "A person saves 20% of their monthly income, which is <font color='#FF6B6B'><b>$400</b></font>.",
                        options = listOf("Rate", "Base", "Percentage"),
                        correctAnswer = 2
                    )
                )
            ),

            // Activity 2: Solving Percentage, Rate and Base
            Activity(
                id = 2,
                quarter = 2,
                lessonNumber = 3,
                activityNumber = 2,
                title = "Solving Percentage, Rate and Base",
                type = ActivityType.MULTIPLE_CHOICE,
                questions = listOf(
                    Question.MultipleChoice(
                        id = 1,
                        text = "In a class of 60 students, 18 are absent. What percent of the class is absent?",
                        options = listOf("25%", "30%", "35%", "40%"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 2,
                        text = "Out of 250 oranges, 50 are rotten. What percentage of the oranges are rotten?",
                        options = listOf("15%", "25%", "20%", "30%"),
                        correctAnswer = 2
                    ),
                    Question.MultipleChoice(
                        id = 3,
                        text = "A basketball player made 48 out of 80 free throws. What percentage of free throws did they make?",
                        options = listOf("55%", "60%", "65%", "70%"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 4,
                        text = "In a factory, 144 out of 1,200 workers are engineers. What percent of the workers are engineers?",
                        options = listOf("10%", "12%", "15%", "18%"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 5,
                        text = "A teacher graded 225 out of 300 test papers. What percentage of the test papers were graded?",
                        options = listOf("70%", "75%", "80%", "85%"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 6,
                        text = "A student scored 84 on a test, which is 70% of the total possible score. What was the total possible score?",
                        options = listOf("110", "120", "100", "130"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 7,
                        text = "A company produced 240 defective items, which is 12% of the total production. How many items were produced in total?",
                        options = listOf("1,800", "2,000", "2,200", "2,500"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 8,
                        text = "A library has 150 fiction books, which make up 25% of the total collection. How many books are in the library?",
                        options = listOf("500", "550", "600", "650"),
                        correctAnswer = 2
                    ),
                    Question.MultipleChoice(
                        id = 9,
                        text = "A farmer harvested 360 apples, which is 45% of the total apples on his farm. How many apples were on the farm originally?",
                        options = listOf("700", "750", "800", "850"),
                        correctAnswer = 2
                    ),
                    Question.MultipleChoice(
                        id = 10,
                        text = "A car used 72 liters of fuel, which is 60% of the tank's capacity. What is the full capacity of the fuel tank?",
                        options = listOf("100 liters", "120 liters", "90 liters", "150 liters"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 11,
                        text = "A store sold 120 shirts out of 400 in stock. What percent of the shirts were sold?",
                        options = listOf("25%", "40%", "30%", "35%"),
                        correctAnswer = 2
                    ),
                    Question.MultipleChoice(
                        id = 12,
                        text = "A farmer harvested 90 apples from a tree that had 600 apples. What percentage of the apples were harvested?",
                        options = listOf("20%", "10%", "15%", "25%"),
                        correctAnswer = 2
                    ),
                    Question.MultipleChoice(
                        id = 13,
                        text = "A company completed 432 out of 600 planned projects. What percent of the projects were completed?",
                        options = listOf("60%", "72%", "70%", "75%"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 14,
                        text = "A water tank has 1,500 liters of capacity, but only 900 liters are filled. What percentage of the tank is full?",
                        options = listOf("50%", "60%", "70%", "55%"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 15,
                        text = "A student completed 18 out of 45 homework assignments. What percentage of the homework is completed?",
                        options = listOf("30%", "35%", "40%", "45%"),
                        correctAnswer = 2
                    ),
                    Question.MultipleChoice(
                        id = 16,
                        text = "A printer prints 72 pages in 12 minutes. What percent of the pages does it print per minute if the total is 144 pages?",
                        options = listOf("40%", "50%", "60%", "55%"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 17,
                        text = "A family spends $800 on rent, which is 40% of their monthly income. What is their total monthly income?",
                        options = listOf("$2,500", "$2,000", "$1,800", "$2,200"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 18,
                        text = "A book has 240 pages, and a student reads 180 pages. What percentage of the book has been read?",
                        options = listOf("70%", "75%", "80%", "65%"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 19,
                        text = "A car used 66 liters of fuel, which is 55% of its tank capacity. What is the full tank capacity?",
                        options = listOf("120 liters", "110 liters", "100 liters", "115 liters"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 20,
                        text = "A student scored 96 out of 120 on a test. What percent did they score?",
                        options = listOf("70%", "85%", "80%", "75%"),
                        correctAnswer = 2
                    ),
                    Question.MultipleChoice(
                        id = 21,
                        text = "A restaurant served 432 meals in a day, which is 72% of its maximum capacity. What is its maximum serving capacity?",
                        options = listOf("650", "500", "600", "550"),
                        correctAnswer = 2
                    ),
                    Question.MultipleChoice(
                        id = 22,
                        text = "A football team won 48 out of 80 games. What percent of the games were won?",
                        options = listOf("50%", "55%", "60%", "65%"),
                        correctAnswer = 2
                    ),
                    Question.MultipleChoice(
                        id = 23,
                        text = "A family spent $540 on groceries, which is 90% of their monthly budget. What is their total grocery budget?",
                        options = listOf("$580", "$600", "$650", "$620"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 24,
                        text = "A school has 1,500 students, and 1,350 students attend daily. What percent of students attend daily?",
                        options = listOf("80%", "85%", "90%", "95%"),
                        correctAnswer = 2
                    ),
                    Question.MultipleChoice(
                        id = 25,
                        text = "A cyclist completed 162 km of a 270 km race. What percent of the race has been completed?",
                        options = listOf("50%", "60%", "65%", "70%"),
                        correctAnswer = 1
                    )
                )
            )
        )
    }

    private fun getQuarter2Lesson4Activities(): List<Activity> {
        return listOf(
            // Activity 1: Solving Discount Amount, Sale Price, Discount Rate, and Original Price
            Activity(
                id = 1,
                quarter = 2,
                lessonNumber = 4,
                activityNumber = 1,
                title = "Solving Discount Amount, Sale Price, Discount Rate, and Original Price",
                type = ActivityType.MULTIPLE_CHOICE,
                questions = listOf(
                    Question.MultipleChoice(
                        id = 1,
                        text = "What is the discount amount if the original price is ₱2,000 and the discount rate is 20%?",
                        options = listOf("₱400", "₱500", "₱300", "₱450"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 2,
                        text = "A laptop costs ₱50,000, and the discount rate is 15%. How much is the discount?",
                        options = listOf("₱7,300", "₱7,500", "₱7,400", "₱7,600"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 3,
                        text = "Find the discount amount if a ₱1,500 shirt is on sale for 30% off.",
                        options = listOf("₱350", "₱400", "₱450", "₱500"),
                        correctAnswer = 2
                    ),
                    Question.MultipleChoice(
                        id = 4,
                        text = "A sofa originally costs ₱18,000 and has a discount of 12%. What is the discount amount?",
                        options = listOf("₱2,100", "₱2,120", "₱2,200", "₱2,160"),
                        correctAnswer = 3
                    ),
                    Question.MultipleChoice(
                        id = 5,
                        text = "If a ₱3,200 watch is discounted by 25%, how much is the discount?",
                        options = listOf("₱800", "₱900", "₱700", "₱600"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 6,
                        text = "Find the sale price of a ₱5,000 item after a 10% discount.",
                        options = listOf("₱4,000", "₱4,500", "₱3,500", "₱5,000"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 7,
                        text = "A TV originally costs ₱25,000 with a 15% discount. What is the sale price?",
                        options = listOf("₱21,350", "₱21,150", "₱21,250", "₱21,450"),
                        correctAnswer = 2
                    ),
                    Question.MultipleChoice(
                        id = 8,
                        text = "A toy car originally costs ₱800, and there is a 20% discount. What is the final price?",
                        options = listOf("₱440", "₱740", "₱540", "₱640"),
                        correctAnswer = 3
                    ),
                    Question.MultipleChoice(
                        id = 9,
                        text = "A chair originally costs ₱4,500, and it is on a 35% discount. What is the sale price?",
                        options = listOf("₱2,925", "₱2,825", "₱2,725", "₱2,625"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 10,
                        text = "A mobile phone was priced at ₱35,000 but has a 25% discount. What is the final sale price?",
                        options = listOf("₱26,350", "₱26,250", "₱26,150", "₱26,450"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 11,
                        text = "An item originally costs ₱12,500, and the discount amount is ₱1,875. What is the discount rate?",
                        options = listOf("40%", "30%", "15%", "10%"),
                        correctAnswer = 2
                    ),
                    Question.MultipleChoice(
                        id = 12,
                        text = "A washing machine was originally ₱30,000 and was discounted by ₱6,000. What was the discount rate?",
                        options = listOf("30%", "40%", "50%", "20%"),
                        correctAnswer = 3
                    ),
                    Question.MultipleChoice(
                        id = 13,
                        text = "A coat originally costs ₱8,000 and is discounted by ₱2,000. What is the discount percentage?",
                        options = listOf("25%", "35%", "45%", "15%"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 14,
                        text = "A fan costs ₱3,600, and the discount is ₱1,080. What is the discount rate?",
                        options = listOf("25%", "30%", "15%", "50%"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 15,
                        text = "A book originally priced at ₱1,500 is sold for ₱975. What is the discount rate?",
                        options = listOf("25%", "45%", "35%", "15%"),
                        correctAnswer = 2
                    ),
                    Question.MultipleChoice(
                        id = 16,
                        text = "An item is on sale for ₱8,000 after a 20% discount. What was the original price?",
                        options = listOf("₱13,000", "₱12,000", "₱11,000", "₱10,000"),
                        correctAnswer = 3
                    ),
                    Question.MultipleChoice(
                        id = 17,
                        text = "A jacket is sold for ₱6,000 after a 25% discount. What was the original price?",
                        options = listOf("₱8,000", "₱7,000", "₱6,000", "₱9,000"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 18,
                        text = "A laptop was discounted by 30%, and the final sale price was ₱35,000. What was the original price?",
                        options = listOf("₱60,000", "₱50,000", "₱70,000", "₱80,000"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 19,
                        text = "A dining table is sold for ₱7,200 after a 20% discount. Find the original price.",
                        options = listOf("₱10,000", "₱11,000", "₱9,000", "₱12,000"),
                        correctAnswer = 2
                    ),
                    Question.MultipleChoice(
                        id = 20,
                        text = "A pair of shoes is sold for ₱900 after a 40% discount. What was the original price?",
                        options = listOf("₱4,500", "₱3,500", "₱2,500", "₱1,500"),
                        correctAnswer = 3
                    ),
                    Question.MultipleChoice(
                        id = 21,
                        text = "A bicycle originally costs ₱12,000 and is discounted by 25%. What is the discount amount and final sale price?",
                        options = listOf("₱9,000", "₱8,000", "₱10,000", "₱11,000"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 22,
                        text = "A microwave costs ₱8,500 after a 15% discount. What was the original price?",
                        options = listOf("₱9,000", "₱10,000", "₱11,000", "₱12,000"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 23,
                        text = "A fridge originally costs ₱20,000 and has a 10% discount. What is the sale price?",
                        options = listOf("₱19,000", "₱17,000", "₱18,000", "₱16,000"),
                        correctAnswer = 2
                    ),
                    Question.MultipleChoice(
                        id = 24,
                        text = "A store is selling a computer for ₱38,400 after a 20% discount. What was the original price?",
                        options = listOf("₱46,000", "₱42,000", "₱45,000", "₱48,000"),
                        correctAnswer = 3
                    ),
                    Question.MultipleChoice(
                        id = 25,
                        text = "A sofa is originally priced at ₱15,000 and has a 12% discount. Find the discount amount and sale price.",
                        options = listOf("₱13,200", "₱11,200", "₱12,200", "₱14,200"),
                        correctAnswer = 0
                    )
                )
            ),

            // Activity 2: Solving Markup Price, Commission, Sales Tax, Simple Interest, Principal
            Activity(
                id = 2,
                quarter = 2,
                lessonNumber = 4,
                activityNumber = 2,
                title = "Solving Markup Price, Commission, Sales Tax, Simple Interest, Principal",
                type = ActivityType.MULTIPLE_CHOICE,
                questions = listOf(
                    Question.MultipleChoice(
                        id = 1,
                        text = "A bag costs ₱500.00 and the store adds a 20% markup. The selling price is ₱600.00.",
                        options = listOf("True", "False"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 2,
                        text = "A cellphone has a cost price of ₱12,000. The store marks it up by 25%. The new price is ₱15,000.",
                        options = listOf("True", "False"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 3,
                        text = "A laptop costs ₱30,000. If the store adds a 10% markup, the selling price is ₱33,000.",
                        options = listOf("True", "False"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 4,
                        text = "A shirt costs ₱400. If the markup is 15%, then the selling price is ₱400.",
                        options = listOf("True", "False"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 5,
                        text = "A grocery item costs ₱150 and is marked up by 20%. The new price becomes ₱180.",
                        options = listOf("True", "False"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 6,
                        text = "A real estate agent earns a 5% commission on a ₱2,000,000 sale. The commission is ₱100,000.",
                        options = listOf("True", "False"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 7,
                        text = "A salesperson sold ₱8,000 worth of products and earned 10% commission. The commission is ₱1,000.",
                        options = listOf("True", "False"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 8,
                        text = "An agent earns a 12% commission on a ₱25,000 sale. The commission is ₱6,000.",
                        options = listOf("True", "False"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 9,
                        text = "A car dealer earns 6% commission on a ₱1,000,000 sale. The commission is ₱60,000.",
                        options = listOf("True", "False"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 10,
                        text = "A saleslady sells ₱5,000 worth of clothes and earns 8% commission. Her commission is ₱400.",
                        options = listOf("True", "False"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 11,
                        text = "A phone costs ₱10,000 and has a 12% sales tax. The total price becomes ₱11,200.",
                        options = listOf("True", "False"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 12,
                        text = "A watch costs ₱3,500. If the sales tax is 10%, the tax amount is ₱550.",
                        options = listOf("True", "False"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 13,
                        text = "A pair of shoes costs ₱2,000. If the sales tax rate is 8%, the total price is ₱2,660.",
                        options = listOf("True", "False"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 14,
                        text = "A refrigerator costs ₱25,000 with a 12% sales tax. The total payment is ₱27,000.",
                        options = listOf("True", "False"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 15,
                        text = "A book costs ₱600 with a 5% tax rate. The total price is ₱630.",
                        options = listOf("True", "False"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 16,
                        text = "If ₱10,000 is borrowed at 5% simple interest for 2 years, the interest is ₱1,000.",
                        options = listOf("True", "False"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 17,
                        text = "A principal of ₱8,000 earns 6% simple interest in 3 years. The interest is ₱1,440.",
                        options = listOf("True", "False"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 18,
                        text = "₱5,000 earns 10% simple interest for 4 years. The total interest is ₱6,000.",
                        options = listOf("True", "False"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 19,
                        text = "A loan of ₱15,000 at 12% for 2 years earns ₱3,500 simple interest.",
                        options = listOf("True", "False"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 20,
                        text = "₱20,000 deposited at 8% for 1 year earns ₱1,800 simple interest.",
                        options = listOf("True", "False"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 21,
                        text = "The interest earned is ₱600 after 3 years at 5% per year. The principal is ₱4,000.",
                        options = listOf("True", "False"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 22,
                        text = "If ₱900 interest is earned in 2 years at 9% rate, the principal is ₱5,000.",
                        options = listOf("True", "False"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 23,
                        text = "A ₱1,200 interest is earned after 4 years at 6%. The principal was ₱7,000.",
                        options = listOf("True", "False"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 24,
                        text = "If ₱1,500 is earned as interest after 5 years at 10%, the principal was ₱3,000.",
                        options = listOf("True", "False"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 25,
                        text = "An investment earned ₱2,400 in 3 years at 8% rate. The principal is ₱10,000.",
                        options = listOf("True", "False"),
                        correctAnswer = 0
                    )
                )
            )
        )
    }

    private fun getQuarter2Lesson5Activities(): List<Activity> {
        return listOf(
            // Activity 1: Computing the Value of Numbers Expressed in Exponential Form
            Activity(
                id = 1,
                quarter = 2,
                lessonNumber = 5,
                activityNumber = 1,
                title = "Computing the Value of Numbers Expressed in Exponential Form",
                type = ActivityType.DRAG_DROP,
                questions = listOf(
                    Question.DragDrop(
                        id = 1,
                        text = "Carefully analyze the given exponent and compute. Choose the right answer from column B, and drag and drop the right answer into the box provided in column A.",
                        columnA = listOf(
                            "What is 2²?",
                            "Calculate 3²",
                            "Find the value of 4²",
                            "What is 5²?",
                            "Solve 6²",
                            "What is 7²?",
                            "Find the value of 8²",
                            "Calculate 9²",
                            "Solve 10²",
                            "What is 11²?",
                            "Find the value of 2³",
                            "Solve 3³",
                            "Calculate 4³",
                            "What is 5³?",
                            "Solve 6³",
                            "What is 2⁴?",
                            "Find the value of 3⁴",
                            "Solve 4⁴",
                            "Calculate 5⁴",
                            "What is 6⁴?",
                            "Find the value of 2⁵",
                            "Solve 3⁵",
                            "Calculate 4⁵",
                            "What is 5⁵?",
                            "Solve 6⁵"
                        ),
                        columnB = listOf(
                            "4",
                            "9",
                            "16",
                            "25",
                            "36",
                            "49",
                            "64",
                            "81",
                            "100",
                            "121",
                            "8",
                            "27",
                            "64",
                            "125",
                            "216",
                            "16",
                            "81",
                            "256",
                            "625",
                            "1,296",
                            "32",
                            "243",
                            "1,024",
                            "3,125",
                            "7,776"
                        ),
                        correctMatches = mapOf(
                            0 to 0,   // 2² = 4
                            1 to 1,   // 3² = 9
                            2 to 2,   // 4² = 16
                            3 to 3,   // 5² = 25
                            4 to 4,   // 6² = 36
                            5 to 5,   // 7² = 49
                            6 to 6,   // 8² = 64
                            7 to 7,   // 9² = 81
                            8 to 8,   // 10² = 100
                            9 to 9,   // 11² = 121
                            10 to 10, // 2³ = 8
                            11 to 11, // 3³ = 27
                            12 to 12, // 4³ = 64
                            13 to 13, // 5³ = 125
                            14 to 14, // 6³ = 216
                            15 to 15, // 2⁴ = 16
                            16 to 16, // 3⁴ = 81
                            17 to 17, // 4⁴ = 256
                            18 to 18, // 5⁴ = 625
                            19 to 19, // 6⁴ = 1,296
                            20 to 20, // 2⁵ = 32
                            21 to 21, // 3⁵ = 243
                            22 to 22, // 4⁵ = 1,024
                            23 to 23, // 5⁵ = 3,125
                            24 to 24  // 6⁵ = 7,776
                        )
                    )
                )
            ),

            // Activity 2: Describing and Giving the Value of Numbers Expressed in Exponential Form
            Activity(
                id = 2,
                quarter = 2,
                lessonNumber = 5,
                activityNumber = 2,
                title = "Describing and Giving the Value of Numbers Expressed in Exponential Form",
                type = ActivityType.MULTIPLE_CHOICE,
                questions = listOf(
                    Question.MultipleChoice(
                        id = 1,
                        text = "2 × 2 × 2 × 2 = ?",
                        options = listOf("12", "14", "16", "18"),
                        correctAnswer = 2
                    ),
                    Question.MultipleChoice(
                        id = 2,
                        text = "7 × 7 × 7 = ?",
                        options = listOf("329", "343", "357", "373"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 3,
                        text = "9 × 9 × 9 × 9 = ?",
                        options = listOf("6561", "6391", "6621", "6591"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 4,
                        text = "5 × 5 × 5 = ?",
                        options = listOf("115", "120", "125", "130"),
                        correctAnswer = 2
                    ),
                    Question.MultipleChoice(
                        id = 5,
                        text = "4 × 4 × 4 = ?",
                        options = listOf("54", "60", "64", "72"),
                        correctAnswer = 2
                    ),
                    Question.MultipleChoice(
                        id = 6,
                        text = "6 × 6 × 6 × 6 = ?",
                        options = listOf("1246", "1286", "1296", "1306"),
                        correctAnswer = 2
                    ),
                    Question.MultipleChoice(
                        id = 7,
                        text = "8 × 8 × 8 = ?",
                        options = listOf("502", "508", "512", "520"),
                        correctAnswer = 2
                    ),
                    Question.MultipleChoice(
                        id = 8,
                        text = "10 × 10 × 10 = ?",
                        options = listOf("900", "950", "1000", "1050"),
                        correctAnswer = 2
                    ),
                    Question.MultipleChoice(
                        id = 9,
                        text = "3 × 3 × 3 × 3 = ?",
                        options = listOf("71", "75", "81", "85"),
                        correctAnswer = 2
                    ),
                    Question.MultipleChoice(
                        id = 10,
                        text = "2 × 2 × 2 × 2 × 2 = ?",
                        options = listOf("28", "30", "32", "34"),
                        correctAnswer = 2
                    ),
                    Question.MultipleChoice(
                        id = 11,
                        text = "6 × 6 × 6 = ?",
                        options = listOf("216", "200", "210", "220"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 12,
                        text = "7 × 7 × 7 × 7 = ?",
                        options = listOf("2381", "2391", "2411", "2401"),
                        correctAnswer = 3
                    ),
                    Question.MultipleChoice(
                        id = 13,
                        text = "5 × 5 × 5 × 5 = ?",
                        options = listOf("600", "625", "615", "635"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 14,
                        text = "4 × 4 × 4 × 4 = ?",
                        options = listOf("260", "250", "246", "256"),
                        correctAnswer = 3
                    ),
                    Question.MultipleChoice(
                        id = 15,
                        text = "8 × 8 × 8 × 8 = ?",
                        options = listOf("4096", "4086", "4076", "4106"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 16,
                        text = "9 × 9 × 9 = ?",
                        options = listOf("719", "729", "739", "749"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 17,
                        text = "10 × 10 × 10 × 10 = ?",
                        options = listOf("9000", "9500", "10000", "10500"),
                        correctAnswer = 2
                    ),
                    Question.MultipleChoice(
                        id = 18,
                        text = "2 × 2 × 2 = ?",
                        options = listOf("8", "6", "7", "9"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 19,
                        text = "6 × 6 × 6 × 6 × 6 = ?",
                        options = listOf("7766", "7776", "7786", "7796"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 20,
                        text = "3 × 3 × 3 × 3 × 3 = ?",
                        options = listOf("243", "233", "239", "249"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 21,
                        text = "3 × 3 × 3 = ?",
                        options = listOf("25", "27", "26", "28"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 22,
                        text = "7 × 7 × 7 × 7 × 7 = ?",
                        options = listOf("16837", "16827", "16817", "16807"),
                        correctAnswer = 3
                    ),
                    Question.MultipleChoice(
                        id = 23,
                        text = "10 × 10 × 10 = ?",
                        options = listOf("1000", "900", "950", "1050"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 24,
                        text = "8 × 8 × 8 × 8 × 8 = ?",
                        options = listOf("32778", "32788", "32758", "32768"),
                        correctAnswer = 3
                    ),
                    Question.MultipleChoice(
                        id = 25,
                        text = "5 × 5 × 5 × 5 × 5 = ?",
                        options = listOf("3120", "3130", "3125", "3115"),
                        correctAnswer = 2
                    )
                )
            )
        )
    }

    private fun getQuarter2Lesson6Activities(): List<Activity> {
        return listOf(
            // Activity 1: Computing Exponents
            Activity(
                id = 1,
                quarter = 2,
                lessonNumber = 6,
                activityNumber = 1,
                title = "Computing Exponents",
                type = ActivityType.DRAG_DROP,
                questions = listOf(
                    Question.DragDrop(
                        id = 1,
                        text = "Observe the given exponents and choose the correct answer for each. Drag the correct answer to match its corresponding exponent in the space provided.",
                        columnA = listOf(
                            "What is 2²?",
                            "Calculate 2³",
                            "Find the value of 4²",
                            "What is 5²?",
                            "Solve 6²",
                            "What is 7²?",
                            "Find the value of 8²",
                            "Calculate 9²",
                            "Solve 10²",
                            "What is 11²?",
                            "Find the value of 2³",
                            "Solve 3³",
                            "Calculate 4³",
                            "What is 5³?",
                            "Solve 6³",
                            "What is 2⁴?",
                            "Find the value of 3⁴",
                            "Solve 4⁴",
                            "Calculate 5⁴",
                            "What is 6⁴?",
                            "Find the value of 2⁵",
                            "Solve 3⁵",
                            "Calculate 4⁵",
                            "What is 5⁵?",
                            "Solve 6⁵"
                        ),
                        columnB = listOf(
                            "4",
                            "8",
                            "16",
                            "25",
                            "36",
                            "49",
                            "64",
                            "81",
                            "100",
                            "121",
                            "8",
                            "27",
                            "64",
                            "125",
                            "216",
                            "16",
                            "81",
                            "256",
                            "625",
                            "1,296",
                            "32",
                            "243",
                            "1,024",
                            "3,125",
                            "7,776"
                        ),
                        correctMatches = mapOf(
                            0 to 0,   // 2² = 4
                            1 to 1,   // 2³ = 8
                            2 to 2,   // 4² = 16
                            3 to 3,   // 5² = 25
                            4 to 4,   // 6² = 36
                            5 to 5,   // 7² = 49
                            6 to 6,   // 8² = 64
                            7 to 7,   // 9² = 81
                            8 to 8,   // 10² = 100
                            9 to 9,   // 11² = 121
                            10 to 10, // 2³ = 8
                            11 to 11, // 3³ = 27
                            12 to 12, // 4³ = 64
                            13 to 13, // 5³ = 125
                            14 to 14, // 6³ = 216
                            15 to 15, // 2⁴ = 16
                            16 to 16, // 3⁴ = 81
                            17 to 17, // 4⁴ = 256
                            18 to 18, // 5⁴ = 625
                            19 to 19, // 6⁴ = 1,296
                            20 to 20, // 2⁵ = 32
                            21 to 21, // 3⁵ = 243
                            22 to 22, // 4⁵ = 1,024
                            23 to 23, // 5⁵ = 3,125
                            24 to 24  // 6⁵ = 7,776
                        )
                    )
                )
            ),

            // Activity 2: Solving Exponents with the Operation of PEMDAS
            Activity(
                id = 2,
                quarter = 2,
                lessonNumber = 6,
                activityNumber = 2,
                title = "Solving Exponents with the Operation of PEMDAS",
                type = ActivityType.MULTIPLE_CHOICE,
                questions = listOf(
                    Question.MultipleChoice(
                        id = 1,
                        text = "2 × 2 × 2 × 2 = 16",
                        options = listOf("True", "False"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 2,
                        text = "7 × 7 × 7 = 342",
                        options = listOf("True", "False"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 3,
                        text = "9 × 9 × 9 × 9 = 6,561",
                        options = listOf("True", "False"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 4,
                        text = "5 × 5 × 5 = 125",
                        options = listOf("True", "False"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 5,
                        text = "4 × 4 × 4 = 60",
                        options = listOf("True", "False"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 6,
                        text = "6 × 6 × 6 × 6 = 1,200",
                        options = listOf("True", "False"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 7,
                        text = "8 × 8 × 8 = 5,120",
                        options = listOf("True", "False"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 8,
                        text = "10 × 10 × 10 = 1,000",
                        options = listOf("True", "False"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 9,
                        text = "3 × 3 × 3 × 3 = 81",
                        options = listOf("True", "False"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 10,
                        text = "2 × 2 × 2 × 2 × 2 = 33",
                        options = listOf("True", "False"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 11,
                        text = "6 × 6 × 6 = 215",
                        options = listOf("True", "False"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 12,
                        text = "7 × 7 × 7 × 7 = 2,401",
                        options = listOf("True", "False"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 13,
                        text = "5 × 5 × 5 × 5 = 625",
                        options = listOf("True", "False"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 14,
                        text = "4 × 4 × 4 × 4 = 250",
                        options = listOf("True", "False"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 15,
                        text = "8 × 8 × 8 × 8 = 4,096",
                        options = listOf("True", "False"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 16,
                        text = "9 × 9 × 9 = 729",
                        options = listOf("True", "False"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 17,
                        text = "10 × 10 × 10 × 10 = 10,000",
                        options = listOf("True", "False"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 18,
                        text = "2 × 2 × 2 = 8",
                        options = listOf("True", "False"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 19,
                        text = "6 × 6 × 6 × 6 × 6 = 7,777",
                        options = listOf("True", "False"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 20,
                        text = "3 × 3 × 3 × 3 × 3 = 243",
                        options = listOf("True", "False"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 21,
                        text = "3 × 3 × 3 = 28",
                        options = listOf("True", "False"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 22,
                        text = "7 × 7 × 7 × 7 × 7 = 1,680",
                        options = listOf("True", "False"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 23,
                        text = "10 × 10 × 10 = 1,001",
                        options = listOf("True", "False"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 24,
                        text = "8 × 8 × 8 × 8 × 8 = 32,768",
                        options = listOf("True", "False"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 25,
                        text = "5 × 5 × 5 × 5 × 5 = 31,255",
                        options = listOf("True", "False"),
                        correctAnswer = 1
                    )
                )
            )
        )
    }

    private fun getQuarter2Lesson7Activities(): List<Activity> {
        return listOf(
            // Activity 1: Know the Integer
            Activity(
                id = 1,
                quarter = 2,
                lessonNumber = 7,
                activityNumber = 1,
                title = "Know the Integer",
                type = ActivityType.MULTIPLE_CHOICE,
                questions = listOf(
                    Question.MultipleChoice(
                        id = 1,
                        text = "34",
                        options = listOf("Positive", "Negative"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 2,
                        text = "-12",
                        options = listOf("Positive", "Negative"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 3,
                        text = "58",
                        options = listOf("Positive", "Negative"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 4,
                        text = "-7",
                        options = listOf("Positive", "Negative"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 5,
                        text = "22",
                        options = listOf("Positive", "Negative"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 6,
                        text = "-19",
                        options = listOf("Positive", "Negative"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 7,
                        text = "51",
                        options = listOf("Positive", "Negative"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 8,
                        text = "-3",
                        options = listOf("Positive", "Negative"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 9,
                        text = "11",
                        options = listOf("Positive", "Negative"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 10,
                        text = "-28",
                        options = listOf("Positive", "Negative"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 11,
                        text = "63",
                        options = listOf("Positive", "Negative"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 12,
                        text = "-14",
                        options = listOf("Positive", "Negative"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 13,
                        text = "9",
                        options = listOf("Positive", "Negative"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 14,
                        text = "-40",
                        options = listOf("Positive", "Negative"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 15,
                        text = "72",
                        options = listOf("Positive", "Negative"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 16,
                        text = "-2",
                        options = listOf("Positive", "Negative"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 17,
                        text = "37",
                        options = listOf("Positive", "Negative"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 18,
                        text = "-5",
                        options = listOf("Positive", "Negative"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 19,
                        text = "86",
                        options = listOf("Positive", "Negative"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 20,
                        text = "-31",
                        options = listOf("Positive", "Negative"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 21,
                        text = "15",
                        options = listOf("Positive", "Negative"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 22,
                        text = "-18",
                        options = listOf("Positive", "Negative"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 23,
                        text = "27",
                        options = listOf("Positive", "Negative"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 24,
                        text = "-25",
                        options = listOf("Positive", "Negative"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 25,
                        text = "44",
                        options = listOf("Positive", "Negative"),
                        correctAnswer = 0
                    )
                )
            ),

            // Activity 2: Examine if Opposite Numbers
            Activity(
                id = 2,
                quarter = 2,
                lessonNumber = 7,
                activityNumber = 2,
                title = "Examine if Opposite Numbers",
                type = ActivityType.MULTIPLE_CHOICE,
                questions = listOf(
                    Question.MultipleChoice(
                        id = 1,
                        text = "-12 + 12 = ?",
                        options = listOf("Opposite", "Not Opposite"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 2,
                        text = "8 + (-5) = ?",
                        options = listOf("Opposite", "Not Opposite"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 3,
                        text = "-7 + 7 = ?",
                        options = listOf("Opposite", "Not Opposite"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 4,
                        text = "9 + (-9) = ?",
                        options = listOf("Opposite", "Not Opposite"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 5,
                        text = "-15 + 6 = ?",
                        options = listOf("Opposite", "Not Opposite"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 6,
                        text = "22 + (-22) = ?",
                        options = listOf("Opposite", "Not Opposite"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 7,
                        text = "-5 + 2 = ?",
                        options = listOf("Opposite", "Not Opposite"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 8,
                        text = "6 + (-6) = ?",
                        options = listOf("Opposite", "Not Opposite"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 9,
                        text = "-3 + 8 = ?",
                        options = listOf("Opposite", "Not Opposite"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 10,
                        text = "18 + (-18) = ?",
                        options = listOf("Opposite", "Not Opposite"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 11,
                        text = "-10 + 3 = ?",
                        options = listOf("Opposite", "Not Opposite"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 12,
                        text = "4 + (-9) = ?",
                        options = listOf("Opposite", "Not Opposite"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 13,
                        text = "-6 + 6 = ?",
                        options = listOf("Opposite", "Not Opposite"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 14,
                        text = "15 + (-4) = ?",
                        options = listOf("Opposite", "Not Opposite"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 15,
                        text = "-17 + 17 = ?",
                        options = listOf("Opposite", "Not Opposite"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 16,
                        text = "5 + (-12) = ?",
                        options = listOf("Opposite", "Not Opposite"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 17,
                        text = "-25 + 25 = ?",
                        options = listOf("Opposite", "Not Opposite"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 18,
                        text = "11 + (-13) = ?",
                        options = listOf("Opposite", "Not Opposite"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 19,
                        text = "-30 + 30 = ?",
                        options = listOf("Opposite", "Not Opposite"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 20,
                        text = "19 + (-21) = ?",
                        options = listOf("Opposite", "Not Opposite"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 21,
                        text = "-8 + 8 = ?",
                        options = listOf("Opposite", "Not Opposite"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 22,
                        text = "7 + (-10) = ?",
                        options = listOf("Opposite", "Not Opposite"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 23,
                        text = "-4 + 4 = ?",
                        options = listOf("Opposite", "Not Opposite"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 24,
                        text = "16 + (-3) = ?",
                        options = listOf("Opposite", "Not Opposite"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 25,
                        text = "-2 + 2 = ?",
                        options = listOf("Opposite", "Not Opposite"),
                        correctAnswer = 0
                    )
                )
            )
        )
    }

    private fun getQuarter2Lesson8Activities(): List<Activity> {
        return listOf(
            // Activity 1: Integer Written As?
            Activity(
                id = 1,
                quarter = 2,
                lessonNumber = 8,
                activityNumber = 1,
                title = "Integer Written As?",
                type = ActivityType.MULTIPLE_CHOICE,
                questions = listOf(
                    Question.MultipleChoice(
                        id = 1,
                        text = "+8 is to the left of +10, written as?",
                        options = listOf("+8 > +10", "+8 = +10", "+8 < +10", "+10 < +8"),
                        correctAnswer = 2
                    ),
                    Question.MultipleChoice(
                        id = 2,
                        text = "-5 is to the left of +3, written as?",
                        options = listOf("-5 > +3", "-5 < +3", "-5 = +3", "+3 < -5"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 3,
                        text = "+7 is to the right of +4, written as?",
                        options = listOf("+7 = +4", "+7 > +4", "+4 > +7", "+7 < +4"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 4,
                        text = "-12 is to the left of -6, written as?",
                        options = listOf("-6 < -12", "-12 = -6", "-12 < -6", "-12 > -6"),
                        correctAnswer = 2
                    ),
                    Question.MultipleChoice(
                        id = 5,
                        text = "+2 is to the right of -1, written as?",
                        options = listOf("+2 < -1", "-1 > +2", "+2 > -1", "+2 = -1"),
                        correctAnswer = 2
                    ),
                    Question.MultipleChoice(
                        id = 6,
                        text = "-3 is to the left of +1, written as?",
                        options = listOf("-3 > +1", "+1 < -3", "-3 < +1", "-3 = +1"),
                        correctAnswer = 2
                    ),
                    Question.MultipleChoice(
                        id = 7,
                        text = "+15 is to the right of +10, written as?",
                        options = listOf("+15 = +10", "+10 > +15", "+15 < +10", "+15 > +10"),
                        correctAnswer = 3
                    ),
                    Question.MultipleChoice(
                        id = 8,
                        text = "-8 is to the left of -4, written as?",
                        options = listOf("-8 = -4", "-8 < -4", "-8 > -4", "-4 < -8"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 9,
                        text = "+6 is to the right of -2, written as?",
                        options = listOf("+6 > -2", "-2 > +6", "+6 = -2", "+6 < -2"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 10,
                        text = "-10 is to the left of -7, written as?",
                        options = listOf("-10 = -7", "-7 < -10", "-10 > -7", "-10 < -7"),
                        correctAnswer = 3
                    ),
                    Question.MultipleChoice(
                        id = 11,
                        text = "+20 is to the right of +17, written as?",
                        options = listOf("+20 > +17", "+20 = +17", "+20 < +17", "+17 > +20"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 12,
                        text = "-6 is to the left of +5, written as?",
                        options = listOf("-6 = +5", "-6 < +5", "-6 > +5", "+5 < -6"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 13,
                        text = "+13 is to the right of +9, written as?",
                        options = listOf("+13 > +9", "+13 < +9", "+13 = +9", "+9 > +13"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 14,
                        text = "-4 is to the left of +2, written as?",
                        options = listOf("-4 = +2", "-4 > +2", "+2 < -4", "-4 < +2"),
                        correctAnswer = 3
                    ),
                    Question.MultipleChoice(
                        id = 15,
                        text = "+11 is to the right of -3, written as?",
                        options = listOf("+11 < -3", "-3 > +11", "+11 > -3", "+11 = -3"),
                        correctAnswer = 2
                    ),
                    Question.MultipleChoice(
                        id = 16,
                        text = "-9 is to the left of -4, written as?",
                        options = listOf("-9 > -4", "-9 = -4", "-4 < -9", "-9 < -4"),
                        correctAnswer = 3
                    ),
                    Question.MultipleChoice(
                        id = 17,
                        text = "+18 is to the right of +12, written as?",
                        options = listOf("+18 = +12", "+12 > +18", "+18 > +12", "+18 < +12"),
                        correctAnswer = 2
                    ),
                    Question.MultipleChoice(
                        id = 18,
                        text = "-1 is to the left of +7, written as?",
                        options = listOf("-1 > +7", "-1 = +7", "-1 < +7", "+7 < -1"),
                        correctAnswer = 2
                    ),
                    Question.MultipleChoice(
                        id = 19,
                        text = "+5 is to the right of -5, written as?",
                        options = listOf("+5 < -5", "+5 = -5", "+5 > -5", "-5 > +5"),
                        correctAnswer = 2
                    ),
                    Question.MultipleChoice(
                        id = 20,
                        text = "-2 is to the left of +4, written as?",
                        options = listOf("-2 = +4", "-2 < +4", "-2 > +4", "+4 < -2"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 21,
                        text = "+10 is to the right of -5, written as?",
                        options = listOf("+10 < -5", "-5 > +10", "+10 = -5", "+10 > -5"),
                        correctAnswer = 3
                    ),
                    Question.MultipleChoice(
                        id = 22,
                        text = "-11 is to the left of -8, written as?",
                        options = listOf("-11 < -8", "-8 < -11", "-11 > -8", "-11 = -8"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 23,
                        text = "+3 is to the right of -6, written as?",
                        options = listOf("-6 > +3", "+3 = -6", "+3 < -6", "+3 > -6"),
                        correctAnswer = 3
                    ),
                    Question.MultipleChoice(
                        id = 24,
                        text = "-15 is to the left of +8, written as?",
                        options = listOf("-15 > +8", "-15 < +8", "-15 = +8", "+8 < -15"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 25,
                        text = "+14 is to the right of +9, written as?",
                        options = listOf("+14 > +9", "+14 < +9", "+14 = +9", "+9 > +14"),
                        correctAnswer = 0
                    )
                )
            ),

            // Activity 2: Comparison Operator
            Activity(
                id = 2,
                quarter = 2,
                lessonNumber = 8,
                activityNumber = 2,
                title = "Comparison Operator",
                type = ActivityType.MULTIPLE_CHOICE,
                questions = listOf(
                    Question.MultipleChoice(
                        id = 1,
                        text = "+25 ? +10",
                        options = listOf("+25 < +10", "+25 > +10", "+25 = +10", "+25 ≤ +10"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 2,
                        text = "-5 ? +3",
                        options = listOf("-5 > +3", "-5 < +3", "-5 = +3", "-5 ≥ +3"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 3,
                        text = "+7 ? +4",
                        options = listOf("+7 > +4", "+7 < +4", "+7 = +4", "+7 ≤ +4"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 4,
                        text = "-12 ? -6",
                        options = listOf("-12 > -6", "-12 = -6", "-12 < -6", "-12 ≥ -6"),
                        correctAnswer = 2
                    ),
                    Question.MultipleChoice(
                        id = 5,
                        text = "+2 ? -1",
                        options = listOf("+2 = -1", "+2 < -1", "+2 > -1", "+2 ≤ -1"),
                        correctAnswer = 2
                    ),
                    Question.MultipleChoice(
                        id = 6,
                        text = "-3 ? +1",
                        options = listOf("-3 < +1", "-3 > +1", "-3 = +1", "-3 ≥ +1"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 7,
                        text = "+15 ? +10",
                        options = listOf("+15 = +10", "+15 ≤ +10", "+15 < +10", "+15 > +10"),
                        correctAnswer = 3
                    ),
                    Question.MultipleChoice(
                        id = 8,
                        text = "-8 ? -4",
                        options = listOf("-8 = -4", "-8 < -4", "-8 > -4", "-8 ≥ -4"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 9,
                        text = "+6 ? -2",
                        options = listOf("+6 < -2", "+6 = -2", "+6 ≤ -2", "+6 > -2"),
                        correctAnswer = 3
                    ),
                    Question.MultipleChoice(
                        id = 10,
                        text = "-10 ? -7",
                        options = listOf("-10 < -7", "-10 > -7", "-10 = -7", "-10 ≥ -7"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 11,
                        text = "+20 ? +17",
                        options = listOf("+20 < +17", "+20 ≤ +17", "+20 = +17", "+20 > +17"),
                        correctAnswer = 3
                    ),
                    Question.MultipleChoice(
                        id = 12,
                        text = "-6 ? +5",
                        options = listOf("-6 > +5", "-6 = +5", "-6 < +5", "-6 ≥ +5"),
                        correctAnswer = 2
                    ),
                    Question.MultipleChoice(
                        id = 13,
                        text = "+13 ? +9",
                        options = listOf("+13 < +9", "+13 > +9", "+13 = +9", "+13 ≤ +9"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 14,
                        text = "-4 ? +2",
                        options = listOf("-4 = +2", "-4 ≥ +2", "-4 > +2", "-4 < +2"),
                        correctAnswer = 3
                    ),
                    Question.MultipleChoice(
                        id = 15,
                        text = "+11 ? -3",
                        options = listOf("+11 > -3", "+11 = -3", "+11 < -3", "+11 ≤ -3"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 16,
                        text = "-9 ? -4",
                        options = listOf("-9 > -4", "-9 = -4", "-9 < -4", "-9 ≥ -4"),
                        correctAnswer = 2
                    ),
                    Question.MultipleChoice(
                        id = 17,
                        text = "+18 ? +12",
                        options = listOf("+18 > +12", "+18 < +12", "+18 = +12", "+18 ≤ +12"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 18,
                        text = "-1 ? +7",
                        options = listOf("-1 = +7", "-1 ≥ +7", "-1 > +7", "-1 < +7"),
                        correctAnswer = 3
                    ),
                    Question.MultipleChoice(
                        id = 19,
                        text = "+5 ? -5",
                        options = listOf("+5 < -5", "+5 = -5", "+5 > -5", "+5 ≤ -5"),
                        correctAnswer = 2
                    ),
                    Question.MultipleChoice(
                        id = 20,
                        text = "-2 ? +4",
                        options = listOf("-2 < +4", "-2 > +4", "-2 = +4", "-2 ≥ +4"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 21,
                        text = "+10 ? -5",
                        options = listOf("+10 ≤ -5", "+10 > -5", "+10 < -5", "+10 = -5"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 22,
                        text = "-11 ? -8",
                        options = listOf("-11 = -8", "-11 ≥ -8", "-11 < -8", "-11 > -8"),
                        correctAnswer = 2
                    ),
                    Question.MultipleChoice(
                        id = 23,
                        text = "+3 ? -6",
                        options = listOf("+3 < -6", "+3 ≤ -6", "+3 > -6", "+3 = -6"),
                        correctAnswer = 2
                    ),
                    Question.MultipleChoice(
                        id = 24,
                        text = "-15 ? +8",
                        options = listOf("-15 < +8", "-15 = +8", "-15 ≥ +8", "-15 > +8"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 25,
                        text = "+14 ? +9",
                        options = listOf("+14 < +9", "+14 > +9", "+14 = +9", "+14 ≤ +9"),
                        correctAnswer = 1
                    )
                )
            )
        )
    }

    private fun getQuarter2Lesson9Activities(): List<Activity> {
        return listOf(
            // Activity 1: Adding and Subtracting Integers (Drag and Drop)
            Activity(
                id = 1,
                quarter = 2,
                lessonNumber = 9,
                activityNumber = 1,
                title = "Adding and Subtracting Integers",
                type = ActivityType.DRAG_DROP,
                questions = listOf(
                    Question.DragDrop(
                        id = 1,
                        text = "Calculate the given pair of integers, then choose the correct answer from the options provided.",
                        columnA = listOf(
                            "+12 + (-5) = ?",
                            "-8 + 6 = ?",
                            "+15 - 7 = ?",
                            "-10 + (-4) = ?",
                            "+3 + (-9) = ?",
                            "-6 - 4 = ?",
                            "+7 - (-3) = ?",
                            "-5 + 9 = ?",
                            "+20 - 13 = ?",
                            "-12 + 8 = ?",
                            "+6 + (-14) = ?",
                            "-18 + 10 = ?",
                            "+11 - (-6) = ?",
                            "-7 - 5 = ?",
                            "+9 + (-11) = ?",
                            "-3 + (-6) = ?",
                            "+4 - 15 = ?",
                            "-14 + 17 = ?",
                            "+13 - 8 = ?",
                            "-5 + (-3) = ?",
                            "+18 - (-9) = ?",
                            "-2 + 5 = ?",
                            "+8 - 12 = ?",
                            "-9 + 11 = ?",
                            "+16 + (-4) = ?"
                        ),
                        columnB = listOf(
                            "+7",
                            "-2",
                            "+8",
                            "-14",
                            "-6",
                            "-10",
                            "+10",
                            "+4",
                            "+7",
                            "-4",
                            "-8",
                            "-8",
                            "+17",
                            "-12",
                            "-2",
                            "-9",
                            "-11",
                            "+3",
                            "+5",
                            "-8",
                            "+27",
                            "+3",
                            "-4",
                            "+2",
                            "+12"
                        ),
                        correctMatches = mapOf(
                            0 to 0,   // +12 + (-5) = +7
                            1 to 1,   // -8 + 6 = -2
                            2 to 2,   // +15 - 7 = +8
                            3 to 3,   // -10 + (-4) = -14
                            4 to 4,   // +3 + (-9) = -6
                            5 to 5,   // -6 - 4 = -10
                            6 to 6,   // +7 - (-3) = +10
                            7 to 7,   // -5 + 9 = +4
                            8 to 8,   // +20 - 13 = +7
                            9 to 9,   // -12 + 8 = -4
                            10 to 10, // +6 + (-14) = -8
                            11 to 11, // -18 + 10 = -8
                            12 to 12, // +11 - (-6) = +17
                            13 to 13, // -7 - 5 = -12
                            14 to 14, // +9 + (-11) = -2
                            15 to 15, // -3 + (-6) = -9
                            16 to 16, // +4 - 15 = -11
                            17 to 17, // -14 + 17 = +3
                            18 to 18, // +13 - 8 = +5
                            19 to 19, // -5 + (-3) = -8
                            20 to 20, // +18 - (-9) = +27
                            21 to 21, // -2 + 5 = +3
                            22 to 22, // +8 - 12 = -4
                            23 to 23, // -9 + 11 = +2
                            24 to 24  // +16 + (-4) = +12
                        )
                    )
                )
            ),

            // Activity 2: Adding and Subtracting Integers (Multiple Choice)
            Activity(
                id = 2,
                quarter = 2,
                lessonNumber = 9,
                activityNumber = 2,
                title = "Adding and Subtracting Integers",
                type = ActivityType.MULTIPLE_CHOICE,
                questions = listOf(
                    Question.MultipleChoice(
                        id = 1,
                        text = "-9 + 4 = ?",
                        options = listOf("-13", "-5", "5", "3"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 2,
                        text = "6 - (-3) = ?",
                        options = listOf("3", "0", "9", "-9"),
                        correctAnswer = 2
                    ),
                    Question.MultipleChoice(
                        id = 3,
                        text = "-10 + (-7) = ?",
                        options = listOf("-17", "7", "-3", "-13"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 4,
                        text = "-2 - (-6) = ?",
                        options = listOf("4", "-8", "6", "2"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 5,
                        text = "9 + (-12) = ?",
                        options = listOf("-21", "21", "-3", "3"),
                        correctAnswer = 2
                    ),
                    Question.MultipleChoice(
                        id = 6,
                        text = "-5 - 4 = ?",
                        options = listOf("-9", "9", "-1", "-7"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 7,
                        text = "7 + (-8) = ?",
                        options = listOf("1", "-15", "-1", "8"),
                        correctAnswer = 2
                    ),
                    Question.MultipleChoice(
                        id = 8,
                        text = "-12 + 6 = ?",
                        options = listOf("18", "-6", "-18", "0"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 9,
                        text = "14 - (-5) = ?",
                        options = listOf("19", "9", "-19", "5"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 10,
                        text = "-4 + (-9) = ?",
                        options = listOf("5", "-13", "13", "-5"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 11,
                        text = "-6 - (-2) = ?",
                        options = listOf("-8", "2", "-4", "4"),
                        correctAnswer = 2
                    ),
                    Question.MultipleChoice(
                        id = 12,
                        text = "11 + (-7) = ?",
                        options = listOf("18", "4", "-4", "7"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 13,
                        text = "-15 - (-3) = ?",
                        options = listOf("-18", "-12", "12", "-3"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 14,
                        text = "-9 + (-2) = ?",
                        options = listOf("-7", "-13", "11", "2"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 15,
                        text = "5 - (-9) = ?",
                        options = listOf("-4", "14", "-14", "4"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 16,
                        text = "-8 + 3 = ?",
                        options = listOf("-11", "-5", "5", "-3"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 17,
                        text = "10 - 12 = ?",
                        options = listOf("-2", "2", "-22", "22"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 18,
                        text = "-13 + (-6) = ?",
                        options = listOf("-19", "-7", "19", "7"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 19,
                        text = "3 - (-4) = ?",
                        options = listOf("7", "-1", "-7", "1"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 20,
                        text = "-7 + (-3) = ?",
                        options = listOf("-4", "-10", "4", "10"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 21,
                        text = "6 - 10 = ?",
                        options = listOf("-16", "16", "-4", "4"),
                        correctAnswer = 2
                    ),
                    Question.MultipleChoice(
                        id = 22,
                        text = "-2 - (-5) = ?",
                        options = listOf("-3", "7", "3", "-7"),
                        correctAnswer = 2
                    ),
                    Question.MultipleChoice(
                        id = 23,
                        text = "9 + (-3) = ?",
                        options = listOf("6", "-6", "3", "-3"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 24,
                        text = "-14 + (-7) = ?",
                        options = listOf("-21", "7", "-7", "21"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 25,
                        text = "4 - (-2) = ?",
                        options = listOf("2", "6", "-6", "-2"),
                        correctAnswer = 1
                    )
                )
            )
        )
    }

    private fun getQuarter2Lesson10Activities(): List<Activity> {
        return listOf(
            // Activity 1: Computing Integers in All Operations (True or False)
            Activity(
                id = 1,
                quarter = 2,
                lessonNumber = 10,
                activityNumber = 1,
                title = "Computing Integers in All Operations",
                type = ActivityType.MULTIPLE_CHOICE,
                questions = listOf(
                    Question.MultipleChoice(
                        id = 1,
                        text = "5 + (-3) = 8",
                        options = listOf("True", "False"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 2,
                        text = "-7 + (-4) = -11",
                        options = listOf("True", "False"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 3,
                        text = "-9 + 15 = 21",
                        options = listOf("True", "False"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 4,
                        text = "12 + (-20) = -8",
                        options = listOf("True", "False"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 5,
                        text = "-5 + 5 = 10",
                        options = listOf("True", "False"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 6,
                        text = "8 - (-3) = 11",
                        options = listOf("True", "False"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 7,
                        text = "-10 - (-4) = 6",
                        options = listOf("True", "False"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 8,
                        text = "-6 - 9 = -15",
                        options = listOf("True", "False"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 9,
                        text = "0 - (-7) = -7",
                        options = listOf("True", "False"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 10,
                        text = "-3 - (-3) = 0",
                        options = listOf("True", "False"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 11,
                        text = "4 × (-2) = 8",
                        options = listOf("True", "False"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 12,
                        text = "(-6) × (-3) = 18",
                        options = listOf("True", "False"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 13,
                        text = "-5 × 7 = 35",
                        options = listOf("True", "False"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 14,
                        text = "(-9) × (-4) = 36",
                        options = listOf("True", "False"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 15,
                        text = "0 × (-12) = 12",
                        options = listOf("True", "False"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 16,
                        text = "(-12) ÷ 4 = -3",
                        options = listOf("True", "False"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 17,
                        text = "18 ÷ (-6) = 24",
                        options = listOf("True", "False"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 18,
                        text = "(-20) ÷ (-5) = 4",
                        options = listOf("True", "False"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 19,
                        text = "0 ÷ (-8) = 8",
                        options = listOf("True", "False"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 20,
                        text = "(-30) ÷ 3 = -10",
                        options = listOf("True", "False"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 21,
                        text = "5 × 2 = 7",
                        options = listOf("True", "False"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 22,
                        text = "(-4) × 3 = -12",
                        options = listOf("True", "False"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 23,
                        text = "2 + (-5) = -7",
                        options = listOf("True", "False"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 24,
                        text = "(-6) × 2 = -12",
                        options = listOf("True", "False"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 25,
                        text = "15 ÷ (-3) = 5",
                        options = listOf("True", "False"),
                        correctAnswer = 1
                    )
                )
            ),

            // Activity 2: Solve Integers in All Operations (Wire Matching)
            Activity(
                id = 2,
                quarter = 2,
                lessonNumber = 10,
                activityNumber = 2,
                title = "Solve Integers in All Operations",
                type = ActivityType.WIRE_MATCHING,
                questions = listOf(
                    Question.WireMatching(
                        id = 1,
                        text = "Calculate the given integers, select the correct answer from Column B and cross-match it with the appropriate option in Column A.",
                        columnA = listOf(
                            "6 + (-3) = ?",
                            "-7 + 5 = ?",
                            "-4 + (-8) = ?",
                            "10 + (-2) = ?",
                            "-9 + 6 = ?",
                            "5 - (-3) = ?",
                            "-6 - 4 = ?",
                            "-10 - (-2) = ?",
                            "7 - 9 = ?",
                            "-12 - (-5) = ?",
                            "(-3) × 4 = ?",
                            "6 × (-2) = ?",
                            "-5 × (-7) = ?",
                            "8 × (-3) = ?",
                            "(-9) × (-2) = ?",
                            "(-15) ÷ 3 = ?",
                            "16 ÷ (-4) = ?",
                            "(-20) ÷ (-5) = ?",
                            "30 ÷ (-6) = ?",
                            "(-12) ÷ 2 = ?",
                            "(-7) + 4 = ?",
                            "9 - (-3) = ?",
                            "(-8) × 2 = ?",
                            "(-18) ÷ (-6) = ?",
                            "5 + (-11) = ?"
                        ),
                        columnB = listOf(
                            "3",
                            "-2",
                            "-12",
                            "8",
                            "-3",
                            "8",
                            "-10",
                            "-8",
                            "-2",
                            "-7",
                            "-12",
                            "-12",
                            "35",
                            "-24",
                            "18",
                            "-5",
                            "-4",
                            "4",
                            "-5",
                            "-6",
                            "-3",
                            "12",
                            "-16",
                            "3",
                            "-6"
                        ),
                        correctMatches = mapOf(
                            0 to 0,   // 6 + (-3) = 3
                            1 to 1,   // -7 + 5 = -2
                            2 to 2,   // -4 + (-8) = -12
                            3 to 3,   // 10 + (-2) = 8
                            4 to 4,   // -9 + 6 = -3
                            5 to 5,   // 5 - (-3) = 8
                            6 to 6,   // -6 - 4 = -10
                            7 to 7,   // -10 - (-2) = -8
                            8 to 8,   // 7 - 9 = -2
                            9 to 9,   // -12 - (-5) = -7
                            10 to 10, // (-3) × 4 = -12
                            11 to 11, // 6 × (-2) = -12
                            12 to 12, // -5 × (-7) = 35
                            13 to 13, // 8 × (-3) = -24
                            14 to 14, // (-9) × (-2) = 18
                            15 to 15, // (-15) ÷ 3 = -5
                            16 to 16, // 16 ÷ (-4) = -4
                            17 to 17, // (-20) ÷ (-5) = 4
                            18 to 18, // 30 ÷ (-6) = -5
                            19 to 19, // (-12) ÷ 2 = -6
                            20 to 20, // (-7) + 4 = -3
                            21 to 21, // 9 - (-3) = 12
                            22 to 22, // (-8) × 2 = -16
                            23 to 23, // (-18) ÷ (-6) = 3
                            24 to 24  // 5 + (-11) = -6
                        )
                    )
                )
            )
        )
    }

    private fun getQuarter2Lesson11Activities(): List<Activity> {
        return listOf(
            // Activity 1: Solve Integers Involving Basic Operations (Drag and Drop)
            Activity(
                id = 1,
                quarter = 2,
                lessonNumber = 11,
                activityNumber = 1,
                title = "Solve Integers Involving Basic Operations",
                type = ActivityType.DRAG_DROP,
                questions = listOf(
                    Question.DragDrop(
                        id = 1,
                        text = "Solve the given integers and choose the correct answer by dragging and dropping it into the box provided.",
                        columnA = listOf(
                            "-5 + 8 = ?",
                            "-20 + (-15) = ?",
                            "1,200 - 450 = ?",
                            "25 + (-12) = ?",
                            "-30 + 18 = ?",
                            "-45 + (-20) = ?",
                            "72 + (-90) = ?",
                            "-150 + 250 = ?",
                            "40 - (-25) = ?",
                            "-60 - (-15) = ?",
                            "-100 - 45 = ?",
                            "85 - 120 = ?",
                            "-25 - (-75) = ?",
                            "2 × (-8) = ?",
                            "-15 × 6 = ?",
                            "-20 × 14 = ?",
                            "-25 × 25 = ?",
                            "-30 × (-30) = ?",
                            "-72 ÷ 9 = ?",
                            "-120 ÷ 12 = ?",
                            "-144 ÷ (-12) = ?",
                            "150 ÷ (-15) = ?",
                            "-96 ÷ 8 = ?",
                            "-25 + 40 - 15 = ?",
                            "60 - (-20) + (-15) = ?"
                        ),
                        columnB = listOf(
                            "3",
                            "-35",
                            "750",
                            "13",
                            "-12",
                            "-65",
                            "-18",
                            "100",
                            "65",
                            "-45",
                            "-145",
                            "-35",
                            "50",
                            "-96",
                            "-90",
                            "-280",
                            "-625",
                            "900",
                            "-8",
                            "-10",
                            "12",
                            "-10",
                            "-12",
                            "0",
                            "65"
                        ),
                        correctMatches = mapOf(
                            0 to 0,   // -5 + 8 = 3
                            1 to 1,   // -20 + (-15) = -35
                            2 to 2,   // 1,200 - 450 = 750
                            3 to 3,   // 25 + (-12) = 13
                            4 to 4,   // -30 + 18 = -12
                            5 to 5,   // -45 + (-20) = -65
                            6 to 6,   // 72 + (-90) = -18
                            7 to 7,   // -150 + 250 = 100
                            8 to 8,   // 40 - (-25) = 65
                            9 to 9,   // -60 - (-15) = -45
                            10 to 10, // -100 - 45 = -145
                            11 to 11, // 85 - 120 = -35
                            12 to 12, // -25 - (-75) = 50
                            13 to 13, // 2 × (-8) = -96
                            14 to 14, // -15 × 6 = -90
                            15 to 15, // -20 × 14 = -280
                            16 to 16, // -25 × 25 = -625
                            17 to 17, // -30 × (-30) = 900
                            18 to 18, // -72 ÷ 9 = -8
                            19 to 19, // -120 ÷ 12 = -10
                            20 to 20, // -144 ÷ (-12) = 12
                            21 to 21, // 150 ÷ (-15) = -10
                            22 to 22, // -96 ÷ 8 = -12
                            23 to 23, // -25 + 40 - 15 = 0
                            24 to 24  // 60 - (-20) + (-15) = 65
                        )
                    )
                )
            ),

            // Activity 2: Solve Integers Involving Basic Operations (Drag and Drop)
            Activity(
                id = 2,
                quarter = 2,
                lessonNumber = 11,
                activityNumber = 2,
                title = "Solve Integers Involving Basic Operations",
                type = ActivityType.DRAG_DROP,
                questions = listOf(
                    Question.DragDrop(
                        id = 1,
                        text = "Solve the given integers in Column A. Then, select the correct answer from Column B and drag it into the corresponding box in Column A.",
                        columnA = listOf(
                            "-12 + 20 = ?",
                            "-45 + 30 = ?",
                            "-150 + 100 = ?",
                            "-12 + (-8) = ?",
                            "-25 + 40 = ?",
                            "-10 - 12 = ?",
                            "80 - 120 = ?",
                            "40 - 60 = ?",
                            "-35 - (-10) = ?",
                            "-5 - (-18) = ?",
                            "-15 × 10 = ?",
                            "-25 × 6 = ?",
                            "-8 × 12 = ?",
                            "-20 × 4 = ?",
                            "30 × 5 = ?",
                            "-60 ÷ 12 = ?",
                            "-84 ÷ 7 = ?",
                            "-144 ÷ 12 = ?",
                            "-96 ÷ 8 = ?",
                            "100 ÷ 20 = ?",
                            "-50 + 70 - 20 = ?",
                            "-15 + 25 - 10 = ?",
                            "-36 + 10 = ?",
                            "-80 + 50 = ?",
                            "-10 + 15 = ?"
                        ),
                        columnB = listOf(
                            "8",
                            "-15",
                            "-50",
                            "-20",
                            "15",
                            "-22",
                            "-40",
                            "-20",
                            "-25",
                            "13",
                            "-150",
                            "-150",
                            "-96",
                            "-80",
                            "150",
                            "-5",
                            "-12",
                            "-12",
                            "-12",
                            "5",
                            "0",
                            "0",
                            "-26",
                            "-30",
                            "5"
                        ),
                        correctMatches = mapOf(
                            0 to 0,   // -12 + 20 = 8
                            1 to 1,   // -45 + 30 = -15
                            2 to 2,   // -150 + 100 = -50
                            3 to 3,   // -12 + (-8) = -20
                            4 to 4,   // -25 + 40 = 15
                            5 to 5,   // -10 - 12 = -22
                            6 to 6,   // 80 - 120 = -40
                            7 to 7,   // 40 - 60 = -20
                            8 to 8,   // -35 - (-10) = -25
                            9 to 9,   // -5 - (-18) = 13
                            10 to 10, // -15 × 10 = -150
                            11 to 11, // -25 × 6 = -150
                            12 to 12, // -8 × 12 = -96
                            13 to 13, // -20 × 4 = -80
                            14 to 14, // 30 × 5 = 150
                            15 to 15, // -60 ÷ 12 = -5
                            16 to 16, // -84 ÷ 7 = -12
                            17 to 17, // -144 ÷ 12 = -12
                            18 to 18, // -96 ÷ 8 = -12
                            19 to 19, // 100 ÷ 20 = 5
                            20 to 20, // -50 + 70 - 20 = 0
                            21 to 21, // -15 + 25 - 10 = 0
                            22 to 22, // -36 + 10 = -26
                            23 to 23, // -80 + 50 = -30
                            24 to 24  // -10 + 15 = 5
                        )
                    )
                )
            )
        )
    }

    private fun getQuarter3Lesson1Activities(): List<Activity> {
        return listOf(
            // Activity 1: Plane Figures or Solid Figures
            Activity(
                id = 1,
                quarter = 3,
                lessonNumber = 1,
                activityNumber = 1,
                title = "Examine the Figures",
                type = ActivityType.MULTIPLE_CHOICE,
                questions = listOf(
                    Question.MultipleChoice(
                        id = 1,
                        text = "Tennis Ball",
                        imageUrl = "tennis_ball",
                        options = listOf("Plane Figure", "Solid Figure"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 2,
                        text = "Basketball",
                        imageUrl = "basketball",
                        options = listOf("Plane Figure", "Solid Figure"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 3,
                        text = "Soda can",
                        imageUrl = "soda_can",
                        options = listOf("Plane Figure", "Solid Figure"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 4,
                        text = "Donut",
                        imageUrl = "donut",
                        options = listOf("Plane Figure", "Solid Figure"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 5,
                        text = "Dice",
                        imageUrl = "dice",
                        options = listOf("Plane Figure", "Solid Figure"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 6,
                        text = "Earth",
                        imageUrl = "earth",
                        options = listOf("Plane Figure", "Solid Figure"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 7,
                        text = "Cone",
                        imageUrl = "cone",
                        options = listOf("Plane Figure", "Solid Figure"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 8,
                        text = "Stop sign",
                        imageUrl = "stop_sign",
                        options = listOf("Plane Figure", "Solid Figure"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 9,
                        text = "Egg",
                        imageUrl = "egg",
                        options = listOf("Plane Figure", "Solid Figure"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 10,
                        text = "Party hat",
                        imageUrl = "party_hat",
                        options = listOf("Plane Figure", "Solid Figure"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 11,
                        text = "Dollar bill",
                        imageUrl = "dollar_bill",
                        options = listOf("Plane Figure", "Solid Figure"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 12,
                        text = "Wall Clock",
                        imageUrl = "wall_clock",
                        options = listOf("Plane Figure", "Solid Figure"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 13,
                        text = "Envelope",
                        imageUrl = "envelope",
                        options = listOf("Plane Figure", "Solid Figure"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 14,
                        text = "Coin",
                        imageUrl = "coin",
                        options = listOf("Plane Figure", "Solid Figure"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 15,
                        text = "Mirror",
                        imageUrl = "mirror",
                        options = listOf("Plane Figure", "Solid Figure"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 16,
                        text = "Kite",
                        imageUrl = "kite",
                        options = listOf("Plane Figure", "Solid Figure"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 17,
                        text = "Tissue",
                        imageUrl = "tissue",
                        options = listOf("Plane Figure", "Solid Figure"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 18,
                        text = "Hand fan",
                        imageUrl = "hand_fan",
                        options = listOf("Plane Figure", "Solid Figure"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 19,
                        text = "Decorative tile",
                        imageUrl = "decorative_tile",
                        options = listOf("Plane Figure", "Solid Figure"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 20,
                        text = "Picture frame",
                        imageUrl = "picture_frame",
                        options = listOf("Plane Figure", "Solid Figure"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 21,
                        text = "Toblerone",
                        imageUrl = "toblerone",
                        options = listOf("Plane Figure", "Solid Figure"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 22,
                        text = "The Great Pyramid of Giza",
                        imageUrl = "pyramid_giza",
                        options = listOf("Plane Figure", "Solid Figure"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 23,
                        text = "Paint can",
                        imageUrl = "paint_can",
                        options = listOf("Plane Figure", "Solid Figure"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 24,
                        text = "Gift",
                        imageUrl = "gift",
                        options = listOf("Plane Figure", "Solid Figure"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 25,
                        text = "Bottle",
                        imageUrl = "bottle",
                        options = listOf("Plane Figure", "Solid Figure"),
                        correctAnswer = 1
                    )
                )
            ),

            // Activity 2: Yes or No
            Activity(
                id = 2,
                quarter = 3,
                lessonNumber = 1,
                activityNumber = 2,
                title = "Know the Figures",
                type = ActivityType.MULTIPLE_CHOICE,
                questions = listOf(
                    Question.MultipleChoice(
                        id = 1,
                        text = "Is it a plane figure?",
                        imageUrl = "figure_activity_1",
                        options = listOf("Yes", "No"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 2,
                        text = "Is it a plane figure?",
                        imageUrl = "figure_activity_2",
                        options = listOf("Yes", "No"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 3,
                        text = "Is it a solid figure?",
                        imageUrl = "figure_activity_3",
                        options = listOf("Yes", "No"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 4,
                        text = "Is it a plane figure?",
                        imageUrl = "figure_activity_4",
                        options = listOf("Yes", "No"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 5,
                        text = "Is it a solid figure?",
                        imageUrl = "figure_activity_5",
                        options = listOf("Yes", "No"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 6,
                        text = "Is it a plane figure?",
                        imageUrl = "figure_activity_6",
                        options = listOf("Yes", "No"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 7,
                        text = "Is it a solid figure?",
                        imageUrl = "figure_activity_7",
                        options = listOf("Yes", "No"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 8,
                        text = "Is it a solid figure?",
                        imageUrl = "figure_activity_8",
                        options = listOf("Yes", "No"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 9,
                        text = "Is it a plane figure?",
                        imageUrl = "figure_activity_9",
                        options = listOf("Yes", "No"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 10,
                        text = "Is it a plane figure?",
                        imageUrl = "figure_activity_10",
                        options = listOf("Yes", "No"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 11,
                        text = "Is it a plane figure?",
                        imageUrl = "figure_activity_11",
                        options = listOf("Yes", "No"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 12,
                        text = "Is it a solid figure?",
                        imageUrl = "figure_activity_12",
                        options = listOf("Yes", "No"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 13,
                        text = "Is it a plane figure?",
                        imageUrl = "figure_activity_13",
                        options = listOf("Yes", "No"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 14,
                        text = "Is it a plane figure?",
                        imageUrl = "figure_activity_14",
                        options = listOf("Yes", "No"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 15,
                        text = "Is it a solid figure?",
                        imageUrl = "figure_activity_15",
                        options = listOf("Yes", "No"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 16,
                        text = "Is it a solid figure?",
                        imageUrl = "figure_activity_16",
                        options = listOf("Yes", "No"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 17,
                        text = "Is it a plane figure?",
                        imageUrl = "figure_activity_17",
                        options = listOf("Yes", "No"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 18,
                        text = "Is it a solid figure?",
                        imageUrl = "figure_activity_18",
                        options = listOf("Yes", "No"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 19,
                        text = "Is it a plane figure?",
                        imageUrl = "figure_activity_19",
                        options = listOf("Yes", "No"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 20,
                        text = "Is it a solid figure?",
                        imageUrl = "figure_activity_20",
                        options = listOf("Yes", "No"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 21,
                        text = "Is it a solid figure?",
                        imageUrl = "figure_activity_21",
                        options = listOf("Yes", "No"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 22,
                        text = "Is it a plane figure?",
                        imageUrl = "figure_activity_22",
                        options = listOf("Yes", "No"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 23,
                        text = "Is it a plane figure?",
                        imageUrl = "figure_activity_23",
                        options = listOf("Yes", "No"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 24,
                        text = "Is it a plane figure?",
                        imageUrl = "figure_activity_24",
                        options = listOf("Yes", "No"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 25,
                        text = "Is it a solid figure?",
                        imageUrl = "figure_activity_25",
                        options = listOf("Yes", "No"),
                        correctAnswer = 1
                    )
                )
            )
        )
    }

    private fun getQuarter3Lesson2Activities(): List<Activity> {
        return listOf(
            // Activity 1: Solving Sequence (Multiple Choice)
            Activity(
                id = 1,
                quarter = 3,
                lessonNumber = 2,
                activityNumber = 1,
                title = "Solving Sequence",
                type = ActivityType.MULTIPLE_CHOICE,
                questions = listOf(
                    Question.MultipleChoice(
                        id = 1,
                        text = "__, 5, 8, 11, 14",
                        options = listOf("0", "3", "2", "4"),
                        correctAnswer = 2
                    ),
                    Question.MultipleChoice(
                        id = 2,
                        text = "4, 9, __, 19, 24",
                        options = listOf("15", "12", "14", "11"),
                        correctAnswer = 2
                    ),
                    Question.MultipleChoice(
                        id = 3,
                        text = "7, 11, 15, 19, __",
                        options = listOf("21", "23", "25", "27"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 4,
                        text = "__, 14, 19, 24, 29",
                        options = listOf("7", "12", "9", "11"),
                        correctAnswer = 2
                    ),
                    Question.MultipleChoice(
                        id = 5,
                        text = "10, 7, 4, 1, __",
                        options = listOf("−2", "−1", "2", "0"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 6,
                        text = "3, __, 9, 11, 13",
                        options = listOf("4", "7", "5", "6"),
                        correctAnswer = 2
                    ),
                    Question.MultipleChoice(
                        id = 7,
                        text = "6, 10, 14, 18, __",
                        options = listOf("24", "22", "20", "16"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 8,
                        text = "__, 25, 20, 15, 10",
                        options = listOf("35", "20", "30", "15"),
                        correctAnswer = 2
                    ),
                    Question.MultipleChoice(
                        id = 9,
                        text = "50, 45, __, 35, 30",
                        options = listOf("38", "40", "42", "44"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 10,
                        text = "0, 3, __, 9, 12",
                        options = listOf("8", "5", "6", "4"),
                        correctAnswer = 2
                    ),
                    Question.MultipleChoice(
                        id = 11,
                        text = "3, 6, 12, 24, __",
                        options = listOf("50", "36", "48", "60"),
                        correctAnswer = 2
                    ),
                    Question.MultipleChoice(
                        id = 12,
                        text = "5, __, 20, 40, 80",
                        options = listOf("15", "12", "10", "8"),
                        correctAnswer = 2
                    ),
                    Question.MultipleChoice(
                        id = 13,
                        text = "__, 4, 16, 64, 256",
                        options = listOf("2", "1", "0", "3"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 14,
                        text = "2, 6, __, 54, 162",
                        options = listOf("24", "12", "18", "36"),
                        correctAnswer = 2
                    ),
                    Question.MultipleChoice(
                        id = 15,
                        text = "10, __, 40, 80, 160",
                        options = listOf("15", "25", "30", "20"),
                        correctAnswer = 3
                    ),
                    Question.MultipleChoice(
                        id = 16,
                        text = "__, 2, 8, 32, 128",
                        options = listOf("0.5", "1", "2.5", "0.25"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 17,
                        text = "100, 50, 25, __, 6.25",
                        options = listOf("10", "12.5", "15", "20"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 18,
                        text = "1, 2, __, 8, 16",
                        options = listOf("3", "6", "4", "5"),
                        correctAnswer = 2
                    ),
                    Question.MultipleChoice(
                        id = 19,
                        text = "__, 9, 27, 81, 243",
                        options = listOf("1", "6", "3", "0"),
                        correctAnswer = 2
                    ),
                    Question.MultipleChoice(
                        id = 20,
                        text = "8, __, 32, 64, 128",
                        options = listOf("12", "16", "24", "18"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 21,
                        text = "1, 4, 9, 16, __",
                        options = listOf("36", "30", "25", "20"),
                        correctAnswer = 2
                    ),
                    Question.MultipleChoice(
                        id = 22,
                        text = "16, 25, 36, 49, __",
                        options = listOf("64", "72", "56", "60"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 23,
                        text = "121, 144, __, 196, 225",
                        options = listOf("156", "169", "176", "180"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 24,
                        text = "9, 16, 25, 36, __",
                        options = listOf("49", "45", "40", "54"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 25,
                        text = "__, 1, 4, 9, 16",
                        options = listOf("−1", "0", "2", "3"),
                        correctAnswer = 1
                    )
                )
            ),

            // Activity 2: Complete the Sequence (Drag and Drop)
            Activity(
                id = 2,
                quarter = 3,
                lessonNumber = 2,
                activityNumber = 2,
                title = "Complete the Sequence",
                type = ActivityType.DRAG_DROP,
                questions = listOf(
                    Question.DragDrop(
                        id = 1,
                        text = "Find the missing number in the sequence, then choose the correct answer from Column B and drag it into the matching box in Column A.",
                        columnA = listOf(
                            "3, 6, 9, __, 15",
                            "10, 14, 18, __, 26",
                            "50, __, 40, 35, 30",
                            "8, 13, 18, __, 28",
                            "100, 90, 80, __, 60",
                            "2, 5, 8, __, 14",
                            "9, __, 19, 24, 29",
                            "30, 28, 26, __, 22",
                            "1, 3, 5, __, 9",
                            "20, 25, 30, __, 40",
                            "2, 4, 8, __, 32",
                            "3, 6, 12, __, 48",
                            "100, 50, 25, __, 6.25",
                            "5, 10, 20, __, 80",
                            "1, 3, 9, __, 81",
                            "4, 8, 16, __, 64",
                            "200, 100, 50, __, 12.5",
                            "1, __, 4, 8, 16",
                            "10, 20, 40, __, 160",
                            "64, 32, 16, __, 4",
                            "1, __, 9, 16, 25",
                            "4, 9, 16, __, 36",
                            "9, 16, 25, __, 49",
                            "16, 25, 36, __, 64",
                            "49, 64, 81, __, 121"
                        ),
                        columnB = listOf(
                            "12",
                            "22",
                            "45",
                            "23",
                            "70",
                            "11",
                            "14",
                            "24",
                            "7",
                            "35",
                            "16",
                            "24",
                            "12.5",
                            "40",
                            "27",
                            "32",
                            "25",
                            "2",
                            "80",
                            "8",
                            "4",
                            "25",
                            "36",
                            "49",
                            "100"
                        ),
                        correctMatches = mapOf(
                            0 to 0,   // 3, 6, 9, __, 15 = 12
                            1 to 1,   // 10, 14, 18, __, 26 = 22
                            2 to 2,   // 50, __, 40, 35, 30 = 45
                            3 to 3,   // 8, 13, 18, __, 28 = 23
                            4 to 4,   // 100, 90, 80, __, 60 = 70
                            5 to 5,   // 2, 5, 8, __, 14 = 11
                            6 to 6,   // 9, __, 19, 24, 29 = 14
                            7 to 7,   // 30, 28, 26, __, 22 = 24
                            8 to 8,   // 1, 3, 5, __, 9 = 7
                            9 to 9,   // 20, 25, 30, __, 40 = 35
                            10 to 10, // 2, 4, 8, __, 32 = 16
                            11 to 11, // 3, 6, 12, __, 48 = 24
                            12 to 12, // 100, 50, 25, __, 6.25 = 12.5
                            13 to 13, // 5, 10, 20, __, 80 = 40
                            14 to 14, // 1, 3, 9, __, 81 = 27
                            15 to 15, // 4, 8, 16, __, 64 = 32
                            16 to 16, // 200, 100, 50, __, 12.5 = 25
                            17 to 17, // 1, __, 4, 8, 16 = 2
                            18 to 18, // 10, 20, 40, __, 160 = 80
                            19 to 19, // 64, 32, 16, __, 4 = 8
                            20 to 20, // 1, __, 9, 16, 25 = 4
                            21 to 21, // 4, 9, 16, __, 36 = 25
                            22 to 22, // 9, 16, 25, __, 49 = 36
                            23 to 23, // 16, 25, 36, __, 64 = 49
                            24 to 24  // 49, 64, 81, __, 121 = 100
                        )
                    )
                )
            )
        )
    }

    private fun getQuarter3Lesson3Activities(): List<Activity> {
        return listOf(
            // Activity 1: Know Expression and Equation
            Activity(
                id = 1,
                quarter = 3,
                lessonNumber = 3,
                activityNumber = 1,
                title = "Know Expression and Equation",
                type = ActivityType.MULTIPLE_CHOICE,
                questions = listOf(
                    Question.MultipleChoice(
                        id = 1,
                        text = "3x + 5",
                        options = listOf("Expression", "Equation"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 2,
                        text = "4y - 7 = 9",
                        options = listOf("Expression", "Equation"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 3,
                        text = "2(a + 3) - 4",
                        options = listOf("Expression", "Equation"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 4,
                        text = "x² - 5x + 6 = 0",
                        options = listOf("Expression", "Equation"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 5,
                        text = "7m - 3n",
                        options = listOf("Expression", "Equation"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 6,
                        text = "10p + 2 = 5p - 8",
                        options = listOf("Expression", "Equation"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 7,
                        text = "(x + 4)(x - 2)",
                        options = listOf("Expression", "Equation"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 8,
                        text = "5x/2 - 3 = 7",
                        options = listOf("Expression", "Equation"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 9,
                        text = "√y + 6",
                        options = listOf("Expression", "Equation"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 10,
                        text = "9k - 4k + 2 = 12",
                        options = listOf("Expression", "Equation"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 11,
                        text = "a² + 2ab + b²",
                        options = listOf("Expression", "Equation"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 12,
                        text = "3(x - 2) = 15",
                        options = listOf("Expression", "Equation"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 13,
                        text = "5(2m - 4n)",
                        options = listOf("Expression", "Equation"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 14,
                        text = "y/3 + 5 = 2y - 4",
                        options = listOf("Expression", "Equation"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 15,
                        text = "12 + (3x - 1)²",
                        options = listOf("Expression", "Equation"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 16,
                        text = "8x - 2 = 3x + 7",
                        options = listOf("Expression", "Equation"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 17,
                        text = "πr²",
                        options = listOf("Expression", "Equation"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 18,
                        text = "t² - 4t + 7 = 0",
                        options = listOf("Expression", "Equation"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 19,
                        text = "(x - 3)(x + 3) - 9",
                        options = listOf("Expression", "Equation"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 20,
                        text = "x³ - 27 = 0",
                        options = listOf("Expression", "Equation"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 21,
                        text = "7(x + 2) - 5",
                        options = listOf("Expression", "Equation"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 22,
                        text = "(a + b)/2 = c",
                        options = listOf("Expression", "Equation"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 23,
                        text = "4p - 3q + 2r",
                        options = listOf("Expression", "Equation"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 24,
                        text = "2(5x - 4) = 6x + 8",
                        options = listOf("Expression", "Equation"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 25,
                        text = "5y + 3y - 2y",
                        options = listOf("Expression", "Equation"),
                        correctAnswer = 0
                    )
                )
            ),

            // Activity 2: Know Coefficient, Variable, and Constant
            Activity(
                id = 2,
                quarter = 3,
                lessonNumber = 3,
                activityNumber = 2,
                title = "Know Coefficient, Variable, and Constant",
                type = ActivityType.MULTIPLE_CHOICE,
                questions = listOf(
                    Question.MultipleChoice(
                        id = 1,
                        text = "3x + <font color='#FF6B6B'><b>5</b></font>",
                        options = listOf("Coefficient", "Variable", "Constant"),
                        correctAnswer = 2
                    ),
                    Question.MultipleChoice(
                        id = 2,
                        text = "<font color='#FF6B6B'><b>7</b></font>y + 2",
                        options = listOf("Coefficient", "Variable", "Constant"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 3,
                        text = "4a - <font color='#FF6B6B'><b>9</b></font>",
                        options = listOf("Coefficient", "Variable", "Constant"),
                        correctAnswer = 2
                    ),
                    Question.MultipleChoice(
                        id = 4,
                        text = "x² + 2x + <font color='#FF6B6B'><b>8</b></font>",
                        options = listOf("Coefficient", "Variable", "Constant"),
                        correctAnswer = 2
                    ),
                    Question.MultipleChoice(
                        id = 5,
                        text = "<font color='#FF6B6B'><b>12</b></font>m - 5n + 3",
                        options = listOf("Coefficient", "Variable", "Constant"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 6,
                        text = "8x - <font color='#FF6B6B'><b>6</b></font>",
                        options = listOf("Coefficient", "Variable", "Constant"),
                        correctAnswer = 2
                    ),
                    Question.MultipleChoice(
                        id = 7,
                        text = "<font color='#FF6B6B'><b>5</b></font>y + 10",
                        options = listOf("Coefficient", "Variable", "Constant"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 8,
                        text = "t² + <font color='#FF6B6B'><b>4</b></font>t + 9",
                        options = listOf("Coefficient", "Variable", "Constant"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 9,
                        text = "9p - 3q + <font color='#FF6B6B'><b>7</b></font>",
                        options = listOf("Coefficient", "Variable", "Constant"),
                        correctAnswer = 2
                    ),
                    Question.MultipleChoice(
                        id = 10,
                        text = "11x + 14y - <font color='#FF6B6B'><b>6</b></font>",
                        options = listOf("Coefficient", "Variable", "Constant"),
                        correctAnswer = 2
                    ),
                    Question.MultipleChoice(
                        id = 11,
                        text = "<font color='#FF6B6B'><b>2</b></font>m² + 3m + 1",
                        options = listOf("Coefficient", "Variable", "Constant"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 12,
                        text = "x³ - <font color='#FF6B6B'><b>4</b></font>x + 5",
                        options = listOf("Coefficient", "Variable", "Constant"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 13,
                        text = "<font color='#FF6B6B'><b>13</b></font>a + 7b - 2",
                        options = listOf("Coefficient", "Variable", "Constant"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 14,
                        text = "<font color='#FF6B6B'><b>r</b></font> - 8",
                        options = listOf("Coefficient", "Variable", "Constant"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 15,
                        text = "15k - 4m + <font color='#FF6B6B'><b>2</b></font>",
                        options = listOf("Coefficient", "Variable", "Constant"),
                        correctAnswer = 2
                    ),
                    Question.MultipleChoice(
                        id = 16,
                        text = "π<font color='#FF6B6B'><b>r</b></font>²",
                        options = listOf("Coefficient", "Variable", "Constant"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 17,
                        text = "<font color='#FF6B6B'><b>20</b></font>x + 5y - 9",
                        options = listOf("Coefficient", "Variable", "Constant"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 18,
                        text = "4c - 10d + <font color='#FF6B6B'><b>3</b></font>",
                        options = listOf("Coefficient", "Variable", "Constant"),
                        correctAnswer = 2
                    ),
                    Question.MultipleChoice(
                        id = 19,
                        text = "7x³ + 2x² - <font color='#FF6B6B'><b>x</b></font> + 5",
                        options = listOf("Coefficient", "Variable", "Constant"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 20,
                        text = "<font color='#FF6B6B'><b>3</b></font>x - 3y + 2z - 8",
                        options = listOf("Coefficient", "Variable", "Constant"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 21,
                        text = "3<font color='#FF6B6B'><b>a</b></font>² + 2a - 4",
                        options = listOf("Coefficient", "Variable", "Constant"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 22,
                        text = "<font color='#FF6B6B'><b>6</b></font>x - 9y + 12",
                        options = listOf("Coefficient", "Variable", "Constant"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 23,
                        text = "10m + 3n - <font color='#FF6B6B'><b>11</b></font>",
                        options = listOf("Coefficient", "Variable", "Constant"),
                        correctAnswer = 2
                    ),
                    Question.MultipleChoice(
                        id = 24,
                        text = "x² + <font color='#FF6B6B'><b>7</b></font>x + 1",
                        options = listOf("Coefficient", "Variable", "Constant"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 25,
                        text = "14p - <font color='#FF6B6B'><b>6</b></font>q + 4r - 5",
                        options = listOf("Coefficient", "Variable", "Constant"),
                        correctAnswer = 0
                    )
                )
            )
        )
    }

    private fun getQuarter3Lesson4Activities(): List<Activity> {
        return listOf(
            // Activity 1: Algebraic Equation or Expression
            Activity(
                id = 1,
                quarter = 3,
                lessonNumber = 4,
                activityNumber = 1,
                title = "Algebraic Equation or Expression",
                type = ActivityType.MULTIPLE_CHOICE,
                questions = listOf(
                    Question.MultipleChoice(
                        id = 1,
                        text = "x + 2",
                        options = listOf("Expression", "Equation"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 2,
                        text = "y − 5",
                        options = listOf("Expression", "Equation"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 3,
                        text = "3a + 4",
                        options = listOf("Expression", "Equation"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 4,
                        text = "2b − 6",
                        options = listOf("Expression", "Equation"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 5,
                        text = "5c + 10",
                        options = listOf("Expression", "Equation"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 6,
                        text = "4d − 3",
                        options = listOf("Expression", "Equation"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 7,
                        text = "e + e + 7",
                        options = listOf("Expression", "Equation"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 8,
                        text = "6f − 2f",
                        options = listOf("Expression", "Equation"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 9,
                        text = "g + 5g",
                        options = listOf("Expression", "Equation"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 10,
                        text = "10h − 4",
                        options = listOf("Expression", "Equation"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 11,
                        text = "2(x + 3)",
                        options = listOf("Expression", "Equation"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 12,
                        text = "3(y − 2)",
                        options = listOf("Expression", "Equation"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 13,
                        text = "x + 2 = 5",
                        options = listOf("Expression", "Equation"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 14,
                        text = "y − 3 = 7",
                        options = listOf("Expression", "Equation"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 15,
                        text = "3a = 9",
                        options = listOf("Expression", "Equation"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 16,
                        text = "4b + 2 = 10",
                        options = listOf("Expression", "Equation"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 17,
                        text = "5c − 1 = 14",
                        options = listOf("Expression", "Equation"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 18,
                        text = "2d + 3 = 7",
                        options = listOf("Expression", "Equation"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 19,
                        text = "6e − 2 = 10",
                        options = listOf("Expression", "Equation"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 20,
                        text = "3f + 4 = 16",
                        options = listOf("Expression", "Equation"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 21,
                        text = "g + g = 10",
                        options = listOf("Expression", "Equation"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 22,
                        text = "2h − 6 = 8",
                        options = listOf("Expression", "Equation"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 23,
                        text = "5(x + 1) = 15",
                        options = listOf("Expression", "Equation"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 24,
                        text = "3(y − 2) = 6",
                        options = listOf("Expression", "Equation"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 25,
                        text = "x + x + 4 = 10",
                        options = listOf("Expression", "Equation"),
                        correctAnswer = 1
                    )
                )
            ),

            // Activity 2: Solving Equation
            Activity(
                id = 2,
                quarter = 3,
                lessonNumber = 4,
                activityNumber = 2,
                title = "Solving Equation",
                type = ActivityType.MULTIPLE_CHOICE,
                questions = listOf(
                    Question.MultipleChoice(
                        id = 1,
                        text = "x + 8 = 15",
                        options = listOf("6", "7", "8", "9"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 2,
                        text = "y − 5 = 12",
                        options = listOf("17", "12", "10", "15"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 3,
                        text = "z + 10 = 25",
                        options = listOf("10", "15", "20", "25"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 4,
                        text = "a − 7 = 9",
                        options = listOf("12", "14", "16", "18"),
                        correctAnswer = 2
                    ),
                    Question.MultipleChoice(
                        id = 5,
                        text = "b + 6 = 20",
                        options = listOf("12", "14", "16", "18"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 6,
                        text = "c − 4 = 18",
                        options = listOf("20", "22", "24", "26"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 7,
                        text = "d + 11 = 30",
                        options = listOf("15", "18", "19", "20"),
                        correctAnswer = 2
                    ),
                    Question.MultipleChoice(
                        id = 8,
                        text = "e − 3 = 10",
                        options = listOf("10", "12", "13", "14"),
                        correctAnswer = 2
                    ),
                    Question.MultipleChoice(
                        id = 9,
                        text = "f + 9 = 21",
                        options = listOf("10", "11", "12", "13"),
                        correctAnswer = 2
                    ),
                    Question.MultipleChoice(
                        id = 10,
                        text = "g − 2 = 8",
                        options = listOf("8", "9", "10", "11"),
                        correctAnswer = 2
                    ),
                    Question.MultipleChoice(
                        id = 11,
                        text = "4x = 20",
                        options = listOf("3", "4", "5", "6"),
                        correctAnswer = 2
                    ),
                    Question.MultipleChoice(
                        id = 12,
                        text = "3y = 12",
                        options = listOf("2", "3", "4", "5"),
                        correctAnswer = 2
                    ),
                    Question.MultipleChoice(
                        id = 13,
                        text = "5z = 25",
                        options = listOf("4", "5", "6", "7"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 14,
                        text = "2a = 14",
                        options = listOf("5", "6", "7", "8"),
                        correctAnswer = 2
                    ),
                    Question.MultipleChoice(
                        id = 15,
                        text = "6b = 36",
                        options = listOf("4", "5", "6", "7"),
                        correctAnswer = 2
                    ),
                    Question.MultipleChoice(
                        id = 16,
                        text = "8c = 64",
                        options = listOf("6", "7", "8", "9"),
                        correctAnswer = 2
                    ),
                    Question.MultipleChoice(
                        id = 17,
                        text = "7d = 49",
                        options = listOf("5", "6", "7", "8"),
                        correctAnswer = 2
                    ),
                    Question.MultipleChoice(
                        id = 18,
                        text = "x ÷ 2 = 10",
                        options = listOf("10", "15", "20", "25"),
                        correctAnswer = 2
                    ),
                    Question.MultipleChoice(
                        id = 19,
                        text = "y ÷ 3 = 6",
                        options = listOf("10", "12", "18", "20"),
                        correctAnswer = 2
                    ),
                    Question.MultipleChoice(
                        id = 20,
                        text = "z ÷ 4 = 8",
                        options = listOf("16", "24", "28", "32"),
                        correctAnswer = 3
                    ),
                    Question.MultipleChoice(
                        id = 21,
                        text = "a ÷ 5 = 7",
                        options = listOf("25", "30", "35", "40"),
                        correctAnswer = 2
                    ),
                    Question.MultipleChoice(
                        id = 22,
                        text = "b ÷ 6 = 9",
                        options = listOf("45", "50", "54", "60"),
                        correctAnswer = 2
                    ),
                    Question.MultipleChoice(
                        id = 23,
                        text = "2x + 3 = 11",
                        options = listOf("2", "3", "4", "5"),
                        correctAnswer = 2
                    ),
                    Question.MultipleChoice(
                        id = 24,
                        text = "3y − 2 = 13",
                        options = listOf("3", "4", "5", "6"),
                        correctAnswer = 2
                    ),
                    Question.MultipleChoice(
                        id = 25,
                        text = "5z + 4 = 29",
                        options = listOf("4", "5", "6", "7"),
                        correctAnswer = 1
                    )
                )
            )
        )
    }

    private fun getQuarter3Lesson5Activities(): List<Activity> {
        return listOf(
            // Activity 1: Computing the Speed
            Activity(
                id = 1,
                quarter = 3,
                lessonNumber = 5,
                activityNumber = 1,
                title = "Computing the Speed",
                type = ActivityType.MULTIPLE_CHOICE,
                questions = listOf(
                    Question.MultipleChoice(
                        id = 1,
                        text = "A computer processes 240 files in 4 minutes. What is its processing speed per minute?",
                        options = listOf("30 files per minute", "60 files per minute", "80 files per minute", "100 files per minute"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 2,
                        text = "A processor completes 18,000 instructions in 3 seconds. What is its speed in instructions per second?",
                        options = listOf("3,000", "4,500", "6,000", "9,000"),
                        correctAnswer = 2
                    ),
                    Question.MultipleChoice(
                        id = 3,
                        text = "The download speed is 50 Mbps. How many megabits can it download in 12 seconds?",
                        options = listOf("300", "450", "600", "900"),
                        correctAnswer = 2
                    ),
                    Question.MultipleChoice(
                        id = 4,
                        text = "A CPU has a clock speed of 3.2 GHz. How many cycles does it complete in 5 seconds?",
                        options = listOf("8 billion", "12 billion", "16 billion", "20 billion"),
                        correctAnswer = 2
                    ),
                    Question.MultipleChoice(
                        id = 5,
                        text = "A printer prints 1,200 pages in 10 minutes. What is its printing speed per minute?",
                        options = listOf("80 pages", "100 pages", "120 pages", "140 pages"),
                        correctAnswer = 2
                    ),
                    Question.MultipleChoice(
                        id = 6,
                        text = "A supercomputer performs 10 quadrillion calculations in 5 seconds. What is its speed in calculations per second?",
                        options = listOf("1 quadrillion", "2 quadrillion", "3 quadrillion", "4 quadrillion"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 7,
                        text = "A WiFi router transfers data at 1.2 Gbps. How much data is transferred in 30 seconds?",
                        options = listOf("24 gigabits", "30 gigabits", "36 gigabits", "42 gigabits"),
                        correctAnswer = 2
                    ),
                    Question.MultipleChoice(
                        id = 8,
                        text = "A server handles 3,600 requests in an hour. What is its request-handling speed per minute?",
                        options = listOf("30 requests", "45 requests", "60 requests", "75 requests"),
                        correctAnswer = 2
                    ),
                    Question.MultipleChoice(
                        id = 9,
                        text = "A mobile processor runs at 2.5 GHz. How many cycles does it complete in 2 seconds?",
                        options = listOf("2 billion", "3 billion", "4 billion", "5 billion"),
                        correctAnswer = 3
                    ),
                    Question.MultipleChoice(
                        id = 10,
                        text = "A graphics card processes 4.5 teraflops in 3 seconds. What is its speed in teraflops per second?",
                        options = listOf("0.5", "1.5", "2.5", "3.5"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 11,
                        text = "A fiber internet connection has a speed of 200 Mbps. How much data is downloaded in 20 seconds?",
                        options = listOf("2,000 megabits", "3,000 megabits", "4,000 megabits", "5,000 megabits"),
                        correctAnswer = 2
                    ),
                    Question.MultipleChoice(
                        id = 12,
                        text = "A hard drive transfers data at 150 MBps. How much data is transferred in 8 seconds?",
                        options = listOf("600 MB", "900 MB", "1,200 MB", "1,500 MB"),
                        correctAnswer = 2
                    ),
                    Question.MultipleChoice(
                        id = 13,
                        text = "A website loads in 2.5 seconds. If it takes 50 milliseconds to load each element, how many elements does it have?",
                        options = listOf("30", "40", "50", "60"),
                        correctAnswer = 2
                    ),
                    Question.MultipleChoice(
                        id = 14,
                        text = "A cloud storage syncs 10 GB in 40 seconds. What is its speed in MB per second?",
                        options = listOf("128 MB/s", "192 MB/s", "256 MB/s", "320 MB/s"),
                        correctAnswer = 2
                    ),
                    Question.MultipleChoice(
                        id = 15,
                        text = "A data center processes 5 petabytes of data in 25 minutes. What is its processing speed per minute?",
                        options = listOf("0.1 PB", "0.2 PB", "0.3 PB", "0.4 PB"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 16,
                        text = "A laptop battery drains 10% every 15 minutes. How long will it take to fully drain?",
                        options = listOf("2 hours", "2.5 hours", "3 hours", "3.5 hours"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 17,
                        text = "A factory produces 500 microchips in 4 hours. What is its production speed per hour?",
                        options = listOf("100", "125", "150", "175"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 18,
                        text = "A web server responds to 6,000 requests in 10 minutes. What is its speed in requests per second?",
                        options = listOf("5", "10", "15", "20"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 19,
                        text = "A robot completes 300 tasks in 25 minutes. What is its task speed per minute?",
                        options = listOf("10", "12", "15", "18"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 20,
                        text = "A 4K video file is 8 GB, and the internet speed is 32 Mbps. How long will it take to download?",
                        options = listOf("30 minutes", "33.3 minutes", "36 minutes", "40 minutes"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 21,
                        text = "A software runs a complex simulation in 3 hours. How many minutes does it take?",
                        options = listOf("150", "160", "170", "180"),
                        correctAnswer = 3
                    ),
                    Question.MultipleChoice(
                        id = 22,
                        text = "A gaming console runs at 120 FPS. How many frames does it render in 30 seconds?",
                        options = listOf("2,600", "3,000", "3,600", "4,200"),
                        correctAnswer = 2
                    ),
                    Question.MultipleChoice(
                        id = 23,
                        text = "A digital camera captures 15 pictures per second. How many pictures are taken in 10 minutes?",
                        options = listOf("6,000", "7,500", "9,000", "10,500"),
                        correctAnswer = 2
                    ),
                    Question.MultipleChoice(
                        id = 24,
                        text = "A drone flies at 25 m/s. How far does it travel in 3 minutes?",
                        options = listOf("3,000 meters", "4,000 meters", "4,500 meters", "5,000 meters"),
                        correctAnswer = 2
                    ),
                    Question.MultipleChoice(
                        id = 25,
                        text = "A coding algorithm sorts 5 million data points in 10 seconds. What is its sorting speed per second?",
                        options = listOf("200,000", "400,000", "500,000", "600,000"),
                        correctAnswer = 2
                    )
                )
            ),

            // Activity 2: Speed, Distance, and Time
            Activity(
                id = 2,
                quarter = 3,
                lessonNumber = 5,
                activityNumber = 2,
                title = "Speed, Distance, and Time",
                type = ActivityType.MULTIPLE_CHOICE,
                questions = listOf(
                    Question.MultipleChoice(
                        id = 1,
                        text = "The car traveled <font color='#FF6B6B'><b>200 km</b></font> before reaching its destination.",
                        options = listOf("Speed", "Distance", "Time"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 2,
                        text = "The airplane flew at a speed of <font color='#FF6B6B'><b>800 km/h</b></font>.",
                        options = listOf("Speed", "Distance", "Time"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 3,
                        text = "It took <font color='#FF6B6B'><b>3 hours</b></font> to finish the road trip.",
                        options = listOf("Speed", "Distance", "Time"),
                        correctAnswer = 2
                    ),
                    Question.MultipleChoice(
                        id = 4,
                        text = "A train covers <font color='#FF6B6B'><b>500 km</b></font> in 5 hours.",
                        options = listOf("Speed", "Distance", "Time"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 5,
                        text = "The bus moves at a speed of <font color='#FF6B6B'><b>60 km/h</b></font>.",
                        options = listOf("Speed", "Distance", "Time"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 6,
                        text = "The runner completed the marathon in <font color='#FF6B6B'><b>4 hours</b></font>.",
                        options = listOf("Speed", "Distance", "Time"),
                        correctAnswer = 2
                    ),
                    Question.MultipleChoice(
                        id = 7,
                        text = "The cyclist traveled <font color='#FF6B6B'><b>30 km</b></font> in one hour.",
                        options = listOf("Speed", "Distance", "Time"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 8,
                        text = "The boat sails at a speed of <font color='#FF6B6B'><b>40 km/h</b></font>.",
                        options = listOf("Speed", "Distance", "Time"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 9,
                        text = "The journey lasted <font color='#FF6B6B'><b>2 hours and 30 minutes</b></font>.",
                        options = listOf("Speed", "Distance", "Time"),
                        correctAnswer = 2
                    ),
                    Question.MultipleChoice(
                        id = 10,
                        text = "The spaceship traveled <font color='#FF6B6B'><b>500,000 km</b></font> in space.",
                        options = listOf("Speed", "Distance", "Time"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 11,
                        text = "The cheetah can run at a speed of <font color='#FF6B6B'><b>120 km/h</b></font>.",
                        options = listOf("Speed", "Distance", "Time"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 12,
                        text = "The train reached the station in <font color='#FF6B6B'><b>45 minutes</b></font>.",
                        options = listOf("Speed", "Distance", "Time"),
                        correctAnswer = 2
                    ),
                    Question.MultipleChoice(
                        id = 13,
                        text = "The rocket covered <font color='#FF6B6B'><b>300 km</b></font> in just a few seconds.",
                        options = listOf("Speed", "Distance", "Time"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 14,
                        text = "The truck moves at a constant speed of <font color='#FF6B6B'><b>70 km/h</b></font>.",
                        options = listOf("Speed", "Distance", "Time"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 15,
                        text = "The trip from Manila to Baguio takes <font color='#FF6B6B'><b>6 hours</b></font>.",
                        options = listOf("Speed", "Distance", "Time"),
                        correctAnswer = 2
                    ),
                    Question.MultipleChoice(
                        id = 16,
                        text = "The drone can travel <font color='#FF6B6B'><b>20 km</b></font> on a full charge.",
                        options = listOf("Speed", "Distance", "Time"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 17,
                        text = "The sprinter's speed is <font color='#FF6B6B'><b>36 km/h</b></font> in short races.",
                        options = listOf("Speed", "Distance", "Time"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 18,
                        text = "The turtle took <font color='#FF6B6B'><b>5 hours</b></font> to cross the road.",
                        options = listOf("Speed", "Distance", "Time"),
                        correctAnswer = 2
                    ),
                    Question.MultipleChoice(
                        id = 19,
                        text = "The horse galloped <font color='#FF6B6B'><b>15 km</b></font> across the field.",
                        options = listOf("Speed", "Distance", "Time"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 20,
                        text = "The delivery van maintains a speed of <font color='#FF6B6B'><b>50 km/h</b></font>.",
                        options = listOf("Speed", "Distance", "Time"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 21,
                        text = "The ship sailed <font color='#FF6B6B'><b>400 km</b></font> across the ocean.",
                        options = listOf("Speed", "Distance", "Time"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 22,
                        text = "The race lasted <font color='#FF6B6B'><b>2 hours and 15 minutes</b></font>.",
                        options = listOf("Speed", "Distance", "Time"),
                        correctAnswer = 2
                    ),
                    Question.MultipleChoice(
                        id = 23,
                        text = "The athlete's speed was <font color='#FF6B6B'><b>10 m/s</b></font> during the sprint.",
                        options = listOf("Speed", "Distance", "Time"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 24,
                        text = "The taxi traveled <font color='#FF6B6B'><b>18 km</b></font> before stopping.",
                        options = listOf("Speed", "Distance", "Time"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 25,
                        text = "The bus ride took <font color='#FF6B6B'><b>30 minutes</b></font> to reach the terminal.",
                        options = listOf("Speed", "Distance", "Time"),
                        correctAnswer = 2
                    )
                )
            )
        )
    }

    private fun getQuarter3Lesson6Activities(): List<Activity> {
        return listOf(
            // Activity 1: Find the Area
            Activity(
                id = 1,
                quarter = 3,
                lessonNumber = 6,
                activityNumber = 1,
                title = "Find the Area",
                type = ActivityType.MULTIPLE_CHOICE,
                questions = listOf(
                    Question.MultipleChoice(
                        id = 1,
                        text = "A rectangular playground is 30 m long and 15 m wide. Find the area of the playground.",
                        options = listOf("350 m²", "500 m²", "450 m²", "400 m²"),
                        correctAnswer = 2
                    ),
                    Question.MultipleChoice(
                        id = 2,
                        text = "A rectangular garden is 12 m long and 8 m wide. What is the area of the garden?",
                        options = listOf("80 m²", "96 m²", "100 m²", "120 m²"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 3,
                        text = "A 40 m × 25 m parking lot has an additional 3-meter-wide lane built around it. Calculate the area of the parking lot.",
                        options = listOf("1100 m²", "950 m²", "1000 m²", "1200 m²"),
                        correctAnswer = 2
                    ),
                    Question.MultipleChoice(
                        id = 4,
                        text = "A basketball court is 28 m long and 15 m wide. Find the area of the basketball court.",
                        options = listOf("380 m²", "420 m²", "450 m²", "400 m²"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 5,
                        text = "A rectangular swimming pool is 20 m × 10 m. What is the area of the swimming pool?",
                        options = listOf("150 m²", "180 m²", "200 m²", "250 m²"),
                        correctAnswer = 2
                    ),
                    Question.MultipleChoice(
                        id = 6,
                        text = "A 50 m × 35 m library has a 2-meter-wide garden path around it. Find the area of the path.",
                        options = listOf("1700 m²", "1750 m²", "1800 m²", "1600 m²"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 7,
                        text = "A sports field is 60 m × 40 m. Calculate the area of the sports field.",
                        options = listOf("2600 m²", "2200 m²", "2400 m²", "2000 m²"),
                        correctAnswer = 2
                    ),
                    Question.MultipleChoice(
                        id = 8,
                        text = "A house covers an area of 25 m × 18 m. What is the area of the house?",
                        options = listOf("450 m²", "400 m²", "500 m²", "425 m²"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 9,
                        text = "A concert stage measures 15 m × 10 m. Find the area of the concert stage.",
                        options = listOf("150 m²", "200 m²", "125 m²", "175 m²"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 10,
                        text = "A school building is 80 m × 50 m. Find the area of the school building.",
                        options = listOf("4200 m²", "5000 m²", "4000 m²", "3500 m²"),
                        correctAnswer = 2
                    ),
                    Question.MultipleChoice(
                        id = 11,
                        text = "A football field is 100 m × 50 m. What is the area of the football field?",
                        options = listOf("4500 m²", "6000 m²", "5000 m²", "5500 m²"),
                        correctAnswer = 2
                    ),
                    Question.MultipleChoice(
                        id = 12,
                        text = "A 30 m × 20 m playground has a 2-meter-wide sand pit around it. Find the area of the playground.",
                        options = listOf("600 m²", "700 m²", "550 m²", "650 m²"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 13,
                        text = "A tennis court is 23 m × 10 m. Find the area of the tennis court.",
                        options = listOf("250 m²", "200 m²", "230 m²", "220 m²"),
                        correctAnswer = 2
                    ),
                    Question.MultipleChoice(
                        id = 14,
                        text = "A 50 m × 30 m parking lot has a 3-meter-wide driveway around it. Find the area of the parking lot.",
                        options = listOf("1400 m²", "1600 m²", "1500 m²", "1700 m²"),
                        correctAnswer = 2
                    ),
                    Question.MultipleChoice(
                        id = 15,
                        text = "A 25 m × 15 m garden has a 1.5-meter-wide brick pathway around it. Find the area of the garden.",
                        options = listOf("375 m²", "400 m²", "350 m²", "325 m²"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 16,
                        text = "A rectangular pond is 40 m × 18 m. Find the area of the rectangular pond.",
                        options = listOf("720 m²", "700 m²", "750 m²", "800 m²"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 17,
                        text = "A schoolyard is 60 m × 35 m. Find the area of the schoolyard.",
                        options = listOf("2200 m²", "2000 m²", "2100 m²", "2400 m²"),
                        correctAnswer = 2
                    ),
                    Question.MultipleChoice(
                        id = 18,
                        text = "A 90 m × 60 m soccer field has a 5-meter-wide spectator area around it. Find the area of the soccer field.",
                        options = listOf("5400 m²", "5200 m²", "5600 m²", "5000 m²"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 19,
                        text = "A backyard is 20 m × 12 m. Find the area of the backyard.",
                        options = listOf("200 m²", "220 m²", "240 m²", "260 m²"),
                        correctAnswer = 2
                    ),
                    Question.MultipleChoice(
                        id = 20,
                        text = "A museum is 45 m × 28 m. Find the area of the museum.",
                        options = listOf("1280 m²", "1260 m²", "1300 m²", "1200 m²"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 21,
                        text = "A basketball court is 28 m × 15 m. Find the area of the basketball court.",
                        options = listOf("400 m²", "420 m²", "390 m²", "440 m²"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 22,
                        text = "A library is 35 m × 22 m. Find the area of the library.",
                        options = listOf("800 m²", "750 m²", "770 m²", "780 m²"),
                        correctAnswer = 2
                    ),
                    Question.MultipleChoice(
                        id = 23,
                        text = "A house measures 20 m × 18 m. Find the area of the house.",
                        options = listOf("380 m²", "400 m²", "360 m²", "350 m²"),
                        correctAnswer = 2
                    ),
                    Question.MultipleChoice(
                        id = 24,
                        text = "A rectangular fountain is 12 m × 8 m. Find the area of the rectangular fountain.",
                        options = listOf("100 m²", "96 m²", "110 m²", "120 m²"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 25,
                        text = "A dining hall measures 40 m × 25 m. Find the area of the dining hall.",
                        options = listOf("1000 m²", "1200 m²", "1100 m²", "900 m²"),
                        correctAnswer = 0
                    )
                )
            ),

            // Activity 2: Routine and Non-Routine Problems - Any Operations including Decimals, Whole Numbers and Money (Video-based)
//            Activity(
//                id = 2,
//                quarter = 3,
//                lessonNumber = 6,
//                activityNumber = 2,
//                title = "Routine or Non-routine Problems Involving Any of the Operations Including any Decimals, Whole Numbers and Money",
//                type = ActivityType.ROUTINE_PROBLEM,
//                questions = listOf(
//                    Question.RoutineProblem(
//                        id = 1,
//                        text = "",
//                        videoFileName = "activity_1-n1.mp4",
//                        description = "Routine or Non-routine Problems Involving Any of the Operations Including any Decimals, Whole Numbers and Money"
//                    ),
//                    Question.RoutineProblem(
//                        id = 2,
//                        text = "",
//                        videoFileName = "activity_1-n2.mp4",
//                        description = "Routine or Non-routine Problems Involving Any of the Operations Including any Decimals, Whole Numbers and Money"
//                    ),
//                )
//            ),
        )
    }
}