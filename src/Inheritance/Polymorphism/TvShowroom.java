package Inheritance.Polymorphism;

public class TvShowroom {
    /*public*/ void channels()
    {
        System.out.println("Tv Show room Channels");
    }
    void volume()
    {
        System.out.println("Tv Show room volume");
    }
    void settings()
    {
        System.out.println("Tv Show room settings");
    }

    public static void main(String[] args) {

        TvShowroom ob1; // object reference

        TvShowroom ob = new TvShowroom();

        ob1 = ob; // ob1 -> object

        ob.channels();
        ob.settings();
        ob.volume();

        TvShowroom tvShowroom1 = new LG();
        tvShowroom1.channels();
        tvShowroom1.settings();
        tvShowroom1.volume();

        TvShowroom tvShowroom2 = new Onida();
        tvShowroom2.channels();
        tvShowroom2.settings();
        tvShowroom2.volume();

        TvShowroom tvShowroom3 = new Samsum();
        tvShowroom3.channels();
        tvShowroom3.settings();
        tvShowroom3.volume();


    }
}

class LG extends TvShowroom
{
     void channels() // overridden method
    {
        System.out.println("LG Channels");

    }
    void volume() // overridden method
    {
        System.out.println("LG volume");
    }
    void settings() // overridden method
    {
        System.out.println("LG settings");
    }
}

class Samsum extends TvShowroom
{
    void channels() // overridden method
    {
        System.out.println("Samsum Channels");
    }
    void volume() // overridden method
    {
        System.out.println("Samsum volume");
    }
    void settings() // overridden method
    {
        System.out.println("Samsum settings");
    }
}

class Onida extends TvShowroom
{
    void channels() // overridden method
    {
        System.out.println("Onida Channels");
    }
    void volume() // overridden method
    {
        System.out.println("Onida volume");
    }
    void settings() // overridden method
    {
        System.out.println("Onida settings");
    }
}