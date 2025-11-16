package com.bitrealm.mathwizdomapp.data

import com.bitrealm.mathwizdomapp.models.*

object ActivityDataProvider {

    fun getActivitiesForLesson(quarter: Int, lessonNumber: Int): List<Activity> {
        return when ("${quarter}_$lessonNumber") {
            "1_1" -> getQuarter1Lesson1Activities()
//            "1_2" -> getQuarter1Lesson1Activities()
            "1_3" -> getQuarter1Lesson3Activities()
            "1_4" -> getQuarter1Lesson4Activities()
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
                title = "Dissimilar or Similar",
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

//    private fun getQuarter1Lesson2Activities(): List<Activity> {
//        return listOf(
//            Activity(
//                id = 1,
//                quarter = 1,
//                lessonNumber = 2,
//                activityNumber = 1,
//                title = "Solve Routine and Non-Routine Problems",
//                type = ActivityType.ROUTINE_PROBLEM,
//                questions = listOf(
//                    Question.VideoQuestion(
//                        id = 1,
//                        videoUrl = "problem_video_1", // Just the resource name
//                        videoTitle = "Problem 1: Adding Fractions",
//                        problem = "Watch the video carefully and answer the following questions:",
//                        subQuestions = listOf(
//                            Question.VideoQuestion.SubQuestion(
//                                id = 1,
//                                text = "What is asked in the problem?",
//                                options = listOf(
//                                    "The total amount of ingredients",
//                                    "The difference between two fractions",
//                                    "The sum of two fractions",
//                                    "The product of two fractions"
//                                ),
//                                correctAnswer = 2
//                            ),
//                            Question.VideoQuestion.SubQuestion(
//                                id = 2,
//                                text = "What are the given facts?",
//                                options = listOf(
//                                    "Two similar fractions",
//                                    "Two dissimilar fractions",
//                                    "Three mixed numbers",
//                                    "One whole number and a fraction"
//                                ),
//                                correctAnswer = 0
//                            ),
//                            Question.VideoQuestion.SubQuestion(
//                                id = 3,
//                                text = "What operation will be used?",
//                                options = listOf(
//                                    "Subtraction",
//                                    "Multiplication",
//                                    "Addition",
//                                    "Division"
//                                ),
//                                correctAnswer = 2
//                            ),
//                            Question.VideoQuestion.SubQuestion(
//                                id = 4,
//                                text = "What is the number sentence?",
//                                options = listOf(
//                                    "1/4 - 2/4 = N",
//                                    "1/4 + 2/4 = N",
//                                    "1/4 × 2/4 = N",
//                                    "1/4 ÷ 2/4 = N"
//                                ),
//                                correctAnswer = 1
//                            ),
//                            Question.VideoQuestion.SubQuestion(
//                                id = 5,
//                                text = "What is the solution and answer?",
//                                options = listOf(
//                                    "1/4",
//                                    "2/4",
//                                    "3/4",
//                                    "4/4 or 1"
//                                ),
//                                correctAnswer = 2
//                            )
//                        )
//                    ),
//
//                    Question.VideoQuestion(
//                        id = 2,
//                        videoUrl = "problem_video_2",
//                        videoTitle = "Problem 2: Subtracting Mixed Fractions",
//                        problem = "Watch the video carefully and answer the following questions:",
//                        subQuestions = listOf(
//                            Question.VideoQuestion.SubQuestion(
//                                id = 1,
//                                text = "What is asked in the problem?",
//                                options = listOf(
//                                    "The remaining amount",
//                                    "The total amount",
//                                    "The doubled amount",
//                                    "The halved amount"
//                                ),
//                                correctAnswer = 0
//                            ),
//                            Question.VideoQuestion.SubQuestion(
//                                id = 2,
//                                text = "What are the given facts?",
//                                options = listOf(
//                                    "Two proper fractions",
//                                    "Two mixed numbers",
//                                    "Two improper fractions",
//                                    "One fraction and one whole number"
//                                ),
//                                correctAnswer = 1
//                            ),
//                            Question.VideoQuestion.SubQuestion(
//                                id = 3,
//                                text = "What operation will be used?",
//                                options = listOf(
//                                    "Subtraction",
//                                    "Multiplication",
//                                    "Addition",
//                                    "Division"
//                                ),
//                                correctAnswer = 0
//                            ),
//                            Question.VideoQuestion.SubQuestion(
//                                id = 4,
//                                text = "What is the number sentence?",
//                                options = listOf(
//                                    "5 2/3 - 2 1/3 = N",
//                                    "5 2/3 + 2 1/3 = N",
//                                    "5 2/3 × 2 1/3 = N",
//                                    "5 2/3 ÷ 2 1/3 = N"
//                                ),
//                                correctAnswer = 0
//                            ),
//                            Question.VideoQuestion.SubQuestion(
//                                id = 5,
//                                text = "What is the solution and answer?",
//                                options = listOf(
//                                    "2 1/3",
//                                    "3 1/3",
//                                    "3 2/3",
//                                    "4 1/3"
//                                ),
//                                correctAnswer = 1
//                            )
//                        )
//                    ),
//
//                    Question.VideoQuestion(
//                        id = 3,
//                        videoUrl = "problem_video_3",
//                        videoTitle = "Problem 3: Adding Similar Fractions",
//                        problem = "Watch the video carefully and answer the following questions:",
//                        subQuestions = listOf(
//                            Question.VideoQuestion.SubQuestion(
//                                id = 1,
//                                text = "What is asked in the problem?",
//                                options = listOf(
//                                    "The combined measurement",
//                                    "The difference in measurement",
//                                    "The average measurement",
//                                    "The doubled measurement"
//                                ),
//                                correctAnswer = 0
//                            ),
//                            Question.VideoQuestion.SubQuestion(
//                                id = 2,
//                                text = "What are the given facts?",
//                                options = listOf(
//                                    "Two similar fractions",
//                                    "Two dissimilar fractions",
//                                    "Three similar fractions",
//                                    "One fraction and percentage"
//                                ),
//                                correctAnswer = 0
//                            ),
//                            Question.VideoQuestion.SubQuestion(
//                                id = 3,
//                                text = "What operation will be used?",
//                                options = listOf(
//                                    "Subtraction",
//                                    "Multiplication",
//                                    "Addition",
//                                    "Division"
//                                ),
//                                correctAnswer = 2
//                            ),
//                            Question.VideoQuestion.SubQuestion(
//                                id = 4,
//                                text = "What is the number sentence?",
//                                options = listOf(
//                                    "3/8 - 4/8 = N",
//                                    "3/8 + 4/8 = N",
//                                    "3/8 × 4/8 = N",
//                                    "3/8 ÷ 4/8 = N"
//                                ),
//                                correctAnswer = 1
//                            ),
//                            Question.VideoQuestion.SubQuestion(
//                                id = 5,
//                                text = "What is the solution and answer?",
//                                options = listOf(
//                                    "6/8",
//                                    "7/8",
//                                    "1/8",
//                                    "5/8"
//                                ),
//                                correctAnswer = 1
//                            )
//                        )
//                    ),
//
//                    Question.VideoQuestion(
//                        id = 4,
//                        videoUrl = "problem_video_4",
//                        videoTitle = "Problem 4: Mixed Number Addition",
//                        problem = "Watch the video carefully and answer the following questions:",
//                        subQuestions = listOf(
//                            Question.VideoQuestion.SubQuestion(
//                                id = 1,
//                                text = "What is asked in the problem?",
//                                options = listOf(
//                                    "The total distance traveled",
//                                    "The remaining distance",
//                                    "The average distance",
//                                    "The speed traveled"
//                                ),
//                                correctAnswer = 0
//                            ),
//                            Question.VideoQuestion.SubQuestion(
//                                id = 2,
//                                text = "What are the given facts?",
//                                options = listOf(
//                                    "Two mixed numbers with similar fractions",
//                                    "Two mixed numbers with dissimilar fractions",
//                                    "Two proper fractions",
//                                    "Two improper fractions"
//                                ),
//                                correctAnswer = 0
//                            ),
//                            Question.VideoQuestion.SubQuestion(
//                                id = 3,
//                                text = "What operation will be used?",
//                                options = listOf(
//                                    "Subtraction",
//                                    "Multiplication",
//                                    "Addition",
//                                    "Division"
//                                ),
//                                correctAnswer = 2
//                            ),
//                            Question.VideoQuestion.SubQuestion(
//                                id = 4,
//                                text = "What is the number sentence?",
//                                options = listOf(
//                                    "2 3/5 - 1 2/5 = N",
//                                    "2 3/5 + 1 2/5 = N",
//                                    "2 3/5 × 1 2/5 = N",
//                                    "2 3/5 ÷ 1 2/5 = N"
//                                ),
//                                correctAnswer = 1
//                            ),
//                            Question.VideoQuestion.SubQuestion(
//                                id = 5,
//                                text = "What is the solution and answer?",
//                                options = listOf(
//                                    "3 5/5 or 4",
//                                    "3 4/5",
//                                    "4 1/5",
//                                    "3 3/5"
//                                ),
//                                correctAnswer = 0
//                            )
//                        )
//                    ),
//
//                    Question.VideoQuestion(
//                        id = 5,
//                        videoUrl = "problem_video_5",
//                        videoTitle = "Problem 5: Subtracting Similar Fractions",
//                        problem = "Watch the video carefully and answer the following questions:",
//                        subQuestions = listOf(
//                            Question.VideoQuestion.SubQuestion(
//                                id = 1,
//                                text = "What is asked in the problem?",
//                                options = listOf(
//                                    "The amount eaten",
//                                    "The amount remaining",
//                                    "The total amount",
//                                    "The doubled amount"
//                                ),
//                                correctAnswer = 1
//                            ),
//                            Question.VideoQuestion.SubQuestion(
//                                id = 2,
//                                text = "What are the given facts?",
//                                options = listOf(
//                                    "Two similar fractions",
//                                    "Two dissimilar fractions",
//                                    "Two mixed numbers",
//                                    "One whole and one fraction"
//                                ),
//                                correctAnswer = 0
//                            ),
//                            Question.VideoQuestion.SubQuestion(
//                                id = 3,
//                                text = "What operation will be used?",
//                                options = listOf(
//                                    "Subtraction",
//                                    "Multiplication",
//                                    "Addition",
//                                    "Division"
//                                ),
//                                correctAnswer = 0
//                            ),
//                            Question.VideoQuestion.SubQuestion(
//                                id = 4,
//                                text = "What is the number sentence?",
//                                options = listOf(
//                                    "7/10 - 3/10 = N",
//                                    "7/10 + 3/10 = N",
//                                    "7/10 × 3/10 = N",
//                                    "7/10 ÷ 3/10 = N"
//                                ),
//                                correctAnswer = 0
//                            ),
//                            Question.VideoQuestion.SubQuestion(
//                                id = 5,
//                                text = "What is the solution and answer?",
//                                options = listOf(
//                                    "2/10 or 1/5",
//                                    "3/10",
//                                    "4/10 or 2/5",
//                                    "5/10 or 1/2"
//                                ),
//                                correctAnswer = 2
//                            )
//                        )
//                    ),
//
//                    Question.VideoQuestion(
//                        id = 6,
//                        videoUrl = "problem_video_6",
//                        videoTitle = "Problem 6: Mixed Fraction Subtraction",
//                        problem = "Watch the video carefully and answer the following questions:",
//                        subQuestions = listOf(
//                            Question.VideoQuestion.SubQuestion(
//                                id = 1,
//                                text = "What is asked in the problem?",
//                                options = listOf(
//                                    "The amount spent",
//                                    "The amount saved",
//                                    "The amount remaining",
//                                    "The total amount"
//                                ),
//                                correctAnswer = 2
//                            ),
//                            Question.VideoQuestion.SubQuestion(
//                                id = 2,
//                                text = "What are the given facts?",
//                                options = listOf(
//                                    "Two mixed numbers",
//                                    "Two proper fractions",
//                                    "Three mixed numbers",
//                                    "One whole and one mixed number"
//                                ),
//                                correctAnswer = 0
//                            ),
//                            Question.VideoQuestion.SubQuestion(
//                                id = 3,
//                                text = "What operation will be used?",
//                                options = listOf(
//                                    "Subtraction",
//                                    "Multiplication",
//                                    "Addition",
//                                    "Division"
//                                ),
//                                correctAnswer = 0
//                            ),
//                            Question.VideoQuestion.SubQuestion(
//                                id = 4,
//                                text = "What is the number sentence?",
//                                options = listOf(
//                                    "4 5/6 - 2 3/6 = N",
//                                    "4 5/6 + 2 3/6 = N",
//                                    "4 5/6 × 2 3/6 = N",
//                                    "4 5/6 ÷ 2 3/6 = N"
//                                ),
//                                correctAnswer = 0
//                            ),
//                            Question.VideoQuestion.SubQuestion(
//                                id = 5,
//                                text = "What is the solution and answer?",
//                                options = listOf(
//                                    "2 1/6",
//                                    "2 2/6 or 2 1/3",
//                                    "2 3/6 or 2 1/2",
//                                    "2 4/6 or 2 2/3"
//                                ),
//                                correctAnswer = 1
//                            )
//                        )
//                    ),
//
//                    Question.VideoQuestion(
//                        id = 7,
//                        videoUrl = "problem_video_7",
//                        videoTitle = "Problem 7: Adding Three Fractions",
//                        problem = "Watch the video carefully and answer the following questions:",
//                        subQuestions = listOf(
//                            Question.VideoQuestion.SubQuestion(
//                                id = 1,
//                                text = "What is asked in the problem?",
//                                options = listOf(
//                                    "The total amount used",
//                                    "The remaining amount",
//                                    "The average amount",
//                                    "The largest amount"
//                                ),
//                                correctAnswer = 0
//                            ),
//                            Question.VideoQuestion.SubQuestion(
//                                id = 2,
//                                text = "What are the given facts?",
//                                options = listOf(
//                                    "Two similar fractions",
//                                    "Three similar fractions",
//                                    "Three dissimilar fractions",
//                                    "Two mixed numbers"
//                                ),
//                                correctAnswer = 1
//                            ),
//                            Question.VideoQuestion.SubQuestion(
//                                id = 3,
//                                text = "What operation will be used?",
//                                options = listOf(
//                                    "Subtraction",
//                                    "Multiplication",
//                                    "Addition",
//                                    "Division"
//                                ),
//                                correctAnswer = 2
//                            ),
//                            Question.VideoQuestion.SubQuestion(
//                                id = 4,
//                                text = "What is the number sentence?",
//                                options = listOf(
//                                    "1/12 + 3/12 - 5/12 = N",
//                                    "1/12 + 3/12 + 5/12 = N",
//                                    "1/12 × 3/12 × 5/12 = N",
//                                    "1/12 + 3/12 ÷ 5/12 = N"
//                                ),
//                                correctAnswer = 1
//                            ),
//                            Question.VideoQuestion.SubQuestion(
//                                id = 5,
//                                text = "What is the solution and answer?",
//                                options = listOf(
//                                    "8/12 or 2/3",
//                                    "9/12 or 3/4",
//                                    "10/12 or 5/6",
//                                    "7/12"
//                                ),
//                                correctAnswer = 1
//                            )
//                        )
//                    )
//                )
//            )
//        )
//    }

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
        )
    }
}