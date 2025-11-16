package com.bitrealm.mathwizdomapp.data

import com.bitrealm.mathwizdomapp.models.*

object ActivityDataProvider {

    fun getActivitiesForLesson(quarter: Int, lessonNumber: Int): List<Activity> {
        return when ("${quarter}_$lessonNumber") {
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
            // Add more lessons
            else -> emptyList()
        }
    }

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
                lessonNumber = 11,
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
                )
            ),


            // Activity 2: Routine and Non-Routine Problems - Multiplication Decimals including money (Video-based)
//            Activity(
//                id = 2,
//                quarter = 1,
//                lessonNumber = 11,
//                activityNumber = 2,
//                title = "Solve Routine or Non-routine Problems Involving Multiplication of Decimals and Mixed Decimals, Including Money",
//                type = ActivityType.ROUTINE_PROBLEM,
//                questions = listOf(
//                    Question.RoutineProblem(
//                        id = 1,
//                        text = "",
//                        videoFileName = "activity_2-n1.mp4",
//                        description = "Solve Routine or Non-routine Problems Involving Addition of Decimals and Mixed Decimals, Including Money"
//                    ),
//                )
//            ),
        )
    }

    private fun getQuarter1Lesson17Activities(): List<Activity> {
        return listOf(
            // Activity 1: Routine and Non-Routine Problems - Any Operations including Decimals, Whole Numbers and Money (Video-based)
//            Activity(
//                id = 1,
//                quarter = 1,
//                lessonNumber = 16,
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
}