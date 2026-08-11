package Interfaces.org.esvelto.app.Irepository;

public interface CrudOrdenablePaginableRepository<T> extends
        IOrdenableRepository<T>,
        IPaginableRepository<T>,
        Irepository<T>,
        IContable {
}
