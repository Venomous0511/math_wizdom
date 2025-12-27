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
                        "Step 2: Change their equivalent fractions.\n 6 ÷ 3 = 2 → multiply both 1 and 3 by 2 → ⅓ = 2/6\n 6 ÷ 6 = 1 → multiply both 1 and 6 by 1 → ⅙ = 1/6",
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
                        "Why? \n How many 21 does 34 have? 1",
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
                    title = "Example: Routine Problem",
                    problem = "Devin walks ⅔ of a km to a friend's house, ¼ km to a park, and ½ km home. What is the total distance that Devin covers?",
                    steps = listOf(
                        "Step 1: Understand \n Given: ⅔ km + ¼ km + ½ km \n Asked: Total distance?",
                        "Step 2: Plan \n Operation: Addition \n Number sentence: ⅔ + ¼ + ½ = N",
                        "Step 3: Solve \n Find LCD of 3, 4, and 2 = 12 \n ⅔ = ⁸⁄₁₂, ¼ = ³⁄₁₂, ½ = ⁶⁄₁₂ \n ⁸⁄₁₂ + ³⁄₁₂ + ⁶⁄₁₂ = ¹⁷⁄₁₂ = 1 ⁵⁄₁₂",
                        "Step 4: Check \n ⁸⁄₁₂ + ³⁄₁₂ = ¹¹⁄₁₂ \n ¹⁷⁄₁₂ − ¹¹⁄₁₂ = ⁶⁄₁₂ or ½ ✓"
                    ),
                    answer = "Devin covers a total distance of 1 ⁵⁄₁₂ km"
                ),

                Slide.PracticeSlide(
                    id = 5,
                    question = "Maria ate ⅜ of a pizza for lunch and ¼ of the same pizza for dinner. How much pizza did she eat in total?",
                    options = listOf("⅝", "⅞", "½", "¾"),
                    correctAnswer = 0,
                    explanation = "Correct! LCD is 8. ⅜ + ²⁄₈ = ⅝ of the pizza"
                ),

                Slide.ConceptSlide(
                    id = 6,
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
                    id = 7,
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
                    id = 8,
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
                    id = 9,
                    question = "A rope is 1 ½ meters long. If ¾ meter is cut off, how much rope is left?",
                    options = listOf("¾ m", "⅞ m", "1 ¼ m", "½ m"),
                    correctAnswer = 0,
                    explanation = "Correct! 1 ½ = 1 ²⁄₄. Then 1 ²⁄₄ − ¾: Borrow 1, making it ⁶⁄₄ − ³⁄₄ = ¾ meter"
                ),

                Slide.SummarySlide(
                    id = 10,
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
                    title = "Example: Multiplying Fractions",
                    problem = "⅔ × ⅘ = ?",
                    steps = listOf(
                        "Step 1: Multiply the numerators: 2 × 4 = 8",
                        "Step 2: Multiply the denominators: 3 × 5 = 15",
                        "Step 3: Write as a fraction: ⁸⁄₁₅",
                        "Step 4: Check if it can be simplified (8 and 15 have no common factors)"
                    ),
                    answer = "⁸⁄₁₅"
                ),

                Slide.PracticeSlide(
                    id = 4,
                    question = "What is ½ × ¼ = ?",
                    options = listOf("²⁄₆", "⅛", "⅙", "½"),
                    correctAnswer = 1,
                    explanation = "Correct! Multiply numerators: 1 × 1 = 1. Multiply denominators: 2 × 4 = 8. Answer: ⅛"
                ),

                Slide.ConceptSlide(
                    id = 5,
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
                    id = 6,
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
                    id = 7,
                    question = "What is ⅖ × ⅚ = ? (Give the simplified answer)",
                    options = listOf("¹⁰⁄₃₀", "⅓", "²⁄₆", "⁵⁄₁₅"),
                    correctAnswer = 1,
                    explanation = "Correct! 2 × 5 = 10 and 5 × 6 = 30, giving us ¹⁰⁄₃₀. Simplified by dividing both by 10 = ⅓"
                ),

                Slide.SummarySlide(
                    id = 8,
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
                    title = "Example: Cancellation Method",
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
                    id = 6,
                    question = "Use cancellation: ¾ × ⁴⁄₉ = ?",
                    options = listOf("¹²⁄₃₆", "⅓", "³⁄₉", "⁴⁄₁₂"),
                    correctAnswer = 1,
                    explanation = "Correct! Cancel the 4s and simplify ³⁄₉ to ⅓. Or cancel 3 from 3 and 9 (giving ⅓), and cancel 4s (giving ¹⁄₁), then multiply: ⅓"
                ),

                Slide.SummarySlide(
                    id = 7,
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
                    title = "Fraction × Whole Number",
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
                    title = "Fraction × Mixed Number",
                    problem = "⅔ × 1 ½ = ?",
                    steps = listOf(
                        "Step 1: Convert 1 ½ to improper fraction: \n (1 × 2) + 1 = 3, so 1 ½ = ³⁄₂",
                        "Step 2: Multiply: (2 × 3)/(3 × 2) = ⁶⁄₆",
                        "Step 3: Simplify: ⁶⁄₆ = 1"
                    ),
                    answer = "1"
                ),

                Slide.ExampleSlide(
                    id = 6,
                    title = "Whole Number × Mixed Number",
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
                    id = 7,
                    title = "Mixed Number × Mixed Number",
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

                Slide.PracticeSlide(
                    id = 8,
                    question = "What is 9 × ½ = ?",
                    options = listOf("⁹⁄₂", "4 ½", "9 ½", "½"),
                    correctAnswer = 1,
                    explanation = "Correct! ⁹⁄₁ × ½ = ⁹⁄₂ = 4 ½"
                ),

                Slide.PracticeSlide(
                    id = 9,
                    question = "What is 2 ¼ × 1 ⅓ = ?",
                    options = listOf("2 ¹⁄₁₂", "3", "2 ⅔", "3 ⅓"),
                    correctAnswer = 1,
                    explanation = "Correct! 2 ¼ = ⁹⁄₄ and 1 ⅓ = ⁴⁄₃. Then (9×4)/(4×3) = ³⁶⁄₁₂ = 3"
                ),

                Slide.SummarySlide(
                    id = 10,
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
                    title = "Welcome!",
                    content = "In this topic, you'll learn how to translate word problems into mathematical phrases and expressions using fractions."
                ),

                Slide.ConceptSlide(
                    id = 2,
                    title = "What are Mathematical Phrases?",
                    content = "Mathematical phrases are expressions that describe mathematical operations using words. They help us translate real-world problems into math we can solve.",
                    keyPoints = listOf(
                        "Words can represent operations (+, −, ×, ÷)",
                        "Help translate word problems into math",
                        "Make solving problems easier",
                        "Example: 'sum of' means addition"
                    )
                ),

                Slide.ConceptSlide(
                    id = 3,
                    title = "Key Words for Addition",
                    content = "These words tell you to ADD fractions:",
                    keyPoints = listOf(
                        "Sum of",
                        "Total",
                        "Combined",
                        "Plus",
                        "More than",
                        "Increased by"
                    )
                ),

                Slide.ExampleSlide(
                    id = 4,
                    title = "Example: Addition Phrase",
                    problem = "Write a mathematical expression for: 'The sum of ⅓ and ¼'",
                    steps = listOf(
                        "Step 1: Identify the key word \n 'Sum of' means addition (+)",
                        "Step 2: Identify the fractions \n First fraction: ⅓ \n Second fraction: ¼",
                        "Step 3: Write the expression \n ⅓ + ¼"
                    ),
                    answer = "⅓ + ¼"
                ),

                Slide.ConceptSlide(
                    id = 5,
                    title = "Key Words for Subtraction",
                    content = "These words tell you to SUBTRACT fractions:",
                    keyPoints = listOf(
                        "Difference between",
                        "Minus",
                        "Less than",
                        "Decreased by",
                        "Take away",
                        "Remaining"
                    )
                ),

                Slide.ExampleSlide(
                    id = 6,
                    title = "Example: Subtraction Phrase",
                    problem = "Write a mathematical expression for: 'The difference between ¾ and ⅖'",
                    steps = listOf(
                        "Step 1: Identify the key word \n 'Difference between' means subtraction (−)",
                        "Step 2: Identify the fractions \n First fraction: ¾ \n Second fraction: ⅖",
                        "Step 3: Write the expression \n ¾ − ⅖"
                    ),
                    answer = "¾ − ⅖"
                ),

                Slide.PracticeSlide(
                    id = 7,
                    question = "What is the mathematical expression for: 'The total of ⅝ and ⅜'?",
                    options = listOf("⅝ − ⅜", "⅝ + ⅜", "⅝ × ⅜", "⅝ ÷ ⅜"),
                    correctAnswer = 1,
                    explanation = "Correct! 'Total' means addition, so the expression is ⅝ + ⅜"
                ),

                Slide.ConceptSlide(
                    id = 8,
                    title = "Key Words for Multiplication",
                    content = "These words tell you to MULTIPLY fractions:",
                    keyPoints = listOf(
                        "Product of",
                        "Times",
                        "Multiplied by",
                        "Of (when used with fractions)",
                        "Twice/Double",
                        "Triple"
                    )
                ),

                Slide.ExampleSlide(
                    id = 9,
                    title = "Example: Multiplication Phrase",
                    problem = "Write a mathematical expression for: '⅔ of ½'",
                    steps = listOf(
                        "Step 1: Identify the key word \n 'Of' means multiplication (×)",
                        "Step 2: Identify the fractions \n First fraction: ⅔ \n Second fraction: ½",
                        "Step 3: Write the expression \n ⅔ × ½"
                    ),
                    answer = "⅔ × ½"
                ),

                Slide.ConceptSlide(
                    id = 10,
                    title = "Key Words for Division",
                    content = "These words tell you to DIVIDE fractions:",
                    keyPoints = listOf(
                        "Quotient of",
                        "Divided by",
                        "Split into",
                        "Shared equally",
                        "Per",
                        "Ratio of"
                    )
                ),

                Slide.ExampleSlide(
                    id = 11,
                    title = "Example: Division Phrase",
                    problem = "Write a mathematical expression for: '⅘ divided by ⅕'",
                    steps = listOf(
                        "Step 1: Identify the key word \n 'Divided by' means division (÷)",
                        "Step 2: Identify the fractions \n First fraction: ⅘ \n Second fraction: ⅕",
                        "Step 3: Write the expression \n ⅘ ÷ ⅕"
                    ),
                    answer = "⅘ ÷ ⅕"
                ),

                Slide.PracticeSlide(
                    id = 12,
                    question = "What is the mathematical expression for: 'The product of ¾ and ⅔'?",
                    options = listOf("¾ + ⅔", "¾ − ⅔", "¾ × ⅔", "¾ ÷ ⅔"),
                    correctAnswer = 2,
                    explanation = "Correct! 'Product' means multiplication, so the expression is ¾ × ⅔"
                ),

                Slide.ExampleSlide(
                    id = 13,
                    title = "Complex Mathematical Phrase",
                    problem = "Write an expression for: 'The sum of ½ and the product of ⅓ and ¼'",
                    steps = listOf(
                        "Step 1: Break down the phrase \n 'Sum of' → addition \n 'Product of' → multiplication",
                        "Step 2: Identify what to do first \n Product of ⅓ and ¼ = ⅓ × ¼",
                        "Step 3: Add ½ to the product \n ½ + (⅓ × ¼)",
                        "Note: Use parentheses to show order!"
                    ),
                    answer = "½ + (⅓ × ¼)"
                ),

                Slide.PracticeSlide(
                    id = 14,
                    question = "Maria ate ⅜ less than ⅝ of a pizza. Which expression shows this?",
                    options = listOf("⅜ − ⅝", "⅝ − ⅜", "⅜ + ⅝", "⅝ + ⅜"),
                    correctAnswer = 1,
                    explanation = "Correct! '⅜ less than ⅝' means we start with ⅝ and subtract ⅜, giving us ⅝ − ⅜"
                ),

                Slide.SummarySlide(
                    id = 15,
                    title = "Summary",
                    keyPoints = listOf(
                        "Addition: sum, total, combined, more than",
                        "Subtraction: difference, less than, decreased by",
                        "Multiplication: product, times, of",
                        "Division: quotient, divided by, shared equally",
                        "Look for key words to identify operations",
                        "Use parentheses for complex expressions"
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
                    title = "Hello!",
                    content = "In this topic, you'll learn a step-by-step approach to solving word problems involving fractions. This method will help you tackle any problem with confidence!"
                ),

                Slide.ConceptSlide(
                    id = 2,
                    title = "The 4-Step Problem Solving Method",
                    content = "Following these steps will help you solve any word problem systematically:",
                    keyPoints = listOf(
                        "Step 1: UNDERSTAND the problem",
                        "Step 2: PLAN your solution",
                        "Step 3: SOLVE the problem",
                        "Step 4: CHECK your answer"
                    )
                ),

                Slide.ConceptSlide(
                    id = 3,
                    title = "Step 1: UNDERSTAND",
                    content = "Before solving, make sure you understand what the problem is asking:",
                    keyPoints = listOf(
                        "Read the problem carefully (twice if needed!)",
                        "What information is GIVEN?",
                        "What are you being ASKED to find?",
                        "Underline or highlight key information",
                        "Can you restate the problem in your own words?"
                    )
                ),

                Slide.ExampleSlide(
                    id = 4,
                    title = "Example: Understanding the Problem",
                    problem = "Ana baked a cake. She gave ⅓ to her friend and ¼ to her neighbor. How much cake did she give away in total?",
                    steps = listOf(
                        "Let's UNDERSTAND:",
                        "Given information: \n • Ana gave ⅓ to her friend \n • Ana gave ¼ to her neighbor",
                        "What is asked? \n • How much cake did she give away in total?",
                        "Now we're ready to plan!"
                    ),
                    answer = "We understand the problem clearly"
                ),

                Slide.ConceptSlide(
                    id = 5,
                    title = "Step 2: PLAN",
                    content = "Decide HOW you will solve the problem:",
                    keyPoints = listOf(
                        "What operation(s) do you need? (+, −, ×, ÷)",
                        "Look for key words to identify operations",
                        "Write a number sentence or equation",
                        "Do you need to convert fractions?",
                        "What is your strategy?"
                    )
                ),

                Slide.ExampleSlide(
                    id = 6,
                    title = "Example: Planning the Solution",
                    problem = "Ana baked a cake. She gave ⅓ to her friend and ¼ to her neighbor. How much cake did she give away in total?",
                    steps = listOf(
                        "Let's PLAN:",
                        "Key word: 'total' → means ADDITION",
                        "Operation needed: \n • Add the two fractions",
                        "Number sentence: \n ⅓ + ¼ = N",
                        "Strategy: \n • Find LCD of 3 and 4 \n • Convert to equivalent fractions \n • Add the numerators"
                    ),
                    answer = "Our plan is ready!"
                ),

                Slide.ConceptSlide(
                    id = 7,
                    title = "Step 3: SOLVE",
                    content = "Now carry out your plan:",
                    keyPoints = listOf(
                        "Follow your plan step by step",
                        "Show all your work clearly",
                        "Do one operation at a time",
                        "Simplify your answer if possible",
                        "Include units in your answer (if applicable)"
                    )
                ),

                Slide.ExampleSlide(
                    id = 8,
                    title = "Example: Solving the Problem",
                    problem = "Ana baked a cake. She gave ⅓ to her friend and ¼ to her neighbor. How much cake did she give away in total?",
                    steps = listOf(
                        "Let's SOLVE: \n ⅓ + ¼ = ?",
                        "Find LCD of 3 and 4 = 12",
                        "Convert to equivalent fractions: \n ⅓ = ⁴⁄₁₂ (multiply by 4/4) \n ¼ = ³⁄₁₂ (multiply by 3/3)",
                        "Add: \n ⁴⁄₁₂ + ³⁄₁₂ = ⁷⁄₁₂",
                        "Answer: Ana gave away ⁷⁄₁₂ of the cake"
                    ),
                    answer = "⁷⁄₁₂ of the cake"
                ),

                Slide.ConceptSlide(
                    id = 9,
                    title = "Step 4: CHECK",
                    content = "Always verify your answer makes sense:",
                    keyPoints = listOf(
                        "Does your answer make sense?",
                        "Is it reasonable?",
                        "Can you work backwards to verify?",
                        "Did you answer the question that was asked?",
                        "Check your calculations"
                    )
                ),

                Slide.ExampleSlide(
                    id = 10,
                    title = "Example: Checking the Answer",
                    problem = "Ana baked a cake. She gave ⅓ to her friend and ¼ to her neighbor. How much cake did she give away in total?",
                    steps = listOf(
                        "Let's CHECK:",
                        "Our answer: ⁷⁄₁₂",
                        "Does it make sense? \n • ⅓ is about 0.33 \n • ¼ is 0.25 \n • Together: about 0.58 \n • ⁷⁄₁₂ ≈ 0.58 ✓ Makes sense!",
                        "Did we answer the question? \n • Yes! We found the total given away ✓",
                        "Is the answer reasonable? \n • Yes! It's more than ⅓ but less than 1 ✓"
                    ),
                    answer = "Our answer is correct!"
                ),

                Slide.PracticeSlide(
                    id = 11,
                    question = "Which step involves deciding what operation to use?",
                    options = listOf("Understand", "Plan", "Solve", "Check"),
                    correctAnswer = 1,
                    explanation = "Correct! The PLAN step is where you decide what operation to use and write your number sentence."
                ),

                Slide.ExampleSlide(
                    id = 12,
                    title = "Complete Example with All Steps",
                    problem = "A ribbon is 2 ½ meters long. Maria cuts off ¾ meter. How much ribbon is left?",
                    steps = listOf(
                        "1. UNDERSTAND: \n Given: 2 ½ m ribbon, cut off ¾ m \n Asked: How much is left?",
                        "2. PLAN: \n Operation: Subtraction (left means subtract) \n Number sentence: 2 ½ − ¾ = N",
                        "3. SOLVE: \n Convert: 2 ½ = 2 ²⁄₄ \n Borrow: 2 ²⁄₄ = 1 ⁶⁄₄ \n Subtract: 1 ⁶⁄₄ − ¾ = 1 ¾",
                        "4. CHECK: \n 1 ¾ + ¾ = 2 ½ ✓"
                    ),
                    answer = "1 ¾ meters of ribbon is left"
                ),

                Slide.ExampleSlide(
                    id = 13,
                    title = "Another Complete Example",
                    problem = "In a class, ⅖ of the students are boys. If there are 30 students, how many are boys?",
                    steps = listOf(
                        "1. UNDERSTAND: \n Given: ⅖ are boys, 30 total students \n Asked: How many boys?",
                        "2. PLAN: \n Operation: Multiplication ('of' means ×) \n Number sentence: ⅖ × 30 = N",
                        "3. SOLVE: \n ⅖ × ³⁰⁄₁ = (2 × 30)/(5 × 1) = ⁶⁰⁄₅ = 12",
                        "4. CHECK: \n If 12 are boys, then 18 are girls \n 12 + 18 = 30"
                    ),
                    answer = "There are 12 boys in the class"
                ),

                Slide.PracticeSlide(
                    id = 14,
                    question = "A pizza is cut into 8 slices. John ate ⅜ and Lisa ate ¼. What should we do to find how much they ate together?",
                    options = listOf(
                        "Subtract: ⅜ − ¼",
                        "Add: ⅜ + ¼",
                        "Multiply: ⅜ × ¼",
                        "Divide: ⅜ ÷ ¼"
                    ),
                    correctAnswer = 1,
                    explanation = "Correct! 'Together' means we ADD the amounts: ⅜ + ¼"
                ),

                Slide.ConceptSlide(
                    id = 15,
                    title = "Tips for Success",
                    content = "Remember these tips when solving word problems:",
                    keyPoints = listOf(
                        "Don't rush! Read carefully",
                        "Draw pictures or diagrams if it helps",
                        "Look for key words to identify operations",
                        "Show all your work step by step",
                        "Always check if your answer makes sense",
                        "Practice makes perfect!"
                    )
                ),

                Slide.PracticeSlide(
                    id = 16,
                    question = "Sam ran ⅗ km in the morning and ⅘ km in the evening. How much did he run in total? What is the answer?",
                    options = listOf("1 ⅖ km", "1 km", "²⁄₅ km", "⅕ km"),
                    correctAnswer = 0,
                    explanation = "Correct! ⅗ + ⅘ = ⁷⁄₅ = 1 ⅖ km. Remember to convert improper fractions to mixed numbers!"
                ),

                Slide.SummarySlide(
                    id = 17,
                    title = "Summary: The 4 Steps",
                    keyPoints = listOf(
                        "1. UNDERSTAND: Read carefully, identify given info and what's asked",
                        "2. PLAN: Choose operation, write number sentence",
                        "3. SOLVE: Carry out the plan, show your work",
                        "4. CHECK: Verify your answer makes sense",
                        "Use this method for EVERY word problem!",
                        "Practice regularly to improve your skills"
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
                    content = "In this topic, you'll learn how to recognize keywords that indicate division and solve problems using the division operation. These keywords are your clues to know when to divide!"
                ),

                Slide.ConceptSlide(
                    id = 2,
                    title = "Common Division Keywords",
                    content = "Do you think you're aware of these terms used in division?",
                    keyPoints = listOf(
                        "Quotient",
                        "Divided by",
                        "Cut / Split / Separate",
                        "Average / Mean",
                        "Split into / Shared equally",
                        "Each / Per / Every"
                    )
                ),

                Slide.ConceptSlide(
                    id = 3,
                    title = "Understanding 'Quotient'",
                    content = "The word 'quotient' specifically means the result or answer when you divide.",
                    keyPoints = listOf(
                        "Quotient = the answer to a division problem",
                        "Example: 'What is the quotient of 12 and 3?'",
                        "This means: 12 ÷ 3 = ?",
                        "The quotient is 4"
                    )
                ),

                Slide.ExampleSlide(
                    id = 4,
                    title = "Example 1: Using 'Quotient'",
                    problem = "What is the quotient of ¾ and ¼?",
                    steps = listOf(
                        "Step 1: Identify the operation \n 'Quotient' means division",
                        "Step 2: Write the division \n ¾ ÷ ¼",
                        "Step 3: Use Keep-Change-Flip \n ¾ × ⁴⁄₁",
                        "Step 4: Multiply \n (3 × 4)/(4 × 1) = ¹²⁄₄ = 3"
                    ),
                    answer = "The quotient is 3"
                ),

                Slide.ConceptSlide(
                    id = 5,
                    title = "Understanding 'Divided by'",
                    content = "'Divided by' is the most direct way to express division.",
                    keyPoints = listOf(
                        "Shows clear division operation",
                        "Example: '12 divided by 4'",
                        "Means: 12 ÷ 4 = 3",
                        "In fractions: ⅔ divided by ½ = ⅔ ÷ ½"
                    )
                ),

                Slide.ExampleSlide(
                    id = 6,
                    title = "Example 2: Using 'Divided by'",
                    problem = "⅔ divided by ⅙ equals what?",
                    steps = listOf(
                        "Step 1: Write as division \n ⅔ ÷ ⅙",
                        "Step 2: Find reciprocal of ⅙ \n Reciprocal is ⁶⁄₁",
                        "Step 3: Multiply \n ⅔ × ⁶⁄₁ = ¹²⁄₃ = 4"
                    ),
                    answer = "4"
                ),

                Slide.ConceptSlide(
                    id = 7,
                    title = "Understanding 'Split' and 'Share'",
                    content = "These words mean dividing something into equal parts or groups.",
                    keyPoints = listOf(
                        "'Split into' = divide into equal parts",
                        "'Shared equally' = divide among people/groups",
                        "'Cut into' = divide into sections",
                        "Example: 'Split ¾ pizza among 3 people'",
                        "Means: ¾ ÷ 3"
                    )
                ),

                Slide.ExampleSlide(
                    id = 8,
                    title = "Example 3: Using 'Split'",
                    problem = "A rope measuring 4 ½ meters is split into 3 equal pieces. How long is each piece?",
                    steps = listOf(
                        "Step 1: Identify the operation \n 'Split into' means division",
                        "Step 2: Convert to improper fraction \n 4 ½ = ⁹⁄₂",
                        "Step 3: Divide by 3 \n ⁹⁄₂ ÷ ³⁄₁ = ⁹⁄₂ × ⅓",
                        "Step 4: Multiply and simplify \n (9 × 1)/(2 × 3) = ⁹⁄₆ = 1 ½"
                    ),
                    answer = "Each piece is 1 ½ meters"
                ),

                Slide.ConceptSlide(
                    id = 9,
                    title = "Understanding 'Average'",
                    content = "Finding the average means adding numbers and dividing by how many numbers there are.",
                    keyPoints = listOf(
                        "Average = sum of numbers ÷ count of numbers",
                        "Also called 'mean'",
                        "Example: Average of ½ and ¾",
                        "Add: ½ + ¾ = 1 ¼",
                        "Divide by 2: 1 ¼ ÷ 2 = ⅝"
                    )
                ),

                Slide.ExampleSlide(
                    id = 10,
                    title = "Example 4: Finding Average",
                    problem = "What is the average of ⅓ and ⅔?",
                    steps = listOf(
                        "Step 1: Add the numbers \n ⅓ + ⅔ = ³⁄₃ = 1",
                        "Step 2: Count how many numbers \n There are 2 numbers",
                        "Step 3: Divide the sum by the count \n 1 ÷ 2 = ½"
                    ),
                    answer = "The average is ½"
                ),

                Slide.ConceptSlide(
                    id = 11,
                    title = "Understanding 'Each' and 'Per'",
                    content = "These words indicate division to find the amount for one unit.",
                    keyPoints = listOf(
                        "'Each' = for one person/item",
                        "'Per' = for each unit",
                        "'Every' = for each one",
                        "Example: '¾ pizza shared by 4 people. How much per person?'",
                        "Means: ¾ ÷ 4"
                    )
                ),

                Slide.PracticeSlide(
                    id = 12,
                    question = "Which operation should you use: 'What is the quotient of ⅘ and ⅖?'",
                    options = listOf("Addition", "Subtraction", "Multiplication", "Division"),
                    correctAnswer = 3,
                    explanation = "Correct! 'Quotient' means the answer to a division problem, so we use division: ⅘ ÷ ⅖"
                ),

                Slide.PracticeSlide(
                    id = 13,
                    question = "20 pencils are split into 5 equal groups. How many pencils are in each group?' - Does this problem use a division keyword?",
                    options = listOf("TRUE", "FALSE"),
                    correctAnswer = 0,
                    explanation = "Correct! The word 'split into' is a division keyword. We divide: 20 ÷ 5 = 4 pencils per group"
                ),

                Slide.ExampleSlide(
                    id = 14,
                    title = "Real-World Example",
                    problem = "Maria has 2 ¼ meters of ribbon. She wants to cut it into pieces that are ¾ meter long each. How many pieces can she make?",
                    steps = listOf(
                        "Step 1: Identify keywords \n 'Cut into' and 'each' → division",
                        "Step 2: Convert to improper fraction \n 2 ¼ = ⁹⁄₄",
                        "Step 3: Divide \n ⁹⁄₄ ÷ ¾ = ⁹⁄₄ × ⁴⁄₃",
                        "Step 4: Simplify \n (9 × 4)/(4 × 3) = ³⁶⁄₁₂ = 3"
                    ),
                    answer = "She can make 3 pieces"
                ),

                Slide.PracticeSlide(
                    id = 15,
                    question = "A pizza is ⅚ finished. It's shared equally among 2 people. What operation do you use?",
                    options = listOf("Addition", "Subtraction", "Multiplication", "Division"),
                    correctAnswer = 3,
                    explanation = "Correct! 'Shared equally' is a division keyword: ⅚ ÷ 2"
                ),

                Slide.SummarySlide(
                    id = 16,
                    title = "Summary",
                    keyPoints = listOf(
                        "Division keywords: quotient, divided by, split, cut, share",
                        "Average/Mean: add all numbers, then divide by count",
                        "Each/Per/Every: division to find amount per unit",
                        "Split into/Shared equally: division into equal parts",
                        "Look for these keywords to identify division problems",
                        "Remember: Keywords are your clues!"
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
                    title = "Welcome Back!",
                    content = "In this topic, you'll learn how to solve both routine and non-routine word problems involving division of fractions. Let's apply what we learned about division!"
                ),

                Slide.ConceptSlide(
                    id = 2,
                    title = "Review: Problem-Solving Steps",
                    content = "Remember the 4-step method we learned earlier?",
                    keyPoints = listOf(
                        "Step 1: UNDERSTAND the problem",
                        "Step 2: PLAN your solution",
                        "Step 3: SOLVE the problem",
                        "Step 4: CHECK your answer"
                    )
                ),

                Slide.ConceptSlide(
                    id = 3,
                    title = "Routine Division Problems",
                    content = "Routine division problems are straightforward - they clearly ask you to divide.",
                    keyPoints = listOf(
                        "Keywords clearly indicate division",
                        "Information is directly stated",
                        "One or two steps to solve",
                        "Pattern is easy to recognize"
                    )
                ),

                Slide.ExampleSlide(
                    id = 4,
                    title = "Example 1: Routine Problem",
                    problem = "A baker has 3 ¾ kg of flour. He wants to pack it into bags of ¾ kg each. How many bags can he make?",
                    steps = listOf(
                        "1. UNDERSTAND: \n Given: 3 ¾ kg of flour, ¾ kg per bag \n Asked: How many bags?",
                        "2. PLAN: \n Keyword: 'each' → Division \n Number sentence: 3 ¾ ÷ ¾ = N",
                        "3. SOLVE: \n 3 ¾ = ¹⁵⁄₄ \n ¹⁵⁄₄ ÷ ¾ = ¹⁵⁄₄ × ⁴⁄₃ = ⁶⁰⁄₁₂ = 5",
                        "4. CHECK: \n 5 bags × ¾ kg = 3 ¾ kg ✓"
                    ),
                    answer = "He can make 5 bags"
                ),

                Slide.ExampleSlide(
                    id = 5,
                    title = "Example 2: Routine Problem",
                    problem = "What is the quotient when 2 ½ is divided by ⅚?",
                    steps = listOf(
                        "1. UNDERSTAND: \n Given: 2 ½ and ⅚ \n Asked: What is the quotient?",
                        "2. PLAN: \n Keyword: 'quotient', 'divided by' → Division \n Number sentence: 2 ½ ÷ ⅚ = N",
                        "3. SOLVE: \n 2 ½ = ⁵⁄₂ \n ⁵⁄₂ ÷ ⅚ = ⁵⁄₂ × ⁶⁄₅ \n = (5 × 6)/(2 × 5) = ³⁰⁄₁₀ = 3",
                        "4. CHECK: \n 3 × ⅚ = 2 ½ ✓"
                    ),
                    answer = "The quotient is 3"
                ),

                Slide.PracticeSlide(
                    id = 6,
                    question = "A rope is 4 ½ meters long. If cut into pieces ¾ meter each, how many pieces are there?",
                    options = listOf("3", "4", "5", "6"),
                    correctAnswer = 3,
                    explanation = "Correct! 4 ½ ÷ ¾ = ⁹⁄₂ ÷ ¾ = ⁹⁄₂ × ⁴⁄₃ = ³⁶⁄₆ = 6 pieces"
                ),

                Slide.ConceptSlide(
                    id = 7,
                    title = "Non-Routine Division Problems",
                    content = "Non-routine problems require more thinking - division may not be obvious at first.",
                    keyPoints = listOf(
                        "Requires careful analysis",
                        "May need multiple operations",
                        "Division keyword might be hidden",
                        "Need to think creatively about the situation"
                    )
                ),

                Slide.ExampleSlide(
                    id = 8,
                    title = "Example 3: Non-Routine Problem",
                    problem = "Lisa ran a total of 6 ¾ km over 3 days. If she ran the same distance each day, how far did she run per day?",
                    steps = listOf(
                        "1. UNDERSTAND: \n Given: 6 ¾ km total, 3 days, same each day \n Asked: Distance per day?",
                        "2. PLAN: \n Keyword: 'per day' → Division \n 'Same each day' → equal parts \n Number sentence: 6 ¾ ÷ 3 = N",
                        "3. SOLVE: \n 6 ¾ = ²⁷⁄₄ \n ²⁷⁄₄ ÷ ³⁄₁ = ²⁷⁄₄ × ⅓ \n = (27 × 1)/(4 × 3) = ²⁷⁄₁₂ = 2 ¼",
                        "4. CHECK: \n 2 ¼ × 3 = 6 ¾ ✓"
                    ),
                    answer = "She ran 2 ¼ km per day"
                ),

                Slide.ExampleSlide(
                    id = 9,
                    title = "Example 4: Multi-Step Problem",
                    problem = "A recipe needs ⅔ cup of sugar to make 4 cookies. How much sugar is needed for one cookie?",
                    steps = listOf(
                        "1. UNDERSTAND: \n Given: ⅔ cup for 4 cookies \n Asked: Sugar for 1 cookie?",
                        "2. PLAN: \n Need to find amount 'per cookie' → Division \n Number sentence: ⅔ ÷ 4 = N",
                        "3. SOLVE: \n ⅔ ÷ ⁴⁄₁ = ⅔ × ¼ \n = (2 × 1)/(3 × 4) = ²⁄₁₂ = ⅙",
                        "4. CHECK: \n ⅙ × 4 = ⁴⁄₆ = ⅔ ✓"
                    ),
                    answer = "⅙ cup of sugar per cookie"
                ),

                Slide.ExampleSlide(
                    id = 10,
                    title = "Example 5: Problem with Extra Info",
                    problem = "Ana bought 5 ¼ meters of fabric for ₱420. She wants to cut it into ¾ meter pieces for pillowcases. How many pillowcases can she make?",
                    steps = listOf(
                        "1. UNDERSTAND: \n Given: 5 ¼ m fabric, ₱420 (extra info), ¾ m per piece \n Asked: How many pieces?",
                        "2. PLAN: \n Ignore the price - not needed! \n Keyword: 'cut into' → Division \n Number sentence: 5 ¼ ÷ ¾ = N",
                        "3. SOLVE: \n 5 ¼ = ²¹⁄₄ \n ²¹⁄₄ ÷ ¾ = ²¹⁄₄ × ⁴⁄₃ \n = (21 × 4)/(4 × 3) = ⁸⁴⁄₁₂ = 7",
                        "4. CHECK: \n 7 × ¾ = ²¹⁄₄ = 5 ¼ ✓"
                    ),
                    answer = "She can make 7 pillowcases"
                ),

                Slide.PracticeSlide(
                    id = 11,
                    question = "A water tank holds 12 ½ liters. If filled equally into bottles of 2 ½ liters each, how many bottles are needed?",
                    options = listOf("4", "5", "6", "7"),
                    correctAnswer = 1,
                    explanation = "Correct! 12 ½ ÷ 2 ½ = ²⁵⁄₂ ÷ ⁵⁄₂ = ²⁵⁄₂ × ²⁄₅ = ⁵⁰⁄₁₀ = 5 bottles"
                ),

                Slide.ExampleSlide(
                    id = 12,
                    title = "Example 6: Real-World Problem",
                    problem = "A farmer harvested 15 ¾ kg of tomatoes. He sells them in baskets that hold 1 ¼ kg each. After filling all complete baskets, how much is left over?",
                    steps = listOf(
                        "1. UNDERSTAND: \n Given: 15 ¾ kg total, 1 ¼ kg per basket \n Asked: Leftover amount?",
                        "2. PLAN: \n Divide to find # of baskets \n Check for remainder",
                        "3. SOLVE: \n 15 ¾ ÷ 1 ¼ = ⁶³⁄₄ ÷ ⁵⁄₄ \n = ⁶³⁄₄ × ⁴⁄₅ = ⁶³⁄₅ = 12 ³⁄₅ \n 12 complete baskets, ³⁄₅ kg left \n ³⁄₅ kg = ³⁄₅ × 1 ¼ kg = ³⁄₅ × ⁵⁄₄ = ¾ kg",
                        "4. CHECK: \n 12 × 1 ¼ + ¾ = 15 + ¾ = 15 ¾ ✓"
                    ),
                    answer = "¾ kg is left over"
                ),

                Slide.PracticeSlide(
                    id = 13,
                    question = "Which type needs MORE thinking and analysis?",
                    options = listOf("Routine problems", "Non-routine problems"),
                    correctAnswer = 1,
                    explanation = "Correct! Non-routine problems require more analysis, creative thinking, and may involve multiple steps or hidden operations."
                ),

                Slide.ConceptSlide(
                    id = 14,
                    title = "Tips for Success",
                    content = "Remember these strategies when solving division word problems:",
                    keyPoints = listOf(
                        "Look for division keywords (quotient, split, each, per)",
                        "Draw pictures or diagrams if helpful",
                        "Ignore extra information that's not needed",
                        "Check if your answer makes sense in context",
                        "For non-routine: think about what the situation means",
                        "Always show your work step by step"
                    )
                ),

                Slide.PracticeSlide(
                    id = 15,
                    question = "A recipe uses 2 ⅔ cups flour for 8 servings. You want to make 2 servings. How much flour? What should you do FIRST?",
                    options = listOf(
                        "Add 2 ⅔ + 8",
                        "Divide 2 ⅔ ÷ 8",
                        "Multiply 2 ⅔ × 2",
                        "Subtract 8 − 2"
                    ),
                    correctAnswer = 1,
                    explanation = "Correct! First divide to find flour per serving: 2 ⅔ ÷ 8, then multiply by 2"
                ),

                Slide.SummarySlide(
                    id = 16,
                    title = "Summary",
                    keyPoints = listOf(
                        "Use the 4-step method: Understand, Plan, Solve, Check",
                        "Routine problems: Clear division keywords, straightforward",
                        "Non-routine problems: Requires analysis, creative thinking",
                        "Look for keywords: quotient, split, each, per, shared",
                        "Ignore extra information not needed for the solution",
                        "Always check if your answer makes sense!",
                        "Practice different types to improve your skills"
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
                    content = "In this topic, you'll learn how to round off decimals to the nearest whole number or specified place value using the rules for rounding.\n\nRounding makes numbers easier to work with!"
                ),

                Slide.ConceptSlide(
                    id = 2,
                    title = "The Rounding Rule",
                    content = "Let's recall the basic rule for rounding off decimals:",
                    keyPoints = listOf(
                        "Look at the digit to the RIGHT of the rounding place",
                        "If it's 5 or greater (5, 6, 7, 8, 9) → Round UP (add 1)",
                        "If it's less than 5 (0, 1, 2, 3, 4) → Round DOWN (keep same)",
                        "Drop all digits after the rounding place"
                    )
                ),

                Slide.ConceptSlide(
                    id = 3,
                    title = "Understanding Place Values",
                    content = "Before rounding, you need to know the decimal place values:",
                    keyPoints = listOf(
                        "Ones place: 5.432 (the 5)",
                        "Tenths place: 5.432 (the 4)",
                        "Hundredths place: 5.432 (the 3)",
                        "Thousandths place: 5.432 (the 2)"
                    )
                ),

                Slide.ExampleSlide(
                    id = 4,
                    title = "Example: Rounding to Nearest Whole Number",
                    problem = "A birdhouse was built 6.243 meters above the ground. Round to the nearest whole number.",
                    steps = listOf(
                        "Step 1: Identify the rounding place \n 6.243 → The whole number place is 6",
                        "Step 2: Look at the digit to the right \n 6.243 → The digit to the right is 2",
                        "Step 3: Apply the rule \n Is 2 less than 5? YES \n So keep 6 the same",
                        "Step 4: Drop all digits after \n 6.243 becomes 6"
                    ),
                    answer = "The birdhouse is about 6 meters high"
                ),

                Slide.ExampleSlide(
                    id = 5,
                    title = "Example: Rounding UP",
                    problem = "Round 8.576 to the nearest whole number",
                    steps = listOf(
                        "Step 1: Identify the rounding place \n 8.576 → The whole number place is 8",
                        "Step 2: Look at the digit to the right \n 8.576 → The digit to the right is 5",
                        "Step 3: Apply the rule \n Is 5 equal to or greater than 5? YES \n So add 1 to 8 → 8 + 1 = 9",
                        "Step 4: Drop all digits after \n 8.576 becomes 9"
                    ),
                    answer = "9"
                ),

                Slide.PracticeSlide(
                    id = 6,
                    question = "Round 8.576 to the nearest whole number",
                    options = listOf("8", "9", "8.5", "8.6"),
                    correctAnswer = 1,
                    explanation = "Correct! The digit to the right of 8 is 5, which is ≥ 5, so we round UP: 8 + 1 = 9"
                ),

                Slide.PracticeSlide(
                    id = 7,
                    question = "Round 6.214 to the nearest whole number",
                    options = listOf("6", "7", "6.2", "6.3"),
                    correctAnswer = 0,
                    explanation = "Correct! The digit to the right of 6 is 2, which is < 5, so we keep 6 the same"
                ),

                Slide.ExampleSlide(
                    id = 8,
                    title = "Rounding to Tenths Place",
                    problem = "Round 3.456 to the nearest tenth",
                    steps = listOf(
                        "Step 1: Identify the rounding place \n 3.456 → The tenths place is 4",
                        "Step 2: Look at the digit to the right \n 3.456 → The digit to the right is 5",
                        "Step 3: Apply the rule \n Is 5 equal to or greater than 5? YES \n So add 1 to 4 → 4 + 1 = 5",
                        "Step 4: Keep the decimal point and drop after \n 3.456 becomes 3.5"
                    ),
                    answer = "3.5"
                ),

                Slide.ExampleSlide(
                    id = 9,
                    title = "Rounding to Hundredths Place",
                    problem = "Round 7.8947 to the nearest hundredth",
                    steps = listOf(
                        "Step 1: Identify the rounding place \n 7.8947 → The hundredths place is 9",
                        "Step 2: Look at the digit to the right \n 7.8947 → The digit to the right is 4",
                        "Step 3: Apply the rule \n Is 4 less than 5? YES \n So keep 9 the same",
                        "Step 4: Drop digits after hundredths \n 7.8947 becomes 7.89"
                    ),
                    answer = "7.89"
                ),

                Slide.PracticeSlide(
                    id = 10,
                    question = "Round 12.347 to the nearest tenth",
                    options = listOf("12.3", "12.4", "12", "13"),
                    correctAnswer = 0,
                    explanation = "Correct! The tenths place is 3, and the digit to the right is 4 (< 5), so we keep 3: 12.3"
                ),

                Slide.PracticeSlide(
                    id = 11,
                    question = "Round 5.999 to the nearest whole number",
                    options = listOf("5", "6", "5.9", "6.0"),
                    correctAnswer = 1,
                    explanation = "Correct! The ones place is 5, and the digit to the right is 9 (≥ 5), so we round up: 5 + 1 = 6"
                ),

                Slide.ConceptSlide(
                    id = 12,
                    title = "Special Case: Carrying Over",
                    content = "Sometimes rounding causes a carry-over:",
                    keyPoints = listOf(
                        "Example: 3.97 rounded to nearest tenth",
                        "The 9 rounds up to 10",
                        "Carry the 1: 3.9 + 0.1 = 4.0",
                        "Final answer: 4.0 or just 4"
                    )
                ),

                Slide.SummarySlide(
                    id = 13,
                    title = "Summary",
                    keyPoints = listOf(
                        "Identify the rounding place (ones, tenths, hundredths, etc.)",
                        "Look at the digit immediately to the RIGHT",
                        "If ≥ 5: Round UP (add 1 to rounding place)",
                        "If < 5: Round DOWN (keep rounding place same)",
                        "Drop all digits after the rounding place",
                        "Remember: 5 rounds UP!"
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
                    content = "In this topic, you'll learn how to correctly add and subtract decimal numbers.\n\nIt's just like adding whole numbers with one important rule!"
                ),

                Slide.ConceptSlide(
                    id = 2,
                    title = "The Key Rule",
                    content = "Adding and subtracting decimals is similar to whole numbers, but you MUST line up the decimal points!",
                    keyPoints = listOf(
                        "Align the decimal points vertically",
                        "This keeps place values in correct columns",
                        "Add zeros if needed to fill empty spaces",
                        "Then add or subtract like whole numbers",
                        "Bring down the decimal point to your answer"
                    )
                ),

                Slide.ConceptSlide(
                    id = 3,
                    title = "Understanding Decimal Places",
                    content = "Decimals can have different numbers of decimal places:",
                    keyPoints = listOf(
                        "Tenths: 0.1 (one digit after decimal)",
                        "Hundredths: 0.01 (two digits after decimal)",
                        "Thousandths: 0.001 (three digits after decimal)",
                        "Ten thousandths: 0.0001 (four digits after decimal)",
                        "Example: 7.1234 has four decimal places"
                    )
                ),

                Slide.ConceptSlide(
                    id = 4,
                    title = "Steps for Adding/Subtracting Decimals",
                    content = "Follow these three simple steps:",
                    keyPoints = listOf(
                        "Step 1: Write numbers in columns, align decimal points",
                        "Step 2: Add zeros to empty places (make all same length)",
                        "Step 3: Add or subtract as with whole numbers",
                        "Don't forget: Bring the decimal point straight down!"
                    )
                ),

                Slide.ExampleSlide(
                    id = 5,
                    title = "Example: Adding Decimals",
                    problem = "Add: 2.25 + 0.03 + 0.0756",
                    steps = listOf(
                        "Step 1: Align the decimal points \n   2.25 \n   0.03 \n + 0.0756",
                        "Step 2: Add zeros to make all same length \n   2.2500 \n   0.0300 \n + 0.0756",
                        "Step 3: Add like whole numbers \n   2.2500 \n   0.0300 \n + 0.0756 \n ——————— 2.3556"
                    ),
                    answer = "2.3556"
                ),

                Slide.ExampleSlide(
                    id = 6,
                    title = "Example: Another Addition",
                    problem = "Add: 5.6 + 2.34 + 0.125",
                    steps = listOf(
                        "Step 1: Align decimal points \n   5.6 \n   2.34 \n + 0.125",
                        "Step 2: Add zeros \n   5.600 \n   2.340 \n + 0.125",
                        "Step 3: Add \n   5.600 \n   2.340 \n + 0.125 \n ——————— \n   8.065"
                    ),
                    answer = "8.065"
                ),

                Slide.PracticeSlide(
                    id = 7,
                    question = "Add: 0.35 + 0.10 + 0.0123 = ?",
                    options = listOf("0.4623", "0.34123", "0.1235", "0.5213"),
                    correctAnswer = 0,
                    explanation = "Correct! Align decimals: 0.3500 + 0.1000 + 0.0123 = 0.4623"
                ),

                Slide.ExampleSlide(
                    id = 8,
                    title = "Example: Subtracting Decimals",
                    problem = "Subtract: 7.894 - 2.123",
                    steps = listOf(
                        "Step 1: Align the decimal points \n   7.894 \n - 2.123",
                        "Step 2: Check if zeros needed \n Both have 3 decimal places - good! \n   7.894 \n - 2.123",
                        "Step 3: Subtract like whole numbers \n   7.894 \n - 2.123 \n ——————— \n   5.771"
                    ),
                    answer = "5.771"
                ),

                Slide.ExampleSlide(
                    id = 9,
                    title = "Example: Subtraction with Zeros",
                    problem = "Subtract: 5.4 - 2.167",
                    steps = listOf(
                        "Step 1: Align decimal points \n   5.4 \n - 2.167",
                        "Step 2: Add zeros to 5.4 \n   5.400 \n - 2.167",
                        "Step 3: Subtract \n   5.400 \n - 2.167 \n ——————— \n   3.233"
                    ),
                    answer = "3.233"
                ),

                Slide.PracticeSlide(
                    id = 10,
                    question = "Subtract: 0.123 - 0.012 = ?",
                    options = listOf("0.111", "0.123", "0.1234", "0.112"),
                    correctAnswer = 0,
                    explanation = "Correct! 0.123 - 0.012 = 0.111"
                ),

                Slide.ExampleSlide(
                    id = 11,
                    title = "Example: Subtracting from Whole Number",
                    problem = "Subtract: 10 - 3.456",
                    steps = listOf(
                        "Step 1: Write 10 as 10.000 \n  10.000 \n -  3.456",
                        "Step 2: Align and add zeros \n Already done! \n  10.000 \n -  3.456",
                        "Step 3: Subtract (may need to borrow) \n  10.000 \n -  3.456 \n ———————— \n   6.544"
                    ),
                    answer = "6.544"
                ),

                Slide.PracticeSlide(
                    id = 12,
                    question = "Add: 12.5 + 3.75 + 0.125 = ?",
                    options = listOf("16.375", "15.375", "16.475", "15.475"),
                    correctAnswer = 0,
                    explanation = "Correct! 12.500 + 3.750 + 0.125 = 16.375"
                ),

                Slide.PracticeSlide(
                    id = 13,
                    question = "Subtract: 8.6 - 3.45 = ?",
                    options = listOf("5.15", "5.25", "4.15", "5.05"),
                    correctAnswer = 0,
                    explanation = "Correct! 8.60 - 3.45 = 5.15"
                ),

                Slide.ConceptSlide(
                    id = 14,
                    title = "Common Mistakes to Avoid",
                    content = "Watch out for these errors!",
                    keyPoints = listOf(
                        "❌ NOT aligning decimal points",
                        "❌ Forgetting to add zeros",
                        "❌ Forgetting the decimal point in answer",
                        "✓ ALWAYS line up decimal points vertically",
                        "✓ Add zeros to make numbers same length",
                        "✓ Bring decimal point straight down"
                    )
                ),

                Slide.ConceptSlide(
                    id = 15,
                    title = "Real-World Application",
                    content = "We use decimal addition and subtraction in everyday life:",
                    keyPoints = listOf(
                        "Money: ₱25.50 + ₱10.25 = ₱35.75",
                        "Measurements: 1.5 m + 2.75 m = 4.25 m",
                        "Weights: 3.45 kg - 1.2 kg = 2.25 kg",
                        "Scores: 9.5 + 8.75 + 9.0 = 27.25",
                        "Temperature, distance, and more!"
                    )
                ),

                Slide.SummarySlide(
                    id = 16,
                    title = "Summary",
                    keyPoints = listOf(
                        "ALWAYS align the decimal points vertically",
                        "Add zeros to make all numbers same length",
                        "Then add or subtract like whole numbers",
                        "Bring the decimal point straight down to answer",
                        "Double-check your decimal point placement!",
                        "Practice makes perfect - decimals are everywhere!"
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
                    title = "Welcome!",
                    content = "In this topic, you'll learn how to solve real-world problems involving addition and subtraction of decimals.\n\nLet's apply what we learned about decimal operations!"
                ),

                Slide.ConceptSlide(
                    id = 2,
                    title = "Review: Problem-Solving Steps",
                    content = "Remember the 4-step method for solving word problems:",
                    keyPoints = listOf(
                        "Step 1: UNDERSTAND the problem",
                        "Step 2: PLAN your solution",
                        "Step 3: SOLVE the problem",
                        "Step 4: CHECK your answer"
                    )
                ),

                Slide.ConceptSlide(
                    id = 3,
                    title = "Routine Problems with Decimals",
                    content = "Routine problems clearly state what operation to use and follow familiar patterns.",
                    keyPoints = listOf(
                        "Information is directly given",
                        "Keywords clearly indicate the operation",
                        "Usually requires one or two steps",
                        "Addition keywords: sum, total, altogether, combined",
                        "Subtraction keywords: difference, less, remaining, left"
                    )
                ),

                Slide.ExampleSlide(
                    id = 4,
                    title = "Example 1: Routine Addition Problem",
                    problem = "Maria bought fruits at the market. She spent ₱45.75 for mangoes, ₱23.50 for bananas, and ₱18.25 for apples. How much did she spend in total?",
                    steps = listOf(
                        "1. UNDERSTAND: \n Given: ₱45.75, ₱23.50, ₱18.25 \n Asked: Total amount spent?",
                        "2. PLAN: \n Keyword: 'total' → Addition \n Number sentence: 45.75 + 23.50 + 18.25 = N",
                        "3. SOLVE: \n   45.75 \n   23.50 \n + 18.25 \n ———————— \n   87.50",
                        "4. CHECK: \n 87.50 - 45.75 - 23.50 = 18.25"
                    ),
                    answer = "Maria spent ₱87.50 in total"
                ),

                Slide.ExampleSlide(
                    id = 5,
                    title = "Example 2: Routine Subtraction Problem",
                    problem = "A water tank contains 125.5 liters of water. After using 47.75 liters for watering plants, how much water remains?",
                    steps = listOf(
                        "1. UNDERSTAND: \n Given: 125.5 L initially, 47.75 L used \n Asked: How much remains?",
                        "2. PLAN: \n Keyword: 'remains' → Subtraction \n Number sentence: 125.5 - 47.75 = N",
                        "3. SOLVE: \n   125.50 \n -  47.75 \n ————————— \n    77.75",
                        "4. CHECK: \n 77.75 + 47.75 = 125.50 ✓"
                    ),
                    answer = "77.75 liters remain in the tank"
                ),

                Slide.PracticeSlide(
                    id = 6,
                    question = "A ribbon measures 8.5 meters. After cutting off 2.75 meters, how much ribbon is left?",
                    options = listOf("5.75 m", "6.25 m", "5.25 m", "6.75 m"),
                    correctAnswer = 0,
                    explanation = "Correct! 8.5 - 2.75 = 8.50 - 2.75 = 5.75 meters"
                ),

                Slide.ConceptSlide(
                    id = 7,
                    title = "Non-Routine Problems with Decimals",
                    content = "Non-routine problems require more thinking and may involve multiple steps or hidden operations.",
                    keyPoints = listOf(
                        "Requires careful analysis",
                        "May need multiple operations",
                        "Information might be indirect",
                        "Need to identify what's being asked",
                        "May have extra or missing information"
                    )
                ),

                Slide.ExampleSlide(
                    id = 8,
                    title = "Example 3: Non-Routine Problem",
                    problem = "John had ₱500.00. He bought a notebook for ₱45.75, a pen for ₱12.50, and lunch for ₱85.25. He then received ₱50.00 from his friend. How much money does John have now?",
                    steps = listOf(
                        "1. UNDERSTAND: \n Started with: ₱500.00 \n Spent: ₱45.75 + ₱12.50 + ₱85.25 \n Received: ₱50.00 \n Asked: Money left?",
                        "2. PLAN: \n Need multiple steps: \n • Add all expenses \n • Subtract from ₱500 \n • Add ₱50 received",
                        "3. SOLVE: \n Total expenses: 45.75 + 12.50 + 85.25 = 143.50 \n After spending: 500.00 - 143.50 = 356.50 \n After receiving: 356.50 + 50.00 = 406.50",
                        "4. CHECK: \n 500 - 143.50 + 50 = 406.50 ✓"
                    ),
                    answer = "John has ₱406.50 now"
                ),

                Slide.ExampleSlide(
                    id = 9,
                    title = "Example 4: Multi-Step Non-Routine",
                    problem = "A container has 15.75 kg of rice. On Monday, 3.5 kg was used. On Tuesday, 4.25 kg was used. On Wednesday, 2.5 kg was added. How much rice is in the container now?",
                    steps = listOf(
                        "1. UNDERSTAND: \n Started: 15.75 kg \n Used Monday: 3.5 kg \n Used Tuesday: 4.25 kg \n Added Wednesday: 2.5 kg",
                        "2. PLAN: \n Subtract what was used, add what was added \n 15.75 - 3.5 - 4.25 + 2.5 = N",
                        "3. SOLVE: \n 15.75 - 3.5 = 12.25 \n 12.25 - 4.25 = 8.00 \n 8.00 + 2.5 = 10.5",
                        "4. CHECK: \n Total used: 3.5 + 4.25 = 7.75 \n 15.75 - 7.75 + 2.5 = 10.5 ✓"
                    ),
                    answer = "There is 10.5 kg of rice now"
                ),

                Slide.PracticeSlide(
                    id = 10,
                    question = "Ana ran 2.5 km on Saturday and 3.75 km on Sunday. Her goal is to run 10 km total this weekend. How much more does she need to run?",
                    options = listOf("3.75 km", "4.25 km", "3.25 km", "5.5 km"),
                    correctAnswer = 0,
                    explanation = "Correct! Total run: 2.5 + 3.75 = 6.25 km. Still needed: 10 - 6.25 = 3.75 km"
                ),

                Slide.ExampleSlide(
                    id = 11,
                    title = "Example 5: Problem with Extra Information",
                    problem = "A store sold 45.5 kg of sugar on Monday at ₱50 per kg and 38.75 kg on Tuesday. What is the total weight of sugar sold in two days?",
                    steps = listOf(
                        "1. UNDERSTAND: \n Monday: 45.5 kg at ₱50/kg (price not needed!) \n Tuesday: 38.75 kg \n Asked: Total weight?",
                        "2. PLAN: \n Ignore the price - it's extra information \n Keyword: 'total' → Addition \n 45.5 + 38.75 = N",
                        "3. SOLVE: \n   45.50 \n + 38.75 \n ———————— \n   84.25",
                        "4. CHECK: \n 84.25 - 45.5 = 38.75"
                    ),
                    answer = "Total weight sold is 84.25 kg"
                ),

                Slide.ExampleSlide(
                    id = 12,
                    title = "Example 6: Comparison Problem",
                    problem = "Lisa's height is 1.45 meters and her brother's height is 1.68 meters. How much taller is her brother than Lisa?",
                    steps = listOf(
                        "1. UNDERSTAND: \n Lisa: 1.45 m \n Brother: 1.68 m \n Asked: How much taller?",
                        "2. PLAN: \n Keywords: 'how much taller' → Subtraction \n Subtract smaller from larger \n 1.68 - 1.45 = N",
                        "3. SOLVE: \n   1.68 \n - 1.45 \n ———————— \n   0.23",
                        "4. CHECK: \n 1.45 + 0.23 = 1.68 ✓"
                    ),
                    answer = "Her brother is 0.23 m (23 cm) taller"
                ),

                Slide.PracticeSlide(
                    id = 13,
                    question = "A recipe needs 2.5 cups of flour. You have 5.75 cups. After making the recipe, you buy 3.25 more cups. How much flour do you have now?",
                    options = listOf("6.5 cups", "5.5 cups", "6.0 cups", "7.0 cups"),
                    correctAnswer = 0,
                    explanation = "Correct! After using: 5.75 - 2.5 = 3.25. After buying: 3.25 + 3.25 = 6.5 cups"
                ),

                Slide.ConceptSlide(
                    id = 14,
                    title = "Tips for Success",
                    content = "Remember these strategies when solving decimal word problems:",
                    keyPoints = listOf(
                        "Read the problem carefully - twice if needed!",
                        "Identify what information is given and what's asked",
                        "Look for operation keywords",
                        "Ignore extra information not needed",
                        "Draw diagrams or write out steps for complex problems",
                        "Always check if your answer makes sense",
                        "Round to check: Does 45.75 + 23.50 ≈ 46 + 24 = 70? Close to 87.50 ✓"
                    )
                ),

                Slide.PracticeSlide(
                    id = 15,
                    question = "A farmer harvested 156.5 kg of tomatoes and 142.75 kg of eggplants. He sold 98.25 kg of tomatoes. How many kg of tomatoes does he have left?",
                    options = listOf("58.25 kg", "201 kg", "56.5 kg", "60 kg"),
                    correctAnswer = 0,
                    explanation = "Correct! Focus only on tomatoes: 156.5 - 98.25 = 58.25 kg. The eggplants are extra information!"
                ),

                Slide.ConceptSlide(
                    id = 16,
                    title = "Common Mistakes to Avoid",
                    content = "Watch out for these errors:",
                    keyPoints = listOf(
                        "❌ Not aligning decimal points when computing",
                        "❌ Using all numbers without checking relevance",
                        "❌ Forgetting to answer the actual question asked",
                        "❌ Not checking if answer makes sense",
                        "✓ Always align decimals properly",
                        "✓ Identify needed vs. extra information",
                        "✓ Re-read what the question is asking",
                        "✓ Estimate to verify your answer is reasonable"
                    )
                ),

                Slide.SummarySlide(
                    id = 17,
                    title = "Summary",
                    keyPoints = listOf(
                        "Use the 4-step method: Understand, Plan, Solve, Check",
                        "Routine problems: Direct keywords, straightforward",
                        "Non-routine problems: Multiple steps, requires analysis",
                        "Addition keywords: total, sum, altogether, combined",
                        "Subtraction keywords: difference, remaining, left, how much more",
                        "Always align decimal points when computing!",
                        "Ignore extra information not needed for the solution",
                        "Check: Does your answer make sense in real life?"
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
                    content = "In this topic, you will learn how to multiply decimals. You'll discover how to multiply decimals with up to 2 decimal places and understand where to place the decimal point in your answer!"
                ),

                Slide.ConceptSlide(
                    id = 2,
                    title = "How to Multiply Decimals?",
                    content = "Multiplying decimals is easier than you think! The key is to ignore the decimal points at first, then add them back at the end.",
                    keyPoints = listOf(
                        "Step 1: Ignore the decimal points",
                        "Step 2: Multiply as if they're whole numbers",
                        "Step 3: Count total decimal places in both numbers",
                        "Step 4: Place decimal point in the answer"
                    )
                ),

                Slide.ConceptSlide(
                    id = 3,
                    title = "The Decimal Rule",
                    content = "Here's the simple rule for placing the decimal point:",
                    keyPoints = listOf(
                        "Multiply the numbers WITHOUT decimal points",
                        "Count decimal places in FIRST number",
                        "Count decimal places in SECOND number",
                        "Add those counts together",
                        "Place decimal in answer from the RIGHT",
                        "Example: 0.5 (1 place) × 0.03 (2 places) = 3 places total"
                    )
                ),

                Slide.ExampleSlide(
                    id = 4,
                    title = "Example: Step-by-Step Multiplication",
                    problem = "Sophia spent 0.58 hours sewing an apron and 0.03 times as much time on the finishing touches. How long did she spend on the finishing touches?",
                    steps = listOf(
                        "Problem: 0.58 × 0.03",
                        "Step 1: Ignore decimals and multiply \n 58 × 3 = 174",
                        "Step 2: Count decimal places \n 0.58 has 2 decimal places \n 0.03 has 2 decimal places \n Total: 2 + 2 = 4 decimal places",
                        "Step 3: Place decimal from the right \n 174 → 0.0174 (move 4 places from right)"
                    ),
                    answer = "Sophia spent 0.0174 hours on finishing touches"
                ),

                Slide.ExampleSlide(
                    id = 5,
                    title = "Detailed Multiplication Process",
                    problem = "Let's break down 0.58 × 0.03 vertically:",
                    steps = listOf(
                        "    0.58 \n   × 0.03 \n   ————————",
                        "Multiply by hundredths (3): \n     0.58 \n   × 0.03 \n   ———————— \n      174  (58 × 3)",
                        "Multiply by tenths (0): \n     0.58 \n   × 0.03 \n   ———————— \n      174 \n     000   (58 × 0)",
                        "Add the partial products: \n     174 \n   + 000 \n   ———————— \n     174"
                    ),
                    answer = "Place decimal: 0.0174"
                ),

                Slide.ConceptSlide(
                    id = 6,
                    title = "Understanding Decimal Placement",
                    content = "Why do we count 4 decimal places?",
                    keyPoints = listOf(
                        "First number: 0.58 (2 places after decimal)",
                        "Second number: 0.03 (2 places after decimal)",
                        "Total: 2 + 2 = 4 places",
                        "Result: 0.0174 (4 places after decimal)",
                        "Count from the RIGHT side of your answer!"
                    )
                ),

                Slide.ExampleSlide(
                    id = 7,
                    title = "Example 2: Another Multiplication",
                    problem = "Multiply: 0.7 × 0.4",
                    steps = listOf(
                        "Step 1: Multiply without decimals \n 7 × 4 = 28",
                        "Step 2: Count decimal places \n 0.7 has 1 decimal place \n 0.4 has 1 decimal place \n Total: 1 + 1 = 2 decimal places",
                        "Step 3: Place decimal from right \n 28 → 0.28 (move 2 places from right)"
                    ),
                    answer = "0.28"
                ),

                Slide.ExampleSlide(
                    id = 8,
                    title = "Example 3: Decimal × Whole Number",
                    problem = "Multiply: 0.45 × 3",
                    steps = listOf(
                        "Step 1: Multiply without decimal \n 45 × 3 = 135",
                        "Step 2: Count decimal places \n 0.45 has 2 decimal places \n 3 has 0 decimal places (it's a whole number) \n Total: 2 + 0 = 2 decimal places",
                        "Step 3: Place decimal \n 135 → 1.35 (move 2 places from right)"
                    ),
                    answer = "1.35"
                ),

                Slide.PracticeSlide(
                    id = 9,
                    question = "What is 0.38 × 0.04 = ?",
                    options = listOf("0.0152", "0.1025", "0.0125", "0.2510"),
                    correctAnswer = 0,
                    explanation = "Correct! 38 × 4 = 152. Then count: 0.38 (2 places) + 0.04 (2 places) = 4 total places. Answer: 0.0152"
                ),

                Slide.PracticeSlide(
                    id = 10,
                    question = "What is 0.6 × 0.5 = ?",
                    options = listOf("0.3", "3.0", "0.03", "0.30"),
                    correctAnswer = 3,
                    explanation = "Correct! 6 × 5 = 30. Count places: 0.6 (1) + 0.5 (1) = 2 total. Answer: 0.30"
                ),

                Slide.ExampleSlide(
                    id = 11,
                    title = "Example 4: Adding Zeros",
                    problem = "What if your answer needs more decimal places than digits?",
                    steps = listOf(
                        "Problem: 0.02 × 0.3",
                        "Step 1: Multiply \n 2 × 3 = 6",
                        "Step 2: Count decimal places \n 0.02 (2 places) + 0.3 (1 place) = 3 total places",
                        "Step 3: We need 3 places, but only have 1 digit (6) \n Add zeros: 006 \n Place decimal: 0.006"
                    ),
                    answer = "0.006"
                ),

                Slide.ConceptSlide(
                    id = 12,
                    title = "Special Cases: Adding Zeros",
                    content = "Sometimes you need to add zeros in front to get the right number of decimal places:",
                    keyPoints = listOf(
                        "If answer has fewer digits than decimal places needed",
                        "Add zeros to the left",
                        "Example: 0.01 × 0.2 = 2 (wrong) → 0.002 (correct)",
                        "Count carefully: 2 places + 1 place = 3 places total",
                        "002 becomes 0.002"
                    )
                ),

                Slide.ExampleSlide(
                    id = 13,
                    title = "Real-World Problem 1",
                    problem = "A bottle of juice costs ₱35.50. If you buy 0.5 liters, how much do you pay?",
                    steps = listOf(
                        "Problem: 35.50 × 0.5",
                        "Step 1: Multiply \n 3550 × 5 = 17750",
                        "Step 2: Count places \n 35.50 has 2 places \n 0.5 has 1 place \n Total: 2 + 1 = 3 places",
                        "Step 3: Place decimal \n 17750 → 17.750 = 17.75"
                    ),
                    answer = "You pay ₱17.75"
                ),

                Slide.ExampleSlide(
                    id = 14,
                    title = "Real-World Problem 2",
                    problem = "A recipe calls for 0.25 cups of sugar. If you want to make 2.5 times the recipe, how much sugar do you need?",
                    steps = listOf(
                        "Problem: 0.25 × 2.5",
                        "Step 1: Multiply \n 25 × 25 = 625",
                        "Step 2: Count places \n 0.25 has 2 places \n 2.5 has 1 place \n Total: 2 + 1 = 3 places",
                        "Step 3: Place decimal \n 625 → 0.625"
                    ),
                    answer = "You need 0.625 cups of sugar"
                ),

                Slide.PracticeSlide(
                    id = 15,
                    question = "What is 1.2 × 0.05 = ?",
                    options = listOf("0.6", "0.06", "0.006", "6.0"),
                    correctAnswer = 1,
                    explanation = "Correct! 12 × 5 = 60. Count: 1.2 (1 place) + 0.05 (2 places) = 3 places. Answer: 0.060 or 0.06"
                ),

                Slide.ConceptSlide(
                    id = 16,
                    title = "Common Mistakes to Avoid",
                    content = "Watch out for these common errors!",
                    keyPoints = listOf(
                        "❌ Forgetting to count decimal places",
                        "❌ Placing decimal in the wrong position",
                        "❌ Not adding zeros when needed",
                        "✓ Always count from the RIGHT",
                        "✓ Add decimal places from BOTH numbers",
                        "✓ Add zeros in front if needed",
                        "✓ Check: Does your answer make sense?"
                    )
                ),

                Slide.PracticeSlide(
                    id = 17,
                    question = "A ribbon costs ₱12.50 per meter. How much do 0.3 meters cost?",
                    options = listOf("₱3.75", "₱37.50", "₱0.375", "₱375.00"),
                    correctAnswer = 0,
                    explanation = "Correct! 12.50 × 0.3: Multiply 1250 × 3 = 3750. Count: 2 + 1 = 3 places. Answer: 3.750 = ₱3.75"
                ),

                Slide.ConceptSlide(
                    id = 18,
                    title = "Quick Tips for Success",
                    content = "Remember these helpful strategies:",
                    keyPoints = listOf(
                        "1. Line up numbers on the RIGHT (ignore decimals)",
                        "2. Multiply like normal whole numbers",
                        "3. Count ALL decimal places in BOTH numbers",
                        "4. Place decimal by counting from the RIGHT",
                        "5. Add zeros if you need more places",
                        "6. Check: Is your answer reasonable?"
                    )
                ),

                Slide.SummarySlide(
                    id = 19,
                    title = "Summary",
                    keyPoints = listOf(
                        "Ignore decimal points and multiply as whole numbers",
                        "Count decimal places in BOTH numbers and add them",
                        "Place decimal point from the RIGHT of your answer",
                        "Add zeros to the left if needed for correct decimal places",
                        "When multiplying by whole numbers: only count decimal in the decimal number",
                        "Always check if your answer makes sense!",
                        "Practice makes perfect - decimals are everywhere in real life!"
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
                    content = "In this lesson, you will learn how to multiply decimals by powers of 10. You'll discover a simple trick: just move the decimal point! No complex multiplication needed!"
                ),

                Slide.ConceptSlide(
                    id = 2,
                    title = "What are Powers of 10?",
                    content = "Powers of 10 are numbers like 10, 100, 1000, or their decimal versions like 0.1, 0.01, 0.001.",
                    keyPoints = listOf(
                        "Whole number powers: 10, 100, 1000",
                        "Decimal powers: 0.1, 0.01, 0.001",
                        "Written with exponents: 10¹, 10², 10³",
                        "Or negative exponents: 10⁻¹, 10⁻², 10⁻³",
                        "The shortcut: just move the decimal point!"
                    )
                ),

                Slide.ConceptSlide(
                    id = 3,
                    title = "The Magic Rule",
                    content = "Here's the simple trick for multiplying decimals by powers of 10:",
                    keyPoints = listOf(
                        "Multiplying by 10, 100, 1000 → Move decimal RIGHT",
                        "Multiplying by 0.1, 0.01, 0.001 → Move decimal LEFT",
                        "Count the zeros to know how many places to move",
                        "Add zeros if needed",
                        "That's it! No multiplication required!"
                    )
                ),

                Slide.ExampleSlide(
                    id = 4,
                    title = "Real-World Problem",
                    problem = "A plane travels at the rate of 0.15 kilometers per second. How far does it travel in 10 seconds? 100 seconds? 1000 seconds?",
                    steps = listOf(
                        "Let's find out by multiplying:",
                        "In 10 seconds: \n 10 × 0.15 = 1.5 km \n Move decimal point 1 place RIGHT \n (10 has 1 zero)",
                        "In 100 seconds: \n 100 × 0.15 = 15 km \n Move decimal point 2 places RIGHT \n (100 has 2 zeros)",
                        "In 1000 seconds: \n 1000 × 0.15 = 150 km \n Move decimal point 3 places RIGHT \n (1000 has 3 zeros, add a zero at the end)"
                    ),
                    answer = "The plane travels 1.5 km (10 sec), 15 km (100 sec), 150 km (1000 sec)"
                ),

                Slide.ConceptSlide(
                    id = 5,
                    title = "Multiplying by 10",
                    content = "When you multiply by 10, move the decimal point 1 place to the RIGHT:",
                    keyPoints = listOf(
                        "10 has ONE zero \n Move decimal ONE place right",
                        "Examples: \n 0.15 × 10 = 1.5 \n 3.7 × 10 = 37 \n 0.08 × 10 = 0.8"
                    )
                ),

                Slide.ExampleSlide(
                    id = 6,
                    title = "Example: Multiply by 10",
                    problem = "Multiply: 0.15 × 10",
                    steps = listOf(
                        "Step 1: Count the zeros in 10 \n 10 has 1 zero",
                        "Step 2: Move decimal point 1 place RIGHT \n 0.15 → 01.5 → 1.5",
                        "Step 3: Remove unnecessary zero \n 01.5 becomes 1.5"
                    ),
                    answer = "1.5"
                ),

                Slide.ConceptSlide(
                    id = 7,
                    title = "Multiplying by 100",
                    content = "When you multiply by 100, move the decimal point 2 places to the RIGHT:",
                    keyPoints = listOf(
                        "100 has TWO zeros \n Move decimal TWO places right",
                        "Examples: \n 0.15 × 100 = 15 \n 0.8 × 100 = 80 \n 1.23 × 100 = 123"
                    )
                ),

                Slide.ExampleSlide(
                    id = 8,
                    title = "Example: Multiply by 100",
                    problem = "Multiply: 0.15 × 100",
                    steps = listOf(
                        "Step 1: Count the zeros in 100 \n 100 has 2 zeros",
                        "Step 2: Move decimal point 2 places RIGHT \n 0.15 → 015. → 15",
                        "Step 3: The answer is a whole number!",
                    ),
                    answer = "15"
                ),

                Slide.ConceptSlide(
                    id = 9,
                    title = "Multiplying by 1000",
                    content = "When you multiply by 1000, move the decimal point 3 places to the RIGHT:",
                    keyPoints = listOf(
                        "1000 has THREE zeros \n Move decimal THREE places right \n Add zeros if needed",
                        "Examples: \n 0.15 × 1000 = 150 \n 1.5 × 1000 = 1500 \n 0.007 × 1000 = 7"
                    )
                ),

                Slide.ExampleSlide(
                    id = 10,
                    title = "Example: Multiply by 1000",
                    problem = "Multiply: 0.15 × 1000",
                    steps = listOf(
                        "Step 1: Count the zeros in 1000 \n 1000 has 3 zeros",
                        "Step 2: Move decimal point 3 places RIGHT \n 0.15 → 0150. → 150",
                        "Step 3: We needed to add a zero \n Because we only had 2 digits after the decimal"
                    ),
                    answer = "150"
                ),

                Slide.PracticeSlide(
                    id = 11,
                    question = "What is 100 × 0.10 = ?",
                    options = listOf("0.10", "10", "0.100", "1.0"),
                    correctAnswer = 1,
                    explanation = "Correct! 100 has 2 zeros, so move decimal 2 places RIGHT: 0.10 → 10"
                ),

                Slide.ConceptSlide(
                    id = 12,
                    title = "Using Exponents",
                    content = "We can write powers of 10 using exponents. The exponent tells you how many places to move the decimal RIGHT:",
                    keyPoints = listOf(
                        "10¹ = 10 (move 1 place right)",
                        "10² = 100 (move 2 places right)",
                        "10³ = 1000 (move 3 places right)",
                        "The exponent = number of places to move!",
                        "Example: 0.15 × 10² = 0.15 × 100 = 15"
                    )
                ),

                Slide.ExampleSlide(
                    id = 13,
                    title = "Example: Using Positive Exponents",
                    problem = "Multiply using exponents:",
                    steps = listOf(
                        "10¹ × 0.15 = ? \n Exponent is 1 → move decimal 1 place RIGHT",
                        "0.15 → 1.5 \n 10² × 0.15 = ? \n Exponent is 2 → move decimal 2 places RIGHT",
                        "0.15 → 15 \n 10³ × 0.15 = ? \n Exponent is 3 → move decimal 3 places RIGHT",
                        "0.15 → 150"
                    ),
                    answer = "1.5, 15, and 150"
                ),

                Slide.PracticeSlide(
                    id = 14,
                    question = "What is 10² × 0.15 = ?",
                    options = listOf("20", "15", "10", "0.15"),
                    correctAnswer = 1,
                    explanation = "Correct! 10² means move decimal 2 places RIGHT: 0.15 → 15"
                ),

                Slide.ConceptSlide(
                    id = 15,
                    title = "Multiplying by 0.1, 0.01, 0.001",
                    content = "Now let's multiply by decimal powers of 10. This time, move the decimal point to the LEFT!",
                    keyPoints = listOf(
                        "0.1 = 10⁻¹ (move 1 place LEFT)",
                        "0.01 = 10⁻² (move 2 places LEFT)",
                        "0.001 = 10⁻³ (move 3 places LEFT)",
                        "Count the decimal places in 0.1, 0.01, or 0.001",
                        "That's how many places to move LEFT"
                    )
                ),

                Slide.ConceptSlide(
                    id = 16,
                    title = "Understanding Negative Exponents",
                    content = "Negative exponents tell you to move the decimal point to the LEFT:",
                    keyPoints = listOf(
                        "10⁻¹ = 0.1 (move 1 place left)",
                        "10⁻² = 0.01 (move 2 places left)",
                        "10⁻³ = 0.001 (move 3 places left)",
                        "Negative exponent = move LEFT",
                        "Positive exponent = move RIGHT"
                    )
                ),

                Slide.ExampleSlide(
                    id = 17,
                    title = "Example: Multiply by 0.1",
                    problem = "Multiply: 15 × 0.1",
                    steps = listOf(
                        "Step 1: Count decimal places in 0.1 \n 0.1 has 1 decimal place",
                        "Step 2: Move decimal point 1 place LEFT \n 15. → 1.5",
                        "Alternative: Use negative exponent \n 15 × 10⁻¹ = 1.5",
                        "Negative 1 → move 1 place LEFT"
                    ),
                    answer = "1.5"
                ),

                Slide.ExampleSlide(
                    id = 18,
                    title = "Example: Multiply by 0.01",
                    problem = "Multiply: 15 × 0.01",
                    steps = listOf(
                        "Step 1: Count decimal places in 0.01 \n 0.01 has 2 decimal places",
                        "Step 2: Move decimal point 2 places LEFT \n 15. → 0.15",
                        "Alternative: Use negative exponent \n 15 × 10⁻² = 0.15",
                        "Negative 2 → move 2 places LEFT"
                    ),
                    answer = "0.15"
                ),

                Slide.ExampleSlide(
                    id = 19,
                    title = "Example: Multiply by 0.001",
                    problem = "Multiply: 15 × 0.001",
                    steps = listOf(
                        "Step 1: Count decimal places in 0.001 \n 0.001 has 3 decimal places",
                        "Step 2: Move decimal point 3 places LEFT \n 15. → 0.015",
                        "Alternative: Use negative exponent \n 15 × 10⁻³ = 0.015",
                        "Negative 3 → move 3 places LEFT",
                        "Note: We added a zero in front!"
                    ),
                    answer = "0.015"
                ),

                Slide.PracticeSlide(
                    id = 20,
                    question = "What is 30 × 10⁻¹ = ?",
                    options = listOf("3.0", "30", "3", "0.30"),
                    correctAnswer = 2,
                    explanation = "Correct! 10⁻¹ means move decimal 1 place LEFT: 30. → 3.0 or 3"
                ),

                Slide.ConceptSlide(
                    id = 21,
                    title = "Quick Reference Guide",
                    content = "Here's a handy summary of moving the decimal:",
                    keyPoints = listOf(
                        "Positive Powers (RIGHT): \n 10 or 10¹ → move 1 place \n 100 or 10² → move 2 places \n 1000 or 10³ → move 3 places",
                        "Negative Powers (LEFT): \n 0.1 or 10⁻¹ → move 1 place \n 0.01 or 10⁻² → move 2 places \n 0.001 or 10⁻³ → move 3 places"
                    )
                ),

                Slide.ExampleSlide(
                    id = 22,
                    title = "Practice Problem 1",
                    problem = "A computer processes 0.75 gigabytes per second. How much does it process in 100 seconds?",
                    steps = listOf(
                        "Step 1: Set up the problem \n 0.75 × 100",
                        "Step 2: Count zeros in 100 \n 100 has 2 zeros",
                        "Step 3: Move decimal 2 places RIGHT \n 0.75 → 75",
                        "Step 4: Add the unit \n 75 gigabytes"
                    ),
                    answer = "The computer processes 75 gigabytes"
                ),

                Slide.ExampleSlide(
                    id = 23,
                    title = "Practice Problem 2",
                    problem = "A bacteria culture has 450 cells. After treatment, only 0.01 times the original amount remains. How many cells are left?",
                    steps = listOf(
                        "Step 1: Set up the problem \n 450 × 0.01",
                        "Step 2: Count decimal places in 0.01 \n 0.01 has 2 decimal places",
                        "Step 3: Move decimal 2 places LEFT \n 450. → 4.50 → 4.5",
                        "Step 4: Add the unit \n 4.5 cells"
                    ),
                    answer = "4.5 cells remain"
                ),

                Slide.PracticeSlide(
                    id = 24,
                    question = "What is 2.5 × 1000 = ?",
                    options = listOf("25", "250", "2500", "25000"),
                    correctAnswer = 2,
                    explanation = "Correct! 1000 has 3 zeros, move decimal 3 places RIGHT: 2.5 → 2500"
                ),

                Slide.PracticeSlide(
                    id = 25,
                    question = "What is 85 × 0.001 = ?",
                    options = listOf("0.085", "0.85", "8.5", "850"),
                    correctAnswer = 0,
                    explanation = "Correct! 0.001 has 3 decimal places, move decimal 3 places LEFT: 85 → 0.085"
                ),

                Slide.ConceptSlide(
                    id = 26,
                    title = "Common Mistakes to Avoid",
                    content = "Watch out for these common errors:",
                    keyPoints = listOf(
                        "❌ Moving decimal the wrong direction",
                        "❌ Not counting zeros correctly",
                        "❌ Forgetting to add zeros when needed",
                        "✓ Positive powers → move RIGHT",
                        "✓ Negative powers → move LEFT",
                        "✓ Count carefully!",
                        "✓ Add zeros if you need more places"
                    )
                ),

                Slide.ConceptSlide(
                    id = 27,
                    title = "Tips for Success",
                    content = "Remember these helpful strategies:",
                    keyPoints = listOf(
                        "Positive exponent? Move decimal RIGHT →",
                        "Negative exponent? Move decimal LEFT ←",
                        "Count the zeros (or the exponent number)",
                        "That's how many places to move",
                        "Add zeros if needed to fill empty spaces",
                        "Check: Does your answer make sense?"
                    )
                ),

                Slide.SummarySlide(
                    id = 28,
                    title = "Summary",
                    keyPoints = listOf(
                        "Powers of 10: 10, 100, 1000 OR 0.1, 0.01, 0.001",
                        "Multiply by 10, 100, 1000 → Move decimal RIGHT",
                        "Multiply by 0.1, 0.01, 0.001 → Move decimal LEFT",
                        "Positive exponents (10¹, 10²) → Move RIGHT",
                        "Negative exponents (10⁻¹, 10⁻²) → Move LEFT",
                        "The exponent number = places to move",
                        "No complex multiplication needed - just move the decimal!",
                        "This shortcut works every time!"
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
                    title = "Welcome!",
                    content = "In this topic, you'll learn how to solve real-world problems that involve multiplying decimals.\n\nLet's apply what we learned about decimal multiplication to everyday situations!"
                ),

                Slide.ConceptSlide(
                    id = 2,
                    title = "Review: The 4-Step Method",
                    content = "Remember our problem-solving steps? Let's use them for decimal multiplication problems:",
                    keyPoints = listOf(
                        "Step 1: UNDERSTAND the problem",
                        "Step 2: PLAN your solution",
                        "Step 3: SOLVE the problem",
                        "Step 4: CHECK your answer"
                    )
                ),

                Slide.ConceptSlide(
                    id = 3,
                    title = "Keywords for Multiplication",
                    content = "These words tell you to MULTIPLY decimals:",
                    keyPoints = listOf(
                        "Product of",
                        "Times / Multiplied by",
                        "Of (½ of 10 = ½ × 10)",
                        "Each / Per (when finding totals)",
                        "Rate × Time / Distance problems",
                        "Price × Quantity"
                    )
                ),

                Slide.ConceptSlide(
                    id = 4,
                    title = "Common Types of Problems",
                    content = "You'll encounter these types of multiplication problems with decimals:",
                    keyPoints = listOf(
                        "Shopping: Price × Quantity",
                        "Distance: Speed × Time",
                        "Area: Length × Width",
                        "Money: Rate × Amount",
                        "Scaling: Original × Factor",
                        "Percentage: Whole × Decimal"
                    )
                ),

                Slide.ExampleSlide(
                    id = 5,
                    title = "Example 1: Shopping Problem",
                    problem = "A kilogram of mangoes costs ₱85.50. Maria wants to buy 2.5 kilograms. How much will she pay?",
                    steps = listOf(
                        "1. UNDERSTAND: \n Given: ₱85.50 per kg, buying 2.5 kg \n Asked: Total cost?",
                        "2. PLAN: \n Keyword: 'per' → Multiplication \n Number sentence: 85.50 × 2.5 = N",
                        "3. SOLVE: \n Multiply: 8550 × 25 = 213750 \n Count places: 85.50 (2) + 2.5 (1) = 3 places \n 213750 → 213.750 = ₱213.75",
                        "4. CHECK: \n Round: 86 × 3 ≈ 258, close to 213.75 ✓"
                    ),
                    answer = "Maria will pay ₱213.75"
                ),

                Slide.ExampleSlide(
                    id = 6,
                    title = "Example 2: Distance Problem",
                    problem = "A car travels at 62.5 kilometers per hour. How far will it travel in 3.2 hours?",
                    steps = listOf(
                        "1. UNDERSTAND: \n Given: Speed 62.5 km/h, Time 3.2 hours \n Asked: Distance traveled?",
                        "2. PLAN: \n Formula: Distance = Speed × Time \n Number sentence: 62.5 × 3.2 = N",
                        "3. SOLVE: \n Multiply: 625 × 32 = 20000 \n Count places: 62.5 (1) + 3.2 (1) = 2 places \n 20000 → 200.00 = 200 km",
                        "4. CHECK: \n Round: 63 × 3 = 189, close to 200 ✓"
                    ),
                    answer = "The car will travel 200 kilometers"
                ),

                Slide.PracticeSlide(
                    id = 7,
                    question = "A notebook costs ₱45.75. How much do 4 notebooks cost?",
                    options = listOf("₱183", "₱183.00", "₱182.00", "₱184.00"),
                    correctAnswer = 1,
                    explanation = "Correct! 45.75 × 4: Multiply 4575 × 4 = 18300. Count 2 places → ₱183.00"
                ),

                Slide.ExampleSlide(
                    id = 8,
                    title = "Example 3: Area Problem",
                    problem = "A rectangular garden is 8.5 meters long and 4.2 meters wide. What is its area?",
                    steps = listOf(
                        "1. UNDERSTAND: \n Given: Length 8.5 m, Width 4.2 m \n Asked: Area?",
                        "2. PLAN: \n Formula: Area = Length × Width \n Number sentence: 8.5 × 4.2 = N",
                        "3. SOLVE: \n Multiply: 85 × 42 = 3570 \n Count places: 8.5 (1) + 4.2 (1) = 2 places \n 3570 → 35.70 = 35.7 m²",
                        "4. CHECK: \n Round: 9 × 4 = 36, close to 35.7 ✓"
                    ),
                    answer = "The garden's area is 35.7 square meters"
                ),

                Slide.ExampleSlide(
                    id = 9,
                    title = "Example 4: Money and Rate",
                    problem = "John earns ₱125.50 per hour. He worked 6.5 hours today. How much did he earn?",
                    steps = listOf(
                        "1. UNDERSTAND: \n Given: ₱125.50 per hour, 6.5 hours worked \n Asked: Total earnings?",
                        "2. PLAN: \n Keyword: 'per' → Multiplication \n Number sentence: 125.50 × 6.5 = N",
                        "3. SOLVE: \n Multiply: 12550 × 65 = 815750 \n Count places: 125.50 (2) + 6.5 (1) = 3 places \n 815750 → 815.750 = ₱815.75",
                        "4. CHECK: \n Round: 126 × 7 = 882, close to 815.75 ✓"
                    ),
                    answer = "John earned ₱815.75"
                ),

                Slide.PracticeSlide(
                    id = 10,
                    question = "A rope is 12.8 meters long. You need 3.5 times this length. How much rope do you need?",
                    options = listOf("44.8 m", "45.8 m", "44.0 m", "46.0 m"),
                    correctAnswer = 0,
                    explanation = "Correct! 12.8 × 3.5: Multiply 128 × 35 = 4480. Count 2 places → 44.80 = 44.8 m"
                ),

                Slide.ExampleSlide(
                    id = 11,
                    title = "Example 5: Fraction × Decimal",
                    problem = "A recipe needs 2.4 cups of flour. You want to make ½ of the recipe. How much flour do you need?",
                    steps = listOf(
                        "1. UNDERSTAND: \n Given: 2.4 cups needed, making ½ \n Asked: Flour for half recipe?",
                        "2. PLAN: \n Keyword: 'of' → Multiplication \n ½ = 0.5 \n Number sentence: 2.4 × 0.5 = N",
                        "3. SOLVE: \n Multiply: 24 × 5 = 120 \n Count places: 2.4 (1) + 0.5 (1) = 2 places \n 120 → 1.20 = 1.2 cups",
                        "4. CHECK: \n Half of 2.4 should be around 1.2 ✓"
                    ),
                    answer = "You need 1.2 cups of flour"
                ),

                Slide.ExampleSlide(
                    id = 12,
                    title = "Example 6: Multi-Item Shopping",
                    problem = "Maria bought 1.5 kg of chicken at ₱180.00 per kg and 2.3 kg of fish at ₱250.00 per kg. How much did she spend in total?",
                    steps = listOf(
                        "1. UNDERSTAND: \n Chicken: 1.5 kg at ₱180/kg \n Fish: 2.3 kg at ₱250/kg \n Asked: Total cost?",
                        "2. PLAN: \n Find cost of each, then add \n Chicken: 180 × 1.5 \n Fish: 250 × 2.3",
                        "3. SOLVE: \n Chicken: 180 × 1.5 = 270.0 = ₱270 \n Fish: 250 × 2.3 = 575.0 = ₱575 \n Total: 270 + 575 = ₱845",
                        "4. CHECK: \n Estimate: 180×2 + 250×2 = 860, close ✓"
                    ),
                    answer = "Maria spent ₱845.00 in total"
                ),

                Slide.PracticeSlide(
                    id = 13,
                    question = "A store sells apples at ₱65.50 per kg. Ana bought 3.8 kg and Ben bought 2.5 kg. How much did they spend together?",
                    options = listOf("₱412.65", "₱413.65", "₱410.65", "₱415.00"),
                    correctAnswer = 0,
                    explanation = "Correct! Total kg: 3.8 + 2.5 = 6.3 kg. Cost: 65.50 × 6.3 = ₱412.65"
                ),

                Slide.ExampleSlide(
                    id = 14,
                    title = "Example 7: Percentage as Decimal",
                    problem = "A shirt originally costs ₱450.00. It's on sale for 0.75 (75%) of the original price. What is the sale price?",
                    steps = listOf(
                        "1. UNDERSTAND: \n Original: ₱450.00 \n Sale: 0.75 of original (75%) \n Asked: Sale price?",
                        "2. PLAN: \n Keyword: 'of' → Multiplication \n Number sentence: 450 × 0.75 = N",
                        "3. SOLVE: \n Multiply: 450 × 75 = 33750 \n Count places: 450 (0) + 0.75 (2) = 2 places \n 33750 → 337.50 = ₱337.50",
                        "4. CHECK: \n 75% of 450 ≈ ¾ of 450 = 337.5 ✓"
                    ),
                    answer = "The sale price is ₱337.50"
                ),

                Slide.ExampleSlide(
                    id = 15,
                    title = "Example 8: Unit Conversion",
                    problem = "One meter equals 3.28 feet. A room is 4.5 meters long. How long is it in feet?",
                    steps = listOf(
                        "1. UNDERSTAND: \n Given: 1 m = 3.28 ft, room is 4.5 m \n Asked: Length in feet?",
                        "2. PLAN: \n Multiply meters by conversion factor \n Number sentence: 4.5 × 3.28 = N",
                        "3. SOLVE: \n Multiply: 45 × 328 = 14760 \n Count places: 4.5 (1) + 3.28 (2) = 3 places \n 14760 → 14.760 = 14.76 feet",
                        "4. CHECK: \n Round: 5 × 3 = 15, close to 14.76 ✓"
                    ),
                    answer = "The room is 14.76 feet long"
                ),

                Slide.PracticeSlide(
                    id = 16,
                    question = "Gasoline costs ₱58.50 per liter. A car's tank holds 45.5 liters. How much does it cost to fill the tank?",
                    options = listOf("₱2,661.75", "₱2,650.00", "₱2,700.00", "₱2,500.00"),
                    correctAnswer = 0,
                    explanation = "Correct! 58.50 × 45.5 = ₱2,661.75"
                ),

                Slide.ExampleSlide(
                    id = 17,
                    title = "Example 9: Problem with Extra Information",
                    problem = "A bakery sells cupcakes for ₱35.50 each and cookies for ₱12.00 each. Lisa bought 6 cupcakes. How much did she spend?",
                    steps = listOf(
                        "1. UNDERSTAND: \n Cupcakes: ₱35.50 each \n Cookies: ₱12.00 each (not needed!) \n Lisa bought: 6 cupcakes \n Asked: How much spent?",
                        "2. PLAN: \n Ignore cookie price - extra info \n Number sentence: 35.50 × 6 = N",
                        "3. SOLVE: \n Multiply: 3550 × 6 = 21300 \n Count places: 35.50 (2) + 6 (0) = 2 places \n 21300 → 213.00 = ₱213",
                        "4. CHECK: \n 36 × 6 = 216, close to 213 ✓"
                    ),
                    answer = "Lisa spent ₱213.00"
                ),

                Slide.ExampleSlide(
                    id = 18,
                    title = "Example 10: Comparing Costs",
                    problem = "Store A sells rice at ₱52.50 per kg. Store B sells it at ₱48.75 per kg. If you buy 8.5 kg, how much do you save by buying from Store B?",
                    steps = listOf(
                        "1. UNDERSTAND: \n Store A: ₱52.50/kg \n Store B: ₱48.75/kg \n Buying: 8.5 kg \n Asked: Savings?",
                        "2. PLAN: \n Find cost at each store, then subtract \n Store A: 52.50 × 8.5 \n Store B: 48.75 × 8.5",
                        "3. SOLVE: \n Store A: 52.50 × 8.5 = 446.25 \n Store B: 48.75 × 8.5 = 414.375 = ₱414.38 \n Savings: 446.25 - 414.38 = ₱31.87",
                        "4. CHECK: \n Difference per kg: 52.50 - 48.75 = 3.75 \n 3.75 × 8.5 ≈ 32, close to 31.87 ✓"
                    ),
                    answer = "You save ₱31.87 by buying from Store B"
                ),

                Slide.PracticeSlide(
                    id = 19,
                    question = "A swimming pool is 12.5 meters long and 6.4 meters wide. What is its area?",
                    options = listOf("80 m²", "75 m²", "80.0 m²", "85 m²"),
                    correctAnswer = 2,
                    explanation = "Correct! Area = Length × Width: 12.5 × 6.4 = 80.0 square meters"
                ),

                Slide.ConceptSlide(
                    id = 20,
                    title = "Tips for Success",
                    content = "Remember these strategies when solving word problems:",
                    keyPoints = listOf(
                        "Read carefully - identify what's given and what's asked",
                        "Look for multiplication keywords",
                        "Ignore extra information not needed",
                        "Set up your number sentence clearly",
                        "Show your work step by step",
                        "Always check if your answer makes sense",
                        "Estimate to verify: round and multiply"
                    )
                ),

                Slide.ConceptSlide(
                    id = 21,
                    title = "Common Mistakes to Avoid",
                    content = "Watch out for these errors:",
                    keyPoints = listOf(
                        "❌ Using all numbers without checking relevance",
                        "❌ Forgetting to count decimal places",
                        "❌ Not answering the actual question asked",
                        "❌ Placing decimal point incorrectly",
                        "✓ Identify needed vs. extra information",
                        "✓ Count decimal places carefully",
                        "✓ Re-read what the question is asking",
                        "✓ Verify your answer makes sense"
                    )
                ),

                Slide.SummarySlide(
                    id = 22,
                    title = "Summary",
                    keyPoints = listOf(
                        "Use the 4-step method: Understand, Plan, Solve, Check",
                        "Multiplication keywords: product, times, of, per, each",
                        "Common problem types: shopping, distance, area, money",
                        "Multiply like normal, then count decimal places",
                        "Place decimal point from the right",
                        "Ignore extra information not needed",
                        "Always estimate to verify your answer",
                        "Real-life decimals are everywhere - practice makes perfect!"
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
                    content = "In this topic, you'll master a systematic approach to solving any word problem.\n\nWith these steps, you'll tackle word problems with confidence and accuracy!"
                ),

                Slide.ConceptSlide(
                    id = 2,
                    title = "Why Word Problems?",
                    content = "Word problems connect math to real life. They help you:",
                    keyPoints = listOf(
                        "Apply math to everyday situations",
                        "Develop critical thinking skills",
                        "Learn to identify relevant information",
                        "Practice logical reasoning",
                        "Prepare for real-world problem solving",
                        "Understand when and how to use math"
                    )
                ),

                Slide.ConceptSlide(
                    id = 3,
                    title = "The 4-Step Problem Solving Method",
                    content = "This proven method works for ANY word problem:",
                    keyPoints = listOf(
                        "Step 1: UNDERSTAND the Problem",
                        "Step 2: PLAN the Solution",
                        "Step 3: SOLVE the Problem",
                        "Step 4: CHECK your Answer",
                        "Let's explore each step in detail!"
                    )
                ),

                Slide.ConceptSlide(
                    id = 4,
                    title = "Step 1: UNDERSTAND the Problem",
                    content = "Before you can solve a problem, you must fully understand it:",
                    keyPoints = listOf(
                        "Read the problem carefully (at least twice!)",
                        "What information is GIVEN?",
                        "What are you ASKED to find?",
                        "What does the problem mean in your own words?",
                        "Underline or highlight key information",
                        "Identify keywords that suggest operations"
                    )
                ),

                Slide.ConceptSlide(
                    id = 5,
                    title = "Understanding: Key Questions to Ask",
                    content = "Ask yourself these questions:",
                    keyPoints = listOf(
                        "What is the situation or context?",
                        "What numbers or values are provided?",
                        "What am I trying to find or calculate?",
                        "What units are involved? (meters, pesos, hours)",
                        "Is there any extra information I don't need?",
                        "Can I visualize or draw this problem?"
                    )
                ),

                Slide.ExampleSlide(
                    id = 6,
                    title = "Example: Understanding Phase",
                    problem = "Maria has ₱500. She bought 3 notebooks at ₱35.50 each and 2 pens at ₱15.75 each. How much money does she have left?",
                    steps = listOf(
                        "Let's UNDERSTAND:",
                        "GIVEN information: \n • Maria started with ₱500 \n • Bought 3 notebooks at ₱35.50 each \n • Bought 2 pens at ₱15.75 each",
                        "ASKED to find: \n • How much money is left?",
                        "In my own words: \n Maria spent money on notebooks and pens. \n I need to find what remains from ₱500."
                    ),
                    answer = "We understand the problem clearly!"
                ),

                Slide.ConceptSlide(
                    id = 7,
                    title = "Step 2: PLAN the Solution",
                    content = "Now decide HOW you will solve the problem:",
                    keyPoints = listOf(
                        "What operation(s) do you need?",
                        "Addition? Subtraction? Multiplication? Division?",
                        "Write a number sentence or equation",
                        "What strategy will you use?",
                        "Do you need to solve in multiple steps?",
                        "What should you calculate first?"
                    )
                ),

                Slide.ConceptSlide(
                    id = 8,
                    title = "Planning: Operation Keywords",
                    content = "Keywords help identify which operation to use:",
                    keyPoints = listOf(
                        "Addition: sum, total, combined, altogether",
                        "Subtraction: difference, left, remaining, less than",
                        "Multiplication: product, times, of, per, each",
                        "Division: quotient, split, shared, per (for unit rates)",
                        "Multiple operations? Plan the order!"
                    )
                ),

                Slide.ExampleSlide(
                    id = 9,
                    title = "Example: Planning Phase",
                    problem = "Maria has ₱500. She bought 3 notebooks at ₱35.50 each and 2 pens at ₱15.75 each. How much money does she have left?",
                    steps = listOf(
                        "Let's PLAN:",
                        "Operations needed: \n • Multiplication (to find cost of notebooks) \n • Multiplication (to find cost of pens) \n • Addition (to find total spent) \n • Subtraction (to find money left)",
                        "Number sentences: \n Cost of notebooks: 35.50 × 3 \n Cost of pens: 15.75 × 2 \n Total spent: Cost of notebooks + Cost of pens \n Money left: 500 - Total spent"
                    ),
                    answer = "Our plan is ready - let's solve!"
                ),

                Slide.ConceptSlide(
                    id = 10,
                    title = "Step 3: SOLVE the Problem",
                    content = "Now carry out your plan carefully:",
                    keyPoints = listOf(
                        "Follow your plan step by step",
                        "Show all your work clearly",
                        "Do one calculation at a time",
                        "Write down intermediate results",
                        "Keep track of units (₱, m, kg, etc.)",
                        "Simplify or round if appropriate"
                    )
                ),

                Slide.ExampleSlide(
                    id = 11,
                    title = "Example: Solving Phase",
                    problem = "Maria has ₱500. She bought 3 notebooks at ₱35.50 each and 2 pens at ₱15.75 each. How much money does she have left?",
                    steps = listOf(
                        "Let's SOLVE:",
                        "Step 1: Cost of notebooks \n 35.50 × 3 = 106.50 \n ₱106.50 for notebooks",
                        "Step 2: Cost of pens \n 15.75 × 2 = 31.50 \n ₱31.50 for pens",
                        "Step 3: Total spent \n 106.50 + 31.50 = 138.00 \n Total spent: ₱138.00",
                        "Step 4: Money left \n 500.00 - 138.00 = 362.00 \n Money left: ₱362.00"
                    ),
                    answer = "Maria has ₱362.00 left"
                ),

                Slide.ConceptSlide(
                    id = 12,
                    title = "Step 4: CHECK your Answer",
                    content = "Always verify your solution:",
                    keyPoints = listOf(
                        "Does your answer make sense?",
                        "Is it reasonable?",
                        "Can you work backwards to verify?",
                        "Did you answer the actual question asked?",
                        "Are the units correct?",
                        "Check your calculations"
                    )
                ),

                Slide.ConceptSlide(
                    id = 13,
                    title = "Checking: Verification Methods",
                    content = "Ways to verify your answer:",
                    keyPoints = listOf(
                        "Work backwards (reverse operations)",
                        "Estimate using rounding",
                        "Use a different method to solve",
                        "Check if answer fits the context",
                        "Verify units are correct",
                        "Ask: Is this answer logical?"
                    )
                ),

                Slide.ExampleSlide(
                    id = 14,
                    title = "Example: Checking Phase",
                    problem = "Maria has ₱500. She bought 3 notebooks at ₱35.50 each and 2 pens at ₱15.75 each. How much money does she have left?",
                    steps = listOf(
                        "Let's CHECK: \n Our answer: ₱362.00",
                        "Method 1 - Work backwards: \n 362 + 138 = 500",
                        "Method 2 - Estimate: \n Notebooks: 3 × 36 ≈ 108 \n Pens: 2 × 16 ≈ 32 \n Total: 108 + 32 = 14 \n Left: 500 - 140 = 360 \n Close to 362!",
                        "Method 3 - Reasonableness: \n Spent less than half, so having ₱362 left makes sense ✓"
                    ),
                    answer = "Our answer is verified and correct!"
                ),

                Slide.PracticeSlide(
                    id = 15,
                    question = "Which step involves writing a number sentence?",
                    options = listOf("Understand", "Plan", "Solve", "Check"),
                    correctAnswer = 1,
                    explanation = "Correct! The PLAN step is where you decide on operations and write number sentences."
                ),

                Slide.ExampleSlide(
                    id = 16,
                    title = "Complete Example 2: All Steps",
                    problem = "A rectangular garden is 12.5 meters long and 8.4 meters wide. Fencing costs ₱85.50 per meter. How much will it cost to fence the entire garden?",
                    steps = listOf(
                        "1. UNDERSTAND: \n Given: Length 12.5 m, Width 8.4 m, ₱85.50/m \n Asked: Total cost to fence? \n Note: Fencing goes around perimeter",
                        "2. PLAN: \n Find perimeter: 2(L + W) \n Multiply perimeter by cost per meter",
                        "3. SOLVE: \n Perimeter = 2(12.5 + 8.4) \n = 2(20.9) = 41.8 meters \n Cost = 41.8 × 85.50 = ₱3,573.90",
                        "4. CHECK: \n Estimate: 2(13+8)×86 = 2(21)×86 = 42×86 ≈ 3,600 \n Close to 3,573.90"
                    ),
                    answer = "It will cost ₱3,573.90 to fence the garden"
                ),

                Slide.ExampleSlide(
                    id = 17,
                    title = "Complete Example 3: Multi-Step Problem",
                    problem = "A store offers a 20% discount on a bag originally priced at ₱1,250. After the discount, a 12% sales tax is added. What is the final price?",
                    steps = listOf(
                        "1. UNDERSTAND: \n Original: ₱1,250, 20% discount, then 12% tax \n Asked: Final price?",
                        "2. PLAN: \n Step 1: Find discount amount (20% of 1,250) \n Step 2: Subtract discount from original \n Step 3: Find tax amount (12% of discounted price) \n Step 4: Add tax to discounted price",
                        "3. SOLVE: \n Discount: 1,250 × 0.20 = 250 \n After discount: 1,250 - 250 = 1,000 \n Tax: 1,000 × 0.12 = 120 \n Final: 1,000 + 120 = ₱1,120",
                        "4. CHECK: \n Original discounted to 80%: 1,250×0.8=1,000 \n Then 112% of 1,000: 1,000×1.12=1,120"
                    ),
                    answer = "The final price is ₱1,120.00"
                ),

                Slide.PracticeSlide(
                    id = 18,
                    question = "A bus travels 65.5 km in one hour. How far will it travel in 4.5 hours? What should you do FIRST?",
                    options = listOf(
                        "Multiply 65.5 × 4.5",
                        "Read and understand the problem",
                        "Check your answer",
                        "Write the final answer"
                    ),
                    correctAnswer = 1,
                    explanation = "Correct! Always UNDERSTAND the problem first before planning or solving."
                ),

                Slide.ConceptSlide(
                    id = 19,
                    title = "Common Problem Types",
                    content = "Recognize these common word problem patterns:",
                    keyPoints = listOf(
                        "Shopping/Money: Cost per item × quantity",
                        "Distance: Speed × Time",
                        "Area/Perimeter: Length × Width or 2(L+W)",
                        "Rate problems: Rate × Amount",
                        "Comparison: Subtract to find difference",
                        "Sharing/Distribution: Division into equal parts"
                    )
                ),

                Slide.ConceptSlide(
                    id = 20,
                    title = "Dealing with Extra Information",
                    content = "Not all information in a problem is needed:",
                    keyPoints = listOf(
                        "Read carefully to identify relevant facts",
                        "Cross out or ignore extra information",
                        "Ask: Do I need this to answer the question?",
                        "Example: 'Juan is 12 years old and has ₱500...'",
                        "If the question is about money, age is extra info!",
                        "Focus only on what helps answer the question"
                    )
                ),

                Slide.ExampleSlide(
                    id = 21,
                    title = "Example: Extra Information Problem",
                    problem = "A bookstore has 150 books on the shelf. Each book costs ₱125.50. The store also has 75 magazines at ₱45 each. If you buy 4 books, how much do you pay?",
                    steps = listOf(
                        "1. UNDERSTAND: \n 150 books (extra info - not needed) \n Each book: ₱125.50 (NEEDED) \n 75 magazines at ₱45 (extra info - not asked) \n Buying: 4 books (NEEDED) \n Asked: Cost of 4 books?",
                        "2. PLAN: \n Ignore: number of books on shelf, magazines \n Use: price per book and quantity bought \n 125.50 × 4 = N",
                        "3. SOLVE: \n 125.50 × 4 = 502.00",
                        "4. CHECK: \n 125 × 4 = 500, close to 502 ✓"
                    ),
                    answer = "You pay ₱502.00 for 4 books"
                ),

                Slide.ConceptSlide(
                    id = 22,
                    title = "Tips for Success",
                    content = "Master word problems with these strategies:",
                    keyPoints = listOf(
                        "Read slowly and carefully - don't rush!",
                        "Highlight or underline key information",
                        "Draw diagrams or pictures when helpful",
                        "Break complex problems into smaller steps",
                        "Write down what you know and what you need",
                        "Check your work before finalizing",
                        "Practice regularly with different problem types"
                    )
                ),

                Slide.ConceptSlide(
                    id = 23,
                    title = "When You Get Stuck",
                    content = "What to do if you're having trouble:",
                    keyPoints = listOf(
                        "Re-read the problem more slowly",
                        "Identify what you DO understand",
                        "Draw a picture or diagram",
                        "Try simpler numbers first",
                        "Work backwards from the answer",
                        "Ask: What would make sense?",
                        "Take a break and come back fresh"
                    )
                ),

                Slide.ConceptSlide(
                    id = 24,
                    title = "Common Mistakes to Avoid",
                    content = "Watch out for these frequent errors:",
                    keyPoints = listOf(
                        "❌ Not reading the problem completely",
                        "❌ Rushing to calculate without planning",
                        "❌ Using all numbers without thinking",
                        "❌ Not answering the actual question asked",
                        "❌ Forgetting to check your answer",
                        "✓ Read carefully and understand first",
                        "✓ Plan before you solve",
                        "✓ Always verify your answer makes sense"
                    )
                ),

                Slide.PracticeSlide(
                    id = 25,
                    question = "A farmer harvested 125.5 kg of mangoes and 98.3 kg of bananas. He sold the mangoes at ₱85 per kg. How much did he earn from the mangoes?",
                    options = listOf("₱10,667.50", "₱19,023.00", "₱8,355.50", "₱10,000.00"),
                    correctAnswer = 0,
                    explanation = "Correct! Banana information is extra. Calculate: 125.5 × 85 = ₱10,667.50"
                ),

                Slide.ConceptSlide(
                    id = 26,
                    title = "The Power of Visualization",
                    content = "Drawing helps you understand problems:",
                    keyPoints = listOf(
                        "Sketch shapes for geometry problems",
                        "Draw timelines for time problems",
                        "Use tables to organize information",
                        "Create diagrams for distance problems",
                        "Visualize helps reveal the solution path",
                        "Don't worry about artistic quality - focus on clarity"
                    )
                ),

                Slide.ConceptSlide(
                    id = 27,
                    title = "Building Problem-Solving Confidence",
                    content = "Become a master problem solver:",
                    keyPoints = listOf(
                        "Practice different types of problems regularly",
                        "Learn from mistakes - they teach you!",
                        "Celebrate when you solve problems correctly",
                        "Start with easier problems, progress to harder ones",
                        "Teach others - it reinforces your learning",
                        "Stay patient and persistent",
                        "Remember: Every expert was once a beginner!"
                    )
                ),

                Slide.SummarySlide(
                    id = 28,
                    title = "Summary: The 4-Step Method",
                    keyPoints = listOf(
                        "1. UNDERSTAND: Read carefully, identify given/asked",
                        "2. PLAN: Choose operations, write number sentence",
                        "3. SOLVE: Calculate step by step, show work",
                        "4. CHECK: Verify answer makes sense",
                        "Additional Tips: \n • Look for keywords that suggest operations \n • Ignore extra information not needed \n • Draw diagrams when helpful \n • Estimate to check reasonableness \n • Practice makes perfect!"
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
                ),

                Slide.ConceptSlide(
                    id = 3,
                    title = "Understanding Decimals",
                    content = "Even though we use different notations, we're still looking at nonnegative rational numbers. You can divide decimals using either the fraction method or the decimal method, just like you do with multiplication.",
                ),

                Slide.ConceptSlide(
                    id = 4,
                    title = "How Do We Divide Decimals?",
                    content = "How can we divide decimals or mixed decimals by other decimals? Here are the steps to divide mixed decimals by decimals.",
                    keyPoints = listOf(
                        "Make the divisor a whole number",
                        "Move the decimal in the dividend the same number of places",
                        "Divide like whole numbers",
                        "Place the decimal point correctly"
                    )
                ),

                Slide.ExampleSlide(
                    id = 5,
                    title = "Example: 0.25 ÷ 0.5",
                    problem = "0.25 divided by 0.5",
                    steps = listOf(
                        "Step 1: Make the divisor a whole number \n Multiply 0.5 by 10 → move decimal 1 place right",
                        "0.5 = 5",
                        "Step 2: Move decimal in dividend the same way \n Multiply 0.25 by 10 → move decimal 1 place right",
                        "0.25 = 2.5",
                        "Take note: What we do with the divisor, we do the same with the dividend."
                    ),
                    answer = "Now we have: 2.5 ÷ 5"
                ),

                Slide.ExampleSlide(
                    id = 6,
                    title = "Example: 0.25 ÷ 0.5 (Continued)",
                    problem = "2.5 ÷ 5 = ?",
                    steps = listOf(
                        "Step 3: Divide like whole numbers \n Put the decimal point of the quotient just above the decimal point of the dividend",
                        "    0.5\n 5 ) 2.5\n    -2.5\n     ———\n      0",
                        "Answer: 0.5"
                    ),
                    answer = "0.5"
                ),

                Slide.ConceptSlide(
                    id = 7,
                    title = "Step 4: Check Your Answer",
                    content = "Multiply the quotient and the divisor like multiplying a whole number. Put the decimal point in the product with the same number of decimal places as in the quotient.",
                    keyPoints = listOf(
                        "0.5 × 0.5 = 0.25 ✓",
                        "This verifies our answer is correct!"
                    )
                ),

                Slide.ConceptSlide(
                    id = 8,
                    title = "Steps for Dividing Decimals",
                    content = "In dividing decimal/mixed decimal by decimals, follow these steps:",
                    keyPoints = listOf(
                        "First: Change the divisor to a whole number by moving the decimal point to the rightmost place \n • Multiply by 10 if only one decimal place \n • Multiply by 100 if two decimal places",
                        "Second: Move the decimal point in the dividend the same number of places",
                        "Third: Insert zeros to the dividend when needed",
                        "Remember: What we do with the divisor, we do the same to the dividend"
                    )
                ),

                Slide.ExampleSlide(
                    id = 9,
                    title = "Example: 2.4 ÷ 0.3",
                    problem = "2.4 ÷ 0.3 = ?",
                    steps = listOf(
                        "Step 1: Make the divisor a whole number \n Move the decimal one place to the right:",
                        "0.3 → 3",
                        "Step 2: Move the decimal in the dividend the same number of places",
                        "2.4 → 24",
                        "Step 3: Divide like whole numbers",
                        "24 ÷ 3 = 8"
                    ),
                    answer = "8"
                ),

                Slide.PracticeSlide(
                    id = 10,
                    question = "Practice Time!! 5.2 ÷ 0.4 = ?",
                    options = listOf("13", "5", "6", "12"),
                    correctAnswer = 0,
                    explanation = "Correct! Move decimals: 0.4 → 4 and 5.2 → 52. Then 52 ÷ 4 = 13"
                ),

                Slide.SummarySlide(
                    id = 11,
                    title = "Summary",
                    keyPoints = listOf(
                        "To divide decimals: \n 1. Make the divisor a whole number by moving the decimal point \n 2. Move the decimal in the dividend the same number of places \n 3. Divide like whole numbers \n 4. Place decimal point in quotient above the dividend's decimal point \n 5. Check by multiplying the quotient by the divisor",
                        "Key Rule: What you do to the divisor, you must do to the dividend!"
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
                    content = "In this topic, you will learn how to divide decimals by 10 and more. You will understand how to divide decimals with up to four decimal places by 0.1, 0.01, and 0.001, and decimals with up to two decimal places by 10, 100, and 1,000 in your head!"
                ),

                Slide.ConceptSlide(
                    id = 2,
                    title = "How to Divide Decimals by 10?",
                    content = "To divide a decimal by 10, move the decimal point one place to the LEFT. This makes the number ten times smaller.",
                    keyPoints = listOf(
                        "Divide by 10 → Move decimal 1 place LEFT \n Example: 45.6 ÷ 10 = 4.56",
                        "Divide by 100 → Move decimal 2 places LEFT \n Example: 45.6 ÷ 100 = 0.456",
                        "Divide by 1,000 → Move decimal 3 places LEFT \n Example: 45.6 ÷ 1,000 = 0.0456"
                    )
                ),

                Slide.ConceptSlide(
                    id = 3,
                    title = "Dividing by 0.1, 0.01, 0.001",
                    content = "Here's an interesting pattern: dividing by 0.1, 0.01, 0.001, and 0.0001 is the same as multiplying by 10, 100, 1,000, and 10,000!",
                    keyPoints = listOf(
                        "0.1 = 10 (move decimal 1 place RIGHT)",
                        "0.01 = 100 (move decimal 2 places RIGHT)",
                        "0.001 = 1,000 (move decimal 3 places RIGHT)",
                        "0.0001 = 10,000 (move decimal 4 places RIGHT)",
                        "Let's see this with examples!"
                    )
                ),

                Slide.ExampleSlide(
                    id = 4,
                    title = "Example: 0.5 ÷ 0.1",
                    problem = "Let us divide 0.5 by 0.1",
                    steps = listOf(
                        "Division by 0.1 is the same as multiplying by 10",
                        "Method 1: Move decimal 1 place to the RIGHT \n 0.5 ÷ 0.1 \n Move both decimals 1 place right: \n 0.5 → 5 and 0.1 → 1 \n Now divide: 5 ÷ 1 = 5",
                        "Method 2: Think of it as multiplication \n 0.5 ÷ 0.1 = 0.5 × 10 = 5",
                        "Both methods give us the same answer!"
                    ),
                    answer = "5"
                ),

                Slide.ExampleSlide(
                    id = 5,
                    title = "Example: 0.5 ÷ 0.01",
                    problem = "Let us divide 0.5 by 0.01",
                    steps = listOf(
                        "Division by 0.01 is the same as multiplying by 100",
                        "Method 1: Move decimal 2 places to the RIGHT \n 0.5 ÷ 0.01 \n Move both decimals 2 places right: \n 0.5 → 0.50 → 50 and 0.01 → 1 \n Now divide: 50 ÷ 1 = 50",
                        "Method 2: Think of it as multiplication \n 0.5 ÷ 0.01 = 0.5 × 100 = 50",
                        "Notice: We added a zero to move 2 places!"
                    ),
                    answer = "50"
                ),

                Slide.ExampleSlide(
                    id = 6,
                    title = "Example: 0.5 ÷ 0.001",
                    problem = "Let us divide 0.5 by 0.001",
                    steps = listOf(
                        "Division by 0.001 is the same as multiplying by 1,000",
                        "Method 1: Move decimal 3 places to the RIGHT \n 0.5 ÷ 0.001 \n Move both decimals 3 places right: \n 0.5 → 0.500 → 500 and 0.001 → 1 \n Now divide: 500 ÷ 1 = 500",
                        "Method 2: Think of it as multiplication \n 0.5 ÷ 0.001 = 0.5 × 1,000 = 500",
                        "Notice: We added two zeros to move 3 places!"
                    ),
                    answer = "500"
                ),

                Slide.ConceptSlide(
                    id = 7,
                    title = "Mental Division by 10, 100, 1,000",
                    content = "How do we mentally divide decimals by 10, 100, or 1,000? To what direction do we move the decimal point?",
                    keyPoints = listOf(
                        "When dividing by 10: \n → Move the decimal 1 place to the LEFT",
                        "Example: 45.6 ÷ 10 = 4.56",
                        "When dividing by 100: \n → Move the decimal 2 places to the LEFT",
                        "Example: 45.6 ÷ 100 = 0.456",
                        "When dividing by 1,000: \n → Move the decimal 3 places to the LEFT",
                        "Example: 45.6 ÷ 1,000 = 0.0456"
                    )
                ),

                Slide.PracticeSlide(
                    id = 8,
                    question = "Practice time! Solve: 0.4235 ÷ 10",
                    options = listOf("0.004235", "0.0004235", "0.04235", "4.235"),
                    correctAnswer = 2,
                    explanation = "Correct! When dividing by 10, move the decimal 1 place to the LEFT: 0.4235 → 0.04235"
                ),

                Slide.ConceptSlide(
                    id = 9,
                    title = "Quick Reference Guide",
                    content = "Here's a handy summary of decimal point movement:",
                    keyPoints = listOf(
                        "Dividing by Powers of 10 (Move LEFT ←): \n 10 → move 1 place left \n 100 → move 2 places left \n 1,000 → move 3 places left",
                        "Dividing by Decimal Powers (Move RIGHT →): \n 0.1 = 10 → move 1 place right \n 0.01 = 100 → move 2 places right \n 0.001 = 1,000 → move 3 places right"
                    )
                ),

                Slide.ExampleSlide(
                    id = 10,
                    title = "More Examples: Dividing by 10",
                    problem = "Practice with different numbers:",
                    steps = listOf(
                        "Example 1: 8.6 ÷ 10 \n Move decimal 1 place LEFT \n 8.6 → 0.86",
                        "Example 2: 123.45 ÷ 10 \n Move decimal 1 place LEFT \n 123.45 → 12.345",
                        "Example 3: 7 ÷ 10 \n Move decimal 1 place LEFT \n 7.0 → 0.7"
                    ),
                    answer = "0.86, 12.345, and 0.7"
                ),

                Slide.ExampleSlide(
                    id = 11,
                    title = "More Examples: Dividing by 100",
                    problem = "Practice with dividing by 100:",
                    steps = listOf(
                        "Example 1: 8.6 ÷ 100 \n Move decimal 2 places LEFT \n 8.6 → 0.086",
                        "Example 2: 123.45 ÷ 100 \n Move decimal 2 places LEFT \n 123.45 → 1.2345",
                        "Example 3: 50 ÷ 100 \n Move decimal 2 places LEFT \n 50.0 → 0.50 = 0.5"
                    ),
                    answer = "0.086, 1.2345, and 0.5"
                ),

                Slide.ExampleSlide(
                    id = 12,
                    title = "More Examples: Dividing by 0.1",
                    problem = "Practice with dividing by 0.1:",
                    steps = listOf(
                        "Remember: 0.1 = 10",
                        "Example 1: 3.5 ÷ 0.1 \n Move decimal 1 place RIGHT \n 3.5 → 35",
                        "Example 2: 0.08 ÷ 0.1 \n Move decimal 1 place RIGHT \n 0.08 → 0.8",
                        "Example 3: 12.34 ÷ 0.1 \n Move decimal 1 place RIGHT \n 12.34 → 123.4"
                    ),
                    answer = "35, 0.8, and 123.4"
                ),

                Slide.PracticeSlide(
                    id = 13,
                    question = "What is 5.67 ÷ 100 = ?",
                    options = listOf("0.567", "0.0567", "56.7", "567"),
                    correctAnswer = 1,
                    explanation = "Correct! When dividing by 100, move the decimal 2 places to the LEFT: 5.67 → 0.0567"
                ),

                Slide.PracticeSlide(
                    id = 14,
                    question = "What is 0.25 ÷ 0.01 = ?",
                    options = listOf("2.5", "0.025", "25", "250"),
                    correctAnswer = 2,
                    explanation = "Correct! Dividing by 0.01 is the same as multiplying by 100. Move decimal 2 places RIGHT: 0.25 → 25"
                ),

                Slide.ConceptSlide(
                    id = 15,
                    title = "Why Does This Work?",
                    content = "Understanding the pattern:",
                    keyPoints = listOf(
                        "Dividing by 10 makes numbers smaller → move LEFT",
                        "Dividing by 0.1 (which is 1/10) makes numbers bigger → move RIGHT",
                        "Think about it: \n • 10 ÷ 10 = 1 (smaller) \n • 10 ÷ 0.1 = 100 (bigger)",
                        "The pattern is consistent and makes mental math easy!"
                    )
                ),

                Slide.PracticeSlide(
                    id = 16,
                    question = "What is 45.8 ÷ 1,000 = ?",
                    options = listOf("0.458", "0.0458", "4.58", "458"),
                    correctAnswer = 1,
                    explanation = "Correct! When dividing by 1,000, move the decimal 3 places to the LEFT: 45.8 → 0.0458"
                ),

                Slide.ConceptSlide(
                    id = 17,
                    title = "Tips for Success",
                    content = "Master mental division with these strategies:",
                    keyPoints = listOf(
                        "Count the zeros to know how many places to move",
                        "10 has 1 zero → move 1 place",
                        "100 has 2 zeros → move 2 places",
                        "1,000 has 3 zeros → move 3 places",
                        "Remember the direction: \n ÷ by whole numbers (10, 100, 1000) → LEFT ← \n ÷ by decimals (0.1, 0.01, 0.001) → RIGHT →",
                        "Add zeros if needed when moving decimal point!"
                    )
                ),

                Slide.SummarySlide(
                    id = 18,
                    title = "Summary: Key Points to Remember",
                    keyPoints = listOf(
                        "Dividing a decimal by 10 → move the decimal 1 place to the LEFT",
                        "Dividing by 100 → move the decimal 2 places to the LEFT",
                        "Dividing by 1,000 → move the decimal 3 places to the LEFT",
                        "Dividing by 0.1, 0.01, or 0.001 is the same as multiplying by 10, 100, or 1,000: \n ÷ 0.1 = × 10 → move decimal 1 place RIGHT \n ÷ 0.01 = × 100 → move decimal 2 places RIGHT \n ÷ 0.001 = × 1,000 → move decimal 3 places RIGHT",
                        "This method allows you to divide decimals mentally - no calculator needed!"
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
                    content = "In this topic, you will learn to identify rational and irrational numbers. You will understand how to identify the difference between these types of numbers."
                ),

                Slide.ConceptSlide(
                    id = 2,
                    title = "What is a Rational Number?",
                    content = "A rational number is one that can be written as a fraction or a decimal.",
                    keyPoints = listOf(
                        "Can be written as a fraction (a/b where b ≠ 0)",
                        "When written as a decimal, it either stops or repeats a pattern",
                        "Includes all integers (positive, negative, and zero)",
                        "Examples: \n −3, −2, −1, 0, 1, 2 \n 1.111..., 2.5, 3.333... \n ½ = 0.5 \n ⅓ = 0.333... \n ¾ = 0.75"
                    )
                ),

                Slide.ConceptSlide(
                    id = 3,
                    title = "What is an Irrational Number?",
                    content = "An irrational number is a number that, when written as a decimal, goes on forever without stopping or repeating.",
                    keyPoints = listOf(
                        "Cannot be written as a fraction",
                        "Cannot be expressed as a quotient of two integers",
                        "The decimal form does not terminate or repeat",
                        "Square roots of non-perfect squares are irrational",
                        "Examples: \n √2 = 1.41421356... \n √3 = 1.73205080... \n √5 = 2.23606797... \n π (pi) = 3.14159265... \n e = 2.71828182..."
                    )
                ),

                Slide.ConceptSlide(
                    id = 4,
                    title = "Key Differences",
                    content = "How to tell them apart:",
                    keyPoints = listOf(
                        "Rational Numbers: \n Can be written as fractions \n Decimals that end or repeat \n Examples: 0.5, 0.333..., 2, −4",
                        "Irrational Numbers: \n Cannot be written as fractions \n Decimals go on forever without pattern \n Examples: √2, √3, π, √5"
                    )
                ),

                Slide.ExampleSlide(
                    id = 5,
                    title = "Example: Identifying Rational Numbers",
                    problem = "Which of these are rational numbers?",
                    steps = listOf(
                        "Number 1: 5 \n Can be written as ⁵⁄₁ → RATIONAL",
                        "Number 2: 0.75 \n Decimal terminates → Can write as ¾ → RATIONAL",
                        "Number 3: 0.666... \n Repeats forever → Can write as ⅔ → RATIONAL",
                        "Number 4: −8 \n Integer → Can write as −⁸⁄₁ → RATIONAL"
                    ),
                    answer = "All of these are rational numbers!"
                ),

                Slide.ExampleSlide(
                    id = 6,
                    title = "Example: Identifying Irrational Numbers",
                    problem = "Which of these are irrational numbers?",
                    steps = listOf(
                        "Number 1: √4 \n √4 = 2 (perfect square) → RATIONAL",
                        "Number 2: √7 \n Not a perfect square → Goes on forever \n 2.6457513... → IRRATIONAL",
                        "Number 3: π \n 3.14159265... (never ends or repeats) \n → IRRATIONAL",
                        "Number 4: √9 \n √9 = 3 (perfect square) → RATIONAL"
                    ),
                    answer = "√7 and π are irrational numbers"
                ),

                Slide.PracticeSlide(
                    id = 7,
                    question = "Practice time! Identify if the given is Rational or Irrational: 5.254",
                    options = listOf("Rational", "Irrational"),
                    correctAnswer = 0,
                    explanation = "Correct! 5.254 is a terminating decimal that can be written as a fraction ⁵²⁵⁴⁄₁₀₀₀, so it is RATIONAL."
                ),

                Slide.PracticeSlide(
                    id = 8,
                    question = "Is √16 rational or irrational?",
                    options = listOf("Rational", "Irrational"),
                    correctAnswer = 0,
                    explanation = "Correct! √16 = 4, which is a whole number. All whole numbers are rational because they can be written as fractions (⁴⁄₁)."
                ),

                Slide.PracticeSlide(
                    id = 9,
                    question = "Is √10 rational or irrational?",
                    options = listOf("Rational", "Irrational"),
                    correctAnswer = 1,
                    explanation = "Correct! √10 = 3.16227766... The decimal goes on forever without repeating, and 10 is not a perfect square, so √10 is IRRATIONAL."
                ),

                Slide.ConceptSlide(
                    id = 10,
                    title = "Perfect Squares vs Non-Perfect Squares",
                    content = "This helps identify irrational numbers:",
                    keyPoints = listOf(
                        "Perfect Squares (Rational): \n √1 = 1, √4 = 2, √9 = 3 \n √16 = 4, √25 = 5, √36 = 6 \n √49 = 7, √64 = 8, √81 = 9 \n √100 = 10",
                        "Non-Perfect Squares (Irrational): \n √2, √3, √5, √6, √7, √8 \n √10, √11, √12, √13, √14, √15 \n And so on..."
                    )
                ),

                Slide.PracticeSlide(
                    id = 11,
                    question = "Which of these is irrational?",
                    options = listOf("0.25", "√49", "√11", "⅗"),
                    correctAnswer = 2,
                    explanation = "Correct! √11 is irrational because 11 is not a perfect square. The others are rational: 0.25 = ¼, √49 = 7, and ⅗ is already a fraction."
                ),

                Slide.SummarySlide(
                    id = 12,
                    title = "Summary: Key Points to Remember",
                    keyPoints = listOf(
                        "Rational Numbers: \n • Can be written as fractions (a/b) \n • Decimals that terminate or repeat \n • Include all integers and fractions \n • Examples: 5, 0.75, 0.333..., −2, ½",
                        "Irrational Numbers: \n • Cannot be written as fractions \n • Decimals that never end and never repeat \n • Include square roots of non-perfect squares \n • Examples: √2, √3, √5, π, √10",
                        "Quick Test: If it's a square root, check if it's a perfect square!"
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
                    content = "In this topic, you will learn how to identify terminating decimals and repeating (non-terminating) decimals. You will understand the difference between the two types."
                ),

                Slide.ConceptSlide(
                    id = 2,
                    title = "What is a Terminating Decimal?",
                    content = "\"Terminate\" means to end or stop. A terminating decimal has a set number of digits and ends after the decimal point.",
                    keyPoints = listOf(
                        "Has a finite number of digits",
                        "Ends after the decimal point",
                        "Is a type of rational number",
                        "To check: Divide numerator by denominator",
                        "If there's no remainder, it terminates",
                        "Examples: \n 0.87 (2 decimal places) \n 82.25 (2 decimal places) \n 9.527 (3 decimal places) \n 224.9803 (4 decimal places)"
                    )
                ),

                Slide.ConceptSlide(
                    id = 3,
                    title = "What is a Repeating Decimal?",
                    content = "A repeating (non-terminating) decimal has infinite digits that go on forever, with some digits repeating.",
                    keyPoints = listOf(
                        "Has infinite digits that never end",
                        "Some digits start repeating in a pattern",
                        "To check: Divide numerator by denominator",
                        "If the remainder repeats, the decimal repeats",
                        "Can also be written as a fraction",
                        "Examples: \n 0.333... (3 repeats) \n 0.00111... (1 repeats) \n 1.234234... (234 repeats) \n 0.666... (6 repeats) \n 2.181818... (18 repeats)"
                    )
                ),

                Slide.ConceptSlide(
                    id = 4,
                    title = "Understanding Vinculum",
                    content = "A vinculum is a horizontal line placed over digits to show they repeat indefinitely.",
                    keyPoints = listOf(
                        "Vinculum = horizontal line over repeating digits",
                        "Shows which digits repeat forever",
                        "Examples with Vinculum: \n 0.333... → 0.3̅ (3 repeats) \n 0.666... → 0.6̅ (6 repeats) \n 1.234234... → 1.2̅3̅4̅ (234 repeats) \n 0.181818... → 0.1̅8̅ (18 repeats) \n 2.7777... → 2.7̅ (7 repeats)",
                        "The line shows which part repeats!"
                    )
                ),

                Slide.ExampleSlide(
                    id = 5,
                    title = "Example: Identifying Terminating Decimals",
                    problem = "Which of these are terminating decimals?",
                    steps = listOf(
                        "Decimal 1: 0.5 \n Has 1 digit, then stops → TERMINATING",
                        "Decimal 2: 3.75 \n Has 2 digits, then stops → TERMINATING",
                        "Decimal 3: 12.125 \n Has 3 digits, then stops → TERMINATING",
                        "Decimal 4: 0.875 \n Has 3 digits, then stops → TERMINATING"
                    ),
                    answer = "All of these are terminating decimals!"
                ),

                Slide.ExampleSlide(
                    id = 6,
                    title = "Example: Identifying Repeating Decimals",
                    problem = "Which of these are repeating decimals?",
                    steps = listOf(
                        "Decimal 1: 0.333... \n 3 repeats forever → REPEATING \n Can write as 0.3̅",
                        "Decimal 2: 0.454545... \n 45 repeats forever → REPEATING \n Can write as 0.4̅5̅",
                        "Decimal 3: 1.666... \n 6 repeats forever → REPEATING \n Can write as 1.6̅",
                        "Decimal 4: 2.121212... \n 12 repeats forever → REPEATING \n Can write as 2.1̅2̅"
                    ),
                    answer = "All of these are repeating decimals!"
                ),

                Slide.ExampleSlide(
                    id = 7,
                    title = "Example: Converting Fractions",
                    problem = "Let's see how fractions become decimals:",
                    steps = listOf(
                        "Fraction 1: ½ \n 1 ÷ 2 = 0.5 \n Stops after 1 digit → TERMINATING",
                        "Fraction 2: ¼ \n 1 ÷ 4 = 0.25 \n Stops after 2 digits → TERMINATING",
                        "Fraction 3: ⅓ \n 1 ÷ 3 = 0.333... \n 3 repeats forever → REPEATING (0.3̅)",
                        "Fraction 4: ⅔ \n 2 ÷ 3 = 0.666... \n 6 repeats forever → REPEATING (0.6̅)"
                    ),
                    answer = "½ and ¼ are terminating; ⅓ and ⅔ are repeating"
                ),

                Slide.PracticeSlide(
                    id = 8,
                    question = "Practice time! Identify if the decimal is terminating or repeating: 2.125",
                    options = listOf("Terminating", "Repeating (Non-terminating)"),
                    correctAnswer = 0,
                    explanation = "Correct! 2.125 has exactly 3 decimal places and then stops, making it a TERMINATING decimal."
                ),

                Slide.PracticeSlide(
                    id = 9,
                    question = "What type of decimal is 0.777... ?",
                    options = listOf("Terminating", "Repeating (Non-terminating)"),
                    correctAnswer = 1,
                    explanation = "Correct! 0.777... has the digit 7 repeating forever, making it a REPEATING decimal. We can write it as 0.7̅"
                ),

                Slide.PracticeSlide(
                    id = 10,
                    question = "What type of decimal is 5.8?",
                    options = listOf("Terminating", "Repeating (Non-terminating)"),
                    correctAnswer = 0,
                    explanation = "Correct! 5.8 has only 1 decimal place and then stops, making it a TERMINATING decimal."
                ),

                Slide.ConceptSlide(
                    id = 11,
                    title = "How to Write Repeating Decimals",
                    content = "Different ways to show repeating decimals:",
                    keyPoints = listOf(
                        "Method 1: Use three dots (ellipsis) \n 0.333... , 1.454545...",
                        "Method 2: Use vinculum (bar notation) \n 0.3̅ , 1.4̅5̅",
                        "Method 3: Write the pattern in parentheses \n 0.(3) , 1.(45)",
                        "All three methods mean the same thing!",
                        "The vinculum is the most common notation."
                    )
                ),

                Slide.ExampleSlide(
                    id = 12,
                    title = "Example: More Fraction Conversions",
                    problem = "Convert these fractions and identify the type:",
                    steps = listOf(
                        "⅛ = 1 ÷ 8 = 0.125 \n → TERMINATING",
                        "⅕ = 1 ÷ 5 = 0.2 \n → TERMINATING",
                        "⅑ = 1 ÷ 9 = 0.111... \n → REPEATING (0.1̅)",
                        "⅐ = 1 ÷ 7 = 0.142857142857... \n → REPEATING (0.1̅4̅2̅8̅5̅7̅)",
                        "³⁄₁₁ = 3 ÷ 11 = 0.272727... \n → REPEATING (0.2̅7̅)"
                    ),
                    answer = "⅛ and ⅕ terminate; ⅑, ⅐, and ³⁄₁₁ repeat"
                ),

                Slide.PracticeSlide(
                    id = 13,
                    question = "How would you write 0.454545... using vinculum?",
                    options = listOf("0.4̅5̅", "0.4̅", "0.45", "0.4545̅"),
                    correctAnswer = 0,
                    explanation = "Correct! Both digits 4 and 5 repeat together, so we put the bar over both: 0.4̅5̅"
                ),

                Slide.ConceptSlide(
                    id = 14,
                    title = "Quick Identification Tips",
                    content = "How to quickly identify the type:",
                    keyPoints = listOf(
                        "Terminating Decimals: \n Count the digits - they're finite \n No ... (ellipsis) or bar notation \n Examples: 0.5, 2.75, 3.125",
                        "Repeating Decimals: \n Look for ... (ellipsis) \n Look for bar (vinculum) over digits \n Look for pattern that repeats \n Examples: 0.333..., 0.3̅, 1.4̅5̅",
                        "Both types are RATIONAL numbers!"
                    )
                ),

                Slide.PracticeSlide(
                    id = 15,
                    question = "Which is a repeating decimal?",
                    options = listOf("3.75", "0.8̅", "12.5", "0.125"),
                    correctAnswer = 1,
                    explanation = "Correct! 0.8̅ has a bar over the 8, indicating it repeats: 0.888... The others are all terminating decimals."
                ),

                Slide.ConceptSlide(
                    id = 16,
                    title = "Real-World Connection",
                    content = "Where do we see these decimals?",
                    keyPoints = listOf(
                        "Terminating Decimals: \n • Money: ₱25.50, ₱100.75 \n • Measurements: 3.5 meters, 2.25 kg \n • Scores: 95.5%, 87.25 points",
                        "Repeating Decimals: \n • Fractions: ⅓ cup, ⅔ of a pizza \n • Divisions: Sharing equally among 3 or 6 people \n • Ratios: Converting fractions to decimals",
                        "Most real-world measurements use terminating decimals!"
                    )
                ),

                Slide.SummarySlide(
                    id = 17,
                    title = "Summary: Key Points to Remember",
                    keyPoints = listOf(
                        "Terminating Decimals: \n • End after a certain number of digits \n • Can be written as a fraction \n • Examples: 0.87, 82.25, 9.527",
                        "Repeating (Non-terminating) Decimals: \n • Go on forever with repeating pattern \n • Can also be written as a fraction \n • Examples: 0.333..., 0.3̅, 1.2̅3̅4̅",
                        "Vinculum: \n • A line over digits showing repetition \n • 0.333... = 0.3̅ \n • 0.454545... = 0.4̅5̅",
                        "Both types are RATIONAL numbers!"
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
                    title = "Welcome!",
                    content = "In this topic, you'll learn how to solve routine and non-routine word problems involving division of decimal numbers and money.\n\nLet's apply what we learned about decimal division to real-world situations!"
                ),

                Slide.ConceptSlide(
                    id = 2,
                    title = "Review: Types of Problems",
                    content = "Let's recall the difference between routine and non-routine problems:",
                    keyPoints = listOf(
                        "Routine Problems: \n • Clear and straightforward \n • Direct keywords indicate operations \n • Usually one or two steps \n • Follow familiar patterns",
                        "Non-routine Problems: \n • Require more analysis \n • May need multiple steps \n • Hidden operations or extra information \n • Need creative problem-solving"
                    )
                ),

                Slide.ConceptSlide(
                    id = 3,
                    title = "Division Keywords",
                    content = "Look for these keywords that indicate division:",
                    keyPoints = listOf(
                        "Quotient of",
                        "Divided by / Split",
                        "Shared equally / Distribute",
                        "Each / Per (for unit rates)",
                        "Average (divide total by count)",
                        "How many groups?",
                        "How much per...?",
                        "Money context: cost per item, sharing money, unit price"
                    )
                ),

                Slide.ConceptSlide(
                    id = 4,
                    title = "Common Problem Types",
                    content = "Types of division problems you'll encounter:",
                    keyPoints = listOf(
                        "Equal Sharing: \n Divide money/items equally among people",
                        "Finding Unit Rate: \n Cost per kilogram, per meter, per hour",
                        "Finding Quantity: \n How many items can you buy?",
                        "Comparison: \n How many times more/less?",
                        "Average: \n Total divided by number of items"
                    )
                ),

                Slide.ExampleSlide(
                    id = 5,
                    title = "Routine Problem 1: Equal Sharing",
                    problem = "Four friends earned ₱1,250.00 from selling lemonade. They decided to split the money equally. How much will each friend receive?",
                    steps = listOf(
                        "1. UNDERSTAND: \n Given: ₱1,250.00 total, 4 friends \n Asked: How much per friend?",
                        "2. PLAN: \n Keyword: 'split equally' → Division \n Number sentence: 1,250 ÷ 4 = N",
                        "3. SOLVE: \n 1,250 ÷ 4 = 312.50",
                        "4. CHECK: \n 312.50 × 4 = 1,250",
                        "Reasonable? Yes, about ₱300 each makes sense"
                    ),
                    answer = "Each friend receives ₱312.50"
                ),

                Slide.ExampleSlide(
                    id = 6,
                    title = "Routine Problem 2: Finding Unit Price",
                    problem = "A 2.5 kg bag of rice costs ₱137.50. What is the price per kilogram?",
                    steps = listOf(
                        "1. UNDERSTAND: \n Given: ₱137.50 for 2.5 kg \n Asked: Price per kg?",
                        "2. PLAN: \n Keyword: 'per' → Division \n Number sentence: 137.50 ÷ 2.5 = N",
                        "3. SOLVE: \n 137.50 ÷ 2.5 \n Make divisor whole: 1,375 ÷ 25 = 55",
                        "4. CHECK: \n 55 × 2.5 = 137.50",
                        "Reasonable? Yes, ₱55/kg is reasonable"
                    ),
                    answer = "The price is ₱55.00 per kilogram"
                ),

                Slide.PracticeSlide(
                    id = 7,
                    question = "A rope 15.6 meters long is cut into 6 equal pieces. How long is each piece?",
                    options = listOf("2.6 m", "2.5 m", "3.6 m", "2.4 m"),
                    correctAnswer = 0,
                    explanation = "Correct! 15.6 ÷ 6 = 2.6 meters per piece"
                ),

                Slide.ExampleSlide(
                    id = 8,
                    title = "Routine Problem 3: Finding Quantity",
                    problem = "Maria has ₱450.00. If each notebook costs ₱22.50, how many notebooks can she buy?",
                    steps = listOf(
                        "1. UNDERSTAND: \n Given: ₱450.00, notebooks cost ₱22.50 each \n Asked: How many notebooks?",
                        "2. PLAN: \n Keyword: 'how many' → Division \n Number sentence: 450 ÷ 22.50 = N",
                        "3. SOLVE: \n 450 ÷ 22.50 \n Make divisor whole: 45,000 ÷ 2,250 = 20",
                        "4. CHECK: \n 20 × 22.50 = 450",
                        "Reasonable? Yes, she can buy exactly 20 notebooks"
                    ),
                    answer = "Maria can buy 20 notebooks"
                ),

                Slide.ExampleSlide(
                    id = 9,
                    title = "Routine Problem 4: Average",
                    problem = "A student scored 88.5, 92.0, 85.5, and 90.0 on four tests. What is the average score?",
                    steps = listOf(
                        "1. UNDERSTAND: \n Given: Four scores (88.5, 92.0, 85.5, 90.0) \n Asked: Average score?",
                        "2. PLAN: \n Keyword: 'average' → Add all, then divide by count \n Number sentence: (88.5 + 92.0 + 85.5 + 90.0) ÷ 4 = N",
                        "3. SOLVE: \n Sum: 88.5 + 92.0 + 85.5 + 90.0 = 356.0 \n Average: 356.0 ÷ 4 = 89.0",
                        "4. CHECK: \n 89 × 4 = 356",
                        "Reasonable? Yes, close to all four scores"
                    ),
                    answer = "The average score is 89.0"
                ),

                Slide.PracticeSlide(
                    id = 10,
                    question = "A car travels 318.5 km using 22.5 liters of gasoline. How many km per liter?",
                    options = listOf("14.0 km/L", "14.2 km/L", "14.5 km/L", "15.0 km/L"),
                    correctAnswer = 1,
                    explanation = "Correct! 318.5 ÷ 22.5 = 14.155... ≈ 14.2 km per liter"
                ),

                Slide.ConceptSlide(
                    id = 11,
                    title = "Non-routine Problems",
                    content = "Non-routine problems require more thinking and may involve:",
                    keyPoints = listOf(
                        "Multiple operations (not just division)",
                        "Extra information to filter out",
                        "Hidden steps or indirect questions",
                        "Comparison or multi-step calculations",
                        "Real-world complexity",
                        "Strategy: Break complex problems into smaller steps!"
                    )
                ),

                Slide.ExampleSlide(
                    id = 12,
                    title = "Non-routine Problem 1: Multi-step",
                    problem = "A store bought 25 kg of apples for ₱3,750.00. After selling 18 kg at ₱180.00 per kg, how much profit did they make per kg sold?",
                    steps = listOf(
                        "1. UNDERSTAND: \n Bought: 25 kg for ₱3,750 \n Sold: 18 kg at ₱180/kg \n Asked: Profit per kg sold?",
                        "2. PLAN: \n Step 1: Find cost per kg bought \n Step 2: Find revenue from selling \n Step 3: Find profit \n Step 4: Find profit per kg",
                        "3. SOLVE: \n Cost per kg: 3,750 ÷ 25 = ₱150 \n Revenue: 18 × 180 = ₱3,240 \n Cost of 18 kg: 18 × 150 = ₱2,700 \n Profit: 3,240 - 2,700 = ₱540 \n Profit per kg: 540 ÷ 18 = ₱30",
                        "4. CHECK: \n Selling price - cost price = 180 - 150 = 30"
                    ),
                    answer = "Profit is ₱30.00 per kilogram sold"
                ),

                Slide.ExampleSlide(
                    id = 13,
                    title = "Non-routine Problem 2: Comparison",
                    problem = "Store A sells 3.5 kg of sugar for ₱245.00. Store B sells 2.8 kg for ₱190.40. Which store has the better price per kilogram?",
                    steps = listOf(
                        "1. UNDERSTAND: \n Store A: 3.5 kg for ₱245 \n Store B: 2.8 kg for ₱190.40 \n Asked: Which has better price/kg?",
                        "2. PLAN: \n Find price per kg for each store, then compare",
                        "3. SOLVE: \n Store A: 245 ÷ 3.5 = ₱70/kg \n Store B: 190.40 ÷ 2.8 = ₱68/kg \n Compare: ₱68 < ₱70",
                        "4. CHECK: \n Store A: 70 × 3.5 = 245 \n Store B: 68 × 2.8 = 190.40 \n Store B is cheaper"
                    ),
                    answer = "Store B has the better price at ₱68.00 per kg"
                ),

                Slide.PracticeSlide(
                    id = 14,
                    question = "Lisa bought 4.5 m of fabric for ₱562.50. She used 3.2 m to make a dress. What is the cost of the fabric she used?",
                    options = listOf("₱400.00", "₱395.00", "₱390.00", "₱385.00"),
                    correctAnswer = 0,
                    explanation = "Correct! First find price per meter: 562.50 ÷ 4.5 = ₱125/m. Then: 125 × 3.2 = ₱400.00"
                ),

                Slide.ExampleSlide(
                    id = 15,
                    title = "Non-routine Problem 3: Extra Information",
                    problem = "A baker made 150 cupcakes in 5 hours. He sold them for ₱25.00 each and earned ₱3,750.00. How many cupcakes did he make per hour?",
                    steps = listOf(
                        "1. UNDERSTAND: \n Made: 150 cupcakes in 5 hours \n Price: ₱25 each (extra info!) \n Earned: ₱3,750 (extra info!) \n Asked: Cupcakes per hour?",
                        "2. PLAN: \n Ignore price and earnings - not needed \n Number sentence: 150 ÷ 5 = N",
                        "3. SOLVE: \n 150 ÷ 5 = 30",
                        "4. CHECK: \n 30 × 5 = 150",
                        "Note: We verified earnings → 150 × 25 = 3,750 ✓"
                    ),
                    answer = "He made 30 cupcakes per hour"
                ),

                Slide.ExampleSlide(
                    id = 16,
                    title = "Non-routine Problem 4: Working Backwards",
                    problem = "After dividing her money equally among her 3 children, each child received ₱425.50. She had already spent ₱150.00 on groceries. How much money did she have originally?",
                    steps = listOf(
                        "1. UNDERSTAND: \n Each child got: ₱425.50 (3 children) \n Spent before dividing: ₱150 \n Asked: Original amount?",
                        "2. PLAN: \n Work backwards: \n Step 1: Find total given to children \n Step 2: Add back what was spent",
                        "3. SOLVE: \n Given to children: 425.50 × 3 = ₱1,276.50 \n Original amount: 1,276.50 + 150 = ₱1,426.50",
                        "4. CHECK: \n 1,426.50 - 150 = 1,276.50 \n 1,276.50 ÷ 3 = 425.50"
                    ),
                    answer = "She had ₱1,426.50 originally"
                ),

                Slide.PracticeSlide(
                    id = 17,
                    question = "A 12.5 liter container is filled with juice. After pouring equal amounts into 5 bottles, 2.5 liters remain. How much is in each bottle?",
                    options = listOf("2.0 L", "2.5 L", "2.4 L", "1.5 L"),
                    correctAnswer = 0,
                    explanation = "Correct! Amount in bottles: 12.5 - 2.5 = 10 liters. Per bottle: 10 ÷ 5 = 2.0 liters"
                ),

                Slide.ExampleSlide(
                    id = 18,
                    title = "Non-routine Problem 5: Real-World Application",
                    problem = "A family's monthly electricity bill is ₱4,567.80 for 318.5 kWh. They want to reduce consumption by 25%. If the rate per kWh stays the same, what will the new bill be?",
                    steps = listOf(
                        "1. UNDERSTAND: \n Current: ₱4,567.80 for 318.5 kWh \n Reduce: 25% less consumption \n Asked: New bill?",
                        "2. PLAN: \n Step 1: Find rate per kWh \n Step 2: Find 25% reduction in kWh \n Step 3: Calculate new consumption \n Step 4: Calculate new bill",
                        "3. SOLVE: \n Rate: 4,567.80 ÷ 318.5 = ₱14.34/kWh \n 25% of 318.5 = 318.5 × 0.25 = 79.625 kWh \n New consumption: 318.5 - 79.625 = 238.875 kWh \n New bill: 238.875 × 14.34 = ₱3,425.85",
                        "4. CHECK: \n 75% of original = 4,567.80 × 0.75 = ₱3,425.85"
                    ),
                    answer = "The new bill will be ₱3,425.85"
                ),

                Slide.ConceptSlide(
                    id = 19,
                    title = "Tips for Division Word Problems",
                    content = "Strategies for success:",
                    keyPoints = listOf(
                        "Identify division keywords carefully",
                        "Determine what's given and what's asked",
                        "Ignore extra information not needed",
                        "Break complex problems into smaller steps",
                        "Check units (pesos, kg, meters, liters)",
                        "Use multiplication to verify division",
                        "Estimate to check reasonableness",
                        "Draw diagrams if helpful",
                        "For money: always include two decimal places"
                    )
                ),

                Slide.PracticeSlide(
                    id = 20,
                    question = "A restaurant bill of ₱1,845.60 is split equally among 8 people. How much does each person pay?",
                    options = listOf("₱230.70", "₱230.60", "₱230.80", "₱231.00"),
                    correctAnswer = 0,
                    explanation = "Correct! 1,845.60 ÷ 8 = ₱230.70 per person"
                ),

                Slide.SummarySlide(
                    id = 21,
                    title = "Summary",
                    keyPoints = listOf(
                        "Routine Problems: \n • Clear division keywords (quotient, split, per, each) \n • Direct and straightforward \n • Usually one or two steps",
                        "Non-routine Problems: \n • Require multiple operations \n • May have extra information to filter \n • Need careful analysis and planning",
                        "Problem-Solving Keys: \n • Use the 4-step method (Understand, Plan, Solve, Check) \n • Look for division keywords \n • Break complex problems into smaller steps \n • Always verify your answer makes sense \n • For money, use two decimal places"
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
                    title = "Welcome!",
                    content = "In this topic, you'll master a systematic, step-by-step approach to solving any math word problem.\n\nThis proven method will help you tackle problems with confidence and accuracy!"
                ),

                Slide.ConceptSlide(
                    id = 2,
                    title = "Why a Step-by-Step Approach?",
                    content = "Following a systematic procedure helps you:",
                    keyPoints = listOf(
                        "Organize your thinking",
                        "Avoid missing important information",
                        "Reduce careless errors",
                        "Build problem-solving confidence",
                        "Work efficiently",
                        "Check your work systematically",
                        "Let's learn the proven 4-step method!"
                    )
                ),

                Slide.ConceptSlide(
                    id = 3,
                    title = "The 4-Step Problem-Solving Method",
                    content = "This method works for ANY word problem:",
                    keyPoints = listOf(
                        "Step 1: UNDERSTAND the Problem \n → Know what you're dealing with",
                        "Step 2: PLAN the Solution \n → Decide how to solve it",
                        "Step 3: SOLVE the Problem \n → Carry out your plan",
                        "Step 4: CHECK your Answer \n → Verify it's correct",
                        "Remember: UPSC (Understand, Plan, Solve, Check)"
                    )
                ),

                Slide.ConceptSlide(
                    id = 4,
                    title = "Step 1: UNDERSTAND the Problem",
                    content = "Before solving, you must fully understand what the problem is asking:",
                    keyPoints = listOf(
                        "Actions to take: \n • Read the problem carefully (at least twice!) \n • Identify what is GIVEN (facts, numbers) \n • Identify what is ASKED (the question) \n • Highlight or underline key information \n • Circle important numbers and their units \n • Cross out extra information not needed \n • Restate the problem in your own words",
                        "Ask: What do I know? What do I need to find?"
                    )
                ),

                Slide.ExampleSlide(
                    id = 5,
                    title = "Example: Understanding Phase",
                    problem = "A store bought 8 boxes of apples. Each box contains 24.5 kg and costs ₱1,225.00. The store sold all apples at ₱65.00 per kg. How much profit did the store make per box?",
                    steps = listOf(
                        "Let's UNDERSTAND:",
                        "GIVEN information: \n • 8 boxes of apples \n • Each box: 24.5 kg \n • Cost per box: ₱1,225.00 \n • Selling price: ₱65.00 per kg",
                        "ASKED to find: \n • Profit per box?",
                        "In my own words: \n The store bought apples in boxes and sold them by weight. \n I need to find how much profit they made on each box.",
                        "Units involved: boxes, kg, pesos"
                    ),
                    answer = "We understand the problem - ready to plan!"
                ),

                Slide.ConceptSlide(
                    id = 6,
                    title = "Step 2: PLAN the Solution",
                    content = "Decide HOW you will solve the problem:",
                    keyPoints = listOf(
                        "Actions to take: \n • What operation(s) are needed? (Addition, Subtraction, Multiplication, Division) \n • Look for operation keywords \n • Write number sentences or equations \n • Decide the order of operations \n • Identify if multiple steps are needed \n • Think about what makes sense",
                        "Ask: What steps will lead me to the answer?"
                    )
                ),

                Slide.ConceptSlide(
                    id = 7,
                    title = "Operation Keywords Reference",
                    content = "Keywords help identify which operations to use:",
                    keyPoints = listOf(
                        "Addition: sum, total, combined, altogether, increase",
                        "Subtraction: difference, less, remaining, decrease, left",
                        "Multiplication: product, times, of, per (for totals)",
                        "Division: quotient, split, shared, per (for rates), average",
                        "Remember: Some problems need multiple operations!"
                    )
                ),

                Slide.ExampleSlide(
                    id = 8,
                    title = "Example: Planning Phase",
                    problem = "A store bought 8 boxes of apples. Each box contains 24.5 kg and costs ₱1,225.00. The store sold all apples at ₱65.00 per kg. How much profit did the store make per box?",
                    steps = listOf(
                        "Let's PLAN:",
                        "To find profit per box, I need:",
                        "Step 1: Find revenue per box \n → Multiply: 24.5 kg × ₱65/kg",
                        "Step 2: Find profit per box \n → Subtract: Revenue - Cost \n → Revenue per box - ₱1,225",
                        "Number sentences: \n Revenue per box = 24.5 × 65 \n Profit per box = Revenue - 1,225",
                        "Operations needed: Multiplication, then Subtraction"
                    ),
                    answer = "Our plan is clear - let's solve!"
                ),

                Slide.ConceptSlide(
                    id = 9,
                    title = "Step 3: SOLVE the Problem",
                    content = "Now carry out your plan carefully:",
                    keyPoints = listOf(
                        "Actions to take: \n • Follow your plan step by step \n • Show all your work clearly \n • Write down each calculation \n • Keep track of units throughout \n • Do one operation at a time \n • Label intermediate results \n • Be neat and organized",
                        "Ask: Am I following my plan correctly?"
                    )
                ),

                Slide.ExampleSlide(
                    id = 10,
                    title = "Example: Solving Phase",
                    problem = "A store bought 8 boxes of apples. Each box contains 24.5 kg and costs ₱1,225.00. The store sold all apples at ₱65.00 per kg. How much profit did the store make per box?",
                    steps = listOf(
                        "Let's SOLVE following our plan:",
                        "Step 1: Find revenue per box \n Revenue = 24.5 kg × ₱65/kg \n Revenue = ₱1,592.50 per box",
                        "Step 2: Find profit per box \n Profit = Revenue - Cost \n Profit = ₱1,592.50 - ₱1,225.00 \n Profit = ₱367.50 per box",
                        "Final Answer: The store made ₱367.50 profit per box"
                    ),
                    answer = "₱367.50 profit per box"
                ),

                Slide.ConceptSlide(
                    id = 11,
                    title = "Step 4: CHECK your Answer",
                    content = "Always verify your solution is correct:",
                    keyPoints = listOf(
                        "Actions to take: \n • Does your answer make sense? \n • Is it reasonable for the context? \n • Work backwards to verify \n • Use inverse operations \n • Estimate to check reasonableness \n • Did you answer what was asked? \n • Are units correct? \n • Check your calculations",
                        "Ask: Is this answer logical and correct?"
                    )
                ),

                Slide.ExampleSlide(
                    id = 12,
                    title = "Example: Checking Phase",
                    problem = "A store bought 8 boxes of apples. Each box contains 24.5 kg and costs ₱1,225.00. The store sold all apples at ₱65.00 per kg. How much profit did the store make per box?",
                    steps = listOf(
                        "Let's CHECK our answer: ₱367.50",
                        "Method 1 - Work backwards: \n Cost + Profit = Revenue \n 1,225 + 367.50 = 1,592.50",
                        "Method 2 - Verify revenue: \n 24.5 × 65 = 1,592.50",
                        "Method 3 - Reasonableness: \n Selling price (₱65) > Cost per kg (1,225÷24.5 = ₱50) \n Profit makes sense: ₱15/kg × 24.5kg = ₱367.50",
                        "Method 4 - Question check: \n Asked for profit per box? Yes, answered correctly",
                        "All checks pass - answer is correct!"
                    ),
                    answer = "Verified: ₱367.50 is correct!"
                ),

                Slide.ConceptSlide(
                    id = 13,
                    title = "Verification Methods",
                    content = "Different ways to check your answer:",
                    keyPoints = listOf(
                        "1. Work Backwards: \n Use inverse operations to get back to given values",
                        "2. Estimate: \n Round numbers and see if answer is close",
                        "3. Alternative Method: \n Solve using a different approach",
                        "4. Reasonableness: \n Does the answer make sense in real life?",
                        "5. Unit Check: \n Are the units correct for what was asked?"
                    )
                ),

                Slide.PracticeSlide(
                    id = 14,
                    question = "Which step involves deciding what operations to use and writing number sentences?",
                    options = listOf("Understand", "Plan", "Solve", "Check"),
                    correctAnswer = 1,
                    explanation = "Correct! The PLAN step is where you decide what operations to use and write your number sentences."
                ),

                Slide.ExampleSlide(
                    id = 15,
                    title = "Complete Example 2: All 4 Steps",
                    problem = "A family of 5 people dined at a restaurant. The bill came to ₱2,847.50 including a 12% service charge. What was the original bill before the service charge? How much is the cost per person based on the original bill?",
                    steps = listOf(
                        "1. UNDERSTAND: \n Given: Total ₱2,847.50 (includes 12% charge), 5 people \n Asked: Original bill? Cost per person?",
                        "2. PLAN: \n Total = Original + 12% of Original \n Total = Original × 1.12 \n So: Original = Total ÷ 1.12 \n Then: Per person = Original ÷ 5",
                        "3. SOLVE: \n Original = 2,847.50 ÷ 1.12 = ₱2,542.41 \n Per person = 2,542.41 ÷ 5 = ₱508.48",
                        "4. CHECK: \n 2,542.41 × 1.12 = 2,847.50 \n 508.48 × 5 = 2,542.40 ≈ 2,542.41"
                    ),
                    answer = "Original bill: ₱2,542.41; Per person: ₱508.48"
                ),

                Slide.ExampleSlide(
                    id = 16,
                    title = "Complete Example 3: Multi-Step Problem",
                    problem = "A farmer harvested 245.5 kg of mangoes and 186.8 kg of guavas. He sold the mangoes at ₱85.00 per kg and guavas at ₱65.00 per kg. After selling all fruits, he spent ₱5,240.00 on fertilizer. How much money does he have left?",
                    steps = listOf(
                        "1. UNDERSTAND: \n Harvested: 245.5 kg mangoes, 186.8 kg guavas \n Prices: ₱85/kg mangoes, ₱65/kg guavas \n Spent: ₱5,240 on fertilizer \n Asked: Money left?",
                        "2. PLAN: \n Step 1: Revenue from mangoes \n Step 2: Revenue from guavas \n Step 3: Total revenue \n Step 4: Subtract expenses",
                        "3. SOLVE: \n Mangoes: 245.5 × 85 = ₱20,867.50 \n Guavas: 186.8 × 65 = ₱12,142.00 \n Total revenue: 20,867.50 + 12,142.00 = ₱33,009.50 \n Money left: 33,009.50 - 5,240.00 = ₱27,769.50",
                        "4. CHECK: \n 27,769.50 + 5,240 = 33,009.50"
                    ),
                    answer = "The farmer has ₱27,769.50 left"
                ),

                Slide.PracticeSlide(
                    id = 17,
                    question = "In which step do you verify if your answer makes sense and is correct?",
                    options = listOf("Understand", "Plan", "Solve", "Check"),
                    correctAnswer = 3,
                    explanation = "Correct! The CHECK step is where you verify your answer through various methods like working backwards, estimating, and checking reasonableness."
                ),

                Slide.ConceptSlide(
                    id = 18,
                    title = "Common Mistakes to Avoid",
                    content = "Watch out for these frequent errors:",
                    keyPoints = listOf(
                        "❌ Rushing without understanding",
                        "❌ Skipping the planning step",
                        "❌ Using all numbers without thinking",
                        "❌ Not identifying what's being asked",
                        "❌ Forgetting to check work",
                        "❌ Ignoring units",
                        "❌ Careless calculation errors",
                        "Follow all 4 steps systematically",
                        "Take your time to understand",
                        "Always check your answer"
                    )
                ),

                Slide.ConceptSlide(
                    id = 19,
                    title = "Tips for Each Step",
                    content = "Maximize your success:",
                    keyPoints = listOf(
                        "UNDERSTAND: \n • Read twice, highlight key info, circle numbers",
                        "PLAN: \n • Write clear number sentences, identify operations",
                        "SOLVE: \n • Show all work, be neat, check each calculation",
                        "CHECK: \n • Use multiple verification methods",
                        "Overall: Stay organized and patient!"
                    )
                ),

                Slide.PracticeSlide(
                    id = 18,
                    question = "A bakery made 180 cupcakes in 6 hours. They sold each for ₱35.00 and earned ₱6,300. How many cupcakes per hour were made?",
                    options = listOf("25", "30", "35", "40"),
                    correctAnswer = 1,
                    explanation = "Correct! Price and earnings are extra info. Just divide: 180 ÷ 6 = 30 cupcakes per hour. (Check: earnings verify all sold → 180 × 35 = 6,300 ✓)"
                ),

                Slide.ConceptSlide(
                    id = 20,
                    title = "Problem-Solving Mindset",
                    content = "Develop these habits for success:",
                    keyPoints = listOf(
                        "Be patient - don't rush",
                        "Stay organized - write neatly",
                        "Be thorough - check each step",
                        "Think logically - does it make sense?",
                        "Practice regularly - build confidence",
                        "Learn from mistakes - they teach you",
                        "Ask for help when stuck",
                        "Remember: Every expert was once a beginner!",
                        "Problem-solving is a skill that improves with practice."
                    )
                ),

                Slide.ConceptSlide(
                    id = 21,
                    title = "When You Get Stuck",
                    content = "Strategies to overcome challenges:",
                    keyPoints = listOf(
                        "1. Re-read the problem more slowly",
                        "2. Draw a picture or diagram",
                        "3. Try simpler numbers first",
                        "4. Break into smaller parts",
                        "5. Work backwards from answer choices",
                        "6. Identify what you DO understand",
                        "7. Look for similar problems you've solved",
                        "8. Take a short break and return fresh",
                        "9. Explain the problem out loud",
                        "10. Ask: What would make sense?"
                    )
                ),

                Slide.SummarySlide(
                    id = 22,
                    title = "Summary: The 4-Step Method",
                    keyPoints = listOf(
                        "Step 1 - UNDERSTAND: \n • Read carefully, identify given/asked \n • Highlight key info, circle numbers and units",
                        "Step 2 - PLAN: \n • Choose operations, write number sentences \n • Decide order of steps needed",
                        "Step 3 - SOLVE: \n • Follow plan step-by-step \n • Show all work clearly, track units",
                        "Step 4 - CHECK: \n • Verify answer makes sense \n • Work backwards, estimate, check calculations",
                        "Master these steps and you'll solve ANY problem!"
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
                    content = "In this topic, you'll master solving complex problems that combine all four operations: addition, subtraction, multiplication, and division.\n\nYou'll work with decimals, whole numbers, and money in real-world situations!"
                ),

                Slide.ConceptSlide(
                    id = 2,
                    title = "All Operations Together",
                    content = "Real-world problems often require using multiple operations in combination:",
                    keyPoints = listOf(
                        "Addition (+): combining amounts, totals",
                        "Subtraction (−): finding difference, change",
                        "Multiplication (×): repeated addition, rates",
                        "Division (÷): splitting equally, unit rates",
                        "Key skill: Knowing WHEN to use each operation",
                        "Order matters: Follow PEMDAS/GEMDAS rules"
                    )
                ),

                Slide.ConceptSlide(
                    id = 3,
                    title = "Order of Operations: GEMDAS",
                    content = "When a problem has multiple operations, follow this order:",
                    keyPoints = listOf(
                        "G - Grouping symbols (parentheses, brackets)",
                        "E - Exponents (powers, roots)",
                        "M - Multiplication (left to right)",
                        "D - Division (left to right)",
                        "A - Addition (left to right)",
                        "S - Subtraction (left to right)",
                        "Remember: MD and AS are done together, left to right"
                    )
                ),

                Slide.ConceptSlide(
                    id = 4,
                    title = "Routine Multi-Operation Problems",
                    content = "Routine problems clearly show which operations to use:",
                    keyPoints = listOf(
                        "Keywords guide you to operations",
                        "Steps are straightforward",
                        "Usually 2-3 operations needed",
                        "Example patterns: \n • Buy multiple items, find total, get change \n • Calculate earnings, subtract expenses, split profit \n • Find area, multiply by cost, add extras"
                    )
                ),

                Slide.ExampleSlide(
                    id = 5,
                    title = "Routine Problem 1: Shopping with Change",
                    problem = "Maria bought 3 notebooks at ₱45.50 each and 5 pens at ₱12.75 each. She paid with a ₱500 bill. How much change did she receive?",
                    steps = listOf(
                        "1. UNDERSTAND: \n Notebooks: 3 × ₱45.50 \n Pens: 5 × ₱12.75 \n Paid: ₱500 \n Asked: Change?",
                        "2. PLAN: \n Step 1: Cost of notebooks (multiply) \n Step 2: Cost of pens (multiply) \n Step 3: Total cost (add) \n Step 4: Change (subtract)",
                        "3. SOLVE: \n Notebooks: 3 × 45.50 = ₱136.50 \n Pens: 5 × 12.75 = ₱63.75 \n Total: 136.50 + 63.75 = ₱200.25 \n Change: 500 − 200.25 = ₱299.75",
                        "4. CHECK: \n 200.25 + 299.75 = 500"
                    ),
                    answer = "Maria received ₱299.75 in change"
                ),

                Slide.ExampleSlide(
                    id = 6,
                    title = "Routine Problem 2: Business Profit",
                    problem = "A vendor bought 8 kg of fish at ₱180 per kg. He sold 6 kg at ₱245 per kg and the rest at ₱220 per kg. How much profit did he make?",
                    steps = listOf(
                        "1. UNDERSTAND: \n Bought: 8 kg at ₱180/kg \n Sold: 6 kg at ₱245/kg, 2 kg at ₱220/kg \n Asked: Total profit?",
                        "2. PLAN: \n Total cost = 8 × 180 \n Revenue from 6 kg = 6 × 245 \n Revenue from 2 kg = 2 × 220 \n Total revenue = sum of revenues \n Profit = revenue − cost",
                        "3. SOLVE: \n Cost: 8 × 180 = ₱1,440 \n Revenue 1: 6 × 245 = ₱1,470 \n Revenue 2: 2 × 220 = ₱440 \n Total revenue: 1,470 + 440 = ₱1,910 \n Profit: 1,910 − 1,440 = ₱470",
                        "4. CHECK: \n 1,440 + 470 = 1,910"
                    ),
                    answer = "The vendor made ₱470 profit"
                ),

                Slide.PracticeSlide(
                    id = 7,
                    question = "Ana bought 4 kg of rice at ₱52.50/kg and 3 kg of sugar at ₱48/kg. She paid ₱400. How much change?",
                    options = listOf("₱46", "₱56", "₱66", "₱76"),
                    correctAnswer = 2,
                    explanation = "Correct! Rice: 4 × 52.50 = ₱210. Sugar: 3 × 48 = ₱144. Total: 210 + 144 = ₱354. Change: 400 − 354 = ₱46"
                ),

                Slide.ConceptSlide(
                    id = 8,
                    title = "Non-Routine Multi-Operation Problems",
                    content = "Non-routine problems require deeper thinking:",
                    keyPoints = listOf(
                        "Operations may not be obvious",
                        "Might have extra or hidden information",
                        "Requires analysis and strategy",
                        "May need 3-5 or more steps",
                        "Strategies: \n • Draw diagrams or tables \n • Work backwards from the answer \n • Break into smaller sub-problems \n • Look for patterns or relationships"
                    )
                ),

                Slide.ExampleSlide(
                    id = 9,
                    title = "Non-Routine Problem 1: Working Backwards",
                    problem = "After buying groceries, Sofia had ₱287.50 left. She had spent ₱425 on groceries and ₱156.50 on transportation before that. How much money did she have at the start?",
                    steps = listOf(
                        "1. UNDERSTAND: \n Ended with: ₱287.50 \n Spent on groceries: ₱425 \n Spent on transport: ₱156.50 \n Asked: Starting amount?",
                        "2. PLAN: \n Work backwards - add back what was spent \n Start = End + Groceries + Transport",
                        "3. SOLVE: \n After groceries: 287.50 + 425 = ₱712.50 \n Original amount: 712.50 + 156.50 = ₱869",
                        "4. CHECK: \n Forward check: \n 869 − 156.50 = 712.50 (after transport) \n 712.50 − 425 = 287.50 (final)"
                    ),
                    answer = "Sofia started with ₱869.00"
                ),

                Slide.ExampleSlide(
                    id = 10,
                    title = "Non-Routine Problem 2: Comparison and Decision",
                    problem = "Store A sells 2.5 kg bags of sugar for ₱137.50. Store B sells 3.2 kg bags for ₱169.60. Which store offers better value, and how much would you save per kg when buying 10 kg?",
                    steps = listOf(
                        "1. UNDERSTAND: \n Store A: ₱137.50 for 2.5 kg \n Store B: ₱169.60 for 3.2 kg \n Asked: Better value? Savings on 10 kg?",
                        "2. PLAN: \n Find price/kg for each \n Compare prices \n Calculate cost for 10 kg each \n Find difference",
                        "3. SOLVE: \n Store A: 137.50 ÷ 2.5 = ₱55/kg \n Store B: 169.60 ÷ 3.2 = ₱53/kg \n Store B is cheaper!",
                        "For 10 kg: \n Store A: 10 × 55 = ₱550 \n Store B: 10 × 53 = ₱530 \n Savings: 550 − 530 = ₱20",
                        "4. CHECK: \n Difference per kg: 55 − 53 = ₱2 \n 2 × 10 kg = ₱20 savings"
                    ),
                    answer = "Store B offers better value. Save ₱20 on 10 kg"
                ),

                Slide.PracticeSlide(
                    id = 11,
                    question = "A baker made 144 cupcakes. He sold ¾ at ₱35 each and the rest at ₱25 each. What's his total revenue?",
                    options = listOf("₱4,680", "₱4,590", "₱4,500", "₱4,410"),
                    correctAnswer = 1,
                    explanation = "Correct! ¾ of 144 = 108 cupcakes. Remaining: 144 − 108 = 36. Revenue: (108 × 35) + (36 × 25) = 3,780 + 810 = ₱4,590"
                ),

                Slide.SummarySlide(
                    id = 12,
                    title = "Summary",
                    keyPoints = listOf(
                        "Multi-operation problems combine all four operations",
                        "Follow GEMDAS for order of operations",
                        "Routine problems: \n • Clear operation keywords \n • Straightforward steps",
                        "Non-routine problems: \n • Require analysis and creative thinking \n • May need working backwards or comparisons",
                        "Always: \n • Use the 4-step method (UPSC) \n • Show all work clearly \n • Check your answer makes sense"
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
                    title = "Welcome!",
                    content = "In this topic, you'll learn how to CREATE your own word problems! Creating problems helps you understand math deeply and think like a mathematician."
                ),

                Slide.ConceptSlide(
                    id = 2,
                    title = "Why Create Problems?",
                    content = "Creating your own word problems helps you:",
                    keyPoints = listOf(
                        "Understand math concepts more deeply",
                        "See connections to real life",
                        "Think creatively about mathematics",
                        "Recognize problem patterns",
                        "Become a better problem solver",
                        "Make math more interesting and fun",
                        "When you can create a problem, you truly understand it!"
                    )
                ),

                Slide.ConceptSlide(
                    id = 3,
                    title = "Steps to Create a Word Problem",
                    content = "Follow these steps to create good word problems:",
                    keyPoints = listOf(
                        "Step 1: Choose the operation(s) \n • What math concept do you want to practice?",
                        "Step 2: Pick a real-world context \n • Shopping, cooking, sports, travel, etc.",
                        "Step 3: Create the situation \n • Write a story that uses your chosen operations",
                        "Step 4: Write clear information \n • Include all needed numbers and units",
                        "Step 5: Ask a clear question \n • What should be found or calculated?"
                    )
                ),

                Slide.ExampleSlide(
                    id = 4,
                    title = "Example: Creating an Addition Problem",
                    problem = "Let's create a problem step by step:",
                    steps = listOf(
                        "Step 1: Choose operation \n → Addition with decimals and money",
                        "Step 2: Pick context \n → Shopping at a bookstore",
                        "Step 3: Create situation \n → A student buying school supplies",
                        "Step 4: Add numbers \n → Notebook ₱35.50, pen ₱12.75, eraser ₱8.25",
                        "Step 5: Ask question \n → What is the total cost?",
                        "FINAL PROBLEM: \n Maria bought a notebook for ₱35.50, a pen for ₱12.75, and an eraser for ₱8.25. What is the total cost of her purchases?"
                    ),
                    answer = "Total cost: ₱35.50 + ₱12.75 + ₱8.25 = ₱56.50"
                ),

                Slide.ExampleSlide(
                    id = 5,
                    title = "Example: Creating a Multi-Step Problem",
                    problem = "Now let's create a more complex problem:",
                    steps = listOf(
                        "Step 1: Choose operations \n → Multiplication and subtraction (change problem)",
                        "Step 2: Pick context \n → Buying snacks at a canteen",
                        "Step 3: Create situation \n → Student buys multiple items, pays with bill",
                        "Step 4: Add numbers \n → 3 sandwiches at ₱42.50 each \n → Pays with ₱200 bill",
                        "Step 5: Ask question \n → How much change?",
                        "FINAL PROBLEM: \n Juan bought 3 sandwiches at ₱42.50 each. He paid with a ₱200 bill. How much change will he receive?"
                    ),
                    answer = "Cost: 3 × ₱42.50 = ₱127.50. Change: ₱200 − ₱127.50 = ₱72.50"
                ),

                Slide.ConceptSlide(
                    id = 6,
                    title = "Tips for Good Problem Creation",
                    content = "Make your problems interesting and solvable:",
                    keyPoints = listOf(
                        "Use realistic numbers \n • ₱45.50 for a notebook (realistic) \n • ₱1,234.56 for a notebook (unrealistic)",
                        "Include appropriate units \n • Pesos, kilograms, meters, hours, etc.",
                        "Make the context relatable \n • Use familiar situations",
                        "Provide all necessary information \n • Don't leave out important numbers",
                        "Ask one clear question \n Don't confuse with multiple questions"
                    )
                ),

                Slide.PracticeSlide(
                    id = 7,
                    question = "Which is the BEST context for a division problem about decimals?",
                    options = listOf(
                        "Counting whole apples",
                        "Sharing a pizza equally",
                        "Adding distances",
                        "Multiplying whole numbers"
                    ),
                    correctAnswer = 1,
                    explanation = "Correct! Sharing a pizza equally is perfect for division with decimals (like cutting it into fractional parts or sharing among people)."
                ),

                Slide.ConceptSlide(
                    id = 8,
                    title = "Problem Contexts to Use",
                    content = "Great real-world contexts for word problems:",
                    keyPoints = listOf(
                        "Money/Shopping: \n Buying items, getting change, comparing prices",
                        "Cooking/Recipes: \n Measuring ingredients, scaling recipes",
                        "Travel/Distance: \n Calculating distances, speeds, time",
                        "Measurement: \n Length, weight, capacity problems",
                        "Sports/Games: \n Scores, statistics, timing",
                        "School: \n Grades, supplies, schedules"
                    )
                ),

                Slide.ExampleSlide(
                    id = 9,
                    title = "Your Turn: Guided Creation",
                    problem = "Let's create a problem about buying fruit:",
                    steps = listOf(
                        "Framework provided: \n • Operation: Multiplication and addition \n • Context: Fruit market \n • Situation: Buying different fruits",
                        "You fill in: \n 1. Choose fruits (e.g., mangoes, bananas) \n 2. Add quantities (e.g., 2.5 kg, 3 kg) \n 3. Add prices (e.g., ₱85/kg, ₱50/kg) \n 4. Ask: What is the total cost?",
                        "Example result: \n Ana bought 2.5 kg of mangoes at ₱85 per kg and 3 kg of bananas at ₱50 per kg. What is the total amount she paid?",
                        "Solution: \n Mangoes: 2.5 × 85 = ₱212.50 \n Bananas: 3 × 50 = ₱150 \n Total: ₱212.50 + ₱150 = ₱362.50"
                    ),
                    answer = "Total: ₱362.50"
                ),

                Slide.SummarySlide(
                    id = 10,
                    title = "Summary",
                    keyPoints = listOf(
                        "Creating problems helps you understand math deeply",
                        "5 Steps to Create: \n 1. Choose operation(s) \n 2. Pick real-world context \n 3. Create the situation \n 4. Add clear numbers and units \n 5. Ask a clear question",
                        "Tips: \n • Use realistic numbers \n • Make context relatable \n • Include all needed information \n • Test solve your own problem!",
                        "Practice by creating problems for classmates to solve!"
                    )
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
                    content = "In this topic, you'll master solving multi-step problems that require using two or more arithmetic operations. These problems are more complex but follow predictable patterns!"
                ),

                Slide.ConceptSlide(
                    id = 2,
                    title = "What are Multi-Step Problems?",
                    content = "Multi-step problems require more than one operation to solve:",
                    keyPoints = listOf(
                        "Characteristics: \n • Need 2 or more operations \n • Must be solved in specific order \n • Each step builds on the previous one \n • Intermediate answers lead to final answer",
                        "Example: \n Buy items (multiply), find total (add), calculate change (subtract)",
                        "Key: Break complex problems into simple steps!"
                    )
                ),

                Slide.ConceptSlide(
                    id = 3,
                    title = "Common Multi-Step Patterns",
                    content = "Recognize these common patterns:",
                    keyPoints = listOf(
                        "Pattern 1: Buy Multiple Items + Change \n • Multiply quantities by prices \n • Add all costs \n • Subtract from payment",
                        "Pattern 2: Cost + Profit/Loss \n • Calculate total cost \n • Calculate total revenue \n • Subtract to find profit or loss",
                        "Pattern 3: Unit Rate + Total Cost \n • Divide to find rate per unit \n • Multiply by different quantity",
                        "Pattern 4: Sharing After Expenses \n • Calculate total expenses \n • Subtract from total \n • Divide among people"
                    )
                ),

                Slide.ExampleSlide(
                    id = 4,
                    title = "Pattern 1: Shopping with Change",
                    problem = "Lisa bought 4 notebooks at ₱32.50 each, 3 pens at ₱15.75 each, and 2 folders at ₱28.00 each. She paid with three ₱100 bills. How much change did she receive?",
                    steps = listOf(
                        "1. UNDERSTAND: \n Items: 4 notebooks (₱32.50), 3 pens (₱15.75), 2 folders (₱28) \n Paid: 3 × ₱100 = ₱300 \n Asked: Change?",
                        "2. PLAN (identify steps): \n Step A: Cost of notebooks (multiply) \n Step B: Cost of pens (multiply) \n Step C: Cost of folders (multiply) \n Step D: Total cost (add A + B + C) \n Step E: Change (subtract D from payment)",
                        "3. SOLVE: \n A. Notebooks: 4 × 32.50 = ₱130.00 \n B. Pens: 3 × 15.75 = ₱47.25 \n C. Folders: 2 × 28.00 = ₱56.00 \n D. Total: 130 + 47.25 + 56 = ₱233.25 \n E. Change: 300 − 233.25 = ₱66.75",
                        "4. CHECK: \n 233.25 + 66.75 = 300"
                    ),
                    answer = "Lisa received ₱66.75 in change"
                ),

                Slide.ExampleSlide(
                    id = 5,
                    title = "Pattern 2: Business Profit Calculation",
                    problem = "A street vendor bought 15 kg of mangoes at ₱65 per kg. He sold 10 kg at ₱95 per kg and the remaining 5 kg at ₱80 per kg. How much profit did he make?",
                    steps = listOf(
                        "1. UNDERSTAND: \n Bought: 15 kg at ₱65/kg \n Sold: 10 kg at ₱95/kg, 5 kg at ₱80/kg \n Asked: Profit?",
                        "2. PLAN: \n Step A: Total cost (15 × 65) \n Step B: Revenue from 10 kg (10 × 95) \n Step C: Revenue from 5 kg (5 × 80) \n Step D: Total revenue (B + C) \n Step E: Profit (D − A)",
                        "3. SOLVE: \n A. Cost: 15 × 65 = ₱975 \n B. Revenue 1: 10 × 95 = ₱950 \n C. Revenue 2: 5 × 80 = ₱400 \n D. Total revenue: 950 + 400 = ₱1,350 \n E. Profit: 1,350 − 975 = ₱375",
                        "4. CHECK: \n 975 + 375 = 1,350"
                    ),
                    answer = "The vendor made ₱375 profit"
                ),

                Slide.PracticeSlide(
                    id = 6,
                    question = "Maria bought 2.5 kg of chicken at ₱180/kg and 1.8 kg of pork at ₱250/kg. She paid ₱1,000. How much change?",
                    options = listOf("₱100", "₱110", "₱120", "₱130"),
                    correctAnswer = 1,
                    explanation = "Correct! Chicken: 2.5 × 180 = ₱450. Pork: 1.8 × 250 = ₱450. Total: 450 + 450 = ₱900. Change: 1,000 − 900 = ₱100"
                ),

                Slide.ExampleSlide(
                    id = 7,
                    title = "Pattern 3: Unit Rate Application",
                    problem = "A car traveled 315 km using 22.5 liters of gasoline. At this rate, how much gasoline is needed to travel 525 km?",
                    steps = listOf(
                        "1. UNDERSTAND: \n Given: 315 km used 22.5 L \n Asked: Liters needed for 525 km?",
                        "2. PLAN: \n Step A: Find km per liter (rate) \n Step B: Find liters for 525 km",
                        "3. SOLVE: \n A. Rate: 315 ÷ 22.5 = 14 km/L \n B. Liters needed: 525 ÷ 14 = 37.5 L",
                        "Alternative method: \n A. Liters per km: 22.5 ÷ 315 = 0.071428... L/km \n B. For 525 km: 525 × (22.5 ÷ 315) = 37.5 L",
                        "4. CHECK: \n 37.5 × 14 = 525 km"
                    ),
                    answer = "37.5 liters are needed"
                ),

                Slide.ExampleSlide(
                    id = 8,
                    title = "Pattern 4: Sharing After Expenses",
                    problem = "Four friends earned ₱3,840 from a garage sale. They spent ₱560 on supplies and ₱280 on snacks. They plan to split the remaining money equally. How much will each friend receive?",
                    steps = listOf(
                        "1. UNDERSTAND: \n Earned: ₱3,840 \n Spent: ₱560 (supplies) + ₱280 (snacks) \n Split among: 4 friends \n Asked: Amount per friend?",
                        "2. PLAN: \n Step A: Total expenses (560 + 280) \n Step B: Remaining money (3,840 − A) \n Step C: Amount per person (B ÷ 4)",
                        "3. SOLVE: \n A. Total expenses: 560 + 280 = ₱840 \n B. Remaining: 3,840 − 840 = ₱3,000 \n C. Per person: 3,000 ÷ 4 = ₱750",
                        "4. CHECK: \n 750 × 4 = 3,000 \n 3,000 + 840 = 3,840"
                    ),
                    answer = "Each friend receives ₱750"
                ),

                Slide.PracticeSlide(
                    id = 9,
                    question = "A baker made 180 cupcakes. He sold ⅔ at ₱25 each and ⅓ at ₱20 each. What's his total revenue?",
                    options = listOf("₱4,000", "₱4,200", "₱4,500", "₱5,000"),
                    correctAnswer = 1,
                    explanation = "Correct! ⅔ of 180 = 120 cupcakes. ⅓ of 180 = 60 cupcakes. Revenue: (120 × 25) + (60 × 20) = 3,000 + 1,200 = ₱4,200"
                ),

                Slide.ConceptSlide(
                    id = 10,
                    title = "Strategy: Breaking Down Problems",
                    content = "How to approach multi-step problems:",
                    keyPoints = listOf(
                        "1. Read completely first \n • Don't start calculating immediately",
                        "2. Identify ALL operations needed \n • List them in order",
                        "3. Label each step (A, B, C...) \n • This keeps you organized",
                        "4. Solve one step at a time \n • Complete each before moving to next",
                        "5. Use intermediate answers \n • Each answer feeds into next step",
                        "6. Check at the end \n • Work backwards to verify"
                    )
                ),

                Slide.SummarySlide(
                    id = 11,
                    title = "Summary",
                    keyPoints = listOf(
                        "Multi-step problems need 2+ operations in sequence",
                        "Common patterns: \n • Shopping + Change (multiply, add, subtract) \n • Profit/Loss (cost, revenue, difference) \n • Unit rates (divide, multiply) \n • Sharing after expenses (add, subtract, divide)",
                        "Success strategies: \n • Break into labeled steps (A, B, C...) \n • Solve one step at a time \n • Use each answer in next step \n • Check by working backwards",
                        "Practice recognizing patterns to solve faster!"
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
                    content = "In this topic, you will learn how to write ratios, relate them to fractions, and tell when a ratio is a rate. Ratios help us compare quantities in everyday life!"
                ),

                Slide.ConceptSlide(
                    id = 2,
                    title = "What is a Ratio?",
                    content = "A ratio is a way to compare two or more quantities that have the same units.",
                    keyPoints = listOf(
                        "Compares quantities with the same unit",
                        "Can compare distinct items or parts of a whole",
                        "Order matters when writing ratios",
                        "The first number relates to the first item mentioned"
                    )
                ),

                Slide.ConceptSlide(
                    id = 3,
                    title = "Three Ways to Write a Ratio",
                    content = "Every ratio can be expressed in three different forms:",
                    keyPoints = listOf(
                        "1. Word form: '1 is to 2' \n Example: 'three is to five'",
                        "2. Colon form: 1:2 \n Example: 3:5",
                        "3. Fraction form: ¹⁄₂ \n Example: ³⁄₅",
                        "All three forms mean the same thing!"
                    )
                ),

                Slide.ConceptSlide(
                    id = 4,
                    title = "Understanding the Example",
                    content = "Let's say we have a group of pets:",
                    imageItems = listOf(
                        Slide.ImageItem(R.drawable.dog_icon, 14, "Dogs"),
                        Slide.ImageItem(R.drawable.cat_icon, 8, "Cats")
                    ),
                    keyPoints = listOf(
                        "We can compare these animals using ratios",
                        "Remember: order matters!",
                        "Dogs to cats is different from cats to dogs"
                    )
                ),

                Slide.ExampleSlide(
                    id = 5,
                    title = "Example 1: Dogs to Cats",
                    problem = "Compare the number of dogs to cats",
                    imageItems = listOf(
                        Slide.ImageItem(R.drawable.dog_icon, 14, "Dogs"),
                        Slide.ImageItem(R.drawable.cat_icon, 8, "Cats")
                    ),
                    steps = listOf(
                        "Ratio of dogs to cats:",
                        "Word form → 14 is to 8",
                        "Colon form → 14:8",
                        "Fraction form → ¹⁴⁄₈",
                        "This ratio can be simplified: Both 14 and 8 are divisible by 2",
                        "14 ÷ 2 = 7",
                        "8 ÷ 2 = 4",
                        "Simplified: 7:4 or ⁷⁄₄"
                    ),
                    answer = "Dogs to cats = 14:8 or ⁷⁄₄ (simplified)",
                ),

                Slide.ExampleSlide(
                    id = 6,
                    title = "Example 2: Cats to Dogs",
                    problem = "Now let's reverse the comparison!",
                    imageItems = listOf(
                        Slide.ImageItem(R.drawable.dog_icon, 8, "Dogs"),
                        Slide.ImageItem(R.drawable.cat_icon, 14, "Cats")
                    ),
                    steps = listOf(
                        "Ratio of cats to dogs:",
                        "Word form → 8 is to 14",
                        "Colon form → 8:14",
                        "Fraction form → ⁸⁄₁₄",
                        "Simplified form: Both 8 and 14 are divisible by 2",
                        "8 ÷ 2 = 4",
                        "14 ÷ 2 = 7",
                        "Simplified: 4:7 or ⁴⁄₇"
                    ),
                    answer = "Cats to dogs = 8:14 or ⁴⁄₇ (simplified)"
                ),

                Slide.ConceptSlide(
                    id = 7,
                    title = "Important: Order Matters!",
                    content = "Notice how the ratios are different when we reverse the order:",
                    keyPoints = listOf(
                        "Dogs to cats: 14:8 or ⁷⁄₄",
                        "Cats to dogs: 8:14 or ⁴⁄₇",
                        "These are NOT the same!",
                        "Always check which item is mentioned first",
                        "That item becomes the first number in the ratio",
                        "Think: 'What is being compared TO what?'"
                    )
                ),

                Slide.ConceptSlide(
                    id = 8,
                    title = "Part-to-Whole Ratios",
                    content = "You can also compare a part to the whole group:",
                    keyPoints = listOf(
                        "Dogs: 14",
                        "Cats: 8",
                        "Total animals: 14 + 8 = 22",
                        "Part-to-whole ratios work like fractions!",
                        "Example: \n Cats to total animals = ⁸⁄₂₂ \n This is both a ratio AND a fraction"
                    )
                ),

                Slide.ExampleSlide(
                    id = 9,
                    title = "Example 3: Part-to-Whole Comparison",
                    problem = "Compare cats to the total number of animals",
                    steps = listOf(
                        "Step 1: Find the total Dogs: 14 and Cats: 8 \n Total: 14 + 8 = 22 animals",
                        "Step 2: Write the ratio \n Cats to total animals: \n Word form: 8 is to 22 \n Colon form: 8:22 \n Fraction form: ⁸⁄₂₂",
                        "Step 3: Simplify",
                        "Both divisible by 2 \n 8 ÷ 2 = 4 \n 22 ÷ 2 = 11",
                        "Simplified: 4:11 or ⁴⁄₁₁"
                    ),
                    answer = "Cats to total = 8:22 or ⁴⁄₁₁ (simplified)"
                ),

                Slide.ExampleSlide(
                    id = 10,
                    title = "Example 4: Total to Part",
                    problem = "Compare total animals to dogs",
                    steps = listOf(
                        "Total animals: 22",
                        "Dogs: 14",
                        "Ratio of total to dogs: \n Word form: 22 is to 14 \n Colon form: 22:14 \n Fraction form: ²²⁄₁₄",
                        "Simplify (divide by 2): \n 22 ÷ 2 = 11 \n 14 ÷ 2 = 7",
                        "Simplified: 11:7 or ¹¹⁄₇"
                    ),
                    answer = "Total to dogs = 22:14 or ¹¹⁄₇ (simplified)"
                ),

                Slide.ConceptSlide(
                    id = 11,
                    title = "Reading Ratios in Fraction Form",
                    content = "Even when written as a fraction, ratios use special language:",
                    keyPoints = listOf(
                        "For fractions, we say: 'two-thirds' (²⁄₃)",
                        "For ratios in fraction form, we say: 'two is to three' (²⁄₃)",
                        "Examples: \n ³⁄₅ → 'three is to five' (not 'three-fifths') \n ⁷⁄₄ → 'seven is to four' (not 'seven-fourths')",
                        "Use 'is to' language for ratios!"
                    )
                ),

                Slide.PracticeSlide(
                    id = 12,
                    question = "Look at the bags: What is the ratio of pink bags to blue bags in colon form?",
                    imageItems = listOf(
                        Slide.ImageItem(R.drawable.blue_bag, 3, "Blue Bags"),
                        Slide.ImageItem(R.drawable.pink_bag, 4, "Pink Bags")
                    ),
                    options = listOf("4:8", "4:3", "3:4", "8:4"),
                    correctAnswer = 1,
                    explanation = "Correct! There are 4 pink bags and 3 blue bags, so the ratio is 4:3"
                ),

                Slide.PracticeSlide(
                    id = 13,
                    question = "Using the same bags: What is the ratio of blue bags to pink bags in word form?",
                    imageItems = listOf(
                        Slide.ImageItem(R.drawable.blue_bag, 3, "Dogs"),
                        Slide.ImageItem(R.drawable.pink_bag, 4, "Cats")
                    ),
                    options = listOf("3 is to 4", "4 is to 3", "3 is to 7", "7 is to 4"),
                    correctAnswer = 0,
                    explanation = "Correct! There are 3 blue bags and 4 pink bags, so we say '3 is to 4'"
                ),

                Slide.PracticeSlide(
                    id = 14,
                    question = "What is the ratio of pink bags to total bags in fraction form?",
                    imageItems = listOf(
                        Slide.ImageItem(R.drawable.blue_bag, 4, "Dogs"),
                        Slide.ImageItem(R.drawable.pink_bag, 3, "Cats")
                    ),
                    options = listOf("³⁄₇", "⁴⁄₇", "⁴⁄₃", "⁷⁄₄"),
                    correctAnswer = 1,
                    explanation = "Correct! There are 4 pink bags out of 7 total bags (4 + 3 = 7), so the ratio is ⁴⁄₇"
                ),

                Slide.ConceptSlide(
                    id = 15,
                    title = "Simplifying Ratios",
                    content = "Just like fractions, ratios should be simplified to their lowest terms:",
                    keyPoints = listOf(
                        "Find the Greatest Common Factor (GCF)",
                        "Divide both numbers by the GCF",
                        "Example: Simplify 22:14 \n GCF of 22 and 14 is 2 \n 22 ÷ 2 = 11 \n 14 ÷ 2 = 7",
                        "Simplified: 11:7",
                        "Example: Simplify 18:12 \n GCF of 18 and 12 is 6 \n 18 ÷ 6 = 3 \n 12 ÷ 6 = 2",
                        "Simplified: 3:2"
                    )
                ),

                Slide.PracticeSlide(
                    id = 16,
                    question = "Simplify the ratio 20:15",
                    options = listOf("4:3", "5:3", "10:5", "20:15"),
                    correctAnswer = 0,
                    explanation = "Correct! The GCF of 20 and 15 is 5. Divide both by 5: 20 ÷ 5 = 4 and 15 ÷ 5 = 3. Answer: 4:3"
                ),

                Slide.ConceptSlide(
                    id = 17,
                    title = "What is a Rate?",
                    content = "A rate is a special type of ratio that compares different units:",
                    keyPoints = listOf(
                        "Regular ratio: same units (dogs to cats)",
                        "Rate: different units (kilometers to hours)",
                        "Common rates in daily life: \n • Speed: 60 kilometers per hour \n • Price: ₱50 per kilogram \n • Wage: ₱500 per day \n • Heart rate: 72 beats per minute",
                        "The word 'per' often indicates a rate"
                    )
                ),

                Slide.ExampleSlide(
                    id = 18,
                    title = "Example: Identifying Rates",
                    problem = "Which of these are rates?",
                    steps = listOf(
                        "1. 3 boys to 5 girls \n→ Same unit (people) \n→ This is a ratio, NOT a rate",
                        "2. 120 kilometers in 2 hours \n→ Different units (distance and time) \n→ This IS a rate \n→ Can write as: 60 km per hour",
                        "3. ₱450 for 5 kilograms \n→ Different units (money and weight) \n→ This IS a rate \n→ Can write as: ₱90 per kilogram",
                        "4. 12 apples to 8 oranges \n→ Same unit type (fruits) \n→ This is a ratio, NOT a rate"
                    ),
                    answer = "Items 2 and 3 are rates because they compare different units"
                ),

                Slide.PracticeSlide(
                    id = 19,
                    question = "Which of these is a rate?",
                    options = listOf(
                        "5 dogs to 3 cats",
                        "₱75 per meter of cloth",
                        "7 boys to 9 girls",
                        "4 red balls to 6 blue balls"
                    ),
                    correctAnswer = 1,
                    explanation = "Correct! ₱75 per meter compares money (pesos) to length (meters) - different units, so it's a rate."
                ),

                Slide.ConceptSlide(
                    id = 20,
                    title = "Ratio vs Rate: Quick Check",
                    content = "How to tell them apart:",
                    keyPoints = listOf(
                        "RATIO: \n Compares same units \n Examples: dogs:cats, boys:girls, red:blue \n No 'per' needed",
                        "RATE: \n Compares different units \n Examples: km per hour, ₱ per kg, words per minute \n Often uses 'per'",
                        "Ask yourself: Are the units the same or different?"
                    )
                ),

                Slide.SummarySlide(
                    id = 21,
                    title = "Summary",
                    keyPoints = listOf(
                        "A ratio compares two quantities in three forms: \n Word form: 'a is to b' \n Colon form: a:b \n Fraction form: ᵃ⁄ᵦ",
                        "Order matters in ratios!",
                        "Dogs to cats ≠ Cats to dogs",
                        "Ratios should be simplified to lowest terms",
                        "Divide by the GCF",
                        "Part-to-whole ratios are like fractions",
                        "Example: 8 cats out of 22 animals = ⁸⁄₂₂ \n A rate compares different units",
                        "Examples: km/hour, ₱/kg, beats/minute \n Look for the word 'per'"
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
                    content = "In this topic, you will learn about the concept of Proportion. You will be able to explain and understand ratios and proportions, and how they relate to each other."
                ),

                Slide.ConceptSlide(
                    id = 2,
                    title = "What is a Proportion?",
                    content = "A proportion is an equation that shows two ratios are equal.",
                    keyPoints = listOf(
                        "Compares two fractions or ratios",
                        "States that they have the same value",
                        "Written as: a/b = c/d or a:b = c:d",
                        "Example: \n ²⁄₄ = ⁴⁄₈",
                        "Both equal ½ when simplified",
                        "Real-world example: \n If 2 apples cost ₱10, then 4 apples cost ₱20 \n This creates the proportion: ²⁄₁₀ = ⁴⁄₂₀"
                    )
                ),

                Slide.ConceptSlide(
                    id = 3,
                    title = "Parts of a Proportion: Extremes",
                    content = "In a proportion, the extremes are the outer numbers.",
                    keyPoints = listOf(
                        "Given proportion: a/b = c/d",
                        "The extremes are: a and d",
                        "They are the first and last terms",
                        "Example: ²⁄₃ = ⁴⁄₆",
                        "Extremes: 2 and 6",
                        "In cross-multiplication: \n Product of extremes = a × d",
                        "Example: 2 × 6 = 12"
                    )
                ),

                Slide.ConceptSlide(
                    id = 4,
                    title = "Parts of a Proportion: Means",
                    content = "In a proportion, the means are the inner numbers.",
                    keyPoints = listOf(
                        "Given proportion: a/b = c/d",
                        "The means are: b and c",
                        "They are the middle two terms",
                        "Example: ²⁄₃ = ⁴⁄₆",
                        "Means: 3 and 4",
                        "In cross-multiplication: \n Product of means = b × c",
                        "Example: 3 × 4 = 12",
                        "Key rule: In a true proportion,",
                        "Product of extremes = Product of means"
                    )
                ),

                Slide.ExampleSlide(
                    id = 5,
                    title = "Example: Verifying a Proportion",
                    problem = "Is ²⁄₃ = ⁴⁄₆ a true proportion?",
                    steps = listOf(
                        "Step 1: Identify extremes and means \n Extremes: 2 and 6 \n Means: 3 and 4",
                        "Step 2: Cross-multiply \n Product of extremes: 2 × 6 \n Product of means: 3 × 4",
                        "Step 3: Calculate both products \n Extremes: 2 × 6 = 12 \n Means: 3 × 4 = 12",
                        "Step 4: Compare \n 12 = 12",
                        "Conclusion: \n Since the products are equal, \n ²⁄₃ = ⁴⁄₆ is a TRUE proportion"
                    ),
                    answer = "Yes, it is a true proportion because 12 = 12"
                ),

                Slide.ExampleSlide(
                    id = 6,
                    title = "Example 2: Another Proportion Check",
                    problem = "Verify if ³⁄₅ = ⁶⁄₁₀ is a proportion",
                    steps = listOf(
                        "Step 1: Identify parts \n Extremes: 3 and 10 \n Means: 5 and 6",
                        "Step 2: Cross-multiply \n Extremes: 3 × 10 \n Means: 5 × 6",
                        "Step 3: Calculate \n 3 × 10 = 30 \n 5 × 6 = 30",
                        "Step 4: Verify \n 30 = 30",
                        "Therefore: \n ³⁄₅ = ⁶⁄₁₀ is a TRUE proportion"
                    ),
                    answer = "Yes, 30 = 30, so it's a true proportion"
                ),

                Slide.PracticeSlide(
                    id = 7,
                    question = "Identify the extremes and means in: ⁴⁄₆ = ⁸⁄₁₂",
                    options = listOf(
                        "Extremes: 4, 12  |  Means: 6, 8",
                        "Extremes: 6, 8  |  Means: 4, 12",
                        "Extremes: 4, 8  |  Means: 6, 12",
                        "Extremes: 4, 6  |  Means: 8, 12"
                    ),
                    correctAnswer = 0,
                    explanation = "Correct! In a/b = c/d, extremes are the outer terms (a and d), and means are the inner terms (b and c)."
                ),

                Slide.PracticeSlide(
                    id = 8,
                    question = "Is ²⁄₅ = ⁴⁄₁₀ a true proportion?",
                    options = listOf("Yes", "No"),
                    correctAnswer = 0,
                    explanation = "Correct! Cross-multiply: 2 × 10 = 20 and 5 × 4 = 20. Since 20 = 20, it's a true proportion."
                ),

                Slide.ConceptSlide(
                    id = 9,
                    title = "Why Cross-Multiplication Works",
                    content = "Understanding the logic behind cross-multiplication:",
                    keyPoints = listOf(
                        "When we have: a/b = c/d",
                        "We can multiply both sides by bd: \n (a/b) × bd = (c/d) × bd",
                        "This simplifies to: \n a × d = c × b",
                        "Or: Product of extremes = Product of means",
                        "This is why cross-multiplication is a reliable method to check proportions!"
                    )
                ),

                Slide.ExampleSlide(
                    id = 10,
                    title = "Example 3: Real-World Proportion",
                    problem = "If 3 mangoes cost ₱45, do 5 mangoes cost ₱75?",
                    steps = listOf(
                        "Step 1: Set up the proportion \n ³⁄₄₅ = ⁵⁄₇₅ \n (mangoes/pesos = mangoes/pesos)",
                        "Step 2: Cross-multiply \n Extremes: 3 × 75 \n Means: 45 × 5",
                        "Step 3: Calculate \n 3 × 75 = 225 \n 45 × 5 = 225",
                        "Step 4: Compare \n 225 = 225 ✓",
                        "Conclusion: \n Yes, the pricing is proportional! \n 5 mangoes should cost ₱75"
                    ),
                    answer = "Yes, the proportion is true"
                ),

                Slide.PracticeSlide(
                    id = 11,
                    question = "Check if this is a true proportion: ⁵⁄₈ = ¹⁰⁄₁₆",
                    options = listOf("True proportion", "Not a true proportion"),
                    correctAnswer = 0,
                    explanation = "Correct! Cross-multiply: 5 × 16 = 80 and 8 × 10 = 80. Since 80 = 80, it's a true proportion."
                ),

                Slide.ConceptSlide(
                    id = 12,
                    title = "Finding Missing Values",
                    content = "Proportions can help us find unknown values:",
                    keyPoints = listOf(
                        "If we know three values, we can find the fourth",
                        "Example: ²⁄₃ = x/12",
                        "Cross-multiply: \n 2 × 12 = 3 × x \n 24 = 3x \n x = 24 ÷ 3 \n x = 8",
                        "Check: ²⁄₃ = ⁸⁄₁₂",
                        "Both equal ⅔ when simplified"
                    )
                ),

                Slide.SummarySlide(
                    id = 13,
                    title = "Summary",
                    keyPoints = listOf(
                        "Proportion: \n • An equation showing two ratios are equal \n • Written as: a/b = c/d",
                        "Extremes: \n • The outer numbers (a and d) \n • Product: a × d",
                        "Means: \n • The inner numbers (b and c) \n • Product: b × c",
                        "Testing Proportions: \n • Cross-multiply: extremes vs means \n • If products are equal → true proportion \n • If products differ → not a proportion",
                        "Applications: \n • Solving real-world problems \n • Finding missing values \n • Comparing rates and prices"
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
                    content = "In this topic, you will learn about the three types of proportion. There are three types: Direct Proportion, Inverse Proportion, and Partitive Proportion."
                ),

                Slide.ConceptSlide(
                    id = 2,
                    title = "Type 1: Direct Proportion",
                    content = "Direct proportion is a relationship where quantities change together in the same direction.",
                    keyPoints = listOf(
                        "When one increases, the other increases",
                        "When one decreases, the other decreases",
                        "They change at the same rate",
                        "Formula: y = kx (where k is constant)",
                        "Or written as: y/x = k (constant ratio)",
                        "Symbol: y ∝ x (y is proportional to x)",
                        "Real-life example: \n More apples bought → Higher total cost \n More hours worked → Higher earnings"
                    )
                ),

                Slide.ExampleSlide(
                    id = 3,
                    title = "Example: Direct Proportion",
                    problem = "If 5 notebooks cost ₱125, how much do 8 notebooks cost?",
                    steps = listOf(
                        "This is DIRECT proportion because:",
                        "More notebooks → Higher cost",
                        "Step 1: Set up the proportion\n ⁵⁄₁₂₅ = ⁸⁄ₓ\n (notebooks/pesos = notebooks/pesos)",
                        "Step 2: Cross-multiply \n 5 × x = 125 × 8 \n 5x = 1,000",
                        "Step 3: Solve for x \n x = 1,000 ÷ 5 \n x = 200",
                        "Step 4: Check \n ⁵⁄₁₂₅ = ⅕ = 0.04 \n ⁸⁄₂₀₀ = ¹⁄₂₅ = 0.04"
                    ),
                    answer = "8 notebooks cost ₱200"
                ),

                Slide.ConceptSlide(
                    id = 4,
                    title = "Identifying Direct Proportion",
                    content = "How to recognize direct proportion:",
                    keyPoints = listOf(
                        "Ask: Do both go up together? Or down together?",
                        "Examples of direct proportion: \n • Distance traveled ∝ Time (at constant speed) \n • Cost ∝ Quantity bought \n • Wages ∝ Hours worked \n • Ingredients ∝ Number of servings",
                        "Graph characteristics: \n • Straight line through origin (0,0) \n • Positive slope \n • Constant ratio y/x"
                    )
                ),

                Slide.PracticeSlide(
                    id = 5,
                    question = "If 3 meters of cloth cost ₱180, how much do 7 meters cost?",
                    options = listOf("₱360", "₱420", "₱480", "₱540"),
                    correctAnswer = 1,
                    explanation = "Correct! This is direct proportion. Set up: ³⁄₁₈₀ = ⁷⁄ₓ. Cross-multiply: 3x = 1,260. So x = 420."
                ),

                Slide.ConceptSlide(
                    id = 6,
                    title = "Type 2: Inverse Proportion",
                    content = "Inverse proportion is a relationship where quantities change in opposite directions.",
                    keyPoints = listOf(
                        "When one increases, the other decreases",
                        "When one decreases, the other increases",
                        "They move in opposite ways",
                        "Formula: xy = k (constant product)",
                        "Or: y = k/x",
                        "Symbol: y ∝ 1/x (y is inversely proportional to x)",
                        "Real-life example: \n More workers → Less time needed \n Faster speed → Less travel time \n More people sharing → Less per person"
                    )
                ),

                Slide.ExampleSlide(
                    id = 7,
                    title = "Example: Inverse Proportion",
                    problem = "If 6 workers can finish a job in 8 days, how long will it take 4 workers?",
                    steps = listOf(
                        "This is INVERSE proportion because: \n Fewer workers → More time needed",
                        "Step 1: Use the formula xy = k \n 6 workers × 8 days = 48 (constant)",
                        "Step 2: Apply to new situation \n 4 workers × x days = 48",
                        "Step 3: Solve for x \n 4x = 48 \n x = 48 ÷ 4 \n x = 12",
                        "Step 4: Check \n 6 × 8 = 48 \n 4 × 12 = 48",
                        "Products are equal!"
                    ),
                    answer = "4 workers will take 12 days"
                ),

                Slide.ConceptSlide(
                    id = 8,
                    title = "Identifying Inverse Proportion",
                    content = "How to recognize inverse proportion:",
                    keyPoints = listOf(
                        "Ask: When one goes up, does the other go down?",
                        "Examples of inverse proportion: \n • Speed ∝ 1/Time (for same distance) \n • Workers ∝ 1/Time (for same job) \n • People sharing ∝ 1/Share per person \n • Pipe diameter ∝ 1/Fill time",
                        "Key rule: \n Product of both quantities = constant \n x₁ × y₁ = x₂ × y₂"
                    )
                ),

                Slide.PracticeSlide(
                    id = 9,
                    question = "If a car traveling at 60 km/h takes 4 hours for a trip, how long at 80 km/h?",
                    options = listOf("2 hours", "3 hours", "5 hours", "6 hours"),
                    correctAnswer = 1,
                    explanation = "Correct! This is inverse proportion. 60 × 4 = 240. Then 80 × x = 240, so x = 3 hours."
                ),

                Slide.ConceptSlide(
                    id = 10,
                    title = "Direct vs Inverse: Quick Check",
                    content = "How to quickly identify which type:",
                    keyPoints = listOf(
                        "DIRECT Proportion: \n ↑ ... ↑ (both increase) \n ↓ ... ↓ (both decrease) \n Same direction",
                        "Formula: y/x = k",
                        "INVERSE Proportion: \n ↑ ... ↓ (one up, one down) \n ↓ ... ↑ (one down, one up) \n Opposite directions",
                        "Formula: x × y = k",
                        "Quick test: If doubling one value",
                        "doubles the other → DIRECT",
                        "halves the other → INVERSE"
                    )
                ),

                Slide.ConceptSlide(
                    id = 11,
                    title = "Type 3: Partitive Proportion",
                    content = "Partitive proportion is used to divide a whole into parts based on a given ratio.",
                    keyPoints = listOf(
                        "Used for fair sharing or distribution",
                        "Divides a total according to a ratio",
                        "Example: \n Divide ₱600 in ratio 2:3:5",
                        "Steps: \n 1. Add ratio parts: 2 + 3 + 5 = 10 \n 2. Divide total by sum: ₱600 ÷ 10 = ₱60 \n 3. Multiply each ratio part: \n • First: 2 × 60 = ₱120 \n • Second: 3 × 60 = ₱180 \n • Third: 5 × 60 = ₱300 \n 4. Check: 120 + 180 + 300 = 600"
                    )
                ),

                Slide.ExampleSlide(
                    id = 12,
                    title = "Example: Partitive Proportion",
                    problem = "Three friends earned ₱1,200. They agreed to split it in the ratio 3:4:5. How much does each receive?",
                    steps = listOf(
                        "Given: \n Total: ₱1,200 \n Ratio: 3:4:5",
                        "Step 1: Add ratio parts \n 3 + 4 + 5 = 12",
                        "Step 2: Find value of 1 part \n ₱1,200 ÷ 12 = ₱100 per part",
                        "Step 3: Calculate each share \n First friend: 3 × 100 = ₱300 \n Second friend: 4 × 100 = ₱400 \n Third friend: 5 × 100 = ₱500",
                        "Step 4: Verify \n ₱300 + ₱400 + ₱500 = ₱1,200"
                    ),
                    answer = "₱300, ₱400, and ₱500 respectively"
                ),

                Slide.PracticeSlide(
                    id = 13,
                    question = "Divide ₱840 among Ana, Ben, and Carl in ratio 2:3:7. How much does Ben get?",
                    options = listOf("₱140", "₱210", "₱280", "₱490"),
                    correctAnswer = 1,
                    explanation = "Correct! Total parts: 2+3+7 = 12. Value per part: 840÷12 = 70. Ben's share: 3×70 = ₱210"
                ),

                Slide.ExampleSlide(
                    id = 14,
                    title = "Real-World Partitive Example",
                    problem = "A 360-meter fence is divided among three neighbors in ratio 4:5:6. What length does each get?",
                    steps = listOf(
                        "Given: \n Total length: 360 meters \n Ratio: 4:5:6",
                        "Step 1: Sum of ratio \n 4 + 5 + 6 = 15 parts",
                        "Step 2: Value per part \n 360 ÷ 15 = 24 meters",
                        "Step 3: Each share \n First neighbor: 4 × 24 = 96 m \n Second neighbor: 5 × 24 = 120 m \n Third neighbor: 6 × 24 = 144 m",
                        "Step 4: Check \n 96 + 120 + 144 = 360 m"
                    ),
                    answer = "96 m, 120 m, and 144 m"
                ),

                Slide.PracticeSlide(
                    id = 15,
                    question = "Which type of proportion? '10 workers finish in 6 days; 15 workers finish in x days'",
                    options = listOf("Direct", "Inverse", "Partitive"),
                    correctAnswer = 1,
                    explanation = "Correct! This is INVERSE proportion. More workers means less time needed (opposite directions)."
                ),

                Slide.PracticeSlide(
                    id = 16,
                    question = "Which type? 'Divide ₱500 among 3 people in ratio 2:3:5'",
                    options = listOf("Direct", "Inverse", "Partitive"),
                    correctAnswer = 2,
                    explanation = "Correct! This is PARTITIVE proportion. We're dividing a total according to a ratio."
                ),

                Slide.ConceptSlide(
                    id = 17,
                    title = "Comparing All Three Types",
                    content = "Quick reference guide:",
                    keyPoints = listOf(
                        "DIRECT Proportion: \n • Same direction (↑↑ or ↓↓) \n • y/x = constant \n • Example: More items → Higher cost",
                        "INVERSE Proportion: \n • Opposite directions (↑↓ or ↓↑) \n • x × y = constant \n • Example: More workers → Less time",
                        "PARTITIVE Proportion: \n • Dividing by ratio \n • Sum of parts, distribute by ratio \n • Example: Sharing money 2:3:5"
                    )
                ),

                Slide.SummarySlide(
                    id = 18,
                    title = "Summary",
                    keyPoints = listOf(
                        "Direct Proportion: \n • Quantities change together (same direction) \n • When one increases/decreases, so does the other \n • Formula: y/x = k or y = kx",
                        "Inverse Proportion: \n • Quantities change oppositely \n • One increases while the other decreases \n • Formula: xy = k or y = k/x",
                        "Partitive Proportion: \n • Dividing a whole by a ratio \n • Steps: Add parts → Find unit value → Multiply \n • Used for fair sharing/distribution",
                        "Remember: \n Direct = Same direction \n Inverse = Opposite direction \n Partitive = Division by ratio"
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
                    content = "In this topic, you will learn to understand percent as a ratio to 100. You'll also learn to identify the percentage, rate, and base in a given problem."
                ),

                Slide.ConceptSlide(
                    id = 2,
                    title = "What is Percent?",
                    content = "Percent is a ratio that compares a number to 100.",
                    keyPoints = listOf(
                        "Can be written as a fraction with 100 as denominator",
                        "The symbol '%' represents percent",
                        "Called the 'percent sign'",
                        "Examples: \n 50% = ⁵⁰⁄₁₀₀ = ½ \n 25% = ²⁵⁄₁₀₀ = ¼ \n 75% = ⁷⁵⁄₁₀₀ = ¾",
                        "The word 'percent' means 'per hundred'"
                    )
                ),

                Slide.ConceptSlide(
                    id = 3,
                    title = "What is Rate?",
                    content = "The rate is the number that is compared to 100. It represents 'how much per hundred'.",
                    keyPoints = listOf(
                        "Usually has a percent sign (%) with it",
                        "Or the word 'percent' after it",
                        "Tells what portion of the base we're talking about",
                        "Examples of rates: \n • 20% (twenty percent) \n • 50% (fifty percent) \n • 75% (seventy-five percent)",
                        "The rate answers: 'What percent?'"
                    )
                ),

                Slide.ConceptSlide(
                    id = 4,
                    title = "What is Base?",
                    content = "The base is the whole number or total amount from which a part is taken.",
                    keyPoints = listOf(
                        "Represents the total or whole amount",
                        "The '100%' in a situation",
                        "The complete quantity we start with",
                        "Examples: \n • Total money you have \n • Total students in class \n • Original price of an item \n • Full capacity of a container",
                        "The base answers: 'Percent of what?'"
                    )
                ),

                Slide.ConceptSlide(
                    id = 5,
                    title = "Understanding Through an Example",
                    content = "Let's analyze a simple problem to see how these three concepts work together:",
                    keyPoints = listOf(
                        "In the next slide, we'll look at a real situation",
                        "Pay attention to how we identify: \n • The percentage (P) \n • The rate (R) \n • The base (B)",
                        "Understanding these will help you solve",
                        "all percentage problems easily!"
                    )
                ),

                Slide.ExampleSlide(
                    id = 6,
                    title = "Example Problem",
                    problem = "Jimmy gets a daily allowance of ₱100.00. He spends ₱50.00 on snacks, which is 50% of his allowance.",
                    steps = listOf(
                        "Let's write this as a statement:",
                        "50% of ₱100.00 is ₱50.00",
                        "This simple statement contains all three parts: \n • The percentage (the part) \n • The rate (the percent) \n • The base (the whole)",
                        "Let's identify each one in the next slide..."
                    ),
                    answer = "50% of ₱100.00 is ₱50.00"
                ),

                Slide.ConceptSlide(
                    id = 7,
                    title = "Identifying the Parts",
                    content = "In the statement: 50% of ₱100.00 is ₱50.00",
                    keyPoints = listOf(
                        "Let P = Percentage, R = Rate, B = Base",
                        "₱50.00 = Percentage (P) \n • The amount or number that represents the part \n • The result or answer \n • What Jimmy actually spent",
                        "50% = Rate (R) \n • The number compared to 100 \n • Has the percent sign (%) with it \n • Tells us 'how much per hundred'",
                        "₱100.00 = Base (B) \n • Represents the total amount or the whole \n • Jimmy's complete allowance \n • The starting amount (100%)"
                    )
                ),

                Slide.ConceptSlide(
                    id = 8,
                    title = "Quick Identification Tips",
                    content = "How to quickly spot each part in a problem:",
                    keyPoints = listOf(
                        "RATE (R): \n Look for the % sign \n Or the word 'percent' \n Asks: 'What percent?'",
                        "BASE (B): \n The total or whole amount \n Usually follows 'of' \n Asks: 'Percent of what?'",
                        "PERCENTAGE (P): \n The part or result \n Usually follows 'is' \n Asks: 'What is the amount?'",
                        "Pattern: [Rate] of [Base] is [Percentage]"
                    )
                ),

                Slide.PracticeSlide(
                    id = 9,
                    question = "Maria has ₱200.00 for her school lunch. She uses ₱60.00 to buy a meal, which is 30% of her money. What is the BASE in this problem?",
                    options = listOf("₱200.00", "₱60.00", "30%", "₱140.00"),
                    correctAnswer = 0,
                    explanation = "Correct! The base is ₱200.00 because it represents the total amount Maria has - the whole from which a part is taken."
                ),

                Slide.PracticeSlide(
                    id = 10,
                    question = "Kevin saved ₱150.00 from his weekly allowance. He used ₱30.00 to buy a new notebook, and this amount is 20% of his total savings. What is the PERCENTAGE in this problem?",
                    options = listOf("₱150.00", "₱30.00", "20%", "₱120.00"),
                    correctAnswer = 1,
                    explanation = "Correct! The percentage is ₱30.00 because it represents the part or amount that is 20% of the total savings."
                ),

                Slide.PracticeSlide(
                    id = 11,
                    question = "Anna has ₱250.00 in her coin bank. She donates ₱25.00 to a school charity, which is 10% of her total savings. What is the RATE in this problem?",
                    options = listOf("₱250.00", "₱25.00", "10%", "₱225.00"),
                    correctAnswer = 2,
                    explanation = "Correct! The rate is 10% because it's the number with the percent sign that tells us what portion of the total is being used."
                ),

                Slide.ConceptSlide(
                    id = 12,
                    title = "Remember the Pattern",
                    content = "Most percentage problems follow this pattern:",
                    keyPoints = listOf(
                        "Statement form: \n [RATE] of [BASE] is [PERCENTAGE]",
                        "Examples: \n • 25% of 80 is 20 \n   Rate: 25%  |  Base: 80  |  Percentage: 20 \n • 50% of ₱200 is ₱100 \n   Rate: 50%  |  Base: ₱200  |  Percentage: ₱100 \n • 10% of 150 students is 15 students \n   Rate: 10%  |  Base: 150  |  Percentage: 15",
                        "Once you recognize this pattern,",
                        "identifying P, R, and B becomes easy!"
                    )
                ),

                Slide.SummarySlide(
                    id = 13,
                    title = "Summary",
                    keyPoints = listOf(
                        "Percent: \n • A ratio that compares a number to 100 \n • Uses the symbol %",
                        "Rate (R): \n • The percent itself (has % sign) \n • Answers: 'What percent?'",
                        "Base (B): \n • The total or whole amount \n • Answers: 'Percent of what?'",
                        "Percentage (P): \n • The part or result \n • Answers: 'What is the amount?'",
                        "Pattern: [Rate] of [Base] is [Percentage]",
                        "Remember: The rate has %, the base is the total, and the percentage is the part."
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
                    content = "In this topic, you will learn how to use Techan's Triangle to find percentage, rate, or base in problems. This is a powerful tool that makes solving percentage problems easy!"
                ),

                Slide.ConceptSlide(
                    id = 2,
                    title = "What is Techan's Triangle?",
                    content = "Techan's Triangle is a helpful visual tool that shows the relationship between Percentage (P), Rate (R), and Base (B).",
                    imageResourceId = R.drawable.techans_triangle,
                    keyPoints = listOf(
                        "A memory aid for percentage formulas",
                        "Shows how P, R, and B relate to each other",
                        "Makes it easy to remember which formula to use",
                        "The triangle has three sections: \n • P (Percentage) at the top \n • R (Rate) at bottom left \n • B (Base) at bottom right",
                        "By covering the part you want to find, the triangle shows you the formula!"
                    )
                ),

                Slide.ConceptSlide(
                    id = 3,
                    title = "How to Use Techan's Triangle",
                    content = "The triangle reveals three important formulas:",
                    imageResourceId = R.drawable.techans_triangle,
                    keyPoints = listOf(
                        "Three formulas from the triangle: \n 1. P = B × R (Percentage = Base times Rate) \n 2. B = P ÷ R (Base = Percentage divided by Rate) \n 3. R = P ÷ B (Rate = Percentage divided by Base)",
                        "The triangle helps you remember which formula to use for each situation!"
                    )
                ),

                Slide.ConceptSlide(
                    id = 4,
                    title = "Finding Percentage (P)",
                    content = "To find the percentage, cover P in the triangle:",
                    imageResourceId = R.drawable.techans_triangle_cover_p,
                    keyPoints = listOf(
                        "When you cover P: \n • R and B are side by side \n • This means: MULTIPLY",
                        "Formula: P = R × B (Percentage = Rate × Base)",
                        "You use this when you know: \n • The rate (percent) \n• The base (total amount) \n• And need to find: the percentage (part)",
                        "Example: Find 25% of 80 \n R = 25%, B = 80, \n find P \n P = 25% × 80"
                    )
                ),

                Slide.ExampleSlide(
                    id = 5,
                    title = "Example: Finding Percentage (P = R × B)",
                    problem = "Find 50% of 80",
                    steps = listOf(
                        "Given: Rate (R) = 50% Base (B) = 80",
                        "Find: Percentage (P)",
                        "Method 1: Using Decimal \n P = R × B \n P = 50% × 80 \n P = 0.50 × 80  (convert 50% to 0.50) \n P = 40",
                        "Method 2: Using Proportion \n ⁵⁰⁄₁₀₀ = ᴾ⁄₈₀  (50% means ⁵⁰⁄₁₀₀) \n Cross-multiply: 100P = 50 × 80 \n 100P = 4,000 \n P = 4,000 ÷ 100 \n P = 40"
                    ),
                    answer = "50% of 80 is 40"
                ),

                Slide.PracticeSlide(
                    id = 6,
                    question = "Find 20% of 100",
                    options = listOf("20", "10", "25", "30"),
                    correctAnswer = 0,
                    explanation = "Correct! P = R × B = 20% × 100 = 0.20 × 100 = 20"
                ),

                Slide.ConceptSlide(
                    id = 7,
                    title = "Finding Base (B)",
                    content = "To find the base, cover B in the triangle:",
                    imageResourceId = R.drawable.techans_triangle_cover_b, // You'll need this image
                    keyPoints = listOf(
                        "When you cover B: \n • P is above R \n • This means: DIVIDE",
                        "Formula: B = P ÷ R (Base = Percentage ÷ Rate)",
                        "You use this when you know: \n • The percentage (part) \n • The rate (percent) \n • And need to find: the base (total)",
                        "Example: 8 is 20% of what number? \n P = 8, R = 20%, find B \n B = 8 ÷ 20%"
                    )
                ),

                Slide.ExampleSlide(
                    id = 8,
                    title = "Example: Finding Base (B = P ÷ R)",
                    problem = "In Mrs. Borja's Math class, 8 pupils got high scores on the test. If this is 20% of the total number of pupils in the class, how many pupils does she have in all?",
                    steps = listOf(
                        "Given: Percentage (P) = 8 pupils Rate (R) = 20%",
                        "Find: Base (B) - total pupils",
                        "Method 1: Using Decimal \n B = P ÷ R \n B = 8 ÷ 20% \n B = 8 ÷ 0.20  (convert 20% to 0.20) \n B = 40",
                        "Method 2: Using Proportion \n ²⁰⁄₁₀₀ = ⁸⁄ᴮ \n Cross-multiply: 20B = 8 × 100 \n 20B = 800 \n B = 800 ÷ 20 \n B = 40"
                    ),
                    answer = "There are 40 pupils in total"
                ),

                Slide.PracticeSlide(
                    id = 9,
                    question = "8 is 25% of what number?",
                    options = listOf("30", "25", "18", "32"),
                    correctAnswer = 3,
                    explanation = "Correct! B = P ÷ R = 8 ÷ 25% = 8 ÷ 0.25 = 32"
                ),

                Slide.ConceptSlide(
                    id = 10,
                    title = "Finding Rate (R)",
                    content = "To find the rate, cover R in the triangle:",
                    imageResourceId = R.drawable.techans_triangle_cover_r,
                    keyPoints = listOf(
                        "When you cover R: \n • P is above B \n • This means: DIVIDE",
                        "Formula: R = P ÷ B (Rate = Percentage ÷ Base)",
                        "You use this when you know: \n • The percentage (part) \n • The base (total) \n • And need to find: the rate (percent)",
                        "Example: 15 is what percent of 60? \n P = 15, B = 60, find R \n R = 15 ÷ 60"
                    )
                ),

                Slide.ExampleSlide(
                    id = 11,
                    title = "Example: Finding Rate (R = P ÷ B)",
                    problem = "15 is what percent of 60?",
                    steps = listOf(
                        "Given: Percentage (P) = 15 Base (B) = 60",
                        "Find: Rate (R)",
                        "Method 1: Using Fraction \n R = P ÷ B \n R = 15 ÷ 60 \n R = ¹⁵⁄₆₀ = ¼ = 0.25 \n R = 0.25 × 100% = 25%",
                        "Method 2: Using Proportion \n ᴿ⁄₁₀₀ = ¹⁵⁄₆₀ \n Cross-multiply: R × 60 = 15 × 100 \n 60R = 1,500 \n R = 1,500 ÷ 60 \n R = 25%"
                    ),
                    answer = "15 is 25% of 60"
                ),

                Slide.PracticeSlide(
                    id = 12,
                    question = "3 is what percent of 15?",
                    options = listOf("10%", "15%", "3%", "20%"),
                    correctAnswer = 3,
                    explanation = "Correct! R = P ÷ B = 3 ÷ 15 = ³⁄₁₅ = ⅕ = 0.20 = 20%"
                ),

                Slide.ConceptSlide(
                    id = 13,
                    title = "Converting Between Forms",
                    content = "Important conversions you need to know:",
                    keyPoints = listOf(
                        "Percent to Decimal: \n • Move decimal point 2 places left \n • 50% = 0.50 \n • 25% = 0.25 \n • 8% = 0.08",
                        "Decimal to Percent: \n • Move decimal point 2 places right \n • 0.75 = 75% \n • 0.40 = 40% \n • 0.05 = 5%",
                        "Percent to Fraction: \n • Write over 100, then simplify \n • 50% = ⁵⁰⁄₁₀₀ = ½ \n • 25% = ²⁵⁄₁₀₀ = ¼"
                    )
                ),

                Slide.ConceptSlide(
                    id = 14,
                    title = "Choosing the Right Formula",
                    content = "Quick guide to selecting which formula to use:",
                    keyPoints = listOf(
                        "Ask yourself: What am I looking for?",
                        "Finding the PERCENTAGE (part)? \n → Use P = R × B \n → Multiply rate and base",
                        "Finding the BASE (total)? \n → Use B = P ÷ R \n → Divide percentage by rate",
                        "Finding the RATE (percent)? \n → Use R = P ÷ B \n → Divide percentage by base",
                        "Remember: The Techan's Triangle shows you exactly which operation to use!"
                    )
                ),

                Slide.SummarySlide(
                    id = 15,
                    title = "Summary",
                    keyPoints = listOf(
                        "Techan's Triangle shows three formulas:",
                        "Finding Percentage (P): \n • P = R × B \n • Cover P → R and B are side by side → multiply",
                        "Finding Base (B): \n • B = P ÷ R \n • Cover B → P is over R → divide",
                        "Finding Rate (R): \n • R = P ÷ B \n • Cover R → P is over B → divide",
                        "Two methods to solve: \n • Using decimals (convert % to decimal) \n • Using proportions (set up fraction = fraction)",
                        "The triangle makes it easy to remember!"
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
                    content = "In this topic, you will learn to solve both routine and non-routine problems involving percentage, rate, and base. You'll apply everything you've learned to real-world situations!"
                ),

                Slide.ConceptSlide(
                    id = 2,
                    title = "Problem-Solving Steps Review",
                    content = "Remember the 4-step method for solving word problems:",
                    keyPoints = listOf(
                        "1. UNDERSTAND \n • What is asked? \n • What are the given facts?",
                        "2. PLAN \n • What operation(s) to use? \n • Write the number sentence",
                        "3. SOLVE \n • Carry out your plan \n • Show all work",
                        "4. CHECK \n • Verify your answer makes sense \n • Work backwards if possible"
                    )
                ),

                Slide.ExampleSlide(
                    id = 3,
                    title = "Complete Example Problem",
                    problem = "There were 200 participants attending the Mathematics Seminar workshop. 40% of these were men and the rest were women. How many women participated in the Mathematics Seminar workshop?",
                    steps = listOf(
                        "1. UNDERSTAND:",
                        "What is asked? \n • Number of women participants",
                        "What are the given facts? \n • 200 total participants \n • 40% were men \n • The rest were women",
                        "Let's move to the PLAN step..."
                    ),
                    answer = "We understand the problem"
                ),

                Slide.ExampleSlide(
                    id = 4,
                    title = "Step 2: PLAN",
                    problem = "There were 200 participants attending the Mathematics Seminar workshop. 40% of these were men and the rest were women. How many women participated?",
                    imageResourceId = R.drawable.percentage_diagram,
                    steps = listOf(
                        "2. PLAN:",
                        "What operation to use? \n • Subtraction and Multiplication",
                        "Number sentence: \n • If 40% were men, then: \n   100% − 40% = 60% were women \n • So we need to find: \n   60% of 200 = ?",
                        "Formula to use: \n P = R × B \n P = 60% × 200",
                        "Now let's SOLVE..."
                    ),
                    answer = "Plan: Find 60% of 200"
                ),

                Slide.ExampleSlide(
                    id = 5,
                    title = "Step 3: SOLVE",
                    problem = "Find the number of women participants",
                    steps = listOf(
                        "3. SOLVE:",
                        "Using the formula P = R × B: \n P = 60% × 200 \n P = 0.60 × 200  (convert 60% to decimal) \n P = 120",
                        "Answer: \n There were 120 women participants \n in the seminar workshop. \n Now let's CHECK our answer..."
                    ),
                    answer = "120 women participants"
                ),

                Slide.ExampleSlide(
                    id = 6,
                    title = "Step 4: CHECK",
                    problem = "Verify the answer is correct",
                    steps = listOf(
                        "4. CHECK:",
                        "Method: Verify the totals add up",
                        "Men participants: \n 40% × 200 = 0.40 × 200 = 80 men",
                        "Women participants: \n 60% × 200 = 0.60 × 200 = 120 women",
                        "Total check: \n 80 + 120 = 200",
                        "Percent check:\n 40% + 60% = 100%",
                        "Our answer is correct!"
                    ),
                    answer = "Verified: 120 women is correct"
                ),

                Slide.PracticeSlide(
                    id = 7,
                    question = "There were 350 students who joined a Science Fair. If 30% of them were boys and the rest were girls, how many girls joined the Science Fair?",
                    options = listOf("245 girls", "250 girls", "255 girls", "240 girls"),
                    correctAnswer = 0,
                    explanation = "Correct! If 30% were boys, then 70% were girls. P = 70% × 350 = 0.70 × 350 = 245 girls"
                ),

                Slide.ConceptSlide(
                    id = 8,
                    title = "Types of Percentage Problems",
                    content = "Common problem types you'll encounter:",
                    keyPoints = listOf(
                        "Type 1: Finding the Part (Percentage) \n • Given: rate and base \n • Find: percentage \n • Example: What is 25% of 80?",
                        "Type 2: Finding the Whole (Base) \n • Given: rate and percentage \n • Find: base \n • Example: 15 is 30% of what number?",
                        "Type 3: Finding the Percent (Rate) \n • Given: percentage and base \n • Find: rate \n • Example: 20 is what percent of 80?",
                        "Identify which type to choose the right formula!"
                    )
                ),

                Slide.ExampleSlide(
                    id = 9,
                    title = "Non-Routine Problem Example",
                    problem = "A shirt originally costs ₱800. During a sale, it's marked down by 25%. After the sale, the store increases the sale price by 10%. What is the final price?",
                    steps = listOf(
                        "This is NON-ROUTINE because: \n • Multiple steps needed \n • Two percentage calculations",
                        "1. UNDERSTAND: \n • Original: ₱800 \n • First: 25% discount \n • Then: 10% increase on sale price \n • Find: final price",
                        "2. PLAN: \n Step A: Find sale price (decrease) \n Step B: Find final price (increase)",
                        "Let's solve..."
                    ),
                    answer = "Multi-step problem"
                ),

                Slide.ExampleSlide(
                    id = 10,
                    title = "Solving the Non-Routine Problem",
                    problem = "Continue solving the shirt price problem",
                    steps = listOf(
                        "3. SOLVE:",
                        "Step A: Find sale price after 25% off \n Discount = 25% × ₱800 \n Discount = 0.25 × 800 = ₱200 \n Sale price = 800 − 200 = ₱600",
                        "Step B: Find final price after 10% increase \n Increase = 10% × ₱600 \n Increase = 0.10 × 600 = ₱60 \n Final price = 600 + 60 = ₱660",
                        "4. CHECK: \n Original: ₱800 \n After 25% off: ₱600 (75% of 800) \n After 10% up: ₱660 (110% of 600)"
                    ),
                    answer = "Final price: ₱660"
                ),

                Slide.PracticeSlide(
                    id = 11,
                    question = "A store has 80 items. 45 were sold. What percent of items were sold?",
                    options = listOf("45%", "50.25%", "56.25%", "62.5%"),
                    correctAnswer = 2,
                    explanation = "Correct! R = P ÷ B = 45 ÷ 80 = 0.5625 = 56.25%"
                ),

                Slide.ConceptSlide(
                    id = 12,
                    title = "Common Mistakes to Avoid",
                    content = "Watch out for these errors:",
                    keyPoints = listOf(
                        "Forgetting to convert % to decimal \n 50% ≠ 50, it equals 0.50",
                        "Using wrong formula \n Check what you're finding: P, R, or B?",
                        "Not reading 'the rest' carefully \n 'The rest' = 100% minus given percent",
                        "Rushing without a plan \n Always use the 4 steps! \n Convert percentages properly \n Use Techan's Triangle \n Show all your work \n Always check your answer"
                    )
                ),

                Slide.SummarySlide(
                    id = 13,
                    title = "Summary",
                    keyPoints = listOf(
                        "Solving percentage problems: \n Use the 4-step method (UPSC) \n Identify P, R, and B from the problem \n Choose the right formula using Techan's Triangle",
                        "Finding Percentage (P): \n Multiply rate by base (P = R × B)",
                        "Finding Base (B): \n Divide percentage by rate (B = P ÷ R)",
                        "Finding Rate (R): \n Divide percentage by base (R = P ÷ B)",
                        "Remember: \n Convert percent to decimal when multiplying/dividing \n 'The rest' means 100% minus the given percent \n Always check your answer makes sense \n Multi-step problems need careful planning"
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
                    title = "Example: Calculating Discount",
                    problem = "If a ₱500 shirt has a 20% discount, what is the discount amount?",
                    steps = listOf(
                        "Given: \n Original Price = ₱500 \n Discount Rate = 20%",
                        "Using the formula: \n Discount = Original Price × Discount Rate ÷ 100 \n Discount = 500 × 20 ÷ 100 \n Discount = 10,000 ÷ 100 \n Discount = ₱100",
                        "Alternative method: \n Discount = 500 × 0.20 = ₱100"
                    ),
                    answer = "The discount is ₱100"
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
                    title = "Complete Example",
                    problem = "A shirt originally costs ₱500 and has a ₱100 discount. What is the sale price?",
                    steps = listOf(
                        "Given: \n Original Price = ₱500 \n Discount = ₱100",
                        "Using the formula: \n Sale Price = Original Price − Discount \n Sale Price = 500 − 100 \n Sale Price = ₱400",
                        "This is the amount you actually pay when buying the shirt on sale."
                    ),
                    answer = "Sale Price = ₱400"
                ),

                Slide.PracticeSlide(
                    id = 10,
                    question = "True or False: Discount (D) refers to a reduction in the price of an item, representing the amount subtracted from the original price.",
                    options = listOf("True", "False"),
                    correctAnswer = 0,
                    explanation = "Correct! The discount is the amount of money reduced from the original price."
                ),

                Slide.ExampleSlide(
                    id = 11,
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
                    id = 12,
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
                    id = 13,
                    question = "A bag originally costs ₱1,200 with a 25% discount. What is the sale price?",
                    options = listOf("₱900", "₱800", "₱950", "₱1,000"),
                    correctAnswer = 0,
                    explanation = "Correct! Discount = 1,200 × 0.25 = ₱300. Sale Price = 1,200 − 300 = ₱900"
                ),

                Slide.SummarySlide(
                    id = 14,
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
                    title = "Example: Finding Markup Rate",
                    problem = "A store buys a phone for ₱10,000 and adds ₱2,000 markup. What is the markup rate?",
                    steps = listOf(
                        "Given: \n Cost (C) = ₱10,000 \n Markup (M) = ₱2,000",
                        "Using the formula: \n MR = (M ÷ C) × 100% \n MR = (2,000 ÷ 10,000) × 100% \n MR = 0.20 × 100% \n MR = 20%",
                        "The store is adding a 20% markup"
                    ),
                    answer = "Markup Rate = 20%"
                ),

                Slide.ConceptSlide(
                    id = 6,
                    title = "Formula for Selling Price",
                    content = "To find what the customer pays:",
                    keyPoints = listOf(
                        "Selling Price (SP) = Cost (C) + Markup (M)",
                        "Or: SP = C + M",
                        "Example: \n Cost: ₱10,000 \n Markup: ₱2,000 \n Selling Price: ₱10,000 + ₱2,000 = ₱12,000"
                    )
                ),

                Slide.ExampleSlide(
                    id = 7,
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

                Slide.PracticeSlide(
                    id = 8,
                    question = "True or False: Markup price is the amount added to the cost price of an item to get its selling price.",
                    options = listOf("True", "False"),
                    correctAnswer = 0,
                    explanation = "Correct! Markup is added to the cost to determine the selling price."
                ),

                Slide.PracticeSlide(
                    id = 9,
                    question = "A shirt costs ₱200. With a 40% markup, what is the selling price?",
                    options = listOf("₱240", "₱260", "₱280", "₱300"),
                    correctAnswer = 2,
                    explanation = "Correct! Markup = 200 × 0.40 = ₱80. Selling Price = 200 + 80 = ₱280"
                ),

                Slide.ConceptSlide(
                    id = 10,
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
                    id = 11,
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
                    title = "Example: Finding Commission",
                    problem = "A salesperson sold ₱50,000 worth of products with a 6% commission rate. How much commission did they earn?",
                    steps = listOf(
                        "Given:",
                        "Total Sales (TS) = ₱50,000",
                        "Commission Rate (CR) = 6%",
                        "Using the formula: \n Commission = Total Sales × Commission Rate ÷ 100 \n Commission = 50,000 × 6 ÷ 100 \n Commission = 300,000 ÷ 100 \n Commission = ₱3,000",
                        "Alternative: \n Commission = 50,000 × 0.06 = ₱3,000"
                    ),
                    answer = "Commission earned = ₱3,000"
                ),

                Slide.ConceptSlide(
                    id = 6,
                    title = "Formula for Sale Proceeds",
                    content = "To find what remains after commission:",
                    keyPoints = listOf(
                        "Sale Proceeds = Total Sales − Commission",
                        "This is the amount the company keeps",
                        "Example: \n Total Sales = ₱50,000 \n Commission = ₱3,000 \n Sale Proceeds = 50,000 − 3,000 = ₱47,000"
                    )
                ),

                Slide.ExampleSlide(
                    id = 7,
                    title = "Complete Example",
                    problem = "A real estate agent sold a house for ₱3,000,000 with a 3% commission. How much did the agent earn, and how much goes to the seller?",
                    steps = listOf(
                        "Given: \n Total Sales = ₱3,000,000 \n Commission Rate = 3%",
                        "Step 1: Find commission \n Commission = 3,000,000 × 3% \n Commission = 3,000,000 × 0.03 \n Commission = ₱90,000",
                        "Step 2: Find sale proceeds \n Sale Proceeds = Total Sales − Commission \n Sale Proceeds = 3,000,000 − 90,000 \n Sale Proceeds = ₱2,910,000"
                    ),
                    answer = "Agent earns ₱90,000; Seller gets ₱2,910,000"
                ),

                Slide.ConceptSlide(
                    id = 8,
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
                    id = 9,
                    question = "True or False: When someone sells your product, you need to compensate them for their effort. This amount is called a Commission.",
                    options = listOf("True", "False"),
                    correctAnswer = 0,
                    explanation = "Correct! Commission is the payment given to someone for selling products or services."
                ),

                Slide.PracticeSlide(
                    id = 10,
                    question = "A salesperson earned ₱4,500 commission from ₱90,000 in sales. What was the commission rate?",
                    options = listOf("4%", "5%", "6%", "7%"),
                    correctAnswer = 1,
                    explanation = "Correct! Rate = (Commission ÷ Total Sales) × 100 = (4,500 ÷ 90,000) × 100 = 5%"
                ),

                Slide.SummarySlide(
                    id = 11,
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
                    title = "Example: Finding Sales Tax",
                    problem = "You bought groceries worth ₱850. If the sales tax rate is 12%, how much tax do you pay?",
                    steps = listOf(
                        "Given: \n Total Amount = ₱850 \n Sales Tax Rate = 12%",
                        "Using the formula: \n Sales Tax = Total Amount × Rate ÷ 100 \n Sales Tax = 850 × 12 ÷ 100 \n Sales Tax = 10,200 ÷ 100 \n Sales Tax = ₱102",
                        "Alternative: \n Sales Tax = 850 × 0.12 = ₱102"
                    ),
                    answer = "Sales Tax = ₱102"
                ),

                Slide.ConceptSlide(
                    id = 5,
                    title = "Computing Total Amount to Pay",
                    content = "To find what you actually pay:",
                    keyPoints = listOf(
                        "Total Amount to be Paid = Total Amount of Products + Sales Tax",
                        "This is what appears on your receipt",
                        "Example: \n Products = ₱850 \n Sales Tax = ₱102 \n Total to Pay = 850 + 102 = ₱952"
                    )
                ),

                Slide.ExampleSlide(
                    id = 6,
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
                    id = 7,
                    question = "True or False: When you purchase products at stores, your receipt includes a Value Added Tax (VAT) or Sales Tax.",
                    options = listOf("True", "False"),
                    correctAnswer = 0,
                    explanation = "Correct! Sales tax or VAT is commonly added to purchases and shown on receipts."
                ),

                Slide.PracticeSlide(
                    id = 8,
                    question = "A phone costs ₱15,000. With 12% sales tax, how much tax do you pay?",
                    options = listOf("₱1,500", "₱1,800", "₱2,000", "₱1,200"),
                    correctAnswer = 1,
                    explanation = "Correct! Sales Tax = 15,000 × 0.12 = ₱1,800"
                ),

                Slide.ConceptSlide(
                    id = 9,
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
                    id = 10,
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
                    title = "Example: Finding Simple Interest",
                    problem = "You deposit ₱5,000 in a bank with 4% annual interest for 3 years. How much interest will you earn?",
                    steps = listOf(
                        "Given: \n Principal (P) = ₱5,000 \n Rate (R) = 4% = 0.04 \n Time (T) = 3 years",
                        "Using the formula: \n Simple Interest = P × R × T \n I = 5,000 × 0.04 × 3 \n I = 5,000 × 0.12 \n I = ₱600",
                        "You will earn ₱600 in interest after 3 years"
                    ),
                    answer = "Interest = ₱600"
                ),

                Slide.ConceptSlide(
                    id = 6,
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
                    title = "Complete Example",
                    problem = "Maria borrowed ₱20,000 at 8% simple interest per year for 2 years. How much will she pay back in total?",
                    steps = listOf(
                        "Given: \n Principal = ₱20,000 \n Rate = 8% = 0.08 \n Time = 2 years",
                        "Step 1: Find interest \n I = P × R × T \n I = 20,000 × 0.08 × 2 \n I = 20,000 × 0.16 \n I = ₱3,200",
                        "Step 2: Find amount due \n AD = P + I \n AD = 20,000 + 3,200 \n AD = ₱23,200"
                    ),
                    answer = "Maria will pay back ₱23,200"
                ),

                Slide.PracticeSlide(
                    id = 10,
                    question = "True or False: When your parents deposit money into a savings account, the bank pays them a small amount for using their funds. This payment is known as Interest.",
                    options = listOf("True", "False"),
                    correctAnswer = 0,
                    explanation = "Correct! Interest is the money earned from keeping savings in a bank, or the extra money paid when borrowing."
                ),

                Slide.PracticeSlide(
                    id = 11,
                    question = "Find the simple interest: P = ₱8,000, R = 5%, T = 3 years",
                    options = listOf("₱1,000", "₱1,200", "₱1,500", "₱2,000"),
                    correctAnswer = 1,
                    explanation = "Correct! I = P × R × T = 8,000 × 0.05 × 3 = ₱1,200"
                ),

                Slide.ConceptSlide(
                    id = 12,
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
                    id = 13,
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
                    content = "An exponent indicates the power to which the base is raised.",
                    keyPoints = listOf(
                        "In 3², 3 is the base, and 2 is the exponent",
                        "The exponent tells you how many times to multiply the base by itself",
                        "Example: 4² means 4 × 4 = 16"
                    )
                ),

                Slide.ExampleSlide(
                    id = 3,
                    title = "Example: Multiplying the Base",
                    problem = "Calculate 4²",
                    steps = listOf(
                        "The base is 4",
                        "The exponent is 2",
                        "Multiply the base 2 times:",
                        "4 × 4 = 16"
                    ),
                    answer = "4² = 16"
                ),

                Slide.ConceptSlide(
                    id = 4,
                    title = "Special Case: Zero Exponent",
                    content = "Any positive base (not equal to zero) raised to the power of zero equals 1.",
                    keyPoints = listOf(
                        "Formula: n⁰ = 1",
                        "Example: 5⁰ = 1",
                        "Example: 100⁰ = 1",
                        "This works for any positive number"
                    )
                ),

                Slide.ExampleSlide(
                    id = 5,
                    title = "Example: Exponential Notation",
                    problem = "Write and evaluate: 5 × 5 × 5",
                    steps = listOf(
                        "Count how many times 5 is multiplied:",
                        "5 appears 3 times",
                        "Write in exponential notation: 5³",
                        "The base is 5",
                        "The exponent is 3",
                        "Evaluate: 5 × 5 × 5",
                        "5 × 5 = 25",
                        "25 × 5 = 125"
                    ),
                    answer = "5³ = 125"
                ),

                Slide.PracticeSlide(
                    id = 6,
                    question = "What is 2⁴?",
                    options = listOf("16", "32", "6", "8"),
                    correctAnswer = 0,
                    explanation = "Correct! 2⁴ = 2 × 2 × 2 × 2 = 16"
                ),

                Slide.PracticeSlide(
                    id = 7,
                    question = "What is 10 × 10 × 10?",
                    options = listOf("10", "20", "100", "1000"),
                    correctAnswer = 3,
                    explanation = "Correct! 10 × 10 × 10 = 10³ = 1,000"
                ),

                Slide.SummarySlide(
                    id = 8,
                    title = "Summary",
                    keyPoints = listOf(
                        "Exponents show how many times a base is multiplied by itself",
                        "In aⁿ, 'a' is the base and 'n' is the exponent",
                        "Any positive base raised to the zero exponent equals 1 (n⁰ = 1)",
                        "Exponential notation: repeated multiplication written compactly",
                        "Example: 5 × 5 × 5 = 5³ = 125"
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
                    content = "GEMDAS is the order in which you perform mathematical operations:",
                    keyPoints = listOf(
                        "G - Grouping symbols ( ), [ ], { }",
                        "E - Exponents",
                        "M - Multiplication",
                        "D - Division",
                        "A - Addition",
                        "S - Subtraction",
                        "Note: MD and AS are performed left to right"
                    )
                ),

                Slide.ConceptSlide(
                    id = 3,
                    title = "What does PEMDAS stand for?",
                    content = "PEMDAS is another name for the same rule:",
                    keyPoints = listOf(
                        "P - Parenthesis",
                        "E - Exponents (like 2³)",
                        "M - Multiplication",
                        "D - Division",
                        "A - Addition",
                        "S - Subtraction",
                        "Important: In MD, do whichever comes first left to right",
                        "Important: In AS, do whichever comes first left to right"
                    )
                ),

                Slide.ConceptSlide(
                    id = 4,
                    title = "Common Mistake Example",
                    content = "Let's see what happens when you DON'T follow GEMDAS:",
                    keyPoints = listOf(
                        "Problem: 4 + 1 × 5",
                        "WRONG way (left to right only):",
                        "4 + 1 = 5",
                        "5 × 5 = 25 ✗",
                        "This is INCORRECT!",
                        "We must follow GEMDAS order"
                    )
                ),

                Slide.ExampleSlide(
                    id = 5,
                    title = "Correct Example Using GEMDAS",
                    problem = "Solve: 4 + 1 × 5",
                    steps = listOf(
                        "Step 1: Check GEMDAS order",
                        "No grouping symbols or exponents",
                        "Next is Multiplication",
                        "Step 2: Do multiplication first \n 1 × 5 = 5",
                        "Expression becomes: 4 + 5",
                        "Step 3: Now do addition \n 4 + 5 = 9",
                        "Final answer: 9"
                    ),
                    answer = "9"
                ),

                Slide.ExampleSlide(
                    id = 6,
                    title = "Complex Example with All Operations",
                    problem = "Solve: 4² + 4(4 − 2) − 2",
                    steps = listOf(
                        "Step 1: Parentheses first (Grouping) \n 4² + 4(4 − 2) − 2 \n 4² + 4(2) − 2",
                        "Step 2: Exponents \n 4² = 16 \n 16 + 4(2) − 2",
                        "Step 3: Multiplication \n 4(2) = 8 \n 16 + 8 − 2",
                        "Step 4: Addition and Subtraction (left to right) \n 16 + 8 = 24 \n 24 − 2 = 22"
                    ),
                    answer = "22"
                ),

                Slide.PracticeSlide(
                    id = 7,
                    question = "Solve: 8 − 3 × 1 = ?",
                    options = listOf("12", "5", "4", "6"),
                    correctAnswer = 1,
                    explanation = "Correct! Multiply first: 3 × 1 = 3. Then subtract: 8 − 3 = 5"
                ),

                Slide.PracticeSlide(
                    id = 8,
                    question = "Solve: 1 + 9 − (4 ÷ 2) = ?",
                    options = listOf("8", "7", "6", "5"),
                    correctAnswer = 0,
                    explanation = "Correct! Parentheses first: 4 ÷ 2 = 2. Then: 1 + 9 − 2 = 10 − 2 = 8"
                ),

                Slide.SummarySlide(
                    id = 9,
                    title = "Summary",
                    keyPoints = listOf(
                        "GEMDAS/PEMDAS guides the correct order of operations:",
                        "1. Grouping symbols/Parentheses",
                        "2. Exponents",
                        "3. Multiplication and Division (left to right)",
                        "4. Addition and Subtraction (left to right)",
                        "Following this order ensures accurate answers",
                        "Common mistake: doing operations from left to right only",
                        "Always check for each operation type in GEMDAS order",
                        "Practice makes perfect!"
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
                    title = "What is an Integer?",
                    content = "Integers include all natural numbers (counting numbers), their negatives, and zero.",
                    keyPoints = listOf(
                        "Includes positive whole numbers: 1, 2, 3, 4...",
                        "Includes negative whole numbers: −1, −2, −3, −4...",
                        "Includes zero: 0",
                        "Also called: opposites or additive inverses"
                    )
                ),

                Slide.ConceptSlide(
                    id = 3,
                    title = "Example of Integers",
                    content = "Here are some examples on a number line:",
                    keyPoints = listOf(
                        "−5, −4, −3, −2, −1, 0, 1, 2, 3, 4, 5",
                        "All these are integers",
                        "They extend infinitely in both directions"
                    )
                ),

                Slide.ConceptSlide(
                    id = 4,
                    title = "Important Reminder",
                    content = "Integers do NOT include fractions or decimals.",
                    keyPoints = listOf(
                        "½ is NOT an integer",
                        "0.420 is NOT an integer",
                        "−3.5 is NOT an integer",
                        "Only whole numbers (positive, negative, or zero)",
                        "No parts or portions"
                    )
                ),

                Slide.ConceptSlide(
                    id = 5,
                    title = "What is a Number Line?",
                    content = "A number line is a visual tool for understanding integers:",
                    imageResourceId = R.drawable.number_line_opposites,
                    keyPoints = listOf(
                        "A straight, horizontal line",
                        "Numbers placed at evenly spaced intervals",
                        "Used to represent real numbers and their relationships",
                        "Zero is in the middle",
                        "Negative numbers to the left",
                        "Positive numbers to the right"
                    )
                ),

                Slide.ConceptSlide(
                    id = 6,
                    title = "Important Note About Zero",
                    content = "Zero is special:",
                    imageResourceId = R.drawable.number_line_opposites,
                    keyPoints = listOf(
                        "0 is neither negative nor positive",
                        "It's the dividing point between positives and negatives",
                        "It's the center of the number line",
                        "It's neutral"
                    )
                ),

                Slide.ConceptSlide(
                    id = 7,
                    title = "What are Opposite Numbers?",
                    imageResourceId = R.drawable.number_line_opposites,
                    content = "On the number line, opposites are numbers that are the same distance from 0 but located on opposite sides of it.",
                    keyPoints = listOf(
                        "Example: 3 and −3 are opposites",
                        "Example: 5 and −5 are opposites",
                        "Both are the same distance from zero",
                        "But on different sides of the number line",
                        "Also called additive inverses"
                    )
                ),

                Slide.ConceptSlide(
                    id = 8,
                    title = "Additive Inverse Property",
                    content = "According to the additive inverse property:",
                    keyPoints = listOf(
                        "If you add a number to its opposite,",
                        "the result will ALWAYS be 0",
                        "This is true for any integer",
                        "Example: 7 + (−7) = 0",
                        "Example: −10 + 10 = 0"
                    )
                ),

                Slide.ExampleSlide(
                    id = 9,
                    title = "Examples of Opposite Numbers",
                    problem = "Adding opposites always equals zero:",
                    steps = listOf(
                        "−1 + 1 = 0 \n −3 + 3 = 0 \n −5 + 5 = 0 \n 10 + (−10) = 0 \n −100 + 100 = 0",
                        "The result will ALWAYS be 0"
                    ),
                    answer = "Opposite numbers sum to 0"
                ),

                Slide.PracticeSlide(
                    id = 10,
                    question = "Is 31 an integer?",
                    options = listOf("YES", "NO"),
                    correctAnswer = 0,
                    explanation = "Correct! 31 is a whole number, so it's an integer."
                ),

                Slide.PracticeSlide(
                    id = 11,
                    question = "Is 0.1 an integer?",
                    options = listOf("YES", "NO"),
                    correctAnswer = 1,
                    explanation = "Correct! 0.1 is a decimal, not a whole number, so it's NOT an integer."
                ),

                Slide.PracticeSlide(
                    id = 12,
                    question = "Are −2 and 2 opposite numbers?",
                    options = listOf("YES", "NO"),
                    correctAnswer = 0,
                    explanation = "Correct! They are the same distance from zero but on opposite sides, and −2 + 2 = 0."
                ),

                Slide.SummarySlide(
                    id = 13,
                    title = "Summary",
                    keyPoints = listOf(
                        "Integers are whole numbers: \n • Positive whole numbers (1, 2, 3...) \n • Negative whole numbers (−1, −2, −3...) \n • Zero (0)",
                        "Integers do NOT include fractions or decimals",
                        "Each integer has an opposite on the number line",
                        "Opposites are the same distance from zero",
                        "Adding a number to its opposite always equals zero",
                        "Example: 5 + (−5) = 0"
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
                ),

                Slide.ConceptSlide(
                    id = 3,
                    title = "Understanding the Number Line",
                    content = "Examine the number line below to see where positive and negative integers are positioned. It will help you compare the integers.",
                    imageResourceId = R.drawable.number_line_opposites,
                ),

                Slide.ConceptSlide(
                    id = 4,
                    title = "You Need to Know About Number Line",
                    content = "Key characteristics of the number line:",
                    keyPoints = listOf(
                        "A number line is a straight line where numbers are arranged at equal spaces, and it can extend infinitely in both directions.",
                        "Moving from zero to the right, the numbers increase in value. The farther right you go, the larger the numbers become.",
                        "In the opposite direction, moving from zero to the left, the numbers decrease in value. The farther left you go, the smaller the numbers become."
                    )
                ),

                Slide.ConceptSlide(
                    id = 5,
                    title = "Take Note",
                    content = "Important distinction:",
                    keyPoints = listOf(
                        "Positive integers are greater than zero",
                        "Negative integers are less than zero"
                    )
                ),

                Slide.ExampleSlide(
                    id = 6,
                    title = "Example: Compare the Following Pairs",
                    problem = "Compare the following pair of integers:",
                    steps = listOf(
                        "1. +8 and +10 \n+8 is to the left of +10, so +8 is less than +10",
                        "Written as: +8 < +10",
                        "2. −9 and −7 \n−9 is to the left of −7, so −9 is less than −7",
                        "Written as: −9 < −7",
                        "3. +15 and −5 \n+15 is to the right of −5, so +15 is greater than −5",
                        "Written as: +15 > −5",
                        "4. −4 and −1 \n−4 is to the left of −1, so −4 is less than −1",
                        "Written as: −4 < −1",
                        "5. +20 and +18 \n+20 is to the right of +18, so +20 is greater than +18",
                        "Written as: +20 > +18"
                    ),
                    answer = "All comparisons completed"
                ),

                Slide.PracticeSlide(
                    id = 7,
                    question = "Compare the pair of integers: +10 and −3",
                    options = listOf(
                        "+10 is to the left of −3, so +10 is less than −3, written as +10 < −3",
                        "+10 is to the right of −3, so +10 is greater than −3, written as +10 > −3"
                    ),
                    correctAnswer = 1,
                    explanation = "Correct! +10 is to the right of −3, so +10 is greater than −3, written as +10 > −3"
                ),

                Slide.SummarySlide(
                    id = 8,
                    title = "Summary",
                    keyPoints = listOf(
                        "A number line is a straight line where numbers are arranged at equal spaces, and it can extend infinitely in both directions.",
                        "Moving from zero to the right, the numbers increase in value. The farther right you go, the larger the numbers become.",
                        "In the opposite direction, moving from zero to the left, the numbers decrease in value. The farther left you go, the smaller the numbers become.",
                        "Positive integers are greater than zero, while negative integers are less than zero."
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
                    content = "In this topic you will learn how to interpret and describe the basic operations of integers—addition and subtraction—using materials such as algebra tiles."
                ),

                Slide.ConceptSlide(
                    id = 2,
                    title = "What is Adding of Integers using Algebra Tiles?",
                    content = "Adding integers using algebra tiles means combining positive tiles (for positive numbers) and negative tiles (for negative numbers).",
                    keyPoints = listOf(
                        "Tiles with the same sign are grouped together",
                        "Any positive–negative pairs cancel each other out",
                        "The remaining tiles show the sum",
                        "Blue tiles represent positive integers",
                        "Red tiles represent negative integers"
                    )
                ),

                Slide.ExampleSlide(
                    id = 3,
                    title = "Adding Integers Using Algebra Tiles",
                    problem = "Example 1: 3 + 6 = ?",
                    imageResourceId = R.drawable.adding_algebra_tiles_1,
                    steps = listOf(
                        "Blue tiles represent positive integers",
                        "3 blue tiles + 6 blue tiles = 9 blue tiles",
                        "Therefore: 3 + 6 = 9"
                    ),
                    answer = "9"
                ),

                Slide.ExampleSlide(
                    id = 4,
                    title = "Adding Negative Integers",
                    problem = "Example 2: −2 + (−6) = ?",
                    imageResourceId = R.drawable.adding_algebra_tiles_2,
                    steps = listOf(
                        "Red tiles represent negative integers",
                        "2 red tiles + 6 red tiles = 8 red tiles",
                        "Therefore: −2 + (−6) = −8"
                    ),
                    answer = "−8"
                ),

                Slide.ExampleSlide(
                    id = 5,
                    title = "Adding Integers with Different Signs",
                    problem = "Example 3: 6 + (−3) = ?",
                    imageResourceId = R.drawable.adding_algebra_tiles_3,
                    steps = listOf(
                        "Step 1: Pair each negative tile or counter with a positive one to illustrate zero pairs, where they balance to zero.",
                        "Step 2: Each pair of blue and red tiles is considered canceled out.",
                        "Step 3: The remaining colors will represent your answer.",
                        "The three pairs of blue and red tiles are canceled out.",
                        "Therefore, the three remaining blue tiles represent the answer.",
                        "Since blue tiles or counters are positive, the answer is positive 3."
                    ),
                    answer = "3"
                ),

                Slide.ConceptSlide(
                    id = 6,
                    title = "What is Subtracting of Integers using Algebra Tiles?",
                    content = "Subtracting integers using algebra tiles means representing positive numbers with positive tiles and negative numbers with negative tiles, then removing tiles based on the subtraction sign.",
                    keyPoints = listOf(
                        "If there are not enough tiles to remove, zero pairs (one positive and one negative tile) are added",
                        "This allows the subtraction to be completed",
                        "This visual method helps students understand how integer subtraction works"
                    )
                ),

                Slide.ExampleSlide(
                    id = 7,
                    title = "Subtracting Integers Using Algebra Tiles",
                    problem = "Example 1: 3 − (+4) or 3 − 4 = ?",
                    imageResourceId = R.drawable.subtracting_algebra_tiles_1,
                    steps = listOf(
                        "Start with 3 positive tiles",
                        "We need to subtract 4 positive tiles",
                        "But we only have 3 positive tiles",
                        "Add zero pairs (1 positive + 1 negative = 0)",
                        "Now remove 4 positive tiles",
                        "1 negative tile remains"
                    ),
                    answer = "−1"
                ),

                Slide.ExampleSlide(
                    id = 8,
                    title = "Subtracting Negative Integers",
                    problem = "Example 2: −4 − (−8) = ?",
                    imageResourceId = R.drawable.subtracting_algebra_tiles_2,
                    steps = listOf(
                        "Step 1: Negative multiply by negative is positive \n −4 − (−8) → −4 + 8",
                        "Step 2: Rewrite the expression \n Then, −4 + 8",
                        "Step 3: Using algebra tiles: \n 4 red tiles + 8 blue tiles \n Cancel 4 pairs of red and blue",
                        "4 blue tiles remain"
                    ),
                    answer = "4"
                ),

                Slide.PracticeSlide(
                    id = 9,
                    question = "Practice time! 8 + (−4) = ?",
                    imageResourceId = R.drawable.practice_1,
                    options = listOf("+4", "−8", "+8", "−4"),
                    correctAnswer = 0,
                    explanation = "Correct! 8 blue tiles + 4 red tiles. Cancel 4 pairs. 4 blue tiles remain. Answer: +4"
                ),

                Slide.SummarySlide(
                    id = 10,
                    title = "Summary",
                    keyPoints = listOf(
                        "Adding Integers: \n Same signs: Add the numbers and keep the sign.",
                        "Different signs: Subtract the smaller number from the larger number and keep the sign of the bigger number (in absolute value).",
                        "Zero pairs: A positive and a negative value cancel each other out.",
                        "Subtracting Integers: \n Subtraction becomes addition to the opposite. \n Rewrite the expression before solving. \n Then follow the rules of integer addition. \n Removing a positive decreases the value; removing a negative increases the value."
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
                    content = "In this lesson, you will learn how to add, subtract, multiply, and divide integers. You'll understand the rules for positive and negative signs, and use a number line to solve integer problems correctly."
                ),

                Slide.ConceptSlide(
                    id = 2,
                    title = "Multiplication and Division",
                    content = "Operation multiplication and division are easier to understand compared to adding and subtracting integers.",
                ),

                Slide.ConceptSlide(
                    id = 3,
                    title = "Multiplication of Integers",
                    content = "Examples and key points: \nExample: \n(−5) × (−5) = 25 \n−2 × 1 = −2",
                    keyPoints = listOf(
                        "When you multiply two numbers with the same sign, whether both are positive or both negative, the result is positive.",
                        "However, when you multiply numbers with opposite signs, the result is negative."
                    )
                ),

                Slide.ConceptSlide(
                    id = 4,
                    title = "Division of Integers",
                    content = "It works the same way as multiplication. \nExample: \n5 ÷ 5 = 1 \n−10 ÷ 2 = −5",
                    keyPoints = listOf(
                        "When you divide two numbers with the same sign, whether both are positive or both negative, the result is positive.",
                        "However, when you divide numbers with opposite signs, the result is negative."
                    )
                ),

                Slide.PracticeSlide(
                    id = 5,
                    question = "Practice Time!! −4 × 3 = ?",
                    options = listOf("−12", "6", "7", "−7"),
                    correctAnswer = 0,
                    explanation = "Correct! When multiplying numbers with opposite signs, the result is negative. −4 × 3 = −12"
                ),

                Slide.PracticeSlide(
                    id = 6,
                    question = "Practice Time!! 3 ÷ 1 = ?",
                    options = listOf("3", "4", "−3", "−4"),
                    correctAnswer = 0,
                    explanation = "Correct! When dividing numbers with the same sign (both positive), the result is positive. 3 ÷ 1 = 3"
                ),

                Slide.ConceptSlide(
                    id = 7,
                    title = "Addition and Subtraction",
                    content = "Addition and subtraction can be more challenging than multiplication and division.",
                    keyPoints = listOf(
                        "Many students find it confusing to understand the correct order and rules for adding and subtracting integers.",
                        "Let's learn the rules step by step!"
                    )
                ),

                Slide.ConceptSlide(
                    id = 8,
                    title = "Addition of Integers (using number line)",
                    content = "Examples using the number line:",
                    imageResourceId = R.drawable.number_line_lesson_10_1,
                    keyPoints = listOf(
                        "1. 3 + 5 = 8 \n The arrow starts with a positive 3; since the operation is addition, the direction of the arrow is counting 5 units to the right.",
                        "2. −5 + 8 = 3 \n The arrow starts with −5 counting 8 units to the right.",
                        "3. −7 + 3 = −4 \n The arrow starts with −7, counting 3 units to the right."
                    )
                ),

                Slide.ConceptSlide(
                    id = 9,
                    title = "Key Points for Addition",
                    content = "Rules for adding integers:",
                    keyPoints = listOf(
                        "Same Signs: \n Add and keep the sign. \n Example: −5 + (−3) = −8",
                        "Different Signs: \n Subtract and keep the sign of the bigger number. \n Example: −3 + 4 = 1"
                    )
                ),

                Slide.ConceptSlide(
                    id = 10,
                    title = "Subtraction of Integers (using number line)",
                    content = "Examples using the number line:",
                    imageResourceId = R.drawable.number_line_lesson_10_2,
                    keyPoints = listOf(
                        "1. 7 − 2 = 5 \n The arrow starts with a positive 7; since the operation is subtraction, the direction of the arrow is counting 2 units to the left.",
                        "2. 3 − 8 = −5 \n The arrow starts with positive 3 counting 8 units to the left.",
                        "3. −2 − 7 = −9 \n The arrow starts with negative 2, counting 7 units to the left.",
                        "4. −4 − (−5), simplify it: −4 + 5 = 1 \n Since the signs are both negative; as we mentioned earlier, negative multiplied by negative, the product is positive."
                    )
                ),

                Slide.ConceptSlide(
                    id = 11,
                    title = "Key Points for Subtraction",
                    content = "Rules for subtracting integers:",
                    keyPoints = listOf(
                        "Keep the first number.",
                        "Change the subtraction sign to addition.",
                        "Change the sign of the second number (use its opposite).",
                        "Then follow the rules for addition.",
                        "Example: 5 − (−3)",
                        "= 5 + 3",
                        "= 8"
                    )
                ),

                Slide.PracticeSlide(
                    id = 12,
                    question = "Practice Time!! 8 + (−4) = ?",
                    options = listOf("12", "4", "−4", "−12"),
                    correctAnswer = 1,
                    explanation = "Correct! Different signs: subtract and keep the sign of the bigger number. 8 − 4 = 4"
                ),

                Slide.PracticeSlide(
                    id = 13,
                    question = "Practice Time!! 6 − (−3) = ?",
                    options = listOf("3", "−3", "−9", "9"),
                    correctAnswer = 3,
                    explanation = "Correct! Change subtraction to addition and flip the sign: 6 − (−3) = 6 + 3 = 9"
                ),

                Slide.SummarySlide(
                    id = 14,
                    title = "Summary",
                    keyPoints = listOf(
                        "Multiplication and division of integers follow sign rules: \n Same signs give a positive answer \n Different signs give a negative answer",
                        "Adding integers follow sign rules: \n Same signs: add and keep the sign \n Different signs: subtract and keep the sign of the bigger number",
                        "Subtracting integers: \n Keep the first number \n Change subtraction to addition \n Use the opposite of the second number \n Then follow the addition rules"
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
                    content = "In this lesson, you will learn how to solve both routine and non-routine problems involving the basic operations of integers. You'll use the appropriate strategies and tools!"
                ),

                Slide.ExampleSlide(
                    id = 2,
                    title = "Example Word Problem: Addition",
                    problem = "Sarah had a bank balance of −₱400 because she overspent last month. This month, she deposited ₱1,000 into her account. What is her new balance?",
                    steps = listOf(
                        "1. UNDERSTAND \n a. Given facts: starting balance = −₱400; deposit = ₱1,000 \n b. Asked: the new (current) bank balance after the deposit",
                        "2. PLAN \n a. Operation: Addition \n b. Number sentence: −400 + 1,000 = N",
                        "3. SOLVE \n Compute 1,000 + (−400). Think of it as 1,000 − 400.\n    1,000\n    − 400\n    ———\n      600\n    So the new balance is ₱600.",
                        "4. CHECK\n    600 − 1,000 = −400\n    She deposits, which means she adds some money to her bank account."
                    ),
                    answer = "New balance: ₱600"
                ),

                Slide.ExampleSlide(
                    id = 3,
                    title = "Example 2: Subtraction",
                    problem = "Miko had 80 apples in her basket. She gave 10 apples to her friend. How many apples does she have left?",
                    steps = listOf(
                        "1. UNDERSTAND \n a. What are the given facts: 80 apples; given away = 10 apples \n b. Asked: apples remaining",
                        "2. PLAN \n a. Operation: Subtraction \n b. Number sentence: 80 − 10 = N",
                        "3. SOLVE\n    80\n    −10\n    ———\n    70\n    Miko has 70 apples left.",
                        "4. CHECK \n 70 + 10 = 80 → returns the original amount. \n Because she gave 10 apples to her friend, she now has 70 apples."
                    ),
                    answer = "70 apples left"
                ),

                Slide.ExampleSlide(
                    id = 4,
                    title = "Example 3: Multiplication",
                    problem = "A farmer has 9 baskets, and each basket holds 8 apples. How many apples does the farmer have in total?",
                    steps = listOf(
                        "1. UNDERSTAND \n a. Given facts: baskets = 9; apples per basket = 8 \n b. Asked: total number of apples",
                        "2. PLAN \n a. Operation: Multiplication \n b. Number sentence: 9 × 8 = N",
                        "3. SOLVE\n    9\n    × 8\n    ———\n    72\n    So total = 72 apples.",
                        "4. CHECK \n 72 ÷ 9 = 8 \n Every basket has 8 apples in it."
                    ),
                    answer = "72 apples total"
                ),

                Slide.ExampleSlide(
                    id = 5,
                    title = "Example 4: Division",
                    problem = "A teacher has 48 pencils and wants to distribute them equally among 6 students. How many pencils will each student receive?",
                    steps = listOf(
                        "1. UNDERSTAND \n a. Given facts: total pencils = 48; students = 6 \n b. Asked: pencils per student (equal share)",
                        "2. PLAN \n a. Operation: Division \n b. Number sentence: 48 ÷ 6 = N",
                        "3. SOLVE \n 48 ÷ 6 = 8 \n Each student receives 8 pencils.",
                        "4. CHECK \n 8 × 6 = 48  \n In 8, all 6 students have equally divided pencils."
                    ),
                    answer = "8 pencils per student"
                ),

                Slide.PracticeSlide(
                    id = 6,
                    question = "Lara had ₱850 in her wallet. Her mother gave her ₱275 more. How much money does Lara have now?",
                    options = listOf("₱1,125", "₱1,215", "₱1,251", "₱1,211"),
                    correctAnswer = 0,
                    explanation = "Correct! 850 + 275 = ₱1,125"
                ),

                Slide.PracticeSlide(
                    id = 7,
                    question = "A box originally contained 150 chocolates. After the party, only 68 chocolates were left. How many chocolates were eaten?",
                    options = listOf("82 chocolates", "84 chocolates", "86 chocolates", "88 chocolates"),
                    correctAnswer = 0,
                    explanation = "Correct! 150 − 68 = 82 chocolates"
                ),

                Slide.PracticeSlide(
                    id = 8,
                    question = "A gardener planted 12 rows of flowers. Each row has 7 flowers. How many flowers did he plant in total?",
                    options = listOf("82 flowers", "84 flowers", "86 flowers", "88 flowers"),
                    correctAnswer = 1,
                    explanation = "Correct! 12 × 7 = 84 flowers"
                ),

                Slide.PracticeSlide(
                    id = 9,
                    question = "There are 96 books that need to be placed equally on 8 shelves. How many books will go on each shelf?",
                    options = listOf("12 books per shelf", "14 books per shelf", "16 books per shelf", "18 books per shelf"),
                    correctAnswer = 0,
                    explanation = "Correct! 96 ÷ 8 = 12 books per shelf"
                ),

                Slide.SummarySlide(
                    id = 10,
                    title = "Summary",
                    keyPoints = listOf(
                        "Use the 4-step method to solve integer problems: \n UNDERSTAND - What's given and what's asked? \n PLAN - What operation and number sentence? \n SOLVE - Carry out the plan \n CHECK - Verify your answer",
                        "Operations with integers: \n Addition: combining values \n Subtraction: finding difference or what's left \n Multiplication: repeated addition \n Division: equal sharing or grouping",
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
                    content = "A girl was asked to clean her room and found some items.",
                    imageResourceId = R.drawable.room_objects,
                    keyPoints = listOf(
                        "The girl found: \n A bed \n A toy traffic cone \n Dice \n A soccer ball \n A coin bank"
                    )
                ),

                Slide.ConceptSlide(
                    id = 3,
                    title = "What shapes can you see from these objects?",
                    imageResourceId = R.drawable.room_objects,
                    content = "Let's identify the shapes in these real-world objects:",
                    keyPoints = listOf(
                        "Bed → rectangles",
                        "Toy traffic cone → triangles",
                        "Soccer ball → shaped like a circle",
                        "Coin bank → has 2 circles for its bases",
                        "Dice → represented by a square",
                        "The pictures above are examples of real solid figures."
                    )
                ),

                Slide.ConceptSlide(
                    id = 4,
                    title = "Take note:",
                    content = "Important distinction:",
                    keyPoints = listOf(
                        "Rectangles, squares, circles and triangles",
                        "are PLANE FIGURES",
                        "They are flat, 2-dimensional shapes"
                    )
                ),

                Slide.ConceptSlide(
                    id = 5,
                    title = "Let us differentiate between plane figures and solid figures",
                    content = "Understanding the key differences:",
                    keyPoints = listOf(
                        "We'll explore: \n What are plane figures? \n What are solid figures? \n How they differ from each other"
                    )
                ),

                Slide.ConceptSlide(
                    id = 6,
                    title = "Plane Figures",
                    content = "Characteristics of plane figures:",
                    keyPoints = listOf(
                        "Two-dimensional shape",
                        "Flat",
                        "Has length and width",
                        "No thickness or depth",
                        "Examples: rectangle, square, circle, triangle"
                    )
                ),

                Slide.ConceptSlide(
                    id = 7,
                    title = "Plane Figures",
                    content = "The pictures show flat shapes. These shapes don't have thickness and are called two-dimensional shapes, or plane figures, because they only have length and width.",
                    imageResourceId = R.drawable.plane_figures_examples,
                    keyPoints = listOf(
                        "Can be made up of: \n Straight lines \n Curved lines \n A combination of both",
                        "All are flat - no depth!"
                    )
                ),

                Slide.ConceptSlide(
                    id = 8,
                    title = "Solid Figures",
                    content = "Characteristics of solid figures:",
                    keyPoints = listOf(
                        "Three-dimensional shape",
                        "Has thickness and depth",
                        "Has length, width AND height",
                        "Takes up space",
                        "Examples: cube, sphere, cone, cylinder"
                    )
                ),

                Slide.ConceptSlide(
                    id = 9,
                    title = "Solid Figures",
                    content = "The pictures show shapes that don't lie flat on a plane. These are called space figures, or solids.",
                    imageResourceId = R.drawable.solid_figures_examples,
                    keyPoints = listOf(
                        "Solids have three dimensions: \n Length \n Width \n Height (or thickness)",
                        "The flat surfaces of a solid are called FACES",
                        "These faces are usually polygons"
                    )
                ),

                Slide.ConceptSlide(
                    id = 10,
                    title = "Base, Edge, and Vertex",
                    content = "Important parts of solid figures:",
                    imageResourceId = R.drawable.solid_parts_diagram,
                    keyPoints = listOf(
                        "BASE: \n The face that the solid rests on",
                        "EDGE: \n The line segment where two faces meet",
                        "VERTEX (plural: vertices): \n The corner where the ends of line segments of two or more faces meet",
                        "You can count the numbers of faces, edges, and vertices, and observe the shape of the base"
                    )
                ),

                Slide.ConceptSlide(
                    id = 11,
                    title = "Look and examine the table",
                    content = "Common solid figures and their properties:",
                    imageResourceId = R.drawable.solid_figures_table
                ),

                Slide.ConceptSlide(
                    id = 12,
                    title = "Description of Solid Figures",
                    content = "Part 1:",
                    keyPoints = listOf(
                        "SPHERE: \n Has a smooth, curved surface \n Every point is the same distance from the center",
                        "RECTANGULAR PRISM: \n Has six rectangular faces \n Each pair of faces intersects at an edge",
                        "CONE: \n Has a round base \n Has a curved surface that comes up to a point",
                        "CYLINDER: \n Has 2 equal and parallel circles as bases \n Has a lateral curved surface"
                    )
                ),

                Slide.ConceptSlide(
                    id = 13,
                    title = "Description of Solid Figures",
                    content = "Part 2:",
                    keyPoints = listOf(
                        "PYRAMID: \n Has a base that can be any shape \n Has triangular sides that meet at a single point",
                        "SQUARE PYRAMID: \n Has a square base",
                        "CUBE (or square prism): \n Has six square faces \n All edges are the same length \n Has 8 corners (vertices) and 12 edges",
                        "TRIANGULAR PRISM: \n Has 3 rectangular faces \n Has 2 triangular faces"
                    )
                ),

                Slide.PracticeSlide(
                    id = 14,
                    question = "Practice Time!! Is this a plane figure or solid figure?",
                    imageResourceId = R.drawable.practice_plane_figure,
                    options = listOf("Plane Figure", "Solid Figure"),
                    correctAnswer = 0,
                    explanation = "Correct! This is a PLANE FIGURE because it is flat and has only length and width (2D)."
                ),

                Slide.PracticeSlide(
                    id = 15,
                    question = "Practice Time!! Is this a plane figure or solid figure?",
                    imageResourceId = R.drawable.practice_solid_figure,
                    options = listOf("Plane Figure", "Solid Figure"),
                    correctAnswer = 1,
                    explanation = "Correct! This is a SOLID FIGURE because it has length, width, and height (3D)."
                ),

                Slide.SummarySlide(
                    id = 16,
                    title = "Summary",
                    keyPoints = listOf(
                        "Plane Figures: \n Flat shapes with length and width only \n Two-dimensional (2D) \n Examples: rectangle, square, triangle, circle",
                        "Solid Figures: \n 3D objects with length, width, and height \n Have faces, edges, and vertices \n Examples: cube, cone, sphere, cylinder, pyramid, and prism",
                        "Key Parts of Solids: \n Face: flat surface \n Edge: where two faces meet \n Vertex: corner point"
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
                    content = "Formulating rules for a sequence means finding a pattern and writing a rule (or formula) that tells how to get any term in the sequence.",
                    keyPoints = listOf(
                        "What it means: \n Find the pattern in a sequence \n Write a rule or formula \n The rule shows how numbers change \n Helps you find next terms without listing everything",
                        "Example: \n Sequence: 2, 4, 6, 8, ...",
                        "Rule: add 2 to each term"
                    )
                ),

                Slide.ConceptSlide(
                    id = 3,
                    title = "Example Sequence",
                    imageResourceId = R.drawable.calendar_sequence,
                    content = "The numbers 4, 8, 12, 16, 20, 24, and 28 form a sequence.",
                    keyPoints = listOf(
                        "What is a number sequence? \n A list of numbers arranged in order \n Each term follows a specific rule or pattern \n Each individual number is called a TERM",
                        "In this sequence: 4, 8, 12, 16, 20, 24, 28 \n Each term increases by 4"
                    )
                ),

                Slide.ConceptSlide(
                    id = 4,
                    title = "Finding the Pattern",
                    content = "If we look at any two consecutive terms among the circled numbers on the calendar, the difference between them is 4.",
                    imageResourceId = R.drawable.calendar_sequence,
                    keyPoints = listOf(
                        "Observation: \n The difference between consecutive terms is 4 \n By adding 4 to any term, we get the next number",
                        "Therefore: \n The rule for the sequence 4, 8, 12, 16, 20, 24 \n is to add 4 to the preceding term",
                        "Rule: n + 4"
                    )
                ),

                Slide.ConceptSlide(
                    id = 5,
                    title = "Take a look at this table",
                    content = "Analyzing sequences with tables:",
                    imageResourceId = R.drawable.sequence_table_1
                ),

                Slide.ConceptSlide(
                    id = 6,
                    title = "Example 2: Working Backwards",
                    content = "Sequence: 2, 5, 8, 11, ...",
                    imageResourceId = R.drawable.sequence_table_2,
                    keyPoints = listOf(
                        "Working backwards: \n Subtract 3 from a term to get the previous term \n This reveals the pattern",
                        "Looking forward: \n Each term increases by 3 \n Common difference = 3",
                        "Try to find a way to generate each term",
                        "such that the sequence has a common difference of 3"
                    )
                ),

                Slide.ExampleSlide(
                    id = 7,
                    title = "Using Guess-and-Check Strategy",
                    problem = "Find the rule for: 2, 5, 8, 11, ...",
                    imageResourceId = R.drawable.guess_check_table,
                    steps = listOf(
                        "Let n represent a counting number.",
                        "Testing different rules: \n When n = 1: term = 2 \n When n = 2: term = 5 \n When n = 3: term = 8 \n When n = 4: term = 11",
                        "Pattern found: \n Multiply n by 3, then subtract 1 \n 3 × n − 1 or 3n − 1",
                        "So the nth term for the sequence 2, 5, 8, 11, ... \n is 3n − 1",
                        "The rule 3n − 1 is an EXPRESSION",
                        "While 3n − 1 = 4 is an EQUATION"
                    ),
                    answer = "Rule: 3n − 1"
                ),

                Slide.ConceptSlide(
                    id = 8,
                    title = "Let's take a look at this table",
                    content = "Expressions vs Equations:",
                    imageResourceId = R.drawable.expression_equation_table,
                    keyPoints = listOf(
                        "First column: Examples of EXPRESSIONS \n 3n − 1 \n 2x + 5 \n 4n",
                        "Second column: Examples of EQUATIONS \n 3n − 1 = 4 \n 2x + 5 = 13 \n 4n = 20",
                        "Key difference: Expression: no equals sign",
                        "Equation: has an equals sign"
                    )
                ),

                Slide.PracticeSlide(
                    id = 9,
                    question = "True or False: Formulating rules for a sequence means finding a pattern and writing a rule (or formula) that tells how to get any term in the sequence. This rule shows how the numbers change and helps you find the next terms without listing everything.",
                    options = listOf("True", "False"),
                    correctAnswer = 0,
                    explanation = "Correct! That's exactly what formulating rules for a sequence means - finding the pattern and creating a formula to generate any term."
                ),

                Slide.SummarySlide(
                    id = 10,
                    title = "Summary: Key Points",
                    keyPoints = listOf(
                        "Formulating Rules for a Sequence:",
                        "A sequence follows a pattern that determines how each term is formed",
                        "To find the rule, look for how the numbers increase, decrease, or repeat",
                        "Check whether the pattern uses addition, subtraction, multiplication, or division",
                        "The rule describes how to get the next term from the previous one",
                        "A rule can be written as a formula to find any term in the sequence",
                        "Identifying the pattern helps in predicting missing terms or future terms",
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

                Slide.PracticeSlide(
                    id = 10,
                    question = "Identify if the given is Expression or Equation: 5z ÷ 7 = 11",
                    options = listOf("Expression", "Equation"),
                    correctAnswer = 1,
                    explanation = "Correct! 5z ÷ 7 = 11 is an EQUATION because it has an equal sign."
                ),

                Slide.SummarySlide(
                    id = 11,
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
                    id = 6,
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
                    id = 7,
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
                    id = 8,
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
                    id = 9,
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
                    id = 10,
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
                    id = 11,
                    question = "True or False: Translating word phrases into algebraic expressions means changing words into mathematical symbols using numbers, variables, and operations. This helps in solving problems by representing situations mathematically.",
                    options = listOf("True", "False"),
                    correctAnswer = 0,
                    explanation = "Correct! That's exactly what translating word phrases into algebraic expressions means."
                ),

                Slide.PracticeSlide(
                    id = 12,
                    question = "Translate to algebraic expression: 'The sum of a number and 10'",
                    options = listOf("x − 10", "x + 10", "10x", "x ÷ 10"),
                    correctAnswer = 1,
                    explanation = "Correct! 'Sum' means addition, so 'the sum of a number and 10' is x + 10"
                ),

                Slide.PracticeSlide(
                    id = 13,
                    question = "Translate: '5 less than a number'",
                    options = listOf("5 − x", "x − 5", "5 + x", "5x"),
                    correctAnswer = 1,
                    explanation = "Correct! '5 less than a number' means subtract 5 FROM the number: x − 5"
                ),

                Slide.SummarySlide(
                    id = 14,
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
                    id = 7,
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
                    id = 8,
                    title = "Example 1: Identifying Parts",
                    problem = "Analyze: 'Six times a number increased by 8'",
                    steps = listOf(
                        "First, translate to expression: \n 'Six times a number' → 6w \n 'increased by 8' → + 8 \n Expression: 6w + 8",
                        "Now identify parts: \n w is the VARIABLE \n 6 is the NUMERICAL COEFFICIENT of w \n 8 is the CONSTANT \n It has TWO TERMS: 6w and 8"
                    ),
                    answer = "Variable: w, Coefficient: 6, Constant: 8, Terms: 2"
                ),

                Slide.PracticeSlide(
                    id = 9,
                    question = "True or False: A variable is a symbol, usually a letter, that represents a number or value that can change. Variables are used in algebraic expressions, equations, and formulas to stand for unknown or changing quantities.",
                    options = listOf("True", "False"),
                    correctAnswer = 0,
                    explanation = "Correct! That's exactly what a variable is - a symbol that can represent different values."
                ),

                Slide.PracticeSlide(
                    id = 10,
                    question = "In the expression 4x + 9, what is the constant?",
                    options = listOf("4", "x", "9", "4x"),
                    correctAnswer = 2,
                    explanation = "Correct! 9 is the constant because it's a fixed number that doesn't change."
                ),

                Slide.PracticeSlide(
                    id = 11,
                    question = "In the expression 3y − 5, what is the coefficient?",
                    options = listOf("3", "y", "5", "−5"),
                    correctAnswer = 0,
                    explanation = "Correct! 3 is the numerical coefficient - the number multiplying the variable y."
                ),

                Slide.SummarySlide(
                    id = 12,
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
                    title = "Let's Review",
                    content = "What is an algebraic equation? What is an algebraic expression?",
                    keyPoints = listOf(
                        "Algebraic Equation: \n A mathematical sentence with an equal sign (=) \n Shows that two expressions are equal",
                        "Algebraic Expression: \n A mathematical phrase \n Uses variables, numerals, and operation symbols \n No equal sign"
                    )
                ),

                Slide.ConceptSlide(
                    id = 3,
                    title = "Example of Algebraic Equation",
                    content = "3x + 5 = 20",
                    keyPoints = listOf(
                        "This is an equation because: \n It has an equal sign (=) \n It shows two expressions are equal \n Left side: 3x + 5 \n Right side: 20 \n Can be solved to find x"
                    )
                ),

                Slide.ConceptSlide(
                    id = 4,
                    title = "Example of Algebraic Expression",
                    content = "3x + 5",
                    keyPoints = listOf(
                        "This is an expression because: \n No equal sign \n Contains variables (x) \n Contains numerals (3, 5) \n Contains operation symbols (+) \n Cannot be 'solved' by itself"
                    )
                ),

                Slide.PracticeSlide(
                    id = 5,
                    question = "Practice Time!! Is this an Expression or Equation? 7 × 8 + 5",
                    options = listOf("Expression", "Equation"),
                    correctAnswer = 0,
                    explanation = "Correct! 7 × 8 + 5 is an EXPRESSION because it has no equal sign."
                ),

                Slide.PracticeSlide(
                    id = 6,
                    question = "Practice Time!! Is this an Expression or Equation? 3 × 1 = 3",
                    options = listOf("Expression", "Equation"),
                    correctAnswer = 1,
                    explanation = "Correct! 3 × 1 = 3 is an EQUATION because it has an equal sign."
                ),

                Slide.ConceptSlide(
                    id = 7,
                    title = "Real-World Example",
                    content = "Let's take a look at this situation:",
                    keyPoints = listOf(
                        "Elil buys: \n 3 rolls of tissues for ₱30.00 each \n 2 wipes for ₱45.00 each \n He gives the cashier a ₱500.00 bill",
                        "Tasks: \n Write an expression for the total cost \n Write an equation for the change he receives"
                    )
                ),

                Slide.ExampleSlide(
                    id = 8,
                    title = "Setting Up Variables",
                    problem = "Let's use variables to represent the prices:",
                    imageResourceId = R.drawable.expression_variables_example,
                    steps = listOf(
                        "Let s = price of each roll of tissues = ₱30.00",
                        "Let d = price of each wipe = ₱45.00",
                        "Let t = amount of change",
                        "Now translate the phrases:",
                        "Total cost: \n 3 rolls of tissues = 3s \n 2 wipes = 2d \n Total = 3s + 2d",
                        "This is an EXPRESSION (no = sign)"
                    ),
                    answer = "Expression: 3s + 2d"
                ),

                Slide.ExampleSlide(
                    id = 9,
                    title = "Solution",
                    problem = "Calculate the total cost and change:",
                    steps = listOf(
                        "Algebraic expression: 3s + 2d",
                        "This represents the total cost.",
                        "Substitute values: \n 3s + 2d \n = 3(30) + 2(45) \n = 90 + 90 \n = 180",
                        "Total cost is ₱180",
                        "For change, we need an equation: \n 500 − (3s + 2d) = t \n 500 − 180 = t \n 320 = t",
                        "Change is ₱320"
                    ),
                    answer = "Total: ₱180, Change: ₱320"
                ),

                Slide.PracticeSlide(
                    id = 10,
                    question = "If x represents apples at ₱5 each and you buy 4 apples, which is the expression for total cost?",
                    options = listOf("x + 4", "4x", "x = 4", "x ÷ 4"),
                    correctAnswer = 1,
                    explanation = "Correct! 4x represents 4 apples × ₱5 each. This is an expression (no = sign)."
                ),

                Slide.SummarySlide(
                    id = 11,
                    title = "Summary",
                    keyPoints = listOf(
                        "Algebraic Expression: \n A phrase with variables, numbers, and operations \n NO equal sign \n Examples: 5 + x, 2(a − 3) + 7",
                        "Algebraic Equation: \n A sentence showing two expressions are equal \n HAS an equal sign \n Examples: 5 + x = 12, 2a − 7 = 9",
                        "Key Difference: The presence of an EQUAL SIGN (=)",
                        "Real-world applications: \n Expressions show costs or quantities \n Equations help solve for unknowns"
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
                ),Slide.ConceptSlide(
                    id = 2,
                    title = "The Four Basic Rules",
                    content = "There are four properties we use to solve equations:",
                    keyPoints = listOf(
                        " Addition Property of Equality",
                        " Subtraction Property of Equality",
                        " Multiplication Property of Equality",
                        " Division Property of Equality",
                        "These properties help us isolate the variable",
                        "and find its value!"
                    )
                ),

                Slide.ConceptSlide(
                    id = 3,
                    title = "Addition Property of Equality",
                    content = "If the same quantity is added to both sides of an equation, the resulting equation is equivalent to the original equation.",
                    keyPoints = listOf(
                        "What you do to one side,",
                        "you must do to the other!",
                        "Example: \n m − 9 = 12",
                        "Add 9 to both sides: \n m − 9 + 9 = 12 + 9 \n m = 21",
                        "Why? Because −9 + 9 = 0"
                    )
                ),

                Slide.ConceptSlide(
                    id = 4,
                    title = "Subtraction Property of Equality",
                    content = "If the same quantity is subtracted from both sides of an equation, the resulting equation is equivalent to the original equation.",
                    keyPoints = listOf(
                        "Subtract the same amount from both sides",
                        "Example: g + 10 = 11",
                        "Subtract 10 from both sides: \n g + 10 − 10 = 11 − 10 \n g = 1",
                        "Why? Because 10 − 10 = 0"
                    )
                ),

                Slide.ConceptSlide(
                    id = 5,
                    title = "Multiplication Property of Equality",
                    content = "If both sides of an equation are multiplied by the same (nonzero) quantity, the resulting equation is equivalent to the original equation.",
                    imageResourceId = R.drawable.property_of_equality,
                    keyPoints = listOf(
                        "Multiply both sides by the same number",
                        "(Must be nonzero!)",
                        "Example: x/2 = 12",
                        "Multiply both sides by 2: \n 2 × (x/2) = 2 × 12 \n x = 24",
                        "Used when variable is divided"
                    )
                ),

                Slide.ConceptSlide(
                    id = 6,
                    title = "Division Property of Equality",
                    content = "If both sides of an equation are divided by the same (nonzero) quantity, the resulting equation is equivalent to the original equation.",
                    keyPoints = listOf(
                        "Divide both sides by the same number",
                        "(Must be nonzero!)",
                        "Example: 6n = 30",
                        "Divide both sides by 6: \n 6n/6 = 30/6 \n n = 5",
                        "Used when variable is multiplied"
                    )
                ),

                Slide.ExampleSlide(
                    id = 7,
                    title = "Real-Life Problem",
                    problem = "I am 9 years older than twice the age of my younger brother. If I were 49 years old, how old is my younger brother?",
                    steps = listOf(
                        "Let y = younger brother's age",
                        "Translate the sentence: '9 years older than twice the age' \n = 9 + 2y",
                        "Equation: 9 + 2y = 49",
                        "Now let's solve..."
                    ),
                    answer = "Equation: 9 + 2y = 49"
                ),

                Slide.ExampleSlide(
                    id = 8,
                    title = "Solving the Problem",
                    problem = "Solve: 9 + 2y = 49",
                    steps = listOf(
                        "Step 1: Subtract 9 from both sides \n (Subtraction Property of Equality) \n −9 + 9 + 2y = 49 − 9 \n 2y = 40",
                        "Step 2: Divide both sides by 2 \n (Division Property of Equality) \n 2y/2 = 40/2 \n y = 20",
                        "Check: 9 + 2(20) = 9 + 40 = 49"
                    ),
                    answer = "Younger brother is 20 years old"
                ),

                Slide.PracticeSlide(
                    id = 9,
                    question = "Practice Time!! Solve: k − 5 = 15",
                    options = listOf("20", "10", "−20", "−10"),
                    correctAnswer = 0,
                    explanation = "Correct! Add 5 to both sides: k − 5 + 5 = 15 + 5, so k = 20"
                ),

                Slide.PracticeSlide(
                    id = 10,
                    question = "Practice Time!! Solve: n + 8 = 10",
                    options = listOf("18", "−18", "2", "−2"),
                    correctAnswer = 2,
                    explanation = "Correct! Subtract 8 from both sides: n + 8 − 8 = 10 − 8, so n = 2"
                ),

                Slide.PracticeSlide(
                    id = 11,
                    question = "Solve: 3x = 15",
                    options = listOf("5", "12", "45", "18"),
                    correctAnswer = 0,
                    explanation = "Correct! Divide both sides by 3: 3x/3 = 15/3, so x = 5"
                ),

                Slide.ConceptSlide(
                    id = 12,
                    title = "Strategy for Solving Equations",
                    content = "Follow these steps:",
                    keyPoints = listOf(
                        " Simplify each side if needed",
                        " Use addition or subtraction to get variable term alone on one side",
                        " Use multiplication or division to get the variable by itself",
                        "Check your answer!",
                        "Goal: Isolate the variable"
                    )
                ),

                Slide.SummarySlide(
                    id = 13,
                    title = "Summary",
                    keyPoints = listOf(
                        "Four Basic Rules for Solving Equations:",
                        "Addition Property: \n Add same amount to both sides",
                        "Subtraction Property: \n Subtract same amount from both sides",
                        "Multiplication Property: \n Multiply both sides by same nonzero number",
                        "Division Property: \n Divide both sides by same nonzero number",
                        "Key Principle: \n Whatever you do to one side, \n you MUST do to the other side! \n This keeps the equation balanced."
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

    // TODO: REMOVE THE WHITES SPACES AND INDENTION
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
                        "Area of the rectangle (play pen):",
                        "A = l × w",
                        "A = 30 ft × 20 ft",
                        "A = 600 ft²",
                        "Area of the square (sandbox):",
                        "A = s²",
                        "A = 11 ft × 11 ft",
                        "A = 121 ft²"
                    ),
                    answer = "Rectangle: 600 ft²; Square: 121 ft²"
                ),

                Slide.ExampleSlide(
                    id = 6,
                    title = "Final Calculation",
                    problem = "Find the area to be covered with tire pieces:",
                    steps = listOf(
                        "Subtract the area of the square from the rectangle:",
                        "A = Area of rectangle − Area of square",
                        "A = 600 ft² − 121 ft²",
                        "A = 479 ft²",
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
                        "1. UNDERSTAND:",
                        "   Asked: Total area of footpath",
                        "   Given: Pool 44m × 17m, 2m footpath",
                        "2. PLAN:",
                        "    Find area of pool",
                        "    Find area of pool + footpath",
                        "    Subtract to get footpath area",
                        "3. SOLVE:",
                        "Area of swimming pool:",
                        "A = l × w",
                        "A = 44 m × 17 m",
                        "A = 748 m²",
                        "Area of pool with footpath:",
                        "Length: 44 + 2 + 2 = 48 m",
                        "Width: 17 + 2 + 2 = 21 m",
                        "A = 48 m × 21 m",
                        "A = 1,008 m²",
                        "Area of footpath:",
                        "A = 1,008 m² − 748 m²",
                        "A = 260 m²",
                        "4. CHECK:",
                        "748 m² + 260 m² = 1,008 m² ✓"
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
                        "Strategy for Composite Figures:",
                        " Identify all shapes in the figure",
                        " Calculate area of each shape",
                        " Add or subtract areas as needed",
                        "Two Main Approaches:",
                        " Addition: Break into simpler shapes, add their areas",
                        " Subtraction: Find total area, subtract excluded parts",
                        "Problem-Solving Steps:",
                        " UNDERSTAND - What's given and asked?",
                        " PLAN - Which shapes? Add or subtract?",
                        " SOLVE - Calculate step by step",
                        " CHECK - Does the answer make sense?",
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
                        " Front face (rectangle)",
                        " Back face (rectangle)",
                        " Top face (rectangle)",
                        " Bottom face (rectangle)",
                        " Left side face (rectangle)",
                        " Right side face (rectangle)",
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
                        "SA = 2(h × w + w × l + l × h)",
                        "or",
                        "SA = 2(h × w) + 2(w × l) + 2(l × h)"
                    )
                ),

                Slide.SummarySlide(
                    id = 7,
                    title = "Summary",
                    keyPoints = listOf(
                        "Visualizing Surface Area:",
                        " Imagine or identify all flat surfaces (faces) of a 3D object",
                        " Understand how faces fit together",
                        "Key Concepts:",
                        " Solid figures are made from plane figures",
                        " Identify which plane figure makes up each face",
                        " Calculate area of each face",
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
                        "Formula:",
                        "SA = 6s²",
                        "Where s = length of one side",
                        "Example:",
                        "If s = 5 cm",
                        "SA = 6(5²) = 6(25) = 150 cm²"
                    )
                ),

                Slide.ConceptSlide(
                    id = 3,
                    title = "Surface Area of a Triangular Prism",
                    content = "A triangular prism has three rectangular lateral faces and two triangular bases.",
                    imageResourceId = R.drawable.triangular_prism,
                    keyPoints = listOf(
                        "Components:",
                        " 2 triangular bases",
                        " 3 rectangular lateral faces",
                        "The surface area is the sum of:",
                        " Areas of the two bases",
                        " Areas of the three lateral faces",
                        "Formula:",
                        "SA = 2B + Ph",
                        "Where:",
                        "B = area of triangular base",
                        "P = perimeter of base",
                        "h = height of prism"
                    )
                ),

                Slide.ConceptSlide(
                    id = 4,
                    title = "Surface Area of a Pyramid",
                    content = "A pyramid is a solid with a polygonal base, and its lateral faces are triangles that all meet at a common vertex, known as the apex.",
                    imageResourceId = R.drawable.pyramid,
                    keyPoints = listOf(
                        "Formula:",
                        "SA = B + ½Ps",
                        "Where:",
                        "B = area of base",
                        "P = perimeter of base",
                        "s = slant height",
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
                        "To calculate the area of the lateral surface:",
                        "We can imagine 'unwrapping' the curved surface",
                        "It forms a sector of a circle",
                        "The lateral surface area can be found using:",
                        "L.A. = πrs",
                        "Where:",
                        "r = radius of base",
                        "s = slant height"
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
                        "Formula:",
                        "SA = 4πr²",
                        "Where:",
                        "r = radius of sphere",
                        "Example:",
                        "If r = 3 cm",
                        "SA = 4π(3²) = 4π(9) = 36π ≈ 113.1 cm²"
                    )
                ),

                Slide.ConceptSlide(
                    id = 9,
                    title = "Units of Measure for Surface Area",
                    content = "To measure surface area, we use square units:",
                    imageResourceId = R.drawable.unit_measure_surface_area,
                    keyPoints = listOf(
                        "Metric units:",
                        " mm² (square millimeters)",
                        " cm² (square centimeters)",
                        " dm² (square decimeters)",
                        " m² (square meters)",
                        " km² (square kilometers)",
                        "Imperial units:",
                        " in² (square inches)",
                        " ft² (square feet)",
                        " yd² (square yards)",
                        " mi² (square miles)",
                        "Example:",
                        "A rectangular prism with length 5 cm, width 3 cm, height 2 cm:",
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
                        " Cube: SA = 6s²",
                        " Triangular Prism: SA = 2B + Ph",
                        " Pyramid: SA = B + ½Ps",
                        " Cylinder: SA = 2πr² + 2πrh or 2πr(r + h)",
                        " Cone: SA = πrs + πr² or πr(s + r)",
                        " Sphere: SA = 4πr²",
                        " Has 6 equal square faces",
                        " Has 2 triangular bases and 3 rectangular lateral faces",
                        " Has one polygonal base and triangular faces meeting at apex",
                        " Has 2 circular bases and 1 curved surface",
                        " Has 1 circular base, 1 vertex, and curved surface",
                        " Perfectly round figure",
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
                        "Questions to consider:",
                        "• How many faces does the figure have?",
                        "• What is the shape of the bottom and top faces of the storage shed?",
                        "• What are the shapes of the side faces?",
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
                        "Calculate area of each face:",
                        "Area of left side: 8 ft × 7 ft = 56 ft²",
                        "Area of right side: 8 ft × 7 ft = 56 ft²",
                        "Area of top: 14 ft × 7 ft = 98 ft²",
                        "Area of bottom: 14 ft × 7 ft = 98 ft²",
                        "Area of front: 14 ft × 8 ft = 112 ft²",
                        "Area of back: 14 ft × 8 ft = 112 ft²",
                        "Therefore the surface area of a rectangular prism can be derived as follows."
                    )
                ),

                Slide.ExampleSlide(
                    id = 4,
                    title = "Compute Surface Area",
                    problem = "Find the total surface area of Mr. Reyes' storage shed:",
                    imageResourceId = R.drawable.surface_area_compute,
                    steps = listOf(
                        "Formula:",
                        "SA = 2(w × h) + 2(l × h) + 2(l × w)",
                        "Substitute values:",
                        "SA = 2(8 ft × 7 ft) + 2(14 ft × 7 ft) + 2(14 ft × 8 ft)",
                        "SA = 2(56 ft²) + 2(98 ft²) + 2(112 ft²)",
                        "SA = 112 ft² + 196 ft² + 224 ft²",
                        "SA = 532 ft²",
                        "Conclusion:",
                        "The total surface area of Mr. Reyes' storage shed is 532 ft².",
                        "Paint available: 3 gallons = 266 ft²",
                        "Paint needed: 532 ft²",
                        "The paint left for Mr. Reyes is NOT enough to cover the whole storage shed."
                    ),
                    answer = "532 ft² (not enough paint - need 532 ft², have 266 ft²)"
                ),

                Slide.ConceptSlide(
                    id = 5,
                    title = "Remember",
                    content = "Important concept about surface area:",
                    keyPoints = listOf(
                        "The surface area refers to the sum of:",
                        " The areas of the bases",
                        " The areas of lateral faces of a solid figure.",
                        "One way to find the surface area of a solid figure is to find the area of its net.",
                        "It can be measured in square units:",
                        "cm², ft², m², and other units."
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
                        "Step 2: Find the surface area",
                        "SA = LA + 2B",
                        "B = area of triangular base",
                        "B = ½ × b × h",
                        "B = ½ × 4 × 2 = 4 cm²",
                        "SA = 132 + 2(4)",
                        "SA = 132 + 8",
                        "SA = 140 cm²"
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
                        "We can find it by:",
                        " Adding the area of each face individually",
                        " Using the formula for the specific solid figure",
                        "Key formulas:",
                        " Rectangular Prism: SA = 2(lw + lh + wh)",
                        " Triangular Prism: SA = LA + 2B = ph + 2B",
                        " Sphere: SA = 4πr²",
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
                        "In the figures above:",
                        " 24 cubic units in one layer",
                        " 8 layers total",
                        "Total cubic units: 24 × 8 = 192 cubic units",
                        "This represents the volume of this figure"
                    )
                ),

                Slide.ConceptSlide(
                    id = 3,
                    title = "Volume of a Rectangular Prism",
                    content = "If you can still remember?",
                    keyPoints = listOf(
                        "The volume of a rectangular prism is:",
                        "Product of length, width, and height",
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
                        "Volume of a prism:",
                        " The amount of space inside it",
                        " Measured in cubic units",
                        " Tells you how many cubes of a given size it takes to fill the prism",
                        "Think of it as:",
                        "How many 1×1×1 unit cubes fit inside?"
                    )
                ),

                Slide.ConceptSlide(
                    id = 5,
                    title = "Volume of a Pyramid",
                    content = "What if we are to get the volume of a pyramid where the dimensions of the base and its height are the same as the given rectangular prism?",
                    keyPoints = listOf(
                        "Key question:",
                        "How does pyramid volume compare to prism volume",
                        "when they have the same base and height?",
                        "Let's investigate..."
                    )
                ),

                Slide.ConceptSlide(
                    id = 6,
                    title = "Pyramid and Prism Relationship",
                    content = "Let us take a look at this figure.",
                    imageResourceId = R.drawable.pyramid_prism_water,
                    keyPoints = listOf(
                        "Experiment:",
                        "Fill the rectangular prism with water using the pyramid",
                        "Important:",
                        "The prism and pyramid have the same base and height"
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
                        "Experiment:",
                        "Fill a cylinder using a cone",
                        "Result:",
                        "It takes THREE cones to fill the cylinder",
                        "Condition:",
                        "The cone and cylinder have the same base and height same relationship as pyramid and prism!"
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
                        "Experiment:",
                        "Fill a cylinder using a sphere",
                        "Result:",
                        "It still needs THREE spheres to fill the cylinder",
                        "Note:",
                        "The cylinder and sphere have the same base and height",
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
                        "Prism and Pyramid:",
                        " If they have the same base and height",
                        " It takes THREE pyramids to fill the prism",
                        " Volume of pyramid = ⅓ × Volume of prism",
                        "Cylinder and Cone:",
                        " If they have the same base and height",
                        " It takes THREE cones to fill the cylinder",
                        " Volume of cone = ⅓ × Volume of cylinder",
                        "Cylinder and Sphere:",
                        " If sphere fits inside cylinder (diameter = height)",
                        " Volume of sphere = ⅔ × Volume of cylinder",
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
                        "Key Relationships:",
                        " A pyramid with the same base and height as a prism has ⅓ of the prism's volume",
                        " A cone also has ⅓ the volume of a cylinder with the same base and height",
                        " A sphere has ⅔ the volume of a cylinder when it fits inside (diameter = height)",
                        "Remember:",
                        " Volume of pyramid/cone = ⅓ × Volume of prism/cylinder",
                        " Always express volume in cubic units (cm³, m³, etc.)"
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
                        "The cone and cylinder must have:",
                        "• Same radius",
                        "• Same height",
                        "Volume of cone = ⅓ × Volume of cylinder"
                    )
                ),

                Slide.ConceptSlide(
                    id = 4,
                    title = "Trivia: Sphere and Cylinder",
                    content = "The space a sphere takes is ⅔ of the volume of the cylinder.",
                    keyPoints = listOf(
                        "When the sphere fits perfectly inside the cylinder:",
                        "• Sphere diameter = cylinder height",
                        "• Both have the same radius",
                        "Volume of sphere = ⅔ × Volume of cylinder"
                    )
                ),

                Slide.ConceptSlide(
                    id = 5,
                    title = "Trivia: Pyramid and Prism",
                    content = "It takes exactly 3 full pyramids to fill the prism.",
                    keyPoints = listOf(
                        "The pyramid and prism must have:",
                        "• Same base area",
                        "• Same height",
                        "Volume of pyramid = ⅓ × Volume of prism"
                    )
                ),

                Slide.ConceptSlide(
                    id = 6,
                    title = "Volume of A Cone",
                    content = "What mathematical formula can you derive for the volume of a cone?",
                    keyPoints = listOf(
                        "Note:",
                        "The volume of a cylinder is three times the volume of the cone,",
                        "or",
                        "The volume of a cone is ⅓ that of the cylinder"
                    )
                ),

                Slide.ConceptSlide(
                    id = 7,
                    title = "Formula to find the Volume of A Cylinder",
                    content = "V = B × h",
                    keyPoints = listOf(
                        "Where:",
                        "B = Area of the base",
                        "B = πr²",
                        "π = 3.14",
                        "h = height",
                        "Therefore:",
                        "V = πr²h"
                    )
                ),

                Slide.ConceptSlide(
                    id = 8,
                    title = "Formula to find the Volume of A Cone",
                    content = "V = ⅓Bh",
                    keyPoints = listOf(
                        "Where:",
                        "B = area of the base",
                        "B = πr²",
                        "π = 3.14",
                        "h = height of the cone",
                        "Therefore:",
                        "V = ⅓Bh  or  ⅓πr²h  or  ⅓πr²h"
                    )
                ),

                Slide.ConceptSlide(
                    id = 9,
                    title = "Formula to find the Volume of A Pyramid",
                    content = "V = ⅓ × area of base × height",
                    keyPoints = listOf(
                        "The base can be any polygon:",
                        "• Square",
                        "• Rectangle",
                        "• Triangle",
                        "• etc.",
                        "Calculate the area of that base shape,",
                        "then multiply by ⅓ × height"
                    )
                ),

                Slide.ConceptSlide(
                    id = 10,
                    title = "Formula to find the Volume of A Sphere",
                    content = "V = ⁴⁄₃ × πr³",
                    keyPoints = listOf(
                        "Where:",
                        "r = radius of the sphere",
                        "π = 3.14",
                        "The formula is:",
                        "V = ⁴⁄₃πr³"
                    )
                ),

                Slide.ExampleSlide(
                    id = 11,
                    title = "Example: Finding the Volume of a Cone",
                    problem = "A cone hat has a diameter of 8 cm and a height of 10 cm; what is its volume?",
                    imageResourceId = R.drawable.cone_hat_example,
                    steps = listOf(
                        "What is being asked?",
                        " The volume of the cone",
                        "What are the given facts?",
                        " d = 8 cm, h = 10 cm",
                        "What is the operation to be used?",
                        " Multiplication"
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
                        "What is the shape of the candle?",
                        " Cylinder",
                        "How are you going to solve the problem?",
                        " Find the volume of the cylindrical candle"
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
                        "What is being asked?",
                        " The volume of the glass pyramid keychain",
                        "What is the shape of the base?",
                        " Rectangle",
                        "What are the given facts?",
                        " 5 cm by 6.5 cm, h = 8 cm",
                        "What is the operation to be used?",
                        " Formula for the volume of pyramid"
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
                        "What is being asked?",
                        " The volume of the water the sphere can hold",
                        "What are the given facts?",
                        " r = 12 cm",
                        "What is the operation to be used?",
                        " Use the formula for the volume of a sphere",
                        " V = ⁴⁄₃ × πr³"
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
                        "Volume is measured in cubic units:",
                        " m³ (cubic meters)",
                        " cm³ (cubic centimeters)",
                        " dm³ (cubic decimeters)",
                        " etc.",
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
                        "Formulas for volume:",
                        " Cylinder: V = πr²h",
                        " Cone: V = ⅓πr²h",
                        " Pyramid: V = ⅓ × base area × height",
                        " Sphere: V = ⁴⁄₃πr³",
                        "Key Relationships:",
                        " A cone is ⅓ the volume of a cylinder with the same radius and height",
                        " A pyramid is ⅓ the volume of a prism with the same base and height",
                        " A sphere is ⅔ the volume of a cylinder when it fits inside",
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
                        "Dial directions alternate:",
                        " 1st dial: Clockwise →",
                        " 2nd dial: Counterclockwise ←",
                        " 3rd dial: Clockwise →",
                        " 4th dial: Counterclockwise ←",
                        " 5th dial: Clockwise →"
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
                        "Read from right to left (E to A):",
                        "Dial E (rightmost): Points to 0",
                        "Dial D: Points to 9",
                        "Dial C: Points to 4",
                        "Dial B: Points to 2",
                        "Dial A (leftmost): Points to 1",
                        "Combine the readings:",
                        "A B C D E",
                        "1 2 4 9 0",
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
                        "Electric Meter (kWh meter):",
                        " Measures electrical energy usage",
                        " Records consumption in kilowatt-hours (kWh)",
                        "Reading Instructions:",
                        " Five dials turning in alternating directions",
                        " Read from RIGHT to LEFT (E → D → C → B → A)",
                        "Reading Rules:",
                        " Between two numbers: use smaller (except 0-9, use 9)",
                        " Exactly on a number: check right dial",
                        "  - Right dial passed 0? Use pointed number",
                        "  - Right dial not passed 0? Use previous number",
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
                        "To get the exact meter reading:",
                        "Start from right to left (highest numbered dial)",
                        "Read clockwise direction",
                        "Dial 1 (rightmost): 3",
                        "Dial 2: 5",
                        "Dial 3: 7",
                        "Dial 4: 2",
                        "Dial 5 (leftmost): 1",
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
                        "Water Meter:",
                        " Measures water usage in cubic meters (m³)",
                        " Similar to electric meter reading",
                        "Reading Instructions:",
                        " Read dials from RIGHT to LEFT",
                        " Follow clockwise direction",
                        "Reading Rules:",
                        " Between two numbers: record LOWER number",
                        " Exactly on a number: check right dial",
                        "  - Right dial passed 0? Use pointed number",
                        "  - Right dial not passed 0? Use lower number",
                        "Recording:",
                        " Start from rightmost dial",
                        " Record all numbers left",
                        " Express in cubic meters (m³)"
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
                        "Formula:",
                        "Consumption = Present Reading − Previous Reading",
                        "Substitute:",
                        "Consumption = 00197 kWh − 00124 kWh",
                        "Calculate:",
                        "Consumption = 73 kWh"
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
                        "Purpose:",
                        " Determine water or electricity used during a specific period",
                        "Formula:",
                        "Consumption = Present Reading − Previous Reading",
                        "Key Steps:",
                        " Record present (current) reading",
                        " Find previous reading",
                        " Subtract previous from present",
                        " Result = consumption for that period",
                        "Units:",
                        " Electric: kilowatt-hours (kWh)",
                        " Water: cubic meters (m³)",
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
                        "Options given:",
                        "• Zoo",
                        "• Freedom Park",
                        "• Botanical Garden",
                        "• Baler Church",
                        "• Ocean Park",
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
                        "Calculate: ³⁄₁₀ × 100%",
                        "= 30%",
                        "",
                        "Alternative method:",
                        "120 students chose Zoo out of 400 total",
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
                        "",
                        "Divide to compare:",
                        "⅕ ÷ ¹⁄₁₀",
                        "= ⅕ × ¹⁰⁄₁",
                        "= ²⁄₁₀ or ²⁄₁ = 2",
                        "",
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
                        "Calculate: ⁷⁄₄₀ × 100%",
                        "= 17.5%",
                        "",
                        "Alternative method:",
                        "70 students chose Baler Church out of 400 total",
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
                        "We can solve questions based on the data:",
                        " Find which category has the highest/lowest",
                        " Calculate percentages using fractions",
                        " Compare categories by dividing their values",
                        "Key formulas:",
                        " Percentage = (Fraction) × 100%",
                        " Comparison = (Value 1) ÷ (Value 2)",
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
                    content = "Probability is the measure of how likely it is that an event will occur.",
                    keyPoints = listOf(
                        "Helps us make reasonable assumptions about future events",
                        "Based on the likelihood of occurrence",
                        "Cannot predict the future with certainty",
                        "But can estimate the chance of something happening"
                    )
                ),

                Slide.ConceptSlide(
                    id = 3,
                    title = "Expressing Probability",
                    content = "Probability can be expressed in different ways:",
                    imageResourceId = R.drawable.probability,
                    keyPoints = listOf(
                        "As a fraction: ½, ¼, ¾",
                        "As a decimal: 0.5, 0.25, 0.75",
                        "As a percentage: 50%, 25%, 75%",
                        "Values range from 0 to 1:",
                        "• 0 = impossible (will NOT happen)",
                        "• 1 = certain (WILL happen)",
                        "• Values between 0 and 1 = may or may not happen"
                    )
                ),

                Slide.ExampleSlide(
                    id = 4,
                    title = "Example: Weather Forecast",
                    problem = "The weather forecaster predicts a 75% chance of rain today. Does it mean there is a great chance that it will rain today?",
                    imageResourceId = R.drawable.weather_forecast,
                    steps = listOf(
                        "Probability of rain = 75% or 0.75",
                        "Scale: 0 to 1 (or 0% to 100%)",
                        "Look at the number line:",
                        "0 -------- 0.75 -------- 1",
                        "Impossible    ↑    Certain",
                        "0.75 is closer to 1 than to 0",
                        "This means rain is LIKELY to occur",
                        "Conclusion:",
                        "Yes, there is a great chance it will rain today"
                    ),
                    answer = "Rain is likely because 75% is close to 100% (certain)"
                ),

                Slide.ConceptSlide(
                    id = 5,
                    title = "Probability Terms",
                    content = "We use specific terms to describe likelihood:",
                    keyPoints = listOf(
                        "Impossible (0%): Cannot happen",
                        "Most unlikely (close to 0%): Very small chance",
                        "Unlikely (below 50%): Probably won't happen",
                        "Likely (above 50%): Probably will happen",
                        "Most likely (close to 100%): Very high chance",
                        "Certain (100%): Will definitely happen"
                    )
                ),

                Slide.ExampleSlide(
                    id = 6,
                    title = "Example 1: Snow in the Philippines",
                    problem = "It will snow tomorrow.",
                    steps = listOf(
                        "Since the Philippines is a tropical country,",
                        "snow does NOT occur under normal weather conditions",
                        "Probability = 0% or close to 0%",
                        "Conclusion:",
                        "It is IMPOSSIBLE for snow to occur"
                    ),
                    answer = "Impossible - it will not snow in the Philippines"
                ),

                Slide.ExampleSlide(
                    id = 7,
                    title = "Example 2: Drawing a Card",
                    problem = "The chance of drawing the ace of spades from a deck of 52 cards is 2%.",
                    steps = listOf(
                        "Given probability: 2%",
                        "2% is very close to 0%",
                        "Look at scale:",
                        "0% -------- 2% -------- 100%",
                        "        ↑",
                        "Very close to impossible",
                        "Conclusion:",
                        "It is MOST UNLIKELY to draw the ace of spades"
                    ),
                    answer = "Most unlikely - only 2% chance"
                ),

                Slide.ExampleSlide(
                    id = 8,
                    title = "Example 3: Coin Toss",
                    problem = "There is a 50% chance of flipping heads in a coin toss.",
                    steps = listOf(
                        "Given probability: 50%",
                        "50% means exactly half",
                        "Look at scale:",
                        "0% -------- 50% -------- 100%",
                        "             ↑",
                        "Right in the middle",
                        "Conclusion:",
                        "The chance of flipping heads is AS LIKELY as it is UNLIKELY"
                    ),
                    answer = "Equally likely or unlikely - 50/50 chance"
                ),

                Slide.ExampleSlide(
                    id = 9,
                    title = "Example 4: Rain This Afternoon",
                    problem = "A survey shows there is an 80% chance of rain this afternoon.",
                    steps = listOf(
                        "Given probability: 80%",
                        "80% is very close to 100%",
                        "Look at scale:",
                        "0% -------- 80% -------- 100%",
                        "                ↑",
                        "Very close to certain",
                        "Conclusion:",
                        "It is MOST LIKELY that it will rain this afternoon"
                    ),
                    answer = "Most likely - 80% is a high probability"
                ),

                Slide.ExampleSlide(
                    id = 10,
                    title = "Example 5: Earth's Rotation",
                    problem = "The earth will rotate on its axis tomorrow.",
                    steps = listOf(
                        "This happens every single day",
                        "It has always happened",
                        "There's no reason it would stop",
                        "Probability = 100%",
                        "Conclusion:",
                        "It is CERTAIN to occur"
                    ),
                    answer = "Certain - will definitely happen"
                ),

                Slide.PracticeSlide(
                    id = 11,
                    question = "Practice Time!! A weather report says there is a 30% chance of rain this afternoon. How would you describe this?",
                    options = listOf(
                        "Impossible",
                        "Most unlikely",
                        "Unlikely",
                        "Likely",
                        "Most likely",
                        "Certain"
                    ),
                    correctAnswer = 2,
                    explanation = "Correct! Since 30% is closer to 0% than to 100%, it is UNLIKELY that it will rain this afternoon."
                ),

                Slide.PracticeSlide(
                    id = 12,
                    question = "A student has a 90% chance of passing the quiz based on her past scores and preparation. How would you describe this?",
                    options = listOf(
                        "Impossible",
                        "Most unlikely",
                        "Unlikely",
                        "Likely",
                        "Most likely",
                        "Certain"
                    ),
                    correctAnswer = 4,
                    explanation = "Correct! Because 90% is very close to 100%, it is MOST LIKELY that the student will pass the quiz."
                ),

                Slide.SummarySlide(
                    id = 13,
                    title = "Summary",
                    keyPoints = listOf(
                        "Probability measures how likely an event is to happen",
                        "Range: 0 (impossible) to 1 (certain)",
                        "Can be expressed as:",
                        " Fraction: ½",
                        " Decimal: 0.5",
                        " Percentage: 50%",
                        "Probability terms:",
                        " Impossible (0%)",
                        " Most unlikely (very close to 0%)",
                        " Unlikely (below 50%)",
                        " Likely (above 50%)",
                        " Most likely (close to 100%)",
                        " Certain (100%)",
                        "Helps us make predictions about real-life situations!"
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
                    title = "In Dealing with Probability",
                    content = "Every experiment has a set of possible outcomes called a sample space.",
                    keyPoints = listOf(
                        "Sample space = set of all possible outcomes",
                        "Important for probability calculations",
                        "Can be shown in different ways"
                    )
                ),

                Slide.ConceptSlide(
                    id = 3,
                    title = "What is a Sample Space?",
                    content = "A sample space is a list of all the possible outcomes in an experiment or activity.",
                    keyPoints = listOf(
                        "Lists ALL possible results",
                        "Different methods to identify:",
                        "  Lists",
                        "  Tree diagrams",
                        "  Tables and grids",
                        "Helps calculate probability"
                    )
                ),

                Slide.ConceptSlide(
                    id = 4,
                    title = "Listing Outcomes",
                    content = "Listing Outcomes is a method of writing down all possible results in a sample space.",
                    keyPoints = listOf(
                        "Simply list each possible outcome",
                        "Write down every possibility",
                        "Count the total outcomes",
                        "By listing all outcomes,",
                        "we can calculate probability of specific events"
                    )
                ),

                Slide.ExampleSlide(
                    id = 5,
                    title = "Example of Listing Outcomes",
                    problem = "Sarah has five types of candies: chocolate, caramel, gummy bears, and lollipops. She wants to eat two types of candy. What are the possible pairs of candies she can choose?",
                    steps = listOf(
                        "Possible Combinations:",
                        "  Chocolate, Caramel",
                        "  Chocolate, Gummy bears",
                        "  Chocolate, Lollipops",
                        "  Caramel, Gummy bears",
                        "  Caramel, Lollipops",
                        "  Gummy bears, Lollipops",
                        "Count the combinations:",
                        "Total = 6 possible pairs"
                    ),
                    answer = "The list shows that there are 6 possible combinations of candy"
                ),

                Slide.ConceptSlide(
                    id = 6,
                    title = "What is a Tree Diagram?",
                    content = "A Tree Diagram is a tool or drawing made with 'lines' that shows the different possible 'paths' for the outcomes.",
                    keyPoints = listOf(
                        "Visual representation",
                        "Shows branching paths",
                        "Each path = one outcome",
                        "Helps visualize all possibilities",
                        "Useful for multi-step experiments"
                    )
                ),

                Slide.ExampleSlide(
                    id = 7,
                    title = "Example of Tree Diagram",
                    problem = "How many snack combinations can you make with one food choice and one fruit choice?",
                    imageResourceId = R.drawable.tree_diagram,
                    steps = listOf(
                        "The tree diagram shows:",
                        "Food choices branch out",
                        "Each food connects to fruit choices",
                        "Follow each path from start to end",
                        "Count all complete paths"
                    ),
                    answer = "Based on the tree diagram, there are 9 possible outcomes"
                ),

                Slide.ConceptSlide(
                    id = 8,
                    title = "What is a Table or Grid of Outcomes?",
                    content = "A Table or Grid of Outcomes is a chart where the first row and the first column list the items that need to be combined.",
                    keyPoints = listOf(
                        "Organized chart format",
                        "Rows = one set of choices",
                        "Columns = another set of choices",
                        "Each cell = one combination",
                        "Easy to count total outcomes"
                    )
                ),

                Slide.ExampleSlide(
                    id = 9,
                    title = "Example of a Table or Grid of Outcomes",
                    problem = "A teacher is selecting a student and a volunteer to represent the class. The boy is chosen from Alex, Brian, and Charlie. The girl is chosen from Emma, Grace, Hannah, and Isla.",
                    imageResourceId = R.drawable.table_grid_outcomes,
                    steps = listOf(
                        "Create a table:",
                        "Rows = boys (Alex, Brian, Charlie)",
                        "Columns = girls (Emma, Grace, Hannah, Isla)",
                        "Each cell = one pairing",
                        "Count all cells:",
                        "3 rows × 4 columns = 12 outcomes"
                    ),
                    answer = "Based on the table or grid above, there are 12 possible outcomes"
                ),

                Slide.PracticeSlide(
                    id = 10,
                    question = "Practice Time!! Mark has four types of drinks: juice, soda, milk, and iced tea. He wants to choose two different drinks to serve at a party. How many possible pairs of drinks can Mark choose?",
                    options = listOf("6", "7", "8", "9"),
                    correctAnswer = 0,
                    explanation = "Correct! There are 6 possible combinations of drinks: (juice, soda), (juice, milk), (juice, iced tea), (soda, milk), (soda, iced tea), (milk, iced tea)."
                ),

                Slide.PracticeSlide(
                    id = 11,
                    question = "Practice Time!! Jeniffer has five school supplies: pen, pencil, eraser, ruler, and marker. She wants to pick two different items to put in her small pouch. How many possible pairs of items can Jeniffer choose?",
                    options = listOf("7", "8", "9", "10"),
                    correctAnswer = 3,
                    explanation = "Correct! There are 10 possible combinations of school supplies: (pen, pencil), (pen, eraser), (pen, ruler), (pen, marker), (pencil, eraser), (pencil, ruler), (pencil, marker), (eraser, ruler), (eraser, marker), (ruler, marker)."
                ),

                Slide.SummarySlide(
                    id = 12,
                    title = "Summary",
                    keyPoints = listOf(
                        "In this lesson, you learned how to find all possible outcomes:",
                        "1. Listing Outcomes:",
                        "  Write all possible results in a list",
                        "  Simple and straightforward",
                        "2. Tree Diagram:",
                        "  Use branches to show choices and paths",
                        "  Visual representation of outcomes",
                        "3. Table or Grid of Outcomes:",
                        "  Use rows and columns to combine choices",
                        "  Easy to see all combinations",
                        "Sample Space = set of all possible outcomes",
                        "These tools make solving probability problems easier!"
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
                        "0 -------- 0.95 -------- 1",
                        "Impossible    ↑      Certain",
                        "95% is closer to 1 (100%)",
                        "Conclusion:",
                        "If vaccinated with Pfizer-BioNTech,",
                        "you are HIGHLY PROTECTED from severe COVID-19",
                        "The effectiveness is very close to certain!"
                    )
                ),

                Slide.ConceptSlide(
                    id = 5,
                    title = "What is Probability Again?",
                    content = "Probability is the likelihood that an event will occur. It is used to describe how likely or unlikely something is to happen.",
                    keyPoints = listOf(
                        "Key points:",
                        "  Expressed as fraction, decimal, or percentage",
                        "  Range: 0 to 1",
                        "  - 0 = impossible",
                        "  - 1 = certain",
                        "  Closer to 0 = unlikely to occur",
                        "  Example: winning lottery (1 in a million)",
                        "  Closer to 1 = most likely to happen",
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
                        "Theoretical Probability = ",
                        "number of favorable outcomes",
                        "÷",
                        "number of possible outcomes",
                        "Example:",
                        "Rolling a die: 6 possible outcomes",
                        "Getting a 3: 1 favorable outcome",
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
                        "Getting 1 dot:",
                        "  Favorable outcomes = 1",
                        "  Probability = ⅙",
                        "Getting 3 dots:",
                        "  Favorable outcomes = 1",
                        "  Probability = ⅙",
                        "Getting 5 dots:",
                        "  Favorable outcomes = 1",
                        "  Probability = ⅙"
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
                        "Formula:",
                        "Experimental Probability = ",
                        "number of times favorable outcome occurs",
                        "÷",
                        "number of trials in the experiment",
                        "",
                        "Example:",
                        "Flip coin 100 times",
                        "Heads appears 47 times",
                        "Probability = 47/100 = 0.47"
                    )
                ),

                Slide.ExampleSlide(
                    id = 11,
                    title = "Example of Experimental Probability",
                    problem = "Arkin tossed a coin 50 times, and it landed on tails 38 times. To find the probability of landing on heads:",
                    steps = listOf(
                        "Given:",
                        "  Total tosses = 50",
                        "  Tails = 38 times",
                        "  Heads = 50 − 38 = 12 times",
                        "Formula:",
                        "Experimental Probability = favorable outcomes ÷ trials",
                        "Calculate:",
                        "Probability of heads = 12/50",
                        "Simplify:",
                        "12/50 = 6/25",
                        "Experimental Probability = 6/25"
                    ),
                    answer = "The experimental probability of landing on heads is 12/50 or 6/25"
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
                        "1. Theoretical Probability:",
                        "  Calculated using a formula",
                        "  Based on all possible outcomes",
                        "  Formula: favorable outcomes ÷ possible outcomes",
                        "2. Experimental Probability:",
                        "  Based on actual experiment results",
                        "  Based on trials and observations",
                        "  Formula: times event occurs ÷ number of trials",
                        "Probability ranges from 0 to 1:",
                        "  0 = impossible",
                        "  1 = certain",
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
                        "Step 1. Understand",
                        "  What is asked?",
                        "  What are the given facts?",
                        "Step 2. Plan",
                        "  What operation to use?",
                        "  What formula and equation?",
                        "Step 3. Solve",
                        "  Show the computation",
                        "Step 4. Check",
                        "  Verify your answer"
                    )
                ),

                Slide.ConceptSlide(
                    id = 3,
                    title = "Formula of Theoretical Probability",
                    content = "Theoretical Probability (event) = number of favorable outcomes ÷ number of possible outcomes",
                    keyPoints = listOf(
                        "Formula:",
                        "Theoretical Probability = ",
                        "  number of favorable outcomes",
                        "  ────────────────────────",
                        "  number of possible outcomes",
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
                        "Experimental Probability = ",
                        "  number of times favorable outcome occurs",
                        "  ─────────────────────────────────",
                        "  number of trials in the experiment",
                        "Used when calculating probability",
                        "based on actual experiment results"
                    )
                ),

                Slide.ExampleSlide(
                    id = 5,
                    title = "Let's Solve: Theoretical Probability",
                    problem = "A bag contains 10 red marbles, 6 blue marbles, and 8 yellow marbles. Find the theoretical probability of getting a blue marble.",
                    steps = listOf(
                        "Step 1. Understand",
                        "What is asked?",
                        "  The theoretical probability of getting a blue marble",
                        "What are the given facts?",
                        "  10 red marbles",
                        "  6 blue marbles",
                        "  8 yellow marbles",
                        "  Total: 10 + 6 + 8 = 24 marbles",
                        "Step 2. Plan",
                        "Operations: Addition and Division",
                        "Formula:",
                        "TP (event) = favorable outcomes ÷ possible outcomes",
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
                        "Show the computation:",
                        "TP (Blue Marble) = favorable outcomes ÷ possible outcomes",
                        "TP (Blue Marble) = 6/24",
                        "Simplify the fraction:",
                        "Divide both numerator and denominator by 6:",
                        "6 ÷ 6 = 1",
                        "24 ÷ 6 = 4",
                        "TP (blue marble) = ¼ or 0.25 or 25%",
                        "Therefore:",
                        "The theoretical probability of getting a blue marble",
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
                        "Verify:",
                        "  Are all given values properly substituted?",
                        "  Is the formula correct?",
                        "  Is the computation flow logical?",
                        "  Does the answer make sense?",
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
                        "What is asked?",
                        "  The experimental probability of making a free throw",
                        "What are the given facts?",
                        "  50 attempts at free throws",
                        "  35 successful shots",
                        "Step 2. Plan",
                        "Operations: Subtraction and Division",
                        "Let N = number of times missing a free throw",
                        "Formula:",
                        "EP (event) = favorable outcomes ÷ trials",
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
                        "Show the computation:",
                        "First, find the number of misses (N):",
                        "50 attempts − 35 successful = 15 misses",
                        "Therefore, 15 times he missed the free throw",
                        "Now find experimental probability of missing:",
                        "EP (miss) = 15/50",
                        "Simplify by dividing by 5:",
                        "15 ÷ 5 = 3",
                        "50 ÷ 5 = 10",
                        "EP (miss) = 3/10 or 0.30 or 30%",
                        "Therefore:",
                        "The experimental probability of missing a free throw",
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
                        "Verify:",
                        "  Are all given values properly substituted?",
                        "  Is the formula correct?",
                        "  Is the computation flow logical?",
                        "  Does the answer make sense?",
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
                        "The Four-Step Plan helps solve probability problems:",
                        "Step 1. Understand - identify what's asked and given",
                        "Step 2. Plan - choose operations and formulas",
                        "Step 3. Solve - show your computation",
                        "Step 4. Check - verify your answer",
                        "Two types of probability:",
                        "Theoretical Probability:",
                        "  Formula: favorable outcomes ÷ possible outcomes",
                        "  Used before experiments",
                        "Experimental Probability:",
                        "  Formula: successful outcomes ÷ total trials",
                        "  Based on actual results",
                        "Always simplify fractions and express as decimal or percentage!"
                    )
                )
            )
        )
    }
}