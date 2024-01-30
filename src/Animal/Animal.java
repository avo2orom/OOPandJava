package Animal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public abstract class Animal {

    protected String name;
    protected String birthday;
    protected List<String> commands;

    public Animal(String name, String birthday, String commands) {
        this.name = name;
        this.birthday = birthday;
        this.commands = Arrays.asList(commands.split("\\s*,\\s*"));
    }

    public String getName() {
        return name;
    }

    public String getBirthday() {
        return birthday;
    }

    public List<String> getCommands() {
        return commands;
    }

    public void setCommands(List<String> commands) {
        List<String> temp = new ArrayList<>(this.commands);
        temp.addAll(commands);
        this.commands = temp;
    }

    @Override
    public String toString() {
        return String.format(
                "\n%s - " +
                        "имя: %s, " +
                        "дата рождения: %s, " +
                        "комманды: %s", getClass().getSimpleName(), name, birthday, commands.toString());
    }
}
