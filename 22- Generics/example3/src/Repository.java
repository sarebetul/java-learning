public class Repository<T extends IEntity> {
    public void save(T entity) {
        System.out.println("Entity saved.");
    }
}

