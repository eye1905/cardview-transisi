package com.example.sport;

import java.util.ArrayList;

public class SportData {
    private static String[] judul = {
            "FootBall",
            "Basketball",
            "Badminton",
            "Baseball",
    };

    private static int[] baner = {
            R.drawable.img_soccer,
            R.drawable.img_basketball,
            R.drawable.img_badminton,
            R.drawable.img_baseball,
    };

    private static String[] desk1 = {
            "about FootBall",
            "about Basketball",
            "about Badminton",
            "about Baseball",
    };

    private static String[] desk2 = {
            "Football is a family of team sports that involve, to varying degrees, kicking a ball to score a goal. Unqualified, the word football normally means the form of football that is the most popular where the word is used. Sports commonly called football include association football (known as soccer in some countries); gridiron football (specifically American football or Canadian football); Australian rules football; rugby football (either rugby league or rugby union); and Gaelic football.[1][2] These various forms of football are known as football codes.",
            "Basketball is a team sport in which two teams, most commonly of five players each, opposing one another on a rectangular court, compete with the primary objective of shooting a basketball (approximately 9.4 inches (24 cm) in diameter) through the defender's hoop (a basket 18 inches (46 cm) in diameter mounted 10 feet (3.048 m) high to a backboard at each end of the court) while preventing the opposing team from shooting through their own hoop. A field goal is worth two points, unless made from behind the three-point line, when it is worth three. After a foul, timed play stops and the player fouled or designated to shoot a technical foul is given one or more one-point free throws. The team with the most points at the end of the game wins, but if regulation play expires with the score tied, an additional period of play (overtime) is mandated.",
            "Badminton is a racquet sport played using racquets to hit a shuttlecock across a net. Although it may be played with larger teams, the most common forms of the game are singles (with one player per side) and doubles (with two players per side). Badminton is often played as a casual outdoor activity in a yard or on a beach; formal games are played on a rectangular indoor court. Points are scored by striking the shuttlecock with the racquet and landing it within the opposing side's half of the court.",
            "Baseball is a bat-and-ball game played between two opposing teams who take turns batting and fielding. The game proceeds when a player on the fielding team, called the pitcher, throws a ball which a player on the batting team tries to hit with a bat. The objective of the offensive team (batting team) is to hit the ball into the field of play, allowing its players to run the bases, having them advance counter-clockwise around four bases to score what are called runs. The objective of the defensive team (fielding team) is to prevent batters from becoming runners, and to prevent runners' advance around the bases.[2] A run is scored when a runner legally advances around the bases in order and touches home plate (the place where the player started as a batter). The team that scores the most runs by the end of the game is the winner.",
    };

    public static ArrayList<Sport> getListData() {
        ArrayList<Sport> list = new ArrayList<>();
        for (int position = 0; position < judul.length; position++) {
            Sport player = new Sport();
            player.setJudul(judul[position]);
            player.setDesk1(desk1[position]);
            player.setDesk2(desk2[position]);
            player.setFoto(baner[position]);
            list.add(player);
        }

        return list;
    }
}
