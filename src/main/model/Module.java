package main.model;

public class Module {

    private String name;
    private String description;
    private ModuleCategory category;

    public Module(ModuleCategory category) {
        this.name = "";
        this.description = "";
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ModuleCategory getCategory() {
        return category;
    }

    public void setCategory(ModuleCategory category) {
        this.category = category;
    }
}
