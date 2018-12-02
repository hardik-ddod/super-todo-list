package main.model;

public enum ModuleCategory {
    COMMUNICATION("Communication"),
    BASIC_NEEDS("Basic Needs"),
    FEELINGS("Feelings"),
    ACTIVITIES("Activities"),
    PLACES("Places");

    private String displayName;

    ModuleCategory(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }
}
