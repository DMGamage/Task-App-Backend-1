package lk.ijse.dep9.app.dao.custom.Impl;

import lk.ijse.dep9.app.dao.custom.TaskDAO;
import lk.ijse.dep9.app.entity.Task;

import java.sql.Connection;
import java.util.List;
import java.util.Optional;

public class TaskDAOImpl implements TaskDAO {
    public TaskDAOImpl(Connection connection) {
    }

    @Override
    public Task save(Task task) {
        return null;
    }

    @Override
    public void update() {

    }

    @Override
    public void deleteById(Integer pk) {

    }

    @Override
    public Optional<Task> findById(Integer pk) {
        return Optional.empty();
    }

    @Override
    public List<Task> findAll() {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public boolean existById(Integer pk) {
        return false;
    }
}
