/* hey this is code that i might update later Add a GUI mabye in a new wind ow but im still pretty new to programming been doing it 
for about 2 years i am 12 at the time i am writing this which is 11/11/20  subscribe to my youtube channel and join my discord with 
this link https://discord.gg/FpyN75MAMH and my youtube link https://www.youtube.com/channel/UCb1VJWocJCm2IApuEJtndog?view_as=subscriber
 
This is free and unencumbered software released into the public domain.

Anyone is free to copy, modify, publish, use, compile, sell, or
distribute this software, either in source code form or as a compiled
binary, for any purpose, commercial or non-commercial, and by any
means. */

public class Covid {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, Corona!"); // haven't started yet

        boolean StillAlive;
        StaySixFeetApart Stay = new StaySixFeetApart();
        tested test = new tested();
        Help mask = new Help();
        WashingHands wash = new WashingHands();

        do {
            Stay.SixFeetApart();
            test.GetTested();
            mask.WearMask();
            wash.Hands();
            break;

        } while (StillAlive = true);

    }

}
