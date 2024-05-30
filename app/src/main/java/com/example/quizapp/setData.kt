package com.example.quizapp

object setData {

    const val name:String="name"
    const val score:String="score"

   fun getQuestion():ArrayList<QuestionData>{
       var que:ArrayList<QuestionData> = arrayListOf()

       var question1 = QuestionData(
           1, "What is the flagship sedan model produced by Audi?",
           "A3",
           "A6",
           "Q5",
           "TT",
           2

       )
       var question2 = QuestionData(
           2, "In Audi's nomenclature, what does the 'S' signify in a model name?",
           "Sportback",
           "Supercharged",
           "Standard",
           "Sport",
           4

       )
       var question3 = QuestionData(
           3, "Which technology is Audi known for in its performance-oriented models, providing enhanced traction and stability?",
           "Quattro",
           "Dynamic Select",
           "MMI Touch Response",
           "Virtual Cockpit",
           1

       )
       var question4 = QuestionData(
           4, "What is the fully electric SUV produced by Audi?",
           "A4 e-tron",
           "Q7 e-tron",
           "e-tron GT",
           "SQ5 e-tron",
           3

       )

       var question5 = QuestionData(
           5, "Which Audi model is designed as a compact luxury crossover SUV?",
           "A8",
           "Q3",
           "RS7",
           "S5",
           2

       )

       var question6 =QuestionData(

           6, "In Audi's performance-oriented lineup, what does the 'RS' stand for?",
           "Racing Sport",
           "Road Series",
           "Rally Sport",
           "Rapid Speed",
           1

       )
       var question7 =QuestionData(

           7, "What is Audi's advanced driver assistance system that combines adaptive cruise control and lane-keeping technology?",
           "Traffic Jam Assist",
           "Park Assist",
           "Audi Connect",
           "Side Assist",
           1

       )
       var question8 =QuestionData(

           8, "Which Audi model is known for its high-performance variants developed by Audi Sport GmbH?",
           "A3",
           "Q5",
           "RS6",
           "A7",
           3

       )
       var question9 =QuestionData(

           9, "What is the virtual cockpit in Audi vehicles?",
           "Augmented Reality Windshield",
           "Head-Up Display",
           "Digital Instrument Cluster",
           "Gesture Control System",
           3

       )
       var question10 =QuestionData(

           10, "Which Audi model is a mid-engine sports car known for its distinctive styling and powerful performance?",
           "R8",
           "A5",
           "Q8",
           "SQ7",
           1

       )

       que.add(question1)
       que.add(question2)
       que.add(question3)
       que.add(question4)
       que.add(question5)
       que.add(question6)
       que.add(question7)
       que.add(question8)
       que.add(question9)
       que.add(question10)
       return que
   }
}