package main.model;

import java.util.ArrayList;
import java.util.List;

public class ModuleManager {

    private List<Module> modules = new ArrayList<>();

    public void addToModules(Module module) {
        modules.add(module);
    }

    public void removeFromModules(Module module) {
        modules.remove(module);
    }

    public List<Module> getModules() {
        return modules;
    }
}
