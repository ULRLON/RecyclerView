package com.example.myapplication;

import java.util.ArrayList;
import java.util.List;

public class Data {

    static List<modelClass> initData(List<modelClass> characterList){

        characterList=new ArrayList<>();

        characterList.add(new modelClass(R.drawable.spongbob,"SpongeBob SquarePants",
                "SpongeBob is a childish, joyful, and clumsy sea sponge " +
                        "who lives in a pineapple with his pet snail Gary in the underwater " +
                        "city of Bikini Bottom. \n" +
                "SpongeBob's house.\n" +
                "\n" +
                "He works as a fry cook at the Krusty Krab, a job which he is exceptionally " +
                        "skilled at and enjoys thoroughly. He attends Mrs. Puff's Boating School," +
                        " and his greatest dream in life is to receive his boating license." +
                        " Unfortunately, he tenses up whenever he has to drive a boatmobile," +
                        " and he drives recklessly. SpongeBob is very good-natured and loves" +
                        " to hang out with his best friend, Patrick. His teacher is Mrs. Puff and" +
                        " his boss is Mr. Krabs.\n" +
                "In The SpongeBob Musical, SpongeBob's exact species of sea sponge is identified:" +
                        " Aplysina fistularis, a yellow sea sponge that is commonly found in open" +
                        " waters.[9]"));
        characterList.add(new modelClass(R.drawable.patrick,"Patrick Star",
                "He is a naïve and overweight pink sea star. He is voiced by Bill Fagerbakke and" +
                        " first appears in the first episode.\n" +
                "\n" +
                "He lives under a rock in the underwater city of Bikini Bottom. SpongeBob and Squidward" +
                        " are his two neighbors, and, when viewed on the front side, are to the right of" +
                        " his residence.\n" +
                "\n" +
                "He and SpongeBob both tend to bother Squidward; though they do it unknowingly and have" +
                        " good intentions. He is the son of Herb Cecil and Margie Bunny Star and the " +
                        "brother of Sam Star and adoptive brother of Squidina Star"));
        characterList.add(new modelClass(R.drawable.sandy,"Sandy Cheeks","Sandy is a thrill" +
                " seeker who loves extreme sports and karate. Having come from the state of Texas, " +
                "she has a Southern drawl and a love for rodeos. She works as a scientist and built " +
                "both her treedome and air suit and helmet herself. She is also a member of the Gal " +
                "Pals along with Karen, Mrs. Puff, and Pearl."));
        characterList.add(new modelClass(R.drawable.squidward,"Squidward Tentacles","Even though" +
                " Squidward's name contains the word \"squid,\" he is an octopus, not a squid," +
                " as confirmed in many interviews and episodes.[13][14][15][16][17][18][19] He has " +
                "the traits of an octopus—a round bulbous head and rectangular pupils—while a squid " +
                "has a long triangular head and circular eyes, unlike Squidward. Squids have ten" +
                " tentacles, many more than Squidward. The series' animators believed that giving " +
                "him eight limbs would be too burdensome and difficult to animate, which is why he " +
                "is usually depicted with six limbs. Notable exceptions are brief scenes in " +
                "\"Pressure\" and \"Sold!,\" in which he has a full set of eight legs. " +
                "In \"Feral Friends,\" his exact species is identified: a giant Pacific octopus.\n" +
                "\n" +
                "He is a very cynical, selfish and a stick-in-the-mud individual." +
                " He works as the cashier at the Krusty Krab, a job he hates on occasion." +
                " Squidward is frequently annoyed by SpongeBob's loud and cheerful behavior," +
                " but he sometimes sticks up for SpongeBob and sees him as a friend. He can also" +
                " have a supportive side for his boss on occasion."));
        characterList.add(new modelClass(R.drawable.crabs,"Eugene H. Krabs",
                "Mr. Krabs is obsessed with money and goes to great length " +
                        "to increase his wealth, to the point where he occasionally " +
                        "treats money better than his daughter and employees. Mr. Krabs' only " +
                        "business competition comes from the Chum Bucket, a failing restaurant " +
                        "run by Sheldon Plankton and his wife Karen. Plankton and Karen are " +
                        "constantly scheming to steal the Krabby Patty secret formula that makes " +
                        "the Krusty Krab so successful."));
        characterList.add(new modelClass(R.drawable.plankton,"Sheldon J. Plankton"
                ,"Plankton is, as his name suggests, a tiny deep green planktonic " +
                "" +
                "copepod who can fit in the palm of one's hand. He has some stubby appendages and" +
                " one yellow eye with a red pupil and a white highlight (pink prior to \"Band Geeks\")." +
                " He has two long, skinny antennae with four small green spikes sticking out along them." +
                " He also has one black thick eyebrow. He has no ears or nose. In some episodes, " +
                "he is shown without his skin, like in \"Plankton's Regular\" and \"Single Cell Anniversary." +
                "" +
                "\" His size constantly changes: in some episodes, he's the size of a Krabby Patty, meanwhile," +
                " in others, he can perfectly hide in a Krabby Patty. He usually has no fingers or toes," +
                " but he can sprout fingers when a scene requires it."));


        return  characterList;
    }
}
