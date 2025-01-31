package safeforhall.logic.commands;

import static java.util.Objects.requireNonNull;
import static safeforhall.model.Model.PREDICATE_SHOW_ALL_PERSONS;

import safeforhall.model.Model;

/**
 * Lists all persons in the address book to the user.
 */
public class ViewCommand extends Command {

    public static final String COMMAND_WORD = "view";

    public static final String MESSAGE_SUCCESS = "All residents shown";


    @Override
    public CommandResult execute(Model model) {
        requireNonNull(model);
        model.updateFilteredPersonList(PREDICATE_SHOW_ALL_PERSONS);
        return new CommandResult(MESSAGE_SUCCESS);
    }
}
