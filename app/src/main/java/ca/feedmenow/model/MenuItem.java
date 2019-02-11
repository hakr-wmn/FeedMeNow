package ca.feedmenow.model;

import java.util.Set;

public abstract class MenuItem {
    String name;
    double price;
    MenuItemType type;
    Set<Preference> preferences;
}
