package com.bitrealm.mathwizdomapp.data

import com.bitrealm.mathwizdomapp.models.InteractiveLesson
import com.bitrealm.mathwizdomapp.models.Slide

object InteractiveLessonProvider {

    fun getLesson(quarter: Int, lesson: Int, subtopic: Int): InteractiveLesson? {
        return when ("${quarter}_${lesson}_$subtopic") {
            "1_1_1" -> getQuarter1Lesson1Subtopic1()
            "1_1_2" -> getQuarter1Lesson1Subtopic2()
            "1_1_3" -> getQuarter1Lesson1Subtopic3()
            "1_2_1" -> getQuarter1Lesson2Subtopic1()
            else -> null
        }
    }

    // LESSON 1 - SUBTOPIC 1: Similar and Dissimilar Fractions
    private fun getQuarter1Lesson1Subtopic1(): InteractiveLesson {
        return InteractiveLesson(
            id = 1,
            title = "Similar and Dissimilar Fractions",
            slides = listOf(
                Slide.IntroSlide(
                    id = 1,
                    title = "Welcome!",
                    content = "In this lesson, you will learn about Similar and Dissimilar Fractions.\n\nYou'll understand how to identify them by looking at their denominators."
                ),

                Slide.ConceptSlide(
                    id = 2,
                    title = "What are Similar Fractions?",
                    content = "Similar fractions are fractions that have the SAME DENOMINATOR (bottom number).",
                    keyPoints = listOf(
                        "Look at the bottom numbers",
                        "If they are the same = SIMILAR",
                        "Example: 2/5 and 3/5"
                    )
                ),

                Slide.ExampleSlide(
                    id = 3,
                    title = "Example 1: Similar",
                    problem = "Are 2/5 and 3/5 similar or dissimilar?",
                    steps = listOf(
                        "Step 1: Look at the denominators",
                        "First fraction: 2/5 → denominator is 5",
                        "Second fraction: 3/5 → denominator is 5",
                        "Step 2: Compare them",
                        "5 = 5 (They are the same!)"
                    ),
                    answer = "SIMILAR - Both have denominator 5"
                ),

                Slide.ConceptSlide(
                    id = 4,
                    title = "What are Dissimilar Fractions?",
                    content = "Dissimilar fractions are fractions that have DIFFERENT DENOMINATORS.",
                    keyPoints = listOf(
                        "Look at the bottom numbers",
                        "If they are different = DISSIMILAR",
                        "Example: 1/4 and 2/3"
                    )
                ),

                Slide.ExampleSlide(
                    id = 5,
                    title = "Example 2: Dissimilar",
                    problem = "Are 1/4 and 2/3 similar or dissimilar?",
                    steps = listOf(
                        "Step 1: Look at the denominators",
                        "First fraction: 1/4 → denominator is 4",
                        "Second fraction: 2/3 → denominator is 3",
                        "Step 2: Compare them",
                        "4 ≠ 3 (They are different!)"
                    ),
                    answer = "DISSIMILAR - Different denominators (4 and 3)"
                ),

                Slide.PracticeSlide(
                    id = 6,
                    question = "Are 3/8 and 5/8 similar or dissimilar?",
                    options = listOf("Similar", "Dissimilar"),
                    correctAnswer = 0,
                    explanation = "Correct! Both fractions have denominator 8, so they are SIMILAR."
                ),

                Slide.PracticeSlide(
                    id = 7,
                    question = "Are 2/7 and 3/9 similar or dissimilar?",
                    options = listOf("Similar", "Dissimilar"),
                    correctAnswer = 1,
                    explanation = "Correct! The denominators are 7 and 9 (different), so they are DISSIMILAR."
                ),

                Slide.SummarySlide(
                    id = 8,
                    title = "Summary",
                    keyPoints = listOf(
                        "SIMILAR fractions = SAME denominator",
                        "DISSIMILAR fractions = DIFFERENT denominators",
                        "Always look at the BOTTOM number",
                        "Example Similar: 2/5 and 3/5",
                        "Example Dissimilar: 1/4 and 2/3"
                    )
                )
            )
        )
    }

    // LESSON 1 - SUBTOPIC 2: Adding Simple and Mixed Fractions
    private fun getQuarter1Lesson1Subtopic2(): InteractiveLesson {
        return InteractiveLesson(
            id = 2,
            title = "Add Simple and Mixed Fractions",
            slides = listOf(
                Slide.IntroSlide(
                    id = 1,
                    title = "Adding Fractions",
                    content = "Learn how to add fractions with the same denominator (similar fractions)."
                ),

                Slide.ConceptSlide(
                    id = 2,
                    title = "Rule for Adding Similar Fractions",
                    content = "When fractions have the SAME denominator:\n\n1. Add the numerators (top numbers)\n2. Keep the denominator the same",
                    keyPoints = listOf(
                        "Same denominator = Just add tops",
                        "Keep bottom number same",
                        "Formula: a/c + b/c = (a+b)/c"
                    )
                ),

                Slide.ExampleSlide(
                    id = 3,
                    title = "Example: Adding Similar Fractions",
                    problem = "Add: 2/5 + 1/5 = ?",
                    steps = listOf(
                        "Step 1: Check denominators (5 and 5 - same!)",
                        "Step 2: Add numerators: 2 + 1 = 3",
                        "Step 3: Keep denominator: 5",
                        "Step 4: Write answer: 3/5"
                    ),
                    answer = "3/5"
                ),

                Slide.PracticeSlide(
                    id = 4,
                    question = "What is 3/8 + 2/8?",
                    options = listOf("5/8", "5/16", "6/8", "3/8"),
                    correctAnswer = 0,
                    explanation = "Correct! Add numerators: 3 + 2 = 5. Keep denominator: 8. Answer: 5/8"
                ),

                Slide.ConceptSlide(
                    id = 5,
                    title = "Adding Mixed Numbers",
                    content = "Mixed numbers have a whole number and a fraction.\n\nExample: 2 1/4\n\nTo add mixed numbers:\n1. Add whole numbers\n2. Add fractions\n3. Combine results",
                    keyPoints = listOf(
                        "Add whole numbers separately",
                        "Add fractions separately",
                        "Combine at the end"
                    )
                ),

                Slide.ExampleSlide(
                    id = 6,
                    title = "Example: Adding Mixed Numbers",
                    problem = "Add: 2 1/4 + 1 2/4 = ?",
                    steps = listOf(
                        "Step 1: Add whole numbers: 2 + 1 = 3",
                        "Step 2: Add fractions: 1/4 + 2/4 = 3/4",
                        "Step 3: Combine: 3 + 3/4",
                        "Answer: 3 3/4"
                    ),
                    answer = "3 3/4"
                ),

                Slide.PracticeSlide(
                    id = 7,
                    question = "What is 1 2/5 + 2 1/5?",
                    options = listOf("3 3/5", "3 2/5", "4 3/5", "3 1/5"),
                    correctAnswer = 0,
                    explanation = "Correct! Whole: 1+2=3. Fractions: 2/5+1/5=3/5. Answer: 3 3/5"
                ),

                Slide.SummarySlide(
                    id = 8,
                    title = "Key Points",
                    keyPoints = listOf(
                        "Similar fractions: Add tops, keep bottom",
                        "Mixed numbers: Add wholes + Add fractions",
                        "Always keep denominator same",
                        "Simplify if possible"
                    )
                )
            )
        )
    }

    // LESSON 1 - SUBTOPIC 3: Subtracting Simple and Mixed Fractions
    private fun getQuarter1Lesson1Subtopic3(): InteractiveLesson {
        return InteractiveLesson(
            id = 3,
            title = "Subtract Simple and Mixed Fractions",
            slides = listOf(
                Slide.IntroSlide(
                    id = 1,
                    title = "Subtracting Fractions",
                    content = "Learn how to subtract fractions with the same denominator."
                ),

                Slide.ConceptSlide(
                    id = 2,
                    title = "Rule for Subtracting Similar Fractions",
                    content = "When fractions have the SAME denominator:\n\n1. Subtract the numerators\n2. Keep the denominator the same",
                    keyPoints = listOf(
                        "Same denominator = Subtract tops",
                        "Keep bottom number same",
                        "Formula: a/c - b/c = (a-b)/c"
                    )
                ),

                Slide.ExampleSlide(
                    id = 3,
                    title = "Example: Subtracting Similar Fractions",
                    problem = "Subtract: 5/8 - 2/8 = ?",
                    steps = listOf(
                        "Step 1: Check denominators (8 and 8 - same!)",
                        "Step 2: Subtract numerators: 5 - 2 = 3",
                        "Step 3: Keep denominator: 8",
                        "Answer: 3/8"
                    ),
                    answer = "3/8"
                ),

                Slide.PracticeSlide(
                    id = 4,
                    question = "What is 7/10 - 3/10?",
                    options = listOf("4/10", "4/20", "10/10", "3/10"),
                    correctAnswer = 0,
                    explanation = "Correct! Subtract numerators: 7 - 3 = 4. Keep denominator: 10. Answer: 4/10 (or 2/5 simplified)"
                ),

                Slide.SummarySlide(
                    id = 5,
                    title = "Remember",
                    keyPoints = listOf(
                        "Similar fractions: Subtract tops, keep bottom",
                        "Same rule as addition, but subtract instead",
                        "Always check if you can simplify"
                    )
                )
            )
        )
    }

    // LESSON 2 - SUBTOPIC 1: Routine and Non-Routine Problems
    private fun getQuarter1Lesson2Subtopic1(): InteractiveLesson {
        return InteractiveLesson(
            id = 4,
            title = "Routine and Non-Routine Problems",
            slides = listOf(
                Slide.IntroSlide(
                    id = 1,
                    title = "Problem Solving",
                    content = "Learn how to solve routine and non-routine problems involving fractions."
                ),

                Slide.ConceptSlide(
                    id = 2,
                    title = "What are Routine Problems?",
                    content = "Routine problems are straightforward word problems that follow a clear pattern.",
                    keyPoints = listOf(
                        "Direct application of formulas",
                        "Clear what operation to use",
                        "Standard format"
                    )
                ),

                Slide.ExampleSlide(
                    id = 3,
                    title = "Example: Routine Problem",
                    problem = "Maria ate 2/8 of a pizza. Her brother ate 3/8 of the same pizza. How much pizza did they eat in total?",
                    steps = listOf(
                        "Step 1: Identify the operation (add)",
                        "Step 2: Write the equation: 2/8 + 3/8",
                        "Step 3: Add numerators: 2 + 3 = 5",
                        "Step 4: Keep denominator: 8"
                    ),
                    answer = "5/8 of the pizza"
                ),

                Slide.ConceptSlide(
                    id = 4,
                    title = "What are Non-Routine Problems?",
                    content = "Non-routine problems require more thinking and strategy. They don't follow a simple pattern.",
                    keyPoints = listOf(
                        "Requires analysis and planning",
                        "May need multiple steps",
                        "Creative problem solving"
                    )
                ),

                Slide.ExampleSlide(
                    id = 5,
                    title = "Example: Non-Routine Problem",
                    problem = "A tank is 3/4 full of water. After using some water, it becomes 1/4 full. What fraction of the tank's water was used?",
                    steps = listOf(
                        "Step 1: Understand the problem",
                        "Started: 3/4 full, Ended: 1/4 full",
                        "Step 2: Find what was used (subtract)",
                        "3/4 - 1/4 = 2/4",
                        "Step 3: Simplify: 2/4 = 1/2"
                    ),
                    answer = "1/2 (or 2/4) of the water was used"
                ),

                Slide.SummarySlide(
                    id = 6,
                    title = "Problem Solving Tips",
                    keyPoints = listOf(
                        "Read carefully",
                        "Identify what's given and what's asked",
                        "Choose the right operation",
                        "Solve step by step",
                        "Check if your answer makes sense"
                    )
                )
            )
        )
    }
}