package com.example.hoangnguyen.questionaires;

/*------------------------------------------------------------------------------------------------*/

public class Questions {

    public String mQuestions[] = {
            "Anger. You and your co-worker get into an argument about which sports team you like. Your coworker does not like your sports team and keeps telling you how bad they are. On a scale of 1-5 how likely are you to raise your voice/yell at them? With 5 being the most likely and 1 being the least.",
            "lonely. Your service is over and you return home. You have not spoken to your comrades for a week, busy work schedules. How lonely/sad do you feel on a scale of 1-5. With 5 being the most lonely and 1 being the least?",
            "Anxiety. You have returned home from your service and you find that your schedule is different. Instead of having a set schedule like you had in your branch of service you find that you have more free time. You work an eight hour job, go to the gym regularly, but you still have more free time. On a scale of 1-5 with 5 being the most likely and 1 being the least. How likely are you to fill up every inch of that free time with either work, going to the gym, or other activities?",
            "Confusion. You are have an issue with ",
            "How are you feeling today? Why?"
    };

    private String mChoices [][] = {
            {"a)", "b)", "c)", "d)"},
            {"5", "4", "3", "2"},
            {"5", "4", "3", "2"},
            {"19", "20", "21", "22"},
            {"sad", "angry", "happy", "confused", "lonely", "tired", "afraid", }
    };

/*------------------------------------------------------------------------------------------------*/

    private String mCorrectAnswers [] = {
            "1","1","1","22","22"
    };

/*------------------------------------------------------------------------------------------------*/

    public String getQuestion (int a) {
        String question = mQuestions[a];
        return question;
    }

    public String getChoice1 (int a) {
        String choice = mChoices[a][0];
        return choice;
    }

    public String getChoice2 (int a) {
        String choice = mChoices[a][1];
        return choice;
    }

    public String getChoice3 (int a) {
        String choice = mChoices[a][2];
        return choice;
    }

    public String getChoice4 (int a) {
        String choice = mChoices[a][3];
        return choice;
    }

/*------------------------------------------------------------------------------------------------*/

    public String getCorrectAnswer (int a) {
        String answer = mCorrectAnswers[a];
        return answer;
    };

}
