package ie.ark.ark40.ie.ark.models;

import ie.ark.ark40.Base;

/**
 * Created by pawel on 04/11/2017.
 */

public class Dino extends Base {
    public String type;
    public String name;
    public int lvl;

    public Dino (String type, String name, int lvl)
    {
        this.type = type;
        this.name = name;
        this.lvl = lvl;
    }
}
