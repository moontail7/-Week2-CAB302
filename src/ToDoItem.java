public class ToDoItem {
    private String description;
    private boolean isDone;

    /**
     * Initializes a to-do item with the specified description and sets isDone to false.
     * @param description The description of the to-do item.
     */
    public ToDoItem(String description) {
        this.description = description;
        this.isDone = false;
    }

    /**
     * Returns the description of the to-do item.
     * @return The description of the to-do item.
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the description of the to-do item.
     * @param description The new description of the to-do item.
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Returns whether the to-do item is done.
     * @return True if the to-do item is done, false otherwise.
     */
    public boolean isDone() {
        return isDone;
    }

    /**
     * Sets the done status of the to-do item.
     * @param done The new done status of the to-do item.
     */
    public void setDone(boolean done) {
        isDone = done;
    }
}
