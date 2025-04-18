package lib;

import java.util.ArrayList;
import java.util.List;

public class FamilyInfo {
    private Spouse spouse;
    private final List<Child> children;

    public FamilyInfo() {
        this.children = new ArrayList<>();
    }

    public void setSpouse(Spouse spouse) {
        this.spouse = spouse;
    }

    public void addChild(Child child) {
        this.children.add(child);
    }

    public boolean hasSpouse() {
        return spouse != null;
    }

    public int getNumberOfChildren() {
        return children.size();
    }
}
