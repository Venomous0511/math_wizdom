package com.bitrealm.mathwizdomapp.data

import com.bitrealm.mathwizdomapp.models.InteractiveLesson
import com.bitrealm.mathwizdomapp.models.Slide
import com.bitrealm.mathwizdomapp.R

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
                    content = "In this lesson, you will learn about Similar and Dissimilar Fractions.\n\nYou'll understand how to identify them by looking at their DENOMINATORS."
                ),

                Slide.ConceptSlide(
                    id = 2,
                    title = "What is a Fraction?",
                    content = "Fractions play a big role in our daily lives. \n\nEverything we do is part of our tasks or goals for the day. \n\nWithout realizing it, you add up the parts of your day to see what you’ve completed.",
                    keyPoints = emptyList(),
                    imageResourceId = R.drawable.fraction_pieces
                ),

                Slide.ConceptSlide(
                    id = 3,
                    title = "What are Similar Fractions?",
                    content = "Fractions are similar if they have the same bottom number (denominator).",
                    keyPoints = listOf(
                        "Look at their bottom numbers (Denominator)",
                        "If they the are same = SIMILAR",
                        "Example : ⅖ and ⅗"
                    )
                ),

                Slide.ExampleSlide(
                    id = 4,
                    title = "Example 1: Similar",
                    problem = "Are ⅖ and ⅗ similar or dissimilar?",
                    steps = listOf(
                        "Step 1: Look at the denominators",
                        "First fraction: ⅖ → denominator is 5",
                        "Second fraction: ⅗ → denominator is 5",
                        "Step 2: Compare them",
                        "5 = 5 (They are the same!)"
                    ),
                    answer = "SIMILAR - Both have denominator 5"
                ),

                Slide.ConceptSlide(
                    id = 5,
                    title = "What are Dissimilar Fractions?",
                    content = "Fractions are dissimilar if they have the different bottom number (denominator).",
                    keyPoints = listOf(
                        "Look at their bottom numbers (Denominator)",
                        "If they the are different = DISSIMILAR",
                        "Example : ½ and ⅔"
                    )
                ),

                Slide.ExampleSlide(
                    id = 6,
                    title = "Example 2: Dissimilar",
                    problem = "Are ¼ and ⅔ similar or dissimilar?",
                    steps = listOf(
                        "Step 1: Look at the denominators",
                        "First fraction: ¼ → denominator is 4",
                        "Second fraction: ⅔ → denominator is 3",
                        "Step 2: Compare them",
                        "4 ≠ 3 (They are different!)"
                    ),
                    answer = "DISSIMILAR - Different denominators (4 and 3)"
                ),

                Slide.PracticeSlide(
                    id = 7,
                    question = "Are ⅜ and ⅛ similar or dissimilar?",
                    options = listOf("Similar", "Dissimilar"),
                    correctAnswer = 0,
                    explanation = "Correct! Both fractions have denominator 8, so they are SIMILAR."
                ),

                Slide.PracticeSlide(
                    id = 8,
                    question = "Are ¼  and ½  similar or dissimilar?",
                    options = listOf("Similar", "Dissimilar"),
                    correctAnswer = 1,
                    explanation = "Correct! The denominators are 4 and 2 (different), so they are DISSIMILAR."
                ),

                Slide.SummarySlide(
                    id = 9,
                    title = "Summary",
                    keyPoints = listOf(
                        "Fractions play a big role in our daily lives.",
                        "Similar Fractions have the same denominator, like ⅔ and ⅓.",
                        "Dissimilar Fractions have different denominators, like ¼ and ½.",
                    )
                )
            )
        )
    }

    // LESSON 1 - SUBTOPIC 2: Adding Simple and Mixed Fractions
    private fun getQuarter1Lesson1Subtopic2(): InteractiveLesson {
        return InteractiveLesson(
            id = 2,
            title = " Add Simple and Mixed Fractions with Regrouping or without Regrouping.",
            slides = listOf(
                Slide.IntroSlide(
                    id = 1,
                    title = "Hi there!!",
                    content = "In this topic, you will learn how to add fractions."
                ),

                Slide.ConceptSlide(
                    id = 2,
                    title = "ADD SIMPLE FRACTIONS",
                    content = "When you add simple fractions that are similar, just add the top numbers (numerators) and keep the same bottom number (denominator). Then simplify the fractions after that.",
                    keyPoints = listOf(
                        "Same Denominator = Just add their Numerator",
                        "Keep the Denominator.",
                        "Formula: a/c + b/c = (a+b)/c"
                    )
                ),

                Slide.ExampleSlide(
                    id = 3,
                    title = "Example: Adding Similar Fractions",
                    problem = "Add: ⅖ + ⅕ = ?",
                    steps = listOf(
                        "Step 1: Check their Denominators (5 and 5, they are the same!)",
                        "Step 2: Add numerators: 2+1 = 3",
                        "Step 3: Keep the denominator.",
                        "Step 4: Write the answer with the numerator and denominator based on your computation."
                    ),
                    answer = "⅗"
                ),

                Slide.PracticeSlide(
                    id = 4,
                    question = "What is ⅜ + ²⁄₈?",
                    options = listOf("⅝", "⅛", "¼", "½"),
                    correctAnswer = 0,
                    explanation = "Correct! Add numerators: 3 + 2 = 5. Keep denominator: 8. Answer: 5/8"
                ),

                Slide.ConceptSlide(
                    id = 5,
                    title = "ADD DISSIMILAR FRACTIONS",
                    content = "To add dissimilar fractions, first change them into similar fractions by finding equivalent fractions.",
                    keyPoints = listOf(
                        "Find their Least Common Denominator (LCD)",
                    )
                ),

                Slide.ExampleSlide(
                    id = 6,
                    title = "Example: Adding Dissimilar Fractions",
                    problem = "Add: ⅓ + ⅙ = ?",
                    steps = listOf(
                        "Step 1: Find their LCD, it’s 6",
                        "Step 2: Change their equivalent fractions.\n" +
                                "6 ÷ 3 = 2 → multiply both 1 and 3 by 2 → ⅓ = 2/6\n" +
                                "6 ÷ 6 = 1 → multiply both 1 and 6 by 1 → ⅙ = 1/6\n",
                        "Step 3: ²⁄₆ and ⅙ are now SIMILAR",
                        "Step 4: Now solve it, as how we solve the similar fraction earlier.",
                    ),
                    answer = "³⁄₆"
                ),

                Slide.ConceptSlide(
                    id = 7,
                    title = "If any chance the result is an improper fraction, change it into a mixed numbers.",
                    content = "Example: ³⁴⁄₂₁ → 1 ¹³⁄₂₁",
                    keyPoints = listOf(
                        "Why?",
                        "How many 21 does 34 have? 1",
                        "34 - 21 = 13",
                        "So, the mixed number of 34/21 is 1 13/21.",
                    ),
                ),

                Slide.ConceptSlide(
                    id = 8,
                    title = "ADD MIXED FRACTIONS",
                    content = "If you know how to add similar and dissimilar fractions, you can easily add mixed numbers too. Just add the whole numbers together and then add the fraction parts.",
                    keyPoints = listOf(
                        "Add their whole numbers.",
                        "Add their fractions.",
                        "Write your answer by combining the answer of whole numbers and fractions.",
                    ),
                ),

                Slide.ExampleSlide(
                    id = 9,
                    title = "Example: Adding Mixed Fractions",
                    problem = "Add: 3 ⅖ + 1 ⅕ = ?",
                    steps = listOf(
                        "Step 1: Add the whole numbers. \n3 + 1 = 4",
                        "Step 2: Add the fractions.\n ⅖ + ⅕ = ⅗",
                        "Step 3: Combine the whole number and the fractions.\n 4 + ⅗ = 4 ⅗",
                        "Step 4: The answer is 4 ⅗",
                    ),
                    answer = "4 ⅗"
                ),

                Slide.PracticeSlide(
                    id = 10,
                    question = "What is 5 ⅖ + 2 ⅕ ?",
                    options = listOf("⅗", "3 ⅗", "7 ⅗", "9"),
                    correctAnswer = 2,
                    explanation = "Correct answer is 7 ⅗"
                ),

                Slide.SummarySlide(
                    id = 11,
                    title = "Summary:",
                    keyPoints = listOf(
                        "Adding Similar Fractions – \nSame denominator: add the numerators, keep the denominator.",
                        "Adding Dissimilar Fractions – \nDifferent denominators: find the LCD, convert to equivalent fractions, then add.",
                        "Mixed Fractions – \nAdd whole numbers first, then add fractions. \nConvert improper fractions to mixed numbers if needed.",
                        "Key Tip: Always simplify the answer and check denominators!",
                    )
                )
            )
        )
    }

    // LESSON 1 - SUBTOPIC 3: Subtracting Simple and Mixed Fractions
    private fun getQuarter1Lesson1Subtopic3(): InteractiveLesson {
        return InteractiveLesson(
            id = 3,
            title = "Subtract Simple and Mixed Fractions with Regrouping or without Regrouping",
            slides = listOf(
                Slide.IntroSlide(
                    id = 1,
                    title = "Hellooo!!",
                    content = "In this topic, you will learn how to subtract fractions."
                ),

                Slide.ConceptSlide(
                    id = 2,
                    title = "SUBTRACT SIMPLE FRACTIONS",
                    content = "When you subtract simple fractions that are similar, just subtract the top numbers (numerators) and keep the same bottom number (denominator). Then simplify the fractions after that.",
                    keyPoints = listOf(
                        "Same Denominator= Just subtract their Numerator",
                        "Keep the Denominator.",
                        "Formula: a/c - b/c = (a-b)/c"
                    )
                ),

                Slide.ExampleSlide(
                    id = 3,
                    title = "Example: Subtracting Similar Fractions",
                    problem = "Add: ⅖ - ⅕ = ?",
                    steps = listOf(
                        "Step 1: Check their Denominators (5 and 5, they are the same!)",
                        "Step 2: Subtract numerators: 2-1 = 1",
                        "Step 3: Keep the denominator",
                        "Step 4: Write the answer with the numerator and denominator based on your computation."
                    ),
                    answer = "⅕"
                ),

                Slide.PracticeSlide(
                    id = 4,
                    question = "What is ⅜ - ²⁄₈?",
                    options = listOf("⅛", "½", "¼", "⅓"),
                    correctAnswer = 0,
                    explanation = "Correct answer is ⅛",
                ),

                Slide.ConceptSlide(
                    id = 5,
                    title = "SUBTRACT DISSIMILAR FRACTIONS",
                    content = "To subtract dissimilar fractions, first change them into similar fractions by finding equivalent fractions.",
                    keyPoints = listOf(
                        "Find their Least Common Denominator (LCD)",
                    )
                ),

                Slide.ExampleSlide(
                    id = 6,
                    title = "Example: Subtracting Dissimilar Fractions",
                    problem = "Subtract: ¾ + ⅖ = ?",
                    steps = listOf(
                        "Step 1: Find their LCD, it’s 20",
                        "Step 2: Change their equivalent fractions \n20 ÷ 4 = 5 → multiply both 3 and 4 by 5 → ¾ = ¹⁵⁄₂₀ \n20 ÷ 5 = 4 → multiply both 2 and 5 by 4 → ⅖ = ⁸⁄₂₀",
                        "Step 3: ¹⁵⁄₂₀ and ⁸⁄₂₀ are now SIMILAR",
                        "Step 4: Now solve it, as how we solve the similar fraction earlier."
                    ),
                    answer = "²³⁄₂₀"
                ),

                Slide.ConceptSlide(
                    id = 7,
                    title = "If any chance the result is an improper fraction, change it into a mixed numbers.",
                    content = "Example: ³⁴⁄₂₁ → 1 ¹³⁄₂₁",
                    keyPoints = listOf(
                        "Why?",
                        "How many 21 does 34 have? 1",
                        "34 - 21 = 13",
                        "So, the mixed number of ³⁴⁄₂₁ is 1 ¹³⁄₂₁",
                    )
                ),

                Slide.ConceptSlide(
                    id = 8,
                    title = "SUBTRACT MIXED FRACTIONS",
                    content = "If you know how to subtract similar and dissimilar fractions, you can easily subtract mixed numbers too. Just subtract the whole numbers together and then subtract the fraction parts.",
                    keyPoints = listOf(
                        "Subtract their whole numbers.",
                        "Subtract their fractions.",
                        "Write your answer by combining the answer of the subtraction of whole numbers and fractions.",
                    )
                ),

                Slide.ExampleSlide(
                    id = 9,
                    title = "Example: Subtracting Mixed Fractions",
                    problem = "Subtract: 3 ⅖ - 1 ⅕ = ?",
                    steps = listOf(
                        "Step 1: Subtract the whole numbers. \n3 - 1 = 2",
                        "Step 2: Add the fractions. \n⅖ - ⅕ = ⅕",
                        "Step 3: Combine the whole number and the fractions. \n2 + ⅕  = 2 ⅕",
                        "Step 4: The answer is 2 ⅕"
                    ),
                    answer = "2 ⅕"
                ),

                Slide.PracticeSlide(
                    id = 10,
                    question = "What is 5 ⅖ - 2 ⅕ ?",
                    options = listOf("3 ⅕", "3 ⅗", "7 ⅗", "7"),
                    correctAnswer = 0,
                    explanation = "Correct answer is 3 ⅕",
                ),

                Slide.ConceptSlide(
                    id = 11,
                    title = "Example: 5 ⅑ - 3 ⁴⁄₉ X",
                    content = "Sometimes, you can’t subtract the fraction parts because the minuend is smaller than the subtrahend. When this happens, you can use regrouping. Regrouping means you borrow one from the whole number to make the minuend fraction larger than the subtrahend fraction.",
                    keyPoints = emptyList(),
                ),

                Slide.ExampleSlide(
                    id = 12,
                    title = "Example: 5 ⅑ - 3 ⁴⁄₉ = ?",
                    problem = "5 ⅑ - 3 ⁴⁄₉ = ?",
                    steps = listOf(
                        "Step 1: Check the fraction parts. Since ⅑ (minuend) is smaller than ⁴⁄₉ (subtrahend). You need to borrow from the whole number.",
                        "Step 2: Borrow 1 from 5, 5 becomes 4",
                        "Step 3: Convert the borrowed 1 to a fraction with the same denominator as the minuend: 1 = ⁹⁄₉",
                        "Step 4: Then add ⁹⁄₉ to ⅑ = ¹⁰⁄₉",
                        "Step 5: Subtract 5 ¹⁰⁄₉ and 3 ⁴⁄₉ = 2 ⁶⁄₉ or 2 ⅔"
                    ),
                    answer = "2 ⁶⁄₉ or 2 ⅔"
                ),

                Slide.SummarySlide(
                    id = 13,
                    title = "Remember",
                    keyPoints = listOf(
                        "Similar Fractions: Subtract numerators, keep denominator.",
                        "Dissimilar Fractions: Find LCD, convert, then subtract.",
                        "Improper Fractions: Convert to mixed numbers if numerator > denominator.",
                        "Mixed Numbers: Subtract whole numbers and fractions, then Combine.",
                        "Regrouping: Borrow 1 from the whole if fraction part is smaller; \nadjust fractions and subtract.",
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