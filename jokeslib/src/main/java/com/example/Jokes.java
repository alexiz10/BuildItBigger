package com.example;

import java.util.Random;

public class Jokes {

    private final String[] jokes = new String[] {
        "Programmer: A machine that turns coffee into code.",
        "Algorithm: Word used by programmers when they do not want to explain what they did.",
        "Q: What's the object-oriented way to become wealthy? A: Inheritance",
        "Q: What is a programmer's favorite place to hangout? A: Foo Bar",
        "Q: Why did the programmer quit his job? A: Because he didn't get arrays.",
        "Q: Why do Java programmers have to wear glasses? A: Because they don't C#.",
        "Software developers like to solve problems. If there are no problems handily available, they will create their own problems.",
        "UNIX is user friendly. It's just very particular about who its friends are.",
        "I'd like to make the world a better place, but they won't give me the source code.",
        "An SQL query goes into a bar, walks up to two tables and asks, \"Can I join you?\""
    };

    public Jokes() {

    }

    public String getJoke() {
        return jokes[new Random().nextInt(jokes.length)];
    }

}