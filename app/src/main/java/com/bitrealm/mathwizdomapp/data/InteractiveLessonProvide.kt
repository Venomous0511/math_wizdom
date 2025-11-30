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
                        "Step 1: Understand",
                        "Given: ⅔ km + ¼ km + ½ km",
                        "Asked: Total distance?",
                        "",
                        "Step 2: Plan",
                        "Operation: Addition",
                        "Number sentence: ⅔ + ¼ + ½ = N",
                        "",
                        "Step 3: Solve",
                        "Find LCD of 3, 4, and 2 = 12",
                        "⅔ = ⁸⁄₁₂, ¼ = ³⁄₁₂, ½ = ⁶⁄₁₂",
                        "⁸⁄₁₂ + ³⁄₁₂ + ⁶⁄₁₂ = ¹⁷⁄₁₂ = 1 ⁵⁄₁₂",
                        "",
                        "Step 4: Check",
                        "⁸⁄₁₂ + ³⁄₁₂ = ¹¹⁄₁₂",
                        "¹⁷⁄₁₂ − ¹¹⁄₁₂ = ⁶⁄₁₂ or ½ ✓"
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
                        "Step 1: Understand the situation",
                        "Started with: ¾ full",
                        "Ended with: ¼ full",
                        "Need to find: How much was used?",
                        "",
                        "Step 2: Think about the strategy",
                        "If we started with ¾ and ended with ¼,",
                        "we need to subtract to find what was used",
                        "",
                        "Step 3: Solve",
                        "¾ − ¼ = ²⁄₄",
                        "",
                        "Step 4: Simplify",
                        "²⁄₄ = ½"
                    ),
                    answer = "½ of the tank's water was used"
                ),

                Slide.ExampleSlide(
                    id = 8,
                    title = "Another Non-Routine Example",
                    problem = "Anna has ⅔ of a chocolate bar. She wants to share it equally with 2 friends. What fraction of the whole bar does each person get?",
                    steps = listOf(
                        "Step 1: Understand",
                        "Total chocolate: ⅔ of a bar",
                        "Number of people: 3 (Anna + 2 friends)",
                        "",
                        "Step 2: Think",
                        "We need to divide ⅔ into 3 equal parts",
                        "This means: ⅔ ÷ 3",
                        "",
                        "Step 3: Solve",
                        "⅔ ÷ 3 = ⅔ × ⅓",
                        "= (2 × 1)/(3 × 3) = ²⁄₉"
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
                        "Step 1: Convert 1 ½ to improper fraction:",
                        "(1 × 2) + 1 = 3, so 1 ½ = ³⁄₂",
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
                        "Step 1: Convert 2 ⅓ to improper fraction:",
                        "(2 × 3) + 1 = 7, so 2 ⅓ = ⁷⁄₃",
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
                        "Step 1: Identify the key word",
                        "'Sum of' means addition (+)",
                        "",
                        "Step 2: Identify the fractions",
                        "First fraction: ⅓",
                        "Second fraction: ¼",
                        "",
                        "Step 3: Write the expression",
                        "⅓ + ¼"
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
                        "Step 1: Identify the key word",
                        "'Difference between' means subtraction (−)",
                        "",
                        "Step 2: Identify the fractions",
                        "First fraction: ¾",
                        "Second fraction: ⅖",
                        "",
                        "Step 3: Write the expression",
                        "¾ − ⅖"
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
                        "Step 1: Identify the key word",
                        "'Of' means multiplication (×)",
                        "",
                        "Step 2: Identify the fractions",
                        "First fraction: ⅔",
                        "Second fraction: ½",
                        "",
                        "Step 3: Write the expression",
                        "⅔ × ½"
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
                        "Step 1: Identify the key word",
                        "'Divided by' means division (÷)",
                        "",
                        "Step 2: Identify the fractions",
                        "First fraction: ⅘",
                        "Second fraction: ⅕",
                        "",
                        "Step 3: Write the expression",
                        "⅘ ÷ ⅕"
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
                        "Step 1: Break down the phrase",
                        "'Sum of' → addition",
                        "'Product of' → multiplication",
                        "",
                        "Step 2: Identify what to do first",
                        "Product of ⅓ and ¼ = ⅓ × ¼",
                        "",
                        "Step 3: Add ½ to the product",
                        "½ + (⅓ × ¼)",
                        "",
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
                        "",
                        "Given information:",
                        "• Ana gave ⅓ to her friend",
                        "• Ana gave ¼ to her neighbor",
                        "",
                        "What is asked?",
                        "• How much cake did she give away in total?",
                        "",
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
                        "",
                        "Key word: 'total' → means ADDITION",
                        "",
                        "Operation needed:",
                        "• Add the two fractions",
                        "",
                        "Number sentence:",
                        "⅓ + ¼ = N",
                        "",
                        "Strategy:",
                        "• Find LCD of 3 and 4",
                        "• Convert to equivalent fractions",
                        "• Add the numerators"
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
                        "Let's SOLVE:",
                        "",
                        "⅓ + ¼ = ?",
                        "",
                        "Find LCD of 3 and 4 = 12",
                        "",
                        "Convert to equivalent fractions:",
                        "⅓ = ⁴⁄₁₂ (multiply by 4/4)",
                        "¼ = ³⁄₁₂ (multiply by 3/3)",
                        "",
                        "Add:",
                        "⁴⁄₁₂ + ³⁄₁₂ = ⁷⁄₁₂",
                        "",
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
                        "",
                        "Our answer: ⁷⁄₁₂",
                        "",
                        "Does it make sense?",
                        "• ⅓ is about 0.33",
                        "• ¼ is 0.25",
                        "• Together: about 0.58",
                        "• ⁷⁄₁₂ ≈ 0.58 ✓ Makes sense!",
                        "",
                        "Did we answer the question?",
                        "• Yes! We found the total given away ✓",
                        "",
                        "Is the answer reasonable?",
                        "• Yes! It's more than ⅓ but less than 1 ✓"
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
                        "1. UNDERSTAND:",
                        "Given: 2 ½ m ribbon, cut off ¾ m",
                        "Asked: How much is left?",
                        "",
                        "2. PLAN:",
                        "Operation: Subtraction (left means subtract)",
                        "Number sentence: 2 ½ − ¾ = N",
                        "",
                        "3. SOLVE:",
                        "Convert: 2 ½ = 2 ²⁄₄",
                        "Borrow: 2 ²⁄₄ = 1 ⁶⁄₄",
                        "Subtract: 1 ⁶⁄₄ − ¾ = 1 ¾",
                        "",
                        "4. CHECK:",
                        "1 ¾ + ¾ = 2 ½ ✓"
                    ),
                    answer = "1 ¾ meters of ribbon is left"
                ),

                Slide.ExampleSlide(
                    id = 13,
                    title = "Another Complete Example",
                    problem = "In a class, ⅖ of the students are boys. If there are 30 students, how many are boys?",
                    steps = listOf(
                        "1. UNDERSTAND:",
                        "Given: ⅖ are boys, 30 total students",
                        "Asked: How many boys?",
                        "",
                        "2. PLAN:",
                        "Operation: Multiplication ('of' means ×)",
                        "Number sentence: ⅖ × 30 = N",
                        "",
                        "3. SOLVE:",
                        "⅖ × ³⁰⁄₁ = (2 × 30)/(5 × 1) = ⁶⁰⁄₅ = 12",
                        "",
                        "4. CHECK:",
                        "If 12 are boys, then 18 are girls",
                        "12 + 18 = 30 ✓"
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
                        "Step 1: Write the division problem",
                        "⅝ ÷ ¾",
                        "",
                        "Step 2: Find the reciprocal of ¾",
                        "Reciprocal of ¾ is ⁴⁄₃",
                        "",
                        "Step 3: Change ÷ to × and use the reciprocal",
                        "⅝ × ⁴⁄₃",
                        "",
                        "Step 4: Multiply",
                        "(5 × 4)/(8 × 3) = ²⁰⁄₂₄",
                        "",
                        "Step 5: Simplify",
                        "²⁰⁄₂₄ = ⅚"
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
                        "Step 1: Write the problem",
                        "⅔ ÷ ¹⁄₁₂",
                        "",
                        "Step 2: Find reciprocal of ¹⁄₁₂",
                        "Reciprocal is ¹²⁄₁",
                        "",
                        "Step 3: Change to multiplication",
                        "⅔ × ¹²⁄₁",
                        "",
                        "Step 4: Multiply",
                        "(2 × 12)/(3 × 1) = ²⁴⁄₃",
                        "",
                        "Step 5: Simplify",
                        "²⁴⁄₃ = 8"
                    ),
                    answer = "8"
                ),

                Slide.ExampleSlide(
                    id = 7,
                    title = "Example 3: Using Cancellation",
                    problem = "Find the quotient of ⁴⁄₉ and ²⁄₃",
                    steps = listOf(
                        "Step 1: Write ⁴⁄₉ ÷ ²⁄₃",
                        "",
                        "Step 2: Use reciprocal",
                        "⁴⁄₉ × ³⁄₂",
                        "",
                        "Step 3: Cancel before multiplying",
                        "9 and 3 share factor 3: 9÷3=3, 3÷3=1",
                        "4 and 2 share factor 2: 4÷2=2, 2÷2=1",
                        "",
                        "Step 4: After canceling: ²⁄₃ × ¹⁄₁",
                        "",
                        "Step 5: Multiply",
                        "(2 × 1)/(3 × 1) = ⅔"
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
                    content = "In this topic, you will learn to divide mixed fractions.\n\nWhen dividing a mixed number by another mixed number, there are important steps we have to follow!"
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
                        "Step 1: Convert to improper fractions",
                        "2 ⅓ → (2 × 3) + 1 = 7 → ⁷⁄₃",
                        "1 ¼ → (1 × 4) + 1 = 5 → ⁵⁄₄",
                        "",
                        "Step 2: Write the division",
                        "⁷⁄₃ ÷ ⁵⁄₄",
                        "",
                        "Step 3: Find reciprocal and change to multiplication",
                        "⁷⁄₃ × ⁴⁄₅",
                        "",
                        "Step 4: Multiply",
                        "(7 × 4)/(3 × 5) = ²⁸⁄₁₅",
                        "",
                        "Step 5: Convert to mixed number",
                        "28 ÷ 15 = 1 remainder 13",
                        "²⁸⁄₁₅ = 1 ¹³⁄₁₅"
                    ),
                    answer = "1 ¹³⁄₁₅"
                ),

                Slide.ExampleSlide(
                    id = 5,
                    title = "Another Example",
                    problem = "Compute 3 ½ ÷ 1 ¾",
                    steps = listOf(
                        "Step 1: Convert to improper fractions",
                        "3 ½ → (3 × 2) + 1 = ⁷⁄₂",
                        "1 ¾ → (1 × 4) + 3 = ⁷⁄₄",
                        "",
                        "Step 2: Change to multiplication with reciprocal",
                        "⁷⁄₂ × ⁴⁄₇",
                        "",
                        "Step 3: Cancel common factors",
                        "7 cancels with 7 → ¹⁄₂ × ⁴⁄₁",
                        "",
                        "Step 4: Multiply",
                        "(1 × 4)/(2 × 1) = ⁴⁄₂ = 2"
                    ),
                    answer = "2"
                ),

                Slide.ExampleSlide(
                    id = 6,
                    title = "Example with Whole Number Result",
                    problem = "Compute 4 ½ ÷ 1 ½",
                    steps = listOf(
                        "Step 1: Convert",
                        "4 ½ = ⁹⁄₂, 1 ½ = ³⁄₂",
                        "",
                        "Step 2: Use reciprocal",
                        "⁹⁄₂ × ²⁄₃",
                        "",
                        "Step 3: Cancel",
                        "2 cancels with 2, 9 and 3 share factor 3",
                        "After canceling: ³⁄₁ × ¹⁄₁",
                        "",
                        "Step 4: Multiply",
                        "(3 × 1)/(1 × 1) = 3"
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
                        "Step 1: Convert 3 ¾ to improper fraction",
                        "3 ¾ = (3 × 4) + 3 = ¹⁵⁄₄",
                        "",
                        "Step 2: Write 5 as ⁵⁄₁",
                        "",
                        "Step 3: Use reciprocal",
                        "¹⁵⁄₄ × ⅕",
                        "",
                        "Step 4: Cancel and multiply",
                        "15 and 5 share factor 5: ³⁄₄ × ⅕",
                        "(3 × 1)/(4 × 1) = ¾"
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
                    content = "In this topic, you'll learn how to recognize keywords that indicate division and solve problems using the division operation.\n\nThese keywords are your clues to know when to divide!"
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
                        "Step 1: Identify the operation",
                        "'Quotient' means division",
                        "",
                        "Step 2: Write the division",
                        "¾ ÷ ¼",
                        "",
                        "Step 3: Use Keep-Change-Flip",
                        "¾ × ⁴⁄₁",
                        "",
                        "Step 4: Multiply",
                        "(3 × 4)/(4 × 1) = ¹²⁄₄ = 3"
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
                        "Step 1: Write as division",
                        "⅔ ÷ ⅙",
                        "",
                        "Step 2: Find reciprocal of ⅙",
                        "Reciprocal is ⁶⁄₁",
                        "",
                        "Step 3: Multiply",
                        "⅔ × ⁶⁄₁ = ¹²⁄₃ = 4"
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
                        "Step 1: Identify the operation",
                        "'Split into' means division",
                        "",
                        "Step 2: Convert to improper fraction",
                        "4 ½ = ⁹⁄₂",
                        "",
                        "Step 3: Divide by 3",
                        "⁹⁄₂ ÷ ³⁄₁ = ⁹⁄₂ × ⅓",
                        "",
                        "Step 4: Multiply and simplify",
                        "(9 × 1)/(2 × 3) = ⁹⁄₆ = 1 ½"
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
                        "Step 1: Add the numbers",
                        "⅓ + ⅔ = ³⁄₃ = 1",
                        "",
                        "Step 2: Count how many numbers",
                        "There are 2 numbers",
                        "",
                        "Step 3: Divide the sum by the count",
                        "1 ÷ 2 = ½"
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
                        "Step 1: Identify keywords",
                        "'Cut into' and 'each' → division",
                        "",
                        "Step 2: Convert to improper fraction",
                        "2 ¼ = ⁹⁄₄",
                        "",
                        "Step 3: Divide",
                        "⁹⁄₄ ÷ ¾ = ⁹⁄₄ × ⁴⁄₃",
                        "",
                        "Step 4: Simplify",
                        "(9 × 4)/(4 × 3) = ³⁶⁄₁₂ = 3"
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
                    content = "In this topic, you'll learn how to solve both routine and non-routine word problems involving division of fractions.\n\nLet's apply what we learned about division!"
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
                        "1. UNDERSTAND:",
                        "Given: 3 ¾ kg of flour, ¾ kg per bag",
                        "Asked: How many bags?",
                        "",
                        "2. PLAN:",
                        "Keyword: 'each' → Division",
                        "Number sentence: 3 ¾ ÷ ¾ = N",
                        "",
                        "3. SOLVE:",
                        "3 ¾ = ¹⁵⁄₄",
                        "¹⁵⁄₄ ÷ ¾ = ¹⁵⁄₄ × ⁴⁄₃ = ⁶⁰⁄₁₂ = 5",
                        "",
                        "4. CHECK:",
                        "5 bags × ¾ kg = 3 ¾ kg ✓"
                    ),
                    answer = "He can make 5 bags"
                ),

                Slide.ExampleSlide(
                    id = 5,
                    title = "Example 2: Routine Problem",
                    problem = "What is the quotient when 2 ½ is divided by ⅚?",
                    steps = listOf(
                        "1. UNDERSTAND:",
                        "Given: 2 ½ and ⅚",
                        "Asked: What is the quotient?",
                        "",
                        "2. PLAN:",
                        "Keyword: 'quotient', 'divided by' → Division",
                        "Number sentence: 2 ½ ÷ ⅚ = N",
                        "",
                        "3. SOLVE:",
                        "2 ½ = ⁵⁄₂",
                        "⁵⁄₂ ÷ ⅚ = ⁵⁄₂ × ⁶⁄₅",
                        "= (5 × 6)/(2 × 5) = ³⁰⁄₁₀ = 3",
                        "",
                        "4. CHECK:",
                        "3 × ⅚ = 2 ½ ✓"
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
                        "1. UNDERSTAND:",
                        "Given: 6 ¾ km total, 3 days, same each day",
                        "Asked: Distance per day?",
                        "",
                        "2. PLAN:",
                        "Keyword: 'per day' → Division",
                        "'Same each day' → equal parts",
                        "Number sentence: 6 ¾ ÷ 3 = N",
                        "",
                        "3. SOLVE:",
                        "6 ¾ = ²⁷⁄₄",
                        "²⁷⁄₄ ÷ ³⁄₁ = ²⁷⁄₄ × ⅓",
                        "= (27 × 1)/(4 × 3) = ²⁷⁄₁₂ = 2 ¼",
                        "",
                        "4. CHECK:",
                        "2 ¼ × 3 = 6 ¾ ✓"
                    ),
                    answer = "She ran 2 ¼ km per day"
                ),

                Slide.ExampleSlide(
                    id = 9,
                    title = "Example 4: Multi-Step Problem",
                    problem = "A recipe needs ⅔ cup of sugar to make 4 cookies. How much sugar is needed for one cookie?",
                    steps = listOf(
                        "1. UNDERSTAND:",
                        "Given: ⅔ cup for 4 cookies",
                        "Asked: Sugar for 1 cookie?",
                        "",
                        "2. PLAN:",
                        "Need to find amount 'per cookie' → Division",
                        "Number sentence: ⅔ ÷ 4 = N",
                        "",
                        "3. SOLVE:",
                        "⅔ ÷ ⁴⁄₁ = ⅔ × ¼",
                        "= (2 × 1)/(3 × 4) = ²⁄₁₂ = ⅙",
                        "",
                        "4. CHECK:",
                        "⅙ × 4 = ⁴⁄₆ = ⅔ ✓"
                    ),
                    answer = "⅙ cup of sugar per cookie"
                ),

                Slide.ExampleSlide(
                    id = 10,
                    title = "Example 5: Problem with Extra Info",
                    problem = "Ana bought 5 ¼ meters of fabric for ₱420. She wants to cut it into ¾ meter pieces for pillowcases. How many pillowcases can she make?",
                    steps = listOf(
                        "1. UNDERSTAND:",
                        "Given: 5 ¼ m fabric, ₱420 (extra info), ¾ m per piece",
                        "Asked: How many pieces?",
                        "",
                        "2. PLAN:",
                        "Ignore the price - not needed!",
                        "Keyword: 'cut into' → Division",
                        "Number sentence: 5 ¼ ÷ ¾ = N",
                        "",
                        "3. SOLVE:",
                        "5 ¼ = ²¹⁄₄",
                        "²¹⁄₄ ÷ ¾ = ²¹⁄₄ × ⁴⁄₃",
                        "= (21 × 4)/(4 × 3) = ⁸⁴⁄₁₂ = 7",
                        "",
                        "4. CHECK:",
                        "7 × ¾ = ²¹⁄₄ = 5 ¼ ✓"
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
                        "1. UNDERSTAND:",
                        "Given: 15 ¾ kg total, 1 ¼ kg per basket",
                        "Asked: Leftover amount?",
                        "",
                        "2. PLAN:",
                        "Divide to find # of baskets",
                        "Check for remainder",
                        "",
                        "3. SOLVE:",
                        "15 ¾ ÷ 1 ¼ = ⁶³⁄₄ ÷ ⁵⁄₄",
                        "= ⁶³⁄₄ × ⁴⁄₅ = ⁶³⁄₅ = 12 ³⁄₅",
                        "12 complete baskets, ³⁄₅ kg left",
                        "³⁄₅ kg = ³⁄₅ × 1 ¼ kg = ³⁄₅ × ⁵⁄₄ = ¾ kg",
                        "",
                        "4. CHECK:",
                        "12 × 1 ¼ + ¾ = 15 + ¾ = 15 ¾ ✓"
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
                        "Step 1: Identify the rounding place",
                        "6.243 → The whole number place is 6",
                        "",
                        "Step 2: Look at the digit to the right",
                        "6.243 → The digit to the right is 2",
                        "",
                        "Step 3: Apply the rule",
                        "Is 2 less than 5? YES",
                        "So keep 6 the same",
                        "",
                        "Step 4: Drop all digits after",
                        "6.243 becomes 6"
                    ),
                    answer = "The birdhouse is about 6 meters high"
                ),

                Slide.ExampleSlide(
                    id = 5,
                    title = "Example: Rounding UP",
                    problem = "Round 8.576 to the nearest whole number",
                    steps = listOf(
                        "Step 1: Identify the rounding place",
                        "8.576 → The whole number place is 8",
                        "",
                        "Step 2: Look at the digit to the right",
                        "8.576 → The digit to the right is 5",
                        "",
                        "Step 3: Apply the rule",
                        "Is 5 equal to or greater than 5? YES",
                        "So add 1 to 8 → 8 + 1 = 9",
                        "",
                        "Step 4: Drop all digits after",
                        "8.576 becomes 9"
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
                        "Step 1: Identify the rounding place",
                        "3.456 → The tenths place is 4",
                        "",
                        "Step 2: Look at the digit to the right",
                        "3.456 → The digit to the right is 5",
                        "",
                        "Step 3: Apply the rule",
                        "Is 5 equal to or greater than 5? YES",
                        "So add 1 to 4 → 4 + 1 = 5",
                        "",
                        "Step 4: Keep the decimal point and drop after",
                        "3.456 becomes 3.5"
                    ),
                    answer = "3.5"
                ),

                Slide.ExampleSlide(
                    id = 9,
                    title = "Rounding to Hundredths Place",
                    problem = "Round 7.8947 to the nearest hundredth",
                    steps = listOf(
                        "Step 1: Identify the rounding place",
                        "7.8947 → The hundredths place is 9",
                        "",
                        "Step 2: Look at the digit to the right",
                        "7.8947 → The digit to the right is 4",
                        "",
                        "Step 3: Apply the rule",
                        "Is 4 less than 5? YES",
                        "So keep 9 the same",
                        "",
                        "Step 4: Drop digits after hundredths",
                        "7.8947 becomes 7.89"
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
                        "Step 1: Align the decimal points",
                        "  2.25",
                        "  0.03",
                        "+ 0.0756",
                        "",
                        "Step 2: Add zeros to make all same length",
                        "  2.2500",
                        "  0.0300",
                        "+ 0.0756",
                        "",
                        "Step 3: Add like whole numbers",
                        "  2.2500",
                        "  0.0300",
                        "+ 0.0756",
                        "———————",
                        "  2.3556"
                    ),
                    answer = "2.3556"
                ),

                Slide.ExampleSlide(
                    id = 6,
                    title = "Example: Another Addition",
                    problem = "Add: 5.6 + 2.34 + 0.125",
                    steps = listOf(
                        "Step 1: Align decimal points",
                        "  5.6",
                        "  2.34",
                        "+ 0.125",
                        "",
                        "Step 2: Add zeros",
                        "  5.600",
                        "  2.340",
                        "+ 0.125",
                        "",
                        "Step 3: Add",
                        "  5.600",
                        "  2.340",
                        "+ 0.125",
                        "———————",
                        "  8.065"
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
                        "Step 1: Align the decimal points",
                        "  7.894",
                        "- 2.123",
                        "",
                        "Step 2: Check if zeros needed",
                        "Both have 3 decimal places - good!",
                        "  7.894",
                        "- 2.123",
                        "",
                        "Step 3: Subtract like whole numbers",
                        "  7.894",
                        "- 2.123",
                        "———————",
                        "  5.771"
                    ),
                    answer = "5.771"
                ),

                Slide.ExampleSlide(
                    id = 9,
                    title = "Example: Subtraction with Zeros",
                    problem = "Subtract: 5.4 - 2.167",
                    steps = listOf(
                        "Step 1: Align decimal points",
                        "  5.4",
                        "- 2.167",
                        "",
                        "Step 2: Add zeros to 5.4",
                        "  5.400",
                        "- 2.167",
                        "",
                        "Step 3: Subtract",
                        "  5.400",
                        "- 2.167",
                        "———————",
                        "  3.233"
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
                        "Step 1: Write 10 as 10.000",
                        " 10.000",
                        "-  3.456",
                        "",
                        "Step 2: Align and add zeros",
                        "Already done!",
                        " 10.000",
                        "-  3.456",
                        "",
                        "Step 3: Subtract (may need to borrow)",
                        " 10.000",
                        "-  3.456",
                        "————————",
                        "  6.544"
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
                        "1. UNDERSTAND:",
                        "Given: ₱45.75, ₱23.50, ₱18.25",
                        "Asked: Total amount spent?",
                        "",
                        "2. PLAN:",
                        "Keyword: 'total' → Addition",
                        "Number sentence: 45.75 + 23.50 + 18.25 = N",
                        "",
                        "3. SOLVE:",
                        "  45.75",
                        "  23.50",
                        "+ 18.25",
                        "————————",
                        "  87.50",
                        "",
                        "4. CHECK:",
                        "87.50 - 45.75 - 23.50 = 18.25 ✓"
                    ),
                    answer = "Maria spent ₱87.50 in total"
                ),

                Slide.ExampleSlide(
                    id = 5,
                    title = "Example 2: Routine Subtraction Problem",
                    problem = "A water tank contains 125.5 liters of water. After using 47.75 liters for watering plants, how much water remains?",
                    steps = listOf(
                        "1. UNDERSTAND:",
                        "Given: 125.5 L initially, 47.75 L used",
                        "Asked: How much remains?",
                        "",
                        "2. PLAN:",
                        "Keyword: 'remains' → Subtraction",
                        "Number sentence: 125.5 - 47.75 = N",
                        "",
                        "3. SOLVE:",
                        "  125.50",
                        "-  47.75",
                        "—————————",
                        "   77.75",
                        "",
                        "4. CHECK:",
                        "77.75 + 47.75 = 125.50 ✓"
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
                        "1. UNDERSTAND:",
                        "Started with: ₱500.00",
                        "Spent: ₱45.75 + ₱12.50 + ₱85.25",
                        "Received: ₱50.00",
                        "Asked: Money left?",
                        "",
                        "2. PLAN:",
                        "Need multiple steps:",
                        "• Add all expenses",
                        "• Subtract from ₱500",
                        "• Add ₱50 received",
                        "",
                        "3. SOLVE:",
                        "Total expenses: 45.75 + 12.50 + 85.25 = 143.50",
                        "After spending: 500.00 - 143.50 = 356.50",
                        "After receiving: 356.50 + 50.00 = 406.50",
                        "",
                        "4. CHECK:",
                        "500 - 143.50 + 50 = 406.50 ✓"
                    ),
                    answer = "John has ₱406.50 now"
                ),

                Slide.ExampleSlide(
                    id = 9,
                    title = "Example 4: Multi-Step Non-Routine",
                    problem = "A container has 15.75 kg of rice. On Monday, 3.5 kg was used. On Tuesday, 4.25 kg was used. On Wednesday, 2.5 kg was added. How much rice is in the container now?",
                    steps = listOf(
                        "1. UNDERSTAND:",
                        "Started: 15.75 kg",
                        "Used Monday: 3.5 kg",
                        "Used Tuesday: 4.25 kg",
                        "Added Wednesday: 2.5 kg",
                        "",
                        "2. PLAN:",
                        "Subtract what was used, add what was added",
                        "15.75 - 3.5 - 4.25 + 2.5 = N",
                        "",
                        "3. SOLVE:",
                        "15.75 - 3.5 = 12.25",
                        "12.25 - 4.25 = 8.00",
                        "8.00 + 2.5 = 10.5",
                        "",
                        "4. CHECK:",
                        "Total used: 3.5 + 4.25 = 7.75",
                        "15.75 - 7.75 + 2.5 = 10.5 ✓"
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
                        "1. UNDERSTAND:",
                        "Monday: 45.5 kg at ₱50/kg (price not needed!)",
                        "Tuesday: 38.75 kg",
                        "Asked: Total weight?",
                        "",
                        "2. PLAN:",
                        "Ignore the price - it's extra information",
                        "Keyword: 'total' → Addition",
                        "45.5 + 38.75 = N",
                        "",
                        "3. SOLVE:",
                        "  45.50",
                        "+ 38.75",
                        "————————",
                        "  84.25",
                        "",
                        "4. CHECK:",
                        "84.25 - 45.5 = 38.75 ✓"
                    ),
                    answer = "Total weight sold is 84.25 kg"
                ),

                Slide.ExampleSlide(
                    id = 12,
                    title = "Example 6: Comparison Problem",
                    problem = "Lisa's height is 1.45 meters and her brother's height is 1.68 meters. How much taller is her brother than Lisa?",
                    steps = listOf(
                        "1. UNDERSTAND:",
                        "Lisa: 1.45 m",
                        "Brother: 1.68 m",
                        "Asked: How much taller?",
                        "",
                        "2. PLAN:",
                        "Keywords: 'how much taller' → Subtraction",
                        "Subtract smaller from larger",
                        "1.68 - 1.45 = N",
                        "",
                        "3. SOLVE:",
                        "  1.68",
                        "- 1.45",
                        "————————",
                        "  0.23",
                        "",
                        "4. CHECK:",
                        "1.45 + 0.23 = 1.68 ✓"
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
                    content = "In this topic, you will learn how to multiply decimals.\n\nYou'll discover how to multiply decimals with up to 2 decimal places and understand where to place the decimal point in your answer!"
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
                        "",
                        "Step 1: Ignore decimals and multiply",
                        "58 × 3 = 174",
                        "",
                        "Step 2: Count decimal places",
                        "0.58 has 2 decimal places",
                        "0.03 has 2 decimal places",
                        "Total: 2 + 2 = 4 decimal places",
                        "",
                        "Step 3: Place decimal from the right",
                        "174 → 0.0174 (move 4 places from right)"
                    ),
                    answer = "Sophia spent 0.0174 hours on finishing touches"
                ),

                Slide.ExampleSlide(
                    id = 5,
                    title = "Detailed Multiplication Process",
                    problem = "Let's break down 0.58 × 0.03 vertically:",
                    steps = listOf(
                        "    0.58",
                        "  × 0.03",
                        "  ————————",
                        "",
                        "Multiply by hundredths (3):",
                        "    0.58",
                        "  × 0.03",
                        "  ————————",
                        "     174  (58 × 3)",
                        "",
                        "Multiply by tenths (0):",
                        "    0.58",
                        "  × 0.03",
                        "  ————————",
                        "     174",
                        "    000   (58 × 0)",
                        "",
                        "Add the partial products:",
                        "    174",
                        "  + 000",
                        "  ————————",
                        "    174"
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
                        "Step 1: Multiply without decimals",
                        "7 × 4 = 28",
                        "",
                        "Step 2: Count decimal places",
                        "0.7 has 1 decimal place",
                        "0.4 has 1 decimal place",
                        "Total: 1 + 1 = 2 decimal places",
                        "",
                        "Step 3: Place decimal from right",
                        "28 → 0.28 (move 2 places from right)"
                    ),
                    answer = "0.28"
                ),

                Slide.ExampleSlide(
                    id = 8,
                    title = "Example 3: Decimal × Whole Number",
                    problem = "Multiply: 0.45 × 3",
                    steps = listOf(
                        "Step 1: Multiply without decimal",
                        "45 × 3 = 135",
                        "",
                        "Step 2: Count decimal places",
                        "0.45 has 2 decimal places",
                        "3 has 0 decimal places (it's a whole number)",
                        "Total: 2 + 0 = 2 decimal places",
                        "",
                        "Step 3: Place decimal",
                        "135 → 1.35 (move 2 places from right)"
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
                        "",
                        "Step 1: Multiply",
                        "2 × 3 = 6",
                        "",
                        "Step 2: Count decimal places",
                        "0.02 (2 places) + 0.3 (1 place) = 3 total places",
                        "",
                        "Step 3: We need 3 places, but only have 1 digit (6)",
                        "Add zeros: 006",
                        "Place decimal: 0.006"
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
                        "",
                        "Step 1: Multiply",
                        "3550 × 5 = 17750",
                        "",
                        "Step 2: Count places",
                        "35.50 has 2 places",
                        "0.5 has 1 place",
                        "Total: 2 + 1 = 3 places",
                        "",
                        "Step 3: Place decimal",
                        "17750 → 17.750 = 17.75"
                    ),
                    answer = "You pay ₱17.75"
                ),

                Slide.ExampleSlide(
                    id = 14,
                    title = "Real-World Problem 2",
                    problem = "A recipe calls for 0.25 cups of sugar. If you want to make 2.5 times the recipe, how much sugar do you need?",
                    steps = listOf(
                        "Problem: 0.25 × 2.5",
                        "",
                        "Step 1: Multiply",
                        "25 × 25 = 625",
                        "",
                        "Step 2: Count places",
                        "0.25 has 2 places",
                        "2.5 has 1 place",
                        "Total: 2 + 1 = 3 places",
                        "",
                        "Step 3: Place decimal",
                        "625 → 0.625"
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
                    content = "In this lesson, you will learn how to multiply decimals by powers of 10.\n\nYou'll discover a simple trick: just move the decimal point! No complex multiplication needed!"
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
                        "",
                        "In 10 seconds:",
                        "10 × 0.15 = 1.5 km",
                        "Move decimal point 1 place RIGHT",
                        "(10 has 1 zero)",
                        "",
                        "In 100 seconds:",
                        "100 × 0.15 = 15 km",
                        "Move decimal point 2 places RIGHT",
                        "(100 has 2 zeros)",
                        "",
                        "In 1000 seconds:",
                        "1000 × 0.15 = 150 km",
                        "Move decimal point 3 places RIGHT",
                        "(1000 has 3 zeros, add a zero at the end)"
                    ),
                    answer = "The plane travels 1.5 km (10 sec), 15 km (100 sec), 150 km (1000 sec)"
                ),

                Slide.ConceptSlide(
                    id = 5,
                    title = "Multiplying by 10",
                    content = "When you multiply by 10, move the decimal point 1 place to the RIGHT:",
                    keyPoints = listOf(
                        "10 has ONE zero",
                        "Move decimal ONE place right",
                        "Examples:",
                        "0.15 × 10 = 1.5",
                        "3.7 × 10 = 37",
                        "0.08 × 10 = 0.8"
                    )
                ),

                Slide.ExampleSlide(
                    id = 6,
                    title = "Example: Multiply by 10",
                    problem = "Multiply: 0.15 × 10",
                    steps = listOf(
                        "Step 1: Count the zeros in 10",
                        "10 has 1 zero",
                        "",
                        "Step 2: Move decimal point 1 place RIGHT",
                        "0.15 → 01.5 → 1.5",
                        "",
                        "Step 3: Remove unnecessary zero",
                        "01.5 becomes 1.5"
                    ),
                    answer = "1.5"
                ),

                Slide.ConceptSlide(
                    id = 7,
                    title = "Multiplying by 100",
                    content = "When you multiply by 100, move the decimal point 2 places to the RIGHT:",
                    keyPoints = listOf(
                        "100 has TWO zeros",
                        "Move decimal TWO places right",
                        "Examples:",
                        "0.15 × 100 = 15",
                        "0.8 × 100 = 80",
                        "1.23 × 100 = 123"
                    )
                ),

                Slide.ExampleSlide(
                    id = 8,
                    title = "Example: Multiply by 100",
                    problem = "Multiply: 0.15 × 100",
                    steps = listOf(
                        "Step 1: Count the zeros in 100",
                        "100 has 2 zeros",
                        "",
                        "Step 2: Move decimal point 2 places RIGHT",
                        "0.15 → 015. → 15",
                        "",
                        "Step 3: The answer is a whole number!",
                        "15"
                    ),
                    answer = "15"
                ),

                Slide.ConceptSlide(
                    id = 9,
                    title = "Multiplying by 1000",
                    content = "When you multiply by 1000, move the decimal point 3 places to the RIGHT:",
                    keyPoints = listOf(
                        "1000 has THREE zeros",
                        "Move decimal THREE places right",
                        "Add zeros if needed",
                        "Examples:",
                        "0.15 × 1000 = 150",
                        "1.5 × 1000 = 1500",
                        "0.007 × 1000 = 7"
                    )
                ),

                Slide.ExampleSlide(
                    id = 10,
                    title = "Example: Multiply by 1000",
                    problem = "Multiply: 0.15 × 1000",
                    steps = listOf(
                        "Step 1: Count the zeros in 1000",
                        "1000 has 3 zeros",
                        "",
                        "Step 2: Move decimal point 3 places RIGHT",
                        "0.15 → 0150. → 150",
                        "",
                        "Step 3: We needed to add a zero",
                        "Because we only had 2 digits after the decimal"
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
                        "10¹ × 0.15 = ?",
                        "Exponent is 1 → move decimal 1 place RIGHT",
                        "0.15 → 1.5",
                        "",
                        "10² × 0.15 = ?",
                        "Exponent is 2 → move decimal 2 places RIGHT",
                        "0.15 → 15",
                        "",
                        "10³ × 0.15 = ?",
                        "Exponent is 3 → move decimal 3 places RIGHT",
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
                        "Step 1: Count decimal places in 0.1",
                        "0.1 has 1 decimal place",
                        "",
                        "Step 2: Move decimal point 1 place LEFT",
                        "15. → 1.5",
                        "",
                        "Alternative: Use negative exponent",
                        "15 × 10⁻¹ = 1.5",
                        "Negative 1 → move 1 place LEFT"
                    ),
                    answer = "1.5"
                ),

                Slide.ExampleSlide(
                    id = 18,
                    title = "Example: Multiply by 0.01",
                    problem = "Multiply: 15 × 0.01",
                    steps = listOf(
                        "Step 1: Count decimal places in 0.01",
                        "0.01 has 2 decimal places",
                        "",
                        "Step 2: Move decimal point 2 places LEFT",
                        "15. → 0.15",
                        "",
                        "Alternative: Use negative exponent",
                        "15 × 10⁻² = 0.15",
                        "Negative 2 → move 2 places LEFT"
                    ),
                    answer = "0.15"
                ),

                Slide.ExampleSlide(
                    id = 19,
                    title = "Example: Multiply by 0.001",
                    problem = "Multiply: 15 × 0.001",
                    steps = listOf(
                        "Step 1: Count decimal places in 0.001",
                        "0.001 has 3 decimal places",
                        "",
                        "Step 2: Move decimal point 3 places LEFT",
                        "15. → 0.015",
                        "",
                        "Alternative: Use negative exponent",
                        "15 × 10⁻³ = 0.015",
                        "Negative 3 → move 3 places LEFT",
                        "",
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
                        "Positive Powers (RIGHT):",
                        "× 10 or 10¹ → move 1 place →",
                        "× 100 or 10² → move 2 places →",
                        "× 1000 or 10³ → move 3 places →",
                        "",
                        "Negative Powers (LEFT):",
                        "× 0.1 or 10⁻¹ → move 1 place ←",
                        "× 0.01 or 10⁻² → move 2 places ←",
                        "× 0.001 or 10⁻³ → move 3 places ←"
                    )
                ),

                Slide.ExampleSlide(
                    id = 22,
                    title = "Practice Problem 1",
                    problem = "A computer processes 0.75 gigabytes per second. How much does it process in 100 seconds?",
                    steps = listOf(
                        "Step 1: Set up the problem",
                        "0.75 × 100",
                        "",
                        "Step 2: Count zeros in 100",
                        "100 has 2 zeros",
                        "",
                        "Step 3: Move decimal 2 places RIGHT",
                        "0.75 → 75",
                        "",
                        "Step 4: Add the unit",
                        "75 gigabytes"
                    ),
                    answer = "The computer processes 75 gigabytes"
                ),

                Slide.ExampleSlide(
                    id = 23,
                    title = "Practice Problem 2",
                    problem = "A bacteria culture has 450 cells. After treatment, only 0.01 times the original amount remains. How many cells are left?",
                    steps = listOf(
                        "Step 1: Set up the problem",
                        "450 × 0.01",
                        "",
                        "Step 2: Count decimal places in 0.01",
                        "0.01 has 2 decimal places",
                        "",
                        "Step 3: Move decimal 2 places LEFT",
                        "450. → 4.50 → 4.5",
                        "",
                        "Step 4: Add the unit",
                        "4.5 cells"
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
                        "1. UNDERSTAND:",
                        "Given: ₱85.50 per kg, buying 2.5 kg",
                        "Asked: Total cost?",
                        "",
                        "2. PLAN:",
                        "Keyword: 'per' → Multiplication",
                        "Number sentence: 85.50 × 2.5 = N",
                        "",
                        "3. SOLVE:",
                        "Multiply: 8550 × 25 = 213750",
                        "Count places: 85.50 (2) + 2.5 (1) = 3 places",
                        "213750 → 213.750 = ₱213.75",
                        "",
                        "4. CHECK:",
                        "Round: 86 × 3 ≈ 258, close to 213.75 ✓"
                    ),
                    answer = "Maria will pay ₱213.75"
                ),

                Slide.ExampleSlide(
                    id = 6,
                    title = "Example 2: Distance Problem",
                    problem = "A car travels at 62.5 kilometers per hour. How far will it travel in 3.2 hours?",
                    steps = listOf(
                        "1. UNDERSTAND:",
                        "Given: Speed 62.5 km/h, Time 3.2 hours",
                        "Asked: Distance traveled?",
                        "",
                        "2. PLAN:",
                        "Formula: Distance = Speed × Time",
                        "Number sentence: 62.5 × 3.2 = N",
                        "",
                        "3. SOLVE:",
                        "Multiply: 625 × 32 = 20000",
                        "Count places: 62.5 (1) + 3.2 (1) = 2 places",
                        "20000 → 200.00 = 200 km",
                        "",
                        "4. CHECK:",
                        "Round: 63 × 3 = 189, close to 200 ✓"
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
                        "1. UNDERSTAND:",
                        "Given: Length 8.5 m, Width 4.2 m",
                        "Asked: Area?",
                        "",
                        "2. PLAN:",
                        "Formula: Area = Length × Width",
                        "Number sentence: 8.5 × 4.2 = N",
                        "",
                        "3. SOLVE:",
                        "Multiply: 85 × 42 = 3570",
                        "Count places: 8.5 (1) + 4.2 (1) = 2 places",
                        "3570 → 35.70 = 35.7 m²",
                        "",
                        "4. CHECK:",
                        "Round: 9 × 4 = 36, close to 35.7 ✓"
                    ),
                    answer = "The garden's area is 35.7 square meters"
                ),

                Slide.ExampleSlide(
                    id = 9,
                    title = "Example 4: Money and Rate",
                    problem = "John earns ₱125.50 per hour. He worked 6.5 hours today. How much did he earn?",
                    steps = listOf(
                        "1. UNDERSTAND:",
                        "Given: ₱125.50 per hour, 6.5 hours worked",
                        "Asked: Total earnings?",
                        "",
                        "2. PLAN:",
                        "Keyword: 'per' → Multiplication",
                        "Number sentence: 125.50 × 6.5 = N",
                        "",
                        "3. SOLVE:",
                        "Multiply: 12550 × 65 = 815750",
                        "Count places: 125.50 (2) + 6.5 (1) = 3 places",
                        "815750 → 815.750 = ₱815.75",
                        "",
                        "4. CHECK:",
                        "Round: 126 × 7 = 882, close to 815.75 ✓"
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
                        "1. UNDERSTAND:",
                        "Given: 2.4 cups needed, making ½",
                        "Asked: Flour for half recipe?",
                        "",
                        "2. PLAN:",
                        "Keyword: 'of' → Multiplication",
                        "½ = 0.5",
                        "Number sentence: 2.4 × 0.5 = N",
                        "",
                        "3. SOLVE:",
                        "Multiply: 24 × 5 = 120",
                        "Count places: 2.4 (1) + 0.5 (1) = 2 places",
                        "120 → 1.20 = 1.2 cups",
                        "",
                        "4. CHECK:",
                        "Half of 2.4 should be around 1.2 ✓"
                    ),
                    answer = "You need 1.2 cups of flour"
                ),

                Slide.ExampleSlide(
                    id = 12,
                    title = "Example 6: Multi-Item Shopping",
                    problem = "Maria bought 1.5 kg of chicken at ₱180.00 per kg and 2.3 kg of fish at ₱250.00 per kg. How much did she spend in total?",
                    steps = listOf(
                        "1. UNDERSTAND:",
                        "Chicken: 1.5 kg at ₱180/kg",
                        "Fish: 2.3 kg at ₱250/kg",
                        "Asked: Total cost?",
                        "",
                        "2. PLAN:",
                        "Find cost of each, then add",
                        "Chicken: 180 × 1.5",
                        "Fish: 250 × 2.3",
                        "",
                        "3. SOLVE:",
                        "Chicken: 180 × 1.5 = 270.0 = ₱270",
                        "Fish: 250 × 2.3 = 575.0 = ₱575",
                        "Total: 270 + 575 = ₱845",
                        "",
                        "4. CHECK:",
                        "Estimate: 180×2 + 250×2 = 860, close ✓"
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
                        "1. UNDERSTAND:",
                        "Original: ₱450.00",
                        "Sale: 0.75 of original (75%)",
                        "Asked: Sale price?",
                        "",
                        "2. PLAN:",
                        "Keyword: 'of' → Multiplication",
                        "Number sentence: 450 × 0.75 = N",
                        "",
                        "3. SOLVE:",
                        "Multiply: 450 × 75 = 33750",
                        "Count places: 450 (0) + 0.75 (2) = 2 places",
                        "33750 → 337.50 = ₱337.50",
                        "",
                        "4. CHECK:",
                        "75% of 450 ≈ ¾ of 450 = 337.5 ✓"
                    ),
                    answer = "The sale price is ₱337.50"
                ),

                Slide.ExampleSlide(
                    id = 15,
                    title = "Example 8: Unit Conversion",
                    problem = "One meter equals 3.28 feet. A room is 4.5 meters long. How long is it in feet?",
                    steps = listOf(
                        "1. UNDERSTAND:",
                        "Given: 1 m = 3.28 ft, room is 4.5 m",
                        "Asked: Length in feet?",
                        "",
                        "2. PLAN:",
                        "Multiply meters by conversion factor",
                        "Number sentence: 4.5 × 3.28 = N",
                        "",
                        "3. SOLVE:",
                        "Multiply: 45 × 328 = 14760",
                        "Count places: 4.5 (1) + 3.28 (2) = 3 places",
                        "14760 → 14.760 = 14.76 feet",
                        "",
                        "4. CHECK:",
                        "Round: 5 × 3 = 15, close to 14.76 ✓"
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
                        "1. UNDERSTAND:",
                        "Cupcakes: ₱35.50 each",
                        "Cookies: ₱12.00 each (not needed!)",
                        "Lisa bought: 6 cupcakes",
                        "Asked: How much spent?",
                        "",
                        "2. PLAN:",
                        "Ignore cookie price - extra info",
                        "Number sentence: 35.50 × 6 = N",
                        "",
                        "3. SOLVE:",
                        "Multiply: 3550 × 6 = 21300",
                        "Count places: 35.50 (2) + 6 (0) = 2 places",
                        "21300 → 213.00 = ₱213",
                        "",
                        "4. CHECK:",
                        "36 × 6 = 216, close to 213 ✓"
                    ),
                    answer = "Lisa spent ₱213.00"
                ),

                Slide.ExampleSlide(
                    id = 18,
                    title = "Example 10: Comparing Costs",
                    problem = "Store A sells rice at ₱52.50 per kg. Store B sells it at ₱48.75 per kg. If you buy 8.5 kg, how much do you save by buying from Store B?",
                    steps = listOf(
                        "1. UNDERSTAND:",
                        "Store A: ₱52.50/kg",
                        "Store B: ₱48.75/kg",
                        "Buying: 8.5 kg",
                        "Asked: Savings?",
                        "",
                        "2. PLAN:",
                        "Find cost at each store, then subtract",
                        "Store A: 52.50 × 8.5",
                        "Store B: 48.75 × 8.5",
                        "",
                        "3. SOLVE:",
                        "Store A: 52.50 × 8.5 = 446.25",
                        "Store B: 48.75 × 8.5 = 414.375 = ₱414.38",
                        "Savings: 446.25 - 414.38 = ₱31.87",
                        "",
                        "4. CHECK:",
                        "Difference per kg: 52.50 - 48.75 = 3.75",
                        "3.75 × 8.5 ≈ 32, close to 31.87 ✓"
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
                        "",
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
                        "",
                        "GIVEN information:",
                        "• Maria started with ₱500",
                        "• Bought 3 notebooks at ₱35.50 each",
                        "• Bought 2 pens at ₱15.75 each",
                        "",
                        "ASKED to find:",
                        "• How much money is left?",
                        "",
                        "In my own words:",
                        "Maria spent money on notebooks and pens.",
                        "I need to find what remains from ₱500."
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
                        "",
                        "Multiple operations? Plan the order!"
                    )
                ),

                Slide.ExampleSlide(
                    id = 9,
                    title = "Example: Planning Phase",
                    problem = "Maria has ₱500. She bought 3 notebooks at ₱35.50 each and 2 pens at ₱15.75 each. How much money does she have left?",
                    steps = listOf(
                        "Let's PLAN:",
                        "",
                        "Operations needed:",
                        "• Multiplication (to find cost of notebooks)",
                        "• Multiplication (to find cost of pens)",
                        "• Addition (to find total spent)",
                        "• Subtraction (to find money left)",
                        "",
                        "Number sentences:",
                        "Cost of notebooks: 35.50 × 3",
                        "Cost of pens: 15.75 × 2",
                        "Total spent: Cost of notebooks + Cost of pens",
                        "Money left: 500 - Total spent"
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
                        "",
                        "Step 1: Cost of notebooks",
                        "35.50 × 3 = 106.50",
                        "₱106.50 for notebooks",
                        "",
                        "Step 2: Cost of pens",
                        "15.75 × 2 = 31.50",
                        "₱31.50 for pens",
                        "",
                        "Step 3: Total spent",
                        "106.50 + 31.50 = 138.00",
                        "Total spent: ₱138.00",
                        "",
                        "Step 4: Money left",
                        "500.00 - 138.00 = 362.00",
                        "Money left: ₱362.00"
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
                        "Let's CHECK:",
                        "",
                        "Our answer: ₱362.00",
                        "",
                        "Method 1 - Work backwards:",
                        "362 + 138 = 500 ✓",
                        "",
                        "Method 2 - Estimate:",
                        "Notebooks: 3 × 36 ≈ 108",
                        "Pens: 2 × 16 ≈ 32",
                        "Total: 108 + 32 = 140",
                        "Left: 500 - 140 = 360 ✓",
                        "Close to 362!",
                        "",
                        "Method 3 - Reasonableness:",
                        "Spent less than half, so having ₱362 left makes sense ✓"
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
                        "1. UNDERSTAND:",
                        "Given: Length 12.5 m, Width 8.4 m, ₱85.50/m",
                        "Asked: Total cost to fence?",
                        "Note: Fencing goes around perimeter",
                        "",
                        "2. PLAN:",
                        "Find perimeter: 2(L + W)",
                        "Multiply perimeter by cost per meter",
                        "",
                        "3. SOLVE:",
                        "Perimeter = 2(12.5 + 8.4)",
                        "= 2(20.9) = 41.8 meters",
                        "Cost = 41.8 × 85.50 = ₱3,573.90",
                        "",
                        "4. CHECK:",
                        "Estimate: 2(13+8)×86 = 2(21)×86 = 42×86 ≈ 3,600",
                        "Close to 3,573.90 ✓"
                    ),
                    answer = "It will cost ₱3,573.90 to fence the garden"
                ),

                Slide.ExampleSlide(
                    id = 17,
                    title = "Complete Example 3: Multi-Step Problem",
                    problem = "A store offers a 20% discount on a bag originally priced at ₱1,250. After the discount, a 12% sales tax is added. What is the final price?",
                    steps = listOf(
                        "1. UNDERSTAND:",
                        "Original: ₱1,250, 20% discount, then 12% tax",
                        "Asked: Final price?",
                        "",
                        "2. PLAN:",
                        "Step 1: Find discount amount (20% of 1,250)",
                        "Step 2: Subtract discount from original",
                        "Step 3: Find tax amount (12% of discounted price)",
                        "Step 4: Add tax to discounted price",
                        "",
                        "3. SOLVE:",
                        "Discount: 1,250 × 0.20 = 250",
                        "After discount: 1,250 - 250 = 1,000",
                        "Tax: 1,000 × 0.12 = 120",
                        "Final: 1,000 + 120 = ₱1,120",
                        "",
                        "4. CHECK:",
                        "Original discounted to 80%: 1,250×0.8=1,000 ✓",
                        "Then 112% of 1,000: 1,000×1.12=1,120 ✓"
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
                        "1. UNDERSTAND:",
                        "150 books (extra info - not needed)",
                        "Each book: ₱125.50 (NEEDED)",
                        "75 magazines at ₱45 (extra info - not asked)",
                        "Buying: 4 books (NEEDED)",
                        "Asked: Cost of 4 books?",
                        "",
                        "2. PLAN:",
                        "Ignore: number of books on shelf, magazines",
                        "Use: price per book and quantity bought",
                        "125.50 × 4 = N",
                        "",
                        "3. SOLVE:",
                        "125.50 × 4 = 502.00",
                        "",
                        "4. CHECK:",
                        "125 × 4 = 500, close to 502 ✓"
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
                        "",
                        "Additional Tips:",
                        "• Look for keywords that suggest operations",
                        "• Ignore extra information not needed",
                        "• Draw diagrams when helpful",
                        "• Estimate to check reasonableness",
                        "• Practice makes perfect!"
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
                    keyPoints = emptyList()
                ),

                Slide.ConceptSlide(
                    id = 3,
                    title = "Understanding Decimals",
                    content = "Even though we use different notations, we're still looking at nonnegative rational numbers. You can divide decimals using either the fraction method or the decimal method, just like you do with multiplication.",
                    keyPoints = emptyList()
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
                        "Step 1: Make the divisor a whole number",
                        "Multiply 0.5 by 10 → move decimal 1 place right",
                        "0.5 = 5",
                        "",
                        "Step 2: Move decimal in dividend the same way",
                        "Multiply 0.25 by 10 → move decimal 1 place right",
                        "0.25 = 2.5",
                        "",
                        "Take note: What we do with the divisor, we do the same with the dividend."
                    ),
                    answer = "Now we have: 2.5 ÷ 5"
                ),

                Slide.ExampleSlide(
                    id = 6,
                    title = "Example: 0.25 ÷ 0.5 (Continued)",
                    problem = "2.5 ÷ 5 = ?",
                    steps = listOf(
                        "Step 3: Divide like whole numbers",
                        "Put the decimal point of the quotient just above the decimal point of the dividend",
                        "",
                        "    0.5",
                        "5 ) 2.5",
                        "   -2.5",
                        "    ———",
                        "     0",
                        "",
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
                        "First: Change the divisor to a whole number by moving the decimal point to the rightmost place",
                        "• Multiply by 10 if only one decimal place",
                        "• Multiply by 100 if two decimal places",
                        "",
                        "Second: Move the decimal point in the dividend the same number of places",
                        "",
                        "Third: Insert zeros to the dividend when needed",
                        "",
                        "Remember: What we do with the divisor, we do the same to the dividend"
                    )
                ),

                Slide.ExampleSlide(
                    id = 9,
                    title = "Example: 2.4 ÷ 0.3",
                    problem = "2.4 ÷ 0.3 = ?",
                    steps = listOf(
                        "Step 1: Make the divisor a whole number",
                        "Move the decimal one place to the right:",
                        "0.3 → 3",
                        "",
                        "Step 2: Move the decimal in the dividend the same number of places",
                        "2.4 → 24",
                        "",
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
                        "To divide decimals:",
                        "1. Make the divisor a whole number by moving the decimal point",
                        "2. Move the decimal in the dividend the same number of places",
                        "3. Divide like whole numbers",
                        "4. Place decimal point in quotient above the dividend's decimal point",
                        "5. Check by multiplying the quotient by the divisor",
                        "",
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
                    content = "In this topic, you will learn how to divide decimals by 10 and more.\n\nYou will understand how to divide decimals with up to four decimal places by 0.1, 0.01, and 0.001, and decimals with up to two decimal places by 10, 100, and 1,000 in your head!"
                ),

                Slide.ConceptSlide(
                    id = 2,
                    title = "How to Divide Decimals by 10?",
                    content = "To divide a decimal by 10, move the decimal point one place to the LEFT. This makes the number ten times smaller.",
                    keyPoints = listOf(
                        "Divide by 10 → Move decimal 1 place LEFT",
                        "Divide by 100 → Move decimal 2 places LEFT",
                        "Divide by 1,000 → Move decimal 3 places LEFT",
                        "",
                        "Example: 45.6 ÷ 10 = 4.56",
                        "Example: 45.6 ÷ 100 = 0.456",
                        "Example: 45.6 ÷ 1,000 = 0.0456"
                    )
                ),

                Slide.ConceptSlide(
                    id = 3,
                    title = "Dividing by 0.1, 0.01, 0.001",
                    content = "Here's an interesting pattern: dividing by 0.1, 0.01, 0.001, and 0.0001 is the same as multiplying by 10, 100, 1,000, and 10,000!",
                    keyPoints = listOf(
                        "÷ 0.1 = × 10 (move decimal 1 place RIGHT)",
                        "÷ 0.01 = × 100 (move decimal 2 places RIGHT)",
                        "÷ 0.001 = × 1,000 (move decimal 3 places RIGHT)",
                        "÷ 0.0001 = × 10,000 (move decimal 4 places RIGHT)",
                        "",
                        "Let's see this with examples!"
                    )
                ),

                Slide.ExampleSlide(
                    id = 4,
                    title = "Example: 0.5 ÷ 0.1",
                    problem = "Let us divide 0.5 by 0.1",
                    steps = listOf(
                        "Division by 0.1 is the same as multiplying by 10",
                        "",
                        "Method 1: Move decimal 1 place to the RIGHT",
                        "0.5 ÷ 0.1",
                        "Move both decimals 1 place right:",
                        "0.5 → 5 and 0.1 → 1",
                        "Now divide: 5 ÷ 1 = 5",
                        "",
                        "Method 2: Think of it as multiplication",
                        "0.5 ÷ 0.1 = 0.5 × 10 = 5",
                        "",
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
                        "",
                        "Method 1: Move decimal 2 places to the RIGHT",
                        "0.5 ÷ 0.01",
                        "Move both decimals 2 places right:",
                        "0.5 → 0.50 → 50 and 0.01 → 1",
                        "Now divide: 50 ÷ 1 = 50",
                        "",
                        "Method 2: Think of it as multiplication",
                        "0.5 ÷ 0.01 = 0.5 × 100 = 50",
                        "",
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
                        "",
                        "Method 1: Move decimal 3 places to the RIGHT",
                        "0.5 ÷ 0.001",
                        "Move both decimals 3 places right:",
                        "0.5 → 0.500 → 500 and 0.001 → 1",
                        "Now divide: 500 ÷ 1 = 500",
                        "",
                        "Method 2: Think of it as multiplication",
                        "0.5 ÷ 0.001 = 0.5 × 1,000 = 500",
                        "",
                        "Notice: We added two zeros to move 3 places!"
                    ),
                    answer = "500"
                ),

                Slide.ConceptSlide(
                    id = 7,
                    title = "Mental Division by 10, 100, 1,000",
                    content = "How do we mentally divide decimals by 10, 100, or 1,000? To what direction do we move the decimal point?",
                    keyPoints = listOf(
                        "When dividing by 10:",
                        "→ Move the decimal 1 place to the LEFT",
                        "Example: 45.6 ÷ 10 = 4.56",
                        "",
                        "When dividing by 100:",
                        "→ Move the decimal 2 places to the LEFT",
                        "Example: 45.6 ÷ 100 = 0.456",
                        "",
                        "When dividing by 1,000:",
                        "→ Move the decimal 3 places to the LEFT",
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
                        "Dividing by Powers of 10 (Move LEFT ←):",
                        "÷ 10 → move 1 place left",
                        "÷ 100 → move 2 places left",
                        "÷ 1,000 → move 3 places left",
                        "",
                        "Dividing by Decimal Powers (Move RIGHT →):",
                        "÷ 0.1 = × 10 → move 1 place right",
                        "÷ 0.01 = × 100 → move 2 places right",
                        "÷ 0.001 = × 1,000 → move 3 places right"
                    )
                ),

                Slide.ExampleSlide(
                    id = 10,
                    title = "More Examples: Dividing by 10",
                    problem = "Practice with different numbers:",
                    steps = listOf(
                        "Example 1: 8.6 ÷ 10",
                        "Move decimal 1 place LEFT",
                        "8.6 → 0.86",
                        "",
                        "Example 2: 123.45 ÷ 10",
                        "Move decimal 1 place LEFT",
                        "123.45 → 12.345",
                        "",
                        "Example 3: 7 ÷ 10",
                        "Move decimal 1 place LEFT",
                        "7.0 → 0.7"
                    ),
                    answer = "0.86, 12.345, and 0.7"
                ),

                Slide.ExampleSlide(
                    id = 11,
                    title = "More Examples: Dividing by 100",
                    problem = "Practice with dividing by 100:",
                    steps = listOf(
                        "Example 1: 8.6 ÷ 100",
                        "Move decimal 2 places LEFT",
                        "8.6 → 0.086",
                        "",
                        "Example 2: 123.45 ÷ 100",
                        "Move decimal 2 places LEFT",
                        "123.45 → 1.2345",
                        "",
                        "Example 3: 50 ÷ 100",
                        "Move decimal 2 places LEFT",
                        "50.0 → 0.50 = 0.5"
                    ),
                    answer = "0.086, 1.2345, and 0.5"
                ),

                Slide.ExampleSlide(
                    id = 12,
                    title = "More Examples: Dividing by 0.1",
                    problem = "Practice with dividing by 0.1:",
                    steps = listOf(
                        "Remember: ÷ 0.1 = × 10",
                        "",
                        "Example 1: 3.5 ÷ 0.1",
                        "Move decimal 1 place RIGHT",
                        "3.5 → 35",
                        "",
                        "Example 2: 0.08 ÷ 0.1",
                        "Move decimal 1 place RIGHT",
                        "0.08 → 0.8",
                        "",
                        "Example 3: 12.34 ÷ 0.1",
                        "Move decimal 1 place RIGHT",
                        "12.34 → 123.4"
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
                        "",
                        "Think about it:",
                        "• 10 ÷ 10 = 1 (smaller)",
                        "• 10 ÷ 0.1 = 100 (bigger)",
                        "",
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
                        "",
                        "Remember the direction:",
                        "÷ by whole numbers (10, 100, 1000) → LEFT ←",
                        "÷ by decimals (0.1, 0.01, 0.001) → RIGHT →",
                        "",
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
                        "",
                        "Dividing by 0.1, 0.01, or 0.001 is the same as multiplying by 10, 100, or 1,000:",
                        "÷ 0.1 = × 10 → move decimal 1 place RIGHT",
                        "÷ 0.01 = × 100 → move decimal 2 places RIGHT",
                        "÷ 0.001 = × 1,000 → move decimal 3 places RIGHT",
                        "",
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
                    content = "In this topic, you will learn to identify rational and irrational numbers.\n\nYou will understand how to identify the difference between these types of numbers."
                ),

                Slide.ConceptSlide(
                    id = 2,
                    title = "What is a Rational Number?",
                    content = "A rational number is one that can be written as a fraction or a decimal.",
                    keyPoints = listOf(
                        "Can be written as a fraction (a/b where b ≠ 0)",
                        "When written as a decimal, it either stops or repeats a pattern",
                        "Includes all integers (positive, negative, and zero)",
                        "",
                        "Examples:",
                        "−3, −2, −1, 0, 1, 2",
                        "1.111..., 2.5, 3.333...",
                        "½ = 0.5",
                        "⅓ = 0.333...",
                        "¾ = 0.75"
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
                        "",
                        "Examples:",
                        "√2 = 1.41421356...",
                        "√3 = 1.73205080...",
                        "√5 = 2.23606797...",
                        "π (pi) = 3.14159265...",
                        "e = 2.71828182..."
                    )
                ),

                Slide.ConceptSlide(
                    id = 4,
                    title = "Key Differences",
                    content = "How to tell them apart:",
                    keyPoints = listOf(
                        "Rational Numbers:",
                        "✓ Can be written as fractions",
                        "✓ Decimals that end or repeat",
                        "✓ Examples: 0.5, 0.333..., 2, −4",
                        "",
                        "Irrational Numbers:",
                        "✗ Cannot be written as fractions",
                        "✗ Decimals go on forever without pattern",
                        "✗ Examples: √2, √3, π, √5"
                    )
                ),

                Slide.ExampleSlide(
                    id = 5,
                    title = "Example: Identifying Rational Numbers",
                    problem = "Which of these are rational numbers?",
                    steps = listOf(
                        "Number 1: 5",
                        "Can be written as ⁵⁄₁ → RATIONAL ✓",
                        "",
                        "Number 2: 0.75",
                        "Decimal terminates → Can write as ¾ → RATIONAL ✓",
                        "",
                        "Number 3: 0.666...",
                        "Repeats forever → Can write as ⅔ → RATIONAL ✓",
                        "",
                        "Number 4: −8",
                        "Integer → Can write as −⁸⁄₁ → RATIONAL ✓"
                    ),
                    answer = "All of these are rational numbers!"
                ),

                Slide.ExampleSlide(
                    id = 6,
                    title = "Example: Identifying Irrational Numbers",
                    problem = "Which of these are irrational numbers?",
                    steps = listOf(
                        "Number 1: √4",
                        "√4 = 2 (perfect square) → RATIONAL",
                        "",
                        "Number 2: √7",
                        "Not a perfect square → Goes on forever",
                        "2.6457513... → IRRATIONAL ✓",
                        "",
                        "Number 3: π",
                        "3.14159265... (never ends or repeats)",
                        "→ IRRATIONAL ✓",
                        "",
                        "Number 4: √9",
                        "√9 = 3 (perfect square) → RATIONAL"
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
                        "Perfect Squares (Rational):",
                        "√1 = 1, √4 = 2, √9 = 3",
                        "√16 = 4, √25 = 5, √36 = 6",
                        "√49 = 7, √64 = 8, √81 = 9",
                        "√100 = 10",
                        "",
                        "Non-Perfect Squares (Irrational):",
                        "√2, √3, √5, √6, √7, √8",
                        "√10, √11, √12, √13, √14, √15",
                        "And so on..."
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
                        "Rational Numbers:",
                        "• Can be written as fractions (a/b)",
                        "• Decimals that terminate or repeat",
                        "• Include all integers and fractions",
                        "• Examples: 5, 0.75, 0.333..., −2, ½",
                        "",
                        "Irrational Numbers:",
                        "• Cannot be written as fractions",
                        "• Decimals that never end and never repeat",
                        "• Include square roots of non-perfect squares",
                        "• Examples: √2, √3, √5, π, √10",
                        "",
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
                    content = "In this topic, you will learn how to identify terminating decimals and repeating (non-terminating) decimals.\n\nYou will understand the difference between the two types."
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
                        "",
                        "Examples:",
                        "0.87 (2 decimal places)",
                        "82.25 (2 decimal places)",
                        "9.527 (3 decimal places)",
                        "224.9803 (4 decimal places)"
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
                        "",
                        "Examples:",
                        "0.333... (3 repeats)",
                        "0.00111... (1 repeats)",
                        "1.234234... (234 repeats)",
                        "0.666... (6 repeats)",
                        "2.181818... (18 repeats)"
                    )
                ),

                Slide.ConceptSlide(
                    id = 4,
                    title = "Understanding Vinculum",
                    content = "A vinculum is a horizontal line placed over digits to show they repeat indefinitely.",
                    keyPoints = listOf(
                        "Vinculum = horizontal line over repeating digits",
                        "Shows which digits repeat forever",
                        "",
                        "Examples with Vinculum:",
                        "0.333... → 0.3̅ (3 repeats)",
                        "0.666... → 0.6̅ (6 repeats)",
                        "1.234234... → 1.2̅3̅4̅ (234 repeats)",
                        "0.181818... → 0.1̅8̅ (18 repeats)",
                        "2.7777... → 2.7̅ (7 repeats)",
                        "",
                        "The line shows which part repeats!"
                    )
                ),

                Slide.ExampleSlide(
                    id = 5,
                    title = "Example: Identifying Terminating Decimals",
                    problem = "Which of these are terminating decimals?",
                    steps = listOf(
                        "Decimal 1: 0.5",
                        "Has 1 digit, then stops → TERMINATING ✓",
                        "",
                        "Decimal 2: 3.75",
                        "Has 2 digits, then stops → TERMINATING ✓",
                        "",
                        "Decimal 3: 12.125",
                        "Has 3 digits, then stops → TERMINATING ✓",
                        "",
                        "Decimal 4: 0.875",
                        "Has 3 digits, then stops → TERMINATING ✓"
                    ),
                    answer = "All of these are terminating decimals!"
                ),

                Slide.ExampleSlide(
                    id = 6,
                    title = "Example: Identifying Repeating Decimals",
                    problem = "Which of these are repeating decimals?",
                    steps = listOf(
                        "Decimal 1: 0.333...",
                        "3 repeats forever → REPEATING ✓",
                        "Can write as 0.3̅",
                        "",
                        "Decimal 2: 0.454545...",
                        "45 repeats forever → REPEATING ✓",
                        "Can write as 0.4̅5̅",
                        "",
                        "Decimal 3: 1.666...",
                        "6 repeats forever → REPEATING ✓",
                        "Can write as 1.6̅",
                        "",
                        "Decimal 4: 2.121212...",
                        "12 repeats forever → REPEATING ✓",
                        "Can write as 2.1̅2̅"
                    ),
                    answer = "All of these are repeating decimals!"
                ),

                Slide.ExampleSlide(
                    id = 7,
                    title = "Example: Converting Fractions",
                    problem = "Let's see how fractions become decimals:",
                    steps = listOf(
                        "Fraction 1: ½",
                        "1 ÷ 2 = 0.5",
                        "Stops after 1 digit → TERMINATING",
                        "",
                        "Fraction 2: ¼",
                        "1 ÷ 4 = 0.25",
                        "Stops after 2 digits → TERMINATING",
                        "",
                        "Fraction 3: ⅓",
                        "1 ÷ 3 = 0.333...",
                        "3 repeats forever → REPEATING (0.3̅)",
                        "",
                        "Fraction 4: ⅔",
                        "2 ÷ 3 = 0.666...",
                        "6 repeats forever → REPEATING (0.6̅)"
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
                        "Method 1: Use three dots (ellipsis)",
                        "0.333... , 1.454545...",
                        "",
                        "Method 2: Use vinculum (bar notation)",
                        "0.3̅ , 1.4̅5̅",
                        "",
                        "Method 3: Write the pattern in parentheses",
                        "0.(3) , 1.(45)",
                        "",
                        "All three methods mean the same thing!",
                        "The vinculum is the most common notation."
                    )
                ),

                Slide.ExampleSlide(
                    id = 12,
                    title = "Example: More Fraction Conversions",
                    problem = "Convert these fractions and identify the type:",
                    steps = listOf(
                        "⅛ = 1 ÷ 8 = 0.125",
                        "→ TERMINATING",
                        "",
                        "⅕ = 1 ÷ 5 = 0.2",
                        "→ TERMINATING",
                        "",
                        "⅑ = 1 ÷ 9 = 0.111...",
                        "→ REPEATING (0.1̅)",
                        "",
                        "⅐ = 1 ÷ 7 = 0.142857142857...",
                        "→ REPEATING (0.1̅4̅2̅8̅5̅7̅)",
                        "",
                        "³⁄₁₁ = 3 ÷ 11 = 0.272727...",
                        "→ REPEATING (0.2̅7̅)"
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
                        "Terminating Decimals:",
                        "✓ Count the digits - they're finite",
                        "✓ No ... (ellipsis) or bar notation",
                        "✓ Examples: 0.5, 2.75, 3.125",
                        "",
                        "Repeating Decimals:",
                        "✓ Look for ... (ellipsis)",
                        "✓ Look for bar (vinculum) over digits",
                        "✓ Look for pattern that repeats",
                        "✓ Examples: 0.333..., 0.3̅, 1.4̅5̅",
                        "",
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
                        "Terminating Decimals:",
                        "• Money: ₱25.50, ₱100.75",
                        "• Measurements: 3.5 meters, 2.25 kg",
                        "• Scores: 95.5%, 87.25 points",
                        "",
                        "Repeating Decimals:",
                        "• Fractions: ⅓ cup, ⅔ of a pizza",
                        "• Divisions: Sharing equally among 3 or 6 people",
                        "• Ratios: Converting fractions to decimals",
                        "",
                        "Most real-world measurements use terminating decimals!"
                    )
                ),

                Slide.SummarySlide(
                    id = 17,
                    title = "Summary: Key Points to Remember",
                    keyPoints = listOf(
                        "Terminating Decimals:",
                        "• End after a certain number of digits",
                        "• Can be written as a fraction",
                        "• Examples: 0.87, 82.25, 9.527",
                        "",
                        "Repeating (Non-terminating) Decimals:",
                        "• Go on forever with repeating pattern",
                        "• Can also be written as a fraction",
                        "• Examples: 0.333..., 0.3̅, 1.2̅3̅4̅",
                        "",
                        "Vinculum:",
                        "• A line over digits showing repetition",
                        "• 0.333... = 0.3̅",
                        "• 0.454545... = 0.4̅5̅",
                        "",
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
                        "Routine Problems:",
                        "• Clear and straightforward",
                        "• Direct keywords indicate operations",
                        "• Usually one or two steps",
                        "• Follow familiar patterns",
                        "",
                        "Non-routine Problems:",
                        "• Require more analysis",
                        "• May need multiple steps",
                        "• Hidden operations or extra information",
                        "• Need creative problem-solving"
                    )
                ),

                Slide.ConceptSlide(
                    id = 3,
                    title = "Division Keywords",
                    content = "Look for these keywords that indicate division:",
                    keyPoints = listOf(
                        "• Quotient of",
                        "• Divided by / Split",
                        "• Shared equally / Distribute",
                        "• Each / Per (for unit rates)",
                        "• Average (divide total by count)",
                        "• How many groups?",
                        "• How much per...?",
                        "",
                        "Money context: cost per item, sharing money, unit price"
                    )
                ),

                Slide.ConceptSlide(
                    id = 4,
                    title = "Common Problem Types",
                    content = "Types of division problems you'll encounter:",
                    keyPoints = listOf(
                        "Equal Sharing:",
                        "• Divide money/items equally among people",
                        "",
                        "Finding Unit Rate:",
                        "• Cost per kilogram, per meter, per hour",
                        "",
                        "Finding Quantity:",
                        "• How many items can you buy?",
                        "",
                        "Comparison:",
                        "• How many times more/less?",
                        "",
                        "Average:",
                        "• Total divided by number of items"
                    )
                ),

                Slide.ExampleSlide(
                    id = 5,
                    title = "Routine Problem 1: Equal Sharing",
                    problem = "Four friends earned ₱1,250.00 from selling lemonade. They decided to split the money equally. How much will each friend receive?",
                    steps = listOf(
                        "1. UNDERSTAND:",
                        "Given: ₱1,250.00 total, 4 friends",
                        "Asked: How much per friend?",
                        "",
                        "2. PLAN:",
                        "Keyword: 'split equally' → Division",
                        "Number sentence: 1,250 ÷ 4 = N",
                        "",
                        "3. SOLVE:",
                        "1,250 ÷ 4 = 312.50",
                        "",
                        "4. CHECK:",
                        "312.50 × 4 = 1,250 ✓",
                        "Reasonable? Yes, about ₱300 each makes sense"
                    ),
                    answer = "Each friend receives ₱312.50"
                ),

                Slide.ExampleSlide(
                    id = 6,
                    title = "Routine Problem 2: Finding Unit Price",
                    problem = "A 2.5 kg bag of rice costs ₱137.50. What is the price per kilogram?",
                    steps = listOf(
                        "1. UNDERSTAND:",
                        "Given: ₱137.50 for 2.5 kg",
                        "Asked: Price per kg?",
                        "",
                        "2. PLAN:",
                        "Keyword: 'per' → Division",
                        "Number sentence: 137.50 ÷ 2.5 = N",
                        "",
                        "3. SOLVE:",
                        "137.50 ÷ 2.5",
                        "Make divisor whole: 1,375 ÷ 25 = 55",
                        "",
                        "4. CHECK:",
                        "55 × 2.5 = 137.50 ✓",
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
                        "1. UNDERSTAND:",
                        "Given: ₱450.00, notebooks cost ₱22.50 each",
                        "Asked: How many notebooks?",
                        "",
                        "2. PLAN:",
                        "Keyword: 'how many' → Division",
                        "Number sentence: 450 ÷ 22.50 = N",
                        "",
                        "3. SOLVE:",
                        "450 ÷ 22.50",
                        "Make divisor whole: 45,000 ÷ 2,250 = 20",
                        "",
                        "4. CHECK:",
                        "20 × 22.50 = 450 ✓",
                        "Reasonable? Yes, she can buy exactly 20 notebooks"
                    ),
                    answer = "Maria can buy 20 notebooks"
                ),

                Slide.ExampleSlide(
                    id = 9,
                    title = "Routine Problem 4: Average",
                    problem = "A student scored 88.5, 92.0, 85.5, and 90.0 on four tests. What is the average score?",
                    steps = listOf(
                        "1. UNDERSTAND:",
                        "Given: Four scores (88.5, 92.0, 85.5, 90.0)",
                        "Asked: Average score?",
                        "",
                        "2. PLAN:",
                        "Keyword: 'average' → Add all, then divide by count",
                        "Number sentence: (88.5 + 92.0 + 85.5 + 90.0) ÷ 4 = N",
                        "",
                        "3. SOLVE:",
                        "Sum: 88.5 + 92.0 + 85.5 + 90.0 = 356.0",
                        "Average: 356.0 ÷ 4 = 89.0",
                        "",
                        "4. CHECK:",
                        "89 × 4 = 356 ✓",
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
                        "• Multiple operations (not just division)",
                        "• Extra information to filter out",
                        "• Hidden steps or indirect questions",
                        "• Comparison or multi-step calculations",
                        "• Real-world complexity",
                        "",
                        "Strategy: Break complex problems into smaller steps!"
                    )
                ),

                Slide.ExampleSlide(
                    id = 12,
                    title = "Non-routine Problem 1: Multi-step",
                    problem = "A store bought 25 kg of apples for ₱3,750.00. After selling 18 kg at ₱180.00 per kg, how much profit did they make per kg sold?",
                    steps = listOf(
                        "1. UNDERSTAND:",
                        "Bought: 25 kg for ₱3,750",
                        "Sold: 18 kg at ₱180/kg",
                        "Asked: Profit per kg sold?",
                        "",
                        "2. PLAN:",
                        "Step 1: Find cost per kg bought",
                        "Step 2: Find revenue from selling",
                        "Step 3: Find profit",
                        "Step 4: Find profit per kg",
                        "",
                        "3. SOLVE:",
                        "Cost per kg: 3,750 ÷ 25 = ₱150",
                        "Revenue: 18 × 180 = ₱3,240",
                        "Cost of 18 kg: 18 × 150 = ₱2,700",
                        "Profit: 3,240 - 2,700 = ₱540",
                        "Profit per kg: 540 ÷ 18 = ₱30",
                        "",
                        "4. CHECK:",
                        "Selling price - cost price = 180 - 150 = 30 ✓"
                    ),
                    answer = "Profit is ₱30.00 per kilogram sold"
                ),

                Slide.ExampleSlide(
                    id = 13,
                    title = "Non-routine Problem 2: Comparison",
                    problem = "Store A sells 3.5 kg of sugar for ₱245.00. Store B sells 2.8 kg for ₱190.40. Which store has the better price per kilogram?",
                    steps = listOf(
                        "1. UNDERSTAND:",
                        "Store A: 3.5 kg for ₱245",
                        "Store B: 2.8 kg for ₱190.40",
                        "Asked: Which has better price/kg?",
                        "",
                        "2. PLAN:",
                        "Find price per kg for each store, then compare",
                        "",
                        "3. SOLVE:",
                        "Store A: 245 ÷ 3.5 = ₱70/kg",
                        "Store B: 190.40 ÷ 2.8 = ₱68/kg",
                        "Compare: ₱68 < ₱70",
                        "",
                        "4. CHECK:",
                        "Store A: 70 × 3.5 = 245 ✓",
                        "Store B: 68 × 2.8 = 190.40 ✓",
                        "Store B is cheaper"
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
                        "1. UNDERSTAND:",
                        "Made: 150 cupcakes in 5 hours",
                        "Price: ₱25 each (extra info!)",
                        "Earned: ₱3,750 (extra info!)",
                        "Asked: Cupcakes per hour?",
                        "",
                        "2. PLAN:",
                        "Ignore price and earnings - not needed",
                        "Number sentence: 150 ÷ 5 = N",
                        "",
                        "3. SOLVE:",
                        "150 ÷ 5 = 30",
                        "",
                        "4. CHECK:",
                        "30 × 5 = 150 ✓",
                        "Note: We verified earnings → 150 × 25 = 3,750 ✓"
                    ),
                    answer = "He made 30 cupcakes per hour"
                ),

                Slide.ExampleSlide(
                    id = 16,
                    title = "Non-routine Problem 4: Working Backwards",
                    problem = "After dividing her money equally among her 3 children, each child received ₱425.50. She had already spent ₱150.00 on groceries. How much money did she have originally?",
                    steps = listOf(
                        "1. UNDERSTAND:",
                        "Each child got: ₱425.50 (3 children)",
                        "Spent before dividing: ₱150",
                        "Asked: Original amount?",
                        "",
                        "2. PLAN:",
                        "Work backwards:",
                        "Step 1: Find total given to children",
                        "Step 2: Add back what was spent",
                        "",
                        "3. SOLVE:",
                        "Given to children: 425.50 × 3 = ₱1,276.50",
                        "Original amount: 1,276.50 + 150 = ₱1,426.50",
                        "",
                        "4. CHECK:",
                        "1,426.50 - 150 = 1,276.50",
                        "1,276.50 ÷ 3 = 425.50 ✓"
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
                        "1. UNDERSTAND:",
                        "Current: ₱4,567.80 for 318.5 kWh",
                        "Reduce: 25% less consumption",
                        "Asked: New bill?",
                        "",
                        "2. PLAN:",
                        "Step 1: Find rate per kWh",
                        "Step 2: Find 25% reduction in kWh",
                        "Step 3: Calculate new consumption",
                        "Step 4: Calculate new bill",
                        "",
                        "3. SOLVE:",
                        "Rate: 4,567.80 ÷ 318.5 = ₱14.34/kWh",
                        "25% of 318.5 = 318.5 × 0.25 = 79.625 kWh",
                        "New consumption: 318.5 - 79.625 = 238.875 kWh",
                        "New bill: 238.875 × 14.34 = ₱3,425.85",
                        "",
                        "4. CHECK:",
                        "75% of original = 4,567.80 × 0.75 = ₱3,425.85 ✓"
                    ),
                    answer = "The new bill will be ₱3,425.85"
                ),

                Slide.ConceptSlide(
                    id = 19,
                    title = "Tips for Division Word Problems",
                    content = "Strategies for success:",
                    keyPoints = listOf(
                        "✓ Identify division keywords carefully",
                        "✓ Determine what's given and what's asked",
                        "✓ Ignore extra information not needed",
                        "✓ Break complex problems into smaller steps",
                        "✓ Check units (pesos, kg, meters, liters)",
                        "✓ Use multiplication to verify division",
                        "✓ Estimate to check reasonableness",
                        "✓ Draw diagrams if helpful",
                        "✓ For money: always include two decimal places"
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
                        "Routine Problems:",
                        "• Clear division keywords (quotient, split, per, each)",
                        "• Direct and straightforward",
                        "• Usually one or two steps",
                        "",
                        "Non-routine Problems:",
                        "• Require multiple operations",
                        "• May have extra information to filter",
                        "• Need careful analysis and planning",
                        "",
                        "Problem-Solving Keys:",
                        "• Use the 4-step method (Understand, Plan, Solve, Check)",
                        "• Look for division keywords",
                        "• Break complex problems into smaller steps",
                        "• Always verify your answer makes sense",
                        "• For money, use two decimal places"
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
                        "✓ Organize your thinking",
                        "✓ Avoid missing important information",
                        "✓ Reduce careless errors",
                        "✓ Build problem-solving confidence",
                        "✓ Work efficiently",
                        "✓ Check your work systematically",
                        "",
                        "Let's learn the proven 4-step method!"
                    )
                ),

                Slide.ConceptSlide(
                    id = 3,
                    title = "The 4-Step Problem-Solving Method",
                    content = "This method works for ANY word problem:",
                    keyPoints = listOf(
                        "Step 1: UNDERSTAND the Problem",
                        "→ Know what you're dealing with",
                        "",
                        "Step 2: PLAN the Solution",
                        "→ Decide how to solve it",
                        "",
                        "Step 3: SOLVE the Problem",
                        "→ Carry out your plan",
                        "",
                        "Step 4: CHECK your Answer",
                        "→ Verify it's correct",
                        "",
                        "Remember: UPSC (Understand, Plan, Solve, Check)"
                    )
                ),

                Slide.ConceptSlide(
                    id = 4,
                    title = "Step 1: UNDERSTAND the Problem",
                    content = "Before solving, you must fully understand what the problem is asking:",
                    keyPoints = listOf(
                        "Actions to take:",
                        "• Read the problem carefully (at least twice!)",
                        "• Identify what is GIVEN (facts, numbers)",
                        "• Identify what is ASKED (the question)",
                        "• Highlight or underline key information",
                        "• Circle important numbers and their units",
                        "• Cross out extra information not needed",
                        "• Restate the problem in your own words",
                        "",
                        "Ask: What do I know? What do I need to find?"
                    )
                ),

                Slide.ExampleSlide(
                    id = 5,
                    title = "Example: Understanding Phase",
                    problem = "A store bought 8 boxes of apples. Each box contains 24.5 kg and costs ₱1,225.00. The store sold all apples at ₱65.00 per kg. How much profit did the store make per box?",
                    steps = listOf(
                        "Let's UNDERSTAND:",
                        "",
                        "GIVEN information:",
                        "• 8 boxes of apples",
                        "• Each box: 24.5 kg",
                        "• Cost per box: ₱1,225.00",
                        "• Selling price: ₱65.00 per kg",
                        "",
                        "ASKED to find:",
                        "• Profit per box?",
                        "",
                        "In my own words:",
                        "The store bought apples in boxes and sold them by weight.",
                        "I need to find how much profit they made on each box.",
                        "",
                        "Units involved: boxes, kg, pesos"
                    ),
                    answer = "We understand the problem - ready to plan!"
                ),

                Slide.ConceptSlide(
                    id = 6,
                    title = "Step 2: PLAN the Solution",
                    content = "Decide HOW you will solve the problem:",
                    keyPoints = listOf(
                        "Actions to take:",
                        "• What operation(s) are needed?",
                        "  (Addition, Subtraction, Multiplication, Division)",
                        "• Look for operation keywords",
                        "• Write number sentences or equations",
                        "• Decide the order of operations",
                        "• Identify if multiple steps are needed",
                        "• Think about what makes sense",
                        "",
                        "Ask: What steps will lead me to the answer?"
                    )
                ),

                Slide.ConceptSlide(
                    id = 7,
                    title = "Operation Keywords Reference",
                    content = "Keywords help identify which operations to use:",
                    keyPoints = listOf(
                        "Addition: sum, total, combined, altogether, increase",
                        "",
                        "Subtraction: difference, less, remaining, decrease, left",
                        "",
                        "Multiplication: product, times, of, per (for totals)",
                        "",
                        "Division: quotient, split, shared, per (for rates), average",
                        "",
                        "Remember: Some problems need multiple operations!"
                    )
                ),

                Slide.ExampleSlide(
                    id = 8,
                    title = "Example: Planning Phase",
                    problem = "A store bought 8 boxes of apples. Each box contains 24.5 kg and costs ₱1,225.00. The store sold all apples at ₱65.00 per kg. How much profit did the store make per box?",
                    steps = listOf(
                        "Let's PLAN:",
                        "",
                        "To find profit per box, I need:",
                        "",
                        "Step 1: Find revenue per box",
                        "→ Multiply: 24.5 kg × ₱65/kg",
                        "",
                        "Step 2: Find profit per box",
                        "→ Subtract: Revenue - Cost",
                        "→ Revenue per box - ₱1,225",
                        "",
                        "Number sentences:",
                        "Revenue per box = 24.5 × 65",
                        "Profit per box = Revenue - 1,225",
                        "",
                        "Operations needed: Multiplication, then Subtraction"
                    ),
                    answer = "Our plan is clear - let's solve!"
                ),

                Slide.ConceptSlide(
                    id = 9,
                    title = "Step 3: SOLVE the Problem",
                    content = "Now carry out your plan carefully:",
                    keyPoints = listOf(
                        "Actions to take:",
                        "• Follow your plan step by step",
                        "• Show all your work clearly",
                        "• Write down each calculation",
                        "• Keep track of units throughout",
                        "• Do one operation at a time",
                        "• Label intermediate results",
                        "• Be neat and organized",
                        "",
                        "Ask: Am I following my plan correctly?"
                    )
                ),

                Slide.ExampleSlide(
                    id = 10,
                    title = "Example: Solving Phase",
                    problem = "A store bought 8 boxes of apples. Each box contains 24.5 kg and costs ₱1,225.00. The store sold all apples at ₱65.00 per kg. How much profit did the store make per box?",
                    steps = listOf(
                        "Let's SOLVE following our plan:",
                        "",
                        "Step 1: Find revenue per box",
                        "Revenue = 24.5 kg × ₱65/kg",
                        "Revenue = ₱1,592.50 per box",
                        "",
                        "Step 2: Find profit per box",
                        "Profit = Revenue - Cost",
                        "Profit = ₱1,592.50 - ₱1,225.00",
                        "Profit = ₱367.50 per box",
                        "",
                        "Final Answer: The store made ₱367.50 profit per box"
                    ),
                    answer = "₱367.50 profit per box"
                ),

                Slide.ConceptSlide(
                    id = 11,
                    title = "Step 4: CHECK your Answer",
                    content = "Always verify your solution is correct:",
                    keyPoints = listOf(
                        "Actions to take:",
                        "• Does your answer make sense?",
                        "• Is it reasonable for the context?",
                        "• Work backwards to verify",
                        "• Use inverse operations",
                        "• Estimate to check reasonableness",
                        "• Did you answer what was asked?",
                        "• Are units correct?",
                        "• Check your calculations",
                        "",
                        "Ask: Is this answer logical and correct?"
                    )
                ),

                Slide.ExampleSlide(
                    id = 12,
                    title = "Example: Checking Phase",
                    problem = "A store bought 8 boxes of apples. Each box contains 24.5 kg and costs ₱1,225.00. The store sold all apples at ₱65.00 per kg. How much profit did the store make per box?",
                    steps = listOf(
                        "Let's CHECK our answer: ₱367.50",
                        "",
                        "Method 1 - Work backwards:",
                        "Cost + Profit = Revenue",
                        "1,225 + 367.50 = 1,592.50 ✓",
                        "",
                        "Method 2 - Verify revenue:",
                        "24.5 × 65 = 1,592.50 ✓",
                        "",
                        "Method 3 - Reasonableness:",
                        "Selling price (₱65) > Cost per kg (1,225÷24.5 = ₱50)",
                        "Profit makes sense: ₱15/kg × 24.5kg = ₱367.50 ✓",
                        "",
                        "Method 4 - Question check:",
                        "Asked for profit per box? Yes, answered correctly ✓",
                        "",
                        "All checks pass - answer is correct!"
                    ),
                    answer = "Verified: ₱367.50 is correct!"
                ),

                Slide.ConceptSlide(
                    id = 13,
                    title = "Verification Methods",
                    content = "Different ways to check your answer:",
                    keyPoints = listOf(
                        "1. Work Backwards:",
                        "   Use inverse operations to get back to given values",
                        "",
                        "2. Estimate:",
                        "   Round numbers and see if answer is close",
                        "",
                        "3. Alternative Method:",
                        "   Solve using a different approach",
                        "",
                        "4. Reasonableness:",
                        "   Does the answer make sense in real life?",
                        "",
                        "5. Unit Check:",
                        "   Are the units correct for what was asked?"
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
                        "1. UNDERSTAND:",
                        "Given: Total ₱2,847.50 (includes 12% charge), 5 people",
                        "Asked: Original bill? Cost per person?",
                        "",
                        "2. PLAN:",
                        "Total = Original + 12% of Original",
                        "Total = Original × 1.12",
                        "So: Original = Total ÷ 1.12",
                        "Then: Per person = Original ÷ 5",
                        "",
                        "3. SOLVE:",
                        "Original = 2,847.50 ÷ 1.12 = ₱2,542.41",
                        "Per person = 2,542.41 ÷ 5 = ₱508.48",
                        "",
                        "4. CHECK:",
                        "2,542.41 × 1.12 = 2,847.50 ✓",
                        "508.48 × 5 = 2,542.40 ≈ 2,542.41 ✓"
                    ),
                    answer = "Original bill: ₱2,542.41; Per person: ₱508.48"
                ),

                Slide.ExampleSlide(
                    id = 16,
                    title = "Complete Example 3: Multi-Step Problem",
                    problem = "A farmer harvested 245.5 kg of mangoes and 186.8 kg of guavas. He sold the mangoes at ₱85.00 per kg and guavas at ₱65.00 per kg. After selling all fruits, he spent ₱5,240.00 on fertilizer. How much money does he have left?",
                    steps = listOf(
                        "1. UNDERSTAND:",
                        "Harvested: 245.5 kg mangoes, 186.8 kg guavas",
                        "Prices: ₱85/kg mangoes, ₱65/kg guavas",
                        "Spent: ₱5,240 on fertilizer",
                        "Asked: Money left?",
                        "",
                        "2. PLAN:",
                        "Step 1: Revenue from mangoes",
                        "Step 2: Revenue from guavas",
                        "Step 3: Total revenue",
                        "Step 4: Subtract expenses",
                        "",
                        "3. SOLVE:",
                        "Mangoes: 245.5 × 85 = ₱20,867.50",
                        "Guavas: 186.8 × 65 = ₱12,142.00",
                        "Total revenue: 20,867.50 + 12,142.00 = ₱33,009.50",
                        "Money left: 33,009.50 - 5,240.00 = ₱27,769.50",
                        "",
                        "4. CHECK:",
                        "27,769.50 + 5,240 = 33,009.50 ✓"
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
                        "",
                        "✓ Follow all 4 steps systematically",
                        "✓ Take your time to understand",
                        "✓ Always check your answer"
                    )
                ),

                Slide.ConceptSlide(
                    id = 19,
                    title = "Tips for Each Step",
                    content = "Maximize your success:",
                    keyPoints = listOf(
                        "UNDERSTAND:",
                        "• Read twice, highlight key info, circle numbers",
                        "",
                        "PLAN:",
                        "• Write clear number sentences, identify operations",
                        "",
                        "SOLVE:",
                        "• Show all work, be neat, check each calculation",
                        "",
                        "CHECK:",
                        "• Use multiple verification methods",
                        "",
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
                        "✓ Be patient - don't rush",
                        "✓ Stay organized - write neatly",
                        "✓ Be thorough - check each step",
                        "✓ Think logically - does it make sense?",
                        "✓ Practice regularly - build confidence",
                        "✓ Learn from mistakes - they teach you",
                        "✓ Ask for help when stuck",
                        "",
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
                        "Step 1 - UNDERSTAND:",
                        "• Read carefully, identify given/asked",
                        "• Highlight key info, circle numbers and units",
                        "",
                        "Step 2 - PLAN:",
                        "• Choose operations, write number sentences",
                        "• Decide order of steps needed",
                        "",
                        "Step 3 - SOLVE:",
                        "• Follow plan step-by-step",
                        "• Show all work clearly, track units",
                        "",
                        "Step 4 - CHECK:",
                        "• Verify answer makes sense",
                        "• Work backwards, estimate, check calculations",
                        "",
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
                        "",
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
                        "",
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
                        "",
                        "Example patterns:",
                        "• Buy multiple items, find total, get change",
                        "• Calculate earnings, subtract expenses, split profit",
                        "• Find area, multiply by cost, add extras"
                    )
                ),

                Slide.ExampleSlide(
                    id = 5,
                    title = "Routine Problem 1: Shopping with Change",
                    problem = "Maria bought 3 notebooks at ₱45.50 each and 5 pens at ₱12.75 each. She paid with a ₱500 bill. How much change did she receive?",
                    steps = listOf(
                        "1. UNDERSTAND:",
                        "Notebooks: 3 × ₱45.50",
                        "Pens: 5 × ₱12.75",
                        "Paid: ₱500",
                        "Asked: Change?",
                        "",
                        "2. PLAN:",
                        "Step 1: Cost of notebooks (multiply)",
                        "Step 2: Cost of pens (multiply)",
                        "Step 3: Total cost (add)",
                        "Step 4: Change (subtract)",
                        "",
                        "3. SOLVE:",
                        "Notebooks: 3 × 45.50 = ₱136.50",
                        "Pens: 5 × 12.75 = ₱63.75",
                        "Total: 136.50 + 63.75 = ₱200.25",
                        "Change: 500 − 200.25 = ₱299.75",
                        "",
                        "4. CHECK:",
                        "200.25 + 299.75 = 500 ✓"
                    ),
                    answer = "Maria received ₱299.75 in change"
                ),

                Slide.ExampleSlide(
                    id = 6,
                    title = "Routine Problem 2: Business Profit",
                    problem = "A vendor bought 8 kg of fish at ₱180 per kg. He sold 6 kg at ₱245 per kg and the rest at ₱220 per kg. How much profit did he make?",
                    steps = listOf(
                        "1. UNDERSTAND:",
                        "Bought: 8 kg at ₱180/kg",
                        "Sold: 6 kg at ₱245/kg, 2 kg at ₱220/kg",
                        "Asked: Total profit?",
                        "",
                        "2. PLAN:",
                        "Total cost = 8 × 180",
                        "Revenue from 6 kg = 6 × 245",
                        "Revenue from 2 kg = 2 × 220",
                        "Total revenue = sum of revenues",
                        "Profit = revenue − cost",
                        "",
                        "3. SOLVE:",
                        "Cost: 8 × 180 = ₱1,440",
                        "Revenue 1: 6 × 245 = ₱1,470",
                        "Revenue 2: 2 × 220 = ₱440",
                        "Total revenue: 1,470 + 440 = ₱1,910",
                        "Profit: 1,910 − 1,440 = ₱470",
                        "",
                        "4. CHECK:",
                        "1,440 + 470 = 1,910 ✓"
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
                        "",
                        "Strategies:",
                        "• Draw diagrams or tables",
                        "• Work backwards from the answer",
                        "• Break into smaller sub-problems",
                        "• Look for patterns or relationships"
                    )
                ),

                Slide.ExampleSlide(
                    id = 9,
                    title = "Non-Routine Problem 1: Working Backwards",
                    problem = "After buying groceries, Sofia had ₱287.50 left. She had spent ₱425 on groceries and ₱156.50 on transportation before that. How much money did she have at the start?",
                    steps = listOf(
                        "1. UNDERSTAND:",
                        "Ended with: ₱287.50",
                        "Spent on groceries: ₱425",
                        "Spent on transport: ₱156.50",
                        "Asked: Starting amount?",
                        "",
                        "2. PLAN:",
                        "Work backwards - add back what was spent",
                        "Start = End + Groceries + Transport",
                        "",
                        "3. SOLVE:",
                        "After groceries: 287.50 + 425 = ₱712.50",
                        "Original amount: 712.50 + 156.50 = ₱869",
                        "",
                        "4. CHECK:",
                        "Forward check:",
                        "869 − 156.50 = 712.50 (after transport)",
                        "712.50 − 425 = 287.50 (final) ✓"
                    ),
                    answer = "Sofia started with ₱869.00"
                ),

                Slide.ExampleSlide(
                    id = 10,
                    title = "Non-Routine Problem 2: Comparison and Decision",
                    problem = "Store A sells 2.5 kg bags of sugar for ₱137.50. Store B sells 3.2 kg bags for ₱169.60. Which store offers better value, and how much would you save per kg when buying 10 kg?",
                    steps = listOf(
                        "1. UNDERSTAND:",
                        "Store A: ₱137.50 for 2.5 kg",
                        "Store B: ₱169.60 for 3.2 kg",
                        "Asked: Better value? Savings on 10 kg?",
                        "",
                        "2. PLAN:",
                        "Find price/kg for each",
                        "Compare prices",
                        "Calculate cost for 10 kg each",
                        "Find difference",
                        "",
                        "3. SOLVE:",
                        "Store A: 137.50 ÷ 2.5 = ₱55/kg",
                        "Store B: 169.60 ÷ 3.2 = ₱53/kg",
                        "Store B is cheaper!",
                        "",
                        "For 10 kg:",
                        "Store A: 10 × 55 = ₱550",
                        "Store B: 10 × 53 = ₱530",
                        "Savings: 550 − 530 = ₱20",
                        "",
                        "4. CHECK:",
                        "Difference per kg: 55 − 53 = ₱2",
                        "2 × 10 kg = ₱20 savings ✓"
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
                        "",
                        "Routine problems:",
                        "• Clear operation keywords",
                        "• Straightforward steps",
                        "",
                        "Non-routine problems:",
                        "• Require analysis and creative thinking",
                        "• May need working backwards or comparisons",
                        "",
                        "Always:",
                        "• Use the 4-step method (UPSC)",
                        "• Show all work clearly",
                        "• Check your answer makes sense"
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
                    content = "In this topic, you'll learn how to CREATE your own word problems!\n\nCreating problems helps you understand math deeply and think like a mathematician."
                ),

                Slide.ConceptSlide(
                    id = 2,
                    title = "Why Create Problems?",
                    content = "Creating your own word problems helps you:",
                    keyPoints = listOf(
                        "✓ Understand math concepts more deeply",
                        "✓ See connections to real life",
                        "✓ Think creatively about mathematics",
                        "✓ Recognize problem patterns",
                        "✓ Become a better problem solver",
                        "✓ Make math more interesting and fun",
                        "",
                        "When you can create a problem, you truly understand it!"
                    )
                ),

                Slide.ConceptSlide(
                    id = 3,
                    title = "Steps to Create a Word Problem",
                    content = "Follow these steps to create good word problems:",
                    keyPoints = listOf(
                        "Step 1: Choose the operation(s)",
                        "• What math concept do you want to practice?",
                        "",
                        "Step 2: Pick a real-world context",
                        "• Shopping, cooking, sports, travel, etc.",
                        "",
                        "Step 3: Create the situation",
                        "• Write a story that uses your chosen operations",
                        "",
                        "Step 4: Write clear information",
                        "• Include all needed numbers and units",
                        "",
                        "Step 5: Ask a clear question",
                        "• What should be found or calculated?"
                    )
                ),

                Slide.ExampleSlide(
                    id = 4,
                    title = "Example: Creating an Addition Problem",
                    problem = "Let's create a problem step by step:",
                    steps = listOf(
                        "Step 1: Choose operation",
                        "→ Addition with decimals and money",
                        "",
                        "Step 2: Pick context",
                        "→ Shopping at a bookstore",
                        "",
                        "Step 3: Create situation",
                        "→ A student buying school supplies",
                        "",
                        "Step 4: Add numbers",
                        "→ Notebook ₱35.50, pen ₱12.75, eraser ₱8.25",
                        "",
                        "Step 5: Ask question",
                        "→ What is the total cost?",
                        "",
                        "FINAL PROBLEM:",
                        "Maria bought a notebook for ₱35.50, a pen for ₱12.75, and an eraser for ₱8.25. What is the total cost of her purchases?"
                    ),
                    answer = "Total cost: ₱35.50 + ₱12.75 + ₱8.25 = ₱56.50"
                ),

                Slide.ExampleSlide(
                    id = 5,
                    title = "Example: Creating a Multi-Step Problem",
                    problem = "Now let's create a more complex problem:",
                    steps = listOf(
                        "Step 1: Choose operations",
                        "→ Multiplication and subtraction (change problem)",
                        "",
                        "Step 2: Pick context",
                        "→ Buying snacks at a canteen",
                        "",
                        "Step 3: Create situation",
                        "→ Student buys multiple items, pays with bill",
                        "",
                        "Step 4: Add numbers",
                        "→ 3 sandwiches at ₱42.50 each",
                        "→ Pays with ₱200 bill",
                        "",
                        "Step 5: Ask question",
                        "→ How much change?",
                        "",
                        "FINAL PROBLEM:",
                        "Juan bought 3 sandwiches at ₱42.50 each. He paid with a ₱200 bill. How much change will he receive?"
                    ),
                    answer = "Cost: 3 × ₱42.50 = ₱127.50. Change: ₱200 − ₱127.50 = ₱72.50"
                ),

                Slide.ConceptSlide(
                    id = 6,
                    title = "Tips for Good Problem Creation",
                    content = "Make your problems interesting and solvable:",
                    keyPoints = listOf(
                        "✓ Use realistic numbers",
                        "• ₱45.50 for a notebook (realistic)",
                        "• ₱1,234.56 for a notebook (unrealistic)",
                        "",
                        "✓ Include appropriate units",
                        "• Pesos, kilograms, meters, hours, etc.",
                        "",
                        "✓ Make the context relatable",
                        "• Use familiar situations",
                        "",
                        "✓ Provide all necessary information",
                        "• Don't leave out important numbers",
                        "",
                        "✓ Ask one clear question",
                        "• Don't confuse with multiple questions"
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
                        "Money/Shopping:",
                        "• Buying items, getting change, comparing prices",
                        "",
                        "Cooking/Recipes:",
                        "• Measuring ingredients, scaling recipes",
                        "",
                        "Travel/Distance:",
                        "• Calculating distances, speeds, time",
                        "",
                        "Measurement:",
                        "• Length, weight, capacity problems",
                        "",
                        "Sports/Games:",
                        "• Scores, statistics, timing",
                        "",
                        "School:",
                        "• Grades, supplies, schedules"
                    )
                ),

                Slide.ExampleSlide(
                    id = 9,
                    title = "Your Turn: Guided Creation",
                    problem = "Let's create a problem about buying fruit:",
                    steps = listOf(
                        "Framework provided:",
                        "• Operation: Multiplication and addition",
                        "• Context: Fruit market",
                        "• Situation: Buying different fruits",
                        "",
                        "You fill in:",
                        "1. Choose fruits (e.g., mangoes, bananas)",
                        "2. Add quantities (e.g., 2.5 kg, 3 kg)",
                        "3. Add prices (e.g., ₱85/kg, ₱50/kg)",
                        "4. Ask: What is the total cost?",
                        "",
                        "Example result:",
                        "Ana bought 2.5 kg of mangoes at ₱85 per kg and 3 kg of bananas at ₱50 per kg. What is the total amount she paid?",
                        "",
                        "Solution:",
                        "Mangoes: 2.5 × 85 = ₱212.50",
                        "Bananas: 3 × 50 = ₱150",
                        "Total: ₱212.50 + ₱150 = ₱362.50"
                    ),
                    answer = "Total: ₱362.50"
                ),

                Slide.SummarySlide(
                    id = 10,
                    title = "Summary",
                    keyPoints = listOf(
                        "Creating problems helps you understand math deeply",
                        "",
                        "5 Steps to Create:",
                        "1. Choose operation(s)",
                        "2. Pick real-world context",
                        "3. Create the situation",
                        "4. Add clear numbers and units",
                        "5. Ask a clear question",
                        "",
                        "Tips:",
                        "• Use realistic numbers",
                        "• Make context relatable",
                        "• Include all needed information",
                        "• Test solve your own problem!",
                        "",
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
                    content = "In this topic, you'll master solving multi-step problems that require using two or more arithmetic operations.\n\nThese problems are more complex but follow predictable patterns!"
                ),

                Slide.ConceptSlide(
                    id = 2,
                    title = "What are Multi-Step Problems?",
                    content = "Multi-step problems require more than one operation to solve:",
                    keyPoints = listOf(
                        "Characteristics:",
                        "• Need 2 or more operations",
                        "• Must be solved in specific order",
                        "• Each step builds on the previous one",
                        "• Intermediate answers lead to final answer",
                        "",
                        "Example:",
                        "Buy items (multiply), find total (add), calculate change (subtract)",
                        "",
                        "Key: Break complex problems into simple steps!"
                    )
                ),

                Slide.ConceptSlide(
                    id = 3,
                    title = "Common Multi-Step Patterns",
                    content = "Recognize these common patterns:",
                    keyPoints = listOf(
                        "Pattern 1: Buy Multiple Items + Change",
                        "• Multiply quantities by prices",
                        "• Add all costs",
                        "• Subtract from payment",
                        "",
                        "Pattern 2: Cost + Profit/Loss",
                        "• Calculate total cost",
                        "• Calculate total revenue",
                        "• Subtract to find profit or loss",
                        "",
                        "Pattern 3: Unit Rate + Total Cost",
                        "• Divide to find rate per unit",
                        "• Multiply by different quantity",
                        "",
                        "Pattern 4: Sharing After Expenses",
                        "• Calculate total expenses",
                        "• Subtract from total",
                        "• Divide among people"
                    )
                ),

                Slide.ExampleSlide(
                    id = 4,
                    title = "Pattern 1: Shopping with Change",
                    problem = "Lisa bought 4 notebooks at ₱32.50 each, 3 pens at ₱15.75 each, and 2 folders at ₱28.00 each. She paid with three ₱100 bills. How much change did she receive?",
                    steps = listOf(
                        "1. UNDERSTAND:",
                        "Items: 4 notebooks (₱32.50), 3 pens (₱15.75), 2 folders (₱28)",
                        "Paid: 3 × ₱100 = ₱300",
                        "Asked: Change?",
                        "",
                        "2. PLAN (identify steps):",
                        "Step A: Cost of notebooks (multiply)",
                        "Step B: Cost of pens (multiply)",
                        "Step C: Cost of folders (multiply)",
                        "Step D: Total cost (add A + B + C)",
                        "Step E: Change (subtract D from payment)",
                        "",
                        "3. SOLVE:",
                        "A. Notebooks: 4 × 32.50 = ₱130.00",
                        "B. Pens: 3 × 15.75 = ₱47.25",
                        "C. Folders: 2 × 28.00 = ₱56.00",
                        "D. Total: 130 + 47.25 + 56 = ₱233.25",
                        "E. Change: 300 − 233.25 = ₱66.75",
                        "",
                        "4. CHECK:",
                        "233.25 + 66.75 = 300 ✓"
                    ),
                    answer = "Lisa received ₱66.75 in change"
                ),

                Slide.ExampleSlide(
                    id = 5,
                    title = "Pattern 2: Business Profit Calculation",
                    problem = "A street vendor bought 15 kg of mangoes at ₱65 per kg. He sold 10 kg at ₱95 per kg and the remaining 5 kg at ₱80 per kg. How much profit did he make?",
                    steps = listOf(
                        "1. UNDERSTAND:",
                        "Bought: 15 kg at ₱65/kg",
                        "Sold: 10 kg at ₱95/kg, 5 kg at ₱80/kg",
                        "Asked: Profit?",
                        "",
                        "2. PLAN:",
                        "Step A: Total cost (15 × 65)",
                        "Step B: Revenue from 10 kg (10 × 95)",
                        "Step C: Revenue from 5 kg (5 × 80)",
                        "Step D: Total revenue (B + C)",
                        "Step E: Profit (D − A)",
                        "",
                        "3. SOLVE:",
                        "A. Cost: 15 × 65 = ₱975",
                        "B. Revenue 1: 10 × 95 = ₱950",
                        "C. Revenue 2: 5 × 80 = ₱400",
                        "D. Total revenue: 950 + 400 = ₱1,350",
                        "E. Profit: 1,350 − 975 = ₱375",
                        "",
                        "4. CHECK:",
                        "975 + 375 = 1,350 ✓"
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
                        "1. UNDERSTAND:",
                        "Given: 315 km used 22.5 L",
                        "Asked: Liters needed for 525 km?",
                        "",
                        "2. PLAN:",
                        "Step A: Find km per liter (rate)",
                        "Step B: Find liters for 525 km",
                        "",
                        "3. SOLVE:",
                        "A. Rate: 315 ÷ 22.5 = 14 km/L",
                        "B. Liters needed: 525 ÷ 14 = 37.5 L",
                        "",
                        "Alternative method:",
                        "A. Liters per km: 22.5 ÷ 315 = 0.071428... L/km",
                        "B. For 525 km: 525 × (22.5 ÷ 315) = 37.5 L",
                        "",
                        "4. CHECK:",
                        "37.5 × 14 = 525 km ✓"
                    ),
                    answer = "37.5 liters are needed"
                ),

                Slide.ExampleSlide(
                    id = 8,
                    title = "Pattern 4: Sharing After Expenses",
                    problem = "Four friends earned ₱3,840 from a garage sale. They spent ₱560 on supplies and ₱280 on snacks. They plan to split the remaining money equally. How much will each friend receive?",
                    steps = listOf(
                        "1. UNDERSTAND:",
                        "Earned: ₱3,840",
                        "Spent: ₱560 (supplies) + ₱280 (snacks)",
                        "Split among: 4 friends",
                        "Asked: Amount per friend?",
                        "",
                        "2. PLAN:",
                        "Step A: Total expenses (560 + 280)",
                        "Step B: Remaining money (3,840 − A)",
                        "Step C: Amount per person (B ÷ 4)",
                        "",
                        "3. SOLVE:",
                        "A. Total expenses: 560 + 280 = ₱840",
                        "B. Remaining: 3,840 − 840 = ₱3,000",
                        "C. Per person: 3,000 ÷ 4 = ₱750",
                        "",
                        "4. CHECK:",
                        "750 × 4 = 3,000",
                        "3,000 + 840 = 3,840 ✓"
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
                        "1. Read completely first",
                        "• Don't start calculating immediately",
                        "",
                        "2. Identify ALL operations needed",
                        "• List them in order",
                        "",
                        "3. Label each step (A, B, C...)",
                        "• This keeps you organized",
                        "",
                        "4. Solve one step at a time",
                        "• Complete each before moving to next",
                        "",
                        "5. Use intermediate answers",
                        "• Each answer feeds into next step",
                        "",
                        "6. Check at the end",
                        "• Work backwards to verify"
                    )
                ),

                Slide.SummarySlide(
                    id = 11,
                    title = "Summary",
                    keyPoints = listOf(
                        "Multi-step problems need 2+ operations in sequence",
                        "",
                        "Common patterns:",
                        "• Shopping + Change (multiply, add, subtract)",
                        "• Profit/Loss (cost, revenue, difference)",
                        "• Unit rates (divide, multiply)",
                        "• Sharing after expenses (add, subtract, divide)",
                        "",
                        "Success strategies:",
                        "• Break into labeled steps (A, B, C...)",
                        "• Solve one step at a time",
                        "• Use each answer in next step",
                        "• Check by working backwards",
                        "",
                        "Practice recognizing patterns to solve faster!"
                    )
                )
            )
        )
    }
}