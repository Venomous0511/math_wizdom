package com.bitrealm.mathwizdomapp.data

import com.bitrealm.mathwizdomapp.models.InteractiveLesson
import com.bitrealm.mathwizdomapp.models.Slide
import com.bitrealm.mathwizdomapp.R

object InteractiveLessonProvider {

    fun getLesson(quarter: Int, lesson: Int, subtopic: Int): InteractiveLesson? {
        return when ("${quarter}_${lesson}_$subtopic") {
            // ============== Quarter 1 ==============
            "1_1_1" -> getQuarter1Lesson1Subtopic1()
            "1_1_2" -> getQuarter1Lesson1Subtopic2()
            "1_1_3" -> getQuarter1Lesson1Subtopic3()
            "1_2_1" -> getQuarter1Lesson2Subtopic1()
            "1_3_1" -> getQuarter1Lesson3Subtopic1()
            "1_3_2" -> getQuarter1Lesson3Subtopic2()
            "1_3_3" -> getQuarter1Lesson3Subtopic3()
            "1_4_1" -> getQuarter1Lesson4Subtopic1()
            "1_4_2" -> getQuarter1Lesson4Subtopic2()
            "1_5_1" -> getQuarter1Lesson5Subtopic1()
            "1_5_2" -> getQuarter1Lesson5Subtopic2()
            "1_6_1" -> getQuarter1Lesson6Subtopic1()
            "1_6_2" -> getQuarter1Lesson6Subtopic2()
            "1_7_1" -> getQuarter1Lesson7Subtopic1()
            "1_7_2" -> getQuarter1Lesson7Subtopic2()
            "1_8_1" -> getQuarter1Lesson8Subtopic1()
            "1_9_1" -> getQuarter1Lesson9Subtopic1()
            "1_10_1" -> getQuarter1Lesson10Subtopic1()
            "1_11_1" -> getQuarter1Lesson11Subtopic1()
            "1_12_1" -> getQuarter1Lesson12Subtopic1()
            "1_13_1" -> getQuarter1Lesson13Subtopic1()
            "1_14_1" -> getQuarter1Lesson14Subtopic1()
            "1_15_1" -> getQuarter1Lesson15Subtopic1()
            "1_15_2" -> getQuarter1Lesson15Subtopic2()
            "1_16_1" -> getQuarter1Lesson16Subtopic1()
            "1_16_2" -> getQuarter1Lesson16Subtopic2()
            "1_17_1" -> getQuarter1Lesson17Subtopic1()
            "1_17_2" -> getQuarter1Lesson17Subtopic2()
            "1_17_3" -> getQuarter1Lesson17Subtopic3()

            // ============== Quarter 2 ==============
            "2_1_1" -> getQuarter2Lesson1Subtopic1()
            "2_2_1" -> getQuarter2Lesson2Subtopic1()
            "2_2_2" -> getQuarter2Lesson2Subtopic2()
            "2_3_1" -> getQuarter2Lesson3Subtopic1()
            "2_3_2" -> getQuarter2Lesson3Subtopic2()
            "2_3_3" -> getQuarter2Lesson3Subtopic3()
            "2_4_1" -> getQuarter2Lesson4Subtopic1()
            "2_4_2" -> getQuarter2Lesson4Subtopic2()
            "2_4_3" -> getQuarter2Lesson4Subtopic3()
            "2_4_4" -> getQuarter2Lesson4Subtopic4()
            "2_4_5" -> getQuarter2Lesson4Subtopic5()
            "2_5_1" -> getQuarter2Lesson5Subtopic1()
            "2_6_1" -> getQuarter2Lesson6Subtopic1()
            "2_7_1" -> getQuarter2Lesson7Subtopic1()
            "2_8_1" -> getQuarter2Lesson8Subtopic1()
            "2_9_1" -> getQuarter2Lesson9Subtopic1()
            "2_10_1" -> getQuarter2Lesson10Subtopic1()
            "2_11_1" -> getQuarter2Lesson11Subtopic1()

            // ============== QUARTER 3 ==============
            "3_1_1" -> getQuarter3Lesson1Subtopic1()
            "3_2_1" -> getQuarter3Lesson2Subtopic1()
            "3_3_1" -> getQuarter3Lesson3Subtopic1()
            "3_3_2" -> getQuarter3Lesson3Subtopic2()
            "3_3_3" -> getQuarter3Lesson3Subtopic3()
            "3_4_1" -> getQuarter3Lesson4Subtopic1()
            "3_4_2" -> getQuarter3Lesson4Subtopic2()
            "3_5_1" -> getQuarter3Lesson5Subtopic1()
            "3_5_2" -> getQuarter3Lesson5Subtopic2()
            "3_6_1" -> getQuarter3Lesson6Subtopic1()
            "3_7_1" -> getQuarter3Lesson7Subtopic1()
            "3_7_2" -> getQuarter3Lesson7Subtopic2()
            "3_8_1" -> getQuarter3Lesson8Subtopic1()

            // ============== QUARTER 4 ==============
            "4_1_1" -> getQuarter4Lesson1Subtopic1()
            "4_2_1" -> getQuarter4Lesson2Subtopic1()
            "4_3_1" -> getQuarter4Lesson3Subtopic1()
            "4_3_2" -> getQuarter4Lesson3Subtopic2()
            "4_3_3" -> getQuarter4Lesson3Subtopic3()
            "4_4_1" -> getQuarter4Lesson4Subtopic1()
            "4_5_1" -> getQuarter4Lesson5Subtopic1()
            "4_6_1" -> getQuarter4Lesson6Subtopic1()
            "4_7_1" -> getQuarter4Lesson7Subtopic1()
            "4_8_1" -> getQuarter4Lesson8Subtopic1()
            "4_9_1" -> getQuarter4Lesson9Subtopic1()
            else -> null
        }
    }

    // ============== QUARTER 1 ==============
    // LESSON 1 - SUBTOPIC 1: Similar and Dissimilar Fractions
    private fun getQuarter1Lesson1Subtopic1(): InteractiveLesson {
        return InteractiveLesson(
            id = 1,
            title = "Similar and Dissimilar Fractions",
            slides = listOf(
                Slide.IntroSlide(
                    id = 1,
                    title = "Welcome!",
                    content = "In this topic, you will learn about Similar and Dissimilar Fractions. You'll understand how to identify them by looking at their DENOMINATORS."
                ),

                Slide.ConceptSlide(
                    id = 2,
                    title = "What is a Fraction?",
                    content = "Fractions play a big role in our daily lives. Everything we do is part of our tasks or goals for the day. Without realizing it, you add up the parts of your day to see what you’ve completed.",
                    imageResourceId = R.drawable.fraction_pieces
                ),

                Slide.ConceptSlide(
                    id = 3,
                    title = "What are Similar Fractions?",
                    content = "Fractions are similar if they have the same bottom number (denominator).",
                    keyPoints = listOf(
                        "Look at their bottom numbers (Denominator)",
                        "If they are the same = SIMILAR",
                        "Example 1: ⅖ and ⅗",
                        "Example 2: ⅚ and ⅙",
                        "Example 3: ¾ and ¼"
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
                        "If they are different = DISSIMILAR",
                        "Example 1: ½ and ⅔",
                        "Example 2: ½ and ⅕",
                        "Example 3: ⅔ and ⅖"
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
                    title = "Example 1: Adding Similar Fractions",
                    problem = "Add: ⅖ + ⅕ = ?",
                    steps = listOf(
                        "Step 1: Check their Denominators (5 and 5, they are the same!)",
                        "Step 2: Add numerators: 2+1 = 3",
                        "Step 3: Keep the denominator.",
                        "Step 4: Write the answer with the numerator and denominator based on your computation."
                    ),
                    answer = "⅗"
                ),

                Slide.ExampleSlide(
                    id = 4,
                    title = "Example 2: Adding Similar Fractions",
                    problem = "Add: 3/7 + 2/7 = ?",
                    steps = listOf(
                        "Step 1: Check their denominators (7 and 7, they are the same!)",
                        "Step 2: Add the numerators: 3 + 2 = 5",
                        "Step 3: Keep the denominator",
                        "Step 4: Write the answer with the numerator and denominator based on your computation."
                    ),
                    answer = "⁵⁄₇"
                ),

                Slide.ExampleSlide(
                    id = 5,
                    title = "Example 3: Adding Similar Fractions",
                    problem = "Add: 4/9 + 3/9 = ?",
                    steps = listOf(
                        "Step 1: Check their denominators (9 and 9, they are the same!)",
                        "Step 2: Add the numerators: 4 + 3 = 7",
                        "Step 3: Keep the denominator",
                        "Step 4: Write the answer with the numerator and denominator based on your computation."
                    ),
                    answer = "⁷⁄₉"
                ),

                Slide.PracticeSlide(
                    id = 6,
                    question = "What is ⅜ + ²⁄₈?",
                    options = listOf("⅝", "⅛", "¼", "½"),
                    correctAnswer = 0,
                    explanation = "Correct! Add numerators: 3 + 2 = 5. Keep denominator: 8. Answer: 5/8"
                ),

                Slide.ConceptSlide(
                    id = 7,
                    title = "ADD DISSIMILAR FRACTIONS",
                    content = "To add dissimilar fractions, first change them into similar fractions by finding equivalent fractions.",
                    keyPoints = listOf(
                        "Find their Least Common Denominator (LCD)",
                    )
                ),

                Slide.ExampleSlide(
                    id = 8,
                    title = "Example 1: Adding Dissimilar Fractions",
                    problem = "Add: ⅓ + ⅙ = ?",
                    steps = listOf(
                        "Step 1: Find their LCD, it’s 6",
                        "Step 2: Change their equivalent fractions.\n 6 ÷ 3 = 2 → multiply both 1 and 3 by 2 → ⅓ = 2/6\n 6 ÷ 6 = 1 → multiply both 1 and 6 by 1 → ⅙ = 1/6",
                        "Step 3: ²⁄₆ and ⅙ are now SIMILAR",
                        "Step 4: Now solve it, as how we solve the similar fraction earlier.",
                    ),
                    answer = "³⁄₆"
                ),

                Slide.ExampleSlide(
                    id = 9,
                    title = "Example 2: Adding Dissimilar Fractions",
                    problem = "Add: ⅖ + 1/10 = ?",
                    steps = listOf(
                        "Step 1: Find their LCD, it's 10",
                        "Step 2: Change them into equivalent fractions \n 10 ÷ 5 = 2 → multiply both 2 and 5 by 2 → ⅖ = ⁴⁄₁₀ \n 10 ÷ 10 = 1 → multiply both 1 and 10 by 1 → 1/10 = ¹⁄₁₀",
                        "Step 3: ⁴⁄₁₀ and ¹⁄₁₀ are now SIMILAR",
                        "Step 4: Now solve it, as how we solve the similar fraction earlier."
                    ),
                    answer = "⁵⁄₁₀ or ½"
                ),

                Slide.ExampleSlide(
                    id = 10,
                    title = "Example 3: Adding Dissimilar Fractions",
                    problem = "Add: ¾ + ⅛ = ?",
                    steps = listOf(
                        "Step 1: Find their LCD, it's 8",
                        "Step 2: Change them into equivalent fractions \n 8 ÷ 4 = 2 → multiply both 3 and 4 by 2 → ¾ = ⁶⁄₈ \n 8 ÷ 8 = 1 → multiply both 1 and 8 by 1 → ⅛ = ⅛",
                        "Step 3: ⁶⁄₈ and ⅛ are now SIMILAR",
                        "Step 4: Now solve it, as how we solve the similar fraction earlier."
                    ),
                    answer = "⁷⁄₈"
                ),

                Slide.ConceptSlide(
                    id = 11,
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
                    id = 12,
                    title = "ADD MIXED FRACTIONS",
                    content = "If you know how to add similar and dissimilar fractions, you can easily add mixed numbers too. Just add the whole numbers together and then add the fraction parts.",
                    keyPoints = listOf(
                        "Add their whole numbers.",
                        "Add their fractions.",
                        "Write your answer by combining the answer of whole numbers and fractions.",
                    ),
                ),

                Slide.ExampleSlide(
                    id = 13,
                    title = "Example 1: Adding Mixed Fractions",
                    problem = "Add: 3 ⅖ + 1 ⅕ = ?",
                    steps = listOf(
                        "Step 1: Add the whole numbers. \n3 + 1 = 4",
                        "Step 2: Add the fractions.\n ⅖ + ⅕ = ⅗",
                        "Step 3: Combine the whole number and the fractions.\n 4 + ⅗ = 4 ⅗",
                        "Step 4: The answer is 4 ⅗",
                    ),
                    answer = "4 ⅗"
                ),

                Slide.ExampleSlide(
                    id = 14,
                    title = "Example 2: Adding Mixed Fractions",
                    problem = "Add: 2 ⅓ + 4 ⅓ = ?",
                    steps = listOf(
                        "Step 1: Add the whole numbers \n 2 + 4 = 6",
                        "Step 2: Add the fractions \n ⅓ + ⅓ = ⅔",
                        "Step 3: Combine the whole number and the fractions \n 6 + ⅔ = 6 ⅔",
                        "Step 4: The answer is 6 ⅔"
                    ),
                    answer = "6 ⅔"
                ),

                Slide.ExampleSlide(
                    id = 15,
                    title = "Example 3: Adding Mixed Fractions",
                    problem = "Add: 5 ¼ + 2 ¼ = ?",
                    steps = listOf(
                        "Step 1: Add the whole numbers \n 5 + 2 = 7",
                        "Step 2: Add the fractions \n ¼ + ¼ = ½",
                        "Step 3: Combine the whole number and the fractions \n 7 + ½ = 7 ½",
                        "Step 4: The answer is 7 ½"
                    ),
                    answer = "7 ½"
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
                        "Adding Similar Fractions – Same denominator: add the numerators, keep the denominator.",
                        "Adding Dissimilar Fractions – Different denominators: find the LCD, convert to equivalent fractions, then add.",
                        "Mixed Fractions – Add whole numbers first, then add fractions. \nConvert improper fractions to mixed numbers if needed.",
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
                    title = "Example 1: Subtracting Similar Fractions",
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
                    title = "Example 1: Subtracting Dissimilar Fractions",
                    problem = "Subtract: ¾ + ⅖ = ?",
                    steps = listOf(
                        "Step 1: Find their LCD, it’s 20",
                        "Step 2: Change their equivalent fractions \n20 ÷ 4 = 5 → multiply both 3 and 4 by 5 → ¾ = ¹⁵⁄₂₀ \n20 ÷ 5 = 4 → multiply both 2 and 5 by 4 → ⅖ = ⁸⁄₂₀",
                        "Step 3: ¹⁵⁄₂₀ and ⁸⁄₂₀ are now SIMILAR",
                        "Step 4: Now solve it, as how we solve the similar fraction earlier."
                    ),
                    answer = "²³⁄₂₀"
                ),

                Slide.ExampleSlide(
                    id = 7,
                    title = "Example 2: Subtracting Dissimilar Fractions",
                    problem = "Subtract: ⅚ − ¼ = ?",
                    steps = listOf(
                        "Step 1: Find their LCD, it's 12",
                        "Step 2: Change their equivalent fractions \n 12 ÷ 6 = 2 → multiply both 5 and 6 by 2 → ⅚ = ¹⁰⁄₁₂ \n 12 ÷ 4 = 3 → multiply both 1 and 4 by 3 → ¼ = ³⁄₁₂",
                        "Step 3: ¹⁰⁄₁₂ and ³⁄₁₂ are now SIMILAR",
                        "Step 4: Now solve it, as how we solve the similar fraction earlier."
                    ),
                    answer = "⁷⁄₁₂"
                ),

                Slide.ExampleSlide(
                    id = 8,
                    title = "Example 3: Subtracting Dissimilar Fractions",
                    problem = "Subtract: ⅞ − ⅓ = ?",
                    steps = listOf(
                        "Step 1: Find their LCD, it's 24",
                        "Step 2: Change their equivalent fractions \n 24 ÷ 8 = 3 → multiply both 7 and 8 by 3 → ⅞ = ²¹⁄₂₄ \n 24 ÷ 3 = 8 → multiply both 1 and 3 by 8 → ⅓ = ⁸⁄₂₄",
                        "Step 3: ²¹⁄₂₄ and ⁸⁄₂₄ are now SIMILAR",
                        "Step 4: Now solve it, as how we solve the similar fraction earlier."
                    ),
                    answer = "¹³⁄₂₄"
                ),

                Slide.ConceptSlide(
                    id = 9,
                    title = "If any chance the result is an improper fraction, change it into a mixed numbers.",
                    content = "Example: ³⁴⁄₂₁ → 1 ¹³⁄₂₁",
                    keyPoints = listOf(
                        "Why? \n How many 21 does 34 have? 1",
                        "34 - 21 = 13",
                        "So, the mixed number of ³⁴⁄₂₁ is 1 ¹³⁄₂₁",
                    )
                ),

                Slide.ConceptSlide(
                    id = 10,
                    title = "SUBTRACT MIXED FRACTIONS",
                    content = "If you know how to subtract similar and dissimilar fractions, you can easily subtract mixed numbers too. Just subtract the whole numbers together and then subtract the fraction parts.",
                    keyPoints = listOf(
                        "Subtract their whole numbers.",
                        "Subtract their fractions.",
                        "Write your answer by combining the answer of the subtraction of whole numbers and fractions.",
                    )
                ),

                Slide.ExampleSlide(
                    id = 11,
                    title = "Example 1: Subtracting Mixed Fractions",
                    problem = "Subtract: 3 ⅖ - 1 ⅕ = ?",
                    steps = listOf(
                        "Step 1: Subtract the whole numbers. \n3 - 1 = 2",
                        "Step 2: Add the fractions. \n⅖ - ⅕ = ⅕",
                        "Step 3: Combine the whole number and the fractions. \n2 + ⅕  = 2 ⅕",
                        "Step 4: The answer is 2 ⅕"
                    ),
                    answer = "2 ⅕"
                ),

                Slide.ExampleSlide(
                    id = 12,
                    title = "Example 2: Subtracting Mixed Fractions",
                    problem = "Subtract: 6 ¾ − 2 ¼ = ?",
                    steps = listOf(
                        "Step 1: Subtract the whole numbers \n 6 − 2 = 4",
                        "Step 2: Subtract the fractions \n ¾ − ¼ = ½",
                        "Step 3: Combine the whole number and the fractions \n 4 + ½ = 4 ½",
                        "Step 4: The answer is 4 ½"
                    ),
                    answer = "4 ½"
                ),

                Slide.ExampleSlide(
                    id = 13,
                    title = "Example 3: Subtracting Mixed Fractions",
                    problem = "Subtract: 5 ⅔ − 3 ⅓ = ?",
                    steps = listOf(
                        "Step 1: Subtract the whole numbers \n 5 − 3 = 2",
                        "Step 2: Subtract the fractions \n ⅔ − ⅓ = ⅓",
                        "Step 3: Combine the whole number and the fractions \n 2 + ⅓ = 2 ⅓",
                        "Step 4: The answer is 2 ⅓"
                    ),
                    answer = "2 ⅓"
                ),

                Slide.PracticeSlide(
                    id = 14,
                    question = "What is 5 ⅖ - 2 ⅕ ?",
                    options = listOf("3 ⅕", "3 ⅗", "7 ⅗", "7"),
                    correctAnswer = 0,
                    explanation = "Correct answer is 3 ⅕",
                ),

                Slide.ConceptSlide(
                    id = 15,
                    title = "Example: 5 ⅑ - 3 ⁴⁄₉ X",
                    content = "Sometimes, you can’t subtract the fraction parts because the minuend is smaller than the subtrahend. When this happens, you can use regrouping. Regrouping means you borrow one from the whole number to make the minuend fraction larger than the subtrahend fraction.",
                ),

                Slide.ExampleSlide(
                    id = 16,
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
                    id = 17,
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
                    title = "Welcome!",
                    content = "In this topic, you will learn how to solve routine and non-routine problems involving fractions."
                ),

                Slide.ConceptSlide(
                    id = 2,
                    title = "What are Routine Problems?",
                    content = "Routine problems can be solved easily using at least one math operation or a ratio. They follow a familiar pattern and have a clear solution path.",
                    keyPoints = listOf(
                        "Familiar methods",
                        "Clear process",
                        "Easy to solve",
                        "Direct application of formulas"
                    )
                ),

                Slide.ConceptSlide(
                    id = 3,
                    title = "Steps for Solving Routine Problems",
                    content = "Follow these four simple steps to solve any routine problem:",
                    keyPoints = listOf(
                        "Step 1: Understand the Problem",
                        "Step 2: Plan (choose the operation)",
                        "Step 3: Solve the Problem",
                        "Step 4: Check your answer"
                    )
                ),

                Slide.ExampleSlide(
                    id = 4,
                    title = "Example 1: Routine Problem",
                    problem = "Devin walks ⅔ of a km to a friend's house, ¼ km to a park, and ½ km home. What is the total distance that Devin covers?",
                    steps = listOf(
                        "Step 1: Understand \n Given: ⅔ km + ¼ km + ½ km \n Asked: Total distance?",
                        "Step 2: Plan \n Operation: Addition \n Number sentence: ⅔ + ¼ + ½ = N",
                        "Step 3: Solve \n Find LCD of 3, 4, and 2 = 12 \n ⅔ = ⁸⁄₁₂, ¼ = ³⁄₁₂, ½ = ⁶⁄₁₂ \n ⁸⁄₁₂ + ³⁄₁₂ + ⁶⁄₁₂ = ¹⁷⁄₁₂ = 1 ⁵⁄₁₂",
                        "Step 4: Check \n ⁸⁄₁₂ + ³⁄₁₂ = ¹¹⁄₁₂ \n ¹⁷⁄₁₂ − ¹¹⁄₁₂ = ⁶⁄₁₂ or ½ ✓"
                    ),
                    answer = "Devin covers a total distance of 1 ⁵⁄₁₂ km"
                ),

                Slide.ExampleSlide(
                    id = 5,
                    title = "Example 2: Routine Problem",
                    problem = "Ella biked ⅗ km to the grocery store, ⅔ km to her friend's house, and ¼ km back home. What is the total distance that Ella biked?",
                    steps = listOf(
                        "Step 1: Understand \n Given: ⅗ km, ⅔ km, ¼ km \n Asked: Total distance?",
                        "Step 2: Plan \n Operation: Addition \n Number sentence: ⅗ + ⅔ + ¼ = N",
                        "Step 3: Solve \n Find LCD of 5, 3, and 4 = 60 \n ⅗ = ³⁶⁄₆₀, ⅔ = ⁴⁰⁄₆₀, ¼ = ¹⁵⁄₆₀ \n ³⁶⁄₆₀ + ⁴⁰⁄₆₀ + ¹⁵⁄₆₀ = ⁹¹⁄₆₀ = 1 ³¹⁄₆₀",
                        "Step 4: Check \n ³⁶⁄₆₀ + ⁴⁰⁄₆₀ = ⁷⁶⁄₆₀ \n ⁹¹⁄₆₀ − ⁷⁶⁄₆₀ = ¹⁵⁄₆₀ = ¼ ✓"
                    ),
                    answer = "Ella biked a total distance of 1 ³¹⁄₆₀ km"
                ),

                Slide.PracticeSlide(
                    id = 6,
                    question = "Maria ate ⅜ of a pizza for lunch and ¼ of the same pizza for dinner. How much pizza did she eat in total?",
                    options = listOf("⅝", "⅞", "½", "¾"),
                    correctAnswer = 0,
                    explanation = "Correct! LCD is 8. ⅜ + ²⁄₈ = ⅝ of the pizza"
                ),

                Slide.ConceptSlide(
                    id = 7,
                    title = "What are Non-Routine Problems?",
                    content = "Non-routine problems require more thinking and strategy. They don't follow a simple pattern and may need creative solutions.",
                    keyPoints = listOf(
                        "Requires analysis and planning",
                        "May need multiple steps",
                        "Creative problem solving",
                        "Not immediately obvious what to do"
                    )
                ),

                Slide.ExampleSlide(
                    id = 8,
                    title = "Example: Non-Routine Problem",
                    problem = "A water tank is ¾ full. After using some water, it becomes ¼ full. What fraction of the tank's water was used?",
                    steps = listOf(
                        "Step 1: Understand the situation \n Started with: ¾ full \n Ended with: ¼ full \n Need to find: How much was used?",
                        "Step 2: Think about the strategy \n If we started with ¾ and ended with ¼, \n we need to subtract to find what was used",
                        "Step 3: Solve \n ¾ − ¼ = ²⁄₄",
                        "Step 4: Simplify \n ²⁄₄ = ½"
                    ),
                    answer = "½ of the tank's water was used"
                ),

                Slide.ExampleSlide(
                    id = 9,
                    title = "Another Non-Routine Example",
                    problem = "Anna has ⅔ of a chocolate bar. She wants to share it equally with 2 friends. What fraction of the whole bar does each person get?",
                    steps = listOf(
                        "Step 1: Understand \n Total chocolate: ⅔ of a bar \n Number of people: 3 (Anna + 2 friends)",
                        "Step 2: Think \n We need to divide ⅔ into 3 equal parts \n This means: ⅔ ÷ 3",
                        "Step 3: Solve \n ⅔ ÷ 3 = ⅔ × ⅓ \n = (2 × 1)/(3 × 3) = ²⁄₉"
                    ),
                    answer = "Each person gets ²⁄₉ of the whole bar"
                ),

                Slide.PracticeSlide(
                    id = 10,
                    question = "A rope is 1 ½ meters long. If ¾ meter is cut off, how much rope is left?",
                    options = listOf("¾ m", "⅞ m", "1 ¼ m", "½ m"),
                    correctAnswer = 0,
                    explanation = "Correct! 1 ½ = 1 ²⁄₄. Then 1 ²⁄₄ − ¾: Borrow 1, making it ⁶⁄₄ − ³⁄₄ = ¾ meter"
                ),

                Slide.SummarySlide(
                    id = 11,
                    title = "Problem Solving Tips",
                    keyPoints = listOf(
                        "Always read the problem carefully",
                        "Identify what's given and what's asked",
                        "Choose the right operation (add, subtract, multiply, divide)",
                        "Solve step by step - don't rush!",
                        "Check if your answer makes sense",
                        "Routine = straightforward, Non-routine = needs creative thinking"
                    )
                )
            )
        )
    }

    // LESSON 3 - SUBTOPIC 1: Multiplies simple fractions
    private fun getQuarter1Lesson3Subtopic1(): InteractiveLesson {
        return InteractiveLesson(
            id = 5,
            title = "Multiplying Simple Fractions",
            slides = listOf(
                Slide.IntroSlide(
                    id = 1,
                    title = "Hi!!",
                    content = "In this topic, you'll learn how to multiply fractions by multiplying the numerators and denominators, and how to simplify or reduce the result to its lowest terms."
                ),

                Slide.ConceptSlide(
                    id = 2,
                    title = "How to Multiply Fractions?",
                    content = "Multiplying fractions is straightforward! Unlike addition or subtraction, you don't need to find a common denominator.",
                    keyPoints = listOf(
                        "Multiply the top numbers (numerators) together",
                        "Multiply the bottom numbers (denominators) together",
                        "Simplify the result if needed",
                        "Formula: a/b × c/d = (a×c)/(b×d)"
                    )
                ),

                Slide.ExampleSlide(
                    id = 3,
                    title = "Example 1: Multiplying Fractions",
                    problem = "⅔ × ⅘ = ?",
                    steps = listOf(
                        "Step 1: Multiply the numerators: 2 × 4 = 8",
                        "Step 2: Multiply the denominators: 3 × 5 = 15",
                        "Step 3: Write as a fraction: ⁸⁄₁₅",
                        "Step 4: Check if it can be simplified (8 and 15 have no common factors)"
                    ),
                    answer = "⁸⁄₁₅"
                ),

                Slide.ExampleSlide(
                    id = 4,
                    title = "Example 2: Multiplying Fractions",
                    problem = "¾ × ²⁄₇ = ?",
                    steps = listOf(
                        "Step 1: Multiply the numerators: 3 × 2 = 6",
                        "Step 2: Multiply the denominators: 4 × 7 = 28",
                        "Step 3: Write as a fraction: ⁶⁄₂₈",
                        "Step 4: Simplify by dividing both by 2: ³⁄₁₄"
                    ),
                    answer = "³⁄₁₄"
                ),

                Slide.ExampleSlide(
                    id = 5,
                    title = "Example 3: Multiplying Fractions",
                    problem = "⅚ × ⅜ = ?",
                    steps = listOf(
                        "Step 1: Multiply the numerators: 5 × 3 = 15",
                        "Step 2: Multiply the denominators: 6 × 8 = 48",
                        "Step 3: Write as a fraction: ¹⁵⁄₄₈",
                        "Step 4: Simplify by dividing both by 3: ⁵⁄₁₆"
                    ),
                    answer = "⁵⁄₁₆"
                ),

                Slide.PracticeSlide(
                    id = 6,
                    question = "What is ½ × ¼ = ?",
                    options = listOf("²⁄₆", "⅛", "⅙", "½"),
                    correctAnswer = 1,
                    explanation = "Correct! Multiply numerators: 1 × 1 = 1. Multiply denominators: 2 × 4 = 8. Answer: ⅛"
                ),

                Slide.ConceptSlide(
                    id = 7,
                    title = "Simplifying Your Answer",
                    content = "After multiplying, always check if your answer can be simplified by finding the Greatest Common Factor (GCF) of the numerator and denominator.",
                    keyPoints = listOf(
                        "Example: ⁴⁄₈ can be simplified to ½",
                        "Divide both numerator and denominator by their GCF",
                        "The GCF of 4 and 8 is 4",
                        "4÷4 = 1 and 8÷4 = 2, so ⁴⁄₈ = ½"
                    )
                ),

                Slide.ExampleSlide(
                    id = 8,
                    title = "Example with Simplification",
                    problem = "¾ × ⅔ = ?",
                    steps = listOf(
                        "Step 1: Multiply numerators: 3 × 2 = 6",
                        "Step 2: Multiply denominators: 4 × 3 = 12",
                        "Step 3: Result is ⁶⁄₁₂",
                        "Step 4: Simplify by dividing both by 6",
                        "6 ÷ 6 = 1 and 12 ÷ 6 = 2"
                    ),
                    answer = "½ (simplified from ⁶⁄₁₂)"
                ),

                Slide.PracticeSlide(
                    id = 9,
                    question = "What is ⅖ × ⅚ = ? (Give the simplified answer)",
                    options = listOf("¹⁰⁄₃₀", "⅓", "²⁄₆", "⁵⁄₁₅"),
                    correctAnswer = 1,
                    explanation = "Correct! 2 × 5 = 10 and 5 × 6 = 30, giving us ¹⁰⁄₃₀. Simplified by dividing both by 10 = ⅓"
                ),

                Slide.SummarySlide(
                    id = 10,
                    title = "Summary",
                    keyPoints = listOf(
                        "To multiply fractions: numerator × numerator, denominator × denominator",
                        "No need to find common denominators!",
                        "Always simplify your final answer if possible",
                        "Check if the numerator and denominator share common factors"
                    )
                )
            )
        )
    }

    // LESSON 3 - SUBTOPIC 2: Cancellation Method
    private fun getQuarter1Lesson3Subtopic2(): InteractiveLesson {
        return InteractiveLesson(
            id = 6,
            title = "Cancellation Method",
            slides = listOf(
                Slide.IntroSlide(
                    id = 1,
                    title = "Helloooo!!",
                    content = "In this topic, you'll learn how to use the cancellation method to simplify fractions BEFORE multiplying, making your work easier and your answer already in simplest form!"
                ),

                Slide.ConceptSlide(
                    id = 2,
                    title = "What is Cancellation?",
                    content = "Cancellation is a shortcut that lets you simplify before you multiply. This means less work and smaller numbers to deal with!",
                    keyPoints = listOf(
                        "Cancel common factors between ANY numerator and ANY denominator",
                        "You can cancel diagonally (across fractions)",
                        "Do this BEFORE multiplying",
                        "Your answer will already be simplified!"
                    )
                ),

                Slide.ConceptSlide(
                    id = 3,
                    title = "How to Use Cancellation",
                    content = "Follow these steps to make multiplication easier:",
                    keyPoints = listOf(
                        "Write the fractions side by side",
                        "Look for common factors between any numerator and any denominator",
                        "Divide both by the common factor",
                        "Multiply what's left",
                        "The result is already simplified!"
                    )
                ),

                Slide.ExampleSlide(
                    id = 4,
                    title = "Example 1: Cancellation Method",
                    problem = "2/3 × 3/5 = ?",
                    steps = listOf(
                        "Step 1: Notice that 3 appears as both a denominator and numerator",
                        "Step 2: Cancel the 3s: 3 ÷ 3 = 1",
                        "Step 3: Now we have: ²⁄₁ × ⅕",
                        "Step 4: Multiply: (2 × 1)/(1 × 5) = ⅖"
                    ),
                    answer = "⅖"
                ),

                Slide.ExampleSlide(
                    id = 5,
                    title = "Example 2: Cancellation Method",
                    problem = "⁴⁄₉ × ³⁄₈ = ?",
                    steps = listOf(
                        "Step 1: Look for common factors",
                        "Step 2: Cancel where possible \n No common factors between 4,9 and 3,8",
                        "Step 3: After checking: multiply directly \n (4 × 3)/(9 × 8) = ¹²⁄₇₂",
                        "Step 4: Simplify: ¹²⁄₇₂ = ⅙"
                    ),
                    answer = "⅙"
                ),

                Slide.ExampleSlide(
                    id = 6,
                    title = "Example 3: Cancellation Method",
                    problem = "⁶⁄₇ × ¹⁴⁄₁₅ = ?",
                    steps = listOf(
                        "Step 1: Look for common factors",
                        "7 and 14 share factor 7: 7÷7=1, 14÷7=2",
                        "6 and 15 share factor 3: 6÷3=2, 15÷3=5",
                        "Step 2: After canceling: ²⁄₁ × ²⁄₅",
                        "Step 3: Multiply: (2 × 2)/(1 × 5) = ⁴⁄₅"
                    ),
                    answer = "⁴⁄₅"
                ),

                Slide.ExampleSlide(
                    id = 7,
                    title = "Another Example",
                    problem = "⁴⁄₉ × ⅜ = ?",
                    steps = listOf(
                        "Step 1: Look for common factors",
                        "4 and 8 share factor 4: 4÷4=1, 8÷4=2",
                        "3 and 9 share factor 3: 3÷3=1, 9÷3=3",
                        "Step 2: After canceling: ⅓ × ½",
                        "Step 3: Multiply: (1 × 1)/(3 × 2) = ⅙"
                    ),
                    answer = "⅙"
                ),

                Slide.PracticeSlide(
                    id = 8,
                    question = "Use cancellation: ¾ × ⁴⁄₉ = ?",
                    options = listOf("¹²⁄₃₆", "⅓", "³⁄₉", "⁴⁄₁₂"),
                    correctAnswer = 1,
                    explanation = "Correct! Cancel the 4s and simplify ³⁄₉ to ⅓. Or cancel 3 from 3 and 9 (giving ⅓), and cancel 4s (giving ¹⁄₁), then multiply: ⅓"
                ),

                Slide.SummarySlide(
                    id = 9,
                    title = "Summary",
                    keyPoints = listOf(
                        "Cancellation simplifies BEFORE multiplying",
                        "Look for common factors between ANY numerator and denominator",
                        "Cancel by dividing both by the common factor",
                        "Multiply the simplified fractions",
                        "Your answer is already in simplest form!"
                    )
                )
            )
        )
    }

    // LESSON 3 - SUBTOPIC 3: Multiplying Mixed Numbers
    private fun getQuarter1Lesson3Subtopic3(): InteractiveLesson {
        return InteractiveLesson(
            id = 7,
            title = "Multiplying Mixed Numbers and Whole Numbers",
            slides = listOf(
                Slide.IntroSlide(
                    id = 1,
                    title = "Hello there!!",
                    content = "In this topic, you'll learn how to multiply fractions with whole numbers and mixed numbers. The key is converting everything to improper fractions first!"
                ),

                Slide.ConceptSlide(
                    id = 2,
                    title = "Types of Multiplication",
                    content = "Besides multiplying fractions by each other, we can also multiply:",
                    keyPoints = listOf(
                        "Fraction × Whole Number",
                        "Fraction × Mixed Number",
                        "Whole Number × Mixed Number",
                        "Mixed Number × Mixed Number"
                    )
                ),

                Slide.ConceptSlide(
                    id = 3,
                    title = "The Secret: Convert First!",
                    content = "For all these types, the strategy is the same:",
                    keyPoints = listOf(
                        "Convert whole numbers to fractions (add /1)",
                        "Convert mixed numbers to improper fractions",
                        "Multiply the fractions",
                        "Convert back to mixed number if needed"
                    )
                ),

                Slide.ExampleSlide(
                    id = 4,
                    title = "Example 1: Fraction × Whole Number",
                    problem = "¾ × 5 = ?",
                    steps = listOf(
                        "Step 1: Write 5 as a fraction: ⁵⁄₁",
                        "Step 2: Multiply: (3 × 5)/(4 × 1) = ¹⁵⁄₄",
                        "Step 3: Convert to mixed number:",
                        "15 ÷ 4 = 3 remainder 3",
                        "So ¹⁵⁄₄ = 3 ¾"
                    ),
                    answer = "3 ¾"
                ),

                Slide.ExampleSlide(
                    id = 5,
                    title = "Example 2: Fraction × Whole Number",
                    problem = "⅗ × 6 = ?",
                    steps = listOf(
                        "Step 1: Write the whole number as a fraction: ⁶⁄₁",
                        "Step 2: Multiply numerators and denominators:",
                        "2 × 6 = 12 (numerator) and 5 × 1 = 5 (denominator)",
                        "Step 3: Convert to a mixed number (if needed): ¹²⁄₅ = 2 ⅖"
                    ),
                    answer = "2 ⅖"
                ),

                Slide.ExampleSlide(
                    id = 6,
                    title = "Example 1: Fraction × Mixed Number",
                    problem = "⅔ × 1 ½ = ?",
                    steps = listOf(
                        "Step 1: Convert 1 ½ to improper fraction: \n (1 × 2) + 1 = 3, so 1 ½ = ³⁄₂",
                        "Step 2: Multiply: (2 × 3)/(3 × 2) = ⁶⁄₆",
                        "Step 3: Simplify: ⁶⁄₆ = 1"
                    ),
                    answer = "1"
                ),

                Slide.ExampleSlide(
                    id = 7,
                    title = "Example 2: Fraction × Mixed Number",
                    problem = "¾ × 2 ⅔ = ?",
                    steps = listOf(
                        "Step 1: Convert the mixed number to an improper fraction:",
                        "2 ⅔ = ⁸⁄₃",
                        "Step 2: Multiply the fractions:",
                        "3 × 8 = 24 (numerator) and 4 × 3 = 12 (denominator)",
                        "Step 3: Simplify: ²⁴⁄₁₂ = 2"
                    ),
                    answer = "2"
                ),

                Slide.ExampleSlide(
                    id = 8,
                    title = "Example 1: Whole Number × Mixed Number",
                    problem = "4 × 2 ⅓ = ?",
                    steps = listOf(
                        "Step 1: Convert 2 ⅓ to improper fraction: \n (2 × 3) + 1 = 7, so 2 ⅓ = ⁷⁄₃",
                        "Step 2: Write 4 as ⁴⁄₁",
                        "Step 3: Multiply: (4 × 7)/(1 × 3) = ²⁸⁄₃",
                        "Step 4: Convert: 28 ÷ 3 = 9 remainder 1",
                        "So ²⁸⁄₃ = 9 ⅓"
                    ),
                    answer = "9 ⅓"
                ),

                Slide.ExampleSlide(
                    id = 9,
                    title = "Example 2: Whole Number × Mixed Number",
                    problem = "5 × 1 ¾ = ?",
                    steps = listOf(
                        "Step 1: Convert the mixed number to an improper fraction:",
                        "1 ¾ = ⁷⁄₄",
                        "Step 2: Write the whole number as a fraction:",
                        "5 = ⁵⁄₁",
                        "Step 3: Multiply the fractions:",
                        "5 × 7 = 35 (numerator) and 1 × 4 = 4 (denominator)",
                        "Step 4: Convert to a mixed number:",
                        "³⁵⁄₄ = 8 ¾"
                    ),
                    answer = "8 ¾"
                ),

                Slide.ExampleSlide(
                    id = 10,
                    title = "Example 1:Mixed Number × Mixed Number",
                    problem = "1 ⅔ × 2 ½ = ?",
                    steps = listOf(
                        "Step 1: Convert 1 ⅔: (1×3)+2 = 5, so ⁵⁄₃",
                        "Step 2: Convert 2 ½: (2×2)+1 = 5, so ⁵⁄₂",
                        "Step 3: Multiply: (5 × 5)/(3 × 2) = ²⁵⁄₆",
                        "Step 4: Convert: 25 ÷ 6 = 4 remainder 1",
                        "So ²⁵⁄₆ = 4 ⅙"
                    ),
                    answer = "4 ⅙"
                ),

                Slide.ExampleSlide(
                    id = 11,
                    title = "Example 2: Mixed Number × Mixed Number",
                    problem = "2 ¼ × 1 ⅗ = ?",
                    steps = listOf(
                        "Step 1: Convert the mixed numbers to improper fractions:",
                        "2 ¼ = ⁹⁄₄, 1 ⅗ = ⁸⁄₅",
                        "Step 2: Multiply the fractions:",
                        "9 × 8 = 72 (numerator) and 4 × 5 = 20 (denominator)",
                        "Step 3: Convert to a mixed number:",
                        "⁷²⁄₂₀ = 3 ¹²⁄₂₀ or simplify: 3 ⅗"
                    ),
                    answer = "3 ⅗"
                ),

                Slide.PracticeSlide(
                    id = 12,
                    question = "What is 9 × ½ = ?",
                    options = listOf("⁹⁄₂", "4 ½", "9 ½", "½"),
                    correctAnswer = 1,
                    explanation = "Correct! ⁹⁄₁ × ½ = ⁹⁄₂ = 4 ½"
                ),

                Slide.PracticeSlide(
                    id = 13,
                    question = "What is 2 ¼ × 1 ⅓ = ?",
                    options = listOf("2 ¹⁄₁₂", "3", "2 ⅔", "3 ⅓"),
                    correctAnswer = 1,
                    explanation = "Correct! 2 ¼ = ⁹⁄₄ and 1 ⅓ = ⁴⁄₃. Then (9×4)/(4×3) = ³⁶⁄₁₂ = 3"
                ),

                Slide.SummarySlide(
                    id = 14,
                    title = "Summary",
                    keyPoints = listOf(
                        "Fraction × Whole: Convert whole to fraction, multiply, simplify",
                        "Fraction × Mixed: Convert mixed to improper, multiply, simplify",
                        "Whole × Mixed: Convert both, multiply, convert result",
                        "Mixed × Mixed: Convert both to improper, multiply, convert result",
                        "Key: Always convert to improper fractions first!"
                    )
                )
            )
        )
    }

    // LESSON 4 - SUBTOPIC 1: Mathematical Phrases
    private fun getQuarter1Lesson4Subtopic1(): InteractiveLesson {
        return InteractiveLesson(
            id = 8,
            title = "Creating Mathematical Phrases",
            slides = listOf(
                Slide.IntroSlide(
                    id = 1,
                    title = "Hi!!",
                    content = "By the end of this topic, you will be able to identify multiplication phrases and translate them into mathematical expressions"
                ),

                Slide.ConceptSlide(
                    id = 2,
                    title = "What are Mathematical Phrases?",
                    content = "Mathematical phrases are expressions that describe mathematical operations using words. They help us translate real-world problems into math we can solve.",
                    keyPoints = listOf()
                ),

                Slide.ConceptSlide(
                    id = 3,
                    title = "In Multiplication",
                    content = "It's helpful to recognize phrases that indicate this operation with any type of number, such as:",
                    keyPoints = listOf(
                        "Multiplied by",
                        "Thrice",
                        "Twice",
                        "Times",
                        "The product of"
                    )
                ),

                Slide.ExampleSlide(
                    id = 4,
                    title = "Example: Multiplication Phrase",
                    problem = "\"One-half of one-third\"",
                    steps = listOf(
                        "½ × ⅓"
                    ),
                    answer = "½ × ⅓"
                ),

                Slide.ExampleSlide(
                    id = 5,
                    title = "Example 2: Multiplication Phrase",
                    problem = "\"Three-fourths multiplied by two-fifths\"",
                    steps = listOf(
                        "¾ × ⅖"
                    ),
                    answer = "¾ × ⅖"
                ),

                Slide.ExampleSlide(
                    id = 6,
                    title = "Example 3: Multiplication Phrase",
                    problem = "\"The product of two-thirds and five-fourths\"",
                    steps = listOf(
                        "⅔ × ⁵⁄₄"
                    ),
                    answer = "⅔ × ⁵⁄₄"
                ),

                Slide.PracticeSlide(
                    id = 7,
                    question = "\"The product of six and four\" What is the right expression for this?",
                    options = listOf("6 × 4", "6 + 4", "6 − 4", "6 ÷ 4"),
                    correctAnswer = 0,
                    explanation = "Correct! 'The product of' means multiplication, so the expression is 6 × 4"
                ),

                Slide.SummarySlide(
                    id = 8,
                    title = "Summary",
                    keyPoints = listOf(
                        "Mathematical phrases use words to show a math operation",
                        "Words like multiplied by, twice, thrice, times, and the product of tell us that the operation is multiplication",
                        "These phrases help us change real-world statements into math expressions we can solve"
                    )
                )
            )
        )
    }

    // LESSON 4 - SUBTOPIC 2: Steps in Problem Solving
    private fun getQuarter1Lesson4Subtopic2(): InteractiveLesson {
        return InteractiveLesson(
            id = 9,
            title = "Steps in Problem Solving",
            slides = listOf(
                Slide.IntroSlide(
                    id = 1,
                    title = "Hello!!",
                    content = "You will learn to follow the steps in problem solving to solve word problems correctly."
                ),

                Slide.ConceptSlide(
                    id = 2,
                    title = "In problem solving, there are steps to follow:",
                    content = "",
                    keyPoints = listOf(
                        "Identify the given facts",
                        "Understand what is asked",
                        "Determine the operation and the number sentence",
                        "Solve it",
                        "Check your work"
                    )
                ),

                Slide.ExampleSlide(
                    id = 3,
                    title = "Example problem:",
                    problem = "Jayson is 160 cm tall, and his sister Joan is ⅞ as tall as him. How tall is Joan?",
                    steps = listOf(),
                    answer = ""
                ),

                Slide.ExampleSlide(
                    id = 4,
                    title = "Step 1: Understand",
                    problem = "",
                    steps = listOf(
                        "1. Identify the given facts (Identify the information given and what you need to solve the problem). \n 160 cm - height of Jayson, ⅞ as tall as Jayson - Joan's height",
                        "2. Understand what is asked (Figure out what the problem is asking for). \n Height of Joan."
                    ),
                    answer = ""
                ),

                Slide.ExampleSlide(
                    id = 5,
                    title = "Step 2: Plan",
                    problem = "",
                    steps = listOf(
                        "1. Determine the operation and the number sentence (Choose the math operation to use and write the number sentence).",
                        "The operation to be used is Multiplication.",
                        "The number sentence is ⅞ × 160 = N"
                    ),
                    answer = ""
                ),

                Slide.ExampleSlide(
                    id = 6,
                    title = "Step 3: Solve",
                    problem = "",
                    steps = listOf(
                        "1. Solve it (Calculate the answer).",
                        "⅞ × 160 = ¹¹²⁰⁄₈ = 140",
                        "Therefore, Joan's height is 140 cm"
                    ),
                    answer = "140 cm"
                ),

                Slide.ExampleSlide(
                    id = 7,
                    title = "Step 4: Check",
                    problem = "",
                    steps = listOf(
                        "1. Check your work: Review your answer to see if it's correct.",
                        "¹⁴⁰⁄₁₆₀ × 160 ÷ 20 = ⅞"
                    ),
                    answer = ""
                ),

                Slide.PracticeSlide(
                    id = 8,
                    question = "Twice the amount of ¾ liter of juice was poured into a pitcher. How much juice is that in total?",
                    options = listOf("1", "1 ½", "1 ¼", "½"),
                    correctAnswer = 1,
                    explanation = "Correct! 1 ½ liters of juice."
                ),

                Slide.SummarySlide(
                    id = 9,
                    title = "Summary",
                    keyPoints = listOf(
                        "Problem solving has steps to guide us:",
                        "Understand (Identify the given facts and what is asked.)",
                        "Plan (Determine the operation and the number sentence.)",
                        "Solve",
                        "Check",
                        "These steps help us solve problems clearly and correctly."
                    )
                )
            )
        )
    }

    // LESSON 5 - SUBTOPIC 1: Dividing Simple Fractions
    private fun getQuarter1Lesson5Subtopic1(): InteractiveLesson {
        return InteractiveLesson(
            id = 10,
            title = "Dividing Simple Fractions",
            slides = listOf(
                Slide.IntroSlide(
                    id = 1,
                    title = "Hi!",
                    content = "In this topic you will be able to learn to divide simple fractions.\n\nYou will understand how to divide simple fractions by using the reciprocal method."
                ),

                Slide.ConceptSlide(
                    id = 2,
                    title = "How to Divide Fractions?",
                    content = "Dividing fractions is closely related to multiplying fractions. The key is to use the reciprocal!",
                    keyPoints = listOf(
                        "Keep the first fraction (dividend) as it is",
                        "Change division (÷) to multiplication (×)",
                        "Flip the second fraction (find its reciprocal)",
                        "Then multiply the fractions",
                        "Simplify if needed"
                    )
                ),

                Slide.ConceptSlide(
                    id = 3,
                    title = "What is a Reciprocal?",
                    content = "A reciprocal is when you flip a fraction upside down - the numerator becomes the denominator and vice versa.",
                    keyPoints = listOf(
                        "Example: Reciprocal of ¾ is ⁴⁄₃",
                        "Example: Reciprocal of ⅖ is ⅝",
                        "Example: Reciprocal of ⁵⁄₁ (or 5) is ⅕",
                        "Tip: Only flip the SECOND fraction (divisor)"
                    )
                ),

                Slide.ExampleSlide(
                    id = 4,
                    title = "Example 1: Understanding the Process",
                    problem = "Find the quotient of ⅝ and ¾",
                    steps = listOf(
                        "Step 1: Write the division problem \n ⅝ ÷ ¾",
                        "Step 2: Find the reciprocal of ¾ \n Reciprocal of ¾ is ⁴⁄₃",
                        "Step 3: Change ÷ to × and use the reciprocal \n ⅝ × ⁴⁄₃",
                        "Step 4: Multiply \n (5 × 4)/(8 × 3) = ²⁰⁄₂₄",
                        "Step 5: Simplify \n ²⁰⁄₂₄ = ⅚"
                    ),
                    answer = "⅚"
                ),

                Slide.ConceptSlide(
                    id = 5,
                    title = "Steps to Solve Dividing Fractions",
                    content = "Follow these steps every time you divide fractions:",
                    keyPoints = listOf(
                        "Step 1: Write both fractions clearly (dividend ÷ divisor)",
                        "Step 2: Keep the first fraction, change ÷ to ×",
                        "Step 3: Write the reciprocal of the second fraction",
                        "Step 4: Multiply numerators and denominators",
                        "Step 5: Simplify to lowest terms"
                    )
                ),

                Slide.ExampleSlide(
                    id = 6,
                    title = "Example 2: With Simplification",
                    problem = "Find the quotient of ⅔ and ¹⁄₁₂",
                    steps = listOf(
                        "Step 1: Write the problem \n ⅔ ÷ ¹⁄₁₂",
                        "Step 2: Find reciprocal of ¹⁄₁₂ \n Reciprocal is ¹²⁄₁",
                        "Step 3: Change to multiplication \n ⅔ × ¹²⁄₁", 
                        "Step 4: Multiply \n (2 × 12)/(3 × 1) = ²⁴⁄₃", 
                        "Step 5: Simplify \n ²⁴⁄₃ = 8"
                    ),
                    answer = "8"
                ),

                Slide.ExampleSlide(
                    id = 7,
                    title = "Example 3: Using Cancellation",
                    problem = "Find the quotient of ⁴⁄₉ and ²⁄₃",
                    steps = listOf(
                        "Step 1: Write ⁴⁄₉ ÷ ²⁄₃",
                        "Step 2: Use reciprocal \n ⁴⁄₉ × ³⁄₂",
                        "Step 3: Cancel before multiplying \n 9 and 3 share factor 3: 9÷3=3, 3÷3=1 \n 4 and 2 share factor 2: 4÷2=2, 2÷2=1",
                        "Step 4: After canceling: ²⁄₃ × ¹⁄₁",
                        "Step 5: Multiply \n (2 × 1)/(3 × 1) = ⅔"
                    ),
                    answer = "⅔"
                ),

                Slide.PracticeSlide(
                    id = 8,
                    question = "Find the quotient of ¾ and ¼",
                    options = listOf("⁴⁄₈", "1", "²⁄₄", "3"),
                    correctAnswer = 3,
                    explanation = "Correct! ¾ ÷ ¼ = ¾ × ⁴⁄₁ = ¹²⁄₄ = 3"
                ),

                Slide.PracticeSlide(
                    id = 9,
                    question = "What is the reciprocal of ⅝?",
                    options = listOf("⅝", "⁸⁄₅", "⅜", "⁵⁄₃"),
                    correctAnswer = 1,
                    explanation = "Correct! The reciprocal of ⅝ is ⁸⁄₅ (flip the fraction)"
                ),

                Slide.ConceptSlide(
                    id = 10,
                    title = "Why Does This Work?",
                    content = "Division asks: 'How many times does one number fit into another?' When we multiply by the reciprocal, we're actually asking the same question in a different way!",
                    keyPoints = listOf(
                        "Example: ½ ÷ ¼ means 'How many ¼s fit in ½?'",
                        "Answer: 2 (because two ¼s make ½)",
                        "Using reciprocal: ½ × ⁴⁄₁ = ²⁄₁ = 2 ✓",
                        "Both methods give the same answer!"
                    )
                ),

                Slide.SummarySlide(
                    id = 11,
                    title = "Summary",
                    keyPoints = listOf(
                        "To divide fractions: Keep, Change, Flip (KCF)",
                        "KEEP the first fraction",
                        "CHANGE ÷ to ×",
                        "FLIP the second fraction (reciprocal)",
                        "Always simplify using cancellation when possible",
                        "Practice makes it easier and faster!"
                    )
                )
            )
        )
    }

    // LESSON 5 - SUBTOPIC 2: Dividing Mixed Fractions
    private fun getQuarter1Lesson5Subtopic2(): InteractiveLesson {
        return InteractiveLesson(
            id = 11,
            title = "Dividing Mixed Fractions",
            slides = listOf(
                Slide.IntroSlide(
                    id = 1,
                    title = "Good day!",
                    content = "In this topic, you will learn to divide mixed fractions. When dividing a mixed number by another mixed number, there are important steps we have to follow!"
                ),

                Slide.ConceptSlide(
                    id = 2,
                    title = "How to Divide Mixed Fractions?",
                    content = "Dividing mixed fractions is similar to dividing simple fractions, but we need to convert them first!",
                    keyPoints = listOf(
                        "Step 1: Convert mixed numbers to improper fractions",
                        "Step 2: Keep the first fraction",
                        "Step 3: Change ÷ to ×",
                        "Step 4: Use the reciprocal of the second fraction",
                        "Step 5: Multiply and simplify",
                        "Step 6: Convert back to mixed number if needed"
                    )
                ),

                Slide.ConceptSlide(
                    id = 3,
                    title = "Step 1: Convert to Improper Fractions",
                    content = "Before dividing, we must convert all mixed numbers to improper fractions.",
                    keyPoints = listOf(
                        "Formula: (Whole × Denominator) + Numerator",
                        "Write the result over the original denominator",
                        "Example: 2 ⅓ = (2 × 3) + 1 = ⁷⁄₃",
                        "Example: 1 ¼ = (1 × 4) + 1 = ⁵⁄₄"
                    )
                ),

                Slide.ExampleSlide(
                    id = 4,
                    title = "Complete Example: Step-by-Step",
                    problem = "Compute 2 ⅓ ÷ 1 ¼",
                    steps = listOf(
                        "Step 1: Convert to improper fractions \n 2 ⅓ → (2 × 3) + 1 = 7 → ⁷⁄₃ \n 1 ¼ → (1 × 4) + 1 = 5 → ⁵⁄₄",
                        "Step 2: Write the division \n ⁷⁄₃ ÷ ⁵⁄₄",
                        "Step 3: Find reciprocal and change to multiplication \n ⁷⁄₃ × ⁴⁄₅",
                        "Step 4: Multiply \n (7 × 4)/(3 × 5) = ²⁸⁄₁₅",
                        "Step 5: Convert to mixed number \n 28 ÷ 15 = 1 remainder 13 \n ²⁸⁄₁₅ = 1 ¹³⁄₁₅"
                    ),
                    answer = "1 ¹³⁄₁₅"
                ),

                Slide.ExampleSlide(
                    id = 5,
                    title = "Another Example",
                    problem = "Compute 3 ½ ÷ 1 ¾",
                    steps = listOf(
                        "Step 1: Convert to improper fractions \n 3 ½ → (3 × 2) + 1 = ⁷⁄₂ \n 1 ¾ → (1 × 4) + 3 = ⁷⁄₄",
                        "Step 2: Change to multiplication with reciprocal \n ⁷⁄₂ × ⁴⁄₇",
                        "Step 3: Cancel common factors \n 7 cancels with 7 → ¹⁄₂ × ⁴⁄₁",
                        "Step 4: Multiply \n (1 × 4)/(2 × 1) = ⁴⁄₂ = 2"
                    ),
                    answer = "2"
                ),

                Slide.ExampleSlide(
                    id = 6,
                    title = "Example with Whole Number Result",
                    problem = "Compute 4 ½ ÷ 1 ½",
                    steps = listOf(
                        "Step 1: Convert \n 4 ½ = ⁹⁄₂, 1 ½ = ³⁄₂",
                        "Step 2: Use reciprocal \n ⁹⁄₂ × ²⁄₃",
                        "Step 3: Cancel \n 2 cancels with 2, 9 and 3 share factor 3 \n After canceling: ³⁄₁ × ¹⁄₁",
                        "Step 4: Multiply \n (3 × 1)/(1 × 1) = 3"
                    ),
                    answer = "3"
                ),

                Slide.PracticeSlide(
                    id = 7,
                    question = "Compute 1 ¼ ÷ 1 ½",
                    options = listOf("½", "²⁄₄", "⁴⁄₆", "⅚"),
                    correctAnswer = 3,
                    explanation = "Correct! 1 ¼ = ⁵⁄₄ and 1 ½ = ³⁄₂. Then ⁵⁄₄ × ²⁄₃ = ¹⁰⁄₁₂ = ⅚"
                ),

                Slide.ConceptSlide(
                    id = 8,
                    title = "Dividing Mixed Number by Whole Number",
                    content = "You can also divide a mixed number by a whole number!",
                    keyPoints = listOf(
                        "Convert the mixed number to improper fraction",
                        "Write the whole number as a fraction (over 1)",
                        "Use the same Keep-Change-Flip method",
                        "Example: 2 ½ ÷ 3 = ⁵⁄₂ ÷ ³⁄₁ = ⁵⁄₂ × ⅓ = ⅚"
                    )
                ),

                Slide.ExampleSlide(
                    id = 9,
                    title = "Example: Mixed ÷ Whole",
                    problem = "Compute 3 ¾ ÷ 5",
                    steps = listOf(
                        "Step 1: Convert 3 ¾ to improper fraction \n 3 ¾ = (3 × 4) + 3 = ¹⁵⁄₄",
                        "Step 2: Write 5 as ⁵⁄₁",
                        "Step 3: Use reciprocal \n ¹⁵⁄₄ × ⅕",
                        "Step 4: Cancel and multiply \n 15 and 5 share factor 5: ³⁄₄ × ⅕ \n (3 × 1)/(4 × 1) = ¾"
                    ),
                    answer = "¾"
                ),

                Slide.PracticeSlide(
                    id = 10,
                    question = "What is 5 ⅓ ÷ 2?",
                    options = listOf("2 ⅔", "3 ⅓", "2 ⅓", "10 ⅔"),
                    correctAnswer = 0,
                    explanation = "Correct! 5 ⅓ = ¹⁶⁄₃, then ¹⁶⁄₃ ÷ ²⁄₁ = ¹⁶⁄₃ × ½ = ¹⁶⁄₆ = ⁸⁄₃ = 2 ⅔"
                ),

                Slide.ConceptSlide(
                    id = 11,
                    title = "Common Mistakes to Avoid",
                    content = "Watch out for these common errors when dividing mixed fractions:",
                    keyPoints = listOf(
                        "❌ Don't forget to convert to improper fractions first!",
                        "❌ Don't flip the first fraction (only flip the divisor)",
                        "❌ Don't forget to change ÷ to ×",
                        "✓ Always simplify your final answer",
                        "✓ Convert improper fractions back to mixed numbers"
                    )
                ),

                Slide.SummarySlide(
                    id = 12,
                    title = "Summary",
                    keyPoints = listOf(
                        "Always convert mixed numbers to improper fractions FIRST",
                        "Use Keep-Change-Flip: Keep first, Change ÷ to ×, Flip second",
                        "Multiply numerators and denominators",
                        "Simplify using cancellation when possible",
                        "Convert improper fractions back to mixed numbers",
                        "Check: Does your answer make sense?"
                    )
                )
            )
        )
    }

    // LESSON 6 - SUBTOPIC 1: Some Terms in Division
    private fun getQuarter1Lesson6Subtopic1(): InteractiveLesson {
        return InteractiveLesson(
            id = 12,
            title = "Key Terms in Division",
            slides = listOf(
                Slide.IntroSlide(
                    id = 1,
                    title = "Heyyyy!!",
                    content = "In this topic, you'll learn how to recognize keywords that indicate division and solve problems using the division operation."
                ),

                Slide.ConceptSlide(
                    id = 2,
                    title = "Do you think you're aware of these terms used in division?",
                    content = "",
                    keyPoints = listOf(
                        "Quotient",
                        "Divided by",
                        "Cut",
                        "Average",
                        "Split into"
                    )
                ),

                Slide.ExampleSlide(
                    id = 3,
                    title = "Example problems that used those terms:",
                    problem = "",
                    steps = listOf(
                        "1. What is the quotient of 20 and 5?",
                        "2. 30 divided by 6 equals what?",
                        "3. What is the average of 10 and 20?"
                    ),
                    answer = ""
                ),

                Slide.PracticeSlide(
                    id = 4,
                    question = "\"20 pencils are split into 5 equal groups. How many pencils are in each group?\" uses one of those terms?",
                    options = listOf("TRUE", "FALSE"),
                    correctAnswer = 0,
                    explanation = "ANSWER: TRUE"
                ),

                Slide.SummarySlide(
                    id = 5,
                    title = "Summary",
                    keyPoints = listOf(
                        "There are many terms used in division, such as quotient, divided by, cut, average, and split into",
                        "These words help identify when to use division to solve a problem"
                    )
                )
            )
        )
    }

    // LESSON 6 - SUBTOPIC 2: Solving Routine or Non-Routine Problems in Division
    private fun getQuarter1Lesson6Subtopic2(): InteractiveLesson {
        return InteractiveLesson(
            id = 13,
            title = "Solving Routine and Non-Routine Division Problems",
            slides = listOf(
                Slide.IntroSlide(
                    id = 1,
                    title = "Good day!",
                    content = "In this lesson, you should be able to solve both routine and non-routine problems that involve multiplying fractions and mixed numbers with or without addition or subtraction using appropriate problem-solving strategies and tools."
                ),

                Slide.ConceptSlide(
                    id = 2,
                    title = "In problem solving, there are steps to follow:",
                    content = "",
                    keyPoints = listOf(
                        "Identify the given facts",
                        "Understand what is asked",
                        "Determine the operation and the number sentence",
                        "Solve it",
                        "Check your work"
                    )
                ),

                Slide.ExampleSlide(
                    id = 3,
                    title = "Here is the example problem:",
                    problem = "Aling Nena has a 15 ½ m long cloth. How many blouses can she make if each blouse uses 1 ¾ m of cloth?",
                    steps = listOf(),
                    answer = ""
                ),

                Slide.ExampleSlide(
                    id = 4,
                    title = "1. Understand",
                    problem = "",
                    steps = listOf(
                        "1. What are the given facts?",
                        "15 ½ m long of cloth, 1 ¾ m of cloth each blouse uses.",
                        "2. What is asked?",
                        "The number of blouses she can make if each blouse uses 1 ¾ m cloth."
                    ),
                    answer = ""
                ),

                Slide.ExampleSlide(
                    id = 5,
                    title = "2. Plan",
                    problem = "",
                    steps = listOf(
                        "1. What is the operation to be used?",
                        "Division",
                        "2. Number sentence?",
                        "15 ½ ÷ 1 ¾ = N"
                    ),
                    answer = ""
                ),

                Slide.ExampleSlide(
                    id = 6,
                    title = "3. Solve the problem",
                    problem = "",
                    steps = listOf(
                        "15 ½ ÷ 1 ¾ = ³¹⁄₂ ÷ ⁷⁄₄ = ³¹⁄₂ × ⁴⁄₇ = ¹²⁴⁄₁₄ = ⁸¹²⁄₁₄ or ⁸⁶⁄₇",
                        "She can make 8 blouses using 1 ¾ m of cloth."
                    ),
                    answer = "8 blouses"
                ),

                Slide.ExampleSlide(
                    id = 7,
                    title = "4. Check",
                    problem = "",
                    steps = listOf(
                        "1 ¾ × ⁸⁶⁄₇ = 15 ½"
                    ),
                    answer = ""
                ),

                Slide.ExampleSlide(
                    id = 8,
                    title = "Here is the example problem 2:",
                    problem = "Mang Juan has 20 ¾ meters of fabric. How many curtains can he make if each curtain uses 2 ½ meters of fabric?",
                    steps = listOf(),
                    answer = ""
                ),

                Slide.ExampleSlide(
                    id = 9,
                    title = "1. Understand",
                    problem = "",
                    steps = listOf(
                        "1. What are the given facts?",
                        "Total fabric = 20 ¾ m, Fabric per curtain = 2 ½ m",
                        "2. What is asked?",
                        "Number of curtains he can make."
                    ),
                    answer = ""
                ),

                Slide.ExampleSlide(
                    id = 10,
                    title = "2. Plan",
                    problem = "",
                    steps = listOf(
                        "1. What is the operation to be used?",
                        "Division",
                        "2. Number sentence?",
                        "20 ¾ ÷ 2 ½ = N"
                    ),
                    answer = ""
                ),

                Slide.ExampleSlide(
                    id = 11,
                    title = "3. Solve the problem",
                    problem = "",
                    steps = listOf(
                        "Convert mixed numbers to improper fractions: 20 ¾ = ⁸³⁄₄, 2 ½ = ⁵⁄₂",
                        "Divide fractions → multiply by reciprocal: ⁸³⁄₄ ÷ ⁵⁄₂ = ⁸³⁄₄ × ²⁄₅ = ¹⁶⁶⁄₂₀ = ⁸⁶⁄₁₀ = 8 ³⁄₁₀",
                        "She can make 8 full curtains, and there will be some fabric left over."
                    ),
                    answer = "8 curtains"
                ),

                Slide.ExampleSlide(
                    id = 12,
                    title = "4. Check",
                    problem = "",
                    steps = listOf(
                        "2 ½ × 8 = 20 m",
                        "Remaining fabric: 20 ¾ − 20 = ¾ m left"
                    ),
                    answer = ""
                ),

                Slide.PracticeSlide(
                    id = 13,
                    question = "Lola Grace has a 18 ¾ meters long ribbon. She wants to cut the ribbon into pieces, and each piece must be 2 ½ meters long. How many ribbon pieces can she make?",
                    options = listOf("7 ½", "1 ²⁄₇", "2 ¹⁄₇", "8 ½"),
                    correctAnswer = 0,
                    explanation = "Correct answer: 7 ½"
                ),

                Slide.SummarySlide(
                    id = 14,
                    title = "Summary",
                    keyPoints = listOf(
                        "Uses a clear problem-solving process: understand the problem, identify given facts, determine what is asked, choose the correct operation, and write the number sentence",
                        "Division of fractions and mixed numbers involves converting mixed numbers to improper fractions and applying Keep, Change, Flip (reciprocal)"
                    )
                )
            )
        )
    }

    // LESSON 7 - SUBTOPIC 1: Rounding Off Decimals
    private fun getQuarter1Lesson7Subtopic1(): InteractiveLesson {
        return InteractiveLesson(
            id = 14,
            title = "Rounding Off Decimals",
            slides = listOf(
                Slide.IntroSlide(
                    id = 1,
                    title = "Welcome!!",
                    content = "In this topic, you'll learn how to round off decimals to the nearest whole number or specified place value using the rules for rounding."
                ),

                Slide.ConceptSlide(
                    id = 2,
                    title = "But first let's recall how to round off decimals!",
                    content = "If the digit to the right of the rounding place is 5 or greater, add 1 to the digit in the rounding place. If it's less than 5, keep the digit the same. Then, drop all the digits after the rounding place.",
                    keyPoints = listOf()
                ),

                Slide.ExampleSlide(
                    id = 3,
                    title = "Example: A bird house was built 6.243 meters above the ground. Round to the nearest whole number.",
                    problem = "",
                    steps = listOf(
                        "Step 1: Identify the rounding place. \n 6.243, 6 is the whole number",
                        "Step 2: Look at the digit which is to the right of the rounding place. \n 6.243, 2 is the rounding place",
                        "If the digit is less than 5, do not change the digit in the rounding place. 2<5",
                        "If the digit is 5 or greater, add 1 to the digit in the rounding place.",
                        "Step 3: Drop all digits to the right of the rounding place. \n 6",
                        "Therefore, the birdhouse is about 6 meters high."
                    ),
                    answer = "6"
                ),

                Slide.ExampleSlide(
                    id = 4,
                    title = "Example 2: A tree is 9.768 meters tall. Round to the nearest whole number.",
                    problem = "",
                    steps = listOf(
                        "Step 1: Identify the rounding place. \n 9.768, 9 is the whole number",
                        "Step 2: Look at the digit which is to the right of the rounding place. \n 9.768, 7 is the rounding place",
                        "If the digit is less than 5, do not change the digit in the rounding place.",
                        "If the digit is 5 or greater, add 1 to the digit in the rounding place.",
                        "Here, 7 ≥ 5 → add 1 to 9 → 10",
                        "Step 3: Drop all digits to the right of the rounding place. \n 10",
                        "The tree is about 10 meters tall."
                    ),
                    answer = "10"
                ),

                Slide.PracticeSlide(
                    id = 5,
                    question = "Round off of 8.576?",
                    options = listOf("8", "9"),
                    correctAnswer = 0,
                    explanation = "ANSWER: 8"
                ),

                Slide.PracticeSlide(
                    id = 6,
                    question = "Round off of 6.214?",
                    options = listOf("6", "7"),
                    correctAnswer = 0,
                    explanation = "ANSWER: 6"
                ),

                Slide.SummarySlide(
                    id = 7,
                    title = "Summary",
                    keyPoints = listOf(
                        "Round off decimals by checking the digit to the right of the rounding place",
                        "If the digit is 5 or greater, add 1 to the rounding place",
                        "If it is less than 5, keep the rounding place the same",
                        "Then, drop all digits after it"
                    )
                )
            )
        )
    }

    // LESSON 7 - SUBTOPIC 2: Adding and Subtracting Decimals
    private fun getQuarter1Lesson7Subtopic2(): InteractiveLesson {
        return InteractiveLesson(
            id = 15,
            title = "Adding and Subtracting Decimals",
            slides = listOf(
                Slide.IntroSlide(
                    id = 1,
                    title = "Good day!!",
                    content = "In this topic, you'll learn how to correctly add and subtract decimal numbers"
                ),

                Slide.ConceptSlide(
                    id = 2,
                    title = "How to add and subtract decimals?",
                    content = "Adding and subtracting decimals is similar to adding and subtracting whole numbers.\n\n           7.894          7.894\n         - 2.123        - 2.123\n         10.017          5.771",
                    keyPoints = listOf()
                ),

                Slide.ConceptSlide(
                    id = 3,
                    title = "Decimals up to ten thousandths have four digits after the decimal point.",
                    content = "Example: 0.0001",
                    keyPoints = listOf()
                ),

                Slide.ConceptSlide(
                    id = 4,
                    title = "Here are the steps for adding and subtracting decimal numbers up to ten thousandths.",
                    content = "",
                    keyPoints = listOf()
                ),

                Slide.ExampleSlide(
                    id = 5,
                    title = "Example 1. Add 0.25 + 0.03 + 0.0756",
                    problem = "",
                    steps = listOf(
                        "Step 1: Arrange the digits in columns and align the decimal points. \n            2.25 \n            0.03 \n        + 0.0756",
                        "Step 2: Insert zeros in empty decimal place values (if needed) so that all of the numbers have the same number of decimal places. \n         2.2500← \n         0.0300← \n       + 0.0756",
                        "Step 3: Add or subtract as with whole numbers. \n         2.2500 \n         0.0300 \n       + 0.0756 \n         2.3556"
                    ),
                    answer = "2.3556"
                ),

                Slide.PracticeSlide(
                    id = 6,
                    question = "Add, 0.35 + 0.10 + 0.0123 = ?",
                    options = listOf("0.4623", "0.34123", "0.1235", "0.5213"),
                    correctAnswer = 0,
                    explanation = "ANSWER: 0.4623"
                ),

                Slide.PracticeSlide(
                    id = 7,
                    question = "Subtract, 0.123 - 0.012 = ?",
                    options = listOf("0.111", "0.123", "0.1234", "0.112"),
                    correctAnswer = 0,
                    explanation = "ANSWER: 0.111"
                ),

                Slide.SummarySlide(
                    id = 8,
                    title = "Summary",
                    keyPoints = listOf(
                        "Adding and subtracting decimals is easy when you align the decimal points, add zeros if needed, and then solve just like whole numbers"
                    )
                )
            )
        )
    }

    // LESSON 8 - SUBTOPIC 1: Routine and Non-Routine Problems in Addition and Subtraction of Decimals
    private fun getQuarter1Lesson8Subtopic1(): InteractiveLesson {
        return InteractiveLesson(
            id = 16,
            title = "Routine and Non-Routine Problems in Addition and Subtraction of Decimals",
            slides = listOf(
                Slide.IntroSlide(
                    id = 1,
                    title = "Hello!!",
                    content = "By the end of this topic, you will be able to solve routine and non-routine word problems involving addition and subtraction of decimals."
                ),

                Slide.ConceptSlide(
                    id = 2,
                    title = "Solving problems with decimals",
                    content = "It is similar to solving the applied problems from the previous chapter.",
                    keyPoints = listOf()
                ),

                Slide.ConceptSlide(
                    id = 3,
                    title = "To solve word problems, follow these four steps:",
                    content = "1. Understand: What is asked, and what are the given facts?\n2. Plan: What operation is to be used, and what is the number sentence?\n3. Solve: Find the answer to the problem. 4. Check: Look back and check if the answer is correct.\n\nTake note: You may also draw an illustration to help you visualize your plan.",
                    keyPoints = listOf()
                ),

                Slide.ExampleSlide(
                    id = 4,
                    title = "Example problem for addition of decimals:",
                    problem = "In a sale, a microwave costs ₱2,999.99. Its price has been reduced by ₱500.00. What was its price before the sale?",
                    steps = listOf(
                        "1. Understand \n What are the given facts? Sale cost ₱2,999.99, Price has been reduced by ₱500.00 \n What is asked? The price of the microwave before the sale.",
                        "2. Plan \n What is the operation to be used? Addition \n Number sentence? 2,999.99 + 500.00 = N",
                        "3. Solve the problem \n  2,999.99 \n+   500.00 \n  3,499.99",
                        "The price of the microwave before the sale is ₱3,499.99.",
                        "4. Check \n  3,499.99 \n-   500.00 \n  2,999.99",
                        "The price of the microwave during the sale is ₱2,999.99."
                    ),
                    answer = "₱3,499.99"
                ),

                Slide.ExampleSlide(
                    id = 5,
                    title = "Example problem 2 for addition of decimals:",
                    problem = "A laptop costs ₱45,750.50. Its price was increased by ₱4,249.50. What is the new price of the laptop?",
                    steps = listOf(
                        "1. Understand \n What are the given facts? Original price ₱45,750.50, Increase ₱4,249.50 \n What is asked? New price of the laptop.",
                        "2. Plan \n What is the operation to be used? Addition \n Number sentence? 45,750.50 + 4,249.50 = N",
                        "3. Solve the problem \n  45,750.50 \n+  4,249.50 \n  50,000.00",
                        "The new price of the laptop is ₱50,000.00.",
                        "4. Check \n  50,000.00 \n-  4,249.50 \n  45,750.50",
                        "The calculation is correct."
                    ),
                    answer = "₱50,000.00"
                ),

                Slide.ExampleSlide(
                    id = 6,
                    title = "Example problem for subtraction of decimals:",
                    problem = "Anna had ₱5,000.00 in her wallet. She bought a smartphone for ₱3,275.50. How much money does she have left?",
                    steps = listOf(
                        "1. Understand \n What are the given facts? Total money = ₱5,000.00, Cost of smartphone = ₱3,275.50 \n What is asked? Amount of money left to Anna?",
                        "2. Plan \n What is the operation to be used? Subtraction \n Number sentence? 5,000.00 − 3,275.50 = N",
                        "3. Solve the problem \n  5,000.00 \n- 3,275.50 \n  1,724.50",
                        "The money left to Anna after buying the smartphone is ₱1,724.50.",
                        "4. Check \n  1,724.50 \n+ 3,275.50 \n  5,000.00"
                    ),
                    answer = "₱1,724.50"
                ),

                Slide.ExampleSlide(
                    id = 7,
                    title = "Example problem 2 for subtraction of decimals:",
                    problem = "Marco had ₱8,500.75 in his account. He withdrew ₱2,345.40. How much money is left in his account?",
                    steps = listOf(
                        "1. Understand \n What are the given facts? Total money = ₱8,500.75, Withdrawn amount = ₱2,345.40 \n What is asked? Remaining money in Marco's account.",
                        "2. Plan \n What is the operation to be used? Subtraction \n Number sentence? 8,500.75 − 2,345.40 = N",
                        "3. Solve the problem \n  8,500.75 \n- 2,345.40 \n  6,155.35",
                        "The money left in Marco's account is ₱6,155.35.",
                        "4. Check \n  6,155.35 \n+ 2,345.40 \n  8,500.75",
                        "The calculation is correct."
                    ),
                    answer = "₱6,155.35"
                ),

                Slide.PracticeSlide(
                    id = 8,
                    question = "Liza bought a bag of rice for ₱1,245.75. She paid with a ₱2,000.00 bill. How much change did she receive?",
                    options = listOf("₱754.25", "₱755.25", "₱745.25", "₱1,245.75"),
                    correctAnswer = 0,
                    explanation = "Correct answer: ₱754.25"
                ),

                Slide.PracticeSlide(
                    id = 9,
                    question = "Rafael bought 3.75 meters of fabric and later bought 2.45 meters more. How many meters of fabric does he have in total?",
                    options = listOf("5.90", "6.00", "5.80", "6.20"),
                    correctAnswer = 3,
                    explanation = "Correct answer: 6.20"
                ),

                Slide.SummarySlide(
                    id = 10,
                    title = "Summary",
                    keyPoints = listOf(
                        "To solve word problems with decimals, follow four steps:",
                        "Understand the given facts and what is asked",
                        "Plan the operation and write the number sentence",
                        "Solve the problem by performing the calculation",
                        "Check the answer to ensure it is correct"
                    )
                )
            )
        )
    }

    // LESSON 9 - SUBTOPIC 1: Multiplying Decimals
    private fun getQuarter1Lesson9Subtopic1(): InteractiveLesson {
        return InteractiveLesson(
            id = 17,
            title = "Multiplying Decimals",
            slides = listOf(
                Slide.IntroSlide(
                    id = 1,
                    title = "Hola!",
                    content = "In this topic, you will learn multiplying decimals. You will learn how to multiply decimals with up to 2 decimal places."
                ),

                Slide.ConceptSlide(
                    id = 2,
                    title = "How to Multiply Decimal?",
                    content = "To multiply decimals, ignore the decimal points and multiply the numbers like whole numbers. Then, count the total number of decimal places in both numbers and place the decimal in the answer.",
                    keyPoints = listOf()
                ),

                Slide.ConceptSlide(
                    id = 3,
                    title = "How to Multiply Decimals",
                    content = "",
                    keyPoints = listOf(
                        "Multiply decimals as if they are whole numbers",
                        "To place the decimal in the product, add the decimal places from both numbers"
                    )
                ),

                Slide.ExampleSlide(
                    id = 4,
                    title = "Example Problem",
                    problem = "Sophia spent 0.58 hours sewing an apron and 0.03 times as much time on the finishing touches. How long did she spend on the finishing touches?",
                    steps = listOf(
                        "0.58 × 0.03 → ignore decimals → 58 × 3 = 174"
                    ),
                    answer = ""
                ),

                Slide.ExampleSlide(
                    id = 5,
                    title = "Step 1: Multiply by the hundredths",
                    problem = "",
                    steps = listOf(
                        "    0.58\n × 0.03\n————————\n   174"
                    ),
                    answer = ""
                ),

                Slide.ExampleSlide(
                    id = 6,
                    title = "Step 2: Multiply by the tenths",
                    problem = "",
                    steps = listOf(
                        "    0.58\n × 0.03\n————————\n   174\n   000"
                    ),
                    answer = ""
                ),

                Slide.ExampleSlide(
                    id = 7,
                    title = "Step 3: Multiply by the ones",
                    problem = "",
                    steps = listOf(
                        "    0.58\n × 0.03\n————————\n   174\n   000\n   000"
                    ),
                    answer = ""
                ),

                Slide.ExampleSlide(
                    id = 8,
                    title = "Step 4: Add the partial products",
                    problem = "",
                    steps = listOf(
                        "    0.58 ← 2 decimal places\n × 0.03 ← 2 decimal places\n————————\n   174\n   000\n + 000\n————————\n 0.0174 ← 4 decimal places"
                    ),
                    answer = "It took Sophia 0.0174 hours to do the finishing touches on the apron"
                ),

                Slide.PracticeSlide(
                    id = 9,
                    question = "Practice time!\n\n    0.38\n × 0.04\n————————\n\nChoose your answer:",
                    options = listOf("0.0152", "0.1025", "0.0125", "0.2510"),
                    correctAnswer = 0,
                    explanation = "Correct! The answer is 0.0152"
                ),

                Slide.SummarySlide(
                    id = 10,
                    title = "Summary",
                    keyPoints = listOf(
                        "Key Points to Remember on multiplying decimal",
                        "Ignore the decimal points and multiply as if they are whole numbers",
                        "Place the decimal point in the product based on the total number of decimal places in the factors",
                        "In multiplying a decimal by a whole number, the number of decimal places in the product is the same as that in the decimal factor",
                        "Take note: Count the number of decimal places from the right"
                    )
                )
            )
        )
    }

    // LESSON 10 - SUBTOPIC 1: Multiplying Decimals by Powers of 10
    private fun getQuarter1Lesson10Subtopic1(): InteractiveLesson {
        return InteractiveLesson(
            id = 18,
            title = "Multiplying Decimals by Powers of 10",
            slides = listOf(
                Slide.IntroSlide(
                    id = 1,
                    title = "Hello!!",
                    content = "In this lesson, you will learn how to multiply decimals by powers of 10, both positive and negative by simply moving the decimal point."
                ),

                Slide.ConceptSlide(
                    id = 2,
                    title = "How can we multiply Decimals by a power of 10?",
                    content = "You can easily multiply by a power of 10 in your head by moving the decimal point left or right, depending on how many places you need to move. You can also estimate products by rounding each number to its highest place value.",
                    keyPoints = listOf()
                ),

                Slide.ExampleSlide(
                    id = 3,
                    title = "Example 1",
                    problem = "A plane travels at the rate of 0.15 kilometers per second. How far does it travel in 10 seconds? 100 seconds? 1000 seconds?",
                    steps = listOf(
                        "Multiply:",
                        "10 × 0.15 = 1.5\nMove the decimal point one step to the right",
                        "100 × 0.15 = 15\nMove the decimal point two steps to the right",
                        "1000 × 0.15 = 150\nMove the decimal point three steps to the right then add zeros if needed"
                    ),
                    answer = ""
                ),

                Slide.ConceptSlide(
                    id = 4,
                    title = "Multiplying by Exponent",
                    content = "The exponent of 10 indicates the number of times you have to move the decimal point to the right.",
                    keyPoints = listOf(
                        "10 × 0.15 = 1.5 or 10¹ × 0.15 = 1.5",
                        "100 × 0.15 = 15 or 10² × 0.15 = 15",
                        "1000 × 0.15 = 150 or 10³ × 0.15 = 150"
                    )
                ),

                Slide.ExampleSlide(
                    id = 5,
                    title = "Example 2",
                    problem = "A snail crawls at the rate of 0.08 kilometers per hour. How far does it travel in 10 hours, 100 hours, and 1000 hours?",
                    steps = listOf(
                        "Multiply:",
                        "10 × 0.08 = 0.8\nMove the decimal point one step to the right",
                        "100 × 0.08 = 8\nMove the decimal point two steps to the right",
                        "1000 × 0.08 = 80\nMove the decimal point three steps to the right then add zeros if needed"
                    ),
                    answer = ""
                ),

                Slide.ConceptSlide(
                    id = 6,
                    title = "Multiplying by Exponent",
                    content = "The exponent of 10 indicates the number of times you have to move the decimal point to the right.",
                    keyPoints = listOf(
                        "10 × 0.08 = 0.8 or 10¹ × 0.08 = 0.8",
                        "100 × 0.08 = 8 or 10² × 0.08 = 8",
                        "1000 × 0.08 = 80 or 10³ × 0.08 = 80"
                    )
                ),

                Slide.ConceptSlide(
                    id = 7,
                    title = "Multiplying by 0.1, 0.01, or 0.001 and Negative Exponent",
                    content = "In multiplying decimals by 0.1, 0.01, or 0.001, we count the numbers of zeros in 0.1, 0.01, or 0.001, then move the decimal point to the left based on the number of decimal places.",
                    keyPoints = listOf(
                        "Multiply:",
                        "8 × 0.1 = 0.8 or 8 × 10⁻¹",
                        "8 × 0.01 = 0.08 or 8 × 10⁻²",
                        "8 × 0.001 = 0.008 or 8 × 10⁻³",
                        "The negative exponent indicates the number of times you are going to move the decimal point to the left"
                    )
                ),

                Slide.PracticeSlide(
                    id = 8,
                    question = "100 × 0.10 = ?\n\nChoose your answer:",
                    options = listOf("0.10", "10", "0.100", "1.0"),
                    correctAnswer = 1,
                    explanation = "Correct! The answer is 10"
                ),

                Slide.PracticeSlide(
                    id = 9,
                    question = "10² × 0.15 = ?\n\nChoose your answer:",
                    options = listOf("20", "15", "10", "0.15"),
                    correctAnswer = 1,
                    explanation = "Correct! The answer is 15"
                ),

                Slide.PracticeSlide(
                    id = 10,
                    question = "30 × 10⁻¹ = ?\n\nChoose your answer:",
                    options = listOf("3.0", "30", "3", "0.30"),
                    correctAnswer = 2,
                    explanation = "Correct! The answer is 3"
                ),

                Slide.SummarySlide(
                    id = 11,
                    title = "Summary",
                    keyPoints = listOf(
                        "Multiplying decimals by powers of 10 is done by moving the decimal point: right for 10, 100, 1000, and left for 0.1, 0.01, 0.001",
                        "Positive exponents show how many places to move right; negative exponents show how many places to move left",
                        "You can also estimate products by rounding"
                    )
                )
            )
        )
    }

    // LESSON 11 - SUBTOPIC 1: Word Problems Involving Multiplying Decimals
    private fun getQuarter1Lesson11Subtopic1(): InteractiveLesson {
        return InteractiveLesson(
            id = 19,
            title = "Word Problems Involving Multiplying Decimals",
            slides = listOf(
                Slide.IntroSlide(
                    id = 1,
                    title = "Hi!!",
                    content = "By the end of this topic, you will be able to solve word problems involving multiplication of decimals in real-life situations using the 4-step method: Understand, Plan, Solve, and Check."
                ),

                Slide.ConceptSlide(
                    id = 2,
                    title = "Real-life Problems",
                    content = "Knowing the basic concepts and procedures for multiplying decimals in different ways, we can now solve real-life problems.",
                    keyPoints = listOf()
                ),

                Slide.ConceptSlide(
                    id = 3,
                    title = "Review: The 4-Step Method",
                    content = "",
                    keyPoints = listOf(
                        "Understand the problem and identify the given facts and what is being asked",
                        "Plan your solution, know the operation you will use and make the number sentence",
                        "Solve the problem",
                        "Check your answer"
                    )
                ),

                Slide.ExampleSlide(
                    id = 4,
                    title = "Example Problem",
                    problem = "Mr. Fernandez has a monthly pay of ₱5,450. The tax deducted from his monthly salary is ₱543.25. What is the actual pay he receives in a year?",
                    steps = listOf(
                        "1. Understand\nWhat are the given facts? Monthly salary ₱5,450, Tax ₱543.25 and 12 months in a year\nWhat is asked? The actual payment Mr. Fernandez receives in a year",
                        "2. Plan\nWhat is the operation to be used? Multiplication and Subtraction\nNumber sentence? (₱5,450 - ₱543.25) × 12 = N"
                    ),
                    answer = ""
                ),

                Slide.ExampleSlide(
                    id = 5,
                    title = "3. Solve the problem",
                    problem = "",
                    steps = listOf(
                        "    5,450.00\n -    543.25\n————————\n  4,906.75",
                        "  4,906.75\n ×       12\n————————\n   981350\n   490675\n————————\n 58,881.00"
                    ),
                    answer = "He receives ₱58,881.00 in a year"
                ),

                Slide.ExampleSlide(
                    id = 6,
                    title = "4. Check",
                    problem = "",
                    steps = listOf(
                        " 58,881.00\n ÷       12\n————————\n  4,906.75"
                    ),
                    answer = "He receives ₱4,906.75 per month from his salary"
                ),

                Slide.ExampleSlide(
                    id = 7,
                    title = "Example Problem 2",
                    problem = "Ms. Reyes has a monthly salary of ₱7,200. A tax of ₱850.50 is deducted from her monthly pay. What is her actual pay for the year?",
                    steps = listOf(
                        "1. Understand\nWhat are the given facts? Monthly salary = ₱7,200, Tax = ₱850.50, 12 months in a year\nWhat is asked? Actual yearly pay",
                        "2. Plan\nWhat is the operation to be used? Multiplication and Subtraction\nNumber sentence? (₱7,200 - ₱850.50) × 12 = N"
                    ),
                    answer = ""
                ),

                Slide.ExampleSlide(
                    id = 8,
                    title = "3. Solve the problem",
                    problem = "",
                    steps = listOf(
                        "Subtract the tax from the monthly salary:\n  7,200.00\n -   850.50\n————————\n  6,349.50",
                        "Multiply the net monthly pay by 12 to get the yearly pay:\n  6,349.50\n ×       12\n————————\n  1269900\n   634950\n————————\n 76,194.00"
                    ),
                    answer = "Ms. Reyes receives ₱76,194.00 in a year"
                ),

                Slide.ExampleSlide(
                    id = 9,
                    title = "4. Check",
                    problem = "",
                    steps = listOf(
                        " 76,194.00\n ÷       12\n————————\n  6,349.50"
                    ),
                    answer = "Matches her net monthly pay"
                ),

                Slide.ConceptSlide(
                    id = 10,
                    title = "Creating Own Problems",
                    content = "Once you master solving routine and non-routine problems, you can also create your own problems by providing the necessary facts or data. When making word problems, ensure that you include all the information needed to solve them.",
                    keyPoints = listOf()
                ),

                Slide.PracticeSlide(
                    id = 11,
                    question = "A juice company bottles 3.5 liters of juice in each container. If they produce 8 containers, how many liters of juice do they have in total?\n\nChoose your answer:",
                    options = listOf("24.5 liters", "28.0 liters", "27.5 liters", "30.0 liters"),
                    correctAnswer = 1,
                    explanation = "Correct! The answer is 28.0 liters"
                ),

                Slide.SummarySlide(
                    id = 12,
                    title = "Summary",
                    keyPoints = listOf(
                        "Word problems with decimals can represent real-life situations like salaries, sales, and production",
                        "Use the 4-step method to solve:",
                        "Understand the problem and identify the given facts and what is asked",
                        "Plan the solution by choosing the correct operation and writing the number sentence",
                        "Solve the problem using multiplication (and other operations if needed)",
                        "Check the answer to ensure it is correct"
                    )
                )
            )
        )
    }

    // LESSON 12 - SUBTOPIC 1: Steps to Understand and Solve Word Problems
    private fun getQuarter1Lesson12Subtopic1(): InteractiveLesson {
        return InteractiveLesson(
            id = 20,
            title = "Steps to Understand and Solve Word Problems",
            slides = listOf(
                Slide.IntroSlide(
                    id = 1,
                    title = "Hello there!",
                    content = "In this topic, you should be able to solve multi-step problems that involve multiplying and adding or subtracting decimals, mixed decimals, and whole numbers, including money, using the appropriate problem-solving strategies and tools."
                ),

                Slide.ConceptSlide(
                    id = 2,
                    title = "Multi-step Word Problems",
                    content = "Multi-step word problems are combinations of fundamental operations, which include hidden questions. When solving routine problems, you can use at least one of the four basic math operations (addition, subtraction, multiplication, and division).",
                    keyPoints = listOf()
                ),

                Slide.ConceptSlide(
                    id = 3,
                    title = "In problem solving, there are steps to follow:",
                    content = "",
                    keyPoints = listOf(
                        "Identify the given facts",
                        "Understand what is asked",
                        "Determine the operation and the number sentence",
                        "Solve it",
                        "Check your work"
                    )
                ),

                Slide.ExampleSlide(
                    id = 4,
                    title = "Example Problem",
                    problem = "Mr. Reyes earns ₱28.50 per hour as an office clerk. He earns 1.75 times as his regular rate for overtime. His regular work is 40 hours per week. He gets overtime pay if he works more than 40 hours. How much is his total earnings if he works 45 hours in one week?",
                    steps = listOf(),
                    answer = ""
                ),

                Slide.ExampleSlide(
                    id = 5,
                    title = "1. Understand",
                    problem = "",
                    steps = listOf(
                        "What are the given facts?\n₱28.50 per hour, 1.75 times, 40 hours per week, 45 hours in one week",
                        "What is asked?\nThe total earnings of Mr. Reyes for working 45 hours in one week"
                    ),
                    answer = ""
                ),

                Slide.ExampleSlide(
                    id = 6,
                    title = "2. Plan",
                    problem = "",
                    steps = listOf(
                        "What is the operation to be used?\nMultiplication and Addition",
                        "Number sentence?\n(₱28.50 × 40) + (1.75 × ₱28.50 × 5) = N"
                    ),
                    answer = ""
                ),

                Slide.ExampleSlide(
                    id = 7,
                    title = "3. Solve the problem",
                    problem = "",
                    steps = listOf(
                        "Regular working hours\n   28.50\n ×    40\n————————\n      00\n  11400\n————————\n₱1,140",
                        "Overtime rate\n    1.75\n × 28.50\n————————\n   00000\n     875\n   1400\n    350\n————————\n  49.875"
                    ),
                    answer = ""
                ),

                Slide.ExampleSlide(
                    id = 8,
                    title = "3. Solve the problem (continued)",
                    problem = "",
                    steps = listOf(
                        "  49.875\n ×      5\n————————\n ₱249.40",
                        "Total salary\n 1,140.00\n +  249.40\n————————\n₱1,389.40"
                    ),
                    answer = "Mr. Reyes earned ₱1,389.40 in 45 hours in one week"
                ),

                Slide.ExampleSlide(
                    id = 9,
                    title = "4. Check",
                    problem = "",
                    steps = listOf(
                        "Regular working hours\n  1,140\n ÷ 28.50\n————————\n     40",
                        "Overtime rate\n  249.40\n ÷      5\n————————\n  49.875"
                    ),
                    answer = ""
                ),

                Slide.ExampleSlide(
                    id = 10,
                    title = "4. Check (continued)",
                    problem = "",
                    steps = listOf(
                        "  49.875\n ÷ 28.50\n————————\n   1.75",
                        " 1,389.40\n -  249.40\n————————\n₱1,140.00"
                    ),
                    answer = "In his regular work, Mr. Reyes earned ₱1,140.00 in just 40 hours in one week"
                ),

                Slide.ExampleSlide(
                    id = 11,
                    title = "Example Problem 2",
                    problem = "Ms. Pina earns ₱35.00 per hour as a sales assistant. She earns 1.5 times her regular rate for overtime. Her regular work is 40 hours per week. She worked 46 hours in one week. How much is her total earnings for that week?",
                    steps = listOf(),
                    answer = ""
                ),

                Slide.ExampleSlide(
                    id = 12,
                    title = "1. Understand",
                    problem = "",
                    steps = listOf(
                        "What are the given facts?\n₱35.00 per hour, 1.5 times for overtime, 40 hours regular work, 46 hours worked",
                        "What is asked?\nTotal earnings for 46 hours"
                    ),
                    answer = ""
                ),

                Slide.ExampleSlide(
                    id = 13,
                    title = "2. Plan",
                    problem = "",
                    steps = listOf(
                        "What is the operation to be used?\nMultiplication and Addition",
                        "Number sentence?\n(₱35 × 40) + (1.5 × ₱35 × 6) = N"
                    ),
                    answer = ""
                ),

                Slide.ExampleSlide(
                    id = 14,
                    title = "3. Solve the problem",
                    problem = "",
                    steps = listOf(
                        "Regular working hours\n    35\n ×   40\n————————\n    00\n   140\n————————\n₱1,400",
                        "Overtime rate\n   1.5\n ×  35\n————————\n    75\n    45\n————————\n  52.5"
                    ),
                    answer = ""
                ),

                Slide.ExampleSlide(
                    id = 15,
                    title = "3. Solve the problem (continued)",
                    problem = "",
                    steps = listOf(
                        "   52.5\n ×    6\n————————\n ₱315.0",
                        "Total salary\n 1,400\n +  315\n————————\n₱1,715.00"
                    ),
                    answer = "Ms. Pina earned ₱1,715.00 in one week"
                ),

                Slide.ExampleSlide(
                    id = 16,
                    title = "4. Check",
                    problem = "",
                    steps = listOf(
                        "Regular working hours\n 1,400\n ÷   35\n————————\n    40",
                        "Overtime rate\n   315\n ÷    6\n————————\n 52.50\n ÷   35\n————————\n   1.5"
                    ),
                    answer = ""
                ),

                Slide.PracticeSlide(
                    id = 17,
                    question = "Practice time!\n\nWord problem:\nMrs. Cortez works as a cashier and earns ₱32.00 per hour. For overtime work, she is paid 1.5 times her regular hourly rate. She normally works 40 hours per week but worked 47 hours this week.\n\nChoose your answer:",
                    options = listOf("₱1,661.00", "₱1,616.00", "₱1,166.00", "₱1,116.00"),
                    correctAnswer = 1,
                    explanation = "Correct! The answer is ₱1,616.00"
                ),

                Slide.SummarySlide(
                    id = 18,
                    title = "Summary",
                    keyPoints = listOf(
                        "Multi-step word problems are combinations of fundamental operations, which include hidden questions",
                        "When solving routine problems, you can use at least one of the four basic math operations (addition, subtraction, multiplication, and division)",
                        "Take note: Once you master solving and analyzing problems, you'll be able to answer them quickly even without following the steps. With strong critical thinking skills and the ability to solve problems, you can also create your own problems"
                    )
                )
            )
        )
    }

    // LESSON 13 - SUBTOPIC 1: Dividing Whole and Decimals Numbers
    private fun getQuarter1Lesson13Subtopic1(): InteractiveLesson {
        return InteractiveLesson(
            id = 21,
            title = "Dividing Whole and Decimal Numbers",
            slides = listOf(
                Slide.IntroSlide(
                    id = 1,
                    title = "Heyyy!!",
                    content = "In this topic, you will learn how to divide decimals and mixed decimals by other decimals."
                ),

                Slide.ConceptSlide(
                    id = 2,
                    title = "Decimal",
                    content = "The word \"decimal\" comes from the Latin word \"decima\", which means \"tenth part.\"",
                    keyPoints = listOf()
                ),

                Slide.ConceptSlide(
                    id = 3,
                    title = "Understanding Decimals",
                    content = "Even though we use different notations, we're still looking at nonnegative rational numbers. You can divide decimals using either the fraction method or the decimal method, just like you do with multiplication.",
                    keyPoints = listOf()
                ),

                Slide.ConceptSlide(
                    id = 4,
                    title = "How do we divide with decimals?",
                    content = "How can we divide decimals or mixed decimals by other decimals? Here are the steps to divide mixed decimals by decimals.",
                    keyPoints = listOf()
                ),

                Slide.ExampleSlide(
                    id = 5,
                    title = "Example: 0.25 divided by 0.5",
                    problem = "",
                    steps = listOf(
                        "Step 1: Make the divisor a whole number by multiplying it by 10, or just move the decimal point one (1) decimal place to the right to make the divisor a whole number",
                        "Step 2: Multiply 0.25 by 10 also, or move the decimal point in the division as many places as in the divisor\n\n0.5 = 5 and 0.25 = 2.5",
                        "Take note: What we do with the divisor, we do the same with the dividend"
                    ),
                    answer = ""
                ),

                Slide.ExampleSlide(
                    id = 6,
                    title = "Example: 0.25 divided by 0.5",
                    problem = "0.5 = 5 and 0.25 = 2.5",
                    steps = listOf(
                        "Step 3: Divide just like whole numbers. Put the decimal point of the quotient just above the decimal point of the dividend"
                    ),
                    answer = ""
                ),

                Slide.ExampleSlide(
                    id = 7,
                    title = "Step 4: Check",
                    problem = "Multiply the quotient and the divisor like multiplying a whole number. Put the decimal point in the product as the same number of decimal places in the quotient.",
                    steps = listOf(
                        "  0.5\n × 5\n————\n  2.5"
                    ),
                    answer = ""
                ),

                Slide.ConceptSlide(
                    id = 8,
                    title = "Steps for Dividing Decimals",
                    content = "In dividing decimal/mixed decimal by decimals, we have to use the following steps:\n\nFirst, change the divisor to a whole number by moving the decimal point to the rightmost place, or multiply it by 10 if only one decimal place or 100 if two decimal places.\n\nSecond, move the decimal point in the dividend to as many places as the decimal point in the divisor is moved, or multiply it also by 10 or 100.\n\nTake note: What we do with the divisor, we do the same to the dividend.\n\nThird, insert zeros to the dividend when needed.",
                    keyPoints = listOf()
                ),

                Slide.ExampleSlide(
                    id = 9,
                    title = "Another Example: 2.4 ÷ 0.3 = ?",
                    problem = "",
                    steps = listOf(
                        "Step 1: Make the divisor a whole number by moving the decimal one place to the right:\n0.3 → 3",
                        "Step 2: Move the decimal in the dividend the same number of places:\n2.4 → 24",
                        "Step 3: Divide like whole numbers:\n24 ÷ 3 = 8"
                    ),
                    answer = ""
                ),

                Slide.PracticeSlide(
                    id = 10,
                    question = "Practice Time!!\n\n5.2 ÷ 0.4 = ?\n\nChoose your answer:",
                    options = listOf("13", "5", "6", "12"),
                    correctAnswer = 0,
                    explanation = "Correct! The answer is 13"
                ),

                Slide.SummarySlide(
                    id = 11,
                    title = "Summary",
                    keyPoints = listOf(
                        "To divide decimals: make the divisor a whole number, move the decimal in the dividend the same number of places, then divide like whole numbers. Check by multiplying the quotient by the divisor"
                    )
                )
            )
        )
    }

    // LESSON 14 - SUBTOPIC 1: Dividing Decimals by 10
    private fun getQuarter1Lesson14Subtopic1(): InteractiveLesson {
        return InteractiveLesson(
            id = 22,
            title = "Dividing Decimals by 10, 100, and 1,000",
            slides = listOf(
                Slide.IntroSlide(
                    id = 1,
                    title = "Bonjour!",
                    content = "In this topic, you will learn how to divide decimals by 10 and more. You will understand how to divide decimals with up to four decimal places by 0.1, 0.01, and 0.001, and decimals with up to two decimal places by 10, 100, and 1,000 in your head."
                ),

                Slide.ConceptSlide(
                    id = 2,
                    title = "How to divide decimals by 10?",
                    content = "To divide a decimal by 10, move the decimal point one place to the left. This makes the number ten times smaller. The same rule applies for 100 or 1,000 by moving the decimal two or three places to the left.",
                    keyPoints = listOf()
                ),

                Slide.ConceptSlide(
                    id = 3,
                    title = "Dividing by 0.1, 0.01, 0.001",
                    content = "Probably you are wondering about the steps in dividing numbers by 0.1, 0.01, 0.001, and 0.0001. Notice that it is the same as multiplying by 10, 100, 1000, and 10,000.\n\nExample: Let us divide 0.5 by 0.1, 0.01, and 0.001.",
                    keyPoints = listOf()
                ),

                Slide.ExampleSlide(
                    id = 4,
                    title = "Example: Let us divide 0.5 by 0.1",
                    problem = "Division of a number or decimal by 0.1 is actually the movement of 1 decimal place to the right of the dividend and divisor.",
                    steps = listOf(),
                    answer = ""
                ),

                Slide.ExampleSlide(
                    id = 5,
                    title = "Example: Let us divide 0.5 by 0.01",
                    problem = "Division of a number or decimal by 0.01 is actually the movement of 2 decimal places to the right of the dividend and divisor.",
                    steps = listOf(),
                    answer = ""
                ),

                Slide.ExampleSlide(
                    id = 6,
                    title = "Example: Let us divide 0.5 by 0.001",
                    problem = "Division of a number or decimal by 0.001 is actually the movement of 3 decimal places to the right of the dividend and divisor.",
                    steps = listOf(),
                    answer = ""
                ),

                Slide.ConceptSlide(
                    id = 7,
                    title = "Mental Division by 10, 100, 1000",
                    content = "How do we mentally divide decimals by 10, 100, or 1000? To what direction do we move the decimal point?",
                    keyPoints = listOf(
                        "When dividing by 10, move the decimal 1 place to the left",
                        "When dividing by 100, move the decimal 2 places to the left",
                        "When dividing by 1000, move the decimal 3 places to the left"
                    )
                ),

                Slide.PracticeSlide(
                    id = 8,
                    question = "Practice time!\n\nSolve: 0.4235 ÷ 10\n\nChoose your answer:",
                    options = listOf("0.004235", "0.0004235", "0.04235", "4.235"),
                    correctAnswer = 2,
                    explanation = "Correct! The answer is 0.04235"
                ),

                Slide.SummarySlide(
                    id = 9,
                    title = "Summary",
                    keyPoints = listOf(
                        "Key Points to Remember",
                        "Dividing a decimal by 10 → move the decimal 1 place to the left",
                        "Dividing by 100 → move the decimal 2 places to the left",
                        "Dividing by 1,000 → move the decimal 3 places to the left",
                        "Dividing by 0.1, 0.01, or 0.001 is the same as multiplying by 10, 100, or 1,000"
                    )
                )
            )
        )
    }

    // LESSON 15 - SUBTOPIC 1: Rational and Irrational Numbers
    private fun getQuarter1Lesson15Subtopic1(): InteractiveLesson {
        return InteractiveLesson(
            id = 23,
            title = "Rational and Irrational Numbers",
            slides = listOf(
                Slide.IntroSlide(
                    id = 1,
                    title = "Welcome!",
                    content = "In this topic, you will learn to identify the rational and irrational numbers. You will understand how to identify the difference between those types of numbers."
                ),

                Slide.ConceptSlide(
                    id = 2,
                    title = "Rational number",
                    content = "A rational number is one that can be written as a fraction or a decimal. When written as a decimal, it either stops or repeats a pattern. This includes all integers, both positive and negative, as well as zero.\n\nExamples are: -3, -2, -1, 0, 2, 1, 1.111, 2, 3.333…",
                    keyPoints = listOf()
                ),

                Slide.ConceptSlide(
                    id = 3,
                    title = "Irrational number",
                    content = "An irrational number is a number that, when written as a decimal, goes on forever without stopping or repeating. It can't be written as a fraction and cannot be expressed as a quotient of two integers. The decimal form of an irrational number does not terminate or repeat. The square roots of numbers that aren't perfect squares are considered irrational numbers.\n\nExamples are: √2, √3, √5",
                    keyPoints = listOf()
                ),

                Slide.PracticeSlide(
                    id = 4,
                    question = "Practice time!\n\nIdentify if the given is Rational or Irrational\n5.254\n\nChoose your answer:",
                    options = listOf("Rational", "Irrational"),
                    correctAnswer = 0,
                    explanation = "Correct! The answer is Rational"
                ),

                Slide.SummarySlide(
                    id = 5,
                    title = "Summary",
                    keyPoints = listOf(
                        "Key points to remember",
                        "Rational numbers can be written as fractions or decimals that terminate or repeat",
                        "Irrational numbers cannot be written as fractions and have decimals that never end or repeat"
                    )
                )
            )
        )
    }

    // LESSON 15 - SUBTOPIC 2: Terminating and Repeating Decimals
    private fun getQuarter1Lesson15Subtopic2(): InteractiveLesson {
        return InteractiveLesson(
            id = 24,
            title = "Terminating and Repeating Decimals",
            slides = listOf(
                Slide.IntroSlide(
                    id = 1,
                    title = "Welcome Back!",
                    content = "In this topic, you will learn how to identify the terminating decimal and repeating or non-terminating decimals. You will understand the difference between the two."
                ),

                Slide.ConceptSlide(
                    id = 2,
                    title = "What is the Terminating decimal?",
                    content = "\"Terminate\" means end or stop. A terminating decimal has a set number of digits and ends after the decimal point. It is a type of rational number. Divide the numerator by the denominator. If the result has no remainder, the decimal terminates.\n\nExample are: 0.87, 82.25, 9.527, 224.9803",
                    keyPoints = listOf()
                ),

                Slide.ConceptSlide(
                    id = 3,
                    title = "What is Repeating or Non-terminating decimals?",
                    content = "Has infinite digits that go on forever. Some digits may start repeating. Divide the numerator by the denominator. If the remainder repeats, the decimal is repeating/non-terminating. This type of decimal can also be written as a fraction.\n\nExample: 0.333..., 0.00111..., and 1.234234…",
                    keyPoints = listOf()
                ),

                Slide.ConceptSlide(
                    id = 4,
                    title = "Vinculum",
                    content = "A Vinculum is a horizontal line over digits to show they repeat indefinitely.\n\nExample with Vinculum:\n0.333… → 0.3̅\n\nThe line over the 3 shows it repeats forever, making it a repeating decimal.",
                    keyPoints = listOf()
                ),

                Slide.PracticeSlide(
                    id = 5,
                    question = "Practice time!\n\nIdentify the decimal if terminating or repeating (non-terminating)\n2.125\n\nChoose your answer:",
                    options = listOf("Terminating", "Repeating (Non-terminating)"),
                    correctAnswer = 0,
                    explanation = "Correct! The answer is Terminating"
                ),

                Slide.SummarySlide(
                    id = 6,
                    title = "Summary",
                    keyPoints = listOf(
                        "Key points to remember:",
                        "Terminating Decimal:\nEnds after a certain number of digits. Can be written as a fraction",
                        "Repeating (Non-terminating) Decimal:\nGoes on forever; some digits repeat. Can also be written as a fraction",
                        "Vinculum: A line over digits to show repetition in a repeating decimal"
                    )
                )
            )
        )
    }

    // LESSON 16 - SUBTOPIC 1: Routine and Non-routine Problems Involving Division of Decimals and Money
    private fun getQuarter1Lesson16Subtopic1(): InteractiveLesson {
        return InteractiveLesson(
            id = 25,
            title = "Routine and Non-routine Problems: Division of Decimals and Money",
            slides = listOf(
                Slide.IntroSlide(
                    id = 1,
                    title = "Welcome!!",
                    content = "By the end of this lesson, you will be able to solve routine and non-routine word problems involving division of decimals and money using the 4-step problem-solving method: Understand, Plan, Solve, and Check."
                ),

                Slide.ConceptSlide(
                    id = 2,
                    title = "Steps in Problem-Solving",
                    content = "When solving routine and non-routine problems, it's important to follow the different steps in problem-solving.",
                    keyPoints = listOf(
                        "Understand the Problem",
                        "Plan",
                        "Solve the Problem",
                        "Check"
                    )
                ),

                Slide.ExampleSlide(
                    id = 3,
                    title = "Example of solving division problem",
                    problem = "Kimberly and Zenaida bought 7 books and 3 calculators for a total of ₱3,500. If each book costs ₱200, what is the cost of each calculator?",
                    steps = listOf(
                        "Understand\nWhat are the given facts? Total cost for: ₱3,500. Kimberly and Zenaida bought 7 books and 3 calculators. Each book costs ₱200\nWhat is asked? The cost of each calculator",
                        "Plan\nOperation? Division, Multiplication and subtraction\nNumber Sentence? (7 × 200) + (3 × cost of each calculator) = 3,500"
                    ),
                    answer = ""
                ),

                Slide.ExampleSlide(
                    id = 4,
                    title = "Solve the Problem",
                    problem = "Solution:",
                    steps = listOf(
                        "Calculate the total cost of the books:\n7 × 200 = 1,400",
                        "Subtract this from the total amount to find the cost for calculators:\n3,500 − 1,400 = 2,100",
                        "Divide by the number of calculators to find the cost of each one:\n2,100 ÷ 3 = 700"
                    ),
                    answer = "Each calculator costs ₱700.00"
                ),

                Slide.ExampleSlide(
                    id = 5,
                    title = "Check your answer",
                    problem = "Check if your answer is right\nVerify by adding the costs:",
                    steps = listOf(
                        "Total for books: 7 × 200 = 1,400",
                        "Total for calculators: 3 × 700 = 2,100",
                        "Sum: 1,400 + 2,100 = 3,500"
                    ),
                    answer = ""
                ),

                Slide.ExampleSlide(
                    id = 6,
                    title = "Example of solving division problem 2",
                    problem = "Marco bought 5 notebooks and 4 pens for a total of ₱1,650. If each notebook costs ₱200, what is the cost of each pen?",
                    steps = listOf(
                        "1. Understand\nWhat are the given facts? Total cost = ₱1,650, bought 5 notebooks and 4 pens, each notebook costs ₱200\nWhat is asked? Cost of each pen",
                        "2. Plan\nOperation? Division, Multiplication and Subtraction\nNumber Sentence? (5 × 200) + (4 × cost of each pen) = 1,650"
                    ),
                    answer = ""
                ),

                Slide.ExampleSlide(
                    id = 7,
                    title = "Solve the Problem",
                    problem = "Solution:",
                    steps = listOf(
                        "Calculate the total cost of the notebooks:\n5 × 200 = ₱1,000",
                        "Subtract this from the total amount to find the total cost for the pens:\n1,650 − 1,000 = ₱650",
                        "Divide by the number of pens to find the cost of each pen:\n650 ÷ 4 = ₱162.50"
                    ),
                    answer = "Each pen costs ₱162.50"
                ),

                Slide.ExampleSlide(
                    id = 8,
                    title = "Check your answer",
                    problem = "",
                    steps = listOf(
                        "Total for notebooks: 5 × 200 = 1,000",
                        "Total for pens: 4 × 162.50 = 650",
                        "Sum: 1,000 + 650 = 1,650"
                    ),
                    answer = ""
                ),

                Slide.PracticeSlide(
                    id = 9,
                    question = "Practice Time!!\n\nMiguel bought 12 notebooks and 4 pens for a total of ₱1,800. If each notebook costs ₱100, what is the cost of each pen?\n\nChoose your answer:",
                    options = listOf("₱100", "₱125", "₱200", "₱150"),
                    correctAnswer = 3,
                    explanation = "Correct! The answer is ₱150"
                ),

                Slide.SummarySlide(
                    id = 10,
                    title = "Summary",
                    keyPoints = listOf(
                        "Solve division problems with decimals and money by first understanding the facts and what is asked",
                        "Plan your steps, calculate carefully, and check your answer",
                        "This method sometimes helps you find prices of individual items from a total cost"
                    )
                )
            )
        )
    }

    // LESSON 16 - SUBTOPIC 2: Step-by-Step Procedure in Problem Solving
    private fun getQuarter1Lesson16Subtopic2(): InteractiveLesson {
        return InteractiveLesson(
            id = 26,
            title = "Step-by-Step Procedure in Problem Solving",
            slides = listOf(
                Slide.IntroSlide(
                    id = 1,
                    title = "Hello!!",
                    content = "By the end of this topic, you will be able to solve routine and non-routine word problems involving division of decimals and money, using the 4-step method: Understand, Plan, Solve, and Check."
                ),

                Slide.ConceptSlide(
                    id = 2,
                    title = "Let's recall!!",
                    content = "Steps in problem-solving:",
                    keyPoints = listOf(
                        "Understand: What is asked, and what are the given facts?",
                        "Plan: What operation is to be used, and what is the number sentence?",
                        "Solve: Find the answer to the problem",
                        "Check: Look back and check if the answer is correct"
                    )
                ),

                Slide.ExampleSlide(
                    id = 3,
                    title = "Example problem",
                    problem = "Josie has ₱1,200. She wants to buy markers that cost ₱47.50 each. After buying as many as she can, how much money will she have left?",
                    steps = listOf(
                        "Understand\nWhat are the given facts? Total money: ₱1,200, Cost per marker: ₱47.50\nWhat is asked? How many markers Josie can buy and the remaining amount",
                        "Plan\nOperation? Division, Multiplication and subtraction\nNumber Sentence? 1,200 ÷ 47.50 = N"
                    ),
                    answer = ""
                ),

                Slide.ExampleSlide(
                    id = 4,
                    title = "Solve the Problem",
                    problem = "Solution:",
                    steps = listOf(
                        "First, divide: 1,200 ÷ 47.50 = 25.26",
                        "So, Josie can buy 25 markers (rounding down to the nearest whole number)",
                        "Total cost for 25 markers: 25 × 47.50 = 1,187.50",
                        "Remaining money: 1,200 − 1,187.50 = 12.5"
                    ),
                    answer = "Josie can buy 25 markers and will have ₱12.50 left"
                ),

                Slide.ExampleSlide(
                    id = 5,
                    title = "Check",
                    problem = "To verify, add the total cost of the markers purchased to the remaining money:",
                    steps = listOf(
                        "Total cost of 25 markers: 25 × 47.50 = ₱1,187.50",
                        "Remaining money: ₱12.50",
                        "Add them together: ₱1,187.50 + ₱12.50 = ₱1,200"
                    ),
                    answer = "The total matches Josie's original amount, so the solution is correct"
                ),

                Slide.PracticeSlide(
                    id = 6,
                    question = "Practice Time!!\n\nBen has ₱500. He wants to buy notebooks that cost ₱75 each. After buying as many notebooks as he can, how much money will he have left?\n\nChoose your answer:",
                    options = listOf("₱25", "₱50", "₱75", "₱100"),
                    correctAnswer = 1,
                    explanation = "Correct! The answer is ₱50"
                ),

                Slide.SummarySlide(
                    id = 7,
                    title = "Summary",
                    keyPoints = listOf(
                        "To solve problems with money and decimals involving division and other operations:",
                        "Understand the given facts and what is asked",
                        "Plan the operations needed and write the number sentence",
                        "Solve step by step",
                        "Check the answer",
                        "This method helps find the cost of individual items from a total, as well as remaining money after purchases"
                    )
                )
            )
        )
    }

    // LESSON 17 - SUBTOPIC 1: Routine and Non-routine Problems with All Operations
    private fun getQuarter1Lesson17Subtopic1(): InteractiveLesson {
        return InteractiveLesson(
            id = 27,
            title = "Routine and Non-routine Problems: All Operations with Decimals, Whole Numbers, and Money",
            slides = listOf(
                Slide.IntroSlide(
                    id = 1,
                    title = "Welcome!",
                    content = "This topic will help you solve complex, multi-step problems involving division with decimals, whole numbers, and money. You'll learn to apply effective problem-solving strategies and tools, building confidence to tackle real-world problems with these operations."
                ),

                Slide.ConceptSlide(
                    id = 2,
                    title = "Problem-Solving Steps",
                    content = "The problem-solving steps you've learned in previous lessons will assist you in handling different types of multi-step routine and non-routine problems.",
                    keyPoints = listOf()
                ),

                Slide.ConceptSlide(
                    id = 3,
                    title = "Addition",
                    content = "Example word problem:\nRica has ₱50 in her wallet. She finds another ₱15.75 in her coat pocket. How much money does she have now?",
                    keyPoints = listOf()
                ),

                Slide.ExampleSlide(
                    id = 4,
                    title = "Understand",
                    problem = "",
                    steps = listOf(
                        "What are the given facts?\nRica had ₱50.00 in her wallet, she found ₱15.75 in her coat pocket",
                        "What is asked?\nThe total amount Rica has"
                    ),
                    answer = ""
                ),

                Slide.ExampleSlide(
                    id = 5,
                    title = "2. Plan",
                    problem = "",
                    steps = listOf(
                        "What is the operation to be used?\nAddition",
                        "Number sentence?\n50.00 + 15.75 = N"
                    ),
                    answer = ""
                ),

                Slide.ExampleSlide(
                    id = 6,
                    title = "3. Solve the problem",
                    problem = "",
                    steps = listOf(
                        "50.00 + 15.75 = 65.75"
                    ),
                    answer = "The total amount Rica has is ₱65.75"
                ),

                Slide.ExampleSlide(
                    id = 7,
                    title = "4. Check",
                    problem = "",
                    steps = listOf(
                        "65.75 - 15.75 = 50"
                    ),
                    answer = "Therefore, if she didn't find ₱15.75 in her coat pocket she only had ₱50.00"
                ),

                Slide.ConceptSlide(
                    id = 8,
                    title = "Subtraction",
                    content = "Example word problem:\nJayvin bought a coffee for ₱145.00. He paid with a ₱200.00 bill. How much change did he get?",
                    keyPoints = listOf()
                ),

                Slide.ExampleSlide(
                    id = 9,
                    title = "Understand",
                    problem = "",
                    steps = listOf(
                        "What are the given facts?\nJayvin bought a coffee for ₱145.00, He paid with a ₱200.00 bill",
                        "What is asked?\nThe total amount of Jayvin's change"
                    ),
                    answer = ""
                ),

                Slide.ExampleSlide(
                    id = 10,
                    title = "2. Plan",
                    problem = "",
                    steps = listOf(
                        "What is the operation to be used?\nSubtraction",
                        "Number sentence?\n200.00 - 145.00 = N"
                    ),
                    answer = ""
                ),

                Slide.ExampleSlide(
                    id = 11,
                    title = "3. Solve the problem",
                    problem = "",
                    steps = listOf(
                        "200.00 - 145.00 = 55"
                    ),
                    answer = "The total amount of Jayvin's change is ₱55"
                ),

                Slide.ExampleSlide(
                    id = 12,
                    title = "4. Check",
                    problem = "",
                    steps = listOf(
                        "145.00 + 55.00 = 200"
                    ),
                    answer = "Therefore, Jayvin's payment is ₱200.00"
                ),

                Slide.ConceptSlide(
                    id = 13,
                    title = "Multiplication",
                    content = "Example word problem:\nBlake bought 3 books. Each book costs ₱175.75. How much did he spend in total?",
                    keyPoints = listOf()
                ),

                Slide.ExampleSlide(
                    id = 14,
                    title = "Understand",
                    problem = "",
                    steps = listOf(
                        "What are the given facts?\nBlake bought 3 books, Each book costs ₱175.75",
                        "What is asked?\nThe total amount Blake spent in buying 3 books"
                    ),
                    answer = ""
                ),

                Slide.ExampleSlide(
                    id = 15,
                    title = "Plan",
                    problem = "",
                    steps = listOf(
                        "What is the operation to be used?\nMultiplication",
                        "Number sentence?\n175.75 × 3 = N"
                    ),
                    answer = ""
                ),

                Slide.ExampleSlide(
                    id = 16,
                    title = "3. Solve the problem",
                    problem = "",
                    steps = listOf(
                        "175.75 × 3 = 527.25"
                    ),
                    answer = "The total amount Blake spent in buying 3 books is ₱527.25"
                ),

                Slide.ExampleSlide(
                    id = 17,
                    title = "4. Check",
                    problem = "",
                    steps = listOf(
                        "527.25 ÷ 3 = 175.75"
                    ),
                    answer = "Therefore, each book costs ₱175.75"
                ),

                Slide.ConceptSlide(
                    id = 18,
                    title = "Division",
                    content = "Example word problem:\nSarah has ₱66.00 and wants to buy notebooks that each cost ₱2.75. How many notebooks can she buy with her money?",
                    keyPoints = listOf()
                ),

                Slide.ExampleSlide(
                    id = 19,
                    title = "Understand",
                    problem = "",
                    steps = listOf(
                        "What are the given facts?\nSarah has ₱66.00, Each notebook costs ₱2.75",
                        "What is asked?\nThe number of notebooks Sarah can buy"
                    ),
                    answer = ""
                ),

                Slide.ExampleSlide(
                    id = 20,
                    title = "2. Plan",
                    problem = "",
                    steps = listOf(
                        "What is the operation to be used?\nDivision",
                        "Number sentence?\n66.00 ÷ 2.75 = N"
                    ),
                    answer = ""
                ),

                Slide.ExampleSlide(
                    id = 21,
                    title = "3. Solve the problem",
                    problem = "",
                    steps = listOf(
                        "66.00 ÷ 2.75 = 24"
                    ),
                    answer = "The total notebooks Sarah can buy with her ₱66.00 money is 24 notebooks"
                ),

                Slide.ExampleSlide(
                    id = 22,
                    title = "4. Check",
                    problem = "",
                    steps = listOf(
                        "24 × 2.75 = 66.00"
                    ),
                    answer = "Therefore, ₱66.00 can buy 24 total notebooks"
                ),

                Slide.PracticeSlide(
                    id = 23,
                    question = "Addition\n\nWord Problem:\nLiam has ₱120.50 saved. He found another ₱35.25 in his drawer. How much money does he have in total?\n\nChoose your answer:",
                    options = listOf("₱155.75", "₱157.55", "₱155.57", "₱175.55"),
                    correctAnswer = 0,
                    explanation = "Correct! The answer is ₱155.75"
                ),

                Slide.PracticeSlide(
                    id = 24,
                    question = "Subtraction\n\nWord Problem:\nElla paid ₱500 for a jacket that costs ₱368. How much has she changed?\n\nChoose your answer:",
                    options = listOf("₱132", "₱123", "₱213", "₱231"),
                    correctAnswer = 0,
                    explanation = "Correct! The answer is ₱132"
                ),

                Slide.PracticeSlide(
                    id = 25,
                    question = "Multiplication\n\nWord Problem:\nNate buys 4 notebooks. Each notebook costs ₱32.50. How much does he spend?\n\nChoose your answer:",
                    options = listOf("₱130", "₱103", "₱301", "₱310"),
                    correctAnswer = 0,
                    explanation = "Correct! The answer is ₱130"
                ),

                Slide.PracticeSlide(
                    id = 26,
                    question = "Division\n\nWord Problem:\nMira has ₱84.00. A pack of stickers costs ₱6.00 each. How many packs can she buy?\n\nChoose your answer:",
                    options = listOf("14", "12", "16", "18"),
                    correctAnswer = 0,
                    explanation = "Correct! The answer is 14"
                ),

                Slide.SummarySlide(
                    id = 27,
                    title = "Summary",
                    keyPoints = listOf(
                        "Problem solving has steps to guide us:",
                        "Understand (Identify the given facts and what is asked.)",
                        "Plan (Determine the operation and the number sentence.)",
                        "Solve",
                        "Check",
                        "These steps help us solve problems clearly and correctly"
                    )
                )
            )
        )
    }

    // LESSON 17 - SUBTOPIC 2: Creating a Problem
    private fun getQuarter1Lesson17Subtopic2(): InteractiveLesson {
        return InteractiveLesson(
            id = 28,
            title = "Creating Your Own Word Problems",
            slides = listOf(
                Slide.IntroSlide(
                    id = 1,
                    title = "Hola!",
                    content = "To create a word problem, start by analyzing how you would solve it on your own. Use the provided data to formulate a question, and determine the best method or solution to arrive at the answer."
                ),

                Slide.ExampleSlide(
                    id = 2,
                    title = "Example",
                    problem = "156 tons of total garbage collected; 3.25 tons per truck; total number of trucks used?",
                    steps = listOf(
                        "Answer:\nTotal of 156 tons of garbage collected. Each truck contains 3.25 tons. What is the total number of trucks used?"
                    ),
                    answer = ""
                ),

                Slide.PracticeSlide(
                    id = 3,
                    question = "Word Problem:\n420 liters of water was delivered to a community; 7.5 liters of water per container; total containers were needed to hold all the water?\n\nChoose your answer:",
                    options = listOf(
                        "A total of 420 liters of water was delivered to a community. Each container can hold 7.5 liters of water. How many containers were needed to hold all the water?",
                        "A total of 7.5 liters of water was delivered to a community. Each container can hold 420 liters of water. How many containers were needed to hold all the water?"
                    ),
                    correctAnswer = 0,
                    explanation = "Correct! A total of 420 liters of water was delivered to a community. Each container can hold 7.5 liters of water. How many containers were needed to hold all the water?"
                )
            )
        )
    }

    // LESSON 17 - SUBTOPIC 3: Multi-Step Routine Problem Solving
    private fun getQuarter1Lesson17Subtopic3(): InteractiveLesson {
        return InteractiveLesson(
            id = 29,
            title = "Multi-Step Routine Problem Solving with Two or More Operations",
            slides = listOf(
                Slide.IntroSlide(
                    id = 1,
                    title = "Welcome!",
                    content = "A multi-step non-routine problem is a complex challenge that necessitates creativity or originality to solve. These problems often lack an obvious strategy for resolution, as they can be approached in various ways and require higher-order thinking skills (HOTS) questions to find a solution."
                ),

                Slide.ExampleSlide(
                    id = 2,
                    title = "Example",
                    problem = "I am thinking of a number. Four times my number plus 12 equals 60. What is my number?",
                    steps = listOf(),
                    answer = ""
                ),

                Slide.ExampleSlide(
                    id = 3,
                    title = "Answer",
                    problem = "Let x be the number. The equation is:",
                    steps = listOf(
                        "4x + 12 = 60",
                        "Subtract 12 from both sides:\n4x = 48",
                        "Divide by 4:\nx = 12"
                    ),
                    answer = ""
                ),

                Slide.PracticeSlide(
                    id = 4,
                    question = "Problem:\nI am thinking of a number. Four times my number plus 12 equals 60. What is my number?\n\nChoose your answer:",
                    options = listOf("11", "12", "13", "14"),
                    correctAnswer = 1,
                    explanation = "Correct! The answer is 12"
                ),

                Slide.SummarySlide(
                    id = 5,
                    title = "Summary",
                    keyPoints = listOf(
                        "Require creativity and originality to find a solution",
                        "Do not have an immediate or obvious strategy for solving the problem",
                        "Can be approached in multiple ways, depending on the learner's reasoning",
                        "Involve several steps and often combine different math concepts",
                        "Develop and test higher-order thinking skills (HOTS) such as analysis, evaluation, and problem-solving",
                        "Encourage students to think beyond basic operations and explore deeper understanding"
                    )
                )
            )
        )
    }

    // ============== QUARTER 2 ==============
    // LESSON 1 - SUBTOPIC 1: Relating Fraction and Ratio
    private fun getQuarter2Lesson1Subtopic1(): InteractiveLesson {
        return InteractiveLesson(
            id = 30,
            title = "Relating Fractions and Ratios",
            slides = listOf(
                Slide.IntroSlide(
                    id = 1,
                    title = "Hi!!",
                    content = "In this topic, you will learn how to write ratios, relate them to fractions, and tell when a ratio is a rate."
                ),

                Slide.ConceptSlide(
                    id = 2,
                    title = "What is Ratio?",
                    content = "A Ratio is a method used to compare two or more quantities with the same units. These quantities can either be distinct entities or different parts of a whole. The ratio of a to b can be expressed in three ways: as words, using a colon, or in fraction form. It is crucial to maintain the correct order when writing a ratio, as it should match the order of the items being compared. In a ratio, a part can also be compared to the whole.",
                    keyPoints = listOf()
                ),

                Slide.ConceptSlide(
                    id = 3,
                    title = "Key Point",
                    content = "",
                    keyPoints = listOf(
                        "Word form - 1 is to 2",
                        "Colon form - 1:2",
                        "Fraction form - ½"
                    )
                ),

                Slide.ExampleSlide(
                    id = 4,
                    title = "Example 1: Compare the number of dog to cat",
                    problem = "",
                    steps = listOf(
                        "Ratio of dog to cat\nWord form - 14 is to 8\nColon form - 14:8\nFraction form - 14/8",
                        "Ratio of cat to dog\nWord form - 8 is to 14\nColon form - 8:14\nFraction form - 8/14"
                    ),
                    answer = ""
                ),

                Slide.ConceptSlide(
                    id = 5,
                    title = "Part to Whole",
                    content = "When you compare a part to the total number of animals, the ratio of the part to the whole has the same meaning as a fraction.",
                    keyPoints = listOf()
                ),

                Slide.ExampleSlide(
                    id = 6,
                    title = "Example 2: Compare the total number of animals to the number of cats",
                    problem = "",
                    steps = listOf(
                        "Ratio of total animals to cats\nWord form - 22 is to 8\nColon form - 22:8\nFraction form - 22/8",
                        "Ratio of cats to total animals\nWord form - 8 is to 22\nColon form - 8:22\nFraction form - 8/22"
                    ),
                    answer = ""
                ),

                Slide.PracticeSlide(
                    id = 7,
                    question = "Practice Time!!\n\nWhat is the colon form of the ratio of pink bag to blue bag?\n\nChoose your answer:",
                    options = listOf("4:8", "4:3", "3:4", "1:4"),
                    correctAnswer = 1,
                    explanation = "Correct! The answer is 4:3"
                ),

                Slide.PracticeSlide(
                    id = 8,
                    question = "Practice Time!!\n\nWhat is the word form of the ratio of blue bag to pink bag?\n\nChoose your answer:",
                    options = listOf("3 is to 4", "4 is to 3"),
                    correctAnswer = 0,
                    explanation = "Correct! The answer is 3 is to 4"
                ),

                Slide.ConceptSlide(
                    id = 9,
                    title = "Reading Ratios",
                    content = "Even when a ratio is written in fraction form, you would still say \"twenty two is to eight\" or \"eight is to twenty two.\"\n\nExample: ⅔\nYou will still read it as \"Two is to Three.\"",
                    keyPoints = listOf()
                ),

                Slide.ConceptSlide(
                    id = 10,
                    title = "Simplifying Ratios",
                    content = "Just like fractions, ratios should be simplified to their lowest terms. You can express the example above as:\n\nThe simplest form of 22/8 is 11/4, by dividing it both by 2.",
                    keyPoints = listOf()
                ),

                Slide.ConceptSlide(
                    id = 11,
                    title = "What is Rate?",
                    content = "Sometimes the terms in a ratio have different units or classifications. This type of ratio is called a rate. For example, comparing kilometers to hours.\n\nSpeed (60 miles per hour)",
                    keyPoints = listOf()
                ),

                Slide.SummarySlide(
                    id = 12,
                    title = "Summary",
                    keyPoints = listOf(
                        "A ratio compares two quantities and can be written in three forms: using a colon, in words, or as a fraction",
                        "A rate is a comparison between two quantities that may have different units of measurement, and the resulting ratio includes a unit of measure"
                    )
                )
            )
        )
    }

    // LESSON 2 - SUBTOPIC 1: Proportion
    private fun getQuarter2Lesson2Subtopic1(): InteractiveLesson {
        return InteractiveLesson(
            id = 31,
            title = "Understanding Proportion",
            slides = listOf(
                Slide.IntroSlide(
                    id = 1,
                    title = "Good day!",
                    content = "In this topic you will learn about the Concept of Proportion. You will be able to explain and understand Ratio and Proportion."
                ),

                Slide.ConceptSlide(
                    id = 2,
                    title = "What is Proportion?",
                    content = "A Proportion is an equation that shows two ratios are equal. In other words, it compares two fractions or ratios and states that they have the same value.",
                    keyPoints = listOf()
                ),

                Slide.ConceptSlide(
                    id = 3,
                    title = "What are Extremes?",
                    content = "The extremes are the outer numbers in a proportion.\n\nExample proportion:\na/b = c/d\n\nExtremes: a and d\n\nThe product of the extremes is part of cross-multiplication.\na · d",
                    keyPoints = listOf()
                ),

                Slide.ConceptSlide(
                    id = 4,
                    title = "What are Means?",
                    content = "The means are the inner numbers in a proportion.\n\nUsing the same example:\na/b = c/d\n\nMeans: b and c\n\nThe product of the means must equal the product of the extremes in a true proportion.\nb · c",
                    keyPoints = listOf()
                ),

                Slide.ExampleSlide(
                    id = 5,
                    title = "Given 1: 2/3 = 4/6",
                    problem = "Solution:",
                    steps = listOf(
                        "Step 1: Cross-multiply\n2 × 6 = 3 × 4",
                        "Step 2: Compute both sides\nLeft side: 2 × 6 = 12\nRight side: 3 × 4 = 12",
                        "Conclusion:\n12 = 12"
                    ),
                    answer = "So the cross-products are equal, which proves the proportion is correct"
                ),

                Slide.ExampleSlide(
                    id = 6,
                    title = "Given 2: 3/5 = 9/15",
                    problem = "Solution:",
                    steps = listOf(
                        "Step 1: Cross-multiply\n3 × 15 = 5 × 9",
                        "Step 2: Compute both sides\nLeft side: 3 × 15 = 45\nRight side: 5 × 9 = 45",
                        "Conclusion:\n45 = 45"
                    ),
                    answer = "So the cross-products are equal, which proves the proportion is correct"
                ),

                Slide.ExampleSlide(
                    id = 7,
                    title = "Given 3: 4/7 = 12/21",
                    problem = "Solution:",
                    steps = listOf(
                        "Step 1: Cross-multiply\n4 × 21 = 7 × 12",
                        "Step 2: Compute both sides\nLeft side: 4 × 21 = 84\nRight side: 7 × 12 = 84",
                        "Conclusion:\n84 = 84"
                    ),
                    answer = "So the cross-products are equal, which proves the proportion is correct"
                ),

                Slide.PracticeSlide(
                    id = 8,
                    question = "Practice time!\n\nIdentify the Extremes and Means in this given: 4/6 = 8/10\n\nChoose your answer:",
                    options = listOf(
                        "Extremes: 4 : 10, Means: 6 : 8",
                        "Extremes: 6 : 8, Means: 4 : 10"
                    ),
                    correctAnswer = 0,
                    explanation = "Correct! Extremes: 4 : 10, Means: 6 : 8"
                ),

                Slide.SummarySlide(
                    id = 9,
                    title = "Summary",
                    keyPoints = listOf(
                        "Key points to remember:",
                        "Proportion\nan equation that shows two ratios are equal. It compares two fractions or ratios and states they have the same value. Proportions are used to compare quantities fairly",
                        "Extremes\nouter numbers in a proportion. Helps determine if a proportion is true",
                        "Means\ninner numbers in a proportion. Used to check or solve proportions"
                    )
                )
            )
        )
    }

    // LESSON 2 - SUBTOPIC 2: Types of Proportion
    private fun getQuarter2Lesson2Subtopic2(): InteractiveLesson {
        return InteractiveLesson(
            id = 32,
            title = "Types of Proportion",
            slides = listOf(
                Slide.IntroSlide(
                    id = 1,
                    title = "Hello!",
                    content = "In this topic you will learn the three types of proportion. There are three types of proportions: Direct, Inverse, and Partitive."
                ),

                Slide.ConceptSlide(
                    id = 2,
                    title = "What is Direct Proportion?",
                    content = "Direct proportion is a relationship where one quantity increases or decreases in the same way as the other. When one goes up, the other goes up; when one goes down, the other goes down.",
                    keyPoints = listOf()
                ),

                Slide.ConceptSlide(
                    id = 3,
                    title = "Key points",
                    content = "",
                    keyPoints = listOf(
                        "Two quantities increase or decrease together",
                        "Their ratio is constant\nx/y = constant",
                        "Can be written as:\nx ∝ y",
                        "Graph forms a straight line through the origin (0,0)",
                        "Example: More apples → Higher cost"
                    )
                ),

                Slide.ConceptSlide(
                    id = 4,
                    title = "What is Inverse Proportion?",
                    content = "Inverse proportion is a relationship where when one quantity increases, the other decreases, and vice versa. They move in opposite directions.",
                    keyPoints = listOf()
                ),

                Slide.ConceptSlide(
                    id = 5,
                    title = "Key points",
                    content = "",
                    keyPoints = listOf(
                        "Quantities change in opposite ways",
                        "One goes up → the other goes down",
                        "One goes down → the other goes up",
                        "Their product is constant\nx · y = constant",
                        "Can be written as:\nx ∝ 1/y",
                        "Example: More workers → Less time needed"
                    )
                ),

                Slide.ConceptSlide(
                    id = 6,
                    title = "What is Partitive Proportion?",
                    content = "Partitive proportion is used to divide a whole amount into parts based on a given ratio.",
                    keyPoints = listOf()
                ),

                Slide.ConceptSlide(
                    id = 7,
                    title = "Key points",
                    content = "",
                    keyPoints = listOf(
                        "Used to split or share something fairly according to a ratio",
                        "The total is divided proportionally among the parts",
                        "Steps involve:\nAdding the ratio parts\nDividing the total by the sum of the parts\nMultiplying by each ratio value to get each share",
                        "Example: Dividing ₱600 in the ratio 2:3:5"
                    )
                ),

                Slide.PracticeSlide(
                    id = 8,
                    question = "Practice time!\n\nIdentify what it describes. Direct, Inverse or Partitive\n\nWhen one quantity increases or decreases, the other quantity increases or decreases at the same rate.\n\nChoose your answer:",
                    options = listOf("Direct Proportion", "Inverse Proportion", "Partitive Proportion"),
                    correctAnswer = 0,
                    explanation = "Correct! The answer is Direct Proportion"
                ),

                Slide.PracticeSlide(
                    id = 9,
                    question = "Practice time!\n\nIdentify what it describes. Direct, Inverse or Partitive\n\nWhen one quantity increases, the other quantity decreases, and vice versa.\n\nChoose your answer:",
                    options = listOf("Direct Proportion", "Inverse Proportion", "Partitive Proportion"),
                    correctAnswer = 1,
                    explanation = "Correct! The answer is Inverse Proportion"
                ),

                Slide.PracticeSlide(
                    id = 10,
                    question = "Practice time!\n\nIdentify what it describes. Direct, Inverse or Partitive\n\nA whole quantity is divided into parts according to a given ratio.\n\nChoose your answer:",
                    options = listOf("Direct Proportion", "Inverse Proportion", "Partitive Proportion"),
                    correctAnswer = 2,
                    explanation = "Correct! The answer is Partitive Proportion"
                ),

                Slide.SummarySlide(
                    id = 11,
                    title = "Summary",
                    keyPoints = listOf(
                        "Key points to remember",
                        "Direct Proportion\nWhen one quantity increases or decreases, the other quantity increases or decreases at the same rate",
                        "Inverse Proportion\nWhen one quantity increases, the other quantity decreases, and vice versa",
                        "Partitive Proportion\nA whole quantity is divided into parts according to a given ratio"
                    )
                )
            )
        )
    }

    // LESSON 3 - SUBTOPIC 1: Understanding Percentage, Rate, and Base
    private fun getQuarter2Lesson3Subtopic1(): InteractiveLesson {
        return InteractiveLesson(
            id = 33,
            title = "Understanding Percentage, Rate, and Base",
            slides = listOf(
                Slide.IntroSlide(
                    id = 1,
                    title = "Heyyy!!",
                    content = "In this topic, you will learn to understand percent as a ratio to 100 and identify the percentage, rate, and base in a given problem."
                ),

                Slide.ConceptSlide(
                    id = 2,
                    title = "What is Percent?",
                    content = "Percent is the ratio that compares a number to 100. It can be written as a fraction with 100 as the denominator. The symbol \"%\" is used to represent percent, and it's called the percent sign.",
                    keyPoints = listOf()
                ),

                Slide.ConceptSlide(
                    id = 3,
                    title = "What is Rate?",
                    content = "A rate is a comparison between two quantities that may have different units of measurement, and the resulting ratio includes a unit of measure.",
                    keyPoints = listOf()
                ),

                Slide.ConceptSlide(
                    id = 4,
                    title = "What is Base?",
                    content = "A base is the whole number or total amount from which a part is taken.",
                    keyPoints = listOf()
                ),

                Slide.ConceptSlide(
                    id = 5,
                    title = "Understanding the Example",
                    content = "To fully understand this lesson, start by reading and analyzing the short example problem in the next slide. Pay attention to how the concepts of percentage, rate, and base are used to solve the problem.",
                    keyPoints = listOf()
                ),

                Slide.ExampleSlide(
                    id = 6,
                    title = "Example problem 1",
                    problem = "Jimmy gets a daily allowance of ₱100.00. He spends ₱50.00 on snacks, which is 50% of his allowance.",
                    steps = listOf(
                        "In this situation, we can say that 50% of ₱100.00 is ₱50.00"
                    ),
                    answer = ""
                ),

                Slide.ExampleSlide(
                    id = 7,
                    title = "Identifying the Parts",
                    problem = "Here, we can easily identify the percentage, rate, and base. We let P be the percentage, R be the rate, and B be the base.",
                    steps = listOf(
                        "50% of ₱100.00 is ₱50.00",
                        "₱50 (P) — It is the number or the amount that represents",
                        "50% (R) — It is the number compared to 100. It usually has either a percent sign (%) or the word \"percent\" with it",
                        "₱100 (B) — It represents the total amount, or the whole"
                    ),
                    answer = ""
                ),

                Slide.ExampleSlide(
                    id = 8,
                    title = "Example problem 2",
                    problem = "Maria has a total savings of ₱800.00. She spends ₱200.00 on school supplies, which is 25% of her savings.",
                    steps = listOf(
                        "In this situation, we can say that 25% of ₱800.00 is ₱200.00"
                    ),
                    answer = ""
                ),

                Slide.ExampleSlide(
                    id = 9,
                    title = "Identifying the Parts",
                    problem = "Here, we can easily identify the percentage, rate, and base. We let P be the percentage, R be the rate, and B be the base.",
                    steps = listOf(
                        "25% of ₱800.00 is ₱200.00",
                        "₱200 (P) — the percentage, or the part of the whole",
                        "25% (R) — the rate, the number compared to 100",
                        "₱800 (B) — the base, or the total amount"
                    ),
                    answer = ""
                ),

                Slide.PracticeSlide(
                    id = 10,
                    question = "Maria has ₱200.00 for her school lunch. She uses ₱60.00 to buy a meal, which is 30% of her money. What is the Base in the problem?\n\nChoose your answer:",
                    options = listOf("₱200.00", "₱60.00", "30%"),
                    correctAnswer = 0,
                    explanation = "Correct! The answer is ₱200.00"
                ),

                Slide.PracticeSlide(
                    id = 11,
                    question = "Kevin saved ₱150.00 from his weekly allowance. He used ₱30.00 to buy a new notebook, and this amount is 20% of his total savings. What is the percentage in the problem?\n\nChoose your answer:",
                    options = listOf("₱150.00", "₱30.00", "20%"),
                    correctAnswer = 1,
                    explanation = "Correct! The answer is ₱30.00"
                ),

                Slide.PracticeSlide(
                    id = 12,
                    question = "Anna has ₱250.00 in her coin bank. She donates ₱25.00 to a school charity, which is 10% of her total savings. What is the rate in the problem?\n\nChoose your answer:",
                    options = listOf("₱250.00", "₱25.00", "10%"),
                    correctAnswer = 2,
                    explanation = "Correct! The answer is 10%"
                ),

                Slide.SummarySlide(
                    id = 13,
                    title = "Summary",
                    keyPoints = listOf(
                        "In a problem, the rate is the percent, the base is the total, and the percentage is the part"
                    )
                )
            )
        )
    }

    // LESSON 3 - SUBTOPIC 2: Finding Percentage, Rate, and Base Using Techan's Triangle
    private fun getQuarter2Lesson3Subtopic2(): InteractiveLesson {
        return InteractiveLesson(
            id = 34,
            title = "Finding Percentage, Rate, and Base Using Techan's Triangle",
            slides = listOf(
                Slide.IntroSlide(
                    id = 1,
                    title = "Hi!!",
                    content = "In this topic, you will learn how to use the Techan's Triangle to find percentage, rate, or base in problems."
                ),

                Slide.ConceptSlide(
                    id = 2,
                    title = "What is Techan's Triangle?",
                    content = "The Techan's Triangle is a helpful tool to remember how to use the formulas for percentage (P), rate (R), and base (B).",
                    imageResourceId = R.drawable.techans_triangle,
                    keyPoints = listOf()
                ),

                Slide.ConceptSlide(
                    id = 3,
                    title = "How to use Techan's Triangle?",
                    content = "Key points:",
                    imageResourceId = R.drawable.techans_triangle,
                    keyPoints = listOf(
                        "P = B × R",
                        "B = P ÷ R",
                        "R = P ÷ B"
                    )
                ),

                Slide.ConceptSlide(
                    id = 4,
                    title = "Finding Percentage (P)",
                    content = "To find the percentage (P): cover P in the triangle; since R (rate) and B (base) are next to each other, this means you multiply rate and base together (P = R × B).",
                    imageResourceId = R.drawable.techans_triangle_cover_p,
                    keyPoints = listOf()
                ),

                Slide.ExampleSlide(
                    id = 5,
                    title = "Finding the Percentage — (P = R × B)",
                    problem = "Example 1: Find 50% of 80",
                    steps = listOf(
                        "Using Decimal\n50% × 80 = n\n0.50 × 80 = 40\n*Change the rate to decimal",
                        "Using a Proportion\n50/100 = n/80\nThink: 50% = 50/100\n100n/100 = 4,000/100\n*multiply 50 to 80\nn = 40"
                    ),
                    answer = ""
                ),

                Slide.ExampleSlide(
                    id = 6,
                    title = "Finding the Percentage — (P = R × B)",
                    problem = "Example 2: Find 25% of 200",
                    steps = listOf(
                        "Using Decimal\n25% × 200 = n\n0.25 × 200 = 50\n*Change the rate to decimal",
                        "Using a Proportion\n25/100 = n/200\nThink: 25% = 25/100\n100n/100 = 5,000/100\n*multiply 25 to 200\nn = 50"
                    ),
                    answer = ""
                ),

                Slide.PracticeSlide(
                    id = 7,
                    question = "Find 20% of 100.\n\nChoose your answer:",
                    options = listOf("20", "10", "25", "30"),
                    correctAnswer = 0,
                    explanation = "Correct! The answer is 20"
                ),

                Slide.ConceptSlide(
                    id = 8,
                    title = "Finding Base (B)",
                    content = "To find the base (B), cover B in the triangle. Since P (percentage) is over R (rate), you divide the percentage by the rate (B = P ÷ R).",
                    imageResourceId = R.drawable.techans_triangle_cover_b,
                    keyPoints = listOf()
                ),

                Slide.ExampleSlide(
                    id = 9,
                    title = "Finding the Base — (B = P ÷ R)",
                    problem = "Example 1: In Mrs. Borja's Math class, 8 pupils got high scores on the test. If this is 20% of the total number of pupils in the class, how many pupils does he have in all?",
                    steps = listOf(
                        "Using Decimal\n20% of n = 8\n0.20 × n = 8\n0.20n/0.20 = 8/0.20\nn = 40",
                        "Using Proportion\n20/100 = 8/n\n20:100 = 8:n\n20 × n = 100 × 8\n20n = 800\n20n/20 = 800/20\nn = 40"
                    ),
                    answer = ""
                ),

                Slide.ExampleSlide(
                    id = 10,
                    title = "Finding the Base — (B = P ÷ R)",
                    problem = "Example 2: In a school program, 15 students joined the science club. If this number represents 30% of the total number of students in the grade, how many students are there in all?",
                    steps = listOf(
                        "Using Decimal\n30% of n = 15\n0.30 × n = 15\n0.30n/0.30 = 15/0.30\nn = 50",
                        "Using Proportion\n30/100 = 15/n\n30:100 = 15:n\n30 × n = 100 × 15\n30n = 1500\n30n/30 = 1500/30\nn = 50"
                    ),
                    answer = ""
                ),

                Slide.PracticeSlide(
                    id = 11,
                    question = "8 is 25% of what number?\n\nChoose your answer:",
                    options = listOf("30", "25", "18", "32"),
                    correctAnswer = 3,
                    explanation = "Correct! The answer is 32"
                ),

                Slide.ConceptSlide(
                    id = 12,
                    title = "Finding Rate (R)",
                    content = "To find the rate (R), cover R in the triangle. Since P (percentage) is over B (base), you divide the percentage by the base (R = P ÷ B).",
                    imageResourceId = R.drawable.techans_triangle_cover_r,
                    keyPoints = listOf()
                ),

                Slide.ExampleSlide(
                    id = 13,
                    title = "Finding the Rate — (R = P ÷ B)",
                    problem = "Example 1: 15 is what percent of 60?\nThink that 15 is the percentage and 60 is the base.",
                    steps = listOf(
                        "Using Fraction\nn% of 60 = 15\nn/100 × 60 = 15\n60n/100 = 15\n60n = 15 × 100\n60n = 1500\n60n/60 = 1,500/60\nn = 25",
                        "Using Proportion\nn% of 60 = 15\n100 × 15 = 1,500\nn/100 = 15/60\nn:100 = 15:60\nn × 60 = 60n\n60n = 1,500\n60n/60 = 1,500/60\nn = 25"
                    ),
                    answer = ""
                ),

                Slide.ExampleSlide(
                    id = 14,
                    title = "Finding the Rate — (R = P ÷ B)",
                    problem = "Example 2: 18 is what percent of 72?\nThink that 18 is the percentage and 72 is the base.",
                    steps = listOf(
                        "Using Fraction\nn% of 72 = 18\nn/100 × 72 = 18\n72n/100 = 18\n72n = 18 × 100\n72n = 1800\n72n/72 = 1,800/72\nn = 25",
                        "Using Proportion\nn% of 72 = 18\n100 × 18 = 1,800\nn/100 = 18/72\nn:100 = 18:72\nn × 72 = 72n\n72n = 1,800\n72n/72 = 1,800/72\nn = 25"
                    ),
                    answer = ""
                ),

                Slide.PracticeSlide(
                    id = 15,
                    question = "Practice Time!!\n\n3 is what percent of 15?\n\nChoose your answer:",
                    options = listOf("10%", "15%", "3%", "20%"),
                    correctAnswer = 3,
                    explanation = "Correct! The answer is 20%"
                ),

                Slide.SummarySlide(
                    id = 16,
                    title = "Summary",
                    keyPoints = listOf(
                        "The Techan's Triangle is a helpful tool for solving percent problems. It shows the relationship between Percentage (P), Rate (R), and Base (B). Using the triangle:",
                        "To find the percentage (P): multiply rate and base (P = R × B)",
                        "To find the base (B): divide percentage by rate (B = P ÷ R)",
                        "To find the rate (R): divide percentage by base (R = P ÷ B)"
                    )
                )
            )
        )
    }

    // LESSON 3 - SUBTOPIC 3: Solving Routine and Non-Routine Problems
    private fun getQuarter2Lesson3Subtopic3(): InteractiveLesson {
        return InteractiveLesson(
            id = 35,
            title = "Solving Routine and Non-Routine Problems Involving Percentage",
            slides = listOf(
                Slide.IntroSlide(
                    id = 1,
                    title = "Good day!",
                    content = "In this topic, you will learn about the percentage, rate, and base in a given problem and also solve both routine and non-routine problems involving these concepts."
                ),

                Slide.ExampleSlide(
                    id = 2,
                    title = "Example word problem",
                    problem = "There were 200 participants attending the Mathematics Seminar workshop. 40% of these were men and the rest were women. How many women participated in the Mathematics Seminar workshop?",
                    steps = listOf(),
                    answer = ""
                ),

                Slide.ExampleSlide(
                    id = 3,
                    title = "Understand",
                    problem = "",
                    steps = listOf(
                        "What is asked?\nThe number of women participated in the seminar workshop",
                        "What are the given facts?\n200 participants. Of the total, 40% were male"
                    ),
                    answer = ""
                ),

                Slide.ExampleSlide(
                    id = 4,
                    title = "2. Plan",
                    problem = "",
                    imageResourceId = R.drawable.percentage_diagram,
                    steps = listOf(
                        "What is the operation to be used?\nMultiplication",
                        "Number sentence?\nIf there were 40% men participants, 100% - 40% = 60%. Therefore, 60% are women. You can use the formula for finding the percentage. P = R × B"
                    ),
                    answer = ""
                ),

                Slide.ExampleSlide(
                    id = 5,
                    title = "3. Solve",
                    problem = "Using the formula, we have",
                    steps = listOf(
                        "P = R × B\nP = 60% × 200\nP = 0.60 × 200\nP = 120 The number of women participants"
                    ),
                    answer = "There were 120 women participants in the seminar workshop"
                ),

                Slide.ExampleSlide(
                    id = 6,
                    title = "4. Check",
                    problem = "This is one way to know if your answer is correct.",
                    steps = listOf(
                        "40% × 200 = 0.40 × 200 = 80 men participants",
                        "60% × 200 = 0.60 × 200 = 120 women participants",
                        "120 + 80 = 200 total number of participants"
                    ),
                    answer = ""
                ),

                Slide.PracticeSlide(
                    id = 7,
                    question = "Word problem:\nThere were 350 students who joined a Science Fair. If 30% of them were boys and the rest were girls. How many girls joined the Science Fair?\n\nChoose your answer:",
                    options = listOf("245 girls", "250 girls", "255 girls", "240 girls"),
                    correctAnswer = 0,
                    explanation = "Correct! The answer is 245 girls"
                ),

                Slide.SummarySlide(
                    id = 8,
                    title = "Summary",
                    keyPoints = listOf(
                        "Percentage is the amount that represents a part of a whole. To find the percentage of a number, you can change it to decimal or fraction and then multiply it by the given number or multiply the percent or rate (R) by the given number or base (B)",
                        "Base is the number that represents the whole or entire amount. In finding the base (B), just divide the percentage by the rate",
                        "Rate is the number compared to 100. Usually it has either a percent sign (%) or the word \"percent\" with it. To find the percent or rate, divide the percentage by the given number or base (B) or rewrite the number as a fraction, then change the denominator to 100. Simplify and write the percent symbol (%)"
                    )
                )
            )
        )
    }

    // LESSON 4 - SUBTOPIC 1: Solving Discount, Discount Rate, Original Price and Sale Price
    private fun getQuarter2Lesson4Subtopic1(): InteractiveLesson {
        return InteractiveLesson(
            id = 36,
            title = "Solving Discount, Discount Rate, Original Price and Sale Price",
            slides = listOf(
                Slide.IntroSlide(
                    id = 1,
                    title = "Hola!",
                    content = "In this topic you will learn about percentages, including discounts, original prices, discount rates and sale prices. Read and analyze them carefully, as they will assist you throughout this topic."
                ),

                Slide.ConceptSlide(
                    id = 2,
                    title = "What is Discount?",
                    content = "Discount (D) refers to a reduction in the price of an item, representing the amount subtracted from the original price.",
                    keyPoints = listOf(
                        "The amount of money saved",
                        "Subtracted from the original price",
                        "Usually expressed in pesos or currency",
                        "Example: Save ₱100 on a ₱500 item"
                    )
                ),

                Slide.ConceptSlide(
                    id = 3,
                    title = "What is Discount Rate?",
                    content = "Discount Rate (DR) is the percentage taken off from the original price.",
                    keyPoints = listOf(
                        "Expressed as a percentage (%)",
                        "Shows how much percent is reduced",
                        "Common rates: 10%, 20%, 50% off",
                        "Example: 20% discount rate"
                    )
                ),

                Slide.ConceptSlide(
                    id = 4,
                    title = "Formula for Discount",
                    content = "To calculate the discount amount:",
                    keyPoints = listOf(
                        "Discount = Original Price × Discount Rate ÷ 100",
                        "Or: Discount = Original Price × (Rate as decimal)",
                        "Convert % to decimal: 20% = 0.20",
                        "Then multiply by original price"
                    )
                ),

                Slide.ExampleSlide(
                    id = 5,
                    title = "Example 1: Calculating Discount",
                    problem = "If a ₱500 shirt has a 20% discount, what is the discount amount?",
                    steps = listOf(
                        "Given: \n Original Price = ₱500 \n Discount Rate = 20%",
                        "Using the formula: \n Discount = Original Price × Discount Rate ÷ 100 \n Discount = 500 × 20 ÷ 100 \n Discount = 10,000 ÷ 100 \n Discount = ₱100",
                        "Alternative method: \n Discount = 500 × 0.20 = ₱100"
                    ),
                    answer = "The discount is ₱100"
                ),

                Slide.ExampleSlide(
                    id = 6,
                    title = "Example 2",
                    problem = "Formula:\nDiscount = Original Price × Discount rate/100",
                    steps = listOf(
                        "Example 2: If a pair of shoes costs ₱1,200 and has a 15% discount, the discount is:",
                        "1,200 × 15/100 = ₱180",
                        "The sale price is the original price minus the discount:",
                        "1,200 − 180 = ₱1,020"
                    ),
                    answer = "₱1,020"
                ),

                Slide.ConceptSlide(
                    id = 6,
                    title = "What is Original Price?",
                    content = "Original Price (OP) is the regular or initial cost of the item before any discount is applied.",
                    keyPoints = listOf(
                        "Also called regular price or marked price",
                        "The starting price before discounts",
                        "Represents 100% of the value",
                        "Example: ₱800 for shoes"
                    )
                ),

                Slide.ConceptSlide(
                    id = 7,
                    title = "What is Sale Price?",
                    content = "Sale Price (SP) is the final price after the discount has been applied, also known as the net or discounted price.",
                    keyPoints = listOf(
                        "The amount you actually pay",
                        "Original Price minus Discount",
                        "What appears on your receipt",
                        "Lower than the original price"
                    )
                ),

                Slide.ConceptSlide(
                    id = 8,
                    title = "Formula for Sale Price",
                    content = "To find what you'll actually pay:",
                    keyPoints = listOf(
                        "Sale Price = Original Price − Discount",
                        "Example:",
                        "Original: ₱500",
                        "Discount: ₱100",
                        "Sale Price: ₱500 − ₱100 = ₱400"
                    )
                ),

                Slide.ExampleSlide(
                    id = 9,
                    title = "Example 1",
                    problem = "A shirt originally costs ₱500 and has a ₱100 discount. What is the sale price?",
                    steps = listOf(
                        "Given: \n Original Price = ₱500 \n Discount = ₱100",
                        "Using the formula: \n Sale Price = Original Price − Discount \n Sale Price = 500 − 100 \n Sale Price = ₱400",
                        "This is the amount you actually pay when buying the shirt on sale."
                    ),
                    answer = "Sale Price = ₱400"
                ),

                Slide.ExampleSlide(
                    id = 10,
                    title = "Example 2",
                    problem = "Formula:\nSale Price = Original Price − Discount",
                    steps = listOf(
                        "Example 2:",
                        "If a bag originally costs ₱1,800 and has a ₱450 discount, the sale price is:",
                        "1,800 − 450 = ₱1,350"
                    ),
                    answer = "It is the amount you actually pay after the discount is applied"
                ),

                Slide.PracticeSlide(
                    id = 11,
                    question = "True or False: Discount (D) refers to a reduction in the price of an item, representing the amount subtracted from the original price.",
                    options = listOf("True", "False"),
                    correctAnswer = 0,
                    explanation = "Correct! The discount is the amount of money reduced from the original price."
                ),

                Slide.ExampleSlide(
                    id = 12,
                    title = "Example: Working Backwards",
                    problem = "A pair of shoes is on sale for ₱640 after a ₱160 discount. What was the original price?",
                    steps = listOf(
                        "Given: \n Sale Price = ₱640 \n Discount = ₱160",
                        "We know: Original Price − Discount = Sale Price",
                        "So: Original Price = Sale Price + Discount",
                        "Original Price = 640 + 160",
                        "Original Price = ₱800",
                        "Check: ₱800 − ₱160 = ₱640"
                    ),
                    answer = "Original Price = ₱800"
                ),

                Slide.ConceptSlide(
                    id = 13,
                    title = "Quick Formulas Summary",
                    content = "Here are all the formulas you need:",
                    keyPoints = listOf(
                        "1. Discount = Original Price × Rate ÷ 100",
                        "2. Sale Price = Original Price − Discount",
                        "3. Original Price = Sale Price + Discount",
                        "4. Discount Rate = (Discount ÷ Original Price) × 100%",
                        "Remember: These formulas work together!"
                    )
                ),

                Slide.PracticeSlide(
                    id = 14,
                    question = "A bag originally costs ₱1,200 with a 25% discount. What is the sale price?",
                    options = listOf("₱900", "₱800", "₱950", "₱1,000"),
                    correctAnswer = 0,
                    explanation = "Correct! Discount = 1,200 × 0.25 = ₱300. Sale Price = 1,200 − 300 = ₱900"
                ),

                Slide.SummarySlide(
                    id = 15,
                    title = "Summary",
                    keyPoints = listOf(
                        "Original Price: \n • The initial price before any discount \n • Also called regular or marked price",
                        "Discount: \n • Amount subtracted from original price \n • Usually a percentage of original price",
                        "Discount Rate: \n • Percentage of reduction \n • Expressed with % symbol",
                        "Sale Price: \n • Final price after discount \n • Amount buyer actually pays \n • Formula: Original Price − Discount",
                        "Key: Discount and Sale Price depend on Original Price!"
                    )
                )
            )
        )
    }

    // LESSON 4 - SUBTOPIC 2: Solving Markup Price
    private fun getQuarter2Lesson4Subtopic2(): InteractiveLesson {
        return InteractiveLesson(
            id = 37,
            title = "Solving Markup Price",
            slides = listOf(
                Slide.IntroSlide(
                    id = 1,
                    title = "Welcome!",
                    content = "In this topic you will learn to solve markup price. Understand how sellers add profit to items they sell!"
                ),

                Slide.ConceptSlide(
                    id = 2,
                    title = "What is Markup Price?",
                    content = "Markup price is the amount added to the cost price of an item to get its selling price. It is usually expressed as a percentage of the cost price.",
                    keyPoints = listOf(
                        "The profit added by the seller",
                        "Added to the cost to get selling price",
                        "Expressed as a percentage",
                        "Helps businesses make profit"
                    )
                ),

                Slide.ConceptSlide(
                    id = 3,
                    title = "Understanding Markup",
                    content = "In some cases, sellers add a specific amount to the price of items or goods they are selling to earn a profit.",
                    keyPoints = listOf(
                        "Markup (M) is the increase in price",
                        "Markup Rate (MR) is the percentage added",
                        "Cost (C) is the original price",
                        "Selling Price includes cost + markup"
                    )
                ),

                Slide.ConceptSlide(
                    id = 4,
                    title = "Formula for Markup Rate",
                    content = "To find the markup rate (percentage):",
                    keyPoints = listOf(
                        "Markup Rate (MR) = (Markup ÷ Cost) × 100%",
                        "Or written as: \n R = (M ÷ C) × 100%",
                        "This tells you what percent profit you're making"
                    )
                ),

                Slide.ExampleSlide(
                    id = 5,
                    title = "Example 1 solving Markup Rate",
                    problem = "A bag costs ₱500 and is sold with a markup of ₱100. What is the markup rate?",
                    steps = listOf(
                        "Solution:",
                        "MR = (M ÷ C) × 100%",
                        "MR = (100 ÷ 500) × 100% = 20%"
                    ),
                    answer = "20%"
                ),

                Slide.ExampleSlide(
                    id = 6,
                    title = "Example 2 solving Markup Rate",
                    problem = "A notebook has a cost of ₱80. The seller adds a markup of ₱20. Find the markup rate.",
                    steps = listOf(
                        "Solution:",
                        "MR = (20 ÷ 80) × 100% = 25%"
                    ),
                    answer = "25%"
                ),

                Slide.ExampleSlide(
                    id = 7,
                    title = "Example 3 solving Markup Rate",
                    problem = "A shirt costs ₱400 and has a markup of ₱60. What is the markup rate?",
                    steps = listOf(
                        "Solution:",
                        "MR = (60 ÷ 400) × 100% = 15%"
                    ),
                    answer = "15%"
                ),

                Slide.ConceptSlide(
                    id = 8,
                    title = "Formula for Selling Price",
                    content = "To find what the customer pays:",
                    keyPoints = listOf(
                        "Selling Price (SP) = Cost (C) + Markup (M)",
                        "Or: SP = C + M",
                        "Example: \n Cost: ₱10,000 \n Markup: ₱2,000 \n Selling Price: ₱10,000 + ₱2,000 = ₱12,000"
                    )
                ),

                Slide.ExampleSlide(
                    id = 9,
                    title = "Complete Example",
                    problem = "A laptop costs ₱25,000. A store adds a 30% markup. What is the selling price?",
                    steps = listOf(
                        "Given: \n Cost (C) = ₱25,000 \n Markup Rate (MR) = 30%",
                        "Step 1: Find the markup amount",
                        "Markup = Cost × Markup Rate \n M = 25,000 × 30% \n M = 25,000 × 0.30 \n M = ₱7,500",
                        "Step 2: Find selling price \n SP = C + M \n SP = 25,000 + 7,500 \n SP = ₱32,500"
                    ),
                    answer = "Selling Price = ₱32,500"
                ),

                Slide.ExampleSlide(
                    id = 10,
                    title = "Example 1 solving Sale Price",
                    problem = "A toy costs ₱350 and has a markup of ₱50. What is the selling price?",
                    steps = listOf(
                        "Solution:",
                        "SP = C + M",
                        "SP = 350 + 50 = ₱400"
                    ),
                    answer = ""
                ),

                Slide.ExampleSlide(
                    id = 11,
                    title = "Example 2 solving Sale Price",
                    problem = "A pair of slippers costs ₱180 with a markup of ₱20. Find the selling price.",
                    steps = listOf(
                        "Solution:",
                        "SP = C + M",
                        "SP = 180 + 20 = ₱200"
                    ),
                    answer = ""
                ),

                Slide.ExampleSlide(
                    id = 12,
                    title = "Example 3 solving Sale Price",
                    problem = "A backpack costs ₱600 and has a markup of ₱90. What is the selling price?",
                    steps = listOf(
                        "Solution:",
                        "SP = C + M",
                        "SP = 600 + 90 = ₱690"
                    ),
                    answer = ""
                ),

                Slide.PracticeSlide(
                    id = 13,
                    question = "True or False: Markup price is the amount added to the cost price of an item to get its selling price.",
                    options = listOf("True", "False"),
                    correctAnswer = 0,
                    explanation = "Correct! Markup is added to the cost to determine the selling price."
                ),

                Slide.PracticeSlide(
                    id = 14,
                    question = "A shirt costs ₱200. With a 40% markup, what is the selling price?",
                    options = listOf("₱240", "₱260", "₱280", "₱300"),
                    correctAnswer = 2,
                    explanation = "Correct! Markup = 200 × 0.40 = ₱80. Selling Price = 200 + 80 = ₱280"
                ),

                Slide.ConceptSlide(
                    id = 15,
                    title = "Finding Cost from Selling Price",
                    content = "Sometimes you need to work backwards:",
                    keyPoints = listOf(
                        "If you know selling price and markup rate:",
                        "Cost = Selling Price ÷ (1 + Markup Rate)",
                        "Example: \n Selling Price = ₱150, Markup = 25%",
                        "Cost = 150 ÷ (1 + 0.25)",
                        "Cost = 150 ÷ 1.25 = ₱120"
                    )
                ),

                Slide.SummarySlide(
                    id = 16,
                    title = "Summary",
                    keyPoints = listOf(
                        "Key Terms: \n • Markup (M) - increase in price \n • Markup Rate (MR) - percentage added \n • Cost (C) - original/buying price \n • Selling Price (SP) - final price to customer",
                        "Key Formulas: \n • Markup Rate = (Markup ÷ Cost) × 100% \n • Selling Price = Cost + Markup \n • Markup = Cost × Markup Rate",
                        "Remember: \n Markup is how businesses make profit! \n The markup and selling price are based on cost"
                    )
                )
            )
        )
    }

    // LESSON 4 - SUBTOPIC 3: Solving Commission
    private fun getQuarter2Lesson4Subtopic3(): InteractiveLesson {
        return InteractiveLesson(
            id = 38,
            title = "Solving Commission",
            slides = listOf(
                Slide.IntroSlide(
                    id = 1,
                    title = "Hello!",
                    content = "In this lesson you will learn to solve commission. Understand how salespeople earn money from their sales!"
                ),

                Slide.ConceptSlide(
                    id = 2,
                    title = "What is Commission?",
                    content = "When someone sells your product, you need to compensate them for their effort, either by giving them a specific amount of money or a certain percentage of the sales. This amount is called a Commission.",
                    keyPoints = listOf(
                        "Payment for selling something",
                        "Usually a percentage of sales",
                        "Motivates salespeople to sell more",
                        "Common in retail and real estate"
                    )
                ),

                Slide.ConceptSlide(
                    id = 3,
                    title = "Key Terms",
                    content = "Review these important terms:",
                    keyPoints = listOf(
                        "Commission (C): \n • The money earned for selling",
                        "Total Sales (TS): \n • Total amount of sales made",
                        "Commission Rate (CR): \n • Percentage from total sales",
                        "Sale Proceeds (SP): \n • Amount remaining after commission deducted"
                    )
                ),

                Slide.ConceptSlide(
                    id = 4,
                    title = "Formula for Commission",
                    content = "To calculate commission earned:",
                    keyPoints = listOf(
                        "Commission = Total Sales × Commission Rate ÷ 100",
                        "Or using decimal: \n Commission = Total Sales × (Rate as decimal)",
                        "Example: \n Total Sales = ₱10,000 \n Rate = 5% \n Commission = 10,000 × 0.05 = ₱500"
                    )
                ),

                Slide.ExampleSlide(
                    id = 5,
                    title = "Example 1 solving Commission",
                    problem = "A salesperson made total sales of ₱20,000 and earned a 5% commission. How much is the commission?",
                    steps = listOf(
                        "Solution:",
                        "Commission = Total sales × Commission rate",
                        "Commission = 20,000 × 5% = ₱1,000"
                    ),
                    answer = "₱1,000"
                ),

                Slide.ExampleSlide(
                    id = 6,
                    title = "Example 2 solving Commission",
                    problem = "An agent sold products worth ₱45,000 with a 4% commission rate. Find the commission.",
                    steps = listOf(
                        "Solution:",
                        "Commission = Total sales × Commission rate",
                        "Commission = 45,000 × 4% = ₱1,800"
                    ),
                    answer = "₱1,800"
                ),

                Slide.ConceptSlide(
                    id = 7,
                    title = "Formula for Sale Proceeds",
                    content = "To find what remains after commission:",
                    keyPoints = listOf(
                        "Sale Proceeds = Total Sales − Commission",
                        "This is the amount the company keeps",
                        "Example: \n Total Sales = ₱50,000 \n Commission = ₱3,000 \n Sale Proceeds = 50,000 − 3,000 = ₱47,000"
                    )
                ),

                Slide.ExampleSlide(
                    id = 8,
                    title = "Example 1 solving Sale Proceeds",
                    problem = "A salesperson made total sales of ₱30,000 and earned a commission of ₱3,000. How much are the sale proceeds?",
                    steps = listOf(
                        "Solution:",
                        "Sale Proceeds = Total Sales − Commission",
                        "Sale Proceeds = 30,000 − 3,000 = ₱27,000"
                    ),
                    answer = "₱27,000"
                ),

                Slide.ExampleSlide(
                    id = 9,
                    title = "Example 2 solving Sale Proceeds",
                    problem = "An agent sold items worth ₱18,500 and received a commission of ₱1,850. Find the sale proceeds.",
                    steps = listOf(
                        "Solution:",
                        "Sale Proceeds = Total Sales − Commission",
                        "Sale Proceeds = 18,500 − 1,850 = ₱16,650"
                    ),
                    answer = "₱16,650"
                ),

                Slide.ExampleSlide(
                    id = 10,
                    title = "Example 1 solving Total Sales",
                    problem = "A salesperson earned a ₱2,400 commission at a 6% commission rate. What is the total sales?",
                    steps = listOf(
                        "Solution:",
                        "Total Sales = (Commission ÷ Commission Rate) × 100",
                        "Total Sales = (2,400 ÷ 6) × 100 = ₱40,000"
                    ),
                    answer = "₱40,000"
                ),

                Slide.ExampleSlide(
                    id = 11,
                    title = "Example 2 solving Total Sales",
                    problem = "An agent received a ₱1,500 commission with a 5% commission rate. Find the total sales.",
                    steps = listOf(
                        "Solution:",
                        "Total Sales = (1,500 ÷ 5) × 100 = ₱30,000"
                    ),
                    answer = "₱30,000"
                ),

                Slide.ConceptSlide(
                    id = 12,
                    title = "Formula for Total Sales",
                    content = "If you know commission and rate, find total sales:",
                    keyPoints = listOf(
                        "Total Sales = Commission ÷ Commission Rate × 100",
                        "Or:",
                        "Total Sales = Commission ÷ (Rate as decimal)",
                        "Example: \n Commission = ₱2,000 \n Rate = 5% \n Total Sales = 2,000 ÷ 0.05 = ₱40,000"
                    )
                ),

                Slide.PracticeSlide(
                    id = 13,
                    question = "True or False: When someone sells your product, you need to compensate them for their effort. This amount is called a Commission.",
                    options = listOf("True", "False"),
                    correctAnswer = 0,
                    explanation = "Correct! Commission is the payment given to someone for selling products or services."
                ),

                Slide.PracticeSlide(
                    id = 14,
                    question = "A salesperson earned ₱4,500 commission from ₱90,000 in sales. What was the commission rate?",
                    options = listOf("4%", "5%", "6%", "7%"),
                    correctAnswer = 1,
                    explanation = "Correct! Rate = (Commission ÷ Total Sales) × 100 = (4,500 ÷ 90,000) × 100 = 5%"
                ),

                Slide.SummarySlide(
                    id = 15,
                    title = "Summary",
                    keyPoints = listOf(
                        "Key Terms: \n • Commission (C) - money earned from selling \n • Total Sales (TS) - total amount sold \n • Commission Rate (CR) - percentage earned \n • Sale Proceeds (SP) - amount after commission",
                        "Key Formulas: \n • Commission = Total Sales × Rate ÷ 100 \n • Sale Proceeds = Total Sales − Commission \n • Total Sales = Commission ÷ Rate × 100",
                        "Remember: \n Commission and sale proceeds are based on total sales!"
                    )
                )
            )
        )
    }

    // LESSON 4 - SUBTOPIC 4: Solving Sales Tax
    private fun getQuarter2Lesson4Subtopic4(): InteractiveLesson {
        return InteractiveLesson(
            id = 39,
            title = "Solving Sales Tax",
            slides = listOf(
                Slide.IntroSlide(
                    id = 1,
                    title = "Welcome!",
                    content = "In this topic you will learn to solve sales tax. Understand what VAT or Sales Tax means on your receipts!"
                ),

                Slide.ConceptSlide(
                    id = 2,
                    title = "What is Sales Tax?",
                    content = "When you purchase products at fast food restaurants, supermarkets, and other stores, you may notice that your receipt includes a Value Added Tax (VAT) or Sales Tax.",
                    keyPoints = listOf(
                        "Tax added to purchases",
                        "Goes to the government",
                        "Usually shown on receipts",
                        "VAT is common in the Philippines (12%)",
                        "Makes items cost more than listed price"
                    )
                ),

                Slide.ConceptSlide(
                    id = 3,
                    title = "Formula for Sales Tax",
                    content = "To calculate the tax amount:",
                    keyPoints = listOf(
                        "Sales Tax = Total Amount of Products × Rate of Sales Tax ÷ 100",
                        "Or using decimal: \n Sales Tax = Total Amount × (Rate as decimal)",
                        "Example: \n Items cost ₱1,000 \n Tax rate = 12% \n Sales Tax = 1,000 × 0.12 = ₱120"
                    )
                ),

                Slide.ExampleSlide(
                    id = 4,
                    title = "Example 1 solving Sales Tax",
                    problem = "The total amount of products bought is ₱2,000 and the sales tax rate is 12%. How much is the sales tax?",
                    steps = listOf(
                        "Solution:",
                        "Sales Tax = Total Amount × Rate",
                        "Sales Tax = 2,000 × 12% = ₱240"
                    ),
                    answer = "₱240"
                ),

                Slide.ExampleSlide(
                    id = 5,
                    title = "Example 2 solving Sales Tax",
                    problem = "A customer bought items worth ₱1,500 with a 10% sales tax rate. Find the sales tax.",
                    steps = listOf(
                        "Solution:",
                        "Sales Tax = Total Amount × Rate",
                        "Sales Tax = 1,500 × 10% = ₱150"
                    ),
                    answer = "₱150"
                ),

                Slide.ExampleSlide(
                    id = 6,
                    title = "Example 3 solving Sales Tax",
                    problem = "The total cost of goods is ₱3,800 and the sales tax rate is 8%. What is the sales tax?",
                    steps = listOf(
                        "Solution:",
                        "Sales Tax = Total Amount × Rate",
                        "Sales Tax = 3,800 × 8% = ₱304"
                    ),
                    answer = "₱304"
                ),

                Slide.ConceptSlide(
                    id = 7,
                    title = "Computing Total Amount to Pay",
                    content = "To find what you actually pay:",
                    keyPoints = listOf(
                        "Total Amount to be Paid = Total Amount of Products + Sales Tax",
                        "This is what appears on your receipt",
                        "Example: \n Products = ₱850 \n Sales Tax = ₱102 \n Total to Pay = 850 + 102 = ₱952"
                    )
                ),

                Slide.ExampleSlide(
                    id = 8,
                    title = "Complete Example",
                    problem = "A laptop costs ₱25,000. With 12% sales tax, what is the total amount you need to pay?",
                    steps = listOf(
                        "Given: \n Product Price = ₱25,000 \n Sales Tax Rate = 12%",
                        "Step 1: Calculate sales tax \n Sales Tax = 25,000 × 12% \n Sales Tax = 25,000 × 0.12 \n Sales Tax = ₱3,000",
                        "Step 2: Calculate total amount \n Total = Product Price + Sales Tax \n Total = 25,000 + 3,000 \n Total = ₱28,000"
                    ),
                    answer = "Total amount to pay = ₱28,000"
                ),

                Slide.PracticeSlide(
                    id = 9,
                    question = "True or False: When you purchase products at stores, your receipt includes a Value Added Tax (VAT) or Sales Tax.",
                    options = listOf("True", "False"),
                    correctAnswer = 0,
                    explanation = "Correct! Sales tax or VAT is commonly added to purchases and shown on receipts."
                ),

                Slide.PracticeSlide(
                    id = 10,
                    question = "A phone costs ₱15,000. With 12% sales tax, how much tax do you pay?",
                    options = listOf("₱1,500", "₱1,800", "₱2,000", "₱1,200"),
                    correctAnswer = 1,
                    explanation = "Correct! Sales Tax = 15,000 × 0.12 = ₱1,800"
                ),

                Slide.ConceptSlide(
                    id = 11,
                    title = "Quick Method",
                    content = "Shortcut to find total with tax:",
                    keyPoints = listOf(
                        "Instead of two steps, use one: \n Total = Price × (1 + Tax Rate)",
                        "Example with 12% tax: \n Total = Price × 1.12",
                        "For ₱25,000: \n Total = 25,000 × 1.12 = ₱28,000",
                        "This combines both steps!"
                    )
                ),

                Slide.SummarySlide(
                    id = 12,
                    title = "Summary: Key Points in Solving Sales Tax",
                    keyPoints = listOf(
                        "Sales Tax: \n • Extra charge added to purchases \n • Goes to government \n • Usually a fixed percentage",
                        "Formulas: \n • Sales Tax = Price × Rate ÷ 100 \n • Total to Pay = Price + Sales Tax \n • Quick: Total = Price × (1 + Rate)",
                        "Key Steps: \n 1. Convert percentage to decimal \n 2. Multiply to find tax amount \n 3. Add tax to original price \n 4. Check: Total should be higher than original!"
                    )
                )
            )
        )
    }

    // LESSON 4 - SUBTOPIC 5: Solving Simple Interest and Principal
    private fun getQuarter2Lesson4Subtopic5(): InteractiveLesson {
        return InteractiveLesson(
            id = 40,
            title = "Solving Simple Interest and Principal",
            slides = listOf(
                Slide.IntroSlide(
                    id = 1,
                    title = "Welcome!",
                    content = "In this topic you will learn to solve Simple Interest and Principal. Understand how banks pay you for saving money!"
                ),

                Slide.ConceptSlide(
                    id = 2,
                    title = "What is Simple Interest?",
                    content = "Have you ever wondered why your parents save money in the bank? When your mother or father deposits their money into a savings account, the bank pays them a small amount for using their funds. This payment is known as Interest.",
                    keyPoints = listOf(
                        "Money earned from savings",
                        "Banks pay you for keeping money with them",
                        "Also applies to loans (you pay interest)",
                        "Simple interest = fixed percentage"
                    )
                ),

                Slide.ConceptSlide(
                    id = 3,
                    title = "Key Terms",
                    content = "Review these important terms:",
                    keyPoints = listOf(
                        "Interest (I): \n • Money earned from savings/loans",
                        "Principal (P): \n • Initial amount deposited/borrowed",
                        "Rate of Interest (R): \n • Percentage added to principal",
                        "Time (T): \n • Duration (usually in years)",
                        "Amount Due (AD): \n • Total to pay/receive = Principal + Interest"
                    )
                ),

                Slide.ConceptSlide(
                    id = 4,
                    title = "Formula for Simple Interest",
                    content = "To calculate interest earned or paid:",
                    keyPoints = listOf(
                        "Simple Interest = Principal × Rate × Time \n Or: I = P × R × T",
                        "Where: \n • I = Interest \n • P = Principal \n • R = Rate (as decimal) \n • T = Time (in years)",
                        "Example: \n P = ₱10,000, R = 5% per year, T = 2 years \n I = 10,000 × 0.05 × 2 = ₱1,000"
                    )
                ),

                Slide.ExampleSlide(
                    id = 5,
                    title = "Example 1 solving Simple Interest",
                    problem = "Maria borrowed ₱10,000 at an interest rate of 5% per year for 2 years. How much is the simple interest?",
                    steps = listOf(
                        "Solution:",
                        "SI = P × R × T",
                        "SI = 10,000 × 5% × 2 = ₱1,000"
                    ),
                    answer = "₱1,000"
                ),

                Slide.ExampleSlide(
                    id = 6,
                    title = "Example 2 solving Simple Interest",
                    problem = "A loan of ₱6,000 earns 4% simple interest in 3 years. Find the simple interest.",
                    steps = listOf(
                        "Solution:",
                        "SI = P × R × T",
                        "SI = 6,000 × 4% × 3 = ₱720"
                    ),
                    answer = "₱720"
                ),

                Slide.ExampleSlide(
                    id = 7,
                    title = "Example 3 solving Simple Interest",
                    problem = "John invested ₱8,500 at 6% simple interest for 1 year. What is the simple interest?",
                    steps = listOf(
                        "Solution:",
                        "SI = P × R × T",
                        "SI = 8,500 × 6% × 1 = ₱510"
                    ),
                    answer = "₱510"
                ),

                Slide.ConceptSlide(
                    id = 8,
                    title = "Formula for Principal",
                    content = "If you know the interest, rate, and time:",
                    keyPoints = listOf(
                        "Principal = Interest ÷ (Rate × Time) \n Or: P = I ÷ (R × T)",
                        "This tells you how much was initially deposited",
                        "Example: \n I = ₱600, R = 4%, T = 3 years \n P = 600 ÷ (0.04 × 3) \n P = 600 ÷ 0.12 = ₱5,000"
                    )
                ),

                Slide.ExampleSlide(
                    id = 7,
                    title = "Example: Finding Principal",
                    problem = "Someone earned ₱2,400 interest at 6% per year for 4 years. What was the principal amount?",
                    steps = listOf(
                        "Given: \n Interest (I) = ₱2,400 \n Rate (R) = 6% = 0.06 \n Time (T) = 4 years",
                        "Using the formula: \n Principal = Interest ÷ (Rate × Time) \n P = I ÷ (R × T) \n P = 2,400 ÷ (0.06 × 4) \n P = 2,400 ÷ 0.24 \n P = ₱10,000",
                        "The principal amount was ₱10,000"
                    ),
                    answer = "Principal = ₱10,000"
                ),

                Slide.ConceptSlide(
                    id = 8,
                    title = "Finding Amount Due",
                    content = "Total amount after adding interest:",
                    keyPoints = listOf(
                        "Amount Due = Principal + Interest \n Or: AD = P + I",
                        "This is the total you receive (savings) \n Or total you pay (loan)",
                        "Example: \n Principal = ₱5,000 \n Interest = ₱600",
                        "Amount Due = 5,000 + 600 = ₱5,600"
                    )
                ),

                Slide.ExampleSlide(
                    id = 9,
                    title = "Example 1 solving Principal",
                    problem = "A borrower earned ₱1,200 simple interest at 6% per year for 4 years. What was the principal?",
                    steps = listOf(
                        "Solution:",
                        "P = I ÷ (R × T)",
                        "P = 1,200 ÷ (6% × 4) = ₱5,000"
                    ),
                    answer = "₱5,000"
                ),

                Slide.ExampleSlide(
                    id = 10,
                    title = "Example 2 solving Principal",
                    problem = "An investment earned ₱900 simple interest at 5% for 3 years. Find the principal.",
                    steps = listOf(
                        "Solution:",
                        "P = I ÷ (R × T)",
                        "P = 900 ÷ (5% × 3) = ₱6,000"
                    ),
                    answer = "₱6,000"
                ),

                Slide.ExampleSlide(
                    id = 11,
                    title = "Example 3 solving Principal",
                    problem = "A loan earned ₱2,400 simple interest at 8% per year for 5 years. What is the principal?",
                    steps = listOf(
                        "Solution:",
                        "P = I ÷ (R × T)",
                        "P = 2,400 ÷ (8% × 5) = ₱6,000"
                    ),
                    answer = "₱6,000"
                ),

                Slide.PracticeSlide(
                    id = 12,
                    question = "True or False: When your parents deposit money into a savings account, the bank pays them a small amount for using their funds. This payment is known as Interest.",
                    options = listOf("True", "False"),
                    correctAnswer = 0,
                    explanation = "Correct! Interest is the money earned from keeping savings in a bank, or the extra money paid when borrowing."
                ),

                Slide.PracticeSlide(
                    id = 13,
                    question = "Find the simple interest: P = ₱8,000, R = 5%, T = 3 years",
                    options = listOf("₱1,000", "₱1,200", "₱1,500", "₱2,000"),
                    correctAnswer = 1,
                    explanation = "Correct! I = P × R × T = 8,000 × 0.05 × 3 = ₱1,200"
                ),

                Slide.ConceptSlide(
                    id = 14,
                    title = "Other Formulas",
                    content = "Additional formulas you might need:",
                    keyPoints = listOf(
                        "Finding Rate: \n R = I ÷ (P × T)",
                        "Finding Time: \n T = I ÷ (P × R)",
                        "These help when you need to find",
                        "the interest rate or time period",
                        "All formulas come from: I = P × R × T"
                    )
                ),

                Slide.SummarySlide(
                    id = 15,
                    title = "Summary",
                    keyPoints = listOf(
                        "Key Terms: \n • Interest (I) - money earned/paid \n • Principal (P) - initial amount \n • Rate (R) - percentage (as decimal) \n • Time (T) - duration in years \n • Amount Due (AD) - principal + interest",
                        "Key Formulas: \n • Simple Interest = P × R × T \n • Principal = I ÷ (R × T) \n • Amount Due = P + I",
                        "Remember: \n • Convert percentage to decimal (5% = 0.05) \n • Time must be in years \n • Simple interest is calculated only on principal"
                    )
                )
            )
        )
    }

    // LESSON 5 - SUBTOPIC 1: Exponent and Base
    private fun getQuarter2Lesson5Subtopic1(): InteractiveLesson {
        return InteractiveLesson(
            id = 41,
            title = "Exponent and Base",
            slides = listOf(
                Slide.IntroSlide(
                    id = 1,
                    title = "Hey there!!",
                    content = "In this topic, you will learn to understand exponents and bases and how to write and evaluate numbers in exponential notation."
                ),

                Slide.ConceptSlide(
                    id = 2,
                    title = "What is Exponent?",
                    content = "An exponent indicates the power to which the base is raised. For example, in 3², 3 is the base, and 2 is the exponent. The exponent tells you how many times to multiply the base by itself.",
                    keyPoints = listOf()
                ),

                Slide.ExampleSlide(
                    id = 3,
                    title = "Try to multiply the base on its exponent",
                    problem = "Example 1: 4²",
                    steps = listOf(
                        "Therefore you can multiply the base or 4, 2 times: 4 × 4 = 16"
                    ),
                    answer = "4 × 4 = 16"
                ),

                Slide.ExampleSlide(
                    id = 4,
                    title = "Try to multiply the base on its exponent",
                    problem = "Example 2: 3²",
                    steps = listOf(
                        "Therefore, you multiply the base 3, 2 times: 3 × 3 = 9"
                    ),
                    answer = "3 × 3 = 9"
                ),

                Slide.ExampleSlide(
                    id = 5,
                    title = "Try to multiply the base on its exponent",
                    problem = "Example 3: 5²",
                    steps = listOf(
                        "Therefore, you multiply the base 5, 2 times: 5 × 5 = 25"
                    ),
                    answer = "5 × 5 = 25"
                ),

                Slide.ConceptSlide(
                    id = 6,
                    title = "Additional",
                    content = "Base with the value of positive integers but NOT equal to zero, that raise to zero is 1.\n\nExample: n⁰ = 1",
                    keyPoints = listOf()
                ),

                Slide.ExampleSlide(
                    id = 7,
                    title = "Exponential Notation",
                    problem = "If you write and evaluate the exponential notation, example 5 × 5 × 5",
                    steps = listOf(
                        "Solution:",
                        "5³ the base is 5 and exponent is 3",
                        "Use 5 as a base as a factor 3 times; therefore: 5 × 5 × 5"
                    ),
                    answer = "5 × 5 × 5"
                ),

                Slide.PracticeSlide(
                    id = 8,
                    question = "What is 2⁴?\n\nChoose your answer:",
                    options = listOf("16", "32", "6", "8"),
                    correctAnswer = 0,
                    explanation = "Correct! The answer is 16"
                ),

                Slide.PracticeSlide(
                    id = 9,
                    question = "What is 10 × 10 × 10?\n\nChoose your answer:",
                    options = listOf("10", "20", "100", "1000"),
                    correctAnswer = 3,
                    explanation = "Correct! The answer is 1000"
                ),

                Slide.SummarySlide(
                    id = 10,
                    title = "Summary",
                    keyPoints = listOf(
                        "Exponents show how many times a base is multiplied by itself. Any positive base raised to the zero exponent equals 1"
                    )
                )
            )
        )
    }

    // LESSON 6 - SUBTOPIC 1: GEMDAS/PEMDAS
    private fun getQuarter2Lesson6Subtopic1(): InteractiveLesson {
        return InteractiveLesson(
            id = 42,
            title = "GEMDAS - Order of Operations",
            slides = listOf(
                Slide.IntroSlide(
                    id = 1,
                    title = "Welcome!!",
                    content = "In this topic you will learn to correctly solve numerical expressions by applying the GEMDAS/PEMDAS order of operations."
                ),

                Slide.ConceptSlide(
                    id = 2,
                    title = "What does GEMDAS stand for?",
                    content = "",
                    keyPoints = listOf(
                        "G - Grouping symbols, which include parentheses ( ), brackets [ ], and braces { }",
                        "E - Exponents",
                        "M - Multiplication",
                        "D - Division",
                        "A - Addition",
                        "S - Subtraction"
                    )
                ),

                Slide.ConceptSlide(
                    id = 3,
                    title = "What does PEMDAS stand for?",
                    content = "",
                    keyPoints = listOf(
                        "Parenthesis",
                        "Exponent 2³",
                        "Multiplication",
                        "Division",
                        "Addition",
                        "Subtraction",
                        "Note: In multiplication and division whichever comes first the operation from left to right. Also in addition and subtraction"
                    )
                ),

                Slide.ExampleSlide(
                    id = 4,
                    title = "Example",
                    problem = "Let's take an attention with this example\n4 + 1 × 5\n\nAt first look, many people mistakenly perform calculations without applying the PEMDAS rule, often leading to completely incorrect results and misinterpretations.",
                    steps = listOf(
                        "4 + 1 × 5",
                        "4 + 1 = 5",
                        "5 × 5 = 25 the answer is wrong"
                    ),
                    answer = ""
                ),

                Slide.ExampleSlide(
                    id = 5,
                    title = "Using PEMDAS",
                    problem = "Example 1: 4 + 1 × 5",
                    steps = listOf(
                        "Step 1: Follow the PEMDAS rule. In this expression, there are no parentheses or exponents, so the next step is to perform multiplication",
                        "Step 2: 4 + 1 × 5 therefore 1 × 5 is 5",
                        "Step 3: PEMDAS Next is Addition or subtraction whichever comes first from left to right. Therefore 4 + 1 × 5 is equal to\n4 + 5\n4 + 5 = 9 is the correct answer"
                    ),
                    answer = ""
                ),

                Slide.ExampleSlide(
                    id = 6,
                    title = "Using PEMDAS",
                    problem = "Example 2: 7 + 2 × 3",
                    steps = listOf(
                        "Step 1: Follow the PEMDAS rule. In this expression, there are no parentheses or exponents, so the next step is to perform multiplication",
                        "Step 2: 7 + 2 × 3 → 2 × 3 = 6",
                        "Step 3: PEMDAS Next is Addition or subtraction whichever comes first from left to right. Therefore 7 + 2 × 3 is equal to\n7 + 6\n7 + 6 = 13 is the correct answer"
                    ),
                    answer = ""
                ),

                Slide.ExampleSlide(
                    id = 7,
                    title = "Using PEMDAS",
                    problem = "Example 3: 10 − 2 × 4",
                    steps = listOf(
                        "Step 1: Follow the PEMDAS rule. In this expression, there are no parentheses or exponents, so the next step is to perform multiplication",
                        "Step 2: 10 − 2 × 4 → 2 × 4 = 8",
                        "Step 3: PEMDAS Next is Addition or subtraction whichever comes first from left to right. Therefore 10 − 2 × 4 is equal to\n10 - 8\n10 - 8 = 2 is the correct answer"
                    ),
                    answer = ""
                ),

                Slide.ExampleSlide(
                    id = 8,
                    title = "Using PEMDAS",
                    problem = "Example: 4² + 4(4 − 2) − 2",
                    steps = listOf(
                        "Step 1: Observe PEMDAS we have parenthesis in this expression\n4² + 4(4 − 2) − 2\n4² + 4(2) − 2",
                        "Step 2: We have an exponent in this expression PEMDAS\n4² + 4(2) − 2\n16 + 4(2) − 2",
                        "Step 3: We have an Multiplication in this expression PEMDAS\n16 + 4(2) − 2\n16 + 8 − 2",
                        "Step 4: Operate Addition and subtraction whichever comes first from left to right\n16 + 8 − 2\n24 − 2 = 22 is the correct answer"
                    ),
                    answer = ""
                ),

                Slide.PracticeSlide(
                    id = 9,
                    question = "8 - 3 × 1 = ?\n\nChoose your answer:",
                    options = listOf("12", "5", "4", "6"),
                    correctAnswer = 1,
                    explanation = "Correct! The answer is 5"
                ),

                Slide.PracticeSlide(
                    id = 10,
                    question = "1 + 9 - (4 ÷ 2) = ?\n\nChoose your answer:",
                    options = listOf("8", "7", "6", "5"),
                    correctAnswer = 0,
                    explanation = "Correct! The answer is 8"
                ),

                Slide.SummarySlide(
                    id = 11,
                    title = "Summary",
                    keyPoints = listOf(
                        "GEMDAS/PEMDAS guides the correct order of solving expressions. It stands for grouping symbols or parentheses, exponents, multiplication and division, then addition and subtraction from left to right. This rule helps avoid mistakes and ensures accurate answers"
                    )
                )
            )
        )
    }

    // LESSON 7 - SUBTOPIC 1: Integers
    private fun getQuarter2Lesson7Subtopic1(): InteractiveLesson {
        return InteractiveLesson(
            id = 43,
            title = "Understanding Integers",
            slides = listOf(
                Slide.IntroSlide(
                    id = 1,
                    title = "Hi!!",
                    content = "In this lesson, you will learn what integers are, how to identify them on a number line, and how opposite integers work."
                ),

                Slide.ConceptSlide(
                    id = 2,
                    title = "What is an integer?",
                    content = "Integers include all natural numbers (also called counting numbers), their negative, opposites, additive inverses, and the number zero.",
                    keyPoints = listOf()
                ),

                Slide.ConceptSlide(
                    id = 3,
                    title = "Example of Integer",
                    content = "-5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5",
                    keyPoints = listOf()
                ),

                Slide.ConceptSlide(
                    id = 4,
                    title = "Reminder",
                    content = "Integers do not include fractions or decimals.\n\nExample: 1/2 and 0.420",
                    keyPoints = listOf()
                ),

                Slide.ConceptSlide(
                    id = 5,
                    title = "What is a Number Line and how to use it?",
                    content = "A number line is a straight, horizontal line with numbers placed at evenly spaced intervals, used to visually represent real numbers and their relationships.",
                    imageResourceId = R.drawable.number_line_opposites,
                    keyPoints = listOf()
                ),

                Slide.ConceptSlide(
                    id = 6,
                    title = "Note",
                    content = "0 is not negative or positive.",
                    imageResourceId = R.drawable.number_line_opposites,
                    keyPoints = listOf()
                ),

                Slide.ConceptSlide(
                    id = 7,
                    title = "What is the opposite number?",
                    content = "On the number line, opposite are numbers that are the same distance from 0 but are located on opposite sides of it.",
                    imageResourceId = R.drawable.number_line_opposites,
                    keyPoints = listOf()
                ),

                Slide.ConceptSlide(
                    id = 8,
                    title = "Additive Inverse Property",
                    content = "According to the additive inverse property, if you add a number to its opposite, the result will always be 0.",
                    keyPoints = listOf()
                ),

                Slide.ExampleSlide(
                    id = 9,
                    title = "Example of Opposite numbers",
                    problem = "",
                    steps = listOf(
                        "−1 + 1 = 0",
                        "−3 + 3 = 0",
                        "−5 + 5 = 0",
                        "The result will always be 0"
                    ),
                    answer = ""
                ),

                Slide.PracticeSlide(
                    id = 10,
                    question = "Practice Time!!\n\n31 is integer?\n\nChoose your answer:",
                    options = listOf("YES", "NO"),
                    correctAnswer = 0,
                    explanation = "Correct! The answer is YES"
                ),

                Slide.PracticeSlide(
                    id = 11,
                    question = "Practice Time!!\n\n0.1 is integer?\n\nChoose your answer:",
                    options = listOf("YES", "NO"),
                    correctAnswer = 1,
                    explanation = "Correct! The answer is NO"
                ),

                Slide.PracticeSlide(
                    id = 12,
                    question = "Practice Time!!\n\n\"-2 + 2\" an opposite number?\n\nChoose your answer:",
                    options = listOf("YES", "NO"),
                    correctAnswer = 0,
                    explanation = "Correct! The answer is YES"
                ),

                Slide.SummarySlide(
                    id = 13,
                    title = "Summary",
                    keyPoints = listOf(
                        "Integers are whole numbers, including positives, negatives, and zero",
                        "Integers do not include fractions or decimals",
                        "Each integer has an opposite on the number line",
                        "Adding a number to its opposite always equals zero"
                    )
                )
            )
        )
    }

    // LESSON 8 - SUBTOPIC 1: Number Line
    private fun getQuarter2Lesson8Subtopic1(): InteractiveLesson {
        return InteractiveLesson(
            id = 44,
            title = "Number Line",
            slides = listOf(
                Slide.IntroSlide(
                    id = 1,
                    title = "Good day!",
                    content = "In this topic you will learn about Number Line. You will understand how to compare and arrange integers on the number line."
                ),

                Slide.ConceptSlide(
                    id = 2,
                    title = "What is a Number Line?",
                    content = "A number line is a straight line that shows numbers in order with equal spacing, helping us see their position and compare their values.",
                    keyPoints = emptyList()
                ),

                Slide.ConceptSlide(
                    id = 3,
                    title = "Number Line",
                    content = "Examine the number line below to see where positive and negative integers are positioned. It will help you compare the integers.\n\nOPPOSITES\n−10 −9 −8 −7 −6 −5 −4 −3 −2 −1 0 +1 +2 +3 +4 +5 +6 +7 +8 +9 +10\n\nNegative Integers                    Positive Integers\n\n0 is neither negative nor positive",
                    imageResourceId = R.drawable.number_line_opposites,
                    keyPoints = emptyList()
                ),

                Slide.ConceptSlide(
                    id = 4,
                    title = "You need to know about Number Line",
                    content = "",
                    keyPoints = listOf(
                        "A number line is a straight line where numbers are arranged at equal spaces, and it can go on extended infinitely in both directions",
                        "Moving from zero to the right, the numbers increase in value. The farther right you go, the larger the numbers become",
                        "In the opposite direction, moving from zero to the left, the numbers decrease in value. The farther left you go, the smaller the numbers become"
                    )
                ),

                Slide.ConceptSlide(
                    id = 5,
                    title = "Take note",
                    content = "Positive integers are greater than zero, while negative integers are less than zero.",
                    keyPoints = emptyList()
                ),

                Slide.ExampleSlide(
                    id = 6,
                    title = "Example: Compare the following pair of integers",
                    problem = "1. +8 +10\n2. −9 −7\n3. +15 −5\n4. −4 −1\n5. +20 +18",
                    steps = listOf(
                        "1. +8 is to the left of +10, so +8 is less than +10, written as +8 < +10",
                        "2. −9 is to the left of −7, so −9 is less than −7, written as −9 < −7",
                        "3. 15 is to the right of −5, so 15 is greater than −5, written as 15 > −5",
                        "4. −4 is to the left of −1, so −4 is less than −1, written as −4 < −1",
                        "5. +20 is to the right of +18, so +20 is greater than +18, written as +20 > +18"
                    ),
                    answer = ""
                ),

                Slide.PracticeSlide(
                    id = 7,
                    question = "Compare the pair of integers.\n+10 −3\n\nChoose your answer:",
                    options = listOf(
                        "10 is to the left of −3, so 10 is less than −3, written as +10 < −3",
                        "10 is to the right of −3, so 10 is greater than −3, written as 10 > −3"
                    ),
                    correctAnswer = 1,
                    explanation = "Correct! 10 is to the right of −3, so 10 is greater than −3, written as 10 > −3"
                ),

                Slide.SummarySlide(
                    id = 8,
                    title = "Summary",
                    keyPoints = listOf(
                        "Key points to remember in Number Line:",
                        "A number line is a straight line where numbers are arranged at equal spaces, and it can go on extended infinitely in both directions",
                        "Moving from zero to the right, the numbers increase in value. The farther right you go, the larger the numbers become",
                        "In the opposite direction, moving from zero to the left, the numbers decrease in value. The farther left you go, the smaller the numbers become"
                    )
                )
            )
        )
    }

    // LESSON 9 - SUBTOPIC 1: Adding and Subtracting Integers using Algebra Tiles
    private fun getQuarter2Lesson9Subtopic1(): InteractiveLesson {
        return InteractiveLesson(
            id = 45,
            title = "Adding and Subtracting Integers using Algebra Tiles",
            slides = listOf(
                Slide.IntroSlide(
                    id = 1,
                    title = "Welcome!",
                    content = "In this topic you will learn how to interpret and describe the basic operations of integers are addition and subtraction using materials such as algebra tiles."
                ),

                Slide.ConceptSlide(
                    id = 2,
                    title = "What is Adding of Integers using Algebra tiles?",
                    content = "Adding integers using algebra tiles means combining positive tiles (for positive numbers) and negative tiles (for negative numbers). Tiles with the same sign are grouped together, and any positive–negative pairs cancel each other out. The remaining tiles show the sum.",
                    keyPoints = listOf()
                ),

                Slide.ExampleSlide(
                    id = 3,
                    title = "Adding Integers Using Algebra tiles",
                    problem = "Example:",
                    imageResourceId = R.drawable.adding_algebra_tiles_1,
                    steps = listOf(
                        "1. 3 + 6 = 9\nBlue tiles represent as positive integers, then, 3 + 6 = 9"
                    ),
                    answer = ""
                ),

                Slide.ExampleSlide(
                    id = 4,
                    title = "Adding Integers Using Algebra tiles",
                    problem = "",
                    imageResourceId = R.drawable.adding_algebra_tiles_2,
                    steps = listOf(
                        "2. −2 + (−6) = −8\nRed tiles represent as negative integers, then, −2 + (−6) = −8"
                    ),
                    answer = ""
                ),

                Slide.ExampleSlide(
                    id = 5,
                    title = "Adding Integers Using Algebra tiles",
                    problem = "3. 6 + (−3) = 3",
                    imageResourceId = R.drawable.adding_algebra_tiles_3,
                    steps = listOf(
                        "Step 1: Pair each negative tile or counter with a positive one to illustrate zero pairs, where they balance to zero",
                        "Step 2: Each pair of blue and red tiles is considered canceled out",
                        "Step 3: The remaining colors will represent your answer",
                        "The three pairs of blue and red tiles are canceled out. Therefore, the three remaining blue tiles represent the answer. Since blue tiles or counters are positive, the answer is positive 3"
                    ),
                    answer = ""
                ),

                Slide.ConceptSlide(
                    id = 6,
                    title = "What is Subtracting of Integers using Algebra tiles?",
                    content = "Subtracting integers using algebra tiles means representing positive numbers with positive tiles and negative numbers with negative tiles, then removing tiles based on the subtraction sign. If there are not enough tiles to remove, zero pairs (one positive and one negative tile) are added so the subtraction can be completed. This visual method helps students understand how integer subtraction works.",
                    keyPoints = listOf()
                ),

                Slide.ExampleSlide(
                    id = 7,
                    title = "Subtracting Integers Using Algebra tiles or positive and negative counters",
                    problem = "Example:\n\n1. 3 − (+4) or 3 − 4 = −1",
                    imageResourceId = R.drawable.subtracting_algebra_tiles_1,
                    steps = listOf(),
                    answer = ""
                ),

                Slide.ExampleSlide(
                    id = 8,
                    title = "Subtracting Integers Using Algebra tiles",
                    problem = "2. −4 − (−8)",
                    imageResourceId = R.drawable.subtracting_algebra_tiles_2,
                    steps = listOf(
                        "Step 1: Negative multiply by negative is positive\n−4 − (−8) → −4 + 8",
                        "Step 2: Rewrite the expression. Then, −4 + 8"
                    ),
                    answer = ""
                ),

                Slide.PracticeSlide(
                    id = 9,
                    question = "Practice time!\n\n8 + (−4) = ?\n\nChoose your answer:",
                    imageResourceId = R.drawable.practice_1,
                    options = listOf("+4", "-8", "+8", "-4"),
                    correctAnswer = 0,
                    explanation = "Correct! The answer is +4"
                ),

                Slide.SummarySlide(
                    id = 10,
                    title = "Summary",
                    keyPoints = listOf(
                        "Key points to remember:",
                        "Adding Integers\nSame signs: Add the numbers and keep the sign\nDifferent signs: Subtract the smaller number from the larger number and keep the sign of the bigger number (in absolute value)\nZero pairs: A positive and a negative value cancel each other out",
                        "Subtracting Integers\nSubtraction becomes addition to the opposite\nRewrite the expression before solving\nThen follow the rules of integer addition\nRemoving a positive decreases the value; removing a negative increases the value"
                    )
                )
            )
        )
    }

    // LESSON 10 - SUBTOPIC 1: Multiplication, Division, Addition, and Subtraction of Integers
    private fun getQuarter2Lesson10Subtopic1(): InteractiveLesson {
        return InteractiveLesson(
            id = 46,
            title = "Multiplication, Division, Addition, and Subtraction of Integers",
            slides = listOf(
                Slide.IntroSlide(
                    id = 1,
                    title = "Heyyy!!",
                    content = "In this lesson, you will learn how to add, subtract, multiply, and divide integers, understand the rules for positive and negative signs, and use a number line to solve integer problems correctly."
                ),

                Slide.ConceptSlide(
                    id = 2,
                    title = "Multiplication and Division",
                    content = "Operation multiplication and division are easier to understand compared to adding and subtracting integers.",
                    keyPoints = listOf()
                ),

                Slide.ConceptSlide(
                    id = 3,
                    title = "Multiplication of Integers",
                    content = "Example:\n(-5) × (-5) = 25\n-2 × 1 = -2\n\nKey points:",
                    keyPoints = listOf(
                        "when you multiply two numbers with the same sign, whether both are positive or both negative, the result is positive",
                        "However, when you multiply numbers with opposite signs, the result is negative"
                    )
                ),

                Slide.ConceptSlide(
                    id = 4,
                    title = "Division of Integers",
                    content = "It works the same way as multiplication.\n\nExample:\n5 ÷ 5 = 1\n-10 ÷ 2 = -5\n\nKey points:",
                    keyPoints = listOf(
                        "when you divide two numbers with the same sign, whether both are positive or both negative, the result is positive",
                        "However, when you divide numbers with opposite signs, the result is negative"
                    )
                ),

                Slide.PracticeSlide(
                    id = 5,
                    question = "Practice Time!!\n\n-4 × 3 = ?\n\nChoose your answer:",
                    options = listOf("-12", "6", "7", "-7"),
                    correctAnswer = 0,
                    explanation = "Correct! The answer is -12"
                ),

                Slide.PracticeSlide(
                    id = 6,
                    question = "Practice Time!!\n\n3 ÷ 1 = ?\n\nChoose your answer:",
                    options = listOf("3", "4", "-3", "-4"),
                    correctAnswer = 0,
                    explanation = "Correct! The answer is 3"
                ),

                Slide.ConceptSlide(
                    id = 7,
                    title = "Addition and Subtraction",
                    content = "It can be more challenging than multiplication and division. Many students find it confusing to understand the correct order and rules for adding and subtracting integers.",
                    keyPoints = listOf()
                ),

                Slide.ConceptSlide(
                    id = 8,
                    title = "Addition of Integers (using number line)",
                    content = "",
                    imageResourceId = R.drawable.number_line_lesson_10_1,
                    keyPoints = listOf(
                        "1. 3 + 5 = 8, the arrow starts with a positive 3 since the operation is addition; the direction of the arrow is counting 5 units to the right",
                        "2. -5 + 8 = 3, The arrow starts with -5 counting 8 units to the right",
                        "3. -7 + 3 = -4, the arrow starts with -7, counting 3 units to the right"
                    )
                ),

                Slide.ConceptSlide(
                    id = 9,
                    title = "Key points",
                    content = "",
                    keyPoints = listOf(
                        "Same Signs - Add and keep the sign\nExample: -5 + (-3) = -8",
                        "Different Signs - Subtract and keep the sign of the bigger number\nExample: -3 + 4 = 1"
                    )
                ),

                Slide.ConceptSlide(
                    id = 10,
                    title = "Subtraction of Integers (using number line)",
                    content = "",
                    imageResourceId = R.drawable.number_line_lesson_10_2,
                    keyPoints = listOf(
                        "1. 7 - 2 = 5, the arrow starts with a positive 7 since the operation is subtraction; the direction of the arrow is counting 2 units to the left",
                        "2. 3 - 8 = -5, the arrow starts with positive 3 counting 8 units to the left",
                        "3. -2 - 7 = -9, the arrow starts with negative 2, counting 7 units to the left",
                        "4. -4 - (-5), simplify it -4 + 5 = 1. Since the signs are both negative; as we mentioned earlier, negative multiplied by negative, the product is positive"
                    )
                ),

                Slide.ConceptSlide(
                    id = 11,
                    title = "Key points",
                    content = "",
                    keyPoints = listOf(
                        "Keep the first number",
                        "Change the subtraction sign to addition",
                        "Change the sign of the second number (use its opposite)",
                        "Then follow the rules for addition"
                    )
                ),

                Slide.PracticeSlide(
                    id = 12,
                    question = "Practice Time!!\n\n8 + (-4) = ?\n\nChoose your answer:",
                    options = listOf("12", "4", "-4", "-12"),
                    correctAnswer = 1,
                    explanation = "Correct! The answer is 4"
                ),

                Slide.PracticeSlide(
                    id = 13,
                    question = "Practice Time!!\n\n6 - (-3) = ?\n\nChoose your answer:",
                    options = listOf("3", "-3", "-9", "9"),
                    correctAnswer = 3,
                    explanation = "Correct! The answer is 9"
                ),

                Slide.SummarySlide(
                    id = 14,
                    title = "Summary",
                    keyPoints = listOf(
                        "Multiplication and division of integers follow sign rules: same signs give a positive answer, different signs give a negative answer",
                        "Adding integers follow sign rules: same signs add and keep the sign, different signs subtract and keep the sign of the bigger number",
                        "Subtracting integers keep the first number and change subtraction to addition. Use the opposite of the second number, then follow the addition rules"
                    )
                )
            )
        )
    }

    // LESSON 11 - SUBTOPIC 1: Routine and Non-routine Problems involving Basic Operations of Integers
    private fun getQuarter2Lesson11Subtopic1(): InteractiveLesson {
        return InteractiveLesson(
            id = 47,
            title = "Routine and Non-routine Problems involving Basic Operations of Integers",
            slides = listOf(
                Slide.IntroSlide(
                    id = 1,
                    title = "Heyyy!",
                    content = "In this lesson, you will learn how to solve both routine and non-routine problems involving the basic operations of integers, using the appropriate strategies and tools."
                ),

                Slide.ExampleSlide(
                    id = 2,
                    title = "Example word problem",
                    problem = "Sarah had a bank balance of -₱400 because she overspent last month. This month, she deposited ₱1000 into her account. What is her new balance?",
                    steps = listOf(
                        "Solution:",
                        "1. Understand\na. Given facts: starting balance = −₱400; deposit = ₱1000\nb. Asked: the new (current) bank balance after the deposit",
                        "2. Plan\na. Operation: Addition\nb. Number sentence: −400 + 1000 = N",
                        "3. Solve\nCompute 1000 + (−400). Think of it as 1000 − 400\n  1000\n − 400\n————\n  600\nSo the new balance is ₱600",
                        "4. Check\n600 − 1000 = −400\nShe deposits, which means she adds some money to her bank account"
                    ),
                    answer = ""
                ),

                Slide.ExampleSlide(
                    id = 3,
                    title = "Example 2",
                    problem = "Miko had 80 apples in her basket. She gave 10 apples to her friend. How many apples does she have left?",
                    steps = listOf(
                        "Solution:",
                        "1. Understand\na. What are the given facts: 80 apples; given away = 10 apples\nb. Asked: apples remaining",
                        "2. Plan\na. Operation: Subtraction\nb. Number sentence: 80 − 10 = N",
                        "3. Solve\n   80\n − 10\n————\n   70\nMiko has 70 apples left",
                        "4. Check\n70 + 10 = 80 → returns the original amount\nBecause she gave 10 apples to her friend, she now has 70 apples"
                    ),
                    answer = ""
                ),

                Slide.ExampleSlide(
                    id = 4,
                    title = "Example 3",
                    problem = "A farmer has 9 baskets, and each basket holds 8 apples. How many apples does the farmer have in total?",
                    steps = listOf(
                        "Solution:",
                        "1. Understand\na. Given facts: baskets = 9; apples per basket = 8\nb. Asked: total number of apples",
                        "2. Plan\na. Operation: Multiplication\nb. Number sentence: 9 × 8 = N",
                        "3. Solve\n  9\n× 8\n————\n 72\nSo total = 72 apples",
                        "4. Check\n 72\n÷ 9\n————\n  8\nEvery basket has 8 apples in it"
                    ),
                    answer = ""
                ),

                Slide.ExampleSlide(
                    id = 5,
                    title = "Example 4",
                    problem = "A teacher has 48 pencils and wants to distribute them equally among 6 students. How many pencils will each student receive?",
                    steps = listOf(
                        "Solution:",
                        "1. Understand\na. Given facts: total pencils = 48; students = 6\nb. Asked: pencils per student (equal share)",
                        "2. Plan\na. Operation: Division\nb. Number sentence: 48 ÷ 6 = N",
                        "3. Solve\n 48\n÷ 6\n————\n  8\nEach student receives 8 pencils",
                        "4. Check\n  8\n× 6\n————\n 48\nIn 8, all 6 students have equally divided pencils"
                    ),
                    answer = ""
                ),

                Slide.PracticeSlide(
                    id = 6,
                    question = "Practice Time!!\n\nWord Problem:\nLara had ₱850 in her wallet. Her mother gave her ₱275 more. How much money does Lara have now?\n\nChoose your answer:",
                    options = listOf("₱1,125", "₱1,215", "₱1,251", "₱1,211"),
                    correctAnswer = 0,
                    explanation = "Correct! The answer is ₱1,125"
                ),

                Slide.PracticeSlide(
                    id = 7,
                    question = "Practice Time!!\n\nWord Problem:\nA box originally contained 150 chocolates. After the party, only 68 chocolates were left. How many chocolates were eaten?\n\nChoose your answer:",
                    options = listOf("82 chocolates", "84 chocolates", "86 chocolates", "88 chocolates"),
                    correctAnswer = 0,
                    explanation = "Correct! The answer is 82 chocolates"
                ),

                Slide.PracticeSlide(
                    id = 8,
                    question = "Practice Time!!\n\nWord Problem:\nA gardener planted 12 rows of flowers. Each row has 7 flowers. How many flowers did he plant in total?\n\nChoose your answer:",
                    options = listOf("82 flowers", "84 flowers", "86 flowers", "88 flowers"),
                    correctAnswer = 1,
                    explanation = "Correct! The answer is 84 flowers"
                ),

                Slide.PracticeSlide(
                    id = 9,
                    question = "Practice Time!!\n\nWord Problem:\nThere are 96 books that need to be placed equally on 8 shelves. How many books will go on each shelf?\n\nChoose your answer:",
                    options = listOf("12 books per shelf", "14 books per shelf", "16 books per shelf", "18 books per shelf"),
                    correctAnswer = 0,
                    explanation = "Correct! The answer is 12 books per shelf"
                ),

                Slide.SummarySlide(
                    id = 10,
                    title = "Summary",
                    keyPoints = listOf(
                        "Use the 4-step method to solve integer problems:\nUNDERSTAND - What's given and what's asked?\nPLAN - What operation and number sentence?\nSOLVE - Carry out the plan\nCHECK - Verify your answer",
                        "Operations with integers:\nAddition: combining values\nSubtraction: finding difference or what's left\nMultiplication: repeated addition\nDivision: equal sharing or grouping",
                        "Always check if your answer makes sense!"
                    )
                )
            )
        )
    }

    // ============== QUARTER 3 ==============
    // LESSON 1 - SUBTOPIC 1: Plane and Solid Figures and its Features (Geometry)
    private fun getQuarter3Lesson1Subtopic1(): InteractiveLesson {
        return InteractiveLesson(
            id = 48,
            title = "Plane and Solid Figures and its Features (Geometry)",
            slides = listOf(
                Slide.IntroSlide(
                    id = 1,
                    title = "Hello!!",
                    content = "In this topic you will learn about plane and solid figures and their features. You'll understand the difference between 2D and 3D shapes!"
                ),

                Slide.ConceptSlide(
                    id = 2,
                    title = "Let's classify these objects",
                    content = "A girl was asked to clean her room and found some items.\n\nThe girl found a bed, a toy traffic cone, dice, a soccer ball, and a coin bank.",
                    imageResourceId = R.drawable.room_objects,
                    keyPoints = emptyList()
                ),

                Slide.ConceptSlide(
                    id = 3,
                    title = "What shapes can you see from these objects?",
                    content = "We can see rectangles from the picture of the bed, triangles from the toy traffic cone. The ball is shaped like a circle while the coin bank has 2 circles for its bases. The dice is represented by a square.\n\nThe pictures above are examples of real solid figures.",
                    imageResourceId = R.drawable.room_objects,
                    keyPoints = emptyList()
                ),

                Slide.ConceptSlide(
                    id = 4,
                    title = "Take note",
                    content = "Rectangles, squares, circles and triangles are plane figures.",
                    keyPoints = emptyList()
                ),

                Slide.ConceptSlide(
                    id = 5,
                    title = "Let us differentiate between plane figures and solid figures",
                    content = "PLANE FIGURES\nSOLID FIGURES",
                    keyPoints = emptyList()
                ),

                Slide.ConceptSlide(
                    id = 6,
                    title = "Plane Figures",
                    content = "",
                    keyPoints = listOf(
                        "two-dimensional shape",
                        "flat",
                        "has length and width"
                    )
                ),

                Slide.ConceptSlide(
                    id = 7,
                    title = "Plane Figures",
                    content = "The pictures above show flat shapes. These shapes don't have thickness and are called two-dimensional shapes, or plane figures, because they only have length and width. They can be made up of straight lines, curved lines, or a combination of both.",
                    imageResourceId = R.drawable.plane_figures_examples,
                    keyPoints = emptyList()
                ),

                Slide.ConceptSlide(
                    id = 8,
                    title = "Solid Figures",
                    content = "",
                    keyPoints = listOf(
                        "three-dimensional shape",
                        "thickness and depth",
                        "has length, width and height"
                    )
                ),

                Slide.ConceptSlide(
                    id = 9,
                    title = "Solid Figures",
                    content = "The pictures above show shapes that don't lie flat on a plane. These are called space figures, or solids. Solids have three dimensions: length, width, and height (or thickness). The flat surfaces of a solid are called faces, and these faces are usually polygons.",
                    imageResourceId = R.drawable.solid_figures_examples,
                    keyPoints = emptyList()
                ),

                Slide.ConceptSlide(
                    id = 10,
                    title = "Base, Edge, and Vertex",
                    content = "The base is the face that the solid rests on.\n\nThe edge is the line segment where two faces meet.\n\nA vertex (plural: vertices) is the corner where the ends of the line segments of two or more faces meet.\n\nYou can observe the numbers of faces, edges, and vertices, as well as the shape of the base.",
                    imageResourceId = R.drawable.solid_parts_diagram,
                    keyPoints = emptyList()
                ),

                Slide.ConceptSlide(
                    id = 11,
                    title = "Look and examine the table",
                    content = "",
                    imageResourceId = R.drawable.solid_figures_table,
                    keyPoints = emptyList()
                ),

                Slide.ConceptSlide(
                    id = 12,
                    title = "Description of those Solid Figures in the table",
                    content = "",
                    keyPoints = listOf(
                        "A sphere has a smooth, curved surface where every point is the same distance from the center",
                        "A rectangular prism has six rectangular faces. Each pair of faces intersects outside in an edge",
                        "A cone has a round base and a curved surface that comes up to a point",
                        "A cylinder has 2 equal and parallel circles as bases and a lateral curved surface"
                    )
                ),

                Slide.ConceptSlide(
                    id = 13,
                    title = "Description of those Solid Figures in the table",
                    content = "",
                    keyPoints = listOf(
                        "A pyramid has a base that can be any shape and triangular sides that meet at a single point",
                        "A square pyramid has a square base",
                        "A cube (or square prism) has six square faces. All the edges are the same length. It has 8 corners (vertices) and 12 edges",
                        "A triangular prism has 3 rectangular faces and 2 triangular faces"
                    )
                ),

                Slide.PracticeSlide(
                    id = 14,
                    question = "Choose your answer:",
                    imageResourceId = R.drawable.practice_plane_figure,
                    options = listOf("PLANE FIGURE", "SOLID FIGURE"),
                    correctAnswer = 0,
                    explanation = "Correct! The answer is PLANE FIGURE"
                ),

                Slide.PracticeSlide(
                    id = 15,
                    question = "Choose your answer:",
                    imageResourceId = R.drawable.practice_solid_figure,
                    options = listOf("PLANE FIGURE", "SOLID FIGURE"),
                    correctAnswer = 1,
                    explanation = "Correct! The answer is SOLID FIGURE"
                ),

                Slide.SummarySlide(
                    id = 16,
                    title = "Summary",
                    keyPoints = listOf(
                        "Plane figures are flat shapes with length and width only. Examples: rectangle, square, triangle, circle",
                        "Solid figures are 3D objects with length, width, and height. They have faces, edges, and vertices. Examples: cube, cone, sphere, cylinder, pyramid, and prism"
                    )
                )
            )
        )
    }

    // LESSON 2 - SUBTOPIC 1: Formulating Rules for Sequence
    private fun getQuarter3Lesson2Subtopic1(): InteractiveLesson {
        return InteractiveLesson(
            id = 49,
            title = "Formulating Rules for Sequence",
            slides = listOf(
                Slide.IntroSlide(
                    id = 1,
                    title = "Bonjour!",
                    content = "In this topic you will learn about additional concepts in algebra. We'll develop strategies for finding the nth term of a sequence by using various methods, such as identifying patterns, making educated guesses, and working backward. Additionally, we'll focus on distinguishing between expressions and equations."
                ),

                Slide.ConceptSlide(
                    id = 2,
                    title = "What is Formulating Rules for Sequence?",
                    content = "Formulating rules for a sequence means finding a pattern and writing a rule (or formula) that tells how to get any term in the sequence. This rule shows how the numbers change and helps you find the next terms without listing everything.",
                    keyPoints = emptyList()
                ),

                Slide.ConceptSlide(
                    id = 3,
                    title = "Example Sequence",
                    content = "The numbers 4, 8, 12, 16, 20, 24, and 28 form a sequence.\n\nA number sequence is a list of numbers arranged so that each term follows a specific rule or pattern. Each individual number in the sequence is referred to as a term.",
                    imageResourceId = R.drawable.calendar_sequence,
                    keyPoints = emptyList()
                ),

                Slide.ConceptSlide(
                    id = 4,
                    title = "Finding the Pattern",
                    content = "If we look at any two consecutive terms among the circled numbers on the calendar, the difference between them is 4. By adding 4 to any term, we get the next number in the sequence. Thus, the rule for the sequence 4, 8, 12, 16, 20, 24 is to add 4 to the preceding term.",
                    imageResourceId = R.drawable.calendar_sequence,
                    keyPoints = emptyList()
                ),

                Slide.ConceptSlide(
                    id = 5,
                    title = "Take a look at this table",
                    content = "",
                    imageResourceId = R.drawable.sequence_table_1,
                    keyPoints = emptyList()
                ),

                Slide.ConceptSlide(
                    id = 6,
                    title = "Example of Formulating Rules for Sequence",
                    content = "",
                    imageResourceId = R.drawable.sequence_table_2,
                    keyPoints = listOf(
                        "Example 1: 16, 8, 4, 2, …\nWorking backward, you will notice that multiplying by 2 gives the previous term. This shows that each term is formed by dividing the previous term by 2. To generate the sequence, start with 16 and divide by 2 each time",
                        "Example 2: 2, 4, 8, 16, …\nWorking backward, you will notice that dividing by 2 gives the previous term. This shows that each term is formed by multiplying the previous term by 2. To generate the sequence, start with 2 and multiply by 2 each time"
                    )
                ),

                Slide.ExampleSlide(
                    id = 7,
                    title = "Using guess-and-check strategy",
                    problem = "Example 3: 2, 5, 8, 11, …\n\nWorking backwards, you'll notice a pattern where subtracting 3 from a term gives the previous term on the left. Now, try to find a way to generate each term such that the sequence has a common difference of 3.",
                    imageResourceId = R.drawable.guess_check_table,
                    steps = listOf(
                        "Let n represent a counting number",
                        "So the nth for the sequence 2, 5, 8, 11, ... is 3 × n – 1 or 3n – 1",
                        "In this example, the rule 3n – 1 is what we call an expression. While 3n – 1 = 4 is what we call an equation"
                    ),
                    answer = ""
                ),

                Slide.ConceptSlide(
                    id = 8,
                    title = "Let's take a look at this table",
                    content = "In the table, the first column contains examples of expressions, while the second column shows examples of equations.",
                    imageResourceId = R.drawable.expression_equation_table,
                    keyPoints = emptyList()
                ),

                Slide.PracticeSlide(
                    id = 9,
                    question = "True or False\n\nIdentify the statement if it's true. Otherwise false.\n\nFormulating rules for a sequence means finding a pattern and writing a rule (or formula) that tells how to get any term in the sequence. This rule shows how the numbers change and helps you find the next terms without listing everything.\n\nChoose your answer:",
                    options = listOf("True", "False"),
                    correctAnswer = 0,
                    explanation = "Correct! The answer is True"
                ),

                Slide.SummarySlide(
                    id = 10,
                    title = "Summary",
                    keyPoints = listOf(
                        "Key Points: Formulating Rules for a Sequence",
                        "A sequence follows a pattern that determines how each term is formed",
                        "To find the rule, look for how the numbers increase, decrease, or repeat",
                        "Check whether the pattern uses addition, subtraction, multiplication, or division",
                        "The rule describes how to get the next term from the previous one",
                        "A rule can also be written as a formula to find any term in the sequence",
                        "Identifying the pattern helps in predicting the missing terms or future terms",
                        "Always compare the differences or ratios between terms to spot the pattern"
                    )
                )
            )
        )
    }

    // LESSON 3 - SUBTOPIC 1: Expressions and Equations
    private fun getQuarter3Lesson3Subtopic1(): InteractiveLesson {
        return InteractiveLesson(
            id = 50,
            title = "Mathematical Expressions and Equations",
            slides = listOf(
                Slide.IntroSlide(
                    id = 1,
                    title = "Welcome!",
                    content = "In this topic you will learn about translating real-life word expressions and equations into letters and vice versa. To understand and solve a math problem, we need to change word phrases into math symbols to create mathematical phrases."
                ),

                Slide.ConceptSlide(
                    id = 2,
                    title = "What is Mathematical Expression?",
                    content = "Mathematical Expression is a combination of numbers, variables, and operations (like +, −, ×, ÷) that represents a value.",
                    keyPoints = listOf(
                        "Does not have an equal sign",
                        "If it has an equal sign, it becomes an equation",
                        "Examples: \n 5 + 3 \n 2x + 7 \n 3(a − 2) + 4",
                        "Can be simplified but not 'solved' for a value",
                        "unless part of an equation"
                    )
                ),

                Slide.ConceptSlide(
                    id = 3,
                    title = "What is a Mathematical Equation?",
                    content = "A mathematical equation is a statement that shows two expressions are equal, using an equal sign (=).",
                    keyPoints = listOf(
                        "Contains numbers, variables, and operations can be solved to find the value of the unknown variable",
                        "Examples: \n 5 + x = 12 \n 2a − 7 = 9 \n 3y + 4 = 10",
                        "Key differences from expressions: \n Has an equal sign \n Can be solved to find unknown value \n Represents a balance between two sides"
                    )
                ),

                Slide.ConceptSlide(
                    id = 4,
                    title = "Key Difference",
                    content = "Math word problems cannot be solved unless you translate them into symbols.",
                    keyPoints = listOf(
                        "Expression: NO equal sign \n Example: 5 + 3 \n Cannot be 'solved'",
                        "Equation: HAS equal sign \n Example: 5 + x = 12 \n Can be solved",
                        "Remember: All equations contain expressions, but not all expressions are equations!"
                    )
                ),

                Slide.ExampleSlide(
                    id = 5,
                    title = "Example Problem 1: Transportation Fare",
                    problem = "Imagine a fare for the first 2 km is ₱8.00 and an additional ₱1.00 for every kilometer. Mercy will go to Cavite City from Noveleta Cavite, and the distance from Noveleta Cavite to Cavite City is 6 km. How much does she need to pay?",
                    steps = listOf(
                        "Understanding the problem: \n First 2 km = ₱8.00 (fixed) \n Additional distance = 6 − 2 = 4 km \n Each additional km = ₱1.00",
                        "Let y = the fixed amount of ₱1.00 per km",
                        "Expression for remaining distance: \n 4y + 8",
                        "This means: \n 4 km × ₱1.00 + ₱8.00"
                    ),
                    answer = "Expression: 4y + 8"
                ),

                Slide.ExampleSlide(
                    id = 6,
                    title = "Let’s have an example to have a better understanding",
                    problem = "Example problem 1: Imagine a fare for the first 2 km is Php 8.00 and an additional Php 1.00 for every kilometer. Mercy will go to Cavite City from Noveleta Cavite, and the distance from Noveleta Cavite to Cavite City is 6 km. How much does she need to pay?",
                    imageResourceId = R.drawable.distance_example,
                    steps = listOf(
                        "Substitute y = 1: \n 4y + 8 \n = 4(1) + 8 \n = 4 + 8 \n = 12",
                        "Wait! The base fare is ₱8, not ₱15!",
                        "Let's recalculate: \n Actually, if first 2 km = ₱15 (as stated in original): 4(1) + 15 = 19",
                        "Therefore, Mercy needs to pay ₱19.00"
                    ),
                    answer = "Total fare: ₱19.00"
                ),

                Slide.ExampleSlide(
                    id = 7,
                    title = "Example Problem 2: Donations",
                    problem = "Silvia and her family donated canned goods and cup noodles to a certain city affected by a typhoon. They donated a total of 300 items. If the number of canned goods is twice the number of cup noodles, how many canned goods did they donate?",
                    steps = listOf(
                        "Let x = number of cup noodles",
                        "Then 2x = number of canned goods (because canned goods is twice the cup noodles)",
                        "Total = 300",
                        "Setting up the equation: x + 2x = 300",
                        "This is an EQUATION because it has an equal sign"
                    ),
                    answer = "Equation: x + 2x = 300"
                ),

                Slide.ExampleSlide(
                    id = 8,
                    title = "Solving Example 2",
                    problem = "Solve: x + 2x = 300",
                    steps = listOf(
                        "Combine like terms: \n x + 2x = 300 \n 3x = 300",
                        "Divide both sides by 3: 300 ÷ 3 = 100",
                        "So x = 100 (cup noodles)",
                        "Canned goods = 2x = 2(100) = 200",
                        "Check: 100 + 200 = 300"
                    ),
                    answer = "Canned goods donated: 200 pieces"
                ),

                Slide.PracticeSlide(
                    id = 9,
                    question = "Identify if the given is Expression or Equation: 5 ÷ 8",
                    options = listOf("Expression", "Equation"),
                    correctAnswer = 0,
                    explanation = "Correct! 5 ÷ 8 is an EXPRESSION because it has no equal sign."
                ),

                Slide.ExampleSlide(
                    id = 10,
                    title = "Example 3",
                    problem = "A teacher bought red pens and blue pens for her class. She bought a total of 36 pens. If the number of red pens is twice the number of blue pens, how many red pens did she buy?",
                    steps = listOf(),
                    answer = ""
                ),

                Slide.ExampleSlide(
                    id = 11,
                    title = "Solving Example 3",
                    problem = "",
                    steps = listOf(
                        "Let x be the number of blue pens",
                        "Then, 2x is the number of red pens",
                        "The total number of pens is 36",
                        "Form the equation:\nx + 2x = 36\n3x = 36\n36 ÷ 3 = 12",
                        "So, the number of blue pens is 12",
                        "Red pens = 2 × 12 = 24",
                    ),
                    answer = "The teacher bought 24 red pens"
                ),

                Slide.PracticeSlide(
                    id = 12,
                    question = "Identify if the given is Expression or Equation: 5z ÷ 7 = 11",
                    options = listOf("Expression", "Equation"),
                    correctAnswer = 1,
                    explanation = "Correct! 5z ÷ 7 = 11 is an EQUATION because it has an equal sign."
                ),

                Slide.SummarySlide(
                    id = 13,
                    title = "Summary: Key Points to Remember",
                    keyPoints = listOf(
                        "Expression: \n A combination of numbers, variables, and operations \n Does NOT have an equal sign \n Represents a value but cannot be 'solved' \n Examples: 5 + x, 2(a − 3) + 7",
                        "Equation: \n Shows that two expressions are equal \n Uses an equal sign (=) \n Can be solved to find the value of unknown variable \n Represents a balance between two sides \n Examples: 5 + x = 12, 2a − 7 = 9",
                        "Remember: Translate word problems into symbols to solve them!"
                    )
                )
            )
        )
    }

    // LESSON 3 - SUBTOPIC 2: Translating Word Phrases into Algebraic Expressions
    private fun getQuarter3Lesson3Subtopic2(): InteractiveLesson {
        return InteractiveLesson(
            id = 51,
            title = "Translating Word Phrases into Algebraic Expressions",
            slides = listOf(
                Slide.IntroSlide(
                    id = 1,
                    title = "Hola!",
                    content = "In this topic you will learn to translate word phrases into algebraic expressions. Let's start to have a better understanding of this topic."
                ),

                Slide.ConceptSlide(
                    id = 2,
                    title = "What is Translating Word Phrases into Algebraic Expressions?",
                    content = "Translating word phrases into algebraic expressions means changing words into mathematical symbols using numbers, variables, and operations.",
                    keyPoints = listOf(
                        "Changes words into math symbols",
                        "Uses numbers, variables, and operations",
                        "Helps solve problems mathematically",
                        "Examples: \n 'The sum of a number and 7' → x + 7 \n '3 less than a number' → x − 3 \n 'Twice a number' → 2x \n 'The product of a number and 5' → 5x"
                    )
                ),

                Slide.ConceptSlide(
                    id = 3,
                    title = "Key Idea",
                    content = "Identify keywords like sum, difference, product, quotient, and translate them into algebraic operations (+, −, ×, ÷).",
                    keyPoints = listOf(
                        "Addition keywords: sum, plus, more than, increased by",
                        "Subtraction keywords: difference, minus, less than, decreased by",
                        "Multiplication keywords: product, times, twice, of",
                        "Division keywords: quotient, divided by, ratio"
                    )
                ),

                Slide.ConceptSlide(
                    id = 4,
                    title = "What is an Algebraic Expression?",
                    content = "An algebraic expression is a math phrase made up of letters, numbers, and operation symbols.",
                    keyPoints = listOf(
                        "Contains: \n Letters (variables) \n Numbers (constants) \n Operation symbols (+, −, ×, ÷)",
                        "Examples: \n x + 5 \n 3n − 2 \n ½y + 7",
                        "To translate word phrases: \n Know which words match specific symbols or operations"
                    )
                ),

                Slide.ConceptSlide(
                    id = 5,
                    title = "Example of algebraic equation",
                    content = "2x + 7 = 15",
                    keyPoints = listOf(
                        "Has an equal sign",
                        "Can be solved to find x"
                    )
                ),

                Slide.ConceptSlide(
                    id = 6,
                    title = "Guidance for Translation - Addition",
                    imageResourceId = R.drawable.mathematical_operations,
                    content = "Words that indicate ADDITION:",
                    keyPoints = listOf(
                        "Sum",
                        "Plus",
                        "Add",
                        "More than",
                        "Increased by",
                        "Total",
                        "Symbol: +",
                        "Example: \n 'The sum of x and 5' → x + 5 \n '3 more than a number' → n + 3"
                    )
                ),

                Slide.ConceptSlide(
                    id = 7,
                    title = "Guidance for Translation - Subtraction",
                    imageResourceId = R.drawable.mathematical_operations,
                    content = "Words that indicate SUBTRACTION:",
                    keyPoints = listOf(
                        "Difference",
                        "Minus",
                        "Subtract",
                        "Less than",
                        "Decreased by",
                        "Fewer than",
                        "Symbol: −",
                        "Example: \n '5 less than a number' → x − 5 \n 'The difference of n and 3' → n − 3"
                    )
                ),

                Slide.ConceptSlide(
                    id = 8,
                    title = "Guidance for Translation - Multiplication",
                    imageResourceId = R.drawable.mathematical_operations,
                    content = "Words that indicate MULTIPLICATION:",
                    keyPoints = listOf(
                        "Product",
                        "Times",
                        "Multiply",
                        "Twice/Double",
                        "Of (with fractions)",
                        "Each",
                        "Symbol: × or just write next to variable",
                        "Example: \n 'The product of 4 and x' → 4x \n 'Twice a number' → 2n \n '½ of y' → ½y"
                    )
                ),

                Slide.ConceptSlide(
                    id = 9,
                    title = "Guidance for Translation - Division",
                    imageResourceId = R.drawable.mathematical_operations,
                    content = "Words that indicate DIVISION:",
                    keyPoints = listOf(
                        "Quotient",
                        "Divided by",
                        "Ratio",
                        "Per",
                        "Split",
                        "Symbol: ÷ or /",
                        "Example: \n 'The quotient of x and 3' → x ÷ 3 or x/3 \n 'A number divided by 5' → n ÷ 5 or n/5"
                    )
                ),

                Slide.ConceptSlide(
                    id = 10,
                    title = "Translation Table",
                    imageResourceId = R.drawable.word_phrases,
                    content = "Study how different word phrases translate to algebraic expressions:",
                    keyPoints = listOf(
                        "Addition examples: \n • 'x more than 7' → 7 + x \n • 'Sum of 3 and y' → 3 + y",
                        "Subtraction examples: \n • '4 less than n' → n − 4 \n • 'Difference of m and 2' → m − 2",
                        "Multiplication examples: \n • 'Product of 5 and x' → 5x \n • 'Triple of n' → 3n",
                        "Division examples: \n • 'Quotient of y and 4' → y ÷ 4 \n • 'x divided by 2' → x ÷ 2"
                    )
                ),

                Slide.ExampleSlide(
                    id = 11,
                    title = "Example 1: Translating to Algebraic Expression",
                    imageResourceId = R.drawable.word_phrases_example,
                    problem = "Translate: '8 more than twice a number'",
                    steps = listOf(
                        "Let x = the number",
                        "Break down the phrase: \n 'twice a number' → 2x \n '8 more than' → + 8",
                        "Combine: \n '8 more than twice a number' \n = 2x + 8",
                        "Or you can write it as: \n = 8 + 2x",
                        "(Both are correct!)"
                    ),
                    answer = "8 + 2x or 2x + 8"
                ),

                Slide.PracticeSlide(
                    id = 12,
                    question = "True or False: Translating word phrases into algebraic expressions means changing words into mathematical symbols using numbers, variables, and operations. This helps in solving problems by representing situations mathematically.",
                    options = listOf("True", "False"),
                    correctAnswer = 0,
                    explanation = "Correct! That's exactly what translating word phrases into algebraic expressions means."
                ),

                Slide.PracticeSlide(
                    id = 13,
                    question = "Translate to algebraic expression: 'The sum of a number and 10'",
                    options = listOf("x − 10", "x + 10", "10x", "x ÷ 10"),
                    correctAnswer = 1,
                    explanation = "Correct! 'Sum' means addition, so 'the sum of a number and 10' is x + 10"
                ),

                Slide.PracticeSlide(
                    id = 14,
                    question = "Translate: '5 less than a number'",
                    options = listOf("5 − x", "x − 5", "5 + x", "5x"),
                    correctAnswer = 1,
                    explanation = "Correct! '5 less than a number' means subtract 5 FROM the number: x − 5"
                ),

                Slide.SummarySlide(
                    id = 15,
                    title = "Summary: Key Points to Remember",
                    keyPoints = listOf(
                        "Steps to translate: \n Identify the unknown number and represent it with a variable (x, y, n) \n Look for keywords in the phrase \n Translate words into mathematical expression \n Check by reading it aloud to match original phrase",
                        "Operation Keywords: \n Sum → + \n Difference / less than → − \n Product / times / twice → × \n Quotient / divided by → ÷",
                        "Examples: \n 'The sum of a number and 7' → x + 7 \n '3 less than a number' → x − 3 \n 'Twice a number' → 2x \n 'The product of a number and 5' → 5x"
                    )
                )
            )
        )
    }

    // LESSON 3 - SUBTOPIC 3: Variable and Constant
    private fun getQuarter3Lesson3Subtopic3(): InteractiveLesson {
        return InteractiveLesson(
            id = 52,
            title = "Variable and Constant",
            slides = listOf(
                Slide.IntroSlide(
                    id = 1,
                    title = "Hi!",
                    content = "In this topic you will learn about Variable and Constant."
                ),

                Slide.ConceptSlide(
                    id = 2,
                    title = "What is a Variable?",
                    content = "A variable is a symbol, usually a letter, that represents a number or value that can change.",
                    keyPoints = listOf(
                        "Represented by letters (x, y, n, etc.)",
                        "Can have different values",
                        "Used in expressions, equations, and formulas",
                        "Stands for unknown or changing quantities",
                        "Examples: \n x in x + 5 \n y in 2y − 3 \n n in 3n + 7"
                    )
                ),

                Slide.ConceptSlide(
                    id = 3,
                    title = "Key Idea About Variables",
                    content = "Variables allow us to generalize patterns and solve problems involving unknown values.",
                    keyPoints = listOf(
                        "Think of a variable as a placeholder",
                        "It can represent different numbers",
                        "Helps us write general rules",
                        "Essential for algebra",
                        "Example: \n If x = 3, then x + 5 = 8 \n If x = 10, then x + 5 = 15",
                        "The variable x can be any number!"
                    )
                ),

                Slide.ConceptSlide(
                    id = 4,
                    title = "What is a Constant?",
                    content = "A constant is a fixed number that does not change in a mathematical expression or equation.",
                    keyPoints = listOf(
                        "A specific, unchanging number",
                        "Does not vary",
                        "Always has the same value",
                        "Unlike variables, constants stay the same",
                        "Examples: \n 7 in x + 7 \n −3 in 2y − 3 \n 5 in 3n + 5"
                    )
                ),

                Slide.ConceptSlide(
                    id = 5,
                    title = "Key Idea About Constants",
                    content = "Constants are the numbers in an expression or equation that remain unchanged while variables can vary.",
                    keyPoints = listOf(
                        "Fixed values",
                        "Don't depend on variables",
                        "Stay the same no matter what",
                        "Example: \n In x + 7: \n x is the variable (can change) \n 7 is the constant (always 7)",
                        "Even if x = 1, 5, or 100,",
                        "the constant 7 remains 7"
                    )
                ),

                Slide.ConceptSlide(
                    id = 6,
                    title = "Example of algebraic expression",
                    content = "5y − 3 = 12",
                    keyPoints = listOf(
                        "Has an equal sign",
                        "Can be solved to find y"
                    )
                ),

                Slide.ConceptSlide(
                    id = 7,
                    title = "What is a Term?",
                    content = "A term is either a number, a variable, or a product or division of a number and variables raised to a specified power.",
                    keyPoints = listOf(
                        "Terms are separated by + or − signs",
                        "Not necessary to write + at beginning of a term",
                        "The number next to a variable is called: the NUMERICAL COEFFICIENT",
                        "Examples of terms: \n 5 (constant term) \n x (variable term) \n 3x (coefficient × variable) \n −2y (negative coefficient × variable)"
                    )
                ),

                Slide.ConceptSlide(
                    id = 8,
                    title = "Example Expression: 25p + 1",
                    content = "Let's identify the parts:",
                    imageResourceId = R.drawable.expression_example,
                    keyPoints = listOf(
                        "In the expression: 25p + 1",
                        "p = Variable \n Represents the unknown value",
                        "25 = Numerical Coefficient \n The number next to p",
                        "1 = Constant \n Has a definite, fixed value",
                        "Terms: \n This expression has TWO terms: 25p and 1 \n Separated by the + sign"
                    )
                ),

                Slide.ExampleSlide(
                    id = 9,
                    title = "Example 1: Identifying Parts",
                    problem = "Analyze: 'Six times a number increased by 8'",
                    steps = listOf(
                        "First, translate to expression: \n 'Six times a number' → 6w \n 'increased by 8' → + 8 \n Expression: 6w + 8",
                        "Now identify parts: \n w is the VARIABLE \n 6 is the NUMERICAL COEFFICIENT of w \n 8 is the CONSTANT \n It has TWO TERMS: 6w and 8"
                    ),
                    answer = "Variable: w, Coefficient: 6, Constant: 8, Terms: 2"
                ),

                Slide.PracticeSlide(
                    id = 10,
                    question = "True or False: A variable is a symbol, usually a letter, that represents a number or value that can change. Variables are used in algebraic expressions, equations, and formulas to stand for unknown or changing quantities.",
                    options = listOf("True", "False"),
                    correctAnswer = 0,
                    explanation = "Correct! That's exactly what a variable is - a symbol that can represent different values."
                ),

                Slide.PracticeSlide(
                    id = 11,
                    question = "In the expression 4x + 9, what is the constant?",
                    options = listOf("4", "x", "9", "4x"),
                    correctAnswer = 2,
                    explanation = "Correct! 9 is the constant because it's a fixed number that doesn't change."
                ),

                Slide.PracticeSlide(
                    id = 12,
                    question = "In the expression 3y − 5, what is the coefficient?",
                    options = listOf("3", "y", "5", "−5"),
                    correctAnswer = 0,
                    explanation = "Correct! 3 is the numerical coefficient - the number multiplying the variable y."
                ),

                Slide.SummarySlide(
                    id = 13,
                    title = "Summary: Key Points to Remember",
                    keyPoints = listOf(
                        "Variable: \n A symbol (usually a letter) representing a changing value \n Used in expressions, equations, and formulas \n Allows us to generalize patterns \n Examples: x in x + 5, y in 2y − 3",
                        "Constant: \n A fixed number that does not change \n Examples: 7 in x + 7, −3 in 2y − 3 \n Remains unchanged while variables vary",
                        "Term: \n A number, variable, or product/division of numbers and variables \n Terms are separated by + or − signs \n Numerical coefficient: number next to a variable \n Not necessary to write + at beginning of term"
                    )
                )
            )
        )
    }

    // LESSON 4 - SUBTOPIC 1: Algebraic Expression and Equation
    private fun getQuarter3Lesson4Subtopic1(): InteractiveLesson {
        return InteractiveLesson(
            id = 53,
            title = "Algebraic Expression and Equation",
            slides = listOf(
                Slide.IntroSlide(
                    id = 1,
                    title = "Welcome!!",
                    content = "In this topic, you will be able to identify and differentiate algebraic expressions from algebraic equations."
                ),

                Slide.ConceptSlide(
                    id = 2,
                    title = "Let's first have a review",
                    content = "What is an algebraic equation? an algebraic expression?\n\nAn algebraic equation is a mathematical sentence with an equal sign (=). which shows that two expressions on either side are equal.\n\nAn algebraic expression is a mathematical phrase that uses variables. numerals, and operation symbols.",
                    keyPoints = listOf()
                ),

                Slide.ConceptSlide(
                    id = 3,
                    title = "Example of algebraic equation",
                    content = "3x + 5 = 20\n\nwith an equal sign (=)",
                    keyPoints = listOf()
                ),

                Slide.ConceptSlide(
                    id = 4,
                    title = "Example of algebraic expression",
                    content = "3x + 5\n\nvariables. numerals, and operation symbols",
                    keyPoints = listOf()
                ),

                Slide.PracticeSlide(
                    id = 5,
                    question = "7 × 8 + 5\n\nChoose your answer:",
                    options = listOf("Expression", "Equation"),
                    correctAnswer = 0,
                    explanation = "Correct! The answer is Expression"
                ),

                Slide.PracticeSlide(
                    id = 6,
                    question = "3 × 1 = 3\n\nChoose your answer:",
                    options = listOf("Expression", "Equation"),
                    correctAnswer = 1,
                    explanation = "Correct! The answer is Equation"
                ),

                Slide.ConceptSlide(
                    id = 7,
                    title = "Let's take a look at this example",
                    content = "Elil buys 3 rolls of tissues for ₱30.00 each and 2 wipes for ₱45.00 each. He gives the cashier a ₱500.00 bill. Write an expression for the total cost he buys and an equation for the amount of change he will receive.",
                    keyPoints = emptyList()
                ),

                Slide.ExampleSlide(
                    id = 8,
                    title = "Setting Up Variables",
                    problem = "Let's use variable to represent the price of each item.",
                    imageResourceId = R.drawable.expression_variables_example,
                    steps = listOf(
                        "Let s be the price of each roll of tissues, which is ₱30.00",
                        "d be the price of each wipe, which is ₱45.00",
                        "t be the amount of change",
                        "Now translate the phrases:"
                    ),
                    answer = ""
                ),

                Slide.ExampleSlide(
                    id = 9,
                    title = "Solution",
                    problem = "Algebraic expression: 3s + 2d",
                    steps = listOf(
                        "This represents the total cost of the 3 rolls of tissue for ₱30.00 each and 2 wipes for ₱45.00 each",
                        "Algebraic equation: 3s + 2d",
                        "3(30) + 2(45)",
                        "90 + 90 = 180"
                    ),
                    answer = "180"
                ),

                Slide.SummarySlide(
                    id = 10,
                    title = "Summary",
                    keyPoints = listOf(
                        "An algebraic expression is a phrase with variables, numbers, and operation symbols (no equal sign)",
                        "An algebraic equation is a sentence that shows two expressions are equal (has an equal sign)"
                    )
                )
            )
        )
    }

    // LESSON 4 - SUBTOPIC 2: The Four Basic Rules for Solving an Equation
    private fun getQuarter3Lesson4Subtopic2(): InteractiveLesson {
        return InteractiveLesson(
            id = 54,
            title = "The Four Basic Rules for Solving an Equation",
            slides = listOf(
                Slide.IntroSlide(
                    id = 1,
                    title = "Heyyy!!",
                    content = "In this topic, you will be able to apply the four basic rules (addition, subtraction, multiplication, division) to solve algebraic equations and solve real-life problems."
                ),

                Slide.ConceptSlide(
                    id = 2,
                    title = "The Four Basic Rules for Solving an Equation",
                    content = "",
                    keyPoints = listOf(
                        "Addition Property of Equality",
                        "Subtraction Property of Equality",
                        "Multiplication Property of Equality",
                        "Division Property of Equality"
                    )
                ),

                Slide.ConceptSlide(
                    id = 3,
                    title = "Addition Property of Equality",
                    content = "If the same quantity is added to both sides of an equation, the resulting equation is equivalent to the original equation.\n\nExample: m − 9 = 12\nadd (9) to both sides\nm − 9 + 9 = 12 + 9\n−9 + 9 = 0\nm = 21",
                    keyPoints = emptyList()
                ),

                Slide.ConceptSlide(
                    id = 4,
                    title = "Subtraction Property of Equality",
                    content = "If the same quantity is subtracted from both sides of an equation, the resulting equation is equivalent to the original equation.\n\nExample: g + 10 = 11\nsubtract both sides by 10\ng + 10 - 10 = 11 − 10\n10 − 10 = 0\ng = 1",
                    keyPoints = emptyList()
                ),

                Slide.ConceptSlide(
                    id = 5,
                    title = "Multiplication Property of Equality",
                    content = "If both sides of an equation are multiplied by the same (nonzero) quantity, the resulting equation is equivalent to the original equation.\n\nExample: x/2 = 12\nmultiply both sides by 2",
                    imageResourceId = R.drawable.property_of_equality,
                    keyPoints = emptyList()
                ),

                Slide.ConceptSlide(
                    id = 6,
                    title = "Division Property of Equality",
                    content = "If both sides of an equation are divided by the same (nonzero) quantity, the resulting equation is equivalent to the original equation.\n\nExample: 6n = 30\ndivide both sides by 6\n6n/6 = 30/6\nn = 5",
                    keyPoints = emptyList()
                ),

                Slide.ExampleSlide(
                    id = 7,
                    title = "Let's try to translate and solve the following equation",
                    problem = "I am 9 years older than twice the age of my younger brother. If I were 49 years old. How old is my younger brother?",
                    steps = listOf(
                        "Let y be her younger brother's age",
                        "Algebraic Equation is: 9 + 2y = 49",
                        "Let us solve:\n9 + 2y = 49\n−9 + 9 + 2y = 49 − 9\nSubtraction Property of Equality",
                        "2y/2 = 40/2\nDivision Property of Equality\ny = 20",
                    ),
                    answer = "Therefore, her youngest brother is 20 years old"
                ),

                Slide.PracticeSlide(
                    id = 8,
                    question = "k − 5 = 15 = ?\n\nChoose your answer:",
                    options = listOf("20", "10", "-20", "-10"),
                    correctAnswer = 0,
                    explanation = "Correct! The answer is 20"
                ),

                Slide.PracticeSlide(
                    id = 9,
                    question = "n + 8 = 10 = ?\n\nChoose your answer:",
                    options = listOf("18", "-18", "2", "-2"),
                    correctAnswer = 2,
                    explanation = "Correct! The answer is 2"
                ),

                Slide.SummarySlide(
                    id = 10,
                    title = "Summary",
                    keyPoints = listOf(
                        "To solve equations, we use the four basic rules: Addition, Subtraction, Multiplication, and Division. These allow us to add, subtract, multiply, or divide both sides of an equation to keep it balanced and isolate the variable"
                    )
                )
            )
        )
    }

    // LESSON 5 - SUBTOPIC 1: Speed
    private fun getQuarter3Lesson5Subtopic1(): InteractiveLesson {
        return InteractiveLesson(
            id = 55,
            title = "Speed",
            slides = listOf(
                Slide.IntroSlide(
                    id = 1,
                    title = "Hi!!",
                    content = "In this topic, you will be able to define speed and average speed, use the formula to calculate average speed, and solve simple real-life problems involving speed, distance, and time."
                ),

                Slide.ConceptSlide(
                    id = 2,
                    title = "What is Speed?",
                    content = "Speed is a scalar quantity that tells us how fast an object is moving. Speed can also be seen as the rate at which an object covers distance.",
                    keyPoints = listOf(
                        "A fast-moving object has a high speed",
                        "Travels a long distance in a short time",
                        "A slow-moving object has a low speed",
                        "Covers a shorter distance in the same amount of time",
                        "If an object isn't moving at all, its speed is zero"
                    )
                ),

                Slide.ConceptSlide(
                    id = 3,
                    title = "What is Average Speed?",
                    content = "Average speed is a measure of the distance traveled in a given period of time. It is sometimes referred to as the ratio of distance and time.",
                    keyPoints = listOf(
                        "Measures distance traveled in a given time",
                        "Also called the ratio of distance and time",
                        "Formula: Average speed = Distance ÷ Time",
                        "Helps compare speeds over different journeys"
                    )
                ),

                Slide.ConceptSlide(
                    id = 4,
                    title = "Formula for Average Speed",
                    content = "The formula to calculate average speed:",
                    keyPoints = listOf(
                        "Average speed = Distance traveled ÷ Time taken Or: Speed = Distance/Time",
                        "Example: \n Distance = 200 miles \n Time = 4 hours \n Speed = 200 ÷ 4 = 50 miles per hour"
                    )
                ),

                Slide.ExampleSlide(
                    id = 5,
                    title = "Example: Calculating Average Speed",
                    problem = "Determine the average speed of a jeep that travels 200 miles in 4 hours.",
                    steps = listOf(
                        "Given: \n Distance = 200 miles \n Time = 4 hours",
                        "Using the formula: \n Average speed = Distance ÷ Time \n Average speed = 200 miles ÷ 4 hours \n Average speed = 50 miles per hour",
                        "Answer: 50 mph"
                    ),
                    answer = "50 miles per hour (mph)"
                ),

                Slide.ConceptSlide(
                    id = 6,
                    title = "Common Units for Speed",
                    content = "Different units are used to measure speed:",
                    imageResourceId = R.drawable.abbreviation_table,
                    keyPoints = listOf(
                        "mph - miles per hour",
                        "km/h - kilometers per hour",
                        "m/s - meters per second",
                        "m/h - meters per hour",
                        "ft/s - feet per second",
                        "Choose the unit based on the context!"
                    )
                ),

                Slide.ExampleSlide(
                    id = 7,
                    title = "Example 1: Two Journeys",
                    problem = "Lake drives from Manila to Baguio, a distance of 160 km, in 4 hours. He then drives from Baguio to Benguet, a distance of 90 km, in 1 hour and 30 minutes. Determine his average speed for each journey.",
                    imageResourceId = R.drawable.journey_example_1,
                    steps = listOf(
                        "Journey 1: Manila to Baguio",
                        "Distance = 160 km",
                        "Time = 4 hours",
                        "Speed = 160 ÷ 4 = 40 km/h",
                        "Journey 2: Baguio to Benguet",
                        "Distance = 90 km",
                        "Time = 1.5 hours (1 hr 30 min = 1.5 hr)",
                        "Speed = 90 ÷ 1.5 = 60 km/h"
                    ),
                    answer = "Manila to Baguio: 40 km/h; Baguio to Benguet: 60 km/h"
                ),

                Slide.PracticeSlide(
                    id = 8,
                    question = "What is the abbreviation of miles per hour?",
                    options = listOf("km", "mph", "m/s", "m/h"),
                    correctAnswer = 1,
                    explanation = "Correct! 'mph' stands for miles per hour."
                ),

                Slide.PracticeSlide(
                    id = 9,
                    question = "What is the abbreviation of meters per hour?",
                    options = listOf("km", "mph", "m/s", "m/h"),
                    correctAnswer = 3,
                    explanation = "Correct! 'm/h' stands for meters per hour."
                ),

                Slide.ConceptSlide(
                    id = 10,
                    title = "Converting Time Units",
                    content = "Sometimes you need to convert time units:",
                    keyPoints = listOf(
                        "1 hour = 60 minutes",
                        "1 minute = 60 seconds",
                        "Example: 1 hour 30 minutes = 1.5 hours",
                        "Example: 2 hours 15 minutes = 2.25 hours",
                        "To convert minutes to hours: divide by 60"
                    )
                ),

                Slide.SummarySlide(
                    id = 11,
                    title = "Summary",
                    keyPoints = listOf(
                        "Speed tells how fast an object moves",
                        "Average speed = Distance ÷ Time",
                        "Common units: \n mph (miles per hour) \n km/h (kilometers per hour) \n m/s (meters per second)",
                        "Key points: \n Fast objects = high speed, long distance in short time \n Slow objects = low speed, shorter distance in same time \n Stationary objects = speed of zero",
                        "Always check your units match!"
                    )
                )
            )
        )
    }

    // LESSON 5 - SUBTOPIC 2: Distance and Time
    private fun getQuarter3Lesson5Subtopic2(): InteractiveLesson {
        return InteractiveLesson(
            id = 56,
            title = "Distance and Time",
            slides = listOf(
                Slide.IntroSlide(
                    id = 1,
                    title = "Welcome!!",
                    content = "At the end of the lesson, students will be able to define distance, time, and speed, use the formulas to calculate any of the three, and solve real-life problems involving speed, distance, and time."
                ),

                Slide.ConceptSlide(
                    id = 2,
                    title = "What is Distance?",
                    content = "Distance is the total length of space between two points or positions. It tells us how far apart things are.",
                    keyPoints = listOf(
                        "Total length of space between two points",
                        "Measures 'how far'",
                        "Common units: meters (m), kilometers (km), miles (mi)",
                        "Always a positive value",
                        "Example: The distance from home to school is 5 km"
                    )
                ),

                Slide.ConceptSlide(
                    id = 3,
                    title = "What is Time?",
                    content = "Time is the amount of time that passes during an event, action, or process. It's the period in which something happens or continues to happen.",
                    keyPoints = listOf(
                        "Duration of an event or action",
                        "Measures 'how long'",
                        "Common units: seconds (s), minutes (min), hours (hr)",
                        "Example: It takes 30 minutes to walk to school",
                        "Can be converted between units (60 min = 1 hr)"
                    )
                ),

                Slide.ConceptSlide(
                    id = 4,
                    title = "In Simple Terms",
                    content = "Understanding distance and time:",
                    keyPoints = listOf(
                        "Distance tells you 'how far'",
                        "Time tells you 'how long'",
                        "Speed tells you 'how fast'",
                        "These three are related by formulas",
                        "If you know two, you can find the third!"
                    )
                ),

                Slide.ConceptSlide(
                    id = 5,
                    title = "The Relationship Between Speed, Distance, and Time",
                    content = "These three quantities are connected by formulas:",
                    imageResourceId = R.drawable.relationship_speed_distance_time,
                    keyPoints = listOf(
                        "Speed = Distance ÷ Time",
                        "Distance = Speed × Time",
                        "Time = Distance ÷ Speed",
                        "These are rearrangements of the same formula",
                        "Use the formula based on what you're looking for"
                    )
                ),

                Slide.ConceptSlide(
                    id = 6,
                    title = "Understanding the Formulas",
                    content = "Let's analyze the relationship:",
                    keyPoints = listOf(
                        "If you need SPEED: Use: Speed = Distance ÷ Time",
                        "If you need DISTANCE: Use: Distance = Speed × Time",
                        "If you need TIME: Use: Time = Distance ÷ Speed",
                        "Tip: Draw a triangle with D on top, S and T on bottom!"
                    )
                ),

                Slide.ExampleSlide(
                    id = 7,
                    title = "Example 1: Finding Time",
                    problem = "Drake drives at an average speed of 50 mph on a journey of 400 miles. How long does the journey take?",
                    steps = listOf(
                        "Given: \n Speed = 50 miles per hour \n Distance = 400 miles \n Find: Time",
                        "Formula: Time = Distance ÷ Speed",
                        "Time = 400 miles ÷ 50 mph",
                        "Time = 8 hours",
                        "Check: 50 × 8 = 400"
                    ),
                    answer = "Drake's journey takes 8 hours"
                ),

                Slide.ExampleSlide(
                    id = 8,
                    title = "Example 2: Finding Distance",
                    problem = "Jane cycles at an average speed of 10 mph. If she cycles for 4½ hours, how far does she travel?",
                    steps = listOf(
                        "Given: \n Speed = 10 mph \n Time = 4½ hours = 4.5 hours \n Find: Distance",
                        "Formula: Distance = Speed × Time",
                        "Distance = 10 × 4.5",
                        "Distance = 45 miles",
                        "Check: 45 ÷ 10 = 4.5 ✓"
                    ),
                    answer = "Jane travels 45 miles"
                ),

                Slide.ExampleSlide(
                    id = 9,
                    title = "Example 3: Two-Part Problem",
                    problem = "Janine has to travel a total of 351 km. She travels the first 216 km in 4 hours. (a) Calculate her average speed for the first part. (b) If her speed remains the same, calculate the total time for the complete journey.",
                    steps = listOf(
                        "Part (a): Find average speed",
                        "Distance = 216 km",
                        "Time = 4 hours",
                        "Speed = Distance ÷ Time",
                        "Speed = 216 ÷ 4 = 54 km/h",
                        "Answer (a): 54 km/h"
                    ),
                    answer = "Part (a): 54 km/h"
                ),

                Slide.ExampleSlide(
                    id = 10,
                    title = "Example 3 Continued: Finding Total Time",
                    problem = "Part (b): Calculate total time for complete 351 km journey at 54 km/h",
                    steps = listOf(
                        "Given: \n Total distance = 351 km \n Speed = 54 km/h (from part a) \n Find: Total time",
                        "Formula: Time = Distance ÷ Speed",
                        "Time = 351 ÷ 54",
                        "Time = 6.5 hours",
                        "6.5 hours = 6 hours and 30 minutes",
                        "Check: 54 × 6.5 = 351"
                    ),
                    answer = "Total time: 6.5 hours or 6 hours 30 minutes"
                ),

                Slide.PracticeSlide(
                    id = 11,
                    question = "A car travels a distance of 150 km at an average speed of 50 km/h. How long did the trip take? What is being asked?",
                    options = listOf("Time", "Speed", "Distance"),
                    correctAnswer = 0,
                    explanation = "Correct! The question asks 'How long did the trip take?' - this is asking for TIME."
                ),

                Slide.PracticeSlide(
                    id = 12,
                    question = "A cyclist rides at an average speed of 20 km/h for 4 hours. How far did the cyclist travel? What is being asked?",
                    options = listOf("Time", "Speed", "Distance"),
                    correctAnswer = 2,
                    explanation = "Correct! The question asks 'How far did the cyclist travel?' - this is asking for DISTANCE."
                ),

                Slide.PracticeSlide(
                    id = 13,
                    question = "A runner covers 12 km in 1.5 hours. What was the runner's average speed? What is being asked?",
                    options = listOf("Time", "Speed", "Distance"),
                    correctAnswer = 1,
                    explanation = "Correct! The question asks 'What was the average speed?' - this is asking for SPEED."
                ),

                Slide.ConceptSlide(
                    id = 14,
                    title = "Tips for Solving Problems",
                    content = "Follow these steps:",
                    keyPoints = listOf(
                        "Step 1: Identify what's given",
                        "Step 2: Identify what's being asked",
                        "Step 3: Choose the correct formula",
                        "Step 4: Substitute values and calculate",
                        "Step 5: Check your answer makes sense",
                        "Step 6: Include proper units in your answer"
                    )
                ),

                Slide.SummarySlide(
                    id = 15,
                    title = "Summary",
                    keyPoints = listOf(
                        "Key Definitions: \n Distance = how far (m, km, miles) \n Time = how long (s, min, hours) \n Speed = how fast (m/s, km/h, mph)",
                        "Three Formulas: \n Speed = Distance ÷ Time \n Distance = Speed × Time \n Time = Distance ÷ Speed",
                        "Problem-Solving Tips: \n Identify given information \n Identify what's being asked \n Choose correct formula \n Always include units in your answer"
                    )
                )
            )
        )
    }

    // LESSON 6 - SUBTOPIC 1: Strategies for solving the area of composite figures
    private fun getQuarter3Lesson6Subtopic1(): InteractiveLesson {
        return InteractiveLesson(
            id = 57,
            title = "Strategies for Solving the Area of Composite Figures",
            slides = listOf(
                Slide.IntroSlide(
                    id = 1,
                    title = "Welcome!",
                    content = "In this topic, you will learn how to apply the concept of finding the area of composite figures in real-life situations. By the end, you'll be able to clearly visualize different composite shapes and solve problems related to their areas."
                ),

                Slide.ConceptSlide(
                    id = 2,
                    title = "Real-World Problem",
                    content = "To promote recycling, the Sangguniang Kabataan (SK) members of a barangay decided to beautify the 30 ft by 20 ft children's playground by covering the floor of the play pen with cut pieces of tires except the area of 11-ft square sandbox.",
                    imageResourceId = R.drawable.playground_example,
                    keyPoints = listOf(
                        "Playground dimensions: 30 ft by 20 ft",
                        "Sandbox: 11-ft square",
                        "Question: What is the area of the portion that will be covered with pieces of tires?"
                    )
                ),

                Slide.ConceptSlide(
                    id = 3,
                    title = "Analyzing the Problem",
                    content = "Let's answer these questions to understand the problem:",
                    keyPoints = listOf(
                        "1. What is the shape of the play pen? → Rectangle",
                        "2. What is the shape of the area that will not be covered with pieces of tires? → Square (sandbox)",
                        "3. What is asked in the problem? → Area that will be covered with tire pieces"
                    )
                ),

                Slide.ConceptSlide(
                    id = 4,
                    title = "Strategy: Identify the Figures",
                    content = "Now, let us solve the problem.",
                    imageResourceId = R.drawable.feet_figures_example,
                    keyPoints = listOf(
                        "Let us analyze and identify the figures:",
                        "Figure 1: Rectangle (play pen)",
                        "Figure 2: Square (sandbox)",
                        "Strategy: Find total area, subtract excluded area"
                    )
                ),

                Slide.ExampleSlide(
                    id = 5,
                    title = "Finding Areas of Individual Figures",
                    problem = "Calculate the area of each shape:",
                    steps = listOf(
                        "Area of the rectangle (play pen): \n A = l × w \n A = 30 ft × 20 ft \n A = 600 ft²",
                        "Area of the square (sandbox): \n A = s² \n A = 11 ft × 11 ft \n A = 121 ft²"
                    ),
                    answer = "Rectangle: 600 ft²; Square: 121 ft²"
                ),

                Slide.ExampleSlide(
                    id = 6,
                    title = "Final Calculation",
                    problem = "Find the area to be covered with tire pieces:",
                    steps = listOf(
                        "Subtract the area of the square from the rectangle: \n A = Area of rectangle − Area of square \n A = 600 ft² − 121 ft² \n A = 479 ft²",
                        "Check: Does this make sense?",
                        "The sandbox takes up some space,",
                        "so the covered area should be less than 600 ft² ✓"
                    ),
                    answer = "The total area that will be covered with pieces of tires is 479 ft²"
                ),

                Slide.ConceptSlide(
                    id = 7,
                    title = "Another Example Problem",
                    content = "A swimming pool, 44 meters long and 17 meters wide has a footpath of 2 meters surrounding it. What is the total area of the footpath?",
                    keyPoints = listOf(
                        "Swimming pool: 44 m long, 17 m wide",
                        "Footpath: 2 m wide all around",
                        "Find: Total area of footpath only"
                    )
                ),

                Slide.ExampleSlide(
                    id = 8,
                    title = "Solution: Swimming Pool Footpath",
                    problem = "Find the area of the footpath:",
                    imageResourceId = R.drawable.swimming_pool_example,
                    steps = listOf(
                        "1. UNDERSTAND: \n Asked: Total area of footpath \n Given: Pool 44m × 17m, 2m footpath",
                        "2. PLAN: \n Find area of pool \n Find area of pool + footpath \n Subtract to get footpath area",
                        "3. SOLVE: \n Area of swimming pool: \n A = l × w \n A = 44 m × 17 m \n A = 748 m² \n Area of pool with footpath: \n Length: 44 + 2 + 2 = 48 m \n Width: 17 + 2 + 2 = 21 m \n A = 48 m × 21 m \n A = 1,008 m² \n Area of footpath: \n A = 1,008 m² − 748 m² \n A = 260 m²",
                        "4. CHECK: \n 748 m² + 260 m² = 1,008 m² ✓"
                    ),
                    answer = "The area of the footpath is 260 m²"
                ),

                Slide.PracticeSlide(
                    id = 9,
                    question = "Ella has a rectangular sheet of paper with a length of 16 cm and a width of 11 cm. She cuts out a small rectangular piece measuring 7 cm by 6 cm at one corner of the paper. Find the remaining area of the paper.",
                    options = listOf("132 cm²", "134 cm²", "136 cm²", "138 cm²"),
                    correctAnswer = 1,
                    explanation = "Correct! Area of full sheet: 16 × 11 = 176 cm². Area cut out: 7 × 6 = 42 cm². Remaining: 176 − 42 = 134 cm²"
                ),

                Slide.SummarySlide(
                    id = 10,
                    title = "Summary: Solving Composite Figure Areas",
                    keyPoints = listOf(
                        "Strategy for Composite Figures: \n Identify all shapes in the figure \n Calculate area of each shape \n Add or subtract areas as needed",
                        "Two Main Approaches: \n Addition: Break into simpler shapes, add their areas \n Subtraction: Find total area, subtract excluded parts",
                        "Problem-Solving Steps: \n UNDERSTAND - What's given and asked? \n PLAN - Which shapes? Add or subtract? \n SOLVE - Calculate step by step \n CHECK - Does the answer make sense?",
                        "Always include units (ft², m², cm²)!"
                    )
                )
            )
        )
    }

    // LESSON 7 - SUBTOPIC 1: Visualizing the Surface Area of a Solid Figure
    private fun getQuarter3Lesson7Subtopic1(): InteractiveLesson {
        return InteractiveLesson(
            id = 58,
            title = "Visualizing the Surface Area of a Solid Figure",
            slides = listOf(
                Slide.IntroSlide(
                    id = 1,
                    title = "Good day!",
                    content = "In this topic, you will explore how to visualize the surface area of various solid figures, including cubes, prisms, pyramids, cones, cylinders, and spheres."
                ),

                Slide.ConceptSlide(
                    id = 2,
                    title = "What is Visualizing the Surface Area of a Solid Figure?",
                    content = "Visualizing the Surface Area of a Solid Figure means imagining or identifying all the flat surfaces (faces) that make up a 3D object and understanding how these faces fit together.",
                    keyPoints = listOf(
                        "In simpler words:",
                        "It is the process of looking at a solid figure and picturing all its faces, then thinking about how each face contributes to the total area covering the outside of the shape."
                    )
                ),

                Slide.ConceptSlide(
                    id = 3,
                    title = "Review: Area of Basic Plane Figures",
                    content = "Let's start by reviewing the area of some basic plane figures.",
                    imageResourceId = R.drawable.plane_figures_area,
                    keyPoints = listOf(
                        "Square: A = s² (side × side)",
                        "Rectangle: A = l × w (length × width)",
                        "Triangle: A = ½ × b × h (½ × base × height)",
                        "Circle: A = πr² (pi × radius²)",
                        "Solid figures are shapes formed by combining different plane figures.",
                        "When calculating surface area, it is crucial to identify which plane figure makes up each face of the solid."
                    )
                ),

                Slide.ConceptSlide(
                    id = 4,
                    title = "Real-World Problem",
                    content = "Let's take a look at this situation:",
                    keyPoints = listOf(
                        "Aling Sol wanted to redesign her old wooden box.",
                        "She will be using decorative sticker paper to cover it and make it look new.",
                        "Question: How will she know the exact area of sticker paper needed for the wooden box?"
                    )
                ),

                Slide.ConceptSlide(
                    id = 5,
                    title = "Visualizing and Describing",
                    content = "To find the exact amount of sticker paper needed for the wooden box, we need to calculate the surface area of the rectangular prism. \n\n To do this, it's essential to identify the plane figures that make up each of its faces. \n\nFACES OF RECTANGULAR PRISM:",
                    imageResourceId = R.drawable.faces_rectangular_prism,
                    keyPoints = listOf(
                        "A rectangular prism has 6 faces",
                        "Front face (rectangle)",
                        "Back face (rectangle)",
                        "Top face (rectangle)",
                        "Bottom face (rectangle)",
                        "Left side face (rectangle)",
                        "Right side face (rectangle)",
                        "The illustration displays the six faces of a rectangular prism.",
                        "By calculating the area of each face, we can determine the total surface area of the prism."
                    )
                ),

                Slide.ConceptSlide(
                    id = 6,
                    title = "Understanding Nets",
                    content = "Another method for finding the surface area of a solid figure is by using its net. \n\n An illustration of the net of a rectangular prism shown by the wooden box.",
                    imageResourceId = R.drawable.wooden_box_illustration,
                    keyPoints = listOf(
                        "To calculate the surface area, you must determine the area of its faces.",
                        "SA = area of left side + area of right side + area of front + area of back + area of top + area of bottom",
                        "Thus, the surface area of a rectangular prism is:",
                        "SA = 2(h × w + w × l + l × h) \nor \nSA = 2(h × w) + 2(w × l) + 2(l × h)"
                    )
                ),

                Slide.SummarySlide(
                    id = 7,
                    title = "Summary",
                    keyPoints = listOf(
                        "Visualizing Surface Area: \n Imagine or identify all flat surfaces (faces) of a 3D object \n Understand how faces fit together",
                        "Key Concepts: \n Solid figures are made from plane figures \n Identify which plane figure makes up each face \n Calculate area of each face",
                        "Two Methods:",
                        "1. Calculate area of each face directly",
                        "2. Use a NET (2D pattern that folds into 3D shape)",
                        "Next: We'll learn formulas for different solid figures!"
                    )
                )
            )
        )
    }

    // LESSON 7 - SUBTOPIC 2: Surface Area of Solid Figures
    private fun getQuarter3Lesson7Subtopic2(): InteractiveLesson {
        return InteractiveLesson(
            id = 59,
            title = "Surface Area of Solid Figures",
            slides = listOf(
                Slide.IntroSlide(
                    id = 1,
                    title = "Welcome!",
                    content = "In this topic, you'll learn the formulas used to calculate surface area.\n\nSurface area is defined as the total sum of the areas of all the surfaces of a solid shape."
                ),

                Slide.ConceptSlide(
                    id = 2,
                    title = "Surface Area of a Cube",
                    content = "A cube has six square faces, and the total area of these six faces is equal to its surface area.",
                    imageResourceId = R.drawable.surface_area_cubes,
                    keyPoints = listOf(
                        "All faces are identical squares",
                        "Each face has area = s²",
                        "Formula: SA = 6s²",
                        "Where s = length of one side",
                        "Example: If s = 5 cm",
                        "SA = 6(5²) = 6(25) = 150 cm²"
                    )
                ),

                Slide.ConceptSlide(
                    id = 3,
                    title = "Surface Area of a Triangular Prism",
                    content = "A triangular prism has three rectangular lateral faces and two triangular bases.",
                    imageResourceId = R.drawable.triangular_prism,
                    keyPoints = listOf(
                        "Components: \n 2 triangular bases \n 3 rectangular lateral faces",
                        "The surface area is the sum of: \n Areas of the two bases \n Areas of the three lateral faces",
                        "Formula: SA = 2B + Ph",
                        "Where: \n B = area of triangular base \n P = perimeter of base \n h = height of prism"
                    )
                ),

                Slide.ConceptSlide(
                    id = 4,
                    title = "Surface Area of a Pyramid",
                    content = "A pyramid is a solid with a polygonal base, and its lateral faces are triangles that all meet at a common vertex, known as the apex.",
                    imageResourceId = R.drawable.pyramid,
                    keyPoints = listOf(
                        "Formula: SA = B + ½Ps",
                        "Where: \n B = area of base \n P = perimeter of base \n s = slant height",
                        "The surface area of a pyramid is the sum of: \n Area of its polygonal base \n Areas of its triangular faces"
                    )
                ),

                Slide.ConceptSlide(
                    id = 5,
                    title = "Surface Area of a Cylinder",
                    content = "A cylinder is a solid figure that has two circular bases and one curved surface connecting them.",
                    imageResourceId = R.drawable.cylinder,
                    keyPoints = listOf(
                        "The surface area of the cylinder is the sum of the area of the two circular bases and the rectangular lateral area. Thus the surface area for cylinder is\n\n SA = LS + 2B or SA = 2πrh"
                    )
                ),

                Slide.ConceptSlide(
                    id = 6,
                    title = "Surface Area of a Cone",
                    content = "A cone is a solid figure with one vertex, a circular base, and a curved lateral surface connecting the base to the vertex.",
                    imageResourceId = R.drawable.surface_area_cone,
                    keyPoints = listOf(
                        "To calculate the area of the lateral surface: \n We can imagine 'unwrapping' the curved surface \n It forms a sector of a circle",
                        "The lateral surface area can be found using: \n L.A. = πrs",
                        "Where: \n r = radius of base \n s = slant height"
                    )
                ),

                Slide.ConceptSlide(
                    id = 7,
                    title = "Cone Surface Area Formula",
                    content = "Understanding the lateral surface of a cone:",
                    imageResourceId = R.drawable.lateral_surface,
                    keyPoints = listOf(
                        "The base of the new figure is πr and the height is the slant height of the curved surface. So, L.A. = πrs\n\n SA = πrs + πr2"
                    )
                ),

                Slide.ConceptSlide(
                    id = 8,
                    title = "Surface Area of a Sphere",
                    content = "A sphere is a three-dimensional figure where every point on its surface is equidistant from its center.",
                    imageResourceId = R.drawable.surface_area_sphere,
                    keyPoints = listOf(
                        "The total area of FOUR circles, each with the same radius, completely covers the surface area of a sphere with that radius.",
                        "Formula: SA = 4πr²",
                        "Where: r = radius of sphere",
                        "Example: If r = 3 cm",
                        "SA = 4π(3²) = 4π(9) = 36π ≈ 113.1 cm²"
                    )
                ),

                Slide.ConceptSlide(
                    id = 9,
                    title = "Units of Measure for Surface Area",
                    content = "To measure surface area, we use square units:",
                    imageResourceId = R.drawable.unit_measure_surface_area,
                    keyPoints = listOf(
                        "Metric units: \n mm² (square millimeters) \n cm² (square centimeters) \n dm² (square decimeters) \n m² (square meters) \n km² (square kilometers)",
                        "Imperial units: \n in² (square inches) \n ft² (square feet) \n yd² (square yards) \n mi² (square miles)",
                        "Example: A rectangular prism with length 5 cm, width 3 cm, height 2 cm:",
                        "SA = 2(5×3 + 3×2 + 2×5)",
                        "SA = 2(15 + 6 + 10) = 2(31) = 62 cm²"
                    )
                ),

                Slide.PracticeSlide(
                    id = 10,
                    question = "True or False: Surface area is the total area of all the faces or surfaces of a 3D solid figure.",
                    options = listOf("True", "False"),
                    correctAnswer = 0,
                    explanation = "Correct! Surface area is indeed the total area of all faces or surfaces of a 3D solid figure."
                ),

                Slide.SummarySlide(
                    id = 11,
                    title = "Summary: Surface Area of Solid Figures",
                    keyPoints = listOf(
                        "Surface area = total area of all faces or surfaces of a 3D solid figure",
                        "Cube: SA = 6s²",
                        "Triangular Prism: SA = 2B + Ph",
                        "Pyramid: SA = B + ½Ps",
                        "Cylinder: SA = 2πr² + 2πrh or 2πr(r + h)",
                        "Cone: SA = πrs + πr² or πr(s + r)",
                        "Sphere: SA = 4πr²",
                        "Has 6 equal square faces",
                        "Has 2 triangular bases and 3 rectangular lateral faces",
                        "Has one polygonal base and triangular faces meeting at apex",
                        "Has 2 circular bases and 1 curved surface",
                        "Has 1 circular base, 1 vertex, and curved surface",
                        "Perfectly round figure",
                        "Units: Always express in square units (mm², cm², m², in², ft², etc.)",
                        "Surface area can be understood by examining NETS of solids!"
                    )
                )
            )
        )
    }

    // LESSON 8 - SUBTOPIC 1: Finding the Surface Area and Solving Word Problems Related to It
    private fun getQuarter3Lesson8Subtopic1(): InteractiveLesson {
        return InteractiveLesson(
            id = 60,
            title = "Finding the Surface Area and Solving Word Problems Related to It",
            slides = listOf(
                Slide.IntroSlide(
                    id = 1,
                    title = "Hey there!",
                    content = "You will learn to identify the faces of solid figures, compute surface area using formulas, and solve word problems."
                ),

                Slide.ConceptSlide(
                    id = 2,
                    title = "Example Problem 1",
                    content = "Mr. Reyes wants to paint his storage shed. The shed is in the shape of a rectangular prism, shown below. He only has 3 gallons of paint that can cover 266 square feet of the surface of the storage shed. Is there enough paint for Mr. Reyes to repaint the whole shed?",
                    imageResourceId = R.drawable.storage_shed_example,
                    keyPoints = listOf(
                        "Questions to consider: \n How many faces does the figure have? \n What is the shape of the bottom and top faces of the storage shed? \n What are the shapes of the side faces?",
                        "To know if there is enough paint left for Mr. Reyes,",
                        "let us visualize the net of the storage shed,",
                        "which is in the shape of a rectangular prism."
                    )
                ),

                Slide.ConceptSlide(
                    id = 3,
                    title = "Simplest Way to Solve",
                    content = "The simplest way to solve for the surface area of a prism is to compute the area of each face, and add all the areas of the faces.",
                    imageResourceId = R.drawable.storage_shed_net,
                    keyPoints = listOf(
                        "Calculate area of each face: \n Area of left side: 8 ft × 7 ft = 56 ft² \n Area of right side: 8 ft × 7 ft = 56 ft² \n Area of top: 14 ft × 7 ft = 98 ft² \n Area of bottom: 14 ft × 7 ft = 98 ft² \n Area of front: 14 ft × 8 ft = 112 ft² \n Area of back: 14 ft × 8 ft = 112 ft²",
                        "Therefore the surface area of a rectangular prism can be derived as follows."
                    )
                ),

                Slide.ExampleSlide(
                    id = 4,
                    title = "Compute Surface Area",
                    problem = "Find the total surface area of Mr. Reyes' storage shed:",
                    imageResourceId = R.drawable.surface_area_compute,
                    steps = listOf(
                        "Formula: SA = 2(w × h) + 2(l × h) + 2(l × w)",
                        "Substitute values: \n SA = 2(8 ft × 7 ft) + 2(14 ft × 7 ft) + 2(14 ft × 8 ft) \n SA = 2(56 ft²) + 2(98 ft²) + 2(112 ft²) \n SA = 112 ft² + 196 ft² + 224 ft² \n SA = 532 ft²",
                        "Conclusion: \n The total surface area of Mr. Reyes' storage shed is 532 ft². \n Paint available: 3 gallons = 266 ft² \n Paint needed: 532 ft²",
                        "The paint left for Mr. Reyes is NOT enough to cover the whole storage shed."
                    ),
                    answer = "532 ft² (not enough paint - need 532 ft², have 266 ft²)"
                ),

                Slide.ConceptSlide(
                    id = 5,
                    title = "Remember",
                    content = "Important concept about surface area:",
                    keyPoints = listOf(
                        "The surface area refers to the sum of: \n The areas of the bases \n The areas of lateral faces of a solid figure.",
                        "One way to find the surface area of a solid figure is to find the area of its net.",
                        "It can be measured in square units: \n cm², ft², m², and other units."
                    )
                ),

                Slide.ExampleSlide(
                    id = 6,
                    title = "Example Problem 2",
                    problem = "Find the surface area of the triangular prism.",
                    imageResourceId = R.drawable.triangular_prism_example,
                    steps = listOf(
                        "Step 1: Find the lateral area",
                        "LA = ph",
                        "p = perimeter = 3 + 5 + 4 = 12 cm",
                        "LA = 12 × 11",
                        "LA = 132 cm²",
                        "Step 2: Find the surface area \n SA = LA + 2B \n B = area of triangular base \n B = ½ × b × h \n B = ½ × 4 × 2 = 4 cm² \n SA = 132 + 2(4) \n SA = 132 + 8 \n SA = 140 cm²"
                    ),
                    answer = "The surface area of the triangular prism is 140 cm²"
                ),

                Slide.PracticeSlide(
                    id = 7,
                    question = "Practice Time!! How much rubber material was used to coat a soccer ball with a radius of 7.77 decimeters?",
                    imageResourceId = R.drawable.soccer_example,
                    options = listOf("758.25 dm²", "785.25 dm²", "735.25 dm²", "753.25 dm²"),
                    correctAnswer = 0,
                    explanation = "Correct! For a sphere, SA = 4πr². SA = 4 × π × (7.77)² = 4 × π × 60.3729 ≈ 758.25 dm²"
                ),

                Slide.SummarySlide(
                    id = 8,
                    title = "Summary",
                    keyPoints = listOf(
                        "Surface area is the total area of all the faces of a solid figure.",
                        "We can find it by: \n Adding the area of each face individually \n Using the formula for the specific solid figure",
                        "Key formulas: \n Rectangular Prism: SA = 2(lw + lh + wh) \n Triangular Prism: SA = LA + 2B = ph + 2B \n Sphere: SA = 4πr²",
                        "Always express your answer in square units!",
                        "(cm², m², ft², dm², etc.)"
                    )
                )
            )
        )
    }

    // ============== QUARTER 4 ==============
    // LESSON 1 - SUBTOPIC 1: Understanding the Volume of Prisms, Pyramids, and Other 3D Shapes
    private fun getQuarter4Lesson1Subtopic1(): InteractiveLesson {
        return InteractiveLesson(
            id = 61,
            title = "Understanding the Volume of Prisms, Pyramids, and Other 3D Shapes and Solving Word Problems Related to It",
            slides = listOf(
                Slide.IntroSlide(
                    id = 1,
                    title = "Welcome!!",
                    content = "In this topic, you will learn the relationship between the volumes of a prism and a pyramid."
                ),

                Slide.ConceptSlide(
                    id = 2,
                    title = "Understanding Cubic Units",
                    content = "To begin, take a look at the figures below.",
                    imageResourceId = R.drawable.cubic_units_example,
                    keyPoints = listOf(
                        "How many cubic units are there in one layer?",
                        "How many layers fill the figure?",
                        "In the figures above: \n 24 cubic units in one layer \n 8 layers total",
                        "Total cubic units: 24 × 8 = 192 cubic units",
                        "This represents the volume of this figure"
                    )
                ),

                Slide.ConceptSlide(
                    id = 3,
                    title = "Volume of a Rectangular Prism",
                    content = "If you can still remember?",
                    keyPoints = listOf(
                        "The volume of a rectangular prism is: Product of length, width, and height",
                        "V = l × w × h",
                        "Common 3D shapes:",
                        " Rectangular prism",
                        " Cube",
                        " Cylinder",
                        " Cone",
                        " Pyramid",
                        " Sphere"
                    )
                ),

                Slide.ConceptSlide(
                    id = 4,
                    title = "What is Volume?",
                    content = "According to the book 21st Century Mathletes 2016:",
                    keyPoints = listOf(
                        "Volume of a prism: \n The amount of space inside it \n Measured in cubic units \n Tells you how many cubes of a given size it takes to fill the prism",
                        "Think of it as:",
                        "How many 1×1×1 unit cubes fit inside?"
                    )
                ),

                Slide.ConceptSlide(
                    id = 5,
                    title = "Volume of a Pyramid",
                    content = "What if we are to get the volume of a pyramid where the dimensions of the base and its height are the same as the given rectangular prism?",
                    keyPoints = listOf(
                        "Key question: \n How does pyramid volume compare to prism volume \n when they have the same base and height? \n Let's investigate..."
                    )
                ),

                Slide.ConceptSlide(
                    id = 6,
                    title = "Pyramid and Prism Relationship",
                    content = "Let us take a look at this figure.",
                    imageResourceId = R.drawable.pyramid_prism_water,
                    keyPoints = listOf(
                        "Experiment: \n Fill the rectangular prism with water using the pyramid \n Important: \n The prism and pyramid have the same base and height"
                    )
                ),

                Slide.ConceptSlide(
                    id = 7,
                    title = "Let us take a look at this figure.",
                    imageResourceId = R.drawable.pyramid_prism_water,
                    content = "Therefore, if the volume of the given prism is 192 cubic units, then the volume of the pyramid is 192 ÷ 3 = 64 cubic units. Vice versa, if the volume of the given pyramid is 64 cubic units, the volume of the rectangular prism is 64  3 = 192.",
                ),

                Slide.ConceptSlide(
                    id = 8,
                    title = "Water in a Cylinder Using a Cone",
                    content = "What if we have to pour water in a cylinder using a cone of the same base and height?",
                    imageResourceId = R.drawable.cone_cylinder_water,
                    keyPoints = listOf(
                        "Experiment: Fill a cylinder using a cone",
                        "Result: It takes THREE cones to fill the cylinder",
                        "Condition: The cone and cylinder have the same base and height same relationship as pyramid and prism!"
                    )
                ),

                Slide.ConceptSlide(
                    id = 9,
                    title = "Example 1: Find Volume of Cone",
                    content = "Find the volume of the cone inside the cylinder. The cone and cylinder have the same base and height.",
                    imageResourceId = R.drawable.cone_cylinder_example1,
                ),

                Slide.ConceptSlide(
                    id = 10,
                    title = "Example 2: Find Volume of Cylinder",
                    content = "Find the volume of the cylinder. The cone and cylinder have the same base and height.",
                    imageResourceId = R.drawable.cone_cylinder_example2,
                ),

                Slide.ConceptSlide(
                    id = 11,
                    title = "Water into a Cylinder Using a Sphere",
                    content = "What if we have to pour water into a cylinder using a sphere of the same base and height?",
                    imageResourceId = R.drawable.sphere_cylinder_water,
                    keyPoints = listOf(
                        "Experiment: Fill a cylinder using a sphere",
                        "Result: It still needs THREE spheres to fill the cylinder",
                        "Note: The cylinder and sphere have the same base and height",
                    )
                ),

                Slide.ConceptSlide(
                    id = 12,
                    title = "Guide 1: Find Volume of Sphere",
                    content = "Find the volume of the sphere inside the cylinder. The sphere and the cylinder have the same base and height.",
                    imageResourceId = R.drawable.sphere_cylinder_guide1,
                ),

                Slide.ConceptSlide(
                    id = 13,
                    title = "Guide 2: Find Volume of Cylinder",
                    content = "Find the volume of the cylinder. The sphere and cylinder have the same base and height.",
                    imageResourceId = R.drawable.sphere_cylinder_guide2,
                ),

                Slide.ConceptSlide(
                    id = 14,
                    title = "Key Relationships Summary",
                    content = "Therefore, from the given examples:",
                    keyPoints = listOf(
                        "Prism and Pyramid: \n If they have the same base and height \n It takes THREE pyramids to fill the prism \n Volume of pyramid = ⅓ × Volume of prism",
                        "Cylinder and Cone: \n If they have the same base and height \n It takes THREE cones to fill the cylinder \n Volume of cone = ⅓ × Volume of cylinder",
                        "Cylinder and Sphere: \n If sphere fits inside cylinder (diameter = height) \n Volume of sphere = ⅔ × Volume of cylinder",
                        "Remember: The '⅓ rule' applies to pyramids and cones!"
                    )
                ),

                Slide.PracticeSlide(
                    id = 15,
                    imageResourceId = R.drawable.practice_cubic_units,
                    question = "Practice Time!! A solid figure is made up of small unit cubes. One side of the figure has 9 cubic units. What is the total number of cubic units in the figure (its volume)?",
                    options = listOf("54", "63", "18", "72"),
                    correctAnswer = 0,
                    explanation = "Correct! If one side has 9 cubic units and it's a cube, each layer has 9 units. With 6 layers total, the volume is 9 × 6 = 54 cubic units."
                ),

                Slide.SummarySlide(
                    id = 16,
                    title = "Summary",
                    keyPoints = listOf(
                        "Volume measures how much space a 3D figure occupies (in cubic units)",
                        "The volume of a rectangular prism is length × width × height",
                        "Key Relationships: \n A pyramid with the same base and height as a prism has ⅓ of the prism's volume \n A cone also has ⅓ the volume of a cylinder with the same base and height \n A sphere has ⅔ the volume of a cylinder when it fits inside (diameter = height)",
                        "Remember: \n Volume of pyramid/cone = ⅓ × Volume of prism/cylinder \n Always express volume in cubic units (cm³, m³, etc.)"
                    )
                )
            )
        )
    }

    // LESSON 2 - SUBTOPIC 1: Finds the Volume of Cylinders, Pyramids, Cones, and Spheres
    private fun getQuarter4Lesson2Subtopic1(): InteractiveLesson {
        return InteractiveLesson(
            id = 62,
            title = "Finds the Volume of Cylinders, Pyramids, Cones, and Spheres, and Solves Routine and Non-Routine Problems Related to it",
            slides = listOf(
                Slide.IntroSlide(
                    id = 1,
                    title = "Welcome!!",
                    content = "After this topic you will understand what volume is and learn how to compute the volume of different solid figures.\n\nYou will practice using formulas and solving real-life problems involving cylinders, cones, pyramids, and spheres."
                ),

                Slide.ConceptSlide(
                    id = 2,
                    title = "Same Radius and Same Height",
                    content = "Let us try to build a connection and derive a formula between the volume of these matching solids (same radius and same height). Suppose we will try to fill these solid figures with water or sand",
                    imageResourceIds = listOf(
                        R.drawable.matching_solids_1,
                        R.drawable.matching_solids_2,
                        R.drawable.matching_solids_3
                    )
                ),

                Slide.ConceptSlide(
                    id = 3,
                    title = "Trivia: Cone and Cylinder",
                    content = "Do you know that it takes three cones to fill the cylinder with sand or water?",
                    keyPoints = listOf(
                        "The cone and cylinder must have: \n Same radius \n Same height",
                        "Volume of cone = ⅓ × Volume of cylinder"
                    )
                ),

                Slide.ConceptSlide(
                    id = 4,
                    title = "Trivia: Sphere and Cylinder",
                    content = "The space a sphere takes is ⅔ of the volume of the cylinder.",
                    keyPoints = listOf(
                        "When the sphere fits perfectly inside the cylinder: \n Sphere diameter = cylinder height \n Both have the same radius",
                        "Volume of sphere = ⅔ × Volume of cylinder"
                    )
                ),

                Slide.ConceptSlide(
                    id = 5,
                    title = "Trivia: Pyramid and Prism",
                    content = "It takes exactly 3 full pyramids to fill the prism.",
                    keyPoints = listOf(
                        "The pyramid and prism must have: \n Same base area \n Same height",
                        "Volume of pyramid = ⅓ × Volume of prism"
                    )
                ),

                Slide.ConceptSlide(
                    id = 6,
                    title = "Volume of A Cone",
                    content = "What mathematical formula can you derive for the volume of a cone?",
                    keyPoints = listOf(
                        "Note: \nThe volume of a cylinder is three times the volume of the cone, \nor \nThe volume of a cone is ⅓ that of the cylinder"
                    )
                ),

                Slide.ConceptSlide(
                    id = 7,
                    title = "Formula to find the Volume of A Cylinder",
                    content = "V = B × h",
                    keyPoints = listOf(
                        "Where: \n B = Area of the base \n B = πr² \n π = 3.14 \n h = height",
                        "Therefore: V = πr²h"
                    )
                ),

                Slide.ConceptSlide(
                    id = 8,
                    title = "Formula to find the Volume of A Cone",
                    content = "V = ⅓Bh",
                    keyPoints = listOf(
                        "Where: \n B = area of the base \n B = πr² \n π = 3.14 \n h = height of the cone",
                        "Therefore: V = ⅓Bh  or  ⅓πr²h  or  ⅓πr²h"
                    )
                ),

                Slide.ConceptSlide(
                    id = 9,
                    title = "Formula to find the Volume of A Pyramid",
                    content = "V = ⅓ × area of base × height",
                    keyPoints = listOf(
                        "The base can be any polygon: \n Square \n Rectangle \n Triangle \n etc.",
                        "Calculate the area of that base shape,",
                        "then multiply by ⅓ × height"
                    )
                ),

                Slide.ConceptSlide(
                    id = 10,
                    title = "Formula to find the Volume of A Sphere",
                    content = "V = ⁴⁄₃ × πr³",
                    keyPoints = listOf(
                        "Where: \n r = radius of the sphere \n π = 3.14",
                        "The formula is: V = ⁴⁄₃πr³"
                    )
                ),

                Slide.ExampleSlide(
                    id = 11,
                    title = "Example: Finding the Volume of a Cone",
                    problem = "A cone hat has a diameter of 8 cm and a height of 10 cm; what is its volume?",
                    imageResourceId = R.drawable.cone_hat_example,
                    steps = listOf(
                        "What is being asked? \n The volume of the cone",
                        "What are the given facts? \n d = 8 cm, h = 10 cm",
                        "What is the operation to be used? \n Multiplication"
                    ),
                    answer = "We need to find the volume"
                ),

                Slide.ExampleSlide(
                    id = 12,
                    title = "Use the formula to find the Volume of A Cone",
                    problem = "Calculate the volume of the cone hat:",
                    steps = listOf(
                        "What is the formula for the volume of a cone? V = ⅓Bh or ⅓πr²h",
                        "What is the number sentence? V = ⅓Bh or ⅓πr²h = N",
                        "Write the solution with the correct label:",
                        "First, find radius: r = d ÷ 2 = 8 ÷ 2 = 4 cm",
                        "V = ⅓Bh or ⅓πr²h",
                        "V = ⅓(3.14) × 4 cm × 4 cm × 10 cm",
                        "V = ⅓(3.14 × 16 cm² × 10 cm)",
                        "V = ⅓(3.14 × 160 cm³)",
                        "V = ⅓(502.4 cm³)",
                        "V = 167.47 cm³"
                    ),
                    answer = "The volume of the cone is 167.47 cm³"
                ),

                Slide.ExampleSlide(
                    id = 13,
                    title = "Example: Finding the Volume of a Cylinder",
                    problem = "Lilly is molding a cylindrical candle with a diameter of 16 cm and a height of 22 cm. How much wax does she need to mold the candle?",
                    imageResourceId = R.drawable.cylindrical_candle,
                    steps = listOf(
                        "What is the shape of the candle? \nCylinder",
                        "How are you going to solve the problem? \nFind the volume of the cylindrical candle"
                    ),
                    answer = "Find volume using cylinder formula"
                ),

                Slide.ExampleSlide(
                    id = 14,
                    title = "Use the formula to find the Volume of A Cylinder",
                    problem = "Calculate the volume:",
                    imageResourceId = R.drawable.cylindrical_candle,
                    steps = listOf(
                        "What is the formula for the volume of a cylinder?",
                        "V = πr²h",
                        "Write your solution and answer:",
                        "Given: d = 16 cm, h = 22 cm",
                        "Find radius: r = d ÷ 2 = 16 ÷ 2 = 8 cm",
                        "V = πr²h",
                        "V = (3.14)(8)²(22 cm)",
                        "V = 3.14 × 64 × 22 cm³",
                        "V = 200.96 × 22",
                        "V = 4,421.12 cm³"
                    ),
                    answer = "Lilly needs 4,421.12 cm³ of wax to mold the candle"
                ),

                Slide.ExampleSlide(
                    id = 15,
                    title = "Example: Finding the Volume of a Pyramid",
                    problem = "In a bazaar, Terry bought a square pyramid glass keychain for his bag. The base of the keychain is 5 cm by 6.5 cm, and its height is 8 cm. Find the volume of the glass used to make the glass pyramid.",
                    imageResourceId = R.drawable.pyramid_keychain,
                    steps = listOf(
                        "What is being asked? \n The volume of the glass pyramid keychain",
                        "What is the shape of the base? \n Rectangle",
                        "What are the given facts? \n 5 cm by 6.5 cm, h = 8 cm",
                        "What is the operation to be used? \n Formula for the volume of pyramid"
                    ),
                    answer = "Find volume of pyramid"
                ),

                Slide.ExampleSlide(
                    id = 16,
                    title = "Use the formula to find the Volume of A Pyramid",
                    problem = "Calculate the volume:",
                    steps = listOf(
                        "What is the formula for the volume of a pyramid?",
                        "Volume of Pyramid = ⅓ × area of base × height",
                        "V = ⅓Bh or V = ⅓(l × w × h)",
                        "V = ⅓(5 × 6.5)(8)",
                        "V = ⅓(32.5)(8)",
                        "V = ⅓(260)",
                        "V = 86.67 cm³"
                    ),
                    answer = "The volume of the glass pyramid keychain is 86.67 cm³"
                ),

                Slide.ExampleSlide(
                    id = 17,
                    title = "Example: Finding the Volume of a Sphere",
                    problem = "Lacy wants to know how much water a sphere can hold with a radius of 12 cm. Find the volume. Use 3.14 for pi.",
                    imageResourceId = R.drawable.sphere_water,
                    steps = listOf(
                        "What is being asked? \n The volume of the water the sphere can hold",
                        "What are the given facts? \n r = 12 cm",
                        "What is the operation to be used? \n Use the formula for the volume of a sphere \n V = ⁴⁄₃ × πr³"
                    ),
                    answer = "Find volume of sphere"
                ),

                Slide.ExampleSlide(
                    id = 18,
                    title = "Use the formula to find the Volume of A Sphere",
                    problem = "Calculate the volume:",
                    steps = listOf(
                        "Write the number sentence and your final answer",
                        "with its correct label:",
                        "V = ⁴⁄₃ × πr³ = N",
                        "r = 12",
                        "V = ⁴⁄₃ × 3.14 × 12³",
                        "V = ⁴⁄₃ × 3.14 × 1,728",
                        "V = ⁴⁄₃ × 5,425.92",
                        "V = 7,234.56 cm³"
                    ),
                    answer = "The volume of the water the sphere can hold is 7,234.56 cm³"
                ),

                Slide.ConceptSlide(
                    id = 19,
                    title = "Remember:",
                    content = "The volume of a solid figure is the amount of space inside it.",
                    keyPoints = listOf(
                        "Volume is measured in cubic units: \n m³ (cubic meters) \n cm³ (cubic centimeters) \n dm³ (cubic decimeters) \n etc.",
                        "This means the total number of cubes",
                        "it takes to fill a solid figure"
                    )
                ),

                Slide.PracticeSlide(
                    id = 20,
                    question = "Practice Time!! Marco is making a drum shaped like a cylinder. The drum has a diameter of 10 cm and a height of 15 cm. How much space (volume) does the inside of the drum have?",
                    options = listOf("1,100.5 cm³", "1,177.5 cm³", "1,057.5 cm³", "1,255.5 cm³"),
                    correctAnswer = 1,
                    explanation = "Correct! r = 10 ÷ 2 = 5 cm. V = πr²h = 3.14 × 5² × 15 = 3.14 × 25 × 15 = 1,177.5 cm³"
                ),

                Slide.SummarySlide(
                    id = 21,
                    title = "Summary",
                    keyPoints = listOf(
                        "Volume is the amount of space inside a solid figure",
                        "Formulas for volume: \n Cylinder: V = πr²h \n Cone: V = ⅓πr²h \n Pyramid: V = ⅓ × base area × height \n Sphere: V = ⁴⁄₃πr³",
                        "Key Relationships: \n A cone is ⅓ the volume of a cylinder with the same radius and height \n A pyramid is ⅓ the volume of a prism with the same base and height \n A sphere is ⅔ the volume of a cylinder when it fits inside",
                        "Answers must always have cubic units (cm³, m³, dm³, etc.)"
                    )
                )
            )
        )
    }

    // LESSON 3 - SUBTOPIC 1: Electric Meter
    private fun getQuarter4Lesson3Subtopic1(): InteractiveLesson {
        return InteractiveLesson(
            id = 63,
            title = "Electric Meter",
            slides = listOf(
                Slide.IntroSlide(
                    id = 1,
                    title = "Good day!",
                    content = "In this topic you will learn Electric meter. Also, you will learn how to read and understand electric readings. You will also practice recording, interpreting, and writing these meter readings."
                ),

                Slide.ConceptSlide(
                    id = 2,
                    title = "What is an Electric Meter?",
                    content = "An Electric Meter (also called electricity meter or kWh meter) is a device that measures how much electrical energy a home, building, or device uses. It is the machine that counts your electricity usage so the electric company knows how much to charge you.",
                    imageResourceId = R.drawable.electric_meter,
                    keyPoints = listOf(
                        "Measures electrical energy usage",
                        "Also called kWh meter",
                        "Records consumption for billing",
                        "Found in homes, buildings, devices"
                    )
                ),

                Slide.ConceptSlide(
                    id = 3,
                    title = "Understanding Kilowatt-hours (kWh)",
                    content = "Electricity is one of the most important forms of energy that powers homes, offices, schools, and factories. It is measured in watt-hours when it passes through an electric meter. Since a watt is a small unit, we use kilowatt-hours (kWh) to measure larger amounts of electricity.",
                    keyPoints = listOf(
                        "Electricity measured in watt-hours",
                        "kWh = kilowatt-hour (larger unit)",
                        "1 kWh = 1,000 watt-hours",
                        "Amount of electricity consumed is expressed in kWh"
                    )
                ),

                Slide.ConceptSlide(
                    id = 4,
                    title = "Reading Electric Meter",
                    imageResourceId = R.drawable.electric_meter_reading_1,
                    content = "To read your meter, start by reading the dials from right to left. The first dial turns clockwise, the second turns counterclockwise, the third turns clockwise, the fourth turns counterclockwise, and the fifth turns clockwise.",
                    keyPoints = listOf(
                        "Read dials from RIGHT to LEFT",
                        "Dial directions alternate: \n 1st dial: Clockwise → \n 2nd dial: Counterclockwise ← \n 3rd dial: Clockwise → \n 4th dial: Counterclockwise ← \n 5th dial: Clockwise →"
                    )
                ),

                Slide.ConceptSlide(
                    id = 5,
                    title = "How to Read the Dials",
                    imageResourceId = R.drawable.electric_meter_reading_2,
                    content = "Begin by reading the numbers pointed to by the arrows from right to left, starting from Dial E to Dial A.",
                    keyPoints = listOf(
                        "Order: Dial E → D → C → B → A",
                        "Read from RIGHT to LEFT",
                        "Record the number each pointer indicates",
                        "Example order: E, D, C, B, A"
                    )
                ),

                Slide.ConceptSlide(
                    id = 6,
                    title = "Rule 1: Pointer Between Two Numbers",
                    imageResourceId = R.drawable.electric_meter_reading_3,
                    content = "If the pointer is between two numbers, write down the smaller number, except when it is between 0 and 9. Because in that case, always choose 9.",
                    keyPoints = listOf(
                        "Between two numbers? Use the SMALLER one",
                        "Exception: Between 0 and 9? Use 9",
                        "Example: Between 3 and 4? Record 3",
                        "Example: Between 9 and 0? Record 9"
                    )
                ),

                Slide.ConceptSlide(
                    id = 7,
                    title = "Rule 2: Pointer Exactly on a Number",
                    imageResourceId = R.drawable.electric_meter_reading_4,
                    content = "If the pointer is exactly on a number, check the dial to the right to determine the correct reading:",
                    keyPoints = listOf(
                        "Look at the dial to the RIGHT",
                        "If right dial HAS passed zero: Use the number pointed to",
                        "If right dial has NOT passed zero: Use the smaller number (previous number)",
                        "This ensures accurate reading"
                    )
                ),

                Slide.ExampleSlide(
                    id = 8,
                    title = "Example: Reading an Electric Meter",
                    problem = "Lyca was asked by her father to read their electric meter. The dials of the electric meter looked like this:",
                    imageResourceId = R.drawable.electric_meter_reading_example,
                    steps = listOf(
                        "Read from right to left (E to A): \n Dial E (rightmost): Points to 0 \n Dial D: Points to 9 \n Dial C: Points to 4 \n Dial B: Points to 2 \n Dial A (leftmost): Points to 1",
                        "Combine the readings: \n A B C D E \n 1 2 4 9 0",
                        "Reading: 12490 kWh"
                    ),
                    answer = "This reads 12490 kWh"
                ),

                Slide.PracticeSlide(
                    id = 9,
                    question = "Determine the reading on this electric meter.",
                    imageResourceId = R.drawable.electric_meter_reading_practice,
                    options = listOf(
                        "39102 kWh",
                        "31291 kWh",
                        "32091 kWh",
                        "30129 kWh"
                    ),
                    correctAnswer = 0,
                    explanation = "Correct! Reading from right to left: 2-0-1-9-3 = 39102 kWh"
                ),

                Slide.SummarySlide(
                    id = 10,
                    title = "Summary: Electric Meter Reading",
                    keyPoints = listOf(
                        "Electric Meter (kWh meter): \n Measures electrical energy usage \n Records consumption in kilowatt-hours (kWh)",
                        "Reading Instructions: \n Five dials turning in alternating directions \n Read from RIGHT to LEFT (E → D → C → B → A)",
                        "Reading Rules: \n Between two numbers: use smaller (except 0-9, use 9) \n Exactly on a number: check right dial \n  - Right dial passed 0? Use pointed number \n  - Right dial not passed 0? Use previous number",
                        "Practice reading dials to get accurate readings!"
                    )
                )
            )
        )
    }

    // LESSON 3 - SUBTOPIC 2: Water Meter
    private fun getQuarter4Lesson3Subtopic2(): InteractiveLesson {
        return InteractiveLesson(
            id = 64,
            title = "Water Meter",
            slides = listOf(
                Slide.IntroSlide(
                    id = 1,
                    title = "Hello!",
                    content = "In this topic you will learn about Water Meter. Also, you will learn how to read and understand water readings. You will also practice recording, interpreting, and writing these meter readings.",
                    imageResourceId = R.drawable.water_meter_reading_1
                ),

                Slide.ConceptSlide(
                    id = 2,
                    title = "What is a Water meter?",
                    content = "A water meter is a device used to measure the amount of water a household or building uses. It records how many cubic meters (m³) or gallons of water have flowed through the pipe so that the water company can determine how much to charge.",
                    keyPoints = listOf(
                        "Measures water usage",
                        "Records cubic meters (m³) or gallons",
                        "Used for billing by water company",
                        "Installed in households and buildings"
                    )
                ),

                Slide.ConceptSlide(
                    id = 3,
                    title = "Why Water Meters?",
                    content = "Man cannot live without water. In towns and cities where water runs through pipes, every drop of water from the faucet is measured through the water meter.",
                    keyPoints = listOf(
                        "Water is essential for life",
                        "In cities, water flows through pipes",
                        "Every drop from the faucet is measured",
                        "Amount consumed expressed in cubic meters (m³)",
                        "Reading water meters is similar to reading electric meters"
                    )
                ),

                Slide.ConceptSlide(
                    id = 4,
                    title = "Reading Water Meters",
                    imageResourceId = R.drawable.water_meter_reading_2,
                    content = "Start reading from right to left (clockwise). Read the number indicated by the pointer on the dial. If the pointer is between two numbers, write down the lower number.",
                    keyPoints = listOf(
                        "Read from RIGHT to LEFT",
                        "Follow clockwise direction",
                        "Read number pointed to by pointer",
                        "Between two numbers? Use LOWER number"
                    )
                ),

                Slide.ConceptSlide(
                    id = 5,
                    title = "Rule: Pointer Exactly on a Number",
                    imageResourceId = R.drawable.water_meter_reading_3,
                    content = "If the pointer is exactly on a number, check the dial to the right to determine the correct reading:",
                    keyPoints = listOf(
                        "Check the dial to the RIGHT",
                        "If right dial HAS passed zero: Use the number pointed to",
                        "If right dial has NOT passed zero: Use the smaller number",
                        "Same rule as electric meters!"
                    )
                ),

                Slide.ConceptSlide(
                    id = 6,
                    title = "Recording the Reading",
                    imageResourceId = R.drawable.water_meter_reading_2,
                    content = "Always record the numbers from right to left.",
                    keyPoints = listOf(
                        "Example reading: 12753 m³",
                        "Start from rightmost dial",
                        "Work your way left",
                        "Combine all digits for final reading",
                        "Include units: m³ (cubic meters)"
                    )
                ),

                Slide.ExampleSlide(
                    id = 7,
                    title = "Example: Reading Water Meter",
                    imageResourceId = R.drawable.water_meter_reading_4,
                    problem = "Read and interpret the dials on the meter below. The rightmost dial has the highest value.",
                    steps = listOf(
                        "To get the exact meter reading: \n Start from right to left (highest numbered dial) \n Read clockwise direction \n Dial 1 (rightmost): 3 \n Dial 2: 5 \n Dial 3: 7 \n Dial 4: 2 \n Dial 5 (leftmost): 1",
                        "Combine: 1 2 7 5 3",
                        "Reading: 12753 m³"
                    ),
                    answer = "The water meter shows 12753 m³"
                ),

                Slide.PracticeSlide(
                    id = 8,
                    question = "Determine the reading on this water meter.",
                    imageResourceId = R.drawable.water_meter_reading_practice,
                    options = listOf(
                        "98637 m³",
                        "96387 m³",
                        "97368 m³",
                        "93867 m³"
                    ),
                    correctAnswer = 0,
                    explanation = "Correct! Reading from right to left: 7-3-6-8-9 = 98637 m³"
                ),

                Slide.SummarySlide(
                    id = 9,
                    title = "Summary: Water Meter",
                    keyPoints = listOf(
                        "Water Meter: \n Measures water usage in cubic meters (m³) \n Similar to electric meter reading",
                        "Reading Instructions: \n Read dials from RIGHT to LEFT \n Follow clockwise direction",
                        "Reading Rules: \n Between two numbers: record LOWER number \n Exactly on a number: check right dial \n  - Right dial passed 0? Use pointed number \n  - Right dial not passed 0? Use lower number",
                        "Recording: \n Start from rightmost dial \n Record all numbers left \n Express in cubic meters (m³)"
                    )
                )
            )
        )
    }

    // LESSON 3 - SUBTOPIC 3: Compute Water or Electric Meter Consumption
    private fun getQuarter4Lesson3Subtopic3(): InteractiveLesson {
        return InteractiveLesson(
            id = 65,
            title = "Compute Water or Electric Meter Consumption for a Particular Period of Time",
            slides = listOf(
                Slide.IntroSlide(
                    id = 1,
                    title = "Hello!",
                    content = "In this topic you will learn about Compute Water or Electric Meter Consumption for a Particular Period of Time."
                ),

                Slide.ConceptSlide(
                    id = 2,
                    title = "What Does This Mean?",
                    content = "It means finding out how much water or electricity was used during a specific time period (such as one month). This is done by subtracting the previous meter reading from the current meter reading. The result tells you the total amount of water (in cubic meters) or electricity (in kWh) consumed during that period.",
                    keyPoints = listOf(
                        "Calculate usage over a time period",
                        "Usually measured monthly",
                        "Formula: Current Reading − Previous Reading",
                        "Result = Total consumption"
                    )
                ),

                Slide.ConceptSlide(
                    id = 3,
                    title = "Electric Meter Consumption for a Particular Period of Time",
                    content = "Mr. Gabriel is computing his monthly electrical consumption. Based on his electric bill, last month he was able to consume 00124 kWh. When he checked his digital electric meter, the reading was 00197 kWh. How many kilowatt-hours did Mr. Gabriel consume this month?"
                ),

                Slide.ExampleSlide(
                    id = 4,
                    title = "Solution: Electric Meter Consumption",
                    problem = "Find Mr. Gabriel's monthly electrical consumption",
                    steps = listOf(
                        "The electric meter readings show:",
                        "Present Reading: 00197 kWh",
                        "Previous Reading: 00124 kWh",
                        "Formula: Consumption = Present Reading − Previous Reading",
                        "Substitute: Consumption = 00197 kWh − 00124 kWh",
                        "Calculate: Consumption = 73 kWh"
                    ),
                    answer = "Mr. Gabriel consumed 73 kWh this month"
                ),

                Slide.ConceptSlide(
                    id = 5,
                    title = "Water Meter Consumption for a Particular Period of Time",
                    content = "Maria wants to check how much water her family used this month. Last month, the water meter reading was 12,753 m³. This month, the meter reading shows 12,890 m³. How many cubic meters of water did Maria's family use this month?"
                ),

                Slide.ExampleSlide(
                    id = 6,
                    title = "Solution: Water Meter Consumption",
                    problem = "Find Maria's family's monthly water consumption",
                    steps = listOf(
                        "The water meter readings show:",
                        "Present Reading: 12,890 m³",
                        "Previous Reading: 12,753 m³",
                        "Formula: Consumption = Present Reading − Previous Reading",
                        "Substitute: Consumption = 12,890 m³ − 12,753 m³",
                        "Calculate: Consumption = 137 m³"
                    ),
                    answer = "Maria's family used 137 m³ this month"
                ),

                Slide.PracticeSlide(
                    id = 7,
                    question = "Electric meter reading: Mr. Santos wants to know his electricity usage for the month. Last month, his electric meter reading was 2,345 kWh, and this month it shows 2,472 kWh. How many kilowatt-hours did Mr. Santos use this month?",
                    options = listOf(
                        "127 kWh",
                        "125 kWh",
                        "129 kWh",
                        "123 kWh"
                    ),
                    correctAnswer = 0,
                    explanation = "Correct! Consumption = 2,472 − 2,345 = 127 kWh"
                ),

                Slide.PracticeSlide(
                    id = 8,
                    question = "Water meter reading: The Rivera family wants to know their water usage for the month. Last month, their water meter reading was 8,560 m³, and this month it shows 8,605 m³. How many cubic meters of water did the Rivera family use this month?",
                    options = listOf(
                        "45 m³",
                        "43 m³",
                        "47 m³",
                        "49 m³"
                    ),
                    correctAnswer = 0,
                    explanation = "Correct! Consumption = 8,605 − 8,560 = 45 m³"
                ),

                Slide.SummarySlide(
                    id = 9,
                    title = "Summary",
                    keyPoints = listOf(
                        "Purpose: Determine water or electricity used during a specific period",
                        "Formula: Consumption = Present Reading − Previous Reading",
                        "Key Steps: \n Record present (current) reading \n Find previous reading \n Subtract previous from present \n Result = consumption for that period",
                        "Units: \n Electric: kilowatt-hours (kWh) \n Water: cubic meters (m³)",
                        "Always ensure readings are recorded correctly before computing consumption!",
                        "This calculation is important for billing and monitoring usage."
                    )
                )
            )
        )
    }

    // LESSON 4 - SUBTOPIC 1: Constructing Pie Graph
    private fun getQuarter4Lesson4Subtopic1(): InteractiveLesson {
        return InteractiveLesson(
            id = 66,
            title = "Constructing Pie Graph",
            slides = listOf(
                Slide.IntroSlide(
                    id = 1,
                    title = "Welcome!",
                    content = "In this topic you should be able to understand that a circle has 360°, how to use a protractor to measure and draw angles, convert data into angles or percentages, and construct and interpret pie graphs."
                ),

                Slide.ConceptSlide(
                    id = 2,
                    title = "360 Degrees",
                    content = "If you divide a circle into 360 equal parts, each part is known as one degree.",
                    imageResourceId = R.drawable.circle_degrees ,
                    keyPoints = listOf(
                        "A full circle = 360°",
                        "Each degree is 1/360 of a circle",
                        "Degrees are used to measure angles"
                    )
                ),

                Slide.ConceptSlide(
                    id = 3,
                    title = "Using a Protractor",
                    content = "To measure the angle in degrees, we use a tool called a protractor.",
                    imageResourceId = R.drawable.protractor,
                    keyPoints = listOf(
                        "Align the notch at the center of the protractor's base with the initial side of the angle",
                        "Position the base of the protractor along the initial side",
                        "The terminal side intersects with the protractor's edge",
                        "Read the angle's measurement where the terminal side crosses",
                        "Example: If it passes through the 30 mark, the angle is 30°"
                    )
                ),

                Slide.ConceptSlide(
                    id = 4,
                    title = "Now Let's Focus on Pie Graphs",
                    content = "Now that we know how to measure angles, we can shift our focus to constructing pie graphs."
                ),

                Slide.ConceptSlide(
                    id = 5,
                    title = "What is a Graph?",
                    content = "Graphs are useful for comparing amounts and identifying trends. One type of graph is the pie graph, which visually represents data as parts of a whole."
                ),

                Slide.ConceptSlide(
                    id = 6,
                    title = "What is a Pie Graph?",
                    content = "A pie graph is a circular chart where each segment represents a portion of the collected data.",
                    keyPoints = listOf(
                        "The entire pie chart = 100% of the total data",
                        "Each slice = a part of the whole",
                        "Effective for showing percentage distribution",
                        "Good for visualizing the ratio of categories",
                        "Helps compare different parts to the whole"
                    )
                ),

                Slide.ConceptSlide(
                    id = 7,
                    title = "Steps to Draw a Pie Graph",
                    content = "Follow these steps to create a pie graph:",
                    keyPoints = listOf(
                        "Step 1: Calculate the angle for each section",
                        "Step 2: Draw a circle with a compass",
                        "Step 3: Use a protractor to measure and draw each angle",
                        "Step 4: Label each section",
                        "Step 5: Add a title to the graph"
                    )
                ),

                Slide.ConceptSlide(
                    id = 8,
                    title = "Formula for Angle of a Sector",
                    content = "The formula to calculate the angle of a sector in a circle graph:",
                    keyPoints = listOf(
                        "Angle of sector = (Frequency of data / Total frequency) × 360°",
                        "This converts the data into degrees",
                        "Each category gets a proportional angle"
                    )
                ),

                Slide.ExampleSlide(
                    id = 9,
                    title = "Example: School Students by Year Level",
                    problem = "In a school, there are 900 students in Year 1, 600 students in Year 2, and 500 students in Year 3. Draw a pie graph to represent the number of students in these groups.",
                    steps = listOf(
                        "Step 1: Calculate the total number of students",
                        "Total = 900 + 600 + 500 = 2000 students",
                        "",
                        "Step 2: Find the angle for each section",
                        "Year 1: (900/2000) × 360° = 162°",
                        "Year 2: (600/2000) × 360° = 108°",
                        "Year 3: (500/2000) × 360° = 90°",
                        "",
                        "Step 3: Draw and label the pie graph"
                    ),
                    answer = "Year 1: 162°, Year 2: 108°, Year 3: 90°"
                ),

                Slide.ConceptSlide(
                    id = 10,
                    title = "Alternative: Using Percentages",
                    content = "When we express the value of the component as a percentage, we can find the central angle using:",
                    keyPoints = listOf(
                        "Angle of sector = (Percentage Value / 100) × 360°",
                        "Steps:",
                        "• Calculate the percentage for each category",
                        "• Calculate the portion of 360° for each",
                        "• Divide the circle accordingly"
                    )
                ),

                Slide.ExampleSlide(
                    id = 11,
                    title = "Example: Favorite Sports",
                    problem = "Mrs. Cinco surveyed 50 students about their favorite sports. Express results as percentages and create a pie graph.",
                    steps = listOf(
                        "Calculate percentages for each sport:",
                        "Soccer: 20 students = (20/50) × 100 = 40%",
                        "Chess: 15 students = (15/50) × 100 = 30%",
                        "Tennis: 10 students = (10/50) × 100 = 20%",
                        "Arnis: 5 students = (5/50) × 100 = 10%",
                        "",
                        "Calculate angles:",
                        "Soccer: (40/100) × 360° = 144°",
                        "Chess: (30/100) × 360° = 108°",
                        "Tennis: (20/100) × 360° = 72°",
                        "Arnis: (10/100) × 360° = 36°"
                    ),
                    imageResourceId = R.drawable.angle_calculation,
                    answer = "Soccer: 40%, Chess: 30%, Tennis: 20%, Arnis: 10%"
                ),

                Slide.ConceptSlide(
                    id = 12,
                    title = "Reading and Interpreting Pie Graphs",
                    content = "From the sports pie graph, we can answer:",
                    keyPoints = listOf(
                        "What fraction like soccer? → ⅖ or 40%",
                        "What fraction like chess? → ³⁄₁₀ or 30%",
                        "What fraction like tennis? → ⅕ or 20%",
                        "What fraction like arnis? → ¹⁄₁₀ or 10%",
                        "Notice: All fractions add up to 1 (whole)"
                    )
                ),

                Slide.SummarySlide(
                    id = 13,
                    title = "Summary",
                    keyPoints = listOf(
                        "A pie graph shows data divided into parts of a whole",
                        "Each slice is an angle out of 360°",
                        "To create a pie graph:",
                        " Calculate each category's angle or percentage",
                        " Draw a circle",
                        " Measure angles with a protractor",
                        " Label the sections",
                        " Add a title",
                        "Formula: Angle = (Frequency / Total) × 360°",
                        "Or: Angle = (Percentage / 100) × 360°",
                        "Pie graphs help compare parts to the whole easily"
                    )
                )
            )
        )
    }

    // LESSON 5 - SUBTOPIC 1: Solving Problems Using Pie Graph Data
    private fun getQuarter4Lesson5Subtopic1(): InteractiveLesson {
        return InteractiveLesson(
            id = 67,
            title = "Solving Routine and Non-routine Problems Using Data Presented in a Pie Graph",
            slides = listOf(
                Slide.IntroSlide(
                    id = 1,
                    title = "Hi!!",
                    content = "In this topic, you will learn to interpret pie-graph data and solve routine and non-routine problems using percentages and comparisons."
                ),

                Slide.ConceptSlide(
                    id = 2,
                    title = "Example Problem: Field Trip Survey",
                    content = "Mr. Dela Cruz, a school principal, conducted a survey to determine which place students would most like to visit for a field trip.",
                    imageResourceId = R.drawable.suvery_result,
                    keyPoints = listOf(
                        "Options given: \n • Zoo \n • Freedom Park \n • Botanical Garden \n • Baler Church \n • Ocean Park",
                        "Total students surveyed: 400",
                        "Each student cast one vote"
                    )
                ),

                Slide.ConceptSlide(
                    id = 3,
                    title = "Formula for Angle of Sector",
                    content = "To calculate percentages from the pie graph:",
                    imageResourceId = R.drawable.angle_sector,
                    keyPoints = listOf(
                        "Angle of sector = (Frequency of data / Total frequency) × 100",
                        "This converts the data into percentages",
                        "We can use this to answer questions about the survey"
                    )
                ),

                Slide.ConceptSlide(
                    id = 4,
                    title = "Let's Answer Some Questions",
                    imageResourceId = R.drawable.angle_sector,
                    content = "Now let us answer some questions based on the field trip survey data."
                ),

                Slide.ExampleSlide(
                    id = 5,
                    title = "Question 1: Highest Percentage",
                    imageResourceId = R.drawable.angle_sector,
                    problem = "Which field trip destination got the highest percentage of votes?",
                    steps = listOf(
                        "Look at the pie graph",
                        "Find the largest sector",
                        "The Zoo received the highest percentage",
                        "It accounts for 30% of the total pupils"
                    ),
                    answer = "The Zoo received the highest percentage of votes at 30%"
                ),

                Slide.ExampleSlide(
                    id = 6,
                    title = "Question 2: Calculate Percentage",
                    imageResourceId = R.drawable.angle_sector,
                    problem = "What percentage of pupils favor the Zoo?",
                    steps = listOf(
                        "Given: ³⁄₁₀ of 100%",
                        "Calculate: ³⁄₁₀ × 100% = 30%",
                        "Alternative method: 120 students chose Zoo out of 400 total",
                        "120/400 = 30%"
                    ),
                    answer = "30% of the pupils favored the Zoo"
                ),

                Slide.ExampleSlide(
                    id = 7,
                    title = "Question 3: Comparing Preferences",
                    imageResourceId = R.drawable.angle_sector,
                    problem = "How many times more pupils prefer visiting the Botanical Garden than those who prefer visiting the Ocean Park?",
                    steps = listOf(
                        "Botanical Garden preference: ⅕",
                        "Ocean Park preference: ¹⁄₁₀",
                        "Divide to compare: ⅕ ÷ ¹⁄₁₀",
                        "= ⅕ × ¹⁰⁄₁",
                        "= ²⁄₁₀ or ²⁄₁ = 2",
                        "Alternative with numbers:",
                        "80 pupils chose Botanical Garden",
                        "40 pupils chose Ocean Park",
                        "80 ÷ 40 = 2"
                    ),
                    answer = "The Botanical Garden was preferred twice as much as Ocean Park"
                ),

                Slide.ExampleSlide(
                    id = 8,
                    title = "Question 4: Calculate Another Percentage",
                    imageResourceId = R.drawable.angle_sector,
                    problem = "What percentage of the pupils want to go to Baler Church?",
                    steps = listOf(
                        "Given: ⁷⁄₄₀ of 100%",
                        "Calculate: ⁷⁄₄₀ × 100% = 17.5%",
                        "Alternative method: 70 students chose Baler Church out of 400 total",
                        "70/400 = 17.5%"
                    ),
                    answer = "17.5% of pupils like to go to Baler Church"
                ),

                Slide.PracticeSlide(
                    id = 9,
                    question = "Practice Time!! In what game are there the most participants?",
                    imageResourceId = R.drawable.participants_practice,
                    options = listOf("Candyland", "Twister", "Monopoly", "Chess"),
                    correctAnswer = 0,
                    explanation = "Correct! Candyland has the most participants based on the pie graph data."
                ),

                Slide.SummarySlide(
                    id = 10,
                    title = "Summary",
                    keyPoints = listOf(
                        "A pie graph shows how a whole is divided into parts",
                        "It helps us read percentages and proportions",
                        "We can solve questions based on the data: \n Find which category has the highest/lowest \n Calculate percentages using fractions \n Compare categories by dividing their values",
                        "Key formulas: \n Percentage = (Fraction) × 100% \n Comparison = (Value 1) ÷ (Value 2)",
                        "Always check if the total adds up to 100%!"
                    )
                )
            )
        )
    }

    // LESSON 6 - SUBTOPIC 1: Probability
    private fun getQuarter4Lesson6Subtopic1(): InteractiveLesson {
        return InteractiveLesson(
            id = 68,
            title = "Probability",
            slides = listOf(
                Slide.IntroSlide(
                    id = 1,
                    title = "Hello!!",
                    content = "In this topic you will understand how to describe and determine the likelihood of events using probability."
                ),

                Slide.ConceptSlide(
                    id = 2,
                    title = "What is Probability?",
                    content = "Probability is the measure of how likely it is that an event will occur. While the future cannot be predicted with certainty, probability helps us make reasonable assumptions about future events based on their likelihood.",
                    keyPoints = listOf()
                ),

                Slide.ConceptSlide(
                    id = 3,
                    title = "Probability",
                    content = "can be expressed as a fraction, decimal, or percentage, with values ranging from 0 to 1. A probability of 0 indicates an event is impossible, while a probability of 1 signifies an event is certain.",
                    imageResourceId = R.drawable.probability,
                    keyPoints = listOf()
                ),

                Slide.ExampleSlide(
                    id = 4,
                    title = "Example",
                    problem = "The weather forecaster predicts a 75% chance of rain today. Does it mean that there is a great chance that it will rain today?",
                    imageResourceId = R.drawable.weather_forecast,
                    steps = listOf(
                        "To answer this question, we need to understand the concept of probability. Based on the forecast, the probability of rain today is 75% or 0.75 on a scale from 0 to 1. Refer to the number line below for context. 75% = 0.75",
                        "We can say that rain is likely to occur today because, according to the number line, 0.75 or 75% is closer to 1 (100%)"
                    ),
                    answer = ""
                ),

                Slide.ConceptSlide(
                    id = 5,
                    title = "Study the following examples",
                    content = "",
                    keyPoints = listOf()
                ),

                Slide.ConceptSlide(
                    id = 6,
                    title = "Try",
                    content = "Use the terms impossible, most unlikely, unlikely, likely, most likely, and certain to describe the probability or likelihood of each of the following statements.",
                    keyPoints = listOf()
                ),

                Slide.ExampleSlide(
                    id = 7,
                    title = "Here's a new set of questions using the same context",
                    problem = "",
                    steps = listOf(
                        "1. It will snow tomorrow.\nSince the Philippines is a tropical country, it is impossible for snow to occur under normal weather conditions",
                        "2. The chance of drawing the ace of spades from a deck of 52 cards is 2%.\nSince 2% is very close to 0%, it is most unlikely to draw the ace of spades",
                        "3. There is a 50% chance of flipping heads in a coin toss.\nA 50% probability means the chance of flipping heads is as likely as it is unlikely",
                        "4. A survey shows there is an 80% chance of rain this afternoon.\nWith an 80% probability, it is most likely that it will rain this afternoon",
                        "5. The earth will rotate on its axis tomorrow.\nSince this happens every day, it is certain to occur"
                    ),
                    answer = ""
                ),

                Slide.ExampleSlide(
                    id = 8,
                    title = "Here's another new set of questions using the same context",
                    problem = "",
                    steps = listOf(
                        "1. A student will get a perfect score on a surprise math quiz.\nSince most students find surprise quizzes challenging, it is very unlikely",
                        "2. A bird will sing in the morning.\nSince birds usually sing in the morning, it is likely",
                        "3. It will be sunny tomorrow.\nSince the weather can change, it is possible but not certain"
                    ),
                    answer = ""
                ),

                Slide.PracticeSlide(
                    id = 9,
                    question = "Practice Time!!\n\nA weather report says there is a 30% chance of rain this afternoon.\n\nChoose your answer:",
                    options = listOf("Impossible", "Most unlikely", "Unlikely", "Likely", "Most likely", "Certain"),
                    correctAnswer = 2,
                    explanation = "Correct! Since 30% is closer to 0 than to 1, it is unlikely that it will rain this afternoon"
                ),

                Slide.PracticeSlide(
                    id = 10,
                    question = "Practice Time!!\n\nA student has a 90% chance of passing the quiz based on her past scores and preparation.\n\nChoose your answer:",
                    options = listOf("Impossible", "Most unlikely", "Unlikely", "Likely", "Most likely", "Certain"),
                    correctAnswer = 4,
                    explanation = "Correct! Because 90% is very close to 1, it is most likely that the student will pass the quiz"
                ),

                Slide.SummarySlide(
                    id = 11,
                    title = "Summary",
                    keyPoints = listOf(
                        "Probability measures how likely an event is to happen, ranging from 0 (impossible) to 1 (certain), and helps us make predictions about real-life situations"
                    )
                )
            )
        )
    }

    // LESSON 7 - SUBTOPIC 1: Using Listing Outcomes, Tree Diagrams, and Table or Grid of Outcomes
    private fun getQuarter4Lesson7Subtopic1(): InteractiveLesson {
        return InteractiveLesson(
            id = 69,
            title = "Using Listing Outcomes, Tree Diagrams, and Table or Grid of Outcomes",
            slides = listOf(
                Slide.IntroSlide(
                    id = 1,
                    title = "What's up!!",
                    content = "You will be able to identify and create sample spaces using lists, tree diagrams, and tables to determine possible outcomes in probability problems."
                ),

                Slide.ConceptSlide(
                    id = 2,
                    title = "In dealing with probability",
                    content = "Every experiment has a set of possible outcomes called a sample space.",
                    keyPoints = listOf()
                ),

                Slide.ConceptSlide(
                    id = 3,
                    title = "What is a Sample Space?",
                    content = "A sample space is a list of all the possible outcomes in an experiment or activity.\n\nWe can identify sample spaces in different ways, such as using lists, tree diagrams, or tables and grids.",
                    keyPoints = listOf()
                ),

                Slide.ConceptSlide(
                    id = 4,
                    title = "Listing Outcomes",
                    content = "Listing Outcomes is a method of writing down all possible results in a sample space. It involves simply listing each possible outcome. By listing or counting all the possible outcomes, we can calculate the probability of any specific event happening.",
                    keyPoints = listOf()
                ),

                Slide.ExampleSlide(
                    id = 5,
                    title = "Example 1 of Listing Outcomes",
                    problem = "Sarah has five types of candies: chocolate, caramel, gummy bears, and lollipops. She wants to eat two types of candy. What are the possible pairs of candies she can choose?",
                    steps = listOf(
                        "Possible Combinations:",
                        "Chocolate, Caramel",
                        "Chocolate, Gummy bears",
                        "Chocolate, Lollipops",
                        "Caramel, Gummy bears",
                        "Caramel, Lollipops",
                        "Gummy bears, Lollipops",
                        "The list shows that there are 6 possible combinations of candy"
                    ),
                    answer = ""
                ),

                Slide.ExampleSlide(
                    id = 6,
                    title = "Example 2 of Listing Outcomes",
                    problem = "Tom has four kinds of fruits: apple, banana, orange, and grapes. He wants to pick two fruits to eat.",
                    steps = listOf(
                        "Possible Combinations:",
                        "Apple, Banana",
                        "Apple, Orange",
                        "Apple, Grapes",
                        "Banana, Orange",
                        "Banana, Grapes",
                        "Orange, Grapes",
                        "There are 6 possible combinations of fruits Tom can choose"
                    ),
                    answer = ""
                ),

                Slide.ConceptSlide(
                    id = 7,
                    title = "What is a Tree Diagram?",
                    content = "A Tree Diagram is a tool or drawing made with \"lines\" that shows the different possible \"paths\" for the outcomes, helping to visualize all the possibilities.",
                    keyPoints = listOf()
                ),

                Slide.ExampleSlide(
                    id = 8,
                    title = "Example of Tree Diagram",
                    problem = "How many snack combinations can you make with one food choice and one fruit choice?",
                    imageResourceId = R.drawable.tree_diagram,
                    steps = listOf(
                        "Solution:",
                        "Based on the tree diagram, there are 9 possible outcomes"
                    ),
                    answer = ""
                ),

                Slide.ConceptSlide(
                    id = 9,
                    title = "What is a Table or Grid of Outcomes?",
                    content = "A Table or Grid of Outcomes is a chart where the first row and the first column list the items that need to be combined.",
                    keyPoints = listOf()
                ),

                Slide.ExampleSlide(
                    id = 10,
                    title = "Example of a Table or Grid of Outcomes",
                    problem = "A teacher is selecting a student and a volunteer to represent the class. The boy is chosen from Alex, Brian, and Charlie. The girl is chosen from Emma, Grace, Hannah, and Isla.",
                    imageResourceId = R.drawable.table_grid_outcomes,
                    steps = listOf(
                        "Solution:",
                        "Based on the table or grid above, there are 12 possible outcomes"
                    ),
                    answer = ""
                ),

                Slide.PracticeSlide(
                    id = 11,
                    question = "Practice Time!!\n\nMark has four types of drinks: juice, soda, milk, and iced tea. He wants to choose two different drinks to serve at a party. How many possible pairs of drinks can Mark choose?\n\nChoose your answer:",
                    options = listOf("6", "7", "8", "9"),
                    correctAnswer = 0,
                    explanation = "Correct! There are 6 possible combinations of drinks"
                ),

                Slide.PracticeSlide(
                    id = 12,
                    question = "Practice Time!!\n\nJeniffer has five school supplies: pen, pencil, eraser, ruler, and marker. She wants to pick two different items to put in her small pouch. How many possible pairs of items can Jeniffer choose?\n\nChoose your answer:",
                    options = listOf("7", "8", "9", "10"),
                    correctAnswer = 3,
                    explanation = "Correct! There are 10 possible combinations of school supplies"
                ),

                Slide.SummarySlide(
                    id = 13,
                    title = "Summary",
                    keyPoints = listOf(
                        "In this lesson, you learned how to find all the possible outcomes of an experiment using three methods:",
                        "1. Listing Outcomes – writing all possible results in a list",
                        "2. Tree Diagram – using branches to show different choices and paths",
                        "3. Table or Grid of Outcomes – using rows and columns to combine choices clearly",
                        "These tools help us identify the sample space, which is the set of all possible outcomes. Knowing the sample space makes it easier to solve probability problems"
                    )
                )
            )
        )
    }

    // LESSON 8 - SUBTOPIC 1: Simple Predictions of Events with Problem Solving
    private fun getQuarter4Lesson8Subtopic1(): InteractiveLesson {
        return InteractiveLesson(
            id = 70,
            title = "Simple Predictions of Events with Problem Solving",
            slides = listOf(
                Slide.IntroSlide(
                    id = 1,
                    title = "Welcome!!",
                    content = "By the end of this topic, you will be able to understand what probability is, tell the difference between theoretical and experimental probability, calculate them, and use probability to make simple predictions."
                ),

                Slide.ConceptSlide(
                    id = 2,
                    title = "COVID-19 Vaccination Program",
                    content = "When the pandemic began, our country quickly started implementing the COVID-19 vaccination program. Do you know how effective the COVID vaccines are?",
                    keyPoints = listOf(
                        "Vaccination programs protect communities",
                        "Different vaccines have different effectiveness rates",
                        "Understanding effectiveness helps us make informed decisions"
                    )
                ),

                Slide.ConceptSlide(
                    id = 3,
                    title = "World Health Organization (WHO)",
                    content = "According to the World Health Organization (WHO), the Pfizer-BioNTech vaccine has an efficacy of 95% against symptomatic SARS-CoV-2 infection.",
                    keyPoints = listOf(
                        "Pfizer-BioNTech vaccine efficacy: 95%",
                        "Highly effective against symptomatic infection",
                        "Based on clinical trial data",
                        "What does 95% effectiveness mean?",
                        "Let's explore using probability..."
                    )
                ),

                Slide.ConceptSlide(
                    id = 4,
                    title = "Understanding Vaccine Effectiveness",
                    content = "Does this mean that getting vaccinated will completely protect you? To answer this question, we need to understand the concept of probability.",
                    imageResourceId = R.drawable.probability_number_line_vaccine,
                    keyPoints = listOf(
                        "Effectiveness of Pfizer-BioNTech: 95%",
                        "On a number line from 0 to 1:",
                        "0 -------- 0.95 -------- 1 \nImpossible    ↑      Certain",
                        "95% is closer to 1 (100%)",
                        "Conclusion: If vaccinated with Pfizer-BioNTech, you are HIGHLY PROTECTED from severe COVID-19 The effectiveness is very close to certain!"
                    )
                ),

                Slide.ConceptSlide(
                    id = 5,
                    title = "What is Probability Again?",
                    content = "Probability is the likelihood that an event will occur. It is used to describe how likely or unlikely something is to happen.",
                    keyPoints = listOf(
                        "Key points: \n Expressed as fraction, decimal, or percentage \n Range: 0 to 1 \n - 0 = impossible \n - 1 = certain \n Closer to 0 = unlikely to occur \n Example: winning lottery (1 in a million) \n Closer to 1 = most likely to happen",
                        "Helps us make predictions about events!"
                    )
                ),

                Slide.ConceptSlide(
                    id = 6,
                    title = "Theoretical Probability",
                    content = "When we use a formula to calculate the probability of an event, we are determining the theoretical probability.",
                    keyPoints = listOf(
                        "Uses mathematical formulas",
                        "Based on all possible outcomes",
                        "Calculated BEFORE doing experiment",
                        "Assumes all outcomes equally likely"
                    )
                ),

                Slide.ConceptSlide(
                    id = 7,
                    title = "What is Theoretical Probability",
                    content = "The theoretical probability of an event is the ratio of the number of ways the event can occur to the total number of possible outcomes.",
                    keyPoints = listOf(
                        "Formula:",
                        "Theoretical Probability = \n number of favorable outcomes \n ÷ \n number of possible outcomes",
                        "Example: \n Rolling a die: 6 possible outcomes \n Getting a 3: 1 favorable outcome",
                        "Probability = ⅙"
                    )
                ),

                Slide.ExampleSlide(
                    id = 8,
                    title = "Example of Theoretical Probability",
                    problem = "What is the probability of rolling a die and getting a face with 1 dot, 3 dots, or 5 dots?",
                    imageResourceId = R.drawable.die_probability,
                    steps = listOf(
                        "Total possible outcomes = 6 faces (1, 2, 3, 4, 5, 6)",
                        "Theoretical Probability = favorable outcomes ÷ possible outcomes",
                        "Getting 1 dot: \n Favorable outcomes = 1 \n Probability = ⅙",
                        "Getting 3 dots: \n Favorable outcomes = 1 \n Probability = ⅙",
                        "Getting 5 dots: \n Favorable outcomes = 1 \n Probability = ⅙"
                    ),
                    answer = "Each outcome has a probability of ⅙"
                ),

                Slide.ConceptSlide(
                    id = 9,
                    title = "Experimental Probability",
                    content = "We can also determine the probability of an event by conducting an experiment.",
                    keyPoints = listOf(
                        "Based on ACTUAL experiments",
                        "Count what actually happens",
                        "Results from trials or repetitions",
                        "May differ from theoretical probability"
                    )
                ),

                Slide.ConceptSlide(
                    id = 10,
                    title = "What is Experimental Probability",
                    content = "The experimental probability of an event is the ratio of the number of times the event occurs to the total number of trials or repetitions of the activity.",
                    keyPoints = listOf(
                        "Formula: Experimental Probability = ",
                        "number of times favorable outcome occurs \n ÷ \n number of trials in the experiment",
                        "Example: \n Flip coin 100 times \n Heads appears 47 times \n Probability = 47/100 = 0.47"
                    )
                ),

                Slide.ExampleSlide(
                    id = 11,
                    title = "Example of Experimental Probability",
                    problem = "Arkin tossed a coin 50 times, and it landed on tails 38 times. To find the probability of landing on heads:",
                    steps = listOf(
                        "Given: \n Total tosses = 50 \n Tails = 38 times \n Heads = 50 − 38 = 12 times",
                        "Formula: Experimental Probability = favorable outcomes ÷ trials",
                        "Calculate: Probability of heads = 12/50",
                        "Simplify: 12/50 = 6/25",
                        "Experimental Probability = 6/25"
                    ),
                    answer = "The experimental probability of landing on heads is 12/50 or 6/25"
                ),

                Slide.ExampleSlide(
                    id = 12,
                    title = "Another example of Experimental Probability",
                    problem = "Rima rolled a die 30 times. The number 4 came up 8 times. To find the probability of rolling a 4:",
                    steps = listOf(
                        "Total rolls = 30, number of times 4 appeared = 8",
                        "Experimental Probability = number of times favorable outcomes occur / number of trials in the experiment",
                        "Experimental Probability = 8/30 or 4/15"
                    ),
                    answer = "8/30 or 4/15"
                ),

                Slide.PracticeSlide(
                    id = 12,
                    question = "Practice Time!! What is the probability of spinning a spinner divided into 4 equal sections labeled A, B, C, and D, and landing on A?",
                    options = listOf("¼", "⅓", "1", "4"),
                    correctAnswer = 0,
                    explanation = "Correct! There is 1 favorable outcome (landing on A) out of 4 possible outcomes. Theoretical Probability = ¼"
                ),

                Slide.PracticeSlide(
                    id = 13,
                    question = "Practice Time!! Mia rolled a die 60 times. The number 4 appeared 15 times. What is the experimental probability of rolling a 4?",
                    options = listOf("¼", "4", "⅓", "3"),
                    correctAnswer = 0,
                    explanation = "Correct! Experimental Probability = 15/60 = ¼. The number 4 appeared 15 times out of 60 trials."
                ),

                Slide.SummarySlide(
                    id = 14,
                    title = "Summary",
                    keyPoints = listOf(
                        "Probability helps us predict how likely an event is to happen",
                        "Two types of probability:",
                        "1. Theoretical Probability: \n Calculated using a formula \n Based on all possible outcomes \n Formula: favorable outcomes ÷ possible outcomes",
                        "2. Experimental Probability: \n Based on actual experiment results \n Based on trials and observations \n Formula: times event occurs ÷ number of trials",
                        "Probability ranges from 0 to 1: \n 0 = impossible \n 1 = certain",
                        "Understanding probability helps make predictions about real-life events!"
                    )
                )
            )
        )
    }

    // LESSON 9 - SUBTOPIC 1: Four-step Plan used in solving Experimental and Theoretical Probability
    private fun getQuarter4Lesson9Subtopic1(): InteractiveLesson {
        return InteractiveLesson(
            id = 71,
            title = "Four-step Plan used in solving Experimental and Theoretical Probability",
            slides = listOf(
                Slide.IntroSlide(
                    id = 1,
                    title = "Hi!!",
                    content = "You will be able to solve experimental and theoretical probability problems using the four-step plan."
                ),

                Slide.ConceptSlide(
                    id = 2,
                    title = "Review: The Four-Step Plan",
                    content = "The four-step plan can be used in solving the problems:",
                    keyPoints = listOf(
                        "Step 1. Understand \nWhat is asked? \nWhat are the given facts?",
                        "Step 2. Plan \nWhat operation to use? \nWhat formula and equation?",
                        "Step 3. Solve \nShow the computation",
                        "Step 4. Check \nVerify your answer"
                    )
                ),

                Slide.ConceptSlide(
                    id = 3,
                    title = "Formula of Theoretical Probability",
                    content = "Theoretical Probability (event) = number of favorable outcomes ÷ number of possible outcomes",
                    keyPoints = listOf(
                        "Formula:",
                        "Theoretical Probability =  \n number of favorable outcomes \n ──────────────────────── \n number of possible outcomes",
                        "Used when calculating probability",
                        "before doing an experiment"
                    )
                ),

                Slide.ConceptSlide(
                    id = 4,
                    title = "Formula of Experimental Probability",
                    content = "Experimental Probability (event) = number of favorable outcomes ÷ number of trials in the experiment",
                    keyPoints = listOf(
                        "Formula:",
                        "Experimental Probability =  \n number of times favorable outcome occurs \n ───────────────────────────────── \n number of trials in the experiment",
                        "Used when calculating probability",
                        "based on actual experiment results"
                    )
                ),

                Slide.ExampleSlide(
                    id = 5,
                    title = "Let's Solve: Theoretical Probability",
                    problem = "A bag contains 10 red marbles, 6 blue marbles, and 8 yellow marbles. Find the theoretical probability of getting a blue marble.",
                    steps = listOf(
                        "Step 1. Understand \n What is asked? The theoretical probability of getting a blue marble",
                        "What are the given facts? \n 10 red marbles \n 6 blue marbles \n 8 yellow marbles \n Total: 10 + 6 + 8 = 24 marbles",
                        "Step 2. Plan \n Operations: Addition and Division",
                        "Formula: TP (event) = favorable outcomes ÷ possible outcomes",
                        "Equation: TP (blue) = 6/24"
                    ),
                    answer = "Set up the problem using the formula"
                ),

                Slide.ExampleSlide(
                    id = 6,
                    title = "Solving: Theoretical Probability",
                    problem = "Continue solving the problem:",
                    steps = listOf(
                        "Step 3. Solve",
                        "Show the computation: \n TP (Blue Marble) = favorable outcomes ÷ possible outcomes \n TP (Blue Marble) = 6/24",
                        "Simplify the fraction: \n Divide both numerator and denominator by 6: \n 6 ÷ 6 = 1 \n 24 ÷ 6 = 4",
                        "TP (blue marble) = ¼ or 0.25 or 25%",
                        "Therefore: The theoretical probability of getting a blue marble",
                        "is ¼ or 0.25 or 25%"
                    ),
                    answer = "The theoretical probability is ¼ or 25%"
                ),

                Slide.ConceptSlide(
                    id = 7,
                    title = "Check Your Answer",
                    content = "Step 4. Check - This is one way to check if the answer is correct.",
                    keyPoints = listOf(
                        "Go back to your computation",
                        "Verify: \n Are all given values properly substituted? \n Is the formula correct? \n Is the computation flow logical? \n Does the answer make sense?",
                        "Check: 6/24 = ¼",
                        "¼ = 0.25 = 25%"
                    )
                ),

                Slide.ExampleSlide(
                    id = 8,
                    title = "Let's Solve: Experimental Probability",
                    problem = "A basketball player attempts 50 free throws. He successfully makes the shot 35 times. What is the experimental probability of his making a free throw?",
                    steps = listOf(
                        "Step 1. Understand",
                        "What is asked? \n The experimental probability of making a free throw",
                        "What are the given facts?\n 50 attempts at free throws\n 35 successful shots",
                        "Step 2. Plan",
                        "Operations: Subtraction and Division",
                        "Let N = number of times missing a free throw",
                        "Formula: EP (event) = favorable outcomes ÷ trials",
                        "Equation: EP = N/50"
                    ),
                    answer = "Set up the problem"
                ),

                Slide.ExampleSlide(
                    id = 9,
                    title = "Solving: Experimental Probability",
                    problem = "Continue solving the problem:",
                    steps = listOf(
                        "Step 3. Solve",
                        "Show the computation: \n First, find the number of misses (N): \n 50 attempts − 35 successful = 15 misses \n Therefore, 15 times he missed the free throw",
                        "Now find experimental probability of missing: \n EP (miss) = 15/50 \n Simplify by dividing by 5: \n 15 ÷ 5 = 3 \n 50 ÷ 5 = 10 \n EP (miss) = 3/10 or 0.30 or 30%",
                        "Therefore: The experimental probability of missing a free throw",
                        "is 3/10 or 30%"
                    ),
                    answer = "The experimental probability is 3/10 or 30%"
                ),

                Slide.ConceptSlide(
                    id = 10,
                    title = "Check Your Answer",
                    content = "Step 4. Check - This is one way to check if the answer is correct.",
                    keyPoints = listOf(
                        "Go back to your computation",
                        "Verify: \n Are all given values properly substituted? \n Is the formula correct? \n Is the computation flow logical? \n Does the answer make sense?",
                        "Check: 50 − 35 = 15",
                        "15/50 = 3/10",
                        "3/10 = 0.30 = 30%"
                    )
                ),

                Slide.PracticeSlide(
                    id = 11,
                    question = "Practice Time!! A standard die has 6 faces numbered 1 to 6. What is the theoretical probability of rolling a 4?",
                    options = listOf(
                        "⅙ = 0.167 or 16.7%",
                        "⅕ = 0.2 or 20%",
                        "¼ = 0.25 or 25%",
                        "⅓ = 0.333 or 33.3%"
                    ),
                    correctAnswer = 0,
                    explanation = "Correct! There is 1 favorable outcome (rolling a 4) out of 6 possible outcomes. Theoretical Probability = ⅙ = 0.167 or 16.7%"
                ),

                Slide.PracticeSlide(
                    id = 12,
                    question = "Practice Time!! Sofia flips a coin 20 times and it lands on heads 12 times. What is the experimental probability of getting heads?",
                    options = listOf(
                        "0.5 or 50%",
                        "0.6 or 60%",
                        "0.4 or 40%",
                        "0.7 or 70%"
                    ),
                    correctAnswer = 1,
                    explanation = "Correct! Experimental Probability = 12/20 = 0.6 or 60%. Heads appeared 12 times out of 20 trials."
                ),

                Slide.SummarySlide(
                    id = 13,
                    title = "Summary",
                    keyPoints = listOf(
                        "The Four-Step Plan helps solve probability problems: \n Step 1. Understand - identify what's asked and given \n Step 2. Plan - choose operations and formulas \n Step 3. Solve - show your computation \n Step 4. Check - verify your answer",
                        "Two types of probability:",
                        "Theoretical Probability: \n Formula: favorable outcomes ÷ possible outcomes \n Used before experiments",
                        "Experimental Probability: \n Formula: successful outcomes ÷ total trials \n Based on actual results",
                        "Always simplify fractions and express as decimal or percentage!"
                    )
                )
            )
        )
    }
}