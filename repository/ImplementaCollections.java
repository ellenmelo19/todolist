import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ImplementaCollections<T extends Comparable<T>> implements InterfaceBanco<T> {
    private List<T> data;

    public ImplementaCollections() {
        this.data = new ArrayList<>();
    }

    @Override
    public void save(T entity) {
        data.add(entity);
    }

    @Override
    public void delete(T entity) {
        data.remove(entity);
    }

    @Override
    public void update(T entity) {
        // Implementar lógica de atualização conforme necessário
    }

    @Override
    public List<T> findAll() {
        return data.stream()
                   .sorted()
                   .collect(Collectors.toList());
    }
}
