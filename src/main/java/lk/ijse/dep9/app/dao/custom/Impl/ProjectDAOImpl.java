package lk.ijse.dep9.app.dao.custom.Impl;

import lk.ijse.dep9.app.dao.custom.ProjectDAO;
import lk.ijse.dep9.app.entity.Project;

import java.util.List;
import java.util.Optional;

public class ProjectDAOImpl implements ProjectDAO {
    @Override
    public Project save(Project project) {
        return null;
    }

    @Override
    public void update() {

    }

    @Override
    public void deleteById(Integer pk) {

    }

    @Override
    public Optional<Project> findById(Integer pk) {
        return Optional.empty();
    }

    @Override
    public List<Project> findAll() {
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