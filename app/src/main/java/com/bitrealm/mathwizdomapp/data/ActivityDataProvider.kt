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
            "3_7" -> getQuarter3Lesson7Activities()
            "3_8" -> getQuarter3Lesson8Activities()

            // ----------- QUARTER 4 -----------
            "4_1" -> getQuarter4Lesson1Activities()
            "4_2" -> getQuarter4Lesson2Activities()
            "4_3" -> getQuarter4Lesson3Activities()
            "4_4" -> getQuarter4Lesson4Activities()
            "4_5" -> getQuarter4Lesson5Activities()
            "4_6" -> getQuarter4Lesson6Activities()
            "4_7" -> getQuarter4Lesson7Activities()
            "4_8" -> getQuarter4Lesson8Activities()
            "4_9" -> getQuarter4Lesson9Activities()

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
                        text = "1⁄2 and 1⁄4",
                        options = listOf("Similar", "Dissimilar"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 2,
                        text = "2⁄3 and 2⁄6",
                        options = listOf("Similar", "Dissimilar"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 3,
                        text = "5⁄6 and 1⁄3",
                        options = listOf("Similar", "Dissimilar"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 4,
                        text = "2⁄5 and 3/10",
                        options = listOf("Similar", "Dissimilar"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 5,
                        text = "32⁄3 and 61⁄6",
                        options = listOf("Similar", "Dissimilar"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 6,
                        text = "8⁄11 and 5⁄6",
                        options = listOf("Similar", "Dissimilar"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 7,
                        text = "6⁄15 and 7⁄8",
                        options = listOf("Similar", "Dissimilar"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 8,
                        text = "4⁄6 and 4⁄5",
                        options = listOf("Similar", "Dissimilar"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 9,
                        text = "9⁄10 and 2⁄3",
                        options = listOf("Similar", "Dissimilar"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 10,
                        text = "7⁄14 and 2⁄3",
                        options = listOf("Similar", "Dissimilar"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 11,
                        text = "3⁄8 and 5⁄12",
                        options = listOf("Similar", "Dissimilar"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 12,
                        text = "1⁄9 and 2⁄7",
                        options = listOf("Similar", "Dissimilar"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 13,
                        text = "4⁄11 and 3⁄13",
                        options = listOf("Similar", "Dissimilar"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 14,
                        text = "21⁄4 and 32⁄5",
                        options = listOf("Similar", "Dissimilar"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 15,
                        text = "53⁄7 and 21⁄9",
                        options = listOf("Similar", "Dissimilar"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 16,
                        text = "21⁄3 and 12⁄3",
                        options = listOf("Similar", "Dissimilar"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 17,
                        text = "3⁄5 and 2⁄5",
                        options = listOf("Similar", "Dissimilar"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 18,
                        text = "11⁄2 and 21⁄2",
                        options = listOf("Similar", "Dissimilar"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 19,
                        text = "31⁄4 and 23⁄4",
                        options = listOf("Similar", "Dissimilar"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 20,
                        text = "51⁄2 and 21⁄2",
                        options = listOf("Similar", "Dissimilar"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 21,
                        text = "4⁄7 and 3⁄7",
                        options = listOf("Similar", "Dissimilar"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 22,
                        text = "1⁄8 and 3⁄8",
                        options = listOf("Similar", "Dissimilar"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 23,
                        text = "41⁄3 and 32⁄3",
                        options = listOf("Similar", "Dissimilar"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 24,
                        text = "1⁄2 and 1⁄8",
                        options = listOf("Similar", "Dissimilar"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 25,
                        text = "22⁄5 and 13⁄5",
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
                            "1⁄10 + 9⁄10 =",
                            "2⁄5 + 1⁄5 =",
                            "3⁄8 + 2⁄8 =",
                            "1⁄4 + 2⁄4 =",
                            "2⁄7 + 3⁄7 =",
                            "4⁄9 + 2⁄9 =",
                            "1⁄6 + 4⁄6 =",
                            "3⁄10 + 5⁄10 =",
                            "2⁄12 + 7⁄12 =",
                            "5⁄8 - 1⁄8 =",
                            "7⁄10 - 3⁄10 =",
                            "8⁄9 - 2⁄9 =",
                            "5⁄6 - 1⁄6 =",
                            "9⁄12 - 4⁄12 =",
                            "6⁄7 - 2⁄7 =",
                            "21⁄4 + 12⁄4 =",
                            "32⁄5 + 21⁄5 =",
                            "41⁄3 + 22⁄3 =",
                            "52⁄6 + 13⁄6 =",
                            "33⁄8 + 24⁄8 =",
                            "44⁄5 - 21⁄5 =",
                            "65⁄7 - 32⁄7 =",
                            "57⁄9 - 23⁄9 =",
                            "75⁄10 - 42⁄10 =",
                            "86⁄12 - 34⁄12 ="
                        ),
                        columnB = listOf(
                            "1",          // #1: 1/10 + 9/10
                            "3⁄5",        // #2: 2/5 + 1/5
                            "5⁄8",        // #3: 3/8 + 2/8
                            "3⁄4",        // #4: 1/4 + 2/4 (FIRST instance)
                            "5⁄7",        // #5: 2/7 + 3/7
                            "2⁄3",        // #6: 4/9 + 2/9 (FIRST instance)
                            "5⁄6",        // #7: 1/6 + 4/6
                            "4⁄5",        // #8: 3/10 + 5/10
                            "3⁄4",        // #9: 2/12 + 7/12 (SECOND instance of 3/4)
                            "1⁄2",        // #10: 5/8 - 1/8
                            "2⁄5",        // #11: 7/10 - 3/10
                            "2⁄3",        // #12: 8/9 - 2/9 (SECOND instance of 2/3)
                            "2⁄3",        // #13: 5/6 - 1/6 (THIRD instance of 2/3)
                            "5⁄12",       // #14: 9/12 - 4/12
                            "4⁄7",        // #15: 6/7 - 2/7
                            "33⁄4",      // #16: 2 1/4 + 1 2/4
                            "53⁄5",      // #17: 3 2/5 + 2 1/5
                            "7",          // #18: 4 1/3 + 2 2/3
                            "65⁄6",      // #19: 5 2/6 + 1 3/6
                            "57⁄8",      // #20: 3 3/8 + 2 4/8
                            "23⁄5",      // #21: 4 4/5 - 2 1/5
                            "33⁄7",      // #22: 6 5/7 - 3 2/7
                            "34⁄9",      // #23: 5 7/9 - 2 3/9
                            "33⁄10",     // #24: 7 5/10 - 4 2/10
                            "52⁄12"      // #25: 8 6/12 - 3 4/12
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

            // Activity 3: Addition and Subtraction Wire Matching
            Activity(
                id = 3,
                quarter = 1,
                lessonNumber = 1,
                activityNumber = 3,
                title = "Addition and Subtraction of Similar Fractions",
                type = ActivityType.WIRE_MATCHING,
                questions = listOf(
                    Question.WireMatching(
                        id = 1,
                        text = "Solve the fractions in Column A and match them with the correct answers in Column B by drawing a line.",
                        columnA = listOf(
                            "1⁄8 + 5⁄8 =",
                            "3⁄5 + 1⁄5 =",
                            "2⁄9 + 4⁄9 =",
                            "1⁄4 + 1⁄4 =",
                            "3⁄11 + 5⁄11 =",
                            "1⁄6 + 1⁄6 =",
                            "3⁄8 + 1⁄8 =",
                            "2⁄5 + 2⁄5 =",
                            "5⁄12 + 7⁄12 =",
                            "3⁄10 + 7⁄10 =",
                            "7⁄8 - 3⁄8 =",
                            "5⁄6 - 2⁄6 =",
                            "7⁄9 - 2⁄9 =",
                            "11⁄12 - 5⁄12 =",
                            "9⁄10 - 3⁄10 =",
                            "11⁄2 + 21⁄2 =",
                            "32⁄3 + 11⁄3 =",
                            "43⁄5 + 21⁄5 =",
                            "53⁄4 + 11⁄4 =",
                            "25⁄6 + 31⁄6 =",
                            "67⁄8 - 23⁄8 =",
                            "82⁄3 - 31⁄3 =",
                            "74⁄5 - 41⁄5 =",
                            "93⁄4 - 51⁄4 =",
                            "105⁄6 - 61⁄6 ="
                        ),
                        columnB = listOf(
                            "3⁄4",        // #1: 1/8 + 5/8
                            "4⁄5",        // #2: 3/5 + 1/5
                            "2⁄3",        // #3: 2/9 + 4/9
                            "1⁄2",        // #4: 1/4 + 1/4
                            "8⁄11",       // #5: 3/11 + 5/11
                            "1⁄3",        // #6: 1/6 + 1/6
                            "1⁄2",        // #7: 3/8 + 1/8
                            "4⁄5",        // #8: 2/5 + 2/5
                            "1",          // #9: 5/12 + 7/12
                            "1",          // #10: 3/10 + 7/10
                            "1⁄2",        // #11: 7/8 - 3/8
                            "1⁄2",        // #12: 5/6 - 2/6
                            "5⁄9",        // #13: 7/9 - 2/9
                            "1⁄2",        // #14: 11/12 - 5/12
                            "3⁄5",        // #15: 9/10 - 3/10
                            "4",          // #16: 1 1/2 + 2 1/2
                            "5",          // #17: 3 2/3 + 1 1/3
                            "64⁄5",       // #18: 4 3/5 + 2 1/5
                            "7",          // #19: 5 3/4 + 1 1/4
                            "6",          // #20: 2 5/6 + 3 1/6
                            "41⁄2",       // #21: 6 7/8 - 2 3/8
                            "51⁄3",       // #22: 8 2/3 - 3 1/3
                            "33⁄5",       // #23: 7 4/5 - 4 1/5
                            "41⁄2",       // #24: 9 3/4 - 5 1/4
                            "42⁄3"        // #25: 10 5/6 - 6 1/6
                        ),
                        correctMatches = mapOf(
                            0 to 0,   // 1/8 + 5/8 = 3/4
                            1 to 1,   // 3/5 + 1/5 = 4/5
                            2 to 2,   // 2/9 + 4/9 = 2/3
                            3 to 3,   // 1/4 + 1/4 = 1/2
                            4 to 4,   // 3/11 + 5/11 = 8/11
                            5 to 5,   // 1/6 + 1/6 = 1/3
                            6 to 6,   // 3/8 + 1/8 = 1/2
                            7 to 7,   // 2/5 + 2/5 = 4/5
                            8 to 8,   // 5/12 + 7/12 = 1
                            9 to 9,   // 3/10 + 7/10 = 1
                            10 to 10, // 7/8 - 3/8 = 1/2
                            11 to 11, // 5/6 - 2/6 = 1/2
                            12 to 12, // 7/9 - 2/9 = 5/9
                            13 to 13, // 11/12 - 5/12 = 1/2
                            14 to 14, // 9/10 - 3/10 = 3/5
                            15 to 15, // 1 1/2 + 2 1/2 = 4
                            16 to 16, // 3 2/3 + 1 1/3 = 5
                            17 to 17, // 4 3/5 + 2 1/5 = 6 4/5
                            18 to 18, // 5 3/4 + 1 1/4 = 7
                            19 to 19, // 2 5/6 + 3 1/6 = 6
                            20 to 20, // 6 7/8 - 2 3/8 = 4 1/2
                            21 to 21, // 8 2/3 - 3 1/3 = 5 1/3
                            22 to 22, // 7 4/5 - 4 1/5 = 3 3/5
                            23 to 23, // 9 3/4 - 5 1/4 = 4 1/2
                            24 to 24  // 10 5/6 - 6 1/6 = 4 2/3
                        )
                    )
                )
            )
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

            // Activity 3: Word Problems - Addition and Subtraction
            Activity(
                id = 3,
                quarter = 1,
                lessonNumber = 2,
                activityNumber = 3,
                title = "Word Problems Involving Addition and Subtraction of Fractions",
                type = ActivityType.MULTIPLE_CHOICE,
                questions = listOf(
                    Question.MultipleChoice(
                        id = 1,
                        text = "Ana ate 3⁄8 of a pizza and Ben ate 1⁄8 of the same pizza. How much pizza did they eat together?",
                        options = listOf("1⁄4", "3⁄8", "1⁄2", "5⁄8"),
                        correctAnswer = 2
                    ),
                    Question.MultipleChoice(
                        id = 2,
                        text = "A baker used 2⁄3 cup of sugar in one recipe and 1⁄3 cup in another. How much sugar was used in total?",
                        options = listOf("2⁄3", "1", "1⁄3", "11⁄3"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 3,
                        text = "Maria had 7⁄8 meter of ribbon. She used 3⁄8 meter for a project. How much ribbon is left?",
                        options = listOf("1⁄4", "3⁄8", "1⁄2", "5⁄8"),
                        correctAnswer = 2
                    ),
                    Question.MultipleChoice(
                        id = 4,
                        text = "A tank was 3⁄5 full of water. After adding more water, it became 4⁄5 full. What fraction of the tank was filled?",
                        options = listOf("1⁄5", "2⁄5", "3⁄5", "4⁄5"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 5,
                        text = "John walked 21⁄3 km in the morning and 12⁄3 km in the evening. How far did he walk in total?",
                        options = listOf("3", "32⁄3", "4", "41⁄3"),
                        correctAnswer = 2
                    ),
                    Question.MultipleChoice(
                        id = 6,
                        text = "A recipe needs 3⁄4 cup of milk. If you only have 1⁄2 cup, how much more do you need?",
                        options = listOf("1⁄8", "1⁄4", "3⁄8", "1⁄2"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 7,
                        text = "Lisa read 2⁄5 of a book on Monday and 1⁄5 on Tuesday. What fraction of the book has she read?",
                        options = listOf("1⁄5", "2⁄5", "3⁄5", "4⁄5"),
                        correctAnswer = 2
                    ),
                    Question.MultipleChoice(
                        id = 8,
                        text = "A farmer harvested 34⁄5 sacks of rice in the morning and 21⁄5 sacks in the afternoon. How many sacks in total?",
                        options = listOf("5", "51⁄5", "52⁄5", "6"),
                        correctAnswer = 3
                    ),
                    Question.MultipleChoice(
                        id = 9,
                        text = "Tom drank 2⁄3 liter of juice and Sara drank 1⁄3 liter. How much more did Tom drink?",
                        options = listOf("1⁄6", "1⁄4", "1⁄3", "1⁄2"),
                        correctAnswer = 2
                    ),
                    Question.MultipleChoice(
                        id = 10,
                        text = "A painter used 57⁄8 liters of paint for a room and 33⁄8 liters for another. What's the difference?",
                        options = listOf("2", "21⁄4", "21⁄2", "23⁄4"),
                        correctAnswer = 2
                    ),
                    Question.MultipleChoice(
                        id = 11,
                        text = "A box contains 5⁄6 kg of flour. After using 1⁄6 kg, how much is left?",
                        options = listOf("1⁄2", "2⁄3", "3⁄4", "5⁄6"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 12,
                        text = "Rosa spent 11⁄4 hours on homework and 3⁄4 hour reading. How much time in total?",
                        options = listOf("11⁄2", "13⁄4", "2", "21⁄4"),
                        correctAnswer = 2
                    ),
                    Question.MultipleChoice(
                        id = 13,
                        text = "A rope was 72⁄3 meters long. After cutting off 21⁄3 meters, what length remains?",
                        options = listOf("5", "51⁄3", "52⁄3", "6"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 14,
                        text = "A bucket was 5⁄8 full. After pouring out 3⁄8, what fraction remains?",
                        options = listOf("1⁄8", "1⁄4", "3⁄8", "1⁄2"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 15,
                        text = "Emma ran 42⁄5 km and walked 13⁄5 km. What is the total distance?",
                        options = listOf("5", "52⁄5", "53⁄5", "6"),
                        correctAnswer = 3
                    ),
                    Question.MultipleChoice(
                        id = 16,
                        text = "A cake was divided into 8 pieces. If 3⁄8 was eaten, what fraction is left?",
                        options = listOf("3⁄8", "1⁄2", "5⁄8", "3⁄4"),
                        correctAnswer = 2
                    ),
                    Question.MultipleChoice(
                        id = 17,
                        text = "A container held 65⁄6 liters of oil. After using 21⁄6 liters, how much remains?",
                        options = listOf("41⁄3", "41⁄2", "42⁄3", "45⁄6"),
                        correctAnswer = 2
                    ),
                    Question.MultipleChoice(
                        id = 18,
                        text = "Mike studied 3⁄5 hour in the morning and 2⁄5 hour at night. Total study time?",
                        options = listOf("4⁄5", "1", "11⁄5", "12⁄5"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 19,
                        text = "A garden path is 83⁄4 meters. If 31⁄4 meters is paved, how much is unpaved?",
                        options = listOf("5", "51⁄4", "51⁄2", "53⁄4"),
                        correctAnswer = 2
                    ),
                    Question.MultipleChoice(
                        id = 20,
                        text = "A recipe uses 5⁄6 cup flour and 1⁄6 cup sugar. How much more flour than sugar?",
                        options = listOf("1⁄6", "1⁄3", "1⁄2", "2⁄3"),
                        correctAnswer = 3
                    ),
                    Question.MultipleChoice(
                        id = 21,
                        text = "A bottle was 7⁄8 full. After drinking 3⁄8, what fraction is left?",
                        options = listOf("1⁄4", "3⁄8", "1⁄2", "5⁄8"),
                        correctAnswer = 2
                    ),
                    Question.MultipleChoice(
                        id = 22,
                        text = "Anna traveled 53⁄5 km by bus and 22⁄5 km by car. Total distance?",
                        options = listOf("7", "72⁄5", "73⁄5", "8"),
                        correctAnswer = 3
                    ),
                    Question.MultipleChoice(
                        id = 23,
                        text = "A tank contained 97⁄8 gallons. After using 43⁄8 gallons, how much remains?",
                        options = listOf("5", "53⁄8", "51⁄2", "55⁄8"),
                        correctAnswer = 2
                    ),
                    Question.MultipleChoice(
                        id = 24,
                        text = "Pedro ate 2⁄7 of a pie and his sister ate 3⁄7. How much pie was eaten?",
                        options = listOf("1⁄7", "4⁄7", "5⁄7", "6⁄7"),
                        correctAnswer = 2
                    ),
                    Question.MultipleChoice(
                        id = 25,
                        text = "A bag had 103⁄4 kg of rice. After using 61⁄4 kg, how much is left?",
                        options = listOf("4", "41⁄4", "41⁄2", "43⁄4"),
                        correctAnswer = 2
                    )
                )
            )
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
                        text = "⅔ × ¾ = ¾",
                        options = listOf("True", "False"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 2,
                        text = "⅚ × ⅘ = ⅓",
                        options = listOf("True", "False"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 3,
                        text = "⅞ × ¾ = ⅔",
                        options = listOf("True", "False"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 4,
                        text = "⅗ × ⅔ = 5/10",
                        options = listOf("True", "False"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 5,
                        text = "9/10 × ⅘ = 45/50",
                        options = listOf("True", "False"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 6,
                        text = "⅔ × ⅘ = 8/15",
                        options = listOf("True", "False"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 7,
                        text = "⅚ × ¾ = ⅝",
                        options = listOf("True", "False"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 8,
                        text = "⅞ × ⅔ = 7/12",
                        options = listOf("True", "False"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 9,
                        text = "⅗ × 2/7 = 6/35",
                        options = listOf("True", "False"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 10,
                        text = "¼ × ⅚ = 5/24",
                        options = listOf("True", "False"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 11,
                        text = "⅛ × 2/8 = 2/16",
                        options = listOf("True", "False"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 12,
                        text = "⅔ × ⅓ = 3/6",
                        options = listOf("True", "False"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 13,
                        text = "⅚ × 4/6 = 20/6",
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
                        text = "⅗ × ⅕ = 12/5",
                        options = listOf("True", "False"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 16,
                        text = "⅘ × 3⅓ = 12/3",
                        options = listOf("True", "False"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 17,
                        text = "2⅖ × 3/7 = ⅘",
                        options = listOf("True", "False"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 18,
                        text = "⅚ × 4½ = 3⅗",
                        options = listOf("True", "False"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 19,
                        text = "3¾ × 7/10 = 25/8",
                        options = listOf("True", "False"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 20,
                        text = "2⅗ × 4/9 = 17/45",
                        options = listOf("True", "False"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 21,
                        text = "1 4/9 × 2⅔ = 323/27",
                        options = listOf("True", "False"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 22,
                        text = "3⅖ × 1¾ = 51/20",
                        options = listOf("True", "False"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 23,
                        text = "2¾ × 8/15 = 22 11/20",
                        options = listOf("True", "False"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 24,
                        text = "4 9/10 × 2⅚ = 135/60",
                        options = listOf("True", "False"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 25,
                        text = "11¾ × 1⅞ = 221/32",
                        options = listOf("True", "False"),
                        correctAnswer = 1
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
                        text = "4/6 × ⅙ =",
                        options = listOf("4/36", "⅓", "1/9", "4/20"),
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
                        text = "½ × ½ =",
                        options = listOf("¼", "½", "⅓", "⅕"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 4,
                        text = "¾ × 2/4 =",
                        options = listOf("⅔", "6/5", "3¾", "⅜"),
                        correctAnswer = 3
                    ),
                    Question.MultipleChoice(
                        id = 5,
                        text = "1/20 × 1/10 =",
                        options = listOf("1", "1½", "¼", "1/200"),
                        correctAnswer = 3
                    ),
                    Question.MultipleChoice(
                        id = 6,
                        text = "⅚ × 5/30 =",
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
                        text = "⅜ × ⅜ =",
                        options = listOf("⅜", "⅓", "⅛", "9/64"),
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
                        text = "¾ × ¾ =",
                        options = listOf("9/16", "⅗", "3", "5"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 12,
                        text = "⅕ × ⅖ =",
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
                        text = "2⅕ × ⅓ =",
                        options = listOf("11/15", "22/15", "2/4", "½"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 16,
                        text = "6½ × ½ =",
                        options = listOf("4/3", "3¼", "¼", "3"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 17,
                        text = "2⅚ × ⅓ =",
                        options = listOf("⅞", "6/8", "17/18", "16/18"),
                        correctAnswer = 2
                    ),
                    Question.MultipleChoice(
                        id = 18,
                        text = "9 6/7 × ⅕ =",
                        options = listOf("4¾", "3/3", "34/35", "134/35"),
                        correctAnswer = 3
                    ),
                    Question.MultipleChoice(
                        id = 19,
                        text = "½ × 7¾ =",
                        options = listOf("⅞", "3⅞", "3/6", "7/36"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 20,
                        text = "8⅔ × ⅔ =",
                        options = listOf("7/9", "5 7/9", "5 1/9", "1/7"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 21,
                        text = "5½ × 5½ =",
                        options = listOf("30¼", "30", "¼", "4/30"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 22,
                        text = "3 8/9 × 1¾ =",
                        options = listOf("20/36", "29/36", "29/30", "6 29/36"),
                        correctAnswer = 3
                    ),
                    Question.MultipleChoice(
                        id = 23,
                        text = "5½ × 1½ =",
                        options = listOf("8 4/6", "8¼", "8⅓", "8½"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 24,
                        text = "16/9 × 4⅖ =",
                        options = listOf("7", "⅓", "7⅓", "7½"),
                        correctAnswer = 2
                    ),
                    Question.MultipleChoice(
                        id = 25,
                        text = "19/10 × 2⅞ =",
                        options = listOf("5 37/80", "3 7/80", "5⅛", "⅜"),
                        correctAnswer = 0
                    )
                )
            ),

            // Activity 3: Multiplication Practice - Drag and Drop
            Activity(
                id = 3,
                quarter = 1,
                lessonNumber = 3,
                activityNumber = 3,
                title = "Multiplication of Fractions - Practice",
                type = ActivityType.DRAG_DROP,
                questions = listOf(
                    Question.DragDrop(
                        id = 1,
                        text = "Solve the multiplication problems in Column A and drag the correct answer from Column B.",
                        columnA = listOf(
                            "½ × ¾ =",
                            "⅓ × ⅔ =",
                            "⅖ × ⅗ =",
                            "¾ × ⅘ =",
                            "⅚ × ⅔ =",
                            "⅜ × ⅔ =",
                            "⅝ × ⅘ =",
                            "⅞ × ⅖ =",
                            "2/7 × ⅚ =",
                            "⅜ × 4/9 =",
                            "1½ × ⅔ =",
                            "2¼ × ⅘ =",
                            "3⅓ × ¾ =",
                            "1⅗ × ⅚ =",
                            "2⅔ × ⅗ =",
                            "4½ × ⅔ =",
                            "3¾ × ⅘ =",
                            "5⅙ × ⅗ =",
                            "2⅘ × ⅞ =",
                            "6⅔ × ¾ =",
                            "1⅓ × 2¼ =",
                            "3½ × 1⅕ =",
                            "2⅖ × 2½ =",
                            "4¾ × 1⅓ =",
                            "5½ × 2⅔ ="
                        ),
                        columnB = listOf(
                            "⅜",          // #1: 1/2 × 3/4 = 3/8
                            "2/9",        // #2: 1/3 × 2/3 = 2/9
                            "6/25",       // #3: 2/5 × 3/5 = 6/25
                            "⅗",          // #4: 3/4 × 4/5 = 3/5
                            "5/9",        // #5: 5/6 × 2/3 = 5/9
                            "¼",          // #6: 3/8 × 2/3 = 1/4
                            "½",          // #7: 5/8 × 4/5 = 1/2
                            "7/20",       // #8: 7/8 × 2/5 = 7/20
                            "5/21",       // #9: 2/7 × 5/6 = 5/21
                            "⅙",          // #10: 3/8 × 4/9 = 1/6
                            "1",          // #11: 1 1/2 × 2/3 = 1
                            "1⅘",         // #12: 2 1/4 × 4/5 = 1 4/5
                            "2½",         // #13: 3 1/3 × 3/4 = 2 1/2
                            "1⅓",         // #14: 1 3/5 × 5/6 = 1 1/3
                            "1⅗",         // #15: 2 2/3 × 3/5 = 1 3/5
                            "3",          // #16: 4 1/2 × 2/3 = 3
                            "3",          // #17: 3 3/4 × 4/5 = 3
                            "3 1/10",     // #18: 5 1/6 × 3/5 = 3 1/10
                            "2 9/20",     // #19: 2 4/5 × 7/8 = 2 9/20
                            "5",          // #20: 6 2/3 × 3/4 = 5
                            "3",          // #21: 1 1/3 × 2 1/4 = 3
                            "4⅕",         // #22: 3 1/2 × 1 1/5 = 4 1/5
                            "6",          // #23: 2 2/5 × 2 1/2 = 6
                            "6⅓",         // #24: 4 3/4 × 1 1/3 = 6 1/3
                            "14⅔"         // #25: 5 1/2 × 2 2/3 = 14 2/3
                        ),
                        correctMatches = mapOf(
                            0 to 0,   // 1/2 × 3/4 = 3/8
                            1 to 1,   // 1/3 × 2/3 = 2/9
                            2 to 2,   // 2/5 × 3/5 = 6/25
                            3 to 3,   // 3/4 × 4/5 = 3/5
                            4 to 4,   // 5/6 × 2/3 = 5/9
                            5 to 5,   // 3/8 × 2/3 = 1/4
                            6 to 6,   // 5/8 × 4/5 = 1/2
                            7 to 7,   // 7/8 × 2/5 = 7/20
                            8 to 8,   // 2/7 × 5/6 = 5/21
                            9 to 9,   // 3/8 × 4/9 = 1/6
                            10 to 10, // 1 1/2 × 2/3 = 1
                            11 to 11, // 2 1/4 × 4/5 = 1 4/5
                            12 to 12, // 3 1/3 × 3/4 = 2 1/2
                            13 to 13, // 1 3/5 × 5/6 = 1 1/3
                            14 to 14, // 2 2/3 × 3/5 = 1 3/5
                            15 to 15, // 4 1/2 × 2/3 = 3
                            16 to 16, // 3 3/4 × 4/5 = 3
                            17 to 17, // 5 1/6 × 3/5 = 3 1/10
                            18 to 18, // 2 4/5 × 7/8 = 2 9/20
                            19 to 19, // 6 2/3 × 3/4 = 5
                            20 to 20, // 1 1/3 × 2 1/4 = 3
                            21 to 21, // 3 1/2 × 1 1/5 = 4 1/5
                            22 to 22, // 2 2/5 × 2 1/2 = 6
                            23 to 23, // 4 3/4 × 1 1/3 = 6 1/3
                            24 to 24  // 5 1/2 × 2 2/3 = 14 2/3
                        )
                    )
                )
            )
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
                            0 to 0, 1 to 1, 2 to 2, 3 to 3, 4 to 4,
                            5 to 5, 6 to 6, 7 to 7, 8 to 8, 9 to 9,
                            10 to 10, 11 to 11, 12 to 12, 13 to 13, 14 to 14,
                            15 to 15, 16 to 16, 17 to 17, 18 to 18, 19 to 19,
                            20 to 20, 21 to 21, 22 to 22, 23 to 23, 24 to 24
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

            // Activity 3: Multiplication Word Problems
            Activity(
                id = 3,
                quarter = 1,
                lessonNumber = 4,
                activityNumber = 3,
                title = "Multiplication Word Problems with Fractions",
                type = ActivityType.MULTIPLE_CHOICE,
                questions = listOf(
                    Question.MultipleChoice(
                        id = 1,
                        text = "A recipe calls for ¾ cup of sugar. If you want to make half the recipe, how much sugar do you need?",
                        options = listOf("¼ cup", "⅜ cup", "½ cup", "⅝ cup"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 2,
                        text = "A garden is ⅔ meter wide and ¾ meter long. What is the area of the garden?",
                        options = listOf("½ m²", "7/12 m²", "⅔ m²", "11/12 m²"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 3,
                        text = "Maria spent ⅖ of her ₱500. How much did she spend?",
                        options = listOf("₱100", "₱150", "₱200", "₱250"),
                        correctAnswer = 2
                    ),
                    Question.MultipleChoice(
                        id = 4,
                        text = "A rope is 8½ meters long. If you cut it into ⅔ of its length, how long is the piece?",
                        options = listOf("5 m", "5⅔ m", "6 m", "6⅓ m"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 5,
                        text = "A tank holds 12 liters when full. If it is ¾ full, how many liters does it contain?",
                        options = listOf("8 L", "9 L", "10 L", "11 L"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 6,
                        text = "John read ⅗ of a 200-page book. How many pages did he read?",
                        options = listOf("100", "120", "140", "160"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 7,
                        text = "A box of candies weighs 2¼ kg. If each candy weighs ⅛ kg, how many candies are there?",
                        options = listOf("16", "18", "20", "22"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 8,
                        text = "A field is 15½ meters by ⅔ meters. What is the area?",
                        options = listOf("10 m²", "10⅓ m²", "11 m²", "11⅓ m²"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 9,
                        text = "Lisa practiced piano for 1⅔ hours. If she spent ¾ of that time on scales, how long did she practice scales?",
                        options = listOf("1 hr", "1¼ hr", "1⅓ hr", "1½ hr"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 10,
                        text = "A baker uses ⅝ kg of flour for one cake. How much flour for 4 cakes?",
                        options = listOf("2 kg", "2¼ kg", "2½ kg", "2¾ kg"),
                        correctAnswer = 2
                    ),
                    Question.MultipleChoice(
                        id = 11,
                        text = "A bottle contains 1⅕ liters of juice. If you drink ⅖ of it, how much did you drink?",
                        options = listOf("12/25 L", "8/25 L", "½ L", "⅗ L"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 12,
                        text = "A fabric is 4¾ meters long. If you need ⅗ of it, how much do you need?",
                        options = listOf("2⅘ m", "2⅚ m", "3 m", "3⅕ m"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 13,
                        text = "Tom ran ⅝ of a 12 km race. How far did he run?",
                        options = listOf("6 km", "6½ km", "7 km", "7½ km"),
                        correctAnswer = 3
                    ),
                    Question.MultipleChoice(
                        id = 14,
                        text = "A pizza is cut into 8 slices. If you eat ⅜ of the pizza, how many slices did you eat?",
                        options = listOf("2", "3", "4", "5"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 15,
                        text = "A car travels ⅔ of a 90 km distance. How far has it traveled?",
                        options = listOf("50 km", "55 km", "60 km", "65 km"),
                        correctAnswer = 2
                    ),
                    Question.MultipleChoice(
                        id = 16,
                        text = "A rectangle is 5⅓ meters long and ¾ meter wide. What is its area?",
                        options = listOf("3¾ m²", "4 m²", "4¼ m²", "4½ m²"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 17,
                        text = "Anna saved ⅘ of her ₱2,500 allowance. How much did she save?",
                        options = listOf("₱1,800", "₱1,900", "₱2,000", "₱2,100"),
                        correctAnswer = 2
                    ),
                    Question.MultipleChoice(
                        id = 18,
                        text = "A bag of rice weighs 6¾ kg. If ⅖ of it is used, how much was used?",
                        options = listOf("2½ kg", "2⅔ kg", "2⅘ kg", "2 7/10 kg"),
                        correctAnswer = 3
                    ),
                    Question.MultipleChoice(
                        id = 19,
                        text = "A worker earns ₱18,000 per month. If he spends ⅚ of it, how much does he spend?",
                        options = listOf("₱14,000", "₱15,000", "₱16,000", "₱17,000"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 20,
                        text = "A trail is 7½ km long. If you hike ⅗ of it, how far did you hike?",
                        options = listOf("4 km", "4¼ km", "4½ km", "4¾ km"),
                        correctAnswer = 2
                    ),
                    Question.MultipleChoice(
                        id = 21,
                        text = "A water tank holds 20 gallons. If it is ⅗ full, how many gallons are in it?",
                        options = listOf("10 gal", "12 gal", "14 gal", "16 gal"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 22,
                        text = "A painter used ⅞ of a 16-liter can of paint. How much paint was used?",
                        options = listOf("12 L", "13 L", "14 L", "15 L"),
                        correctAnswer = 2
                    ),
                    Question.MultipleChoice(
                        id = 23,
                        text = "A school has 450 students. If ⅖ are boys, how many boys are there?",
                        options = listOf("150", "160", "170", "180"),
                        correctAnswer = 3
                    ),
                    Question.MultipleChoice(
                        id = 24,
                        text = "A ribbon is 9⅔ meters long. If you use ¾ of it, how much did you use?",
                        options = listOf("7 m", "7¼ m", "7½ m", "7¾ m"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 25,
                        text = "A farmer harvested 840 kg of rice. If he sold ⅚ of it, how much did he sell?",
                        options = listOf("650 kg", "700 kg", "750 kg", "800 kg"),
                        correctAnswer = 1
                    )
                )
            )
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
                            "¾ ÷ ½ =",
                            "⅞ ÷ ¼ =",
                            "⅝ ÷ ⅔ =",
                            "⁷⁄₉ ÷ ⅚ =",
                            "⅔ ÷ ⁴⁄₇ =",
                            "⅝ ÷ ¾ =",
                            "⅗ ÷ ²⁄₇ =",
                            "⅞ ÷ ¾ =",
                            "⅘ ÷ ⅜ =",
                            "⁷⁄₁₀ ÷ ⅚ =",
                            "½ ÷ 2 =",
                            "⁶⁄₇ ÷ 2 =",
                            "⁹⁄₁₀ ÷ 4 =",
                            "⁶⁄₇ ÷ 7 =",
                            "6 ÷ ³⁄₇ =",
                            "2⅓ ÷ ⅔ =",
                            "⅚ ÷ 1½ =",
                            "2½ ÷ ⅚ =",
                            "5⅔ ÷ ⅘ =",
                            "2¹⁰⁄₁₁ ÷ ⁶⁄₁₁ =",
                            "1¼ ÷ 2½ =",
                            "¹⁹⁄₁₁ ÷ ¹⁹⁄₁₁ =",
                            "9½ ÷ 2½ =",
                            "5⅖ ÷ 3⅓ =",
                            "7½ ÷ 4⅓ ="
                        ),
                        columnB = listOf(
                            "1½", "3½", "¹⁵⁄₁₆", "¹⁴⁄₁₅", "1⅙",
                            "⅚", "²¹⁄₁₀", "1⅙", "²²⁄₁₅", "²¹⁄₂₅",
                            "¼", "³⁄₇", "⁹⁄₄₀", "⁶⁄₄₉", "14",
                            "3½", "⁵⁄₉", "3", "7¹⁄₁₂", "5⅓",
                            "½", "1", "3⅘", "¹³⁄₁₅₀", "1¹⁹⁄₂₆"
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
                            "⁸⁄₉ ÷ ½ =",
                            "⅛ ÷ ¼ =",
                            "⁵⁄₇ ÷ ⅓ =",
                            "⅒ ÷ ⅙ =",
                            "⅘ ÷ ⁴⁄₆ =",
                            "²⁄₉ ÷ ½ =",
                            "¼ ÷ ⅓ =",
                            "³⁄₆ ÷ ²⁄₄ =",
                            "⅗ ÷ ⅔ =",
                            "¼ ÷ ⅝ =",
                            "3½ ÷ ⁶⁄₇ =",
                            "½ ÷ 3¾ =",
                            "5½ ÷ ¹⁰⁄₁₁ =",
                            "⁶⁄₈ ÷ 4⅓ =",
                            "1⅔ ÷ ⁶⁄₇ =",
                            "4 ÷ ⅔ =",
                            "9 ÷ ⅒ =",
                            "10 ÷ ½ =",
                            "⁸⁄₉ ÷ 3 =",
                            "7 ÷ ¾ =",
                            "8¼ ÷ ¹⁹⁄₁₁ =",
                            "4¼ ÷ 6⅘ =",
                            "3⅘ ÷ 2¾ =",
                            "5⁶⁄₇ ÷ 1⅔ =",
                            "9⅓ ÷ 2¾ ="
                        ),
                        columnB = listOf(
                            "1⁷⁄₉", "½", "2⅐", "⅗", "1⅕",
                            "⁴⁄₉", "¾", "1", "⁹⁄₁₀", "⅖",
                            "4¹⁄₁₂", "²⁄₁₅", "6¹⁄₂₀", "⁹⁄₅₂", "1¹⁷⁄₁₈",
                            "6", "90", "20", "⁸⁄₂₇", "9⅓",
                            "4⁴³⁄₈₀", "⅝", "1²¹⁄₅₅", "3¹⁸⁄₃₅", "3¹³⁄₃₃"
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

            // Activity 3: Division Word Problems
            Activity(
                id = 3,
                quarter = 1,
                lessonNumber = 5,
                activityNumber = 3,
                title = "Division Word Problems with Fractions",
                type = ActivityType.MULTIPLE_CHOICE,
                questions = listOf(
                    Question.MultipleChoice(
                        id = 1,
                        text = "A ribbon ⅚ meter long was cut into 5 equal pieces. What is the length of each piece?",
                        options = listOf("⅙ m", "⅕ m", "5/30 m", "¼ m"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 2,
                        text = "A chocolate bar measuring ⅔ was split into 4 equal parts. What fraction is each part?",
                        options = listOf("⅙", "²⁄₁₂", "⅛", "³⁄₁₆"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 3,
                        text = "A farmer had ⅞ kilograms of rice. He divided it into 2 bags equally. How much rice was in each bag?",
                        options = listOf("³⁄₁₆ kg", "⁷⁄₁₆ kg", "½ kg", "⅝ kg"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 4,
                        text = "A rope 9/10 meter long was cut into 3 equal parts. How long is each part?",
                        options = listOf("³⁄₁₀ m", "³⁄₃₀ m", "¼ m", "⅕ m"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 5,
                        text = "A piece of wood ¾ meter long was divided into 3 equal parts. How long is each part?",
                        options = listOf("⅛ m", "³⁄₁₂ m", "¼ m", "⅓ m"),
                        correctAnswer = 2
                    ),
                    Question.MultipleChoice(
                        id = 6,
                        text = "The quotient of ¾ ÷ ½ tells how many halves are in three-fourths. What is the answer?",
                        options = listOf("1", "1¼", "1½", "1¾"),
                        correctAnswer = 2
                    ),
                    Question.MultipleChoice(
                        id = 7,
                        text = "A farmer split ⅖ of a sack of corn into 10 equal bags. What fraction of the sack is in each bag?",
                        options = listOf("⅒", "¹⁄₂₅", "²⁄₅₀", "⅕"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 8,
                        text = "A stick ½ meter long was cut into 2 equal pieces. What is the length of each piece?",
                        options = listOf("⅛ m", "⅙ m", "¼ m", "⅓ m"),
                        correctAnswer = 2
                    ),
                    Question.MultipleChoice(
                        id = 9,
                        text = "A chocolate bar ⅘ was split between 2 friends equally. How much does each receive?",
                        options = listOf("⅖", "⅗", "⁴⁄₁₀", "½"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 10,
                        text = "The quotient of ⅚ ÷ ⅓ shows how many one-thirds are in five-sixths. What is the result?",
                        options = listOf("2", "2¼", "2½", "2¾"),
                        correctAnswer = 2
                    ),
                    Question.MultipleChoice(
                        id = 11,
                        text = "How many ¼-cup servings are in ¾ cup of juice?",
                        options = listOf("2", "2½", "3", "3½"),
                        correctAnswer = 2
                    ),
                    Question.MultipleChoice(
                        id = 12,
                        text = "A pizza is ⅞ of its original size. If you divide it among 7 people equally, what fraction does each person get?",
                        options = listOf("⅛", "⅐", "¹⁄₅₆", "⅙"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 13,
                        text = "A recipe needs ⅔ cup of flour. If you want to make ½ of the recipe, how much flour do you need?",
                        options = listOf("¼ cup", "⅓ cup", "⅖ cup", "½ cup"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 14,
                        text = "A trail is 6¾ km long. If you divide it into 3 equal sections, how long is each section?",
                        options = listOf("2 km", "2¼ km", "2½ km", "2¾ km"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 15,
                        text = "A bottle contains 4½ liters of water. If you pour it equally into 3 containers, how much is in each?",
                        options = listOf("1¼ L", "1⅓ L", "1½ L", "1⅔ L"),
                        correctAnswer = 2
                    ),
                    Question.MultipleChoice(
                        id = 16,
                        text = "A cloth 8⅔ meters long is cut into 4 equal pieces. How long is each piece?",
                        options = listOf("2⅙ m", "2⅓ m", "2½ m", "2⅔ m"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 17,
                        text = "The quotient of ⅞ ÷ ¼ gives the number of fourths in seven-eighths. What is the answer?",
                        options = listOf("2½", "3", "3½", "4"),
                        correctAnswer = 2
                    ),
                    Question.MultipleChoice(
                        id = 18,
                        text = "A rope 12½ meters long is cut into 5 equal parts. How long is each part?",
                        options = listOf("2 m", "2¼ m", "2½ m", "2¾ m"),
                        correctAnswer = 2
                    ),
                    Question.MultipleChoice(
                        id = 19,
                        text = "How many ⅓-liter bottles can be filled from 5⅔ liters of juice?",
                        options = listOf("15", "16", "17", "18"),
                        correctAnswer = 2
                    ),
                    Question.MultipleChoice(
                        id = 20,
                        text = "A cake weighing 3¾ kg is divided equally among 5 children. How much does each child get?",
                        options = listOf("⅗ kg", "¾ kg", "⅘ kg", "⁷⁄₈ kg"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 21,
                        text = "The average of ½, ¾, and ⅔ is found by dividing their sum by 3. What is the average?",
                        options = listOf("⁵⁄₁₂", "½", "⁷⁄₁₂", "⅔"),
                        correctAnswer = 2
                    ),
                    Question.MultipleChoice(
                        id = 22,
                        text = "The average of ⅖ and ⅘ is found by dividing their sum by 2. What is the result?",
                        options = listOf("⅖", "½", "⅗", "⅘"),
                        correctAnswer = 2
                    ),
                    Question.MultipleChoice(
                        id = 23,
                        text = "A ribbon 15¾ meters long is cut into pieces of ¾ meter each. How many pieces are there?",
                        options = listOf("18", "19", "20", "21"),
                        correctAnswer = 3
                    ),
                    Question.MultipleChoice(
                        id = 24,
                        text = "The average of ⅔, ⅚, and ½ is found by dividing their sum by 3. What is the average?",
                        options = listOf("½", "⅔", "¾", "⅚"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 25,
                        text = "How many ⅝-meter pieces can be cut from a 10-meter rope?",
                        options = listOf("14", "15", "16", "17"),
                        correctAnswer = 2
                    )
                )
            )
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
                        text = "A pizza was cut into 8 equal slices. If Ana ate ⅜ of it, what fraction of the pizza is left?",
                        options = listOf("True", "False"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 2,
                        text = "A recipe needs ⅔ cup of sugar. If the cook makes 4 batches, how many cups of sugar are needed in all?",
                        options = listOf("True", "False"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 3,
                        text = "The quotient of ¾ ÷ ½ tells how many halves are in three-fourths. What is the answer?",
                        options = listOf("True", "False"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 4,
                        text = "Maria had ⅞ of a cake. She ate ¼ of it. How much cake does she have left?",
                        options = listOf("True", "False"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 5,
                        text = "A ribbon ⅚ meter long was cut into 5 equal pieces. What is the length of each piece?",
                        options = listOf("True", "False"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 6,
                        text = "A farmer harvested ¾ of a sack of rice in the morning and ⅖ of a sack in the afternoon. How much rice did he harvest in all?",
                        options = listOf("True", "False"),
                        correctAnswer =1
                    ),
                    Question.MultipleChoice(
                        id = 7,
                        text = "A farmer had ⅞ kilograms of rice. He divided it by 2 bags equally. How much rice was in each bag?",
                        options = listOf("True", "False"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 8,
                        text = "A bottle contains ⅔ liters of juice. If 3 bottles are filled, how many liters of juice are there in total?",
                        options = listOf("True", "False"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 9,
                        text = "The average of ½, ¾, and ⅔ ?",
                        options = listOf("True", "False"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 10,
                        text = "Liza had ⅚ kilograms of flour. She used ⅓ kilogram for baking. How much flour is left?",
                        options = listOf("True", "False"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 11,
                        text = "A chocolate bar measuring ⅔ was split into 4 equal parts. What fraction is each part?",
                        options = listOf("True", "False"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 12,
                        text = "A car traveled ⅖ of a kilometer in the morning and ³⁄₁₀ kilometer in the afternoon. What is the total distance traveled?",
                        options = listOf("True", "False"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 13,
                        text = "The quotient of ⅚ ÷ ⅓ shows how many one-thirds are in five-sixths. What is the result?",
                        options = listOf("True", "False"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 14,
                        text = "A pack of meat weighs ¾ kilogram. If 6 packs are bought, how many kilograms of meat are there?",
                        options = listOf("True", "False"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 15,
                        text = "A rope ⁹⁄₁₀ meter long was cut into 3 equal parts. How long is each part?",
                        options = listOf("True", "False"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 16,
                        text = "A class drank ½ gallon of milk in the morning and ⅔ gallon in the afternoon. How much milk did they drink in total?",
                        options = listOf("True", "False"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 17,
                        text = "A farmer split ⅖ of a sack of corn into 10 equal bags. What fraction of the sack is in each bag?",
                        options = listOf("True", "False"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 18,
                        text = "A tailor used ⅖ meter of cloth for one shirt. If he makes 8 shirts, how many meters of cloth will he need?",
                        options = listOf("True", "False"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 19,
                        text = "The average of ⅖ and ⅘?",
                        options = listOf("True", "False"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 20,
                        text = "Ana had ⁹⁄₁₀ meters of ribbon. She cut ⅖ meters for decoration. How much ribbon remains?",
                        options = listOf("True", "False"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 21,
                        text = "A piece of wood ¾ meter long was divided by 3 equal parts. How long is each part?",
                        options = listOf("True", "False"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 22,
                        text = "The quotient of ⅞ ÷ ¼ gives the number of fourths in seven-eighths. What is the answer?",
                        options = listOf("True", "False"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 23,
                        text = "A stick ½ meter long was cut into 2 equal pieces. What is the length of each piece?",
                        options = listOf("True", "False"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 24,
                        text = "The average of ⅔, ⅚, and ½?",
                        options = listOf("True", "False"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 25,
                        text = "A chocolate bar ⅘ was split into 2 friends equally. How much does each receive?",
                        options = listOf("True", "False"),
                        correctAnswer = 0
                    )
                )
            ),

            // Activity 2: Routine and Non-Routine Problems - Division (Video-based)
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
                        description = "Routine or Non-routine Problem - Division Without or With Subtraction of Fractions and Mixed Fractions"
                    ),
                    Question.RoutineProblem(
                        id = 2,
                        text = "",
                        videoFileName = "activity_2-n2.mp4",
                        description = "Routine or Non-routine Problem - Division Without or With Subtraction of Fractions and Mixed Fractions"
                    ),
                    Question.RoutineProblem(
                        id = 3,
                        text = "",
                        videoFileName = "activity_2-n3.mp4",
                        description = "Routine or Non-routine Problem - Division Without or With Subtraction of Fractions and Mixed Fractions"
                    ),
                    Question.RoutineProblem(
                        id = 4,
                        text = "",
                        videoFileName = "activity_2-n4.mp4",
                        description = "Routine or Non-routine Problem - Division Without or With Subtraction of Fractions and Mixed Fractions"
                    ),
                    Question.RoutineProblem(
                        id = 5,
                        text = "",
                        videoFileName = "activity_2-n5.mp4",
                        description = "Routine or Non-routine Problem - Division Without or With Subtraction of Fractions and Mixed Fractions"
                    ),
                    Question.RoutineProblem(
                        id = 6,
                        text = "",
                        videoFileName = "activity_2-n6.mp4",
                        description = "Routine or Non-routine Problem - Division Without or With Subtraction of Fractions and Mixed Fractions"
                    ),
                    Question.RoutineProblem(
                        id = 7,
                        text = "",
                        videoFileName = "activity_2-n7.mp4",
                        description = "Routine or Non-routine Problem - Division Without or With Subtraction of Fractions and Mixed Fractions"
                    )
                )
            ),

            // Activity 3: Division Concepts Matching
            Activity(
                id = 3,
                quarter = 1,
                lessonNumber = 6,
                activityNumber = 3,
                title = "Division Concepts and Applications",
                type = ActivityType.WIRE_MATCHING,
                questions = listOf(
                    Question.WireMatching(
                        id = 1,
                        text = "Match the division problems in Column A with their correct answers in Column B by drawing a line.",
                        columnA = listOf(
                            "½ ÷ ¼ =",
                            "⅔ ÷ ⅓ =",
                            "¾ ÷ ⅛ =",
                            "⅘ ÷ ⅖ =",
                            "⅚ ÷ ⅙ =",
                            "⅝ ÷ ⅝ =",
                            "⁹⁄₁₀ ÷ ³⁄₁₀ =",
                            "⅞ ÷ ⅞ =",
                            "⅗ ÷ ⅕ =",
                            "⁷⁄₈ ÷ ⅐ =",
                            "6 ÷ ½ =",
                            "8 ÷ ¼ =",
                            "9 ÷ ⅓ =",
                            "10 ÷ ⅖ =",
                            "12 ÷ ¾ =",
                            "3½ ÷ ½ =",
                            "4¾ ÷ ¾ =",
                            "5⅔ ÷ ⅔ =",
                            "6⅘ ÷ ⅘ =",
                            "8⅚ ÷ ⅚ =",
                            "2½ ÷ 1¼ =",
                            "3¾ ÷ 1½ =",
                            "4⅔ ÷ 2⅓ =",
                            "5⅘ ÷ 2⅖ =",
                            "6⅚ ÷ 3⅔ ="
                        ),
                        columnB = listOf(
                            "2",           // #1: 1/2 ÷ 1/4 = 2
                            "2",           // #2: 2/3 ÷ 1/3 = 2
                            "6",           // #3: 3/4 ÷ 1/8 = 6
                            "2",           // #4: 4/5 ÷ 2/5 = 2
                            "5",           // #5: 5/6 ÷ 1/6 = 5
                            "1",           // #6: 5/8 ÷ 5/8 = 1
                            "3",           // #7: 9/10 ÷ 3/10 = 3
                            "1",           // #8: 7/8 ÷ 7/8 = 1
                            "3",           // #9: 3/5 ÷ 1/5 = 3
                            "⁴⁹⁄₈",        // #10: 7/8 ÷ 1/7 = 49/8
                            "12",          // #11: 6 ÷ 1/2 = 12
                            "32",          // #12: 8 ÷ 1/4 = 32
                            "27",          // #13: 9 ÷ 1/3 = 27
                            "25",          // #14: 10 ÷ 2/5 = 25
                            "16",          // #15: 12 ÷ 3/4 = 16
                            "7",           // #16: 3 1/2 ÷ 1/2 = 7
                            "⁶⅓",          // #17: 4 3/4 ÷ 3/4 = 6 1/3
                            "8½",          // #18: 5 2/3 ÷ 2/3 = 8 1/2
                            "8½",          // #19: 6 4/5 ÷ 4/5 = 8 1/2
                            "10⅗",         // #20: 8 5/6 ÷ 5/6 = 10 3/5
                            "2",           // #21: 2 1/2 ÷ 1 1/4 = 2
                            "2½",          // #22: 3 3/4 ÷ 1 1/2 = 2 1/2
                            "2",           // #23: 4 2/3 ÷ 2 1/3 = 2
                            "2⅖",          // #24: 5 4/5 ÷ 2 2/5 = 2 2/5
                            "1⅞"           // #25: 6 5/6 ÷ 3 2/3 = 1 7/8
                        ),
                        correctMatches = mapOf(
                            0 to 0,   // 1/2 ÷ 1/4 = 2
                            1 to 1,   // 2/3 ÷ 1/3 = 2
                            2 to 2,   // 3/4 ÷ 1/8 = 6
                            3 to 3,   // 4/5 ÷ 2/5 = 2
                            4 to 4,   // 5/6 ÷ 1/6 = 5
                            5 to 5,   // 5/8 ÷ 5/8 = 1
                            6 to 6,   // 9/10 ÷ 3/10 = 3
                            7 to 7,   // 7/8 ÷ 7/8 = 1
                            8 to 8,   // 3/5 ÷ 1/5 = 3
                            9 to 9,   // 7/8 ÷ 1/7 = 49/8
                            10 to 10, // 6 ÷ 1/2 = 12
                            11 to 11, // 8 ÷ 1/4 = 32
                            12 to 12, // 9 ÷ 1/3 = 27
                            13 to 13, // 10 ÷ 2/5 = 25
                            14 to 14, // 12 ÷ 3/4 = 16
                            15 to 15, // 3 1/2 ÷ 1/2 = 7
                            16 to 16, // 4 3/4 ÷ 3/4 = 6 1/3
                            17 to 17, // 5 2/3 ÷ 2/3 = 8 1/2
                            18 to 18, // 6 4/5 ÷ 4/5 = 8 1/2
                            19 to 19, // 8 5/6 ÷ 5/6 = 10 3/5
                            20 to 20, // 2 1/2 ÷ 1 1/4 = 2
                            21 to 21, // 3 3/4 ÷ 1 1/2 = 2 1/2
                            22 to 22, // 4 2/3 ÷ 2 1/3 = 2
                            23 to 23, // 5 4/5 ÷ 2 2/5 = 2 2/5
                            24 to 24  // 6 5/6 ÷ 3 2/3 = 1 7/8
                        )
                    )
                )
            )
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
                            0 to 0,   // 13.2468 - 6.752 = 6.4948
                            1 to 1,   // 6.9415 - 6.855 = 0.0865
                            2 to 2,   // 9.9999 - 0.001 = 9.9989
                            3 to 3,   // 2.9222 - 2.778 = 0.1442
                            4 to 4,   // 11.1111 - 3.333 = 7.7781
                            5 to 5,   // 7.5678 - 6.322 = 1.2458
                            6 to 6,   // 10.0010 - 4.990 = 5.011
                            7 to 7,   // 3.3333 - 1.667 = 1.6663
                            8 to 8,   // 8.8888 - 1.112 = 7.7768
                            9 to 9,   // 7.1234 - 2.876 = 4.2474
                            10 to 10, // 5.6789 - 3.3211 = 2.3578
                            11 to 11, // 6.5432 - 4.4568 = 2.0864
                            12 to 12, // 11.0001 - 8.9999 = 2.0002
                            13 to 13, // 9.1415 - 3.8585 = 5.283
                            14 to 14, // 12.3456 - 7.6544 = 4.6912
                            15 to 15, // 10.0000 - 2.3456 = 7.6544
                            16 to 16, // 18.8888 - 8.8888 = 10
                            17 to 17, // 7.6543 - 4.3210 = 3.3333
                            18 to 18, // 16.0000 - 5.6789 = 10.3211
                            19 to 19, // 3.4567 - 1.2345 = 2.2222
                            20 to 20, // 25.0000 - 10.1234 = 14.8766
                            21 to 21, // 9.8765 - 3.4567 = 6.4198
                            22 to 22, // 12.3456 - 3.3456 = 9
                            23 to 23, // 5.3486 - 2.1116 = 3.237
                            24 to 24  // 15.5555 - 8.5555 = 7
                        )
                    )
                )
            ),

            // Activity 3: Decimal Addition and Subtraction Matching
            Activity(
                id = 3,
                quarter = 1,
                lessonNumber = 7,
                activityNumber = 3,
                title = "Decimal Addition and Subtraction Practice",
                type = ActivityType.WIRE_MATCHING,
                questions = listOf(
                    Question.WireMatching(
                        id = 1,
                        text = "Solve the decimal problems in Column A and match them with the correct answers in Column B by drawing a line.",
                        columnA = listOf(
                            "2.5 + 3.7 =",
                            "8.4 + 1.9 =",
                            "5.6 + 4.8 =",
                            "7.3 + 2.9 =",
                            "9.1 + 0.8 =",
                            "3.25 + 4.75 =",
                            "6.45 + 2.55 =",
                            "8.15 + 1.85 =",
                            "5.35 + 3.65 =",
                            "7.28 + 2.72 =",
                            "12.5 - 4.3 =",
                            "15.8 - 7.6 =",
                            "20.4 - 9.8 =",
                            "18.9 - 6.7 =",
                            "25.3 - 12.1 =",
                            "10.75 - 3.25 =",
                            "14.50 - 6.25 =",
                            "22.85 - 11.45 =",
                            "30.60 - 15.35 =",
                            "18.95 - 8.75 =",
                            "4.567 + 2.345 =",
                            "9.876 + 3.124 =",
                            "7.234 + 1.876 =",
                            "15.678 - 8.234 =",
                            "20.456 - 12.789 ="
                        ),
                        columnB = listOf(
                            "6.2",          // #1: 2.5 + 3.7
                            "10.3",         // #2: 8.4 + 1.9
                            "10.4",         // #3: 5.6 + 4.8
                            "10.2",         // #4: 7.3 + 2.9
                            "9.9",          // #5: 9.1 + 0.8
                            "8",            // #6: 3.25 + 4.75
                            "9",            // #7: 6.45 + 2.55
                            "10",           // #8: 8.15 + 1.85
                            "9",            // #9: 5.35 + 3.65
                            "10",           // #10: 7.28 + 2.72
                            "8.2",          // #11: 12.5 - 4.3
                            "8.2",          // #12: 15.8 - 7.6
                            "10.6",         // #13: 20.4 - 9.8
                            "12.2",         // #14: 18.9 - 6.7
                            "13.2",         // #15: 25.3 - 12.1
                            "7.5",          // #16: 10.75 - 3.25
                            "8.25",         // #17: 14.50 - 6.25
                            "11.4",         // #18: 22.85 - 11.45
                            "15.25",        // #19: 30.60 - 15.35
                            "10.2",         // #20: 18.95 - 8.75
                            "6.912",        // #21: 4.567 + 2.345
                            "13",           // #22: 9.876 + 3.124
                            "9.11",         // #23: 7.234 + 1.876
                            "7.444",        // #24: 15.678 - 8.234
                            "7.667"         // #25: 20.456 - 12.789
                        ),
                        correctMatches = mapOf(
                            0 to 0,   // 2.5 + 3.7 = 6.2
                            1 to 1,   // 8.4 + 1.9 = 10.3
                            2 to 2,   // 5.6 + 4.8 = 10.4
                            3 to 3,   // 7.3 + 2.9 = 10.2
                            4 to 4,   // 9.1 + 0.8 = 9.9
                            5 to 5,   // 3.25 + 4.75 = 8
                            6 to 6,   // 6.45 + 2.55 = 9
                            7 to 7,   // 8.15 + 1.85 = 10
                            8 to 8,   // 5.35 + 3.65 = 9
                            9 to 9,   // 7.28 + 2.72 = 10
                            10 to 10, // 12.5 - 4.3 = 8.2
                            11 to 11, // 15.8 - 7.6 = 8.2
                            12 to 12, // 20.4 - 9.8 = 10.6
                            13 to 13, // 18.9 - 6.7 = 12.2
                            14 to 14, // 25.3 - 12.1 = 13.2
                            15 to 15, // 10.75 - 3.25 = 7.5
                            16 to 16, // 14.50 - 6.25 = 8.25
                            17 to 17, // 22.85 - 11.45 = 11.4
                            18 to 18, // 30.60 - 15.35 = 15.25
                            19 to 19, // 18.95 - 8.75 = 10.2
                            20 to 20, // 4.567 + 2.345 = 6.912
                            21 to 21, // 9.876 + 3.124 = 13
                            22 to 22, // 7.234 + 1.876 = 9.11
                            23 to 23, // 15.678 - 8.234 = 7.444
                            24 to 24  // 20.456 - 12.789 = 7.667
                        )
                    )
                )
            )
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

            // Activity 3: Word Problems - Addition and Subtraction of Decimals
            Activity(
                id = 3,
                quarter = 1,
                lessonNumber = 8,
                activityNumber = 3,
                title = "Word Problems Involving Addition and Subtraction of Decimals",
                type = ActivityType.MULTIPLE_CHOICE,
                questions = listOf(
                    Question.MultipleChoice(
                        id = 1,
                        text = "Maria bought a notebook for ₱35.75 and a pen for ₱12.50. How much did she spend in total?",
                        options = listOf("₱47.25", "₱48.25", "₱48.50", "₱49.25"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 2,
                        text = "A ribbon measures 8.5 meters. If 3.25 meters is cut off, how much ribbon remains?",
                        options = listOf("5.15 m", "5.25 m", "5.35 m", "5.45 m"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 3,
                        text = "John ran 3.75 km in the morning and 2.5 km in the evening. What is the total distance he ran?",
                        options = listOf("6.15 km", "6.20 km", "6.25 km", "6.30 km"),
                        correctAnswer = 2
                    ),
                    Question.MultipleChoice(
                        id = 4,
                        text = "A bottle contains 2.5 liters of juice. After drinking 0.75 liters, how much juice is left?",
                        options = listOf("1.5 L", "1.65 L", "1.75 L", "1.85 L"),
                        correctAnswer = 2
                    ),
                    Question.MultipleChoice(
                        id = 5,
                        text = "The temperature in the morning was 25.5°C. It rose by 3.75°C in the afternoon. What was the afternoon temperature?",
                        options = listOf("29.15°C", "29.25°C", "29.35°C", "29.45°C"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 6,
                        text = "A box weighs 4.25 kg. After removing some items, it weighs 1.75 kg. How much weight was removed?",
                        options = listOf("2.25 kg", "2.50 kg", "2.75 kg", "3.00 kg"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 7,
                        text = "Ana saved ₱125.50 in January and ₱78.25 in February. How much did she save in total?",
                        options = listOf("₱203.50", "₱203.75", "₱204.00", "₱204.25"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 8,
                        text = "A rope was 15.6 meters long. After cutting off 7.85 meters, what length remains?",
                        options = listOf("7.65 m", "7.75 m", "7.85 m", "7.95 m"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 9,
                        text = "A tank had 50.5 liters of water. After adding 23.75 liters, how much water is in the tank?",
                        options = listOf("74.15 L", "74.25 L", "74.35 L", "74.45 L"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 10,
                        text = "Pedro's height is 1.45 meters and his brother's height is 1.62 meters. What is the difference in their heights?",
                        options = listOf("0.15 m", "0.17 m", "0.19 m", "0.21 m"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 11,
                        text = "A baker used 2.75 kg of flour in the morning and 3.5 kg in the afternoon. How much flour was used in total?",
                        options = listOf("6.15 kg", "6.20 kg", "6.25 kg", "6.30 kg"),
                        correctAnswer = 2
                    ),
                    Question.MultipleChoice(
                        id = 12,
                        text = "A car traveled 85.25 km and then 67.8 km. What is the total distance traveled?",
                        options = listOf("152.95 km", "153.05 km", "153.15 km", "153.25 km"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 13,
                        text = "Lisa had ₱500. After buying items worth ₱287.50, how much money does she have left?",
                        options = listOf("₱212.50", "₱213.50", "₱214.50", "₱215.50"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 14,
                        text = "A garden path is 12.5 meters long. If 4.75 meters is already paved, how much more needs to be paved?",
                        options = listOf("7.50 m", "7.65 m", "7.75 m", "7.85 m"),
                        correctAnswer = 2
                    ),
                    Question.MultipleChoice(
                        id = 15,
                        text = "Three friends contributed to a gift: ₱150.50, ₱125.75, and ₱98.25. What is the total contribution?",
                        options = listOf("₱374.50", "₱375.00", "₱375.50", "₱376.00"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 16,
                        text = "A recipe needs 1.25 cups of milk and 0.75 cups of cream. How much liquid in total?",
                        options = listOf("1.90 cups", "1.95 cups", "2.00 cups", "2.05 cups"),
                        correctAnswer = 2
                    ),
                    Question.MultipleChoice(
                        id = 17,
                        text = "The rainfall on Monday was 12.5 mm and on Tuesday was 8.75 mm. How much more rain fell on Monday?",
                        options = listOf("3.50 mm", "3.65 mm", "3.75 mm", "3.85 mm"),
                        correctAnswer = 2
                    ),
                    Question.MultipleChoice(
                        id = 18,
                        text = "A farmer harvested 125.75 kg of rice from one field and 98.5 kg from another. What is the total harvest?",
                        options = listOf("224.15 kg", "224.25 kg", "224.35 kg", "224.45 kg"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 19,
                        text = "A water tank contains 75.5 liters. After using 28.75 liters, how much water remains?",
                        options = listOf("46.50 L", "46.65 L", "46.75 L", "46.85 L"),
                        correctAnswer = 2
                    ),
                    Question.MultipleChoice(
                        id = 20,
                        text = "Tom's bag weighs 3.25 kg. After adding books weighing 1.85 kg, what is the total weight?",
                        options = listOf("5.00 kg", "5.05 kg", "5.10 kg", "5.15 kg"),
                        correctAnswer = 2
                    ),
                    Question.MultipleChoice(
                        id = 21,
                        text = "A piece of wood is 9.8 meters long. After cutting off 4.95 meters, how much remains?",
                        options = listOf("4.75 m", "4.80 m", "4.85 m", "4.90 m"),
                        correctAnswer = 2
                    ),
                    Question.MultipleChoice(
                        id = 22,
                        text = "Rosa spent ₱67.50 on groceries and ₱45.75 on transportation. How much did she spend in total?",
                        options = listOf("₱112.25", "₱113.00", "₱113.25", "₱113.50"),
                        correctAnswer = 2
                    ),
                    Question.MultipleChoice(
                        id = 23,
                        text = "A trail is 18.5 km long. If you have walked 9.75 km, how much further do you need to walk?",
                        options = listOf("8.50 km", "8.65 km", "8.75 km", "8.85 km"),
                        correctAnswer = 2
                    ),
                    Question.MultipleChoice(
                        id = 24,
                        text = "Two containers hold 15.5 liters and 12.75 liters of oil. What is the total amount of oil?",
                        options = listOf("28.15 L", "28.20 L", "28.25 L", "28.30 L"),
                        correctAnswer = 2
                    ),
                    Question.MultipleChoice(
                        id = 25,
                        text = "A shop sold items worth ₱1,250.50 in the morning and ₱875.75 in the afternoon. What were the total sales?",
                        options = listOf("₱2,125.25", "₱2,126.00", "₱2,126.25", "₱2,127.00"),
                        correctAnswer = 2
                    )
                )
            )
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

            // Activity 3: Decimal Multiplication Practice
            Activity(
                id = 3,
                quarter = 1,
                lessonNumber = 9,
                activityNumber = 3,
                title = "Multiplication of Decimals - Practice",
                type = ActivityType.DRAG_DROP,
                questions = listOf(
                    Question.DragDrop(
                        id = 1,
                        text = "Solve the multiplication problems in Column A and drag the correct answer from Column B.",
                        columnA = listOf(
                            "1.5 × 2 =",
                            "2.4 × 3 =",
                            "3.2 × 4 =",
                            "4.5 × 2 =",
                            "5.6 × 3 =",
                            "1.25 × 4 =",
                            "2.75 × 2 =",
                            "3.5 × 6 =",
                            "4.8 × 5 =",
                            "6.25 × 4 =",
                            "0.5 × 0.4 =",
                            "0.8 × 0.7 =",
                            "0.6 × 0.9 =",
                            "0.3 × 0.5 =",
                            "0.7 × 0.8 =",
                            "1.2 × 1.5 =",
                            "2.5 × 1.4 =",
                            "3.6 × 2.5 =",
                            "4.2 × 1.8 =",
                            "5.5 × 2.2 =",
                            "0.25 × 0.4 =",
                            "0.75 × 0.8 =",
                            "1.35 × 0.6 =",
                            "2.45 × 0.5 =",
                            "3.85 × 0.7 ="
                        ),
                        columnB = listOf(
                            "3",           // #1: 1.5 × 2 = 3
                            "7.2",         // #2: 2.4 × 3 = 7.2
                            "12.8",        // #3: 3.2 × 4 = 12.8
                            "9",           // #4: 4.5 × 2 = 9
                            "16.8",        // #5: 5.6 × 3 = 16.8
                            "5",           // #6: 1.25 × 4 = 5
                            "5.5",         // #7: 2.75 × 2 = 5.5
                            "21",          // #8: 3.5 × 6 = 21
                            "24",          // #9: 4.8 × 5 = 24
                            "25",          // #10: 6.25 × 4 = 25
                            "0.2",         // #11: 0.5 × 0.4 = 0.2
                            "0.56",        // #12: 0.8 × 0.7 = 0.56
                            "0.54",        // #13: 0.6 × 0.9 = 0.54
                            "0.15",        // #14: 0.3 × 0.5 = 0.15
                            "0.56",        // #15: 0.7 × 0.8 = 0.56
                            "1.8",         // #16: 1.2 × 1.5 = 1.8
                            "3.5",         // #17: 2.5 × 1.4 = 3.5
                            "9",           // #18: 3.6 × 2.5 = 9
                            "7.56",        // #19: 4.2 × 1.8 = 7.56
                            "12.1",        // #20: 5.5 × 2.2 = 12.1
                            "0.1",         // #21: 0.25 × 0.4 = 0.1
                            "0.6",         // #22: 0.75 × 0.8 = 0.6
                            "0.81",        // #23: 1.35 × 0.6 = 0.81
                            "1.225",       // #24: 2.45 × 0.5 = 1.225
                            "2.695"        // #25: 3.85 × 0.7 = 2.695
                        ),
                        correctMatches = mapOf(
                            0 to 0,   // 1.5 × 2 = 3
                            1 to 1,   // 2.4 × 3 = 7.2
                            2 to 2,   // 3.2 × 4 = 12.8
                            3 to 3,   // 4.5 × 2 = 9
                            4 to 4,   // 5.6 × 3 = 16.8
                            5 to 5,   // 1.25 × 4 = 5
                            6 to 6,   // 2.75 × 2 = 5.5
                            7 to 7,   // 3.5 × 6 = 21
                            8 to 8,   // 4.8 × 5 = 24
                            9 to 9,   // 6.25 × 4 = 25
                            10 to 10, // 0.5 × 0.4 = 0.2
                            11 to 11, // 0.8 × 0.7 = 0.56
                            12 to 12, // 0.6 × 0.9 = 0.54
                            13 to 13, // 0.3 × 0.5 = 0.15
                            14 to 14, // 0.7 × 0.8 = 0.56
                            15 to 15, // 1.2 × 1.5 = 1.8
                            16 to 16, // 2.5 × 1.4 = 3.5
                            17 to 17, // 3.6 × 2.5 = 9
                            18 to 18, // 4.2 × 1.8 = 7.56
                            19 to 19, // 5.5 × 2.2 = 12.1
                            20 to 20, // 0.25 × 0.4 = 0.1
                            21 to 21, // 0.75 × 0.8 = 0.6
                            22 to 22, // 1.35 × 0.6 = 0.81
                            23 to 23, // 2.45 × 0.5 = 1.225
                            24 to 24  // 3.85 × 0.7 = 2.695
                        )
                    )
                )
            )
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

            // Activity 3: Special Multiplication Patterns
            Activity(
                id = 3,
                quarter = 1,
                lessonNumber = 10,
                activityNumber = 3,
                title = "Special Multiplication Patterns with 0.1, 0.01, 10, and 100",
                type = ActivityType.WIRE_MATCHING,
                questions = listOf(
                    Question.WireMatching(
                        id = 1,
                        text = "Match the multiplication problems in Column A with their correct answers in Column B by drawing a line.",
                        columnA = listOf(
                            "0.25 × 0.1 =",
                            "0.38 × 0.1 =",
                            "0.56 × 0.1 =",
                            "0.72 × 0.1 =",
                            "0.85 × 0.1 =",
                            "0.18 × 0.01 =",
                            "0.42 × 0.01 =",
                            "0.61 × 0.01 =",
                            "0.88 × 0.01 =",
                            "0.95 × 0.01 =",
                            "0.16 × 10 =",
                            "0.27 × 10 =",
                            "0.35 × 10 =",
                            "0.48 × 10 =",
                            "0.59 × 10 =",
                            "0.03 × 100 =",
                            "0.14 × 100 =",
                            "0.26 × 100 =",
                            "0.37 × 100 =",
                            "0.45 × 100 =",
                            "1.5 × 0.1 =",
                            "2.8 × 0.01 =",
                            "3.6 × 10 =",
                            "4.2 × 100 =",
                            "5.7 × 0.1 ="
                        ),
                        columnB = listOf(
                            "0.025",      // #1: 0.25 × 0.1
                            "0.038",      // #2: 0.38 × 0.1
                            "0.056",      // #3: 0.56 × 0.1
                            "0.072",      // #4: 0.72 × 0.1
                            "0.085",      // #5: 0.85 × 0.1
                            "0.0018",     // #6: 0.18 × 0.01
                            "0.0042",     // #7: 0.42 × 0.01
                            "0.0061",     // #8: 0.61 × 0.01
                            "0.0088",     // #9: 0.88 × 0.01
                            "0.0095",     // #10: 0.95 × 0.01
                            "1.6",        // #11: 0.16 × 10
                            "2.7",        // #12: 0.27 × 10
                            "3.5",        // #13: 0.35 × 10
                            "4.8",        // #14: 0.48 × 10
                            "5.9",        // #15: 0.59 × 10
                            "3",          // #16: 0.03 × 100
                            "14",         // #17: 0.14 × 100
                            "26",         // #18: 0.26 × 100
                            "37",         // #19: 0.37 × 100
                            "45",         // #20: 0.45 × 100
                            "0.15",       // #21: 1.5 × 0.1
                            "0.028",      // #22: 2.8 × 0.01
                            "36",         // #23: 3.6 × 10
                            "420",        // #24: 4.2 × 100
                            "0.57"        // #25: 5.7 × 0.1
                        ),
                        correctMatches = mapOf(
                            0 to 0,   // 0.25 × 0.1 = 0.025
                            1 to 1,   // 0.38 × 0.1 = 0.038
                            2 to 2,   // 0.56 × 0.1 = 0.056
                            3 to 3,   // 0.72 × 0.1 = 0.072
                            4 to 4,   // 0.85 × 0.1 = 0.085
                            5 to 5,   // 0.18 × 0.01 = 0.0018
                            6 to 6,   // 0.42 × 0.01 = 0.0042
                            7 to 7,   // 0.61 × 0.01 = 0.0061
                            8 to 8,   // 0.88 × 0.01 = 0.0088
                            9 to 9,   // 0.95 × 0.01 = 0.0095
                            10 to 10, // 0.16 × 10 = 1.6
                            11 to 11, // 0.27 × 10 = 2.7
                            12 to 12, // 0.35 × 10 = 3.5
                            13 to 13, // 0.48 × 10 = 4.8
                            14 to 14, // 0.59 × 10 = 5.9
                            15 to 15, // 0.03 × 100 = 3
                            16 to 16, // 0.14 × 100 = 14
                            17 to 17, // 0.26 × 100 = 26
                            18 to 18, // 0.37 × 100 = 37
                            19 to 19, // 0.45 × 100 = 45
                            20 to 20, // 1.5 × 0.1 = 0.15
                            21 to 21, // 2.8 × 0.01 = 0.028
                            22 to 22, // 3.6 × 10 = 36
                            23 to 23, // 4.2 × 100 = 420
                            24 to 24  // 5.7 × 0.1 = 0.57
                        )
                    )
                )
            )
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

            // Activity 3: Word Problems - Multiplication of Decimals Including Money
            Activity(
                id = 3,
                quarter = 1,
                lessonNumber = 11,
                activityNumber = 3,
                title = "Word Problems Involving Multiplication of Decimals Including Money",
                type = ActivityType.MULTIPLE_CHOICE,
                questions = listOf(
                    Question.MultipleChoice(
                        id = 1,
                        text = "A notebook costs ₱25.50. How much do 4 notebooks cost?",
                        options = listOf("₱100.00", "₱101.50", "₱102.00", "₱102.50"),
                        correctAnswer = 2
                    ),
                    Question.MultipleChoice(
                        id = 2,
                        text = "A piece of cloth is 3.5 meters long. If you buy 6 pieces, what is the total length?",
                        options = listOf("20 m", "21 m", "22 m", "23 m"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 3,
                        text = "Each bottle of juice costs ₱12.75. How much do 5 bottles cost?",
                        options = listOf("₱62.75", "₱63.25", "₱63.75", "₱64.25"),
                        correctAnswer = 2
                    ),
                    Question.MultipleChoice(
                        id = 4,
                        text = "A box of chocolates weighs 2.25 kg. What is the total weight of 8 boxes?",
                        options = listOf("17 kg", "18 kg", "19 kg", "20 kg"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 5,
                        text = "Gasoline costs ₱58.50 per liter. How much does 12.5 liters cost?",
                        options = listOf("₱730.25", "₱731.00", "₱731.25", "₱732.00"),
                        correctAnswer = 2
                    ),
                    Question.MultipleChoice(
                        id = 6,
                        text = "A ribbon is sold at ₱8.25 per meter. How much does 7.5 meters cost?",
                        options = listOf("₱61.50", "₱61.75", "₱61.875", "₱62.00"),
                        correctAnswer = 2
                    ),
                    Question.MultipleChoice(
                        id = 7,
                        text = "Each kilogram of rice costs ₱45.75. How much does 3.5 kg cost?",
                        options = listOf("₱160.00", "₱160.125", "₱160.25", "₱160.625"),
                        correctAnswer = 3
                    ),
                    Question.MultipleChoice(
                        id = 8,
                        text = "A worker earns ₱125.50 per hour. How much does he earn in 8 hours?",
                        options = listOf("₱1,003.00", "₱1,004.00", "₱1,005.00", "₱1,006.00"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 9,
                        text = "A book costs ₱135.25. If you buy 6 books, how much do you pay?",
                        options = listOf("₱810.50", "₱811.00", "₱811.50", "₱812.00"),
                        correctAnswer = 2
                    ),
                    Question.MultipleChoice(
                        id = 10,
                        text = "Each meter of wire costs ₱15.80. How much does 9.5 meters cost?",
                        options = listOf("₱150.00", "₱150.10", "₱150.50", "₱150.10"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 11,
                        text = "A farmer harvests 12.75 kg of tomatoes per day. How much does he harvest in 7 days?",
                        options = listOf("89.00 kg", "89.25 kg", "89.50 kg", "89.25 kg"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 12,
                        text = "Each apple costs ₱18.50. How much do 15 apples cost?",
                        options = listOf("₱277.00", "₱277.50", "₱278.00", "₱278.50"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 13,
                        text = "A car travels 14.5 km per liter of fuel. How far can it travel with 8.5 liters?",
                        options = listOf("123.00 km", "123.25 km", "123.50 km", "123.25 km"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 14,
                        text = "Each kilogram of meat costs ₱285.50. How much does 2.5 kg cost?",
                        options = listOf("₱713.50", "₱713.75", "₱714.00", "₱714.25"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 15,
                        text = "A roll of fabric is 25.5 meters long. If you buy 3.5 rolls, what is the total length?",
                        options = listOf("89.00 m", "89.25 m", "89.50 m", "89.25 m"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 16,
                        text = "Each bottle of cooking oil costs ₱95.75. How much do 4 bottles cost?",
                        options = listOf("₱382.00", "₱383.00", "₱383.50", "₱384.00"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 17,
                        text = "A painter can paint 3.25 square meters per hour. How much can he paint in 6 hours?",
                        options = listOf("19.25 m²", "19.50 m²", "19.75 m²", "19.50 m²"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 18,
                        text = "Each liter of paint costs ₱175.50. How much do 5.5 liters cost?",
                        options = listOf("₱965.00", "₱965.25", "₱965.50", "₱965.75"),
                        correctAnswer = 3
                    ),
                    Question.MultipleChoice(
                        id = 19,
                        text = "A box of nails weighs 0.85 kg. What is the total weight of 12 boxes?",
                        options = listOf("10.0 kg", "10.2 kg", "10.4 kg", "10.6 kg"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 20,
                        text = "Each kilogram of fish costs ₱225.75. How much does 3.25 kg cost?",
                        options = listOf("₱733.00", "₱733.50", "₱733.6875", "₱734.00"),
                        correctAnswer = 2
                    ),
                    Question.MultipleChoice(
                        id = 21,
                        text = "A taxi charges ₱45.50 per kilometer. How much does a 12.5 km trip cost?",
                        options = listOf("₱568.50", "₱568.75", "₱569.00", "₱568.75"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 22,
                        text = "Each pack of coffee costs ₱68.25. How much do 9 packs cost?",
                        options = listOf("₱614.00", "₱614.25", "₱614.50", "₱614.25"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 23,
                        text = "A worker can make 6.5 items per hour. How many items can he make in 7.5 hours?",
                        options = listOf("48.50", "48.75", "49.00", "48.75"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 24,
                        text = "Each kilogram of sugar costs ₱52.50. How much does 8.5 kg cost?",
                        options = listOf("₱446.00", "₱446.25", "₱446.50", "₱446.25"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 25,
                        text = "A rope is sold at ₱12.75 per meter. How much does 15.5 meters cost?",
                        options = listOf("₱197.50", "₱197.625", "₱198.00", "₱197.625"),
                        correctAnswer = 1
                    )
                )
            )
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

            // Activity 3: Multi-Step Word Problems with Decimals and Money
            Activity(
                id = 3,
                quarter = 1,
                lessonNumber = 12,
                activityNumber = 3,
                title = "Multi-Step Problems with Decimals and Money",
                type = ActivityType.MULTIPLE_CHOICE,
                questions = listOf(
                    Question.MultipleChoice(
                        id = 1,
                        text = "Maria bought 3 notebooks at ₱25.50 each and 2 pens at ₱15.75 each. How much did she spend in total?",
                        options = listOf("₱108.00", "₱108.50", "₱108.00", "₱108.00"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 2,
                        text = "A store sold 5 shirts at ₱125.50 each and 3 pants at ₱275.75 each. What was the total sales?",
                        options = listOf("₱1,454.75", "₱1,454.50", "₱1,455.00", "₱1,455.25"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 3,
                        text = "John had ₱500. He bought 4 kg of rice at ₱45.50 per kg. How much money does he have left?",
                        options = listOf("₱318.00", "₱318.50", "₱318.00", "₱319.00"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 4,
                        text = "A baker used 2.5 kg of flour at ₱55.50 per kg and 1.5 kg of sugar at ₱65.75 per kg. What was the total cost?",
                        options = listOf("₱237.375", "₱237.50", "₱237.625", "₱238.00"),
                        correctAnswer = 2
                    ),
                    Question.MultipleChoice(
                        id = 5,
                        text = "Ana bought 6 bottles of juice at ₱18.25 each. She paid with ₱200. How much change did she receive?",
                        options = listOf("₱90.50", "₱90.75", "₱91.00", "₱90.50"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 6,
                        text = "A taxi ride costs ₱40 for the first km and ₱12.50 for each additional km. How much is a 9 km trip?",
                        options = listOf("₱140.00", "₱140.50", "₱140.00", "₱141.00"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 7,
                        text = "Rosa bought 3.5 meters of cloth at ₱85.50 per meter and paid ₱15.25 for thread. What was the total cost?",
                        options = listOf("₱314.50", "₱315.00", "₱314.50", "₱315.50"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 8,
                        text = "A worker earned ₱125.50 per hour for 8 hours and spent ₱275.75 on expenses. How much did he save?",
                        options = listOf("₱728.25", "₱728.50", "₱729.00", "₱728.25"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 9,
                        text = "Tom bought 4 books at ₱135.75 each and 2 pens at ₱22.50 each. How much did he spend?",
                        options = listOf("₱588.00", "₱588.50", "₱588.00", "₱589.00"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 10,
                        text = "A store sold 7 kg of apples at ₱95.25 per kg. The store gave a ₱50 discount. What was the final amount?",
                        options = listOf("₱616.75", "₱617.00", "₱617.25", "₱616.75"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 11,
                        text = "Lisa bought 2.5 kg of meat at ₱285.50 per kg and 1 kg of fish at ₱225.75. What was the total cost?",
                        options = listOf("₱939.50", "₱940.00", "₱939.50", "₱940.50"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 12,
                        text = "A farmer sold 12 kg of vegetables at ₱35.75 per kg and bought fertilizer for ₱185.50. How much profit did he make?",
                        options = listOf("₱243.50", "₱244.00", "₱243.50", "₱244.50"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 13,
                        text = "Pedro bought 5 liters of paint at ₱175.50 per liter. He paid with ₱1,000. How much change did he receive?",
                        options = listOf("₱122.50", "₱123.00", "₱122.50", "₱123.50"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 14,
                        text = "A restaurant bill shows 3 meals at ₱185.75 each and 2 drinks at ₱45.50 each. What is the total bill?",
                        options = listOf("₱648.25", "₱648.50", "₱649.00", "₱648.25"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 15,
                        text = "A shop owner bought 8 items at ₱125.25 each and sold them at ₱150.50 each. What was the total profit?",
                        options = listOf("₱202.00", "₱202.50", "₱202.00", "₱203.00"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 16,
                        text = "Carmen bought 4.5 kg of chicken at ₱165.50 per kg and 2 kg of pork at ₱195.75 per kg. What was the total cost?",
                        options = listOf("₱1,136.25", "₱1,136.50", "₱1,137.00", "₱1,136.25"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 17,
                        text = "A student bought 6 notebooks at ₱28.50 each and 3 pens at ₱18.75 each. She paid with ₱250. How much change?",
                        options = listOf("₱77.75", "₱78.00", "₱78.25", "₱77.75"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 18,
                        text = "A bakery sold 15 loaves of bread at ₱35.50 each and 10 cakes at ₱85.75 each. What was the total revenue?",
                        options = listOf("₱1,390.00", "₱1,390.50", "₱1,390.00", "₱1,391.00"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 19,
                        text = "Mark earned ₱1,500 and spent ₱275.50 on rent, ₱185.75 on food, and ₱125.25 on utilities. How much did he save?",
                        options = listOf("₱913.50", "₱914.00", "₱913.50", "₱914.50"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 20,
                        text = "A store bought 20 items at ₱65.75 each and sold 15 of them at ₱95.50 each. What was the profit from the 15 items sold?",
                        options = listOf("₱446.25", "₱446.50", "₱447.00", "₱446.25"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 21,
                        text = "Rita bought 3 meters of ribbon at ₱12.75 per meter and 5 meters of lace at ₱18.50 per meter. What was the total cost?",
                        options = listOf("₱130.75", "₱131.00", "₱130.75", "₱131.50"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 22,
                        text = "A gardener worked for 6.5 hours at ₱85.50 per hour and spent ₱125.75 on tools. How much money does he have left?",
                        options = listOf("₱430.00", "₱430.50", "₱430.00", "₱431.00"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 23,
                        text = "A family bought 8 kg of rice at ₱48.50 per kg and 3 kg of beans at ₱75.25 per kg. What was the total cost?",
                        options = listOf("₱613.75", "₱614.00", "₱614.25", "₱613.75"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 24,
                        text = "Jose bought 4 toys at ₱145.75 each. He received a ₱75 discount. How much did he pay?",
                        options = listOf("₱508.00", "₱508.50", "₱508.00", "₱509.00"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 25,
                        text = "A vendor sold 12 kg of fruits at ₱55.50 per kg in the morning and 8 kg at ₱65.75 per kg in the afternoon. What was the total sales?",
                        options = listOf("₱1,192.00", "₱1,192.50", "₱1,192.00", "₱1,193.00"),
                        correctAnswer = 0
                    )
                )
            )
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

            // Activity 3: Division of Decimals Practice
            Activity(
                id = 3,
                quarter = 1,
                lessonNumber = 13,
                activityNumber = 3,
                title = "Division of Decimals - Practice Problems",
                type = ActivityType.MULTIPLE_CHOICE,
                questions = listOf(
                    Question.MultipleChoice(
                        id = 1,
                        text = "10 ÷ 0.5 =",
                        options = listOf("20", "25", "15", "30"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 2,
                        text = "8 ÷ 0.4 =",
                        options = listOf("18", "20", "22", "24"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 3,
                        text = "12 ÷ 0.3 =",
                        options = listOf("35", "38", "40", "42"),
                        correctAnswer = 2
                    ),
                    Question.MultipleChoice(
                        id = 4,
                        text = "15 ÷ 0.25 =",
                        options = listOf("50", "55", "60", "65"),
                        correctAnswer = 2
                    ),
                    Question.MultipleChoice(
                        id = 5,
                        text = "20 ÷ 0.5 =",
                        options = listOf("35", "40", "45", "50"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 6,
                        text = "0.8 ÷ 4 =",
                        options = listOf("0.15", "0.2", "0.25", "0.3"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 7,
                        text = "0.6 ÷ 3 =",
                        options = listOf("0.15", "0.2", "0.25", "0.3"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 8,
                        text = "0.9 ÷ 5 =",
                        options = listOf("0.15", "0.18", "0.2", "0.25"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 9,
                        text = "1.2 ÷ 6 =",
                        options = listOf("0.15", "0.2", "0.25", "0.3"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 10,
                        text = "1.5 ÷ 5 =",
                        options = listOf("0.25", "0.3", "0.35", "0.4"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 11,
                        text = "0.24 ÷ 1.2 =",
                        options = listOf("0.15", "0.2", "0.25", "0.3"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 12,
                        text = "0.36 ÷ 1.8 =",
                        options = listOf("0.15", "0.2", "0.25", "0.3"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 13,
                        text = "0.45 ÷ 1.5 =",
                        options = listOf("0.25", "0.3", "0.35", "0.4"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 14,
                        text = "0.56 ÷ 2.8 =",
                        options = listOf("0.15", "0.2", "0.25", "0.3"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 15,
                        text = "0.72 ÷ 3.6 =",
                        options = listOf("0.15", "0.2", "0.25", "0.3"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 16,
                        text = "4 ÷ 0.2 =",
                        options = listOf("15", "20", "25", "30"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 17,
                        text = "6 ÷ 0.3 =",
                        options = listOf("15", "20", "25", "30"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 18,
                        text = "9 ÷ 0.45 =",
                        options = listOf("18", "20", "22", "24"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 19,
                        text = "16 ÷ 0.8 =",
                        options = listOf("18", "20", "22", "24"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 20,
                        text = "24 ÷ 0.6 =",
                        options = listOf("35", "40", "45", "50"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 21,
                        text = "0.4 ÷ 2 =",
                        options = listOf("0.15", "0.2", "0.25", "0.3"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 22,
                        text = "0.75 ÷ 3 =",
                        options = listOf("0.2", "0.25", "0.3", "0.35"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 23,
                        text = "1.6 ÷ 8 =",
                        options = listOf("0.15", "0.2", "0.25", "0.3"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 24,
                        text = "2.1 ÷ 7 =",
                        options = listOf("0.25", "0.3", "0.35", "0.4"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 25,
                        text = "3.2 ÷ 4 =",
                        options = listOf("0.7", "0.8", "0.9", "1.0"),
                        correctAnswer = 1
                    )
                )
            )
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

            // Activity 3: Division by Special Numbers - Pattern Recognition
            Activity(
                id = 3,
                quarter = 1,
                lessonNumber = 14,
                activityNumber = 3,
                title = "Division Patterns with 0.1, 0.01, 10, 100, and 1000",
                type = ActivityType.WIRE_MATCHING,
                questions = listOf(
                    Question.WireMatching(
                        id = 1,
                        text = "Match the division problems in Column A with their correct answers in Column B by drawing a line.",
                        columnA = listOf(
                            "0.5 ÷ 0.1 =",
                            "0.8 ÷ 0.1 =",
                            "0.3 ÷ 0.1 =",
                            "0.6 ÷ 0.1 =",
                            "0.9 ÷ 0.1 =",
                            "0.25 ÷ 0.01 =",
                            "0.48 ÷ 0.01 =",
                            "0.72 ÷ 0.01 =",
                            "0.36 ÷ 0.01 =",
                            "0.91 ÷ 0.01 =",
                            "5.5 ÷ 10 =",
                            "8.2 ÷ 10 =",
                            "3.7 ÷ 10 =",
                            "6.4 ÷ 10 =",
                            "9.1 ÷ 10 =",
                            "25.5 ÷ 100 =",
                            "48.6 ÷ 100 =",
                            "72.3 ÷ 100 =",
                            "36.8 ÷ 100 =",
                            "91.4 ÷ 100 =",
                            "125 ÷ 1000 =",
                            "450 ÷ 1000 =",
                            "780 ÷ 1000 =",
                            "320 ÷ 1000 =",
                            "650 ÷ 1000 ="
                        ),
                        columnB = listOf(
                            "5",          // #1: 0.5 ÷ 0.1
                            "8",          // #2: 0.8 ÷ 0.1
                            "3",          // #3: 0.3 ÷ 0.1
                            "6",          // #4: 0.6 ÷ 0.1
                            "9",          // #5: 0.9 ÷ 0.1
                            "25",         // #6: 0.25 ÷ 0.01
                            "48",         // #7: 0.48 ÷ 0.01
                            "72",         // #8: 0.72 ÷ 0.01
                            "36",         // #9: 0.36 ÷ 0.01
                            "91",         // #10: 0.91 ÷ 0.01
                            "0.55",       // #11: 5.5 ÷ 10
                            "0.82",       // #12: 8.2 ÷ 10
                            "0.37",       // #13: 3.7 ÷ 10
                            "0.64",       // #14: 6.4 ÷ 10
                            "0.91",       // #15: 9.1 ÷ 10
                            "0.255",      // #16: 25.5 ÷ 100
                            "0.486",      // #17: 48.6 ÷ 100
                            "0.723",      // #18: 72.3 ÷ 100
                            "0.368",      // #19: 36.8 ÷ 100
                            "0.914",      // #20: 91.4 ÷ 100
                            "0.125",      // #21: 125 ÷ 1000
                            "0.45",       // #22: 450 ÷ 1000
                            "0.78",       // #23: 780 ÷ 1000
                            "0.32",       // #24: 320 ÷ 1000
                            "0.65"        // #25: 650 ÷ 1000
                        ),
                        correctMatches = mapOf(
                            0 to 0,   // 0.5 ÷ 0.1 = 5
                            1 to 1,   // 0.8 ÷ 0.1 = 8
                            2 to 2,   // 0.3 ÷ 0.1 = 3
                            3 to 3,   // 0.6 ÷ 0.1 = 6
                            4 to 4,   // 0.9 ÷ 0.1 = 9
                            5 to 5,   // 0.25 ÷ 0.01 = 25
                            6 to 6,   // 0.48 ÷ 0.01 = 48
                            7 to 7,   // 0.72 ÷ 0.01 = 72
                            8 to 8,   // 0.36 ÷ 0.01 = 36
                            9 to 9,   // 0.91 ÷ 0.01 = 91
                            10 to 10, // 5.5 ÷ 10 = 0.55
                            11 to 11, // 8.2 ÷ 10 = 0.82
                            12 to 12, // 3.7 ÷ 10 = 0.37
                            13 to 13, // 6.4 ÷ 10 = 0.64
                            14 to 14, // 9.1 ÷ 10 = 0.91
                            15 to 15, // 25.5 ÷ 100 = 0.255
                            16 to 16, // 48.6 ÷ 100 = 0.486
                            17 to 17, // 72.3 ÷ 100 = 0.723
                            18 to 18, // 36.8 ÷ 100 = 0.368
                            19 to 19, // 91.4 ÷ 100 = 0.914
                            20 to 20, // 125 ÷ 1000 = 0.125
                            21 to 21, // 450 ÷ 1000 = 0.45
                            22 to 22, // 780 ÷ 1000 = 0.78
                            23 to 23, // 320 ÷ 1000 = 0.32
                            24 to 24  // 650 ÷ 1000 = 0.65
                        )
                    )
                )
            )
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

            // Activity 3: Classifying Numbers
            Activity(
                id = 3,
                quarter = 1,
                lessonNumber = 15,
                activityNumber = 3,
                title = "Classify Numbers as Rational or Irrational",
                type = ActivityType.WIRE_MATCHING,
                questions = listOf(
                    Question.WireMatching(
                        id = 1,
                        text = "Match each number in Column A with its classification in Column B by drawing a line.",
                        columnA = listOf(
                            "0.25",
                            "√16",
                            "π/2",
                            "5/8",
                            "√10",
                            "1.333...",
                            "√25",
                            "2π",
                            "7/9",
                            "√11",
                            "0.125",
                            "√36",
                            "e²",
                            "11/13",
                            "√15",
                            "0.5",
                            "√49",
                            "3√2",
                            "9/10",
                            "√20",
                            "2.75",
                            "√64",
                            "π + 1",
                            "13/15",
                            "√30"
                        ),
                        columnB = listOf(
                            "Rational",      // #1: 0.25
                            "Rational",      // #2: √16 = 4
                            "Irrational",    // #3: π/2
                            "Rational",      // #4: 5/8
                            "Irrational",    // #5: √10
                            "Rational",      // #6: 1.333...
                            "Rational",      // #7: √25 = 5
                            "Irrational",    // #8: 2π
                            "Rational",      // #9: 7/9
                            "Irrational",    // #10: √11
                            "Rational",      // #11: 0.125
                            "Rational",      // #12: √36 = 6
                            "Irrational",    // #13: e²
                            "Rational",      // #14: 11/13
                            "Irrational",    // #15: √15
                            "Rational",      // #16: 0.5
                            "Rational",      // #17: √49 = 7
                            "Irrational",    // #18: 3√2
                            "Rational",      // #19: 9/10
                            "Irrational",    // #20: √20
                            "Rational",      // #21: 2.75
                            "Rational",      // #22: √64 = 8
                            "Irrational",    // #23: π + 1
                            "Rational",      // #24: 13/15
                            "Irrational"     // #25: √30
                        ),
                        correctMatches = mapOf(
                            0 to 0,   // 0.25 → Rational
                            1 to 1,   // √16 → Rational
                            2 to 2,   // π/2 → Irrational
                            3 to 3,   // 5/8 → Rational
                            4 to 4,   // √10 → Irrational
                            5 to 5,   // 1.333... → Rational
                            6 to 6,   // √25 → Rational
                            7 to 7,   // 2π → Irrational
                            8 to 8,   // 7/9 → Rational
                            9 to 9,   // √11 → Irrational
                            10 to 10, // 0.125 → Rational
                            11 to 11, // √36 → Rational
                            12 to 12, // e² → Irrational
                            13 to 13, // 11/13 → Rational
                            14 to 14, // √15 → Irrational
                            15 to 15, // 0.5 → Rational
                            16 to 16, // √49 → Rational
                            17 to 17, // 3√2 → Irrational
                            18 to 18, // 9/10 → Rational
                            19 to 19, // √20 → Irrational
                            20 to 20, // 2.75 → Rational
                            21 to 21, // √64 → Rational
                            22 to 22, // π + 1 → Irrational
                            23 to 23, // 13/15 → Rational
                            24 to 24  // √30 → Irrational
                        )
                    )
                )
            )
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

            // Activity 3: Word Problems - Division of Decimals and Money
            Activity(
                id = 3,
                quarter = 1,
                lessonNumber = 16,
                activityNumber = 3,
                title = "Word Problems Involving Division of Decimals and Money",
                type = ActivityType.MULTIPLE_CHOICE,
                questions = listOf(
                    Question.MultipleChoice(
                        id = 1,
                        text = "A 12.5 meter rope is cut into 5 equal pieces. How long is each piece?",
                        options = listOf("2.4 m", "2.5 m", "2.6 m", "2.7 m"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 2,
                        text = "₱450 is divided equally among 6 people. How much does each person receive?",
                        options = listOf("₱75", "₱80", "₱85", "₱90"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 3,
                        text = "A 15.6 kg bag of rice is divided equally into 4 smaller bags. How much rice is in each bag?",
                        options = listOf("3.8 kg", "3.9 kg", "4.0 kg", "4.1 kg"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 4,
                        text = "₱1,250 is shared equally among 8 workers. How much does each worker get?",
                        options = listOf("₱156.00", "₱156.25", "₱157.00", "₱157.50"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 5,
                        text = "A 25.5 liter tank of water is poured equally into 5 containers. How much water is in each container?",
                        options = listOf("5.0 L", "5.1 L", "5.2 L", "5.3 L"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 6,
                        text = "₱875.50 is divided equally among 7 children. How much does each child receive?",
                        options = listOf("₱125.00", "₱125.07", "₱125.50", "₱126.00"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 7,
                        text = "A 48.6 meter fence is divided into 9 equal sections. How long is each section?",
                        options = listOf("5.2 m", "5.3 m", "5.4 m", "5.5 m"),
                        correctAnswer = 2
                    ),
                    Question.MultipleChoice(
                        id = 8,
                        text = "₱2,400 is split equally among 15 employees. How much does each employee get?",
                        options = listOf("₱150", "₱155", "₱160", "₱165"),
                        correctAnswer = 2
                    ),
                    Question.MultipleChoice(
                        id = 9,
                        text = "A 36.4 kg crate is divided into 8 equal portions. How much does each portion weigh?",
                        options = listOf("4.4 kg", "4.5 kg", "4.55 kg", "4.6 kg"),
                        correctAnswer = 2
                    ),
                    Question.MultipleChoice(
                        id = 10,
                        text = "₱567.50 is shared equally among 5 people. How much does each person receive?",
                        options = listOf("₱113.00", "₱113.50", "₱114.00", "₱114.50"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 11,
                        text = "A 72.8 meter road is divided into 4 equal parts. How long is each part?",
                        options = listOf("18.0 m", "18.2 m", "18.4 m", "18.6 m"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 12,
                        text = "₱1,836 is divided equally among 12 students. How much does each student get?",
                        options = listOf("₱150", "₱152", "₱153", "₱155"),
                        correctAnswer = 2
                    ),
                    Question.MultipleChoice(
                        id = 13,
                        text = "A 91.2 liter container is split equally into 6 bottles. How much is in each bottle?",
                        options = listOf("15.0 L", "15.2 L", "15.4 L", "15.6 L"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 14,
                        text = "₱3,250.50 is shared equally among 10 people. How much does each person receive?",
                        options = listOf("₱325.00", "₱325.05", "₱325.50", "₱326.00"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 15,
                        text = "A 56.7 kg sack is divided into 9 equal portions. How much does each portion weigh?",
                        options = listOf("6.2 kg", "6.3 kg", "6.4 kg", "6.5 kg"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 16,
                        text = "₱945 is divided equally among 7 workers. How much does each worker get?",
                        options = listOf("₱133", "₱134", "₱135", "₱136"),
                        correctAnswer = 2
                    ),
                    Question.MultipleChoice(
                        id = 17,
                        text = "A 84.5 meter wire is cut into 5 equal pieces. How long is each piece?",
                        options = listOf("16.7 m", "16.8 m", "16.9 m", "17.0 m"),
                        correctAnswer = 2
                    ),
                    Question.MultipleChoice(
                        id = 18,
                        text = "₱2,184 is shared equally among 8 families. How much does each family receive?",
                        options = listOf("₱271", "₱272", "₱273", "₱274"),
                        correctAnswer = 2
                    ),
                    Question.MultipleChoice(
                        id = 19,
                        text = "A 120.6 liter tank is divided equally into 6 containers. How much is in each container?",
                        options = listOf("20.0 L", "20.1 L", "20.2 L", "20.3 L"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 20,
                        text = "₱1,575 is split equally among 9 people. How much does each person get?",
                        options = listOf("₱173", "₱174", "₱175", "₱176"),
                        correctAnswer = 2
                    ),
                    Question.MultipleChoice(
                        id = 21,
                        text = "A 67.2 kg load is divided into 8 equal parts. How much does each part weigh?",
                        options = listOf("8.2 kg", "8.3 kg", "8.4 kg", "8.5 kg"),
                        correctAnswer = 2
                    ),
                    Question.MultipleChoice(
                        id = 22,
                        text = "₱4,200 is shared equally among 12 employees. How much does each employee receive?",
                        options = listOf("₱340", "₱345", "₱350", "₱355"),
                        correctAnswer = 2
                    ),
                    Question.MultipleChoice(
                        id = 23,
                        text = "A 98.4 meter path is divided into 12 equal sections. How long is each section?",
                        options = listOf("8.0 m", "8.1 m", "8.2 m", "8.3 m"),
                        correctAnswer = 2
                    ),
                    Question.MultipleChoice(
                        id = 24,
                        text = "₱6,825 is divided equally among 15 winners. How much does each winner get?",
                        options = listOf("₱450", "₱455", "₱460", "₱465"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 25,
                        text = "A 156.8 liter barrel is split equally into 8 containers. How much is in each container?",
                        options = listOf("19.4 L", "19.5 L", "19.6 L", "19.7 L"),
                        correctAnswer = 2
                    )
                )
            )
        )
    }

    private fun getQuarter1Lesson17Activities(): List<Activity> {
        return listOf(
            // Activity 1: Routine and Non-Routine Problems - Any Operations including Decimals, Whole Numbers and Money (Video-based)
            Activity(
                id = 1,
                quarter = 1,
                lessonNumber = 17,
                activityNumber = 1,
                title = "Routine or Non-routine Problems Involving Any of the Operations Including any Decimals, Whole Numbers and Money",
                type = ActivityType.ROUTINE_PROBLEM,
                questions = listOf(
                    Question.RoutineProblem(
                        id = 1,
                        text = "",
                        videoFileName = "activity_1-n1.mp4",
                        description = "Routine or Non-routine Problems Involving Any of the Operations Including any Decimals, Whole Numbers and Money"
                    ),
                    Question.RoutineProblem(
                        id = 2,
                        text = "",
                        videoFileName = "activity_1-n2.mp4",
                        description = "Routine or Non-routine Problems Involving Any of the Operations Including any Decimals, Whole Numbers and Money"
                    ),
                    Question.RoutineProblem(
                        id = 3,
                        text = "",
                        videoFileName = "activity_1-n3.mp4",
                        description = "Routine or Non-routine Problems Involving Any of the Operations Including any Decimals, Whole Numbers and Money"
                    ),
                    Question.RoutineProblem(
                        id = 4,
                        text = "",
                        videoFileName = "activity_1-n4.mp4",
                        description = "Routine or Non-routine Problems Involving Any of the Operations Including any Decimals, Whole Numbers and Money"
                    ),
                    Question.RoutineProblem(
                        id = 5,
                        text = "",
                        videoFileName = "activity_1-n5.mp4",
                        description = "Routine or Non-routine Problems Involving Any of the Operations Including any Decimals, Whole Numbers and Money"
                    ),
                    Question.RoutineProblem(
                        id = 6,
                        text = "",
                        videoFileName = "activity_1-n6.mp4",
                        description = "Routine or Non-routine Problems Involving Any of the Operations Including any Decimals, Whole Numbers and Money"
                    ),
                    Question.RoutineProblem(
                        id = 7,
                        text = "",
                        videoFileName = "activity_1-n7.mp4",
                        description = "Routine or Non-routine Problems Involving Any of the Operations Including any Decimals, Whole Numbers and Money"
                    ),
                )
            ),


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

            // Activity 3: Mixed Operations with Decimals and Money
            Activity(
                id = 3,
                quarter = 1,
                lessonNumber = 17,
                activityNumber = 3,
                title = "Mixed Operations - Practice Problems",
                type = ActivityType.DRAG_DROP,
                questions = listOf(
                    Question.DragDrop(
                        id = 1,
                        text = "Solve the following problems and drag the correct answer from Column B to Column A.",
                        columnA = listOf(
                            "12.5 + 8.75 =",
                            "25.6 - 9.85 =",
                            "4.5 × 6 =",
                            "36 ÷ 1.5 =",
                            "15.75 + 12.25 =",
                            "50 - 18.65 =",
                            "7.2 × 5 =",
                            "48.6 ÷ 2 =",
                            "22.45 + 17.55 =",
                            "100 - 37.25 =",
                            "8.4 × 3 =",
                            "75 ÷ 2.5 =",
                            "18.75 + 21.25 =",
                            "65.8 - 28.9 =",
                            "9.5 × 4 =",
                            "84 ÷ 3.5 =",
                            "32.6 + 27.4 =",
                            "90 - 45.75 =",
                            "6.8 × 7 =",
                            "96 ÷ 4.8 =",
                            "45.5 + 34.5 =",
                            "120 - 56.25 =",
                            "5.6 × 8 =",
                            "72 ÷ 1.8 =",
                            "28.75 + 31.25 ="
                        ),
                        columnB = listOf(
                            "21.25",       // #1: 12.5 + 8.75
                            "15.75",       // #2: 25.6 - 9.85
                            "27",          // #3: 4.5 × 6
                            "24",          // #4: 36 ÷ 1.5
                            "28",          // #5: 15.75 + 12.25
                            "31.35",       // #6: 50 - 18.65
                            "36",          // #7: 7.2 × 5
                            "24.3",        // #8: 48.6 ÷ 2
                            "40",          // #9: 22.45 + 17.55
                            "62.75",       // #10: 100 - 37.25
                            "25.2",        // #11: 8.4 × 3
                            "30",          // #12: 75 ÷ 2.5
                            "40",          // #13: 18.75 + 21.25
                            "36.9",        // #14: 65.8 - 28.9
                            "38",          // #15: 9.5 × 4
                            "24",          // #16: 84 ÷ 3.5
                            "60",          // #17: 32.6 + 27.4
                            "44.25",       // #18: 90 - 45.75
                            "47.6",        // #19: 6.8 × 7
                            "20",          // #20: 96 ÷ 4.8
                            "80",          // #21: 45.5 + 34.5
                            "63.75",       // #22: 120 - 56.25
                            "44.8",        // #23: 5.6 × 8
                            "40",          // #24: 72 ÷ 1.8
                            "60"           // #25: 28.75 + 31.25
                        ),
                        correctMatches = mapOf(
                            0 to 0,   // 12.5 + 8.75 = 21.25
                            1 to 1,   // 25.6 - 9.85 = 15.75
                            2 to 2,   // 4.5 × 6 = 27
                            3 to 3,   // 36 ÷ 1.5 = 24
                            4 to 4,   // 15.75 + 12.25 = 28
                            5 to 5,   // 50 - 18.65 = 31.35
                            6 to 6,   // 7.2 × 5 = 36
                            7 to 7,   // 48.6 ÷ 2 = 24.3
                            8 to 8,   // 22.45 + 17.55 = 40
                            9 to 9,   // 100 - 37.25 = 62.75
                            10 to 10, // 8.4 × 3 = 25.2
                            11 to 11, // 75 ÷ 2.5 = 30
                            12 to 12, // 18.75 + 21.25 = 40
                            13 to 13, // 65.8 - 28.9 = 36.9
                            14 to 14, // 9.5 × 4 = 38
                            15 to 15, // 84 ÷ 3.5 = 24
                            16 to 16, // 32.6 + 27.4 = 60
                            17 to 17, // 90 - 45.75 = 44.25
                            18 to 18, // 6.8 × 7 = 47.6
                            19 to 19, // 96 ÷ 4.8 = 20
                            20 to 20, // 45.5 + 34.5 = 80
                            21 to 21, // 120 - 56.25 = 63.75
                            22 to 22, // 5.6 × 8 = 44.8
                            23 to 23, // 72 ÷ 1.8 = 40
                            24 to 24  // 28.75 + 31.25 = 60
                        )
                    )
                )
            )
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
            Activity(
                id = 2,
                quarter = 3,
                lessonNumber = 6,
                activityNumber = 2,
                title = "Routine or Non-routine Problems Involving Any of the Operations Including any Decimals, Whole Numbers and Money",
                type = ActivityType.ROUTINE_PROBLEM,
                questions = listOf(
                    Question.RoutineProblem(
                        id = 1,
                        text = "",
                        videoFileName = "activity_2-n1.mp4",
                        description = "Routine or Non-routine Problems Involving Any of the Operations Including any Decimals, Whole Numbers and Money"
                    ),
                    Question.RoutineProblem(
                        id = 2,
                        text = "",
                        videoFileName = "activity_2-n2.mp4",
                        description = "Routine or Non-routine Problems Involving Any of the Operations Including any Decimals, Whole Numbers and Money"
                    ),
                    Question.RoutineProblem(
                        id = 3,
                        text = "",
                        videoFileName = "activity_2-n3.mp4",
                        description = "Routine or Non-routine Problems Involving Any of the Operations Including any Decimals, Whole Numbers and Money"
                    ),
                    Question.RoutineProblem(
                        id = 4,
                        text = "",
                        videoFileName = "activity_2-n4.mp4",
                        description = "Routine or Non-routine Problems Involving Any of the Operations Including any Decimals, Whole Numbers and Money"
                    ),
                    Question.RoutineProblem(
                        id = 5,
                        text = "",
                        videoFileName = "activity_2-n5.mp4",
                        description = "Routine or Non-routine Problems Involving Any of the Operations Including any Decimals, Whole Numbers and Money"
                    ),
                    Question.RoutineProblem(
                        id = 6,
                        text = "",
                        videoFileName = "activity_2-n6.mp4",
                        description = "Routine or Non-routine Problems Involving Any of the Operations Including any Decimals, Whole Numbers and Money"
                    ),
                    Question.RoutineProblem(
                        id = 7,
                        text = "",
                        videoFileName = "activity_2-n7.mp4",
                        description = "Routine or Non-routine Problems Involving Any of the Operations Including any Decimals, Whole Numbers and Money"
                    ),
                )
            ),
        )
    }

    private fun getQuarter3Lesson7Activities(): List<Activity> {
        return listOf(
            // Activity 1: Solid Figures
            Activity(
                id = 1,
                quarter = 3,
                lessonNumber = 7,
                activityNumber = 1,
                title = "Solid Figures",
                type = ActivityType.MULTIPLE_CHOICE,
                questions = listOf(
                    Question.MultipleChoice(
                        id = 1,
                        text = "What shape is this?",
                        imageUrl = "solid_figure_cube",
                        options = listOf("Cube", "Cylinder", "Sphere", "Cone"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 2,
                        text = "What shape is this?",
                        imageUrl = "solid_figure_rectangular_prism",
                        options = listOf("Cube", "Rectangular Prism", "Tetrahedron", "Cylinder"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 3,
                        text = "What shape is this?",
                        imageUrl = "solid_figure_triangular_prism",
                        options = listOf("Triangular Prism", "Cone", "Square Pyramid", "Sphere"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 4,
                        text = "What shape is this?",
                        imageUrl = "solid_figure_pentagonal_prism",
                        options = listOf("Cylinder", "Pentagonal Prism", "Hexagonal Pyramid", "Octahedron"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 5,
                        text = "What shape is this?",
                        imageUrl = "solid_figure_hexagonal_prism",
                        options = listOf("Sphere", "Hexagonal Prism", "Triangular Pyramid", "Cone"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 6,
                        text = "What shape is this?",
                        imageUrl = "solid_figure_cylinder",
                        options = listOf("Cube", "Cone", "Cylinder", "Triangular Prism"),
                        correctAnswer = 2
                    ),
                    Question.MultipleChoice(
                        id = 7,
                        text = "What shape is this?",
                        imageUrl = "solid_figure_cone",
                        options = listOf("Sphere", "Cube", "Cone", "Cylinder"),
                        correctAnswer = 2
                    ),
                    Question.MultipleChoice(
                        id = 8,
                        text = "What shape is this?",
                        imageUrl = "solid_figure_sphere",
                        options = listOf("Cube", "Rectangular Prism", "Sphere", "Cylinder"),
                        correctAnswer = 2
                    ),
                    Question.MultipleChoice(
                        id = 9,
                        text = "What shape is this?",
                        imageUrl = "solid_figure_square_pyramid",
                        options = listOf("Square Pyramid", "Cube", "Triangular Prism", "Sphere"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 10,
                        text = "What shape is this?",
                        imageUrl = "solid_figure_tetrahedron",
                        options = listOf("Cylinder", "Tetrahedron", "Hexagonal Prism", "Octahedron"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 11,
                        text = "What shape is this?",
                        imageUrl = "solid_figure_pentagonal_pyramid",
                        options = listOf("Cone", "Cylinder", "Pentagonal Pyramid", "Triangular Prism"),
                        correctAnswer = 2
                    ),
                    Question.MultipleChoice(
                        id = 12,
                        text = "What shape is this?",
                        imageUrl = "solid_figure_hexagonal_pyramid",
                        options = listOf("Cube", "Hexagonal Pyramid", "Sphere", "Trapezoidal Prism"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 13,
                        text = "What shape is this?",
                        imageUrl = "solid_figure_octahedron",
                        options = listOf("Octahedron", "Rectangular Prism", "Cone", "Cube"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 14,
                        text = "What shape is this?",
                        imageUrl = "solid_figure_dodecahedron",
                        options = listOf("Tetrahedron", "Dodecahedron", "Cylinder", "Hemisphere"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 15,
                        text = "What shape is this?",
                        imageUrl = "solid_figure_icosahedron",
                        options = listOf("Cone", "Cube", "Icosahedron", "Sphere"),
                        correctAnswer = 2
                    ),
                    Question.MultipleChoice(
                        id = 16,
                        text = "What shape is this?",
                        imageUrl = "solid_figure_torus",
                        options = listOf("Cylinder", "Torus", "Cube", "Octahedron"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 17,
                        text = "What shape is this?",
                        imageUrl = "solid_figure_frustum",
                        options = listOf("Cylinder", "Frustum", "Sphere", "Tetrahedron"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 18,
                        text = "What shape is this?",
                        imageUrl = "solid_figure_ellipsoid",
                        options = listOf("Cube", "Ellipsoid", "Octahedron", "Cone"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 19,
                        text = "What shape is this?",
                        imageUrl = "solid_figure_oblate_spheroid",
                        options = listOf("Rectangular Prism", "Sphere", "Oblate Spheroid", "Hexagonal Pyramid"),
                        correctAnswer = 2
                    ),
                    Question.MultipleChoice(
                        id = 20,
                        text = "What shape is this?",
                        imageUrl = "solid_figure_parallelepiped",
                        options = listOf("Cube", "Parallelepiped", "Cylinder", "Torus"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 21,
                        text = "What shape is this?",
                        imageUrl = "solid_figure_bicone",
                        options = listOf("Bicone", "Cone", "Cube", "Sphere"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 22,
                        text = "What shape is this?",
                        imageUrl = "solid_figure_hemisphere",
                        options = listOf("Cone", "Hemisphere", "Torus", "Cylinder"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 23,
                        text = "What shape is this?",
                        imageUrl = "solid_figure_rhombic_dodecahedron",
                        options = listOf("Rhombic Dodecahedron", "Octahedron", "Cube", "Sphere"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 24,
                        text = "What shape is this?",
                        imageUrl = "solid_figure_trapezoidal_prism",
                        options = listOf("Cylinder", "Cube", "Trapezoidal Prism", "Hexagonal Pyramid"),
                        correctAnswer = 2
                    ),
                    Question.MultipleChoice(
                        id = 25,
                        text = "What shape is this?",
                        imageUrl = "solid_figure_hyperboloid",
                        options = listOf("Torus", "Hyperboloid", "Cube", "Sphere"),
                        correctAnswer = 1
                    )
                )
            ),

            // Activity 2: Sides
            Activity(
                id = 2,
                quarter = 3,
                lessonNumber = 7,
                activityNumber = 2,
                title = "Sides",
                type = ActivityType.MULTIPLE_CHOICE,
                questions = listOf(
                    Question.MultipleChoice(
                        id = 1,
                        text = "Does this shape have 6 sides?",
                        imageUrl = "sides_q1",
                        options = listOf("True", "False"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 2,
                        text = "Does this shape have 3 sides?",
                        imageUrl = "sides_q2",
                        options = listOf("True", "False"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 3,
                        text = "Does this shape have 4 sides?",
                        imageUrl = "sides_q3",
                        options = listOf("True", "False"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 4,
                        text = "Does this shape have 6 sides?",
                        imageUrl = "sides_q4",
                        options = listOf("True", "False"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 5,
                        text = "Does this shape have 6 sides?",
                        imageUrl = "sides_q5",
                        options = listOf("True", "False"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 6,
                        text = "Does this shape have 8 sides?",
                        imageUrl = "sides_q6",
                        options = listOf("True", "False"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 7,
                        text = "Does this shape have 3 sides?",
                        imageUrl = "sides_q7",
                        options = listOf("True", "False"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 8,
                        text = "Does this shape have 5 sides?",
                        imageUrl = "sides_q8",
                        options = listOf("True", "False"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 9,
                        text = "Does this shape have 2 sides?",
                        imageUrl = "sides_q9",
                        options = listOf("True", "False"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 10,
                        text = "Does this shape have 4 sides?",
                        imageUrl = "sides_q10",
                        options = listOf("True", "False"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 11,
                        text = "Does this shape have 10 sides?",
                        imageUrl = "sides_q11",
                        options = listOf("True", "False"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 12,
                        text = "Does this shape have 6 sides?",
                        imageUrl = "sides_q12",
                        options = listOf("True", "False"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 13,
                        text = "Does this shape have 5 sides?",
                        imageUrl = "sides_q13",
                        options = listOf("True", "False"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 14,
                        text = "Does this shape have 12 sides?",
                        imageUrl = "sides_q14",
                        options = listOf("True", "False"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 15,
                        text = "Does this shape have 3 sides?",
                        imageUrl = "sides_q15",
                        options = listOf("True", "False"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 16,
                        text = "Does this shape have 3 sides?",
                        imageUrl = "sides_q16",
                        options = listOf("True", "False"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 17,
                        text = "Does this shape have 4 sides?",
                        imageUrl = "sides_q17",
                        options = listOf("True", "False"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 18,
                        text = "Does this shape have 6 sides?",
                        imageUrl = "sides_q18",
                        options = listOf("True", "False"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 19,
                        text = "Does this shape have 6 sides?",
                        imageUrl = "sides_q19",
                        options = listOf("True", "False"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 20,
                        text = "Does this shape have 2 sides?",
                        imageUrl = "sides_q20",
                        options = listOf("True", "False"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 21,
                        text = "Does this shape have 1 side?",
                        imageUrl = "sides_q21",
                        options = listOf("True", "False"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 22,
                        text = "Does this shape have 1 side?",
                        imageUrl = "sides_q22",
                        options = listOf("True", "False"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 23,
                        text = "Does this shape have no side?",
                        imageUrl = "sides_q23",
                        options = listOf("True", "False"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 24,
                        text = "Does this shape have no side?",
                        imageUrl = "sides_q24",
                        options = listOf("True", "False"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 25,
                        text = "Does this shape have 3 sides?",
                        imageUrl = "sides_q25",
                        options = listOf("True", "False"),
                        correctAnswer = 1
                    )
                )
            )
        )
    }

    private fun getQuarter3Lesson8Activities(): List<Activity> {
        return listOf(
            // Activity 1: Routine and Non-Routine Problems - Problem Solving Involving Surface Area (Video-based)
            Activity(
                id = 1,
                quarter = 3,
                lessonNumber = 8,
                activityNumber = 1,
                title = "Routine and Non-Routine Problems - Problem Solving Involving Surface Area",
                type = ActivityType.ROUTINE_PROBLEM,
                questions = listOf(
                    Question.RoutineProblem(
                        id = 1,
                        text = "",
                        videoFileName = "activity_1-n1.mp4",
                        description = "Routine and Non-Routine Problems - Problem Solving Involving Surface Area"
                    ),
                    Question.RoutineProblem(
                        id = 2,
                        text = "",
                        videoFileName = "activity_1-n2.mp4",
                        description = "Routine and Non-Routine Problems - Problem Solving Involving Surface Area"
                    ),
                    Question.RoutineProblem(
                        id = 3,
                        text = "",
                        videoFileName = "activity_1-n3.mp4",
                        description = "Routine and Non-Routine Problems - Problem Solving Involving Surface Area"
                    ),
                    Question.RoutineProblem(
                        id = 4,
                        text = "",
                        videoFileName = "activity_1-n4.mp4",
                        description = "Routine and Non-Routine Problems - Problem Solving Involving Surface Area"
                    ),
                    Question.RoutineProblem(
                        id = 5,
                        text = "",
                        videoFileName = "activity_1-n5.mp4",
                        description = "Routine and Non-Routine Problems - Problem Solving Involving Surface Area"
                    ),
                    Question.RoutineProblem(
                        id = 6,
                        text = "",
                        videoFileName = "activity_1-n6.mp4",
                        description = "Routine and Non-Routine Problems - Problem Solving Involving Surface Area"
                    ),
                    Question.RoutineProblem(
                        id = 7,
                        text = "",
                        videoFileName = "activity_1-n7.mp4",
                        description = "Routine and Non-Routine Problems - Problem Solving Involving Surface Area"
                    ),
                )
            ),

            // Activity 2: Routine and Non-Routine Problems - Problem Solving Involving Surface Area (Video-based)
            Activity(
                id = 2,
                quarter = 3,
                lessonNumber = 8,
                activityNumber = 2,
                title = "Routine and Non-Routine Problems - Problem Solving Involving Surface Area",
                type = ActivityType.ROUTINE_PROBLEM,
                questions = listOf(
                    Question.RoutineProblem(
                        id = 1,
                        text = "",
                        videoFileName = "activity_2-n1.mp4",
                        description = "Routine and Non-Routine Problems - Problem Solving Involving Surface Area"
                    ),
                    Question.RoutineProblem(
                        id = 2,
                        text = "",
                        videoFileName = "activity_2-n2.mp4",
                        description = "Routine and Non-Routine Problems - Problem Solving Involving Surface Area"
                    ),
                    Question.RoutineProblem(
                        id = 3,
                        text = "",
                        videoFileName = "activity_2-n3.mp4",
                        description = "Routine and Non-Routine Problems - Problem Solving Involving Surface Area"
                    ),
                    Question.RoutineProblem(
                        id = 4,
                        text = "",
                        videoFileName = "activity_2-n4.mp4",
                        description = "Routine and Non-Routine Problems - Problem Solving Involving Surface Area"
                    ),
                    Question.RoutineProblem(
                        id = 5,
                        text = "",
                        videoFileName = "activity_2-n5.mp4",
                        description = "Routine and Non-Routine Problems - Problem Solving Involving Surface Area"
                    ),
                    Question.RoutineProblem(
                        id = 6,
                        text = "",
                        videoFileName = "activity_2-n6.mp4",
                        description = "Routine and Non-Routine Problems - Problem Solving Involving Surface Area"
                    ),
                )
            ),
        )
    }

    // ------------------- QUARTER 4 -------------------
    private fun getQuarter4Lesson1Activities(): List<Activity> {
        return listOf(
            // Activity 1: Relationship of Volume of Prisms and Pyramids & Other 3D Figures
            Activity(
                id = 1,
                quarter = 4,
                lessonNumber = 1,
                activityNumber = 1,
                title = "Relationship of Volume of Prisms and Pyramids & Other 3D Figures",
                type = ActivityType.MULTIPLE_CHOICE,
                questions = listOf(
                    Question.MultipleChoice(
                        id = 1,
                        text = "The volume of the given prism is 210 cubic units. Find the volume of the pyramid.",
                        options = listOf("60 cubic units", "70 cubic units", "80 cubic units", "90 cubic units"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 2,
                        text = "The volume of the pyramid is 96 cubic units. Find the volume of the rectangular prism.",
                        options = listOf("192 cubic units", "280 cubic units", "288 cubic units", "320 cubic units"),
                        correctAnswer = 2
                    ),
                    Question.MultipleChoice(
                        id = 3,
                        text = "The volume of the given prism is 150 cubic units. Find the volume of the pyramid.",
                        options = listOf("40 cubic units", "45 cubic units", "50 cubic units", "60 cubic units"),
                        correctAnswer = 2
                    ),
                    Question.MultipleChoice(
                        id = 4,
                        text = "The volume of the pyramid is 42 cubic units. Find the volume of the rectangular prism.",
                        options = listOf("120 cubic units", "126 cubic units", "132 cubic units", "150 cubic units"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 5,
                        text = "The volume of the given prism is 450 cubic units. Find the volume of the pyramid.",
                        options = listOf("120 cubic units", "135 cubic units", "150 cubic units", "180 cubic units"),
                        correctAnswer = 2
                    ),
                    Question.MultipleChoice(
                        id = 6,
                        text = "The volume of the pyramid is 64 cubic units. Find the volume of the rectangular prism.",
                        options = listOf("180 cubic units", "192 cubic units", "210 cubic units", "240 cubic units"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 7,
                        text = "The volume of the given prism is 360 cubic units. Find the volume of the pyramid.",
                        options = listOf("100 cubic units", "110 cubic units", "120 cubic units", "150 cubic units"),
                        correctAnswer = 2
                    ),
                    Question.MultipleChoice(
                        id = 8,
                        text = "The volume of the pyramid is 81 cubic units. Find the volume of the rectangular prism.",
                        options = listOf("210 cubic units", "230 cubic units", "243 cubic units", "270 cubic units"),
                        correctAnswer = 2
                    ),
                    Question.MultipleChoice(
                        id = 9,
                        text = "The volume of the given prism is 510 cubic units. Find the volume of the pyramid.",
                        options = listOf("160 cubic units", "165 cubic units", "170 cubic units", "180 cubic units"),
                        correctAnswer = 2
                    ),
                    Question.MultipleChoice(
                        id = 10,
                        text = "The volume of the pyramid is 108 cubic units. Find the volume of the rectangular prism.",
                        options = listOf("300 cubic units", "315 cubic units", "324 cubic units", "333 cubic units"),
                        correctAnswer = 2
                    ),
                    Question.MultipleChoice(
                        id = 11,
                        text = "The volume of the cylinder is 240 cubic units. Find the volume of the cone.",
                        options = listOf("70 cubic units", "75 cubic units", "80 cubic units", "90 cubic units"),
                        correctAnswer = 2
                    ),
                    Question.MultipleChoice(
                        id = 12,
                        text = "The volume of the cone is 72 cubic units. Find the volume of the cylinder.",
                        options = listOf("180 cubic units", "200 cubic units", "210 cubic units", "216 cubic units"),
                        correctAnswer = 3
                    ),
                    Question.MultipleChoice(
                        id = 13,
                        text = "The volume of the cylinder is 600 cubic units. Find the volume of the cone.",
                        options = listOf("180 cubic units", "190 cubic units", "200 cubic units", "210 cubic units"),
                        correctAnswer = 2
                    ),
                    Question.MultipleChoice(
                        id = 14,
                        text = "The volume of the cone is 95 cubic units. Find the volume of the cylinder.",
                        options = listOf("270 cubic units", "280 cubic units", "285 cubic units", "300 cubic units"),
                        correctAnswer = 2
                    ),
                    Question.MultipleChoice(
                        id = 15,
                        text = "The volume of the cylinder is 180 cubic units. Find the volume of the cone.",
                        options = listOf("55 cubic units", "58 cubic units", "60 cubic units", "65 cubic units"),
                        correctAnswer = 2
                    ),
                    Question.MultipleChoice(
                        id = 16,
                        text = "The volume of the cone is 50 cubic units. Find the volume of the cylinder.",
                        options = listOf("140 cubic units", "145 cubic units", "150 cubic units", "155 cubic units"),
                        correctAnswer = 2
                    ),
                    Question.MultipleChoice(
                        id = 17,
                        text = "The volume of the cylinder is 750 cubic units. Find the volume of the cone.",
                        options = listOf("230 cubic units", "240 cubic units", "250 cubic units", "260 cubic units"),
                        correctAnswer = 2
                    ),
                    Question.MultipleChoice(
                        id = 18,
                        text = "The volume of the cone is 120 cubic units. Find the volume of the cylinder.",
                        options = listOf("330 cubic units", "340 cubic units", "350 cubic units", "360 cubic units"),
                        correctAnswer = 3
                    ),
                    Question.MultipleChoice(
                        id = 19,
                        text = "The volume of the cylinder is 390 cubic units. Find the volume of the cone.",
                        options = listOf("120 cubic units", "125 cubic units", "130 cubic units", "135 cubic units"),
                        correctAnswer = 2
                    ),
                    Question.MultipleChoice(
                        id = 20,
                        text = "The volume of the cone is 84 cubic units. Find the volume of the cylinder.",
                        options = listOf("240 cubic units", "246 cubic units", "250 cubic units", "252 cubic units"),
                        correctAnswer = 3
                    ),
                    Question.MultipleChoice(
                        id = 21,
                        text = "The volume of the cylinder is 150 cubic units. Find the volume of the sphere.",
                        options = listOf("40 cubic units", "45 cubic units", "50 cubic units", "55 cubic units"),
                        correctAnswer = 2
                    ),
                    Question.MultipleChoice(
                        id = 22,
                        text = "The volume of the sphere is 75 cubic units. Find the volume of the cylinder.",
                        options = listOf("210 cubic units", "220 cubic units", "225 cubic units", "230 cubic units"),
                        correctAnswer = 2
                    ),
                    Question.MultipleChoice(
                        id = 23,
                        text = "The volume of the cylinder is 240 cubic units. Find the volume of the sphere.",
                        options = listOf("70 cubic units", "75 cubic units", "80 cubic units", "85 cubic units"),
                        correctAnswer = 2
                    ),
                    Question.MultipleChoice(
                        id = 24,
                        text = "The volume of the sphere is 60 cubic units. Find the volume of the cylinder.",
                        options = listOf("170 cubic units", "175 cubic units", "180 cubic units", "190 cubic units"),
                        correctAnswer = 2
                    ),
                    Question.MultipleChoice(
                        id = 25,
                        text = "The volume of the cylinder is 390 cubic units. Find the volume of the sphere.",
                        options = listOf("120 cubic units", "125 cubic units", "130 cubic units", "135 cubic units"),
                        correctAnswer = 2
                    )
                )
            ),

            // Activity 2: Relationship of Volume - True or False
            Activity(
                id = 2,
                quarter = 4,
                lessonNumber = 1,
                activityNumber = 2,
                title = "Relationship of Volume of Prisms and Pyramids & Other 3D Figures",
                type = ActivityType.MULTIPLE_CHOICE,
                questions = listOf(
                    Question.MultipleChoice(
                        id = 1,
                        text = "The volume of the given prism is 360 cubic units. Its pyramid's volume is 130 cubic units.",
                        options = listOf("True", "False"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 2,
                        text = "The volume of the pyramid is 150 cubic units. Its rectangular prism's volume is 450 cubic units.",
                        options = listOf("True", "False"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 3,
                        text = "The volume of the given prism is 270 cubic units. Its pyramid's volume is 90 cubic units.",
                        options = listOf("True", "False"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 4,
                        text = "The volume of the pyramid is 120 cubic units. Its rectangular prism's volume is 350 cubic units.",
                        options = listOf("True", "False"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 5,
                        text = "The volume of the given prism is 600 cubic units. Its pyramid's volume is 200 cubic units.",
                        options = listOf("True", "False"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 6,
                        text = "The volume of the pyramid is 72 cubic units. Its rectangular prism's volume is 216 cubic units.",
                        options = listOf("True", "False"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 7,
                        text = "The volume of the given prism is 480 cubic units. Its pyramid's volume is 140 cubic units.",
                        options = listOf("True", "False"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 8,
                        text = "The volume of the pyramid is 135 cubic units. Its rectangular prism's volume is 405 cubic units.",
                        options = listOf("True", "False"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 9,
                        text = "The volume of the given prism is 300 cubic units. Its pyramid's volume is 100 cubic units.",
                        options = listOf("True", "False"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 10,
                        text = "The volume of the pyramid is 210 cubic units. Its rectangular prism's volume is 640 cubic units.",
                        options = listOf("True", "False"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 11,
                        text = "The volume of the cylinder is 360 cubic units. Its cone's volume is 120 cubic units.",
                        options = listOf("True", "False"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 12,
                        text = "The volume of the cone is 110 cubic units. Its cylinder's volume is 340 cubic units.",
                        options = listOf("True", "False"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 13,
                        text = "The volume of the cylinder is 420 cubic units. Its cone's volume is 140 cubic units.",
                        options = listOf("True", "False"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 14,
                        text = "The volume of the cone is 75 cubic units. Its cylinder's volume is 225 cubic units.",
                        options = listOf("True", "False"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 15,
                        text = "The volume of the cylinder is 510 cubic units. Its cone's volume is 160 cubic units.",
                        options = listOf("True", "False"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 16,
                        text = "The volume of the cone is 200 cubic units. Its cylinder's volume is 600 cubic units.",
                        options = listOf("True", "False"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 17,
                        text = "The volume of the cylinder is 270 cubic units. Its cone's volume is 85 cubic units.",
                        options = listOf("True", "False"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 18,
                        text = "The volume of the cone is 145 cubic units. Its cylinder's volume is 435 cubic units.",
                        options = listOf("True", "False"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 19,
                        text = "The volume of the cylinder is 720 cubic units. Its cone's volume is 240 cubic units.",
                        options = listOf("True", "False"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 20,
                        text = "The volume of the cone is 66 cubic units. Its cylinder's volume is 190 cubic units.",
                        options = listOf("True", "False"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 21,
                        text = "The volume of the cylinder is 240 cubic units. Its sphere's volume is 80 cubic units.",
                        options = listOf("True", "False"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 22,
                        text = "The volume of the sphere is 55 cubic units. Its cylinder's volume is 150 cubic units.",
                        options = listOf("True", "False"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 23,
                        text = "The volume of the cylinder is 330 cubic units. Its sphere's volume is 110 cubic units.",
                        options = listOf("True", "False"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 24,
                        text = "The volume of the sphere is 72 cubic units. Its cylinder's volume is 216 cubic units.",
                        options = listOf("True", "False"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 25,
                        text = "The volume of the cylinder is 450 cubic units. Its sphere's volume is 160 cubic units.",
                        options = listOf("True", "False"),
                        correctAnswer = 1
                    )
                )
            )
        )
    }

    private fun getQuarter4Lesson2Activities(): List<Activity> {
        return listOf(
            // Activity 1: Routine and Non-Routine Problems - Finds the Volume of Cylinders, Pyramids, Cones, and Spheres (Video-based)
            Activity(
                id = 1,
                quarter = 4,
                lessonNumber = 2,
                activityNumber = 1,
                title = "Routine and Non-Routine Problems - Finds the Volume of Cylinders, Pyramids, Cones, and Spheres",
                type = ActivityType.ROUTINE_PROBLEM,
                questions = listOf(
                    Question.RoutineProblem(
                        id = 1,
                        text = "",
                        videoFileName = "activity_1-n1.mp4",
                        description = "Routine and Non-Routine Problems - Finds the Volume of Cylinders, Pyramids, Cones, and Spheres"
                    ),
                    Question.RoutineProblem(
                        id = 2,
                        text = "",
                        videoFileName = "activity_1-n2.mp4",
                        description = "Routine and Non-Routine Problems - Finds the Volume of Cylinders, Pyramids, Cones, and Spheres"
                    ),
                    Question.RoutineProblem(
                        id = 3,
                        text = "",
                        videoFileName = "activity_1-n3.mp4",
                        description = "Routine and Non-Routine Problems - Finds the Volume of Cylinders, Pyramids, Cones, and Spheres"
                    ),
                    Question.RoutineProblem(
                        id = 4,
                        text = "",
                        videoFileName = "activity_1-n4.mp4",
                        description = "Routine and Non-Routine Problems - Finds the Volume of Cylinders, Pyramids, Cones, and Spheres"
                    ),
                    Question.RoutineProblem(
                        id = 5,
                        text = "",
                        videoFileName = "activity_1-n5.mp4",
                        description = "Routine and Non-Routine Problems - Finds the Volume of Cylinders, Pyramids, Cones, and Spheres"
                    ),
                    Question.RoutineProblem(
                        id = 6,
                        text = "",
                        videoFileName = "activity_1-n6.mp4",
                        description = "Routine and Non-Routine Problems - Finds the Volume of Cylinders, Pyramids, Cones, and Spheres"
                    ),
                    Question.RoutineProblem(
                        id = 7,
                        text = "",
                        videoFileName = "activity_1-n7.mp4",
                        description = "Routine and Non-Routine Problems - Finds the Volume of Cylinders, Pyramids, Cones, and Spheres"
                    ),
                )
            ),

            // Activity 2: Routine and Non-Routine Problems - Finds the Volume of Cylinders, Pyramids, Cones, and Spheres (Video-based)
            Activity(
                id = 2,
                quarter = 4,
                lessonNumber = 2,
                activityNumber = 2,
                title = "Routine and Non-Routine Problems - Finds the Volume of Cylinders, Pyramids, Cones, and Spheres",
                type = ActivityType.ROUTINE_PROBLEM,
                questions = listOf(
                    Question.RoutineProblem(
                        id = 1,
                        text = "",
                        videoFileName = "activity_2-n1.mp4",
                        description = "Routine and Non-Routine Problems - Finds the Volume of Cylinders, Pyramids, Cones, and Spheres"
                    ),
                    Question.RoutineProblem(
                        id = 2,
                        text = "",
                        videoFileName = "activity_2-n2.mp4",
                        description = "Routine and Non-Routine Problems - Finds the Volume of Cylinders, Pyramids, Cones, and Spheres"
                    ),
                    Question.RoutineProblem(
                        id = 3,
                        text = "",
                        videoFileName = "activity_2-n3.mp4",
                        description = "Routine and Non-Routine Problems - Finds the Volume of Cylinders, Pyramids, Cones, and Spheres"
                    ),
                    Question.RoutineProblem(
                        id = 4,
                        text = "",
                        videoFileName = "activity_2-n4.mp4",
                        description = "Routine and Non-Routine Problems - Finds the Volume of Cylinders, Pyramids, Cones, and Spheres"
                    ),
                    Question.RoutineProblem(
                        id = 5,
                        text = "",
                        videoFileName = "activity_2-n5.mp4",
                        description = "Routine and Non-Routine Problems - Finds the Volume of Cylinders, Pyramids, Cones, and Spheres"
                    ),
                    Question.RoutineProblem(
                        id = 6,
                        text = "",
                        videoFileName = "activity_2-n6.mp4",
                        description = "Routine and Non-Routine Problems - Finds the Volume of Cylinders, Pyramids, Cones, and Spheres"
                    ),
                    Question.RoutineProblem(
                        id = 7,
                        text = "",
                        videoFileName = "activity_2-n7.mp4",
                        description = "Routine and Non-Routine Problems - Finds the Volume of Cylinders, Pyramids, Cones, and Spheres"
                    ),
                )
            ),
        )
    }

    private fun getQuarter4Lesson3Activities(): List<Activity> {
        return listOf(
            // Activity 1: Reading and Interpreting Electric and Water Meter Readings
            Activity(
                id = 1,
                quarter = 4,
                lessonNumber = 3,
                activityNumber = 1,
                title = "Reading and Interpreting Electric and Water Meter Readings",
                type = ActivityType.MULTIPLE_CHOICE,
                questions = listOf(
                    Question.MultipleChoice(
                        id = 1,
                        text = "What is the correct reading of the electric meter?",
                        imageUrl = "electric_meter_q1",
                        options = listOf("48273 kWh", "48372 kWh", "48372 kWh", "42387 kWh"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 2,
                        text = "What is the correct reading of the electric meter?",
                        imageUrl = "electric_meter_q2",
                        options = listOf("15749 kWh", "15794 kWh", "15947 kWh", "15764 kWh"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 3,
                        text = "What is the correct reading of the electric meter?",
                        imageUrl = "electric_meter_q3",
                        options = listOf("62958 kWh", "69285 kWh", "62985 kWh", "62895 kWh"),
                        correctAnswer = 2
                    ),
                    Question.MultipleChoice(
                        id = 4,
                        text = "What is the correct reading of the electric meter?",
                        imageUrl = "electric_meter_q4",
                        options = listOf("31126 kWh", "31162 kWh", "31216 kWh", "31026 kWh"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 5,
                        text = "What is the correct reading of the electric meter?",
                        imageUrl = "electric_meter_q5",
                        options = listOf("84751 kWh", "84715 kWh", "84157 kWh", "87451 kWh"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 6,
                        text = "What is the correct reading of the electric meter?",
                        imageUrl = "electric_meter_q6",
                        options = listOf("23568 kWh", "25368 kWh", "23658 kWh", "23856 kWh"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 7,
                        text = "What is the correct reading of the electric meter?",
                        imageUrl = "electric_meter_q7",
                        options = listOf("97423 kWh", "94732 kWh", "97432 kWh", "97243 kWh"),
                        correctAnswer = 2
                    ),
                    Question.MultipleChoice(
                        id = 8,
                        text = "What is the correct reading of the electric meter?",
                        imageUrl = "electric_meter_q8",
                        options = listOf("54617 kWh", "54671 kWh", "54761 kWh", "56471 kWh"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 9,
                        text = "What is the correct reading of the electric meter?",
                        imageUrl = "electric_meter_q9",
                        options = listOf("12859 kWh", "12589 kWh", "18259 kWh", "12895 kWh"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 10,
                        text = "What is the correct reading of the electric meter?",
                        imageUrl = "electric_meter_q10",
                        options = listOf("73624 kWh", "76324 kWh", "76234 kWh", "73642 kWh"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 11,
                        text = "What is the correct reading of the electric meter?",
                        imageUrl = "electric_meter_q11",
                        options = listOf("39174 kWh", "39147 kWh", "39417 kWh", "39471 kWh"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 12,
                        text = "What is the correct reading of the electric meter?",
                        imageUrl = "electric_meter_q12",
                        options = listOf("54289 kWh", "52849 kWh", "59284 kWh", "58942 kWh"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 13,
                        text = "What is the correct reading of the electric meter?",
                        imageUrl = "electric_meter_q13",
                        options = listOf("67521 kWh", "65712 kWh", "67512 kWh", "67125 kWh"),
                        correctAnswer = 2
                    ),
                    Question.MultipleChoice(
                        id = 14,
                        text = "What is the correct reading of the water meter?",
                        imageUrl = "water_meter_q14",
                        options = listOf("65382 m³", "65328 m³", "63528 m³", "65382 m³"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 15,
                        text = "What is the correct reading of the water meter?",
                        imageUrl = "water_meter_q15",
                        options = listOf("87421 m³", "87142 m³", "87412 m³", "84172 m³"),
                        correctAnswer = 2
                    ),
                    Question.MultipleChoice(
                        id = 16,
                        text = "What is the correct reading of the water meter?",
                        imageUrl = "water_meter_q16",
                        options = listOf("71359 m³", "73159 m³", "73195 m³", "73519 m³"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 17,
                        text = "What is the correct reading of the water meter?",
                        imageUrl = "water_meter_q17",
                        options = listOf("12735 m³", "12753 m³", "12375 m³", "12573 m³"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 18,
                        text = "What is the correct reading of the water meter?",
                        imageUrl = "water_meter_q18",
                        options = listOf("45968 m³", "45698 m³", "49568 m³", "46958 m³"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 19,
                        text = "What is the correct reading of the water meter?",
                        imageUrl = "water_meter_q19",
                        options = listOf("81234 m³", "81324 m³", "82134 m³", "81243 m³"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 20,
                        text = "What is the correct reading of the water meter?",
                        imageUrl = "water_meter_q20",
                        options = listOf("36825 m³", "38625 m³", "36852 m³", "36582 m³"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 21,
                        text = "What is the correct reading of the water meter?",
                        imageUrl = "water_meter_q21",
                        options = listOf("49784 m³", "49748 m³", "47948 m³", "49478 m³"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 22,
                        text = "What is the correct reading of the water meter?",
                        imageUrl = "water_meter_q22",
                        options = listOf("54671 m³", "56471 m³", "54617 m³", "54167 m³"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 23,
                        text = "What is the correct reading of the water meter?",
                        imageUrl = "water_meter_q23",
                        options = listOf("81623 m³", "82163 m³", "81263 m³", "82613 m³"),
                        correctAnswer = 2
                    ),
                    Question.MultipleChoice(
                        id = 24,
                        text = "What is the correct reading of the water meter?",
                        imageUrl = "water_meter_q24",
                        options = listOf("12479 m³", "12497 m³", "12947 m³", "14297 m³"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 25,
                        text = "What is the correct reading of the water meter?",
                        imageUrl = "water_meter_q25",
                        options = listOf("65396 m³", "65369 m³", "63569 m³", "65359 m³"),
                        correctAnswer = 1
                    )
                )
            ),

            // Activity 2: Reading and Interpreting Electric and Water Meter Readings (Matching Type)
            Activity(
                id = 2,
                quarter = 4,
                lessonNumber = 3,
                activityNumber = 2,
                title = "Reading and Interpreting Electric and Water Meter Readings",
                type = ActivityType.DRAG_DROP,
                questions = listOf(
                    Question.DragDrop(
                        id = 1,
                        text = "Calculate the consumption by finding the difference between the present reading and previous reading. Match each problem in Column A with the correct answer in Column B.",
                        columnA = listOf(
                            "04992 kWh - 04578 kWh =",
                            "06825 kWh - 06215 kWh =",
                            "04475 kWh - 03867 kWh =",
                            "10200 kWh - 09420 kWh =",
                            "06075 kWh - 05600 kWh =",
                            "03245 kWh - 02300 kWh =",
                            "08555 kWh - 07840 kWh =",
                            "12199 kWh - 11255 kWh =",
                            "04799 kWh - 04100 kWh =",
                            "07895 kWh - 06780 kWh =",
                            "11050 kWh - 10100 kWh =",
                            "16125 kWh - 15200 kWh =",
                            "19560 kWh - 18500 kWh =",
                            "01458 m³ - 01234 m³ =",
                            "02985 m³ - 02567 m³ =",
                            "04250 m³ - 03789 m³ =",
                            "05375 m³ - 04900 m³ =",
                            "06123 m³ - 05555 m³ =",
                            "07455 m³ - 06780 m³ =",
                            "08795 m³ - 08020 m³ =",
                            "10000 m³ - 09210 m³ =",
                            "11111 m³ - 10435 m³ =",
                            "12475 m³ - 11590 m³ =",
                            "13985 m³ - 13020 m³ =",
                            "15210 m³ - 14250 m³ ="
                        ),
                        columnB = listOf(
                            "0414 kWh",
                            "0610 kWh",
                            "0608 kWh",
                            "0780 kWh",
                            "0475 kWh",
                            "0945 kWh",
                            "0715 kWh",
                            "0944 kWh",
                            "0699 kWh",
                            "1115 kWh",
                            "0950 kWh",
                            "0925 kWh",
                            "1060 kWh",
                            "0224 m³",
                            "0418 m³",
                            "0461 m³",
                            "0475 m³",
                            "0568 m³",
                            "0675 m³",
                            "0775 m³",
                            "0790 m³",
                            "0676 m³",
                            "0885 m³",
                            "0965 m³",
                            "0960 m³"
                        ),
                        correctMatches = mapOf(
                            0 to 0,   // 0414 kWh
                            1 to 1,   // 0610 kWh
                            2 to 2,   // 0608 kWh
                            3 to 3,   // 0780 kWh
                            4 to 4,   // 0475 kWh
                            5 to 5,   // 0945 kWh
                            6 to 6,   // 0715 kWh
                            7 to 7,   // 0944 kWh
                            8 to 8,   // 0699 kWh
                            9 to 9,   // 1115 kWh
                            10 to 10, // 0950 kWh
                            11 to 11, // 0925 kWh
                            12 to 12, // 1060 kWh
                            13 to 13, // 0224 m³
                            14 to 14, // 0418 m³
                            15 to 15, // 0461 m³
                            16 to 16, // 0475 m³
                            17 to 17, // 0568 m³
                            18 to 18, // 0675 m³
                            19 to 19, // 0775 m³
                            20 to 20, // 0790 m³
                            21 to 21, // 0676 m³
                            22 to 22, // 0885 m³
                            23 to 23, // 0965 m³
                            24 to 24  // 0960 m³
                        )
                    )
                )
            )
        )
    }

    private fun getQuarter4Lesson4Activities(): List<Activity> {
        return listOf(
            // Activity 1: Interpreting Pie Graph
            Activity(
                id = 1,
                quarter = 4,
                lessonNumber = 4,
                activityNumber = 1,
                title = "Interpreting Pie Graph",
                type = ActivityType.MULTIPLE_CHOICE,
                questions = listOf(
                    // GROUP 1: School Subjects (Questions 1-5)
                    Question.MultipleChoice(
                        id = 1,
                        text = "What is the angle size of Filipino?",
                        imageUrl = "pie_graph_subjects",
                        options = listOf("70°", "72°", "74°", "76°"),
                        correctAnswer = 0,
                        groupId = 1,
                        isGroupHeader = true
                    ),
                    Question.MultipleChoice(
                        id = 2,
                        text = "What is the angle size of English?",
                        imageUrl = "pie_graph_subjects",
                        options = listOf("28.8°", "28.6°", "28.4°", "28.2°"),
                        correctAnswer = 0,
                        groupId = 1
                    ),
                    Question.MultipleChoice(
                        id = 3,
                        text = "What is the angle size of Science?",
                        imageUrl = "pie_graph_subjects",
                        options = listOf("86.8°", "86.6°", "86.4°", "86.2°"),
                        correctAnswer = 2,
                        groupId = 1
                    ),
                    Question.MultipleChoice(
                        id = 4,
                        text = "What is the angle size of Mathematics?",
                        imageUrl = "pie_graph_subjects",
                        options = listOf("115.0°", "115.4°", "115.6°", "115.2°"),
                        correctAnswer = 3,
                        groupId = 1
                    ),
                    Question.MultipleChoice(
                        id = 5,
                        text = "What is the angle size of Araling Panlipunan?",
                        imageUrl = "pie_graph_subjects",
                        options = listOf("57.6°", "57.8°", "57.2°", "57.4°"),
                        correctAnswer = 0,
                        groupId = 1
                    ),

                    // GROUP 2: Social Media (Questions 6-10)
                    Question.MultipleChoice(
                        id = 6,
                        text = "What is the angle size of X (Twitter)?",
                        imageUrl = "pie_graph_social_media",
                        options = listOf("72°", "74°", "76°", "70°"),
                        correctAnswer = 0,
                        groupId = 2,
                        isGroupHeader = true
                    ),
                    Question.MultipleChoice(
                        id = 7,
                        text = "What is the angle size of Instagram?",
                        imageUrl = "pie_graph_social_media",
                        options = listOf("28.2°", "28.8°", "28.4°", "28.6°"),
                        correctAnswer = 1,
                        groupId = 2
                    ),
                    Question.MultipleChoice(
                        id = 8,
                        text = "What is the angle size of Facebook?",
                        imageUrl = "pie_graph_social_media",
                        options = listOf("86.2°", "86.6°", "86.4°", "86.8°"),
                        correctAnswer = 2,
                        groupId = 2
                    ),
                    Question.MultipleChoice(
                        id = 9,
                        text = "What is the angle size of Tiktok?",
                        imageUrl = "pie_graph_social_media",
                        options = listOf("115.8°", "115.6°", "115.4°", "115.2°"),
                        correctAnswer = 3,
                        groupId = 2
                    ),
                    Question.MultipleChoice(
                        id = 10,
                        text = "What is the angle size of Messenger?",
                        imageUrl = "pie_graph_social_media",
                        options = listOf("57.6°", "57.4°", "57.8°", "57.2°"),
                        correctAnswer = 0,
                        groupId = 2
                    ),

                    // GROUP 3: Fast Food (Questions 11-15)
                    Question.MultipleChoice(
                        id = 11,
                        text = "What is the angle size of McDonald's?",
                        imageUrl = "pie_graph_fastfood",
                        options = listOf("91.2°", "91.4°", "91.6°", "91.8°"),
                        correctAnswer = 0,
                        groupId = 3,
                        isGroupHeader = true
                    ),
                    Question.MultipleChoice(
                        id = 12,
                        text = "What is the angle size of Chowking?",
                        imageUrl = "pie_graph_fastfood",
                        options = listOf("55.6°", "55.2°", "55.4°", "55.8°"),
                        correctAnswer = 1,
                        groupId = 3
                    ),
                    Question.MultipleChoice(
                        id = 13,
                        text = "What is the angle size of Mang Inasal?",
                        imageUrl = "pie_graph_fastfood",
                        options = listOf("43.4°", "43.6°", "43.2°", "43.8°"),
                        correctAnswer = 2,
                        groupId = 3
                    ),
                    Question.MultipleChoice(
                        id = 14,
                        text = "What is the angle size of Jollibee?",
                        imageUrl = "pie_graph_fastfood",
                        options = listOf("141.8°", "141.4°", "141.2°", "141.6°"),
                        correctAnswer = 3,
                        groupId = 3
                    ),
                    Question.MultipleChoice(
                        id = 15,
                        text = "What is the angle size of Greenwich?",
                        imageUrl = "pie_graph_fastfood",
                        options = listOf("8.8°", "8.6°", "8.4°", "8.2°"),
                        correctAnswer = 0,
                        groupId = 3
                    ),

                    // GROUP 4: Fruits (Questions 16-20)
                    Question.MultipleChoice(
                        id = 16,
                        text = "What is the angle size of Banana?",
                        imageUrl = "pie_graph_fruits",
                        options = listOf("117°", "119°", "115°", "113°"),
                        correctAnswer = 0,
                        groupId = 4,
                        isGroupHeader = true
                    ),
                    Question.MultipleChoice(
                        id = 17,
                        text = "What is the angle size of Mango?",
                        imageUrl = "pie_graph_fruits",
                        options = listOf("85°", "90°", "95°", "100°"),
                        correctAnswer = 1,
                        groupId = 4
                    ),
                    Question.MultipleChoice(
                        id = 18,
                        text = "What is the angle size of Pineapple?",
                        imageUrl = "pie_graph_fruits",
                        options = listOf("61°", "65°", "63°", "67°"),
                        correctAnswer = 2,
                        groupId = 4
                    ),
                    Question.MultipleChoice(
                        id = 19,
                        text = "What is the angle size of Papaya?",
                        imageUrl = "pie_graph_fruits",
                        options = listOf("41°", "43°", "47°", "45°"),
                        correctAnswer = 3,
                        groupId = 4
                    ),
                    Question.MultipleChoice(
                        id = 20,
                        text = "What is the angle size of Watermelon?",
                        imageUrl = "pie_graph_fruits",
                        options = listOf("45°", "43°", "47°", "41°"),
                        correctAnswer = 0,
                        groupId = 4
                    ),

                    // GROUP 5: Filipino Games (Questions 21-25)
                    Question.MultipleChoice(
                        id = 21,
                        text = "What is the angle size of Patintero?",
                        imageUrl = "pie_graph_games",
                        options = listOf("86.4°", "86.2°", "86.6°", "86.8°"),
                        correctAnswer = 0,
                        groupId = 5,
                        isGroupHeader = true
                    ),
                    Question.MultipleChoice(
                        id = 22,
                        text = "What is the angle size of Tumbang Preso?",
                        imageUrl = "pie_graph_games",
                        options = listOf("79.4°", "79.2°", "79.6°", "79.8°"),
                        correctAnswer = 1,
                        groupId = 5
                    ),
                    Question.MultipleChoice(
                        id = 23,
                        text = "What is the angle size of Piko?",
                        imageUrl = "pie_graph_games",
                        options = listOf("45°", "55°", "50°", "60°"),
                        correctAnswer = 2,
                        groupId = 5
                    ),
                    Question.MultipleChoice(
                        id = 24,
                        text = "What is the angle size of Luksong Baka?",
                        imageUrl = "pie_graph_games",
                        options = listOf("64.2°", "64.4°", "64.6°", "64.8°"),
                        correctAnswer = 3,
                        groupId = 5
                    ),
                    Question.MultipleChoice(
                        id = 25,
                        text = "What is the angle size of Sipa?",
                        imageUrl = "pie_graph_games",
                        options = listOf("57.6°", "57.2°", "57.4°", "57.8°"),
                        correctAnswer = 0,
                        groupId = 5
                    )
                )
            ),

            // Activity 2: Reading and Interpreting Pie Graphs
            Activity(
                id = 2,
                quarter = 4,
                lessonNumber = 4,
                activityNumber = 2,
                title = "Reading and Interpreting Pie Graphs",
                type = ActivityType.MULTIPLE_CHOICE,
                questions = listOf(
                    // GROUP 1: Favorite Subject (Questions 1-5)
                    Question.MultipleChoice(
                        id = 1,
                        text = "Mr. Abad surveyed 50 students about their favorite subject. \n\n What fraction of students' favorite is Araling Panlipunan?",
                        imageUrl = "pie_graph_subjects_2",
                        options = listOf("⁶⁄₂₅", "⁵⁄₂₅", "⁷⁄₂₅", "⁴⁄₂₅"),
                        correctAnswer = 0,
                        groupId = 1,
                        isGroupHeader = true
                    ),
                    Question.MultipleChoice(
                        id = 2,
                        text = "Mr. Abad surveyed 50 students about their favorite subject. \n\n What fraction of students' favorite is Science?",
                        imageUrl = "pie_graph_subjects_2",
                        options = listOf("¹⁄₇", "¹⁄₅", "¹⁄₆", "²⁄₅"),
                        correctAnswer = 1,
                        groupId = 1
                    ),
                    Question.MultipleChoice(
                        id = 3,
                        text = "Mr. Abad surveyed 50 students about their favorite subject. \n\n What fraction of students' favorite is Filipino?",
                        imageUrl = "pie_graph_subjects_2",
                        options = listOf("¹⁰⁄₂₅", "¹⁄₂₀", "⁴⁄₂₅", "⁵⁄₂₀"),
                        correctAnswer = 2,
                        groupId = 1
                    ),
                    Question.MultipleChoice(
                        id = 4,
                        text = "Mr. Abad surveyed 50 students about their favorite subject. \n\n What fraction of students' favorite is English?",
                        imageUrl = "pie_graph_subjects_2",
                        options = listOf("⁸⁄₄₀", "⁸⁄₅₀", "¹⁰⁄₅₀", "⁹⁄₅₀"),
                        correctAnswer = 3,
                        groupId = 1
                    ),
                    Question.MultipleChoice(
                        id = 5,
                        text = "Mr. Abad surveyed 50 students about their favorite subject. \n\n What fraction of students' favorite is Mathematics?",
                        imageUrl = "pie_graph_subjects_2",
                        options = listOf("¹¹⁄₅₀", "¹⁰⁄₅₀", "¹⁵⁄₇₀", "¹³⁄₆₀"),
                        correctAnswer = 0,
                        groupId = 1
                    ),

                    // GROUP 2: Messaging Apps (Questions 6-10)
                    Question.MultipleChoice(
                        id = 6,
                        text = "In 2025, the top messaging application used for daily conversations in the Philippines. Based on a survey of 120 people. \n\n What fraction of Messenger?",
                        imageUrl = "pie_graph_messaging",
                        options = listOf("¹⁷⁄₃₀", "¹⁷⁄₄₀", "¹⁵⁄₅₀", "¹⁹⁄₃₀"),
                        correctAnswer = 0,
                        groupId = 2,
                        isGroupHeader = true
                    ),
                    Question.MultipleChoice(
                        id = 7,
                        text = "In 2025, the top messaging application used for daily conversations in the Philippines. Based on a survey of 120 people. \n\n What fraction of WhatsApp?",
                        imageUrl = "pie_graph_messaging",
                        options = listOf("¹⁷⁄₂₀", "⁵⁄₂₄", "¹⁷⁄₃₀", "⁹⁄₂₄"),
                        correctAnswer = 1,
                        groupId = 2
                    ),
                    Question.MultipleChoice(
                        id = 8,
                        text = "In 2025, the top messaging application used for daily conversations in the Philippines. Based on a survey of 120 people. \n\n What fraction of Telegram?",
                        imageUrl = "pie_graph_messaging",
                        options = listOf("⁹⁄₁₀", "⁴⁄₁₀", "¹⁄₁₀", "⁷⁄₁₀"),
                        correctAnswer = 2,
                        groupId = 2
                    ),
                    Question.MultipleChoice(
                        id = 9,
                        text = "In 2025, the top messaging application used for daily conversations in the Philippines. Based on a survey of 120 people. \n\n What fraction of Viber?",
                        imageUrl = "pie_graph_messaging",
                        options = listOf("¹¹⁄₁₂", "⁵⁄₁₂", "⁷⁄₁₂", "¹⁄₁₂"),
                        correctAnswer = 3,
                        groupId = 2
                    ),
                    Question.MultipleChoice(
                        id = 10,
                        text = "In 2025, the top messaging application used for daily conversations in the Philippines. Based on a survey of 120 people. \n\n What fraction of Discord?",
                        imageUrl = "pie_graph_messaging",
                        options = listOf("¹⁄₂₄", "⁸⁄₂₄", "¹⁷⁄₂₄", "⁵⁄₂₄"),
                        correctAnswer = 0,
                        groupId = 2
                    ),

                    // GROUP 3: Former Presidents (Questions 11-15)
                    Question.MultipleChoice(
                        id = 11,
                        text = "Pulse Asia Research Inc. surveyed 300 Filipinos for their most known former president of the Philippines. \n\n What's the fraction of Ferdinand Marcos Sr.?",
                        imageUrl = "pie_graph_presidents",
                        options = listOf("⁴⁷⁄₁₀₀", "⁵³⁄₁₀₀", "⁴¹⁄₁₀₀", "⁵⁰⁄₁₁₀"),
                        correctAnswer = 0,
                        groupId = 3,
                        isGroupHeader = true
                    ),
                    Question.MultipleChoice(
                        id = 12,
                        text = "Pulse Asia Research Inc. surveyed 300 Filipinos for their most known former president of the Philippines. \n\n What fraction of Manuel L. Quezon?",
                        imageUrl = "pie_graph_presidents",
                        options = listOf("²⁄₅", "¹⁄₅", "³⁄₅", "⁴⁄₅"),
                        correctAnswer = 1,
                        groupId = 3
                    ),
                    Question.MultipleChoice(
                        id = 13,
                        text = "Pulse Asia Research Inc. surveyed 300 Filipinos for their most known former president of the Philippines. \n\n What fraction of Jose P. Laurel?",
                        imageUrl = "pie_graph_presidents",
                        options = listOf("⁷⁄₂₀", "¹³⁄₂₀", "¹⁄₂₀", "¹⁵⁄₂₀"),
                        correctAnswer = 2,
                        groupId = 3
                    ),
                    Question.MultipleChoice(
                        id = 14,
                        text = "Pulse Asia Research Inc. surveyed 300 Filipinos for their most known former president of the Philippines. \n\n What fraction of Corazon Aquino?",
                        imageUrl = "pie_graph_presidents",
                        options = listOf("²³⁄₁₀₀", "²⁶⁄₁₀₀", "⁵⁵⁄₁₀₀", "¹³⁄₁₀₀"),
                        correctAnswer = 3,
                        groupId = 3
                    ),
                    Question.MultipleChoice(
                        id = 15,
                        text = "Pulse Asia Research Inc. surveyed 300 Filipinos for their most known former president of the Philippines. \n\n What fraction of Rodrigo Duterte?",
                        imageUrl = "pie_graph_presidents",
                        options = listOf("³⁄₂₀", "³⁄₁₅", "¹⁄₅", "⁷⁄₂₀"),
                        correctAnswer = 0,
                        groupId = 3
                    ),

                    // GROUP 4: Phone Brands (Questions 16-20)
                    Question.MultipleChoice(
                        id = 16,
                        text = "There are 100 people asked by someone about the brand of their phone. \n\n What fraction of Samsung?",
                        imageUrl = "pie_graph_phones",
                        options = listOf("³⁄₁₀", "¹⁄₁₀", "⁷⁄₁₀", "⁹⁄₁₀"),
                        correctAnswer = 0,
                        groupId = 4,
                        isGroupHeader = true
                    ),
                    Question.MultipleChoice(
                        id = 17,
                        text = "There are 100 people asked by someone about the brand of their phone. \n\n What fraction of Oppo?",
                        imageUrl = "pie_graph_phones",
                        options = listOf("³⁄₄", "¹⁄₄", "³⁄₁₀", "³⁄₇"),
                        correctAnswer = 1,
                        groupId = 4
                    ),
                    Question.MultipleChoice(
                        id = 18,
                        text = "There are 100 people asked by someone about the brand of their phone. \n\n What fraction of Infinix?",
                        imageUrl = "pie_graph_phones",
                        options = listOf("¹⁄₅", "³⁄₁₀", "¹⁄₅", "³⁄₈"),
                        correctAnswer = 2,
                        groupId = 4
                    ),
                    Question.MultipleChoice(
                        id = 19,
                        text = "There are 100 people asked by someone about the brand of their phone. \n\n What fraction of Apple?",
                        imageUrl = "pie_graph_phones",
                        options = listOf("³⁄₁₀", "⁷⁄₂₀", "⁴⁄₁₀", "³⁄₂₀"),
                        correctAnswer = 3,
                        groupId = 4
                    ),
                    Question.MultipleChoice(
                        id = 20,
                        text = "There are 100 people asked by someone about the brand of their phone. \n\n What fraction of Xiaomi?",
                        imageUrl = "pie_graph_phones",
                        options = listOf("¹⁄₁₀", "³⁄₁₀", "⁷⁄₁₀", "⁹⁄₁₀"),
                        correctAnswer = 0,
                        groupId = 4
                    ),

                    // GROUP 5: Tourist Destinations (Questions 21-25)
                    Question.MultipleChoice(
                        id = 21,
                        text = "In 2025, the Philippines will remain a popular summer destination with attractions for all kinds of travelers. Based on the opinions of 150 people, here are the top five most visited places. \n\n What fraction of Boracay?",
                        imageUrl = "pie_graph_destinations",
                        options = listOf("⁴⁄₁₅", "⁸⁄₁₅", "⁵⁄₁₅", "⁷⁄₁₅"),
                        correctAnswer = 0,
                        groupId = 5,
                        isGroupHeader = true
                    ),
                    Question.MultipleChoice(
                        id = 22,
                        text = "In 2025, the Philippines will remain a popular summer destination with attractions for all kinds of travelers. Based on the opinions of 150 people, here are the top five most visited places. \n\n What fraction of Palawan?",
                        imageUrl = "pie_graph_destinations",
                        options = listOf("⁴⁄₁₅", "⁷⁄₃₀", "⁴⁄₃₀", "⁷⁄₁₅"),
                        correctAnswer = 1,
                        groupId = 5
                    ),
                    Question.MultipleChoice(
                        id = 23,
                        text = "In 2025, the Philippines will remain a popular summer destination with attractions for all kinds of travelers. Based on the opinions of 150 people, here are the top five most visited places. \n\n What fraction of Baguio City?",
                        imageUrl = "pie_graph_destinations",
                        options = listOf("⁴⁄₅", "⁴⁄₁₅", "¹⁄₅", "⁴⁄₁₀"),
                        correctAnswer = 2,
                        groupId = 5
                    ),
                    Question.MultipleChoice(
                        id = 24,
                        text = "In 2025, the Philippines will remain a popular summer destination with attractions for all kinds of travelers. Based on the opinions of 150 people, here are the top five most visited places. \n\n What fraction of Cebu?",
                        imageUrl = "pie_graph_destinations",
                        options = listOf("⁴⁄₁₅", "⁵⁄₆", "¹⁄₁₅", "¹⁄₆"),
                        correctAnswer = 3,
                        groupId = 5
                    ),
                    Question.MultipleChoice(
                        id = 25,
                        text = "In 2025, the Philippines will remain a popular summer destination with attractions for all kinds of travelers. Based on the opinions of 150 people, here are the top five most visited places. \n\n What fraction of Siargao?",
                        imageUrl = "pie_graph_destinations",
                        options = listOf("²⁄₁₅", "⁴⁄₁₅", "⁶⁄₁₅", "⁸⁄₁₅"),
                        correctAnswer = 0,
                        groupId = 5
                    )
                )
            )
        )
    }

    private fun getQuarter4Lesson5Activities(): List<Activity> {
        return listOf(
            // Activity 1: Problem Solving Involving Data in a Pie Graph
            Activity(
                id = 1,
                quarter = 4,
                lessonNumber = 5,
                activityNumber = 1,
                title = "Problem Solving Involving Data in a Pie Graph",
                type = ActivityType.MULTIPLE_CHOICE,
                questions = listOf(
                    // GROUP 1: Vacation Destination (Questions 1-5)
                    Question.MultipleChoice(
                        id = 1,
                        text = "A vlogger surveyed 150 people to determine their preferred vacation destination.\n\nWhich vacation destination got the highest percentage of votes?",
                        imageUrl = "pie_graph_vacation",
                        options = listOf("Baguio City", "Siargao", "Cebu", "Boracay"),
                        correctAnswer = 3,
                        groupId = 1,
                        isGroupHeader = true
                    ),
                    Question.MultipleChoice(
                        id = 2,
                        text = "A vlogger surveyed 150 people to determine their preferred vacation destination.\n\nWhich vacation destination got the lowest percentage of votes?",
                        imageUrl = "pie_graph_vacation",
                        options = listOf("Palawan", "Siargao", "Cebu", "Baguio City"),
                        correctAnswer = 1,
                        groupId = 1
                    ),
                    Question.MultipleChoice(
                        id = 3,
                        text = "A vlogger surveyed 150 people to determine their preferred vacation destination.\n\nWhat percentage of the people surveyed want to go to Baguio City?",
                        imageUrl = "pie_graph_vacation",
                        options = listOf("18%", "20%", "26%", "30%"),
                        correctAnswer = 2,
                        groupId = 1
                    ),
                    Question.MultipleChoice(
                        id = 4,
                        text = "A vlogger surveyed 150 people to determine their preferred vacation destination.\n\nWhat percentage of the people surveyed want to go to Cebu?",
                        imageUrl = "pie_graph_vacation",
                        options = listOf("15%", "18%", "20%", "22%"),
                        correctAnswer = 1,
                        groupId = 1
                    ),
                    Question.MultipleChoice(
                        id = 5,
                        text = "A vlogger surveyed 150 people to determine their preferred vacation destination.\n\nHow many times more people prefer to go to Cebu than those who prefer to go to Palawan?",
                        imageUrl = "pie_graph_vacation",
                        options = listOf("2 times", "2.5 times", "3 times", "3.4 times"),
                        correctAnswer = 3,
                        groupId = 1
                    ),

                    // GROUP 2: Milk Tea Flavor (Questions 6-10)
                    Question.MultipleChoice(
                        id = 6,
                        text = "Ms. Santos plans to start a milk tea shop and surveyed 200 people to find out their favorite flavor.\n\nWhich milk tea flavor got the highest percentage of votes?",
                        imageUrl = "pie_graph_milktea",
                        options = listOf("Okinawa", "Matcha", "Classic", "Taro"),
                        correctAnswer = 0,
                        groupId = 2,
                        isGroupHeader = true
                    ),
                    Question.MultipleChoice(
                        id = 7,
                        text = "Ms. Santos plans to start a milk tea shop and surveyed 200 people to find out their favorite flavor.\n\nWhich milk tea flavor got the lowest percentage of votes?",
                        imageUrl = "pie_graph_milktea",
                        options = listOf("Taro", "Mango", "Classic", "Matcha"),
                        correctAnswer = 1,
                        groupId = 2
                    ),
                    Question.MultipleChoice(
                        id = 8,
                        text = "Ms. Santos plans to start a milk tea shop and surveyed 200 people to find out their favorite flavor.\n\nWhat percentage of the people surveyed preferred Matcha flavor?",
                        imageUrl = "pie_graph_milktea",
                        options = listOf("20%", "25%", "30%", "35%"),
                        correctAnswer = 1,
                        groupId = 2
                    ),
                    Question.MultipleChoice(
                        id = 9,
                        text = "Ms. Santos plans to start a milk tea shop and surveyed 200 people to find out their favorite flavor.\n\nWhat percentage of the people surveyed preferred the Taro flavor?",
                        imageUrl = "pie_graph_milktea",
                        options = listOf("10%", "15%", "20%", "25%"),
                        correctAnswer = 1,
                        groupId = 2
                    ),
                    Question.MultipleChoice(
                        id = 10,
                        text = "Ms. Santos plans to start a milk tea shop and surveyed 200 people to find out their favorite flavor.\n\nHow many times more people prefer Okinawa flavor than Mango flavor?",
                        imageUrl = "pie_graph_milktea",
                        options = listOf("2 times", "3 times", "4 times", "5 times"),
                        correctAnswer = 1,
                        groupId = 2
                    ),

                    // GROUP 3: Physical Pain (Questions 11-15)
                    Question.MultipleChoice(
                        id = 11,
                        text = "A doctor conducted a survey with 300 participants to determine the most common physical pain people experience.\n\nWhich physical pain got the highest percentage of votes?",
                        imageUrl = "pie_graph_pain",
                        options = listOf("Headache", "Back Pain", "Fever", "Stomach Pain"),
                        correctAnswer = 1,
                        groupId = 3,
                        isGroupHeader = true
                    ),
                    Question.MultipleChoice(
                        id = 12,
                        text = "A doctor conducted a survey with 300 participants to determine the most common physical pain people experience.\n\nWhich physical pain got the lowest percentage of votes?",
                        imageUrl = "pie_graph_pain",
                        options = listOf("Toothache", "Fever", "Headache", "Stomach Pain"),
                        correctAnswer = 1,
                        groupId = 3
                    ),
                    Question.MultipleChoice(
                        id = 13,
                        text = "A doctor conducted a survey with 300 participants to determine the most common physical pain people experience.\n\nWhat percentage of the people surveyed mostly experienced Toothache?",
                        imageUrl = "pie_graph_pain",
                        options = listOf("10%", "15%", "20%", "25%"),
                        correctAnswer = 1,
                        groupId = 3
                    ),
                    Question.MultipleChoice(
                        id = 14,
                        text = "A doctor conducted a survey with 300 participants to determine the most common physical pain people experience.\n\nWhat percentage of the people surveyed mostly experienced Headache?",
                        imageUrl = "pie_graph_pain",
                        options = listOf("15%", "20%", "25%", "30%"),
                        correctAnswer = 1,
                        groupId = 3
                    ),
                    Question.MultipleChoice(
                        id = 15,
                        text = "A doctor conducted a survey with 300 participants to determine the most common physical pain people experience.\n\nHow many times more people are experiencing Back Pain rather than experiencing Fever?",
                        imageUrl = "pie_graph_pain",
                        options = listOf("2 times", "3 times", "4 times", "5 times"),
                        correctAnswer = 2,
                        groupId = 3
                    ),

                    // GROUP 4: Birthday Dishes (Questions 16-20)
                    Question.MultipleChoice(
                        id = 16,
                        text = "Joshua's mother surveyed 500 people to find out their preferred birthday dish.\n\nWhich dish got the highest percentage of votes?",
                        imageUrl = "pie_graph_birthday_dishes",
                        options = listOf("Lumpia", "Spaghetti", "Pancit", "Chicken"),
                        correctAnswer = 0,
                        groupId = 4,
                        isGroupHeader = true
                    ),
                    Question.MultipleChoice(
                        id = 17,
                        text = "Joshua's mother surveyed 500 people to find out their preferred birthday dish.\n\nWhich dish got the lowest percentage of votes?",
                        imageUrl = "pie_graph_birthday_dishes",
                        options = listOf("Hotdog", "Puto", "Cake", "Carbonara"),
                        correctAnswer = 1,
                        groupId = 4
                    ),
                    Question.MultipleChoice(
                        id = 18,
                        text = "Joshua's mother surveyed 500 people to find out their preferred birthday dish.\n\nWhat percentage of the people surveyed preferred Chicken?",
                        imageUrl = "pie_graph_birthday_dishes",
                        options = listOf("0.06%", "0.08%", "0.10%", "0.12%"),
                        correctAnswer = 1,
                        groupId = 4
                    ),
                    Question.MultipleChoice(
                        id = 19,
                        text = "Joshua's mother surveyed 500 people to find out their preferred birthday dish.\n\nWhat percentage of the people surveyed preferred Carbonara?",
                        imageUrl = "pie_graph_birthday_dishes",
                        options = listOf("15%", "18%", "20%", "22%"),
                        correctAnswer = 1,
                        groupId = 4
                    ),
                    Question.MultipleChoice(
                        id = 20,
                        text = "Joshua's mother surveyed 500 people to find out their preferred birthday dish.\n\nHow many times more people prefer Lumpia than Puto?",
                        imageUrl = "pie_graph_birthday_dishes",
                        options = listOf("3 times", "4 times", "5 times", "6 times"),
                        correctAnswer = 2,
                        groupId = 4
                    ),

                    // GROUP 5: Zoo Animals (Questions 21-25)
                    Question.MultipleChoice(
                        id = 21,
                        text = "Zookeepers surveyed 120 kids to find out which animal they are most excited to see.\n\nWhich animal got the highest percentage of votes?",
                        imageUrl = "pie_graph_zoo",
                        options = listOf("Lion", "Elephant", "Tiger", "Monkey"),
                        correctAnswer = 3,
                        groupId = 5,
                        isGroupHeader = true
                    ),
                    Question.MultipleChoice(
                        id = 22,
                        text = "Zookeepers surveyed 120 kids to find out which animal they are most excited to see.\n\nWhich animal got the lowest percentage of votes?",
                        imageUrl = "pie_graph_zoo",
                        options = listOf("Birds", "Tiger", "Lion", "Elephant"),
                        correctAnswer = 1,
                        groupId = 5
                    ),
                    Question.MultipleChoice(
                        id = 23,
                        text = "Zookeepers surveyed 120 kids to find out which animal they are most excited to see.\n\nWhat percentage of the children surveyed were most excited to see Birds?",
                        imageUrl = "pie_graph_zoo",
                        options = listOf("20.5%", "22.5%", "24.5%", "26.5%"),
                        correctAnswer = 1,
                        groupId = 5
                    ),
                    Question.MultipleChoice(
                        id = 24,
                        text = "Zookeepers surveyed 120 kids to find out which animal they are most excited to see.\n\nWhat percentage of the children surveyed were most excited to see Tiger?",
                        imageUrl = "pie_graph_zoo",
                        options = listOf("12%", "15%", "18%", "20%"),
                        correctAnswer = 1,
                        groupId = 5
                    ),
                    Question.MultipleChoice(
                        id = 25,
                        text = "Zookeepers surveyed 120 kids to find out which animal they are most excited to see.\n\nHow many times more children were more excited to see Elephant than Lion?",
                        imageUrl = "pie_graph_zoo",
                        options = listOf("1 time", "2 times", "3 times", "4 times"),
                        correctAnswer = 0,
                        groupId = 5
                    )
                )
            ),

            // Activity 2: Problem Solving Involving Data in a Pie Graph
            Activity(
                id = 2,
                quarter = 4,
                lessonNumber = 5,
                activityNumber = 2,
                title = "Problem Solving Involving Data in a Pie Graph",
                type = ActivityType.MULTIPLE_CHOICE,
                questions = listOf(
                    // GROUP 1: Phone Brands (Questions 1-5)
                    Question.MultipleChoice(
                        id = 1,
                        text = "A technician surveyed 60 people on what brand of phone they preferred about specifications and price.\n\nWhich brand of phone got the highest percentage of votes?",
                        imageUrl = "pie_graph_phone_brands",
                        options = listOf("Huawei", "Vivo", "Samsung", "Infinix"),
                        correctAnswer = 3,
                        groupId = 1,
                        isGroupHeader = true
                    ),
                    Question.MultipleChoice(
                        id = 2,
                        text = "A technician surveyed 60 people on what brand of phone they preferred about specifications and price.\n\nWhich brand of phone got the lowest percentage of votes?",
                        imageUrl = "pie_graph_phone_brands",
                        options = listOf("iPhone", "Samsung", "Huawei", "Vivo"),
                        correctAnswer = 1,
                        groupId = 1
                    ),
                    Question.MultipleChoice(
                        id = 3,
                        text = "A technician surveyed 60 people on what brand of phone they preferred about specifications and price.\n\nWhat percentage of the users surveyed used the iPhone the most?",
                        imageUrl = "pie_graph_phone_brands",
                        options = listOf("5%", "10%", "15%", "20%"),
                        correctAnswer = 1,
                        groupId = 1
                    ),
                    Question.MultipleChoice(
                        id = 4,
                        text = "A technician surveyed 60 people on what brand of phone they preferred about specifications and price.\n\nWhat percentage of the users surveyed used Vivo the most?",
                        imageUrl = "pie_graph_phone_brands",
                        options = listOf("20%", "25%", "30%", "35%"),
                        correctAnswer = 1,
                        groupId = 1
                    ),
                    Question.MultipleChoice(
                        id = 5,
                        text = "A technician surveyed 60 people on what brand of phone they preferred about specifications and price.\n\nHow many times more phone users used Infinix than Huawei?",
                        imageUrl = "pie_graph_phone_brands",
                        options = listOf("2 times", "2.5 times", "3 times", "3.4 times"),
                        correctAnswer = 3,
                        groupId = 1
                    ),

                    // GROUP 2: Filipino Dishes (Questions 6-10)
                    Question.MultipleChoice(
                        id = 6,
                        text = "The chef surveyed one hundred people about the dishes they frequently prepare.\n\nWhich dish got the highest percentage of votes?",
                        imageUrl = "pie_graph_dishes",
                        options = listOf("Adobo", "Sinigang", "Afritada", "Menudo"),
                        correctAnswer = 1,
                        groupId = 2,
                        isGroupHeader = true
                    ),
                    Question.MultipleChoice(
                        id = 7,
                        text = "The chef surveyed one hundred people about the dishes they frequently prepare.\n\nWhich dish got the lowest percentage of votes?",
                        imageUrl = "pie_graph_dishes",
                        options = listOf("Menudo", "Kaldereta", "Afritada", "Adobo"),
                        correctAnswer = 1,
                        groupId = 2
                    ),
                    Question.MultipleChoice(
                        id = 8,
                        text = "The chef surveyed one hundred people about the dishes they frequently prepare.\n\nWhat percentage of the people surveyed preferred the dish Afritada?",
                        imageUrl = "pie_graph_dishes",
                        options = listOf("20%", "25%", "30%", "35%"),
                        correctAnswer = 1,
                        groupId = 2
                    ),
                    Question.MultipleChoice(
                        id = 9,
                        text = "The chef surveyed one hundred people about the dishes they frequently prepare.\n\nWhat percentage of the people surveyed preferred the dish Menudo?",
                        imageUrl = "pie_graph_dishes",
                        options = listOf("5%", "10%", "15%", "20%"),
                        correctAnswer = 1,
                        groupId = 2
                    ),
                    Question.MultipleChoice(
                        id = 10,
                        text = "The chef surveyed one hundred people about the dishes they frequently prepare.\n\nHow many times more people preferred Sinigang than Kaldereta?",
                        imageUrl = "pie_graph_dishes",
                        options = listOf("10 times", "11 times", "11.2 times", "12 times"),
                        correctAnswer = 2,
                        groupId = 2
                    ),

                    // GROUP 3: Shoe Brands (Questions 11-15)
                    Question.MultipleChoice(
                        id = 11,
                        text = "BigBoy Cheng, a sneaker enthusiast, conducted a survey of 400 individuals to find out the most preferred shoe brand.\n\nWhich shoe brand got the highest percentage of votes?",
                        imageUrl = "pie_graph_shoes",
                        options = listOf("New Balance", "Adidas", "Nike", "Puma"),
                        correctAnswer = 2,
                        groupId = 3,
                        isGroupHeader = true
                    ),
                    Question.MultipleChoice(
                        id = 12,
                        text = "BigBoy Cheng, a sneaker enthusiast, conducted a survey of 400 individuals to find out the most preferred shoe brand.\n\nWhich shoe brand got the lowest percentage of votes?",
                        imageUrl = "pie_graph_shoes",
                        options = listOf("Asics", "Puma", "New Balance", "Adidas"),
                        correctAnswer = 0,
                        groupId = 3
                    ),
                    Question.MultipleChoice(
                        id = 13,
                        text = "BigBoy Cheng, a sneaker enthusiast, conducted a survey of 400 individuals to find out the most preferred shoe brand.\n\nWhat percentage of the people surveyed preferred the New Balance?",
                        imageUrl = "pie_graph_shoes",
                        options = listOf("18%", "21%", "24%", "27%"),
                        correctAnswer = 1,
                        groupId = 3
                    ),
                    Question.MultipleChoice(
                        id = 14,
                        text = "BigBoy Cheng, a sneaker enthusiast, conducted a survey of 400 individuals to find out the most preferred shoe brand.\n\nWhat percentage of the people surveyed preferred the Puma?",
                        imageUrl = "pie_graph_shoes",
                        options = listOf("12%", "15%", "18%", "21%"),
                        correctAnswer = 1,
                        groupId = 3
                    ),
                    Question.MultipleChoice(
                        id = 15,
                        text = "BigBoy Cheng, a sneaker enthusiast, conducted a survey of 400 individuals to find out the most preferred shoe brand.\n\nHow many times more people preferred Nike than Asics?",
                        imageUrl = "pie_graph_shoes",
                        options = listOf("2 times", "2.5 times", "3 times", "3.5 times"),
                        correctAnswer = 2,
                        groupId = 3
                    ),

                    // GROUP 4: Flowers (Questions 16-20)
                    Question.MultipleChoice(
                        id = 16,
                        text = "Kimbery Ga. surveyed 180 women to determine which flower they preferred as a gift from their partners.\n\nWhich flower got the highest percentage of votes?",
                        imageUrl = "pie_graph_flowers",
                        options = listOf("Sunflowers", "Roses", "Lilies", "Tulips"),
                        correctAnswer = 1,
                        groupId = 4,
                        isGroupHeader = true
                    ),
                    Question.MultipleChoice(
                        id = 17,
                        text = "Kimbery Ga. surveyed 180 women to determine which flower they preferred as a gift from their partners.\n\nWhich flower got the lowest percentage of votes?",
                        imageUrl = "pie_graph_flowers",
                        options = listOf("Sunflowers", "Peonies", "Tulips", "Lilies"),
                        correctAnswer = 0,
                        groupId = 4
                    ),
                    Question.MultipleChoice(
                        id = 18,
                        text = "Kimbery Ga. surveyed 180 women to determine which flower they preferred as a gift from their partners.\n\nWhat percentage of the people surveyed preferred the Lilies?",
                        imageUrl = "pie_graph_flowers",
                        options = listOf("16%", "19%", "22%", "25%"),
                        correctAnswer = 1,
                        groupId = 4
                    ),
                    Question.MultipleChoice(
                        id = 19,
                        text = "Kimbery Ga. surveyed 180 women to determine which flower they preferred as a gift from their partners.\n\nWhat percentage of the people surveyed preferred the Peonies?",
                        imageUrl = "pie_graph_flowers",
                        options = listOf("13%", "16%", "19%", "22%"),
                        correctAnswer = 1,
                        groupId = 4
                    ),
                    Question.MultipleChoice(
                        id = 20,
                        text = "Kimbery Ga. surveyed 180 women to determine which flower they preferred as a gift from their partners.\n\nHow many times more people preferred Rose than Peonies?",
                        imageUrl = "pie_graph_flowers",
                        options = listOf("2 times", "2.14 times", "2.5 times", "3 times"),
                        correctAnswer = 1,
                        groupId = 4
                    ),

                    // GROUP 5: Luxury Bags (Questions 21-25)
                    Question.MultipleChoice(
                        id = 21,
                        text = "Heart surveyed 180 women to determine which luxury bag brand they preferred to invest in.\n\nWhich brand of bag got the highest percentage of votes?",
                        imageUrl = "pie_graph_bags",
                        options = listOf("Chanel", "Dior", "Hermès", "Gucci"),
                        correctAnswer = 3,
                        groupId = 5,
                        isGroupHeader = true
                    ),
                    Question.MultipleChoice(
                        id = 22,
                        text = "Heart surveyed 180 women to determine which luxury bag brand they preferred to invest in.\n\nWhich brand of bag got the lowest percentage of votes?",
                        imageUrl = "pie_graph_bags",
                        options = listOf("Hermès", "Chanel", "Dior", "Louis Vuitton"),
                        correctAnswer = 0,
                        groupId = 5
                    ),
                    Question.MultipleChoice(
                        id = 23,
                        text = "Heart surveyed 180 women to determine which luxury bag brand they preferred to invest in.\n\nWhat percentage of the people surveyed preferred to invest in a Dior bag?",
                        imageUrl = "pie_graph_bags",
                        options = listOf("15%", "20%", "25%", "30%"),
                        correctAnswer = 1,
                        groupId = 5
                    ),
                    Question.MultipleChoice(
                        id = 24,
                        text = "Heart surveyed 180 women to determine which luxury bag brand they preferred to invest in.\n\nWhat percentage of the people surveyed preferred to invest in a Chanel bag?",
                        imageUrl = "pie_graph_bags",
                        options = listOf("10%", "15%", "20%", "25%"),
                        correctAnswer = 1,
                        groupId = 5
                    ),
                    Question.MultipleChoice(
                        id = 25,
                        text = "Heart surveyed 180 women to determine which luxury bag brand they preferred to invest in.\n\nHow many times more people preferred Gucci than Chanel?",
                        imageUrl = "pie_graph_bags",
                        options = listOf("1.5 times", "2 times", "2.5 times", "3 times"),
                        correctAnswer = 1,
                        groupId = 5
                    )
                )
            )
        )
    }

    private fun getQuarter4Lesson6Activities(): List<Activity> {
        return listOf(
            // Activity 1: Problem Solving Involving Data - Probability Levels
            Activity(
                id = 1,
                quarter = 4,
                lessonNumber = 6,
                activityNumber = 1,
                title = "Problem Solving Involving Data in a Pie Graph",
                type = ActivityType.MULTIPLE_CHOICE,
                questions = listOf(
                    Question.MultipleChoice(
                        id = 1,
                        text = "The sun will rise tomorrow.",
                        options = listOf("Certain", "Likely", "Most Likely", "Unlikely", "Most Unlikely"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 2,
                        text = "A dropped object will fall to the ground.",
                        options = listOf("Certain", "Likely", "Most Likely", "Unlikely", "Most Unlikely"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 3,
                        text = "A human needs oxygen to survive.",
                        options = listOf("Certain", "Likely", "Most Likely", "Unlikely", "Most Unlikely"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 4,
                        text = "Water will freeze at 0°C under normal conditions.",
                        options = listOf("Certain", "Likely", "Most Likely", "Unlikely", "Most Unlikely"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 5,
                        text = "A person drinking a glass of water will feel hydrated afterward.",
                        options = listOf("Certain", "Likely", "Most Likely", "Unlikely", "Most Unlikely"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 6,
                        text = "The Philippines will experience a typhoon within the year.",
                        options = listOf("Certain", "Likely", "Most Likely", "Unlikely", "Most Unlikely"),
                        correctAnswer = 2
                    ),
                    Question.MultipleChoice(
                        id = 7,
                        text = "A student who studies regularly will pass the exam.",
                        options = listOf("Certain", "Likely", "Most Likely", "Unlikely", "Most Unlikely"),
                        correctAnswer = 2
                    ),
                    Question.MultipleChoice(
                        id = 8,
                        text = "A refrigerator will keep food cold.",
                        options = listOf("Certain", "Likely", "Most Likely", "Unlikely", "Most Unlikely"),
                        correctAnswer = 2
                    ),
                    Question.MultipleChoice(
                        id = 9,
                        text = "A parked car will remain in the same place overnight.",
                        options = listOf("Certain", "Likely", "Most Likely", "Unlikely", "Most Unlikely"),
                        correctAnswer = 2
                    ),
                    Question.MultipleChoice(
                        id = 10,
                        text = "A person who exercises daily will be physically fit.",
                        options = listOf("Certain", "Likely", "Most Likely", "Unlikely", "Most Unlikely"),
                        correctAnswer = 2
                    ),
                    Question.MultipleChoice(
                        id = 11,
                        text = "An ice cube left outside under the sun will melt.",
                        options = listOf("Certain", "Likely", "Most Likely", "Unlikely", "Most Unlikely"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 12,
                        text = "A volcano in the Philippines will erupt this year.",
                        options = listOf("Certain", "Likely", "Most Likely", "Unlikely", "Most Unlikely"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 13,
                        text = "A person eating spicy food will feel heat in their mouth.",
                        options = listOf("Certain", "Likely", "Most Likely", "Unlikely", "Most Unlikely"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 14,
                        text = "There will be heavy traffic in Metro Manila during rush hour.",
                        options = listOf("Certain", "Likely", "Most Likely", "Unlikely", "Most Unlikely"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 15,
                        text = "A basketball player will make a free throw.",
                        options = listOf("Certain", "Likely", "Most Likely", "Unlikely", "Most Unlikely"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 16,
                        text = "A person will roll a six on a fair six-sided die.",
                        options = listOf("Certain", "Likely", "Most Likely", "Unlikely", "Most Unlikely"),
                        correctAnswer = 3
                    ),
                    Question.MultipleChoice(
                        id = 17,
                        text = "A randomly selected person from a crowd of 1,000 people will have the same birthday as you.",
                        options = listOf("Certain", "Likely", "Most Likely", "Unlikely", "Most Unlikely"),
                        correctAnswer = 3
                    ),
                    Question.MultipleChoice(
                        id = 18,
                        text = "You will find money on the street today.",
                        options = listOf("Certain", "Likely", "Most Likely", "Unlikely", "Most Unlikely"),
                        correctAnswer = 3
                    ),
                    Question.MultipleChoice(
                        id = 19,
                        text = "A street vendor will sell out all their products before noon.",
                        options = listOf("Certain", "Likely", "Most Likely", "Unlikely", "Most Unlikely"),
                        correctAnswer = 3
                    ),
                    Question.MultipleChoice(
                        id = 20,
                        text = "A person will see a shooting star tonight.",
                        options = listOf("Certain", "Likely", "Most Likely", "Unlikely", "Most Unlikely"),
                        correctAnswer = 3
                    ),
                    Question.MultipleChoice(
                        id = 21,
                        text = "The chance of drawing the ace of spades from a deck of 52 cards is 2%.",
                        options = listOf("Certain", "Likely", "Most Likely", "Unlikely", "Most Unlikely"),
                        correctAnswer = 4
                    ),
                    Question.MultipleChoice(
                        id = 22,
                        text = "It will snow tomorrow in the Philippines.",
                        options = listOf("Certain", "Likely", "Most Likely", "Unlikely", "Most Unlikely"),
                        correctAnswer = 4
                    ),
                    Question.MultipleChoice(
                        id = 23,
                        text = "A person will win the jackpot in a lottery.",
                        options = listOf("Certain", "Likely", "Most Likely", "Unlikely", "Most Unlikely"),
                        correctAnswer = 4
                    ),
                    Question.MultipleChoice(
                        id = 24,
                        text = "It will rain in the desert tomorrow.",
                        options = listOf("Certain", "Likely", "Most Likely", "Unlikely", "Most Unlikely"),
                        correctAnswer = 4
                    ),
                    Question.MultipleChoice(
                        id = 25,
                        text = "A basketball player will make 10 half-court shots in a row.",
                        options = listOf("Certain", "Likely", "Most Likely", "Unlikely", "Most Unlikely"),
                        correctAnswer = 4
                    )
                )
            ),

            // Activity 2: Problem Solving Involving Data - True or False
            Activity(
                id = 2,
                quarter = 4,
                lessonNumber = 6,
                activityNumber = 2,
                title = "Problem Solving Involving Data in a Pie Graph",
                type = ActivityType.MULTIPLE_CHOICE,
                questions = listOf(
                    Question.MultipleChoice(
                        id = 1,
                        text = "It is certain that the moon will appear in the sky tonight.",
                        options = listOf("True", "False"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 2,
                        text = "It is certain that a lit candle will produce light.",
                        options = listOf("True", "False"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 3,
                        text = "It is certain that a newborn baby will need food to survive.",
                        options = listOf("True", "False"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 4,
                        text = "It is certain that boiling water will produce steam.",
                        options = listOf("True", "False"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 5,
                        text = "It is certain that a person who does not eat for a week will feel weak.",
                        options = listOf("True", "False"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 6,
                        text = "It is most likely that there will be traffic in New York City during rush hour.",
                        options = listOf("True", "False"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 7,
                        text = "It is most likely that a power outage will occur in a country that frequently experiences blackouts.",
                        options = listOf("True", "False"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 8,
                        text = "It is most likely that a well-maintained car will fail to start when the ignition is turned on.",
                        options = listOf("True", "False"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 9,
                        text = "It is most likely that a professional chef will cook a delicious meal.",
                        options = listOf("True", "False"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 10,
                        text = "It is most likely that a well-fed pet will be happy and energetic.",
                        options = listOf("True", "False"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 11,
                        text = "It is likely that a person who does not wear sunscreen on a sunny day will get sunburned.",
                        options = listOf("True", "False"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 12,
                        text = "It is likely that a smartphone battery will stay fully charged all day with regular use.",
                        options = listOf("True", "False"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 13,
                        text = "It is likely that a person who drinks coffee in the evening will have trouble sleeping.",
                        options = listOf("True", "False"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 14,
                        text = "It is likely that a person walking in the rain without an umbrella will stay dry.",
                        options = listOf("True", "False"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 15,
                        text = "It is likely that a dog will bark when a stranger enters the house.",
                        options = listOf("True", "False"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 16,
                        text = "It is unlikely that a person rolling two dice will get a total of 12.",
                        options = listOf("True", "False"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 17,
                        text = "It is unlikely that a person will randomly pick a red marble from a bag containing mostly blue marbles.",
                        options = listOf("True", "False"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 18,
                        text = "It is unlikely that a person will receive an urgent email at midnight.",
                        options = listOf("True", "False"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 19,
                        text = "It is unlikely that a child will eat all the vegetables on their plate without complaint.",
                        options = listOf("True", "False"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 20,
                        text = "It is unlikely that a student will win a prize in a school raffle with 500 participants.",
                        options = listOf("True", "False"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 21,
                        text = "It is most unlikely that a person will find a four-leaf clover in a random field.",
                        options = listOf("True", "False"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 22,
                        text = "It is most unlikely that it will hail tomorrow in a tropical country.",
                        options = listOf("True", "False"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 23,
                        text = "It is most unlikely that a person will guess a randomly chosen number between 1 and 1000 on the first try.",
                        options = listOf("True", "False"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 24,
                        text = "It is most unlikely that a randomly chosen person will become the president of a country.",
                        options = listOf("True", "False"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 25,
                        text = "It is most unlikely that a person will win a million-dollar lottery twice in their lifetime.",
                        options = listOf("True", "False"),
                        correctAnswer = 0
                    )
                )
            )
        )
    }

    private fun getQuarter4Lesson7Activities(): List<Activity> {
        return listOf(
            // Activity 1: Making Lists and Diagrams of Outcomes
            Activity(
                id = 1,
                quarter = 4,
                lessonNumber = 7,
                activityNumber = 1,
                title = "Making Lists and Diagrams of Outcomes and Telling the Number of Favorable Outcomes and Chances",
                type = ActivityType.MULTIPLE_CHOICE,
                questions = listOf(
                    Question.MultipleChoice(
                        id = 1,
                        text = "Sarah has six flavors of ice cream: vanilla, chocolate, strawberry, mango, cookies & cream, and mint. She wants to eat two. How many combinations are possible?",
                        options = listOf("15", "12", "14", "16"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 2,
                        text = "Jake has seven transportation options: bicycle, scooter, skateboard, roller skates, train, bus, and car. If he chooses any two to use today, how many different combinations can he make?",
                        options = listOf("23", "21", "24", "19"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 3,
                        text = "Lily has four favorite books: mystery, fantasy, science fiction, and historical fiction. If she can read only two this week, how many different pairs can she choose?",
                        options = listOf("9", "7", "6", "5"),
                        correctAnswer = 2
                    ),
                    Question.MultipleChoice(
                        id = 4,
                        text = "Tom has eight different animals at the zoo: a lion, an elephant, a giraffe, a zebra, a panda, a tiger, a flamingo, and a koala. He wants to visit two. How many different pairs of animals can he visit?",
                        options = listOf("22", "24", "26", "28"),
                        correctAnswer = 3
                    ),
                    Question.MultipleChoice(
                        id = 5,
                        text = "Emma has five different clothing items: a jacket, a sweater, a hoodie, a t-shirt, and a vest. She wants to wear two. How many possible pairs of different clothing she can wear?",
                        options = listOf("10", "12", "14", "16"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 6,
                        text = "Noah has nine different types of pasta: spaghetti, penne, macaroni, fusilli, ravioli, fettuccine, lasagna, angel hair, and tortellini. He wants to cook two. How many possible pairs of pasta can he cook?",
                        options = listOf("33", "36", "39", "41"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 7,
                        text = "Olivia has three pets: a dog, a cat, and a bird. She can only take two for a walk today. How many are her possible choices?",
                        options = listOf("4", "5", "3", "2"),
                        correctAnswer = 2
                    ),
                    Question.MultipleChoice(
                        id = 8,
                        text = "Ethan has six sports to choose from: soccer, baseball, basketball, swimming, running, and cycling. He can play only two today. How many are his possible choices?",
                        options = listOf("12", "18", "21", "15"),
                        correctAnswer = 3
                    ),
                    Question.MultipleChoice(
                        id = 9,
                        text = "Mia has ten different phone apps: Instagram, Facebook, Twitter, TikTok, YouTube, Snapchat, WhatsApp, Discord, Spotify, and Netflix. She wants to use two. How many are her possible selections?",
                        options = listOf("45", "40", "50", "55"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 10,
                        text = "Lucas has seven favorite fruits: apple, banana, orange, mango, grapes, peach, and watermelon. He wants to eat two. How many are his possible choices?",
                        options = listOf("18", "21", "24", "27"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 11,
                        text = "Ava has four vacation destinations: Paris, Tokyo, Sydney, and New York. She wants to visit two. How many possible pairs of destinations does she have?",
                        options = listOf("5", "7", "6", "8"),
                        correctAnswer = 2
                    ),
                    Question.MultipleChoice(
                        id = 12,
                        text = "James has eight types of sandwiches: ham, turkey, roast beef, chicken, tuna, veggie, egg salad, and peanut butter & jelly. He wants to eat two. How many are the possible combinations?",
                        options = listOf("24", "26", "30", "28"),
                        correctAnswer = 3
                    ),
                    Question.MultipleChoice(
                        id = 13,
                        text = "Charlotte has five different hobbies: painting, photography, hiking, knitting, and baking. She wants to do two today. How many are her possible options?",
                        options = listOf("10", "12", "14", "15"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 14,
                        text = "Henry has three different game consoles: PlayStation, Xbox, and Nintendo Switch. He wants to play on two. How many are his possible choices?",
                        options = listOf("2", "3", "4", "5"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 15,
                        text = "Sophia has six colors of nail polish: red, blue, green, purple, pink, and yellow. She wants to use two. How many are the possible pairs?",
                        options = listOf("13", "14", "15", "16"),
                        correctAnswer = 2
                    ),
                    Question.MultipleChoice(
                        id = 16,
                        text = "Benjamin has four different hats: a baseball cap, a fedora, a beanie, and a sun hat. He wants to wear two. How many are his possible choices?",
                        options = listOf("4", "5", "7", "6"),
                        correctAnswer = 3
                    ),
                    Question.MultipleChoice(
                        id = 17,
                        text = "Amelia has ten different flowers in her garden: roses, tulips, daisies, sunflowers, lilies, orchids, violets, peonies, hydrangeas, and lavender. She wants to pick two for a bouquet. How many are the possible pairs?",
                        options = listOf("45", "43", "46", "44"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 18,
                        text = "Jack has nine school subjects: Math, Science, History, English, Geography, Art, Music, Physical Education, and Computer Science. He can study only two today. How many are his possible options?",
                        options = listOf("35", "36", "37", "34"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 19,
                        text = "Emily has five different board games: Monopoly, Scrabble, Chess, Clue, and Risk. She wants to play two. How many are the possible choices?",
                        options = listOf("8", "12", "10", "11"),
                        correctAnswer = 2
                    ),
                    Question.MultipleChoice(
                        id = 20,
                        text = "Daniel has six flavors of chips: barbecue, sour cream & onion, salt & vinegar, cheese, jalapeño, and plain. He wants to eat two. How many are the possible combinations?",
                        options = listOf("13", "16", "14", "15"),
                        correctAnswer = 3
                    ),
                    Question.MultipleChoice(
                        id = 21,
                        text = "Harper has seven types of cookies: chocolate chip, oatmeal raisin, peanut butter, sugar, shortbread, gingerbread, and macadamia nut. She wants to eat two. How many are the possible pairs?",
                        options = listOf("21", "19", "20", "22"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 22,
                        text = "Matthew has three different drinks: coffee, tea, and hot chocolate. He wants to have two. How many are his possible options?",
                        options = listOf("5", "3", "4", "6"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 23,
                        text = "Ella has five favorite desserts: cake, pie, pudding, brownies, and cheesecake. She wants to eat two. How many are the possible combinations?",
                        options = listOf("8", "9", "10", "11"),
                        correctAnswer = 2
                    ),
                    Question.MultipleChoice(
                        id = 24,
                        text = "David has eight pairs of shoes: sneakers, boots, flip-flops, high heels, loafers, dress shoes, sandals, and running shoes. He wants to wear two. How many are the possible choices?",
                        options = listOf("26", "30", "32", "28"),
                        correctAnswer = 3
                    ),
                    Question.MultipleChoice(
                        id = 25,
                        text = "Madison has nine different music genres: pop, rock, jazz, country, classical, hip-hop, R&B, reggae, and electronic. She wants to listen to two. How many are the possible pairs?",
                        options = listOf("36", "34", "35", "37"),
                        correctAnswer = 0
                    )
                )
            ),

            // Activity 2: Making Lists and Diagrams of Outcomes
            Activity(
                id = 2,
                quarter = 4,
                lessonNumber = 7,
                activityNumber = 2,
                title = "Making Lists and Diagrams of Outcomes",
                type = ActivityType.MULTIPLE_CHOICE,
                questions = listOf(
                    Question.MultipleChoice(
                        id = 1,
                        text = "",
                        imageUrl = "q4_l7_a2_q1",
                        options = listOf("2", "3", "4", "5"),
                        correctAnswer = 2
                    ),
                    Question.MultipleChoice(
                        id = 2,
                        text = "",
                        imageUrl = "q4_l7_a2_q2",
                        options = listOf("4", "5", "6", "7"),
                        correctAnswer = 2
                    ),
                    Question.MultipleChoice(
                        id = 3,
                        text = "",
                        imageUrl = "q4_l7_a2_q3",
                        options = listOf("2", "3", "4", "5"),
                        correctAnswer = 2
                    ),
                    Question.MultipleChoice(
                        id = 4,
                        text = "",
                        imageUrl = "q4_l7_a2_q4",
                        options = listOf("3", "4", "5", "6"),
                        correctAnswer = 2
                    ),
                    Question.MultipleChoice(
                        id = 5,
                        text = "",
                        imageUrl = "q4_l7_a2_q5",
                        options = listOf("4", "5", "6", "7"),
                        correctAnswer = 2
                    ),
                    Question.MultipleChoice(
                        id = 6,
                        text = "",
                        imageUrl = "q4_l7_a2_q6",
                        options = listOf("6", "7", "8", "9"),
                        correctAnswer = 2
                    ),
                    Question.MultipleChoice(
                        id = 7,
                        text = "",
                        imageUrl = "q4_l7_a2_q7",
                        options = listOf("7", "8", "9", "10"),
                        correctAnswer = 2
                    ),
                    Question.MultipleChoice(
                        id = 8,
                        text = "",
                        imageUrl = "q4_l7_a2_q8",
                        options = listOf("8", "9", "10", "11"),
                        correctAnswer = 2
                    ),
                    Question.MultipleChoice(
                        id = 9,
                        text = "",
                        imageUrl = "q4_l7_a2_q9",
                        options = listOf("10", "11", "12", "13"),
                        correctAnswer = 2
                    ),
                    Question.MultipleChoice(
                        id = 10,
                        text = "",
                        imageUrl = "q4_l7_a2_q10",
                        options = listOf("12", "13", "14", "15"),
                        correctAnswer = 2
                    ),
                    Question.MultipleChoice(
                        id = 11,
                        text = "",
                        imageUrl = "q4_l7_a2_q11",
                        options = listOf("13", "14", "15", "16"),
                        correctAnswer = 2
                    ),
                    Question.MultipleChoice(
                        id = 12,
                        text = "",
                        imageUrl = "q4_l7_a2_q12",
                        options = listOf("14", "15", "16", "17"),
                        correctAnswer = 2
                    ),
                    Question.MultipleChoice(
                        id = 13,
                        text = "",
                        imageUrl = "q4_l7_a2_q13",
                        options = listOf("1", "2", "3", "4"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 14,
                        text = "",
                        imageUrl = "q4_l7_a2_q14",
                        options = listOf("2", "3", "4", "5"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 15,
                        text = "",
                        imageUrl = "q4_l7_a2_q15",
                        options = listOf("3", "4", "5", "6"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 16,
                        text = "",
                        imageUrl = "q4_l7_a2_q16",
                        options = listOf("4", "5", "6", "7"),
                        correctAnswer = 2
                    ),
                    Question.MultipleChoice(
                        id = 17,
                        text = "",
                        imageUrl = "q4_l7_a2_q17",
                        options = listOf("6", "7", "8", "9"),
                        correctAnswer = 2
                    ),
                    Question.MultipleChoice(
                        id = 18,
                        text = "",
                        imageUrl = "q4_l7_a2_q18",
                        options = listOf("7", "8", "9", "10"),
                        correctAnswer = 2
                    ),
                    Question.MultipleChoice(
                        id = 19,
                        text = "",
                        imageUrl = "q4_l7_a2_q19",
                        options = listOf("8", "9", "10", "11"),
                        correctAnswer = 2
                    ),
                    Question.MultipleChoice(
                        id = 20,
                        text = "",
                        imageUrl = "q4_l7_a2_q20",
                        options = listOf("10", "11", "12", "13"),
                        correctAnswer = 2
                    ),
                    Question.MultipleChoice(
                        id = 21,
                        text = "",
                        imageUrl = "q4_l7_a2_q21",
                        options = listOf("12", "13", "14", "15"),
                        correctAnswer = 2
                    ),
                    Question.MultipleChoice(
                        id = 22,
                        text = "",
                        imageUrl = "q4_l7_a2_q22",
                        options = listOf("13", "14", "15", "16"),
                        correctAnswer = 2
                    ),
                    Question.MultipleChoice(
                        id = 23,
                        text = "",
                        imageUrl = "q4_l7_a2_q23",
                        options = listOf("14", "15", "16", "17"),
                        correctAnswer = 2
                    ),
                    Question.MultipleChoice(
                        id = 24,
                        text = "",
                        imageUrl = "q4_l7_a2_q24",
                        options = listOf("16", "17", "18", "19"),
                        correctAnswer = 2
                    ),
                    Question.MultipleChoice(
                        id = 25,
                        text = "",
                        imageUrl = "q4_l7_a2_q25",
                        options = listOf("18", "19", "20", "21"),
                        correctAnswer = 2
                    )
                )
            )
        )
    }

    private fun getQuarter4Lesson8Activities(): List<Activity> {
        return listOf(
            // Activity 1: Most likely to happen or Unlikely to occur
            Activity(
                id = 1,
                quarter = 4,
                lessonNumber = 8,
                activityNumber = 1,
                title = "Makes Simple Predictions of Events Based on the Results of Experiments",
                type = ActivityType.MULTIPLE_CHOICE,
                questions = listOf(
                    Question.MultipleChoice(
                        id = 1,
                        text = "Winning a jackpot in a lottery",
                        options = listOf("Most likely to happen", "Unlikely to occur"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 2,
                        text = "Flipping a coin and getting heads",
                        options = listOf("Most likely to happen", "Unlikely to occur"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 3,
                        text = "Meeting a celebrity while walking in the mall",
                        options = listOf("Most likely to happen", "Unlikely to occur"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 4,
                        text = "Experiencing rain during the rainy season",
                        options = listOf("Most likely to happen", "Unlikely to occur"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 5,
                        text = "Finding a pearl inside an oyster you eat",
                        options = listOf("Most likely to happen", "Unlikely to occur"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 6,
                        text = "Rolling a die and getting a number between 1 and 6",
                        options = listOf("Most likely to happen", "Unlikely to occur"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 7,
                        text = "Discovering a hidden treasure in your backyard",
                        options = listOf("Most likely to happen", "Unlikely to occur"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 8,
                        text = "Getting a sunburn after staying outside at noon without protection",
                        options = listOf("Most likely to happen", "Unlikely to occur"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 9,
                        text = "Being struck by lightning while standing outside",
                        options = listOf("Most likely to happen", "Unlikely to occur"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 10,
                        text = "Feeling sleepy after staying awake all night",
                        options = listOf("Most likely to happen", "Unlikely to occur"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 11,
                        text = "Accidentally running into your childhood best friend in another country",
                        options = listOf("Most likely to happen", "Unlikely to occur"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 12,
                        text = "Getting wet when you step into a puddle",
                        options = listOf("Most likely to happen", "Unlikely to occur"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 13,
                        text = "Finding money on the street",
                        options = listOf("Most likely to happen", "Unlikely to occur"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 14,
                        text = "Getting hungry if you skip breakfast",
                        options = listOf("Most likely to happen", "Unlikely to occur"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 15,
                        text = "Seeing a shooting star at night",
                        options = listOf("Most likely to happen", "Unlikely to occur"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 16,
                        text = "Having your phone battery drain if you use it all day without charging",
                        options = listOf("Most likely to happen", "Unlikely to occur"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 17,
                        text = "Receiving a surprise gift from a stranger",
                        options = listOf("Most likely to happen", "Unlikely to occur"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 18,
                        text = "Getting thirsty after exercising",
                        options = listOf("Most likely to happen", "Unlikely to occur"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 19,
                        text = "Seeing a rainbow after heavy rain with sunlight",
                        options = listOf("Most likely to happen", "Unlikely to occur"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 20,
                        text = "Being chosen as the next president of your country",
                        options = listOf("Most likely to happen", "Unlikely to occur"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 21,
                        text = "Dropping a glass and it breaking",
                        options = listOf("Most likely to happen", "Unlikely to occur"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 22,
                        text = "Waking up in the morning and seeing the sun rise",
                        options = listOf("Most likely to happen", "Unlikely to occur"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 23,
                        text = "Discovering alien life in your backyard",
                        options = listOf("Most likely to happen", "Unlikely to occur"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 24,
                        text = "Catching a cold during the cold season",
                        options = listOf("Most likely to happen", "Unlikely to occur"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 25,
                        text = "Finding a four-leaf clover in a random field",
                        options = listOf("Most likely to happen", "Unlikely to occur"),
                        correctAnswer = 1
                    )
                )
            ),

            // Activity 2: Theoretical Probability or Experimental Probability
            Activity(
                id = 2,
                quarter = 4,
                lessonNumber = 8,
                activityNumber = 2,
                title = "Makes Simple Predictions of Events Based on the Results of Experiments",
                type = ActivityType.MULTIPLE_CHOICE,
                questions = listOf(
                    Question.MultipleChoice(
                        id = 1,
                        text = "A bag has 10 red marbles and 5 blue marbles. What is the probability of picking a red marble?",
                        options = listOf("Theoretical Probability", "Experimental Probability"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 2,
                        text = "A spinner is divided into 4 equal sections: red, yellow, green, blue. What is the probability of landing on yellow?",
                        options = listOf("Theoretical Probability", "Experimental Probability"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 3,
                        text = "In 200 coin flips, a coin landed heads 118 times. Find the probability of getting heads.",
                        options = listOf("Theoretical Probability", "Experimental Probability"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 4,
                        text = "A standard die is rolled. What is the probability of rolling a 3?",
                        options = listOf("Theoretical Probability", "Experimental Probability"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 5,
                        text = "Out of 100 people surveyed, 60 preferred coffee over tea. What is the probability that a person prefers coffee?",
                        options = listOf("Theoretical Probability", "Experimental Probability"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 6,
                        text = "A deck of 52 cards is shuffled. What is the probability of drawing a king?",
                        options = listOf("Theoretical Probability", "Experimental Probability"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 7,
                        text = "A basketball player took 50 free throws and made 32. What is the probability of making a free throw?",
                        options = listOf("Theoretical Probability", "Experimental Probability"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 8,
                        text = "A coin has two sides: heads and tails. What is the probability of flipping tails?",
                        options = listOf("Theoretical Probability", "Experimental Probability"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 9,
                        text = "A box contains 8 chocolates. 3 are caramel-filled. What is the probability of selecting a caramel chocolate?",
                        options = listOf("Theoretical Probability", "Experimental Probability"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 10,
                        text = "A class of 40 students took a test. 28 students passed. What is the probability that a student passed?",
                        options = listOf("Theoretical Probability", "Experimental Probability"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 11,
                        text = "Rolling a pair of dice, what is the probability of getting a sum of 7?",
                        options = listOf("Theoretical Probability", "Experimental Probability"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 12,
                        text = "Out of 25 days, it rained for 6 days. What is the probability of rain on a given day?",
                        options = listOf("Theoretical Probability", "Experimental Probability"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 13,
                        text = "A spinner has 5 equal sections labeled 1–5. What is the probability of spinning a 4?",
                        options = listOf("Theoretical Probability", "Experimental Probability"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 14,
                        text = "In a school survey of 500 students, 300 said they like pizza. Find the probability a student likes pizza.",
                        options = listOf("Theoretical Probability", "Experimental Probability"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 15,
                        text = "A deck of 52 cards is shuffled. What is the probability of drawing an ace?",
                        options = listOf("Theoretical Probability", "Experimental Probability"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 16,
                        text = "Out of 400 bulbs tested, 380 worked properly. What is the probability a bulb works?",
                        options = listOf("Theoretical Probability", "Experimental Probability"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 17,
                        text = "A die is rolled. What is the probability of rolling an even number?",
                        options = listOf("Theoretical Probability", "Experimental Probability"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 18,
                        text = "A science experiment found that 45 out of 60 plants grew taller with fertilizer. What is the probability of plant growth?",
                        options = listOf("Theoretical Probability", "Experimental Probability"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 19,
                        text = "A bag has 3 black marbles and 7 white marbles. What is the probability of drawing a black marble?",
                        options = listOf("Theoretical Probability", "Experimental Probability"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 20,
                        text = "Out of 1,000 website visitors, 250 clicked an ad. Find the probability of clicking the ad.",
                        options = listOf("Theoretical Probability", "Experimental Probability"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 21,
                        text = "Drawing a card from a deck, what is the probability of drawing a heart?",
                        options = listOf("Theoretical Probability", "Experimental Probability"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 22,
                        text = "In 100 tosses of a coin, the coin landed tails 52 times. What is the probability of tails?",
                        options = listOf("Theoretical Probability", "Experimental Probability"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 23,
                        text = "A spinner is divided into 3 equal parts: red, blue, green. What is the probability of landing on green?",
                        options = listOf("Theoretical Probability", "Experimental Probability"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 24,
                        text = "Out of 1,200 flights, 1,150 arrived on time. What is the probability a flight arrives on time?",
                        options = listOf("Theoretical Probability", "Experimental Probability"),
                        correctAnswer = 1
                    ),
                    Question.MultipleChoice(
                        id = 25,
                        text = "In 150 coin tosses, the coin landed on heads 73 times. What is the probability of getting heads?",
                        options = listOf("Theoretical Probability", "Experimental Probability"),
                        correctAnswer = 1
                    )
                )
            )
        )
    }

    private fun getQuarter4Lesson9Activities(): List<Activity> {
        return listOf(
            // Activity 1: Routine and Non-Routine Problems - Involving Experimental and Theoretical probability (Video-based)
            Activity(
                id = 1,
                quarter = 4,
                lessonNumber = 2,
                activityNumber = 1,
                title = "Routine and Non-Routine Problems - Involving Experimental and Theoretical probability",
                type = ActivityType.ROUTINE_PROBLEM,
                questions = listOf(
                    Question.RoutineProblem(
                        id = 1,
                        text = "",
                        videoFileName = "activity_1-n1.mp4",
                        description = "Routine and Non-Routine Problems - Involving Experimental and Theoretical probability"
                    ),
                    Question.RoutineProblem(
                        id = 2,
                        text = "",
                        videoFileName = "activity_1-n2.mp4",
                        description = "Routine and Non-Routine Problems - Involving Experimental and Theoretical probability"
                    ),
                    Question.RoutineProblem(
                        id = 3,
                        text = "",
                        videoFileName = "activity_1-n3.mp4",
                        description = "Routine and Non-Routine Problems - Involving Experimental and Theoretical probability"
                    ),
                    Question.RoutineProblem(
                        id = 4,
                        text = "",
                        videoFileName = "activity_1-n4.mp4",
                        description = "Routine and Non-Routine Problems - Involving Experimental and Theoretical probability"
                    ),
                    Question.RoutineProblem(
                        id = 5,
                        text = "",
                        videoFileName = "activity_1-n5.mp4",
                        description = "Routine and Non-Routine Problems - Involving Experimental and Theoretical probability"
                    ),
                    Question.RoutineProblem(
                        id = 6,
                        text = "",
                        videoFileName = "activity_1-n6.mp4",
                        description = "Routine and Non-Routine Problems - Involving Experimental and Theoretical probability"
                    ),
                    Question.RoutineProblem(
                        id = 7,
                        text = "",
                        videoFileName = "activity_1-n7.mp4",
                        description = "Routine and Non-Routine Problems - Involving Experimental and Theoretical probability"
                    ),
                )
            ),

            // Activity 2: Routine and Non-Routine Problems - Involving Experimental and Theoretical probability (Video-based)
            Activity(
                id = 2,
                quarter = 4,
                lessonNumber = 2,
                activityNumber = 2,
                title = "Routine and Non-Routine Problems - Involving Experimental and Theoretical probability",
                type = ActivityType.ROUTINE_PROBLEM,
                questions = listOf(
                    Question.RoutineProblem(
                        id = 1,
                        text = "",
                        videoFileName = "activity_2-n1.mp4",
                        description = "Routine and Non-Routine Problems - Involving Experimental and Theoretical probability"
                    ),
                    Question.RoutineProblem(
                        id = 2,
                        text = "",
                        videoFileName = "activity_2-n2.mp4",
                        description = "Routine and Non-Routine Problems - Involving Experimental and Theoretical probability"
                    ),
                    Question.RoutineProblem(
                        id = 3,
                        text = "",
                        videoFileName = "activity_2-n3.mp4",
                        description = "Routine and Non-Routine Problems - Involving Experimental and Theoretical probability"
                    ),
                    Question.RoutineProblem(
                        id = 4,
                        text = "",
                        videoFileName = "activity_2-n4.mp4",
                        description = "Routine and Non-Routine Problems - Involving Experimental and Theoretical probability"
                    ),
                    Question.RoutineProblem(
                        id = 5,
                        text = "",
                        videoFileName = "activity_2-n5.mp4",
                        description = "Routine and Non-Routine Problems - Involving Experimental and Theoretical probability"
                    ),
                    Question.RoutineProblem(
                        id = 6,
                        text = "",
                        videoFileName = "activity_2-n6.mp4",
                        description = "Routine and Non-Routine Problems - Involving Experimental and Theoretical probability"
                    ),
                    Question.RoutineProblem(
                        id = 7,
                        text = "",
                        videoFileName = "activity_2-n7.mp4",
                        description = "Routine and Non-Routine Problems - Involving Experimental and Theoretical probability"
                    ),
                )
            ),
        )
    }
}