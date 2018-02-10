package com.example.hoangnguyen.questionaires;

/*------------------------------------------------------------------------------------------------*/

public class Questions {

    public String mQuestions[] = {
            "Anger. You and your co-worker get into an argument about which sports team you like. Your coworker does not like your sports team and keeps telling you how bad they are, how would you react?",
            "Lonely. Your service is over and you return home. You have not spoken to your comrades for a week, because of busy work schedules. What would you do?",
            "Anxiety. You have returned home from your service and you find that your schedule is different. Instead of having a set schedule like you had in your branch of service you find that you have more free time. You work an eight hour job, go to the gym regularly, but you still have more free time. What do you do?",
            "Confusion. You are having an issue with your co-worker. They are complaining about their job to you, because it is tedious/boring to them. What do you do?",
            "Anger. You come home from a long day of work and the house is in disarray, your kids are being loud and obnoxious. How would you react?",
            "Lonely. You are not making any friends or hanging out with any co-workers at your job. You don't know the reason and are starting to feel lonely because you are not hanging out with anyone. What do you do?",
            "Anxiety. You find that you have finished everything on your schedule. You finished your job, you have finished working out, you completed another one of your projects. What do you do now?",
            "Confusion. ",
            "Anger.Your friend persuades you to hire her/his cousin for a moving job. The guy turns out to be pretty clumsy – he even manages to drop a box labeled “fragile”, shattering your valuable wine glasses into hundreds of pieces. How angry does that make you feel?",
            "Lonely.",
            "Anxiety.",
            "Confusion.",
            "Anger. On your way home from work you stop at the shopping mall to pick up some dinner. As you walk past a restaurant you catch a glimpse of your partner with another woman/man. They are kissing publicly and very passionately. Up until this moment you believed your relationship was stable, loving, and committed – this is your soul mate, or so you thought. How angry does that make you feel?",
            "Lonely.",
            "Anxiety.",
            "Confusion."
    };

    private String mChoices [][] = {
            {"a) Yell at them that they are wrong and don't know what they are talking about",
                    "b) Let them know how you feel and tell them to stop insulting your team",
                    "c) Have a conversation about why they are wrong and your team is better",
                    "d) Walk away"},
            {"a) Call them to hang out when they are available",
                    "b) Go to a bar and drink",
                    "c) Work as much as possible to keep you distracted",
                    "d) Try to hang out/make other friends"},
            {"a) Work more to keep your filled",
                    "b) Fill your schedule with as much activities as possible",
                    "c) Take some time off to relax and be with your family",
                    "d) Find a hobby"},
            {"a) Shun them",
                    "b) Walk away from them to cool your head",
                    "c) Ask why they are feeling this way and let them talk about it",
                    "d) Tell them that they shouldn't be feeling this way because it is inappropriate and they should be more grateful for their job"},
            {"a) Scream back at them",
                    "b) Go work on a hobby away from them",
                    "c) Leave and go somewhere else",
                    "d) Try to help your spouse with the kids"},
            {"a) Don't do anything about the problem and continue to mind your business",
                    "b) Confront your co-workers about them ignoring you",
                    "c) Talk to your co-workers and make plans to hang out",
                    "d) Keep yourself occupied with a hobby"},
            {"a) Find something else to do",
                    "b) ",
                    "c) ",
                    "d)"},
            {"sad", "angry", "happy", "confused"},
            {"I don't feel angry at all",
                    "I feel a little angry",
                    "I feel very angry", "I feel furious"},
            {"sad", "angry", "", "confused"},
            {"sad", "angry", "happy", "confused"},
            {"sad", "angry", "happy", "confused"},
            {"I don't feel angry at all",
                    "I feel a little angry",
                    "I feel very angry", "I feel furious"},
            {"sad", "angry", "", "confused"},
            {"sad", "angry", "happy", "confused"},
            {"sad", "angry", "happy", "confused"},
            {"sad", "angry", "happy", "confused"}
    };

/*------------------------------------------------------------------------------------------------*/

    private String mCorrectAnswers [] = {
            "b) Let them know how you feel and tell them to stop insulting your team",
            "a) Call them to hang out when they are available",
            "c) Take some time off to relax and be with your family",
            "c) Ask why they are feeling this way and let them talk about it",
            "d) Try to help your spouse with the kids",
            "c) Talk to your co-workers and make plans to hang out",
            "I feel a little angry",
            "","I feel a little angry","","","","I feel a little angry","","",""
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

    public String getChoice5 (int a) {
        String choice = mChoices[a][4];
        return choice;
    }

    public String getChoice6 (int a) {
        String choice = mChoices[a][5];
        return choice;
    }

    public String getChoice7 (int a) {
        String choice = mChoices[a][6];
        return choice;
    }

    public String getChoice8 (int a) {
        String choice = mChoices[a][7];
        return choice;
    }

    public String getChoice9 (int a) {
        String choice = mChoices[a][8];
        return choice;
    }

    public String getChoice10 (int a) {
        String choice = mChoices[a][9];
        return choice;
    }

    public String getChoice11 (int a) {
        String choice = mChoices[a][10];
        return choice;
    }

    public String getChoice12 (int a) {
        String choice = mChoices[a][11];
        return choice;
    }

    public String getChoice13 (int a) {
        String choice = mChoices[a][12];
        return choice;
    }

    public String getChoice14 (int a) {
        String choice = mChoices[a][13];
        return choice;
    }

    public String getChoice15 (int a) {
        String choice = mChoices[a][14];
        return choice;
    }

    public String getChoice16 (int a) {
        String choice = mChoices[a][15];
        return choice;
    }



/*------------------------------------------------------------------------------------------------*/

    public String getCorrectAnswer (int a) {
        String answer = mCorrectAnswers[a];
        return answer;
    };
}
