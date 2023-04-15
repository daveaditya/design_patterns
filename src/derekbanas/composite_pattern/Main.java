package derekbanas.composite_pattern;


public class Main {

    public static void main(String[] args) {

        SongComponent industrialMusic = new SongGroup("Industrial", "a sd aas ");
        SongComponent heavyMetalMusic = new SongGroup("Heavy Metal",  "a fdsaef  f");
        SongComponent dubstepMusic = new SongGroup("Dubstep Music", "as darfwef a");

        SongComponent everySong = new SongGroup("Song List", "Every Available Song");

        everySong.add(industrialMusic);
        industrialMusic.add(new Song("Head Like a Hole", "NIN", 1990));
        industrialMusic.add(new Song("Headhunter", "Front 242", 1988));

        industrialMusic.add(dubstepMusic);
        dubstepMusic.add(new Song("Centipede", "Knife Party", 2012));
        dubstepMusic.add(new Song("Tetris", "Doctor P", 2011));

        everySong.add(heavyMetalMusic);
        heavyMetalMusic.add(new Song("War Pigs", "Black Sabath", 1970));
        heavyMetalMusic.add(new Song("Ace of Spades", "Motorhead", 1980));

        DiscJockey crazyLarry = new DiscJockey(everySong);
        crazyLarry.getSongList();
    }

}
