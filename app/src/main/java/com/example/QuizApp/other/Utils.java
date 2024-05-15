package com.example.QuizApp.other;

import android.content.Context;
import android.text.TextUtils;
import android.util.Patterns;

import com.example.QuizApp.R;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Random;

public class Utils {

    public static boolean isValidEmail(CharSequence target) {
        return (!TextUtils.isEmpty(target) && Patterns.EMAIL_ADDRESS.matcher(target).matches());
    }

    public static String formatDate(long time){
        SimpleDateFormat formatter = new SimpleDateFormat(Constants.DATE_FORMAT, Locale.getDefault());

        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(time);
        return formatter.format(calendar.getTime());
    }

    public static Map<String,Map<String,Boolean>> getMobileQuestions(){
        HashMap<String,Map<String,Boolean>> questions = new HashMap<>();
        HashMap<String,Boolean> answer1 = new HashMap<>();

        answer1.put("Java",true);
        answer1.put("Python",false);
        answer1.put("C++",false);
        answer1.put("JavaScript",false);
        questions.put("Which programming language is commonly used for Android app development?",answer1);

        HashMap<String,Boolean> answer2 = new HashMap<>();
        answer2.put("Xcode",true);
        answer2.put("Android Studio",false);
        answer2.put("Visual Studio",false);
        answer2.put("Eclipse",false);
        questions.put("What is the primary Integrated Development Environment (IDE) for iOS app development?",answer2);

        HashMap<String,Boolean> answer3 = new HashMap<>();
        answer3.put("Swift",true);
        answer3.put("Objective-C",false);
        answer3.put("Java",false);
        answer3.put("Kotlin",false);
        questions.put("What is the programming language primarily used for iOS app development?",answer3);

        HashMap<String,Boolean> answer4 = new HashMap<>();
        answer4.put("Firebase",true);
        answer4.put("SQLite",false);
        answer4.put("MongoDB",false);
        answer4.put("MySQL",false);
        questions.put("Which service is commonly used for backend development and database management in mobile apps?",answer4);

        HashMap<String,Boolean> answer5 = new HashMap<>();
        answer5.put("React Native",true);
        answer5.put("Flutter",false);
        answer5.put("Xamarin",false);
        answer5.put("Ionic",false);
        questions.put("Which framework allows you to build cross-platform mobile apps using JavaScript and React?",answer5);

        HashMap<String,Boolean> answer6 = new HashMap<>();
        answer6.put("User Interface (UI)",true);
        answer6.put("Application Programming Interface (API)",false);
        answer6.put("Integrated Development Environment (IDE)",false);
        answer6.put("Software Development Kit (SDK)",false);
        questions.put("What does 'UI' stand for in the context of mobile app development?",answer6);

        HashMap<String,Boolean> answer7 = new HashMap<>();
        answer7.put("APK",true);
        answer7.put("IPA",false);
        answer7.put("EXE",false);
        answer7.put("DMG",false);
        questions.put("What is the file format used for Android app packages?",answer7);

        HashMap<String,Boolean> answer8 = new HashMap<>();
        answer8.put("Objective-C",true);
        answer8.put("Swift",false);
        answer8.put("Java",false);
        answer8.put("Kotlin",false);
        questions.put("Which programming language was commonly used for iOS app development before Swift?",answer8);

        HashMap<String,Boolean> answer9 = new HashMap<>();
        answer9.put("Mobile Application Development",true);
        answer9.put("Web Development",false);
        answer9.put("Game Development",false);
        answer9.put("Database Administration",false);
        questions.put("What does 'MAD' stand for in the context of mobile app development?",answer9);

        HashMap<String,Boolean> answer10 = new HashMap<>();
        answer10.put("Software Development Kit (SDK)",true);
        answer10.put("User Interface (UI)",false);
        answer10.put("Application Programming Interface (API)",false);
        answer10.put("Integrated Development Environment (IDE)",false);
        questions.put("What does 'SDK' stand for in the context of mobile app development?",answer10);

        HashMap<String,Boolean> answer11 = new HashMap<>();
        answer11.put("iOS",true);
        answer11.put("Android",false);
        answer11.put("Windows Phone",false);
        answer11.put("BlackBerry",false);
        questions.put("Which mobile operating system was developed by Apple Inc.?",answer11);

        HashMap<String,Boolean> answer12 = new HashMap<>();
        answer12.put("Play Store",true);
        answer12.put("App Store",false);
        answer12.put("Windows Store",false);
        answer12.put("Amazon Appstore",false);
        questions.put("What is the official app distribution platform for Android apps?",answer12);

        HashMap<String,Boolean> answer13 = new HashMap<>();
        answer13.put("Xamarin",true);
        answer13.put("React Native",false);
        answer13.put("Flutter",false);
        answer13.put("Ionic",false);
        questions.put("Which cross-platform framework allows developers to build mobile apps using C# language?",answer13);

        HashMap<String,Boolean> answer14 = new HashMap<>();
        answer14.put("Java",true);
        answer14.put("Swift",false);
        answer14.put("Kotlin",false);
        answer14.put("Objective-C",false);
        questions.put("Which programming language is used for Android app development?",answer14);

        HashMap<String,Boolean> answer15 = new HashMap<>();
        answer15.put("Xcode",true);
        answer15.put("Android Studio",false);
        answer15.put("Visual Studio",false);
        answer15.put("Eclipse",false);
        questions.put("What is the primary IDE for iOS app development?",answer15);

        return questions;
    }

   /* public static Map<String,String> getRandomMobileQuestions(int SIZE){
        HashMap<String,String> questionsMap = new HashMap<>();
        Map<String,Map<String,Boolean>> originalQuestion = getMobileQuestions();
        int originalSize =  originalQuestion.size();
        ArrayList<String> keyList = new ArrayList<String>(originalQuestion.keySet());

        while (questionsMap.size()<=SIZE){
            Random random = new Random();
            int randomNumber = random.nextInt(originalSize);
            String question = keyList.get(randomNumber);
            if (!questionsMap.containsKey(question)){
                questionsMap.put(question,originalQuestion.get(question));
            }
        }
        return questionsMap;
    }*/



    public static Map<String,Map<String,Boolean>> getInformationSystemsSecurityQuestions(){
        HashMap<String,Map<String,Boolean>> questions = new HashMap<>();

        HashMap<String,Boolean> answer1 = new HashMap<>();
        answer1.put("Confidentiality",true);
        answer1.put("Integrity",false);
        answer1.put("Availability",false);
        answer1.put("Authentication",false);
        questions.put("Which security principle ensures that data is accessible only to authorized users?",answer1);

        HashMap<String,Boolean> answer2 = new HashMap<>();
        answer2.put("Firewall",true);
        answer2.put("Router",false);
        answer2.put("Modem",false);
        answer2.put("Switch",false);
        questions.put("Which network security device is used to monitor and control incoming and outgoing network traffic based on predetermined security rules?",answer2);

        HashMap<String,Boolean> answer3 = new HashMap<>();
        answer3.put("Encryption",true);
        answer3.put("Firewall",false);
        answer3.put("Antivirus",false);
        answer3.put("Intrusion Detection System",false);
        questions.put("What process converts plaintext into ciphertext to secure sensitive information?",answer3);

        HashMap<String,Boolean> answer4 = new HashMap<>();
        answer4.put("Phishing",true);
        answer4.put("Spyware",false);
        answer4.put("Trojan Horse",false);
        answer4.put("Ransomware",false);
        questions.put("Which cyber attack involves fraudulent attempts to obtain sensitive information by disguising as a trustworthy entity?",answer4);

        HashMap<String,Boolean> answer5 = new HashMap<>();
        answer5.put("Denial of Service (DoS)",true);
        answer5.put("Malware",false);
        answer5.put("Man-in-the-Middle (MitM) Attack",false);
        answer5.put("Spoofing",false);
        questions.put("Which type of cyber attack disrupts normal traffic of a targeted server, service, or network by overwhelming it with a flood of internet traffic?",answer5);

        HashMap<String,Boolean> answer6 = new HashMap<>();
        answer6.put("Access Control",true);
        answer6.put("Network Segmentation",false);
        answer6.put("Vulnerability Assessment",false);
        answer6.put("Penetration Testing",false);
        questions.put("Which security measure determines who is authorized to access a system or resource?",answer6);

        HashMap<String,Boolean> answer7 = new HashMap<>();
        answer7.put("Two-Factor Authentication",true);
        answer7.put("Firewall",false);
        answer7.put("Antivirus",false);
        answer7.put("Intrusion Detection System",false);
        questions.put("Which authentication method requires users to provide two forms of identification to gain access?",answer7);

        HashMap<String,Boolean> answer8 = new HashMap<>();
        answer8.put("Penetration Testing",true);
        answer8.put("Risk Management",false);
        answer8.put("Vulnerability Assessment",false);
        answer8.put("Security Policy",false);
        questions.put("Which security assessment technique evaluates the security of a computer system or network by simulating an attack from malicious outsiders?",answer8);

        HashMap<String,Boolean> answer9 = new HashMap<>();
        answer9.put("Ransomware",true);
        answer9.put("Spyware",false);
        answer9.put("Adware",false);
        answer9.put("Worm",false);
        questions.put("Which type of malicious software encrypts a victim's files and demands payment for their release?",answer9);

        HashMap<String,Boolean> answer10 = new HashMap<>();
        answer10.put("Social Engineering",true);
        answer10.put("Distributed Denial of Service (DDoS)",false);
        answer10.put("SQL Injection",false);
        answer10.put("Cross-Site Scripting (XSS)",false);
        questions.put("Which type of attack exploits human psychology to manipulate individuals into divulging confidential information?",answer10);

        HashMap<String,Boolean> answer11 = new HashMap<>();
        answer11.put("Vulnerability Assessment",true);
        answer11.put("Incident Response",false);
        answer11.put("Access Control",false);
        answer11.put("Encryption",false);
        questions.put("Which security process involves identifying, quantifying, and prioritizing vulnerabilities in a system or network?",answer11);

        HashMap<String,Boolean> answer12 = new HashMap<>();
        answer12.put("Antivirus Software",true);
        answer12.put("Firewall",false);
        answer12.put("Intrusion Detection System",false);
        answer12.put("Virtual Private Network (VPN)",false);
        questions.put("Which security tool is used to detect, prevent, and remove malicious software from a computer system?",answer12);

        HashMap<String,Boolean> answer13 = new HashMap<>();
        answer13.put("Firewall",true);
        answer13.put("Antivirus",false);
        answer13.put("Encryption",false);
        answer13.put("Intrusion Detection System",false);
        questions.put("Which security measure is designed to block unauthorized access to or from a private network?",answer13);

        HashMap<String,Boolean> answer14 = new HashMap<>();
        answer14.put("Patch Management",true);
        answer14.put("Password Management",false);
        answer14.put("Access Control",false);
        answer14.put("Encryption",false);
        questions.put("Which security practice involves regularly updating software to address known vulnerabilities?",answer14);

        HashMap<String,Boolean> answer15 = new HashMap<>();
        answer15.put("Social Engineering",true);
        answer15.put("Phishing",false);
        answer15.put("Ransomware",false);
        answer15.put("Spyware",false);
        questions.put("Which type of attack relies on human interaction and manipulation rather than technical vulnerabilities?",answer15);


        return questions;
    }

    public static Map<String,Map<String,Boolean>> getOperational_ResearchQuestions(){
        HashMap<String,Map<String,Boolean>> questions = new HashMap<>();

        HashMap<String,Boolean> answer1 = new HashMap<>();
        answer1.put("Linear Programming",true);
        answer1.put("Object-Oriented Programming",false);
        answer1.put("Functional Programming",false);
        answer1.put("Structured Programming",false);
        questions.put("Which technique is used to maximize or minimize a linear objective function subject to linear equality and inequality constraints?",answer1);

        HashMap<String,Boolean> answer2 = new HashMap<>();
        answer2.put("Optimization",true);
        answer2.put("Simulation",false);
        answer2.put("Regression",false);
        answer2.put("Forecasting",false);
        questions.put("What is the main objective of Operational Research?",answer2);

        HashMap<String,Boolean> answer3 = new HashMap<>();
        answer3.put("Decision Analysis",true);
        answer3.put("Data Analysis",false);
        answer3.put("Text Analysis",false);
        answer3.put("Statistical Analysis",false);
        questions.put("Which OR technique involves identifying and evaluating alternatives, and selecting the best course of action?",answer3);

        HashMap<String,Boolean> answer4 = new HashMap<>();
        answer4.put("Queuing Theory",true);
        answer4.put("Graph Theory",false);
        answer4.put("Game Theory",false);
        answer4.put("Set Theory",false);
        questions.put("Which OR technique deals with the study of waiting lines and the theory of service?",answer4);

        HashMap<String,Boolean> answer5 = new HashMap<>();
        answer5.put("Network Analysis",true);
        answer5.put("Cluster Analysis",false);
        answer5.put("Regression Analysis",false);
        answer5.put("Time Series Analysis",false);
        questions.put("Which OR technique is used to plan and control projects, such as scheduling tasks and allocating resources?",answer5);

        HashMap<String,Boolean> answer6 = new HashMap<>();
        answer6.put("Integer Programming",true);
        answer6.put("Dynamic Programming",false);
        answer6.put("Nonlinear Programming",false);
        answer6.put("Convex Programming",false);
        questions.put("Which type of programming involves decision variables that must be integer values?",answer6);

        HashMap<String,Boolean> answer7 = new HashMap<>();
        answer7.put("Sensitivity Analysis",true);
        answer7.put("Factor Analysis",false);
        answer7.put("Discourse Analysis",false);
        answer7.put("Risk Analysis",false);
        questions.put("Which OR technique involves studying how changes in the coefficients of the objective function or constraints affect the optimal solution?",answer7);

        HashMap<String,Boolean> answer8 = new HashMap<>();
        answer8.put("Simulation",true);
        answer8.put("Optimization",false);
        answer8.put("Regression",false);
        answer8.put("Forecasting",false);
        questions.put("Which OR technique involves creating computer models to imitate the operation of a system over time?",answer8);

        HashMap<String,Boolean> answer9 = new HashMap<>();
        answer9.put("Transportation Problem",true);
        answer9.put("Assignment Problem",false);
        answer9.put("Knapsack Problem",false);
        answer9.put("Travelling Salesman Problem",false);
        questions.put("Which OR problem deals with finding the most efficient way to transport goods from suppliers to demand points?",answer9);

        HashMap<String,Boolean> answer10 = new HashMap<>();
        answer10.put("Goal Programming",true);
        answer10.put("Genetic Algorithm",false);
        answer10.put("Simulated Annealing",false);
        answer10.put("Tabu Search",false);
        questions.put("Which OR technique allows multiple conflicting objectives to be simultaneously considered in decision-making?",answer10);

        HashMap<String,Boolean> answer11 = new HashMap<>();
        answer11.put("Game Theory",true);
        answer11.put("Queuing Theory",false);
        answer11.put("Network Analysis",false);
        answer11.put("Decision Analysis",false);
        questions.put("Which OR technique studies strategic interactions between rational decision-makers?",answer11);

        HashMap<String,Boolean> answer12 = new HashMap<>();
        answer12.put("Dynamic Programming",true);
        answer12.put("Integer Programming",false);
        answer12.put("Nonlinear Programming",false);
        answer12.put("Convex Programming",false);
        questions.put("Which OR technique is used to solve problems with overlapping subproblems and optimal substructure?",answer12);

        HashMap<String,Boolean> answer13 = new HashMap<>();
        answer13.put("Set Covering Problem",true);
        answer13.put("Traveling Salesman Problem",false);
        answer13.put("Transportation Problem",false);
        answer13.put("Knapsack Problem",false);
        questions.put("Which OR problem involves selecting the smallest number of subsets from a larger set to cover all elements?",answer13);

        HashMap<String,Boolean> answer14 = new HashMap<>();
        answer14.put("Queueing Theory",true);
        answer14.put("Game Theory",false);
        answer14.put("Network Analysis",false);
        answer14.put("Simulation",false);
        questions.put("Which OR technique is used to study waiting lines and the theory of service?",answer14);

        HashMap<String,Boolean> answer15 = new HashMap<>();
        answer15.put("Simplex Method",true);
        answer15.put("Branch and Bound",false);
        answer15.put("Genetic Algorithm",false);
        answer15.put("Simulated Annealing",false);
        questions.put("Which algorithm is commonly used to solve linear programming problems?",answer15);

        return questions;
    }

    public static Map<String,Map<String,Boolean>> getOperational_ResearchAnd_InformationSystemsSecurityQuestions(Context context, String subject, int SIZE){

        Map<String,Map<String,Boolean>> questionsMap = new HashMap<>();

        Map<String, Map<String, Boolean>> originalQuestion;


        if (subject.equals(context.getString(R.string.mobile_application))){
            originalQuestion = getMobileQuestions();
        } else if (subject.equals(context.getString(R.string.operational_Research))) {
            originalQuestion = getOperational_ResearchQuestions();
        } else {
            originalQuestion = getInformationSystemsSecurityQuestions();
        }

        int originalSize =  originalQuestion.size();
        ArrayList<String> keyList = new ArrayList<String>(originalQuestion.keySet());

        while (questionsMap.size()<=SIZE){
            Random random = new Random();
            int randomNumber = random.nextInt(originalSize);
            String question = keyList.get(randomNumber);
            if (!questionsMap.containsKey(question)){
                questionsMap.put(question,originalQuestion.get(question));
            }
        }
        return questionsMap;
    }

}
