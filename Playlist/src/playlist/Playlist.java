package playlist;

import java.util.*;

/**
 *
 * @author franc
 */
public class Playlist {
     private static List<Album> albums = new ArrayList<>();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
             
        Album album = new Album("Culture", "Migos");
        album.addSong("Culture", 2.34);
        album.addSong("T-Shirt", 4.02);
        album.addSong("Call Casting", 3.53);
        album.addSong("Bad and Boujee", 5.43);
        album.addSong("Get Right Witcha", 4.18);
        album.addSong("Slippery", 5.04);
        album.addSong("Big on Big", 4.51);
        album.addSong("What The Price", 4.09);
        album.addSong("Brown Paper Bag", 3.31);
        album.addSong("Deadz", 4.34);
        album.addSong("All Ass", 4.55);
        album.addSong("Kelly Price", 6.04);
        albums.add(album);

        album = new Album("So Far Gone", "Drake");
        album.addSong("Houstatlantavegas", 4.5);
        album.addSong("Successful", 5.52);
        album.addSong("Best I Ever Had", 4.18);
        album.addSong("Uptown", 6.21);
        album.addSong("I'm going In", 3.45);
        album.addSong("The Calm", 4.06);
        album.addSong("Fear", 4.41);
        albums.add(album);

        List<Song> playList = new LinkedList<>();
        albums.get(0).addToPlayList("Bad and Boujee", playList);
        albums.get(0).addToPlayList("Best I Ever Hard", playList);
        albums.get(0).addToPlayList("Fearless", playList);  // Does not exist
        albums.get(0).addToPlayList(4, playList);
        albums.get(1).addToPlayList(8, playList);
        albums.get(1).addToPlayList(3, playList);
        albums.get(1).addToPlayList(2, playList);
        albums.get(1).addToPlayList(24, playList);  // There is no track 24

        play(playList);
    }
    
    private static void play(List<Song> playList) {
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean forward = true;
        ListIterator<Song> listIterator = playList.listIterator();
        if(playList.isEmpty()) {
            System.out.println("No songs in playlist");
            return;
        } else {
            System.out.println("Now playing " + listIterator.next().toString());
            printMenu();
        }

        while(!quit) {
            int action = scanner.nextInt();
            scanner.nextLine();

            switch(action) {
                case 0:
                    System.out.println("Playlist complete.");
                    quit = true;
                    break;
                case 1:
                    if(!forward) {
                        if(listIterator.hasNext()) {
                            listIterator.next();
                        }
                        forward = true;
                    }
                    if(listIterator.hasNext()) {
                        System.out.println("Now playing " + listIterator.next().toString());
                    } else {
                        System.out.println("We have reached the end of the playlist");
                        forward = false;
                    }
                    break;

                case 2:
                    if(forward) {
                        if(listIterator.hasPrevious()) {
                            listIterator.previous();
                        }
                        forward = false;
                    }
                    if(listIterator.hasPrevious()) {
                        System.out.println("Now playing " + listIterator.previous().toString());
                    } else {
                        System.out.println("We are at the start of the playlist");
                        forward = true;
                    }
                    break;
                case 3:
                    if(forward) {
                        if(listIterator.hasPrevious()) {
                            System.out.println("Now replaying " + listIterator.previous().toString());
                            forward = false;
                        } else {
                            System.out.println("We are at the start of the list");
                        }
                    } else {
                        if(listIterator.hasNext()) {
                            System.out.println("Now replaying " + listIterator.next().toString());
                            forward = true;
                        } else {
                            System.out.println("We have reached the end of the list");
                        }
                    }
                    break;
                case 4:
                    printList(playList);
                    break;
                case 5:
                    printMenu();
                    break;

                case 6:
                    if(playList.size() >0) {
                        listIterator.remove();
                        if(listIterator.hasNext()) {
                            System.out.println("Now playing " + listIterator.next());
                        } else if(listIterator.hasPrevious()) {
                            System.out.println("Now playing " + listIterator.previous());
                        }
                    }
                    break;

            }
        }
    }

    private static void printMenu() {
        System.out.println("Available actions:\npress");
        System.out.println("0 - to quit\n" +
                "1 - to play next song\n" +
                "2 - to play previous song\n" +
                "3 - to replay the current song\n" +
                "4 - list songs in the playlist\n" +
                "5 - print available actions.\n" +
                "6 - delete current song from playlist");

    }


    private static void printList(List<Song> playList) {
        Iterator<Song> iterator = playList.iterator();
        System.out.println("================================");
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("================================");
    }
    
    
}
