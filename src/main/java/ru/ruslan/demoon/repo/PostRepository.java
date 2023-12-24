package ru.ruslan.demoon.repo;

import org.springframework.data.repository.CrudRepository;
import ru.ruslan.demoon.models.Post;

//CrudRepository встроенный интерфейс в котором есть все необходимые функции(добавить запись в таблицу, удалить, обновить, выкинуть)
public interface PostRepository extends CrudRepository<Post, Long> {
}
