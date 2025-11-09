package com.bitrealm.mathwizdomapp.data

import com.bitrealm.mathwizdomapp.models.*

object ActivityDataProvider {

    fun getActivitiesForLesson(quarter: Int, lessonNumber: Int): List<Activity> {
        return when ("${quarter}_$lessonNumber") {
            "1_1" -> getQuarter1Lesson1Activities()
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
                title = "Dissimilar or Similar (Same concept as True or False)",
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
                        text = "2 1/3 and 1 2/3",
                        options = listOf("Similar", "Dissimilar"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 12,
                        text = "3/5 and 2/5",
                        options = listOf("Similar", "Dissimilar"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 13,
                        text = "1 1/2 and 2 1/2",
                        options = listOf("Similar", "Dissimilar"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 14,
                        text = "3 1/4 and 2 3/4",
                        options = listOf("Similar", "Dissimilar"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 15,
                        text = "5 1/2 and 2 1/2",
                        options = listOf("Similar", "Dissimilar"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 16,
                        text = "4/7 and 3/7",
                        options = listOf("Similar", "Dissimilar"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 17,
                        text = "1/8 and 3/8",
                        options = listOf("Similar", "Dissimilar"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 18,
                        text = "4 1/3 and 3 2/3",
                        options = listOf("Similar", "Dissimilar"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 19,
                        text = "4/8 and 1/8",
                        options = listOf("Similar", "Dissimilar"),
                        correctAnswer = 0
                    ),
                    Question.MultipleChoice(
                        id = 20,
                        text = "2 2/5 and 1 3/5",
                        options = listOf("Similar", "Dissimilar"),
                        correctAnswer = 0
                    ),
                )
            ),

            // Activity 2: Matching Type (Drag and Drop)
            Activity(
                id = 2,
                quarter = 1,
                lessonNumber = 1,
                activityNumber = 2,
                title = "Matching Type (Drag and Drop)",
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
}