package eu.karols.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import org.springframework.stereotype.Service;

import eu.karols.domain.Task;
import eu.karols.domain.User;

@Service
public class TaskServiceStubImpl implements TaskService {
	private List<Task> tasks = new ArrayList<Task>() {
		{
//			add(new Task(1L, "First Task", "<p>Line #1.</p><p>Line #2</p>", 125.5, true,null));
//			add(new Task(2L,"Second Task","Second post content:<ul><li>line 1</li><li>line 2</li></p>",122.0,true,new User(10L,"pesho10","Peter Ivanov","email@mail.pl")));
//			add(new Task(3L,"Task #3","<p>The post number 3 nice</p>",125.0,false,new User(10L,"merry","Marry Jane",null)));
//			add(new Task(4L,"Forth Task","<p>Not interesting post</p>",23.0,true,null));
//			add(new Task(5L,"Task Number 5","<p>Just posting</p>",125.0,false,null));
//			add(new Task(6L,"Sixth Task","<p>Another interesting post</p>",34.5,true,null));
			}};

	@Override
	public List<Task> findAll() {
		return this.tasks;
	}

	@Override
	public Task findById(Long id) {
		return this.tasks.stream().filter(p -> Objects.equals(p.getId(), id)).findFirst().orElse(null);
	}

	@Override
	public Task create(Task task) {
		task.setId(this.tasks.stream().mapToLong(p -> p.getId()).max().getAsLong() + 1);
		this.tasks.add(task);
		return task;
	}

	@Override
	public Task edit(Task task) {
		for (int i = 0; i < this.tasks.size(); i++) {
			if (Objects.equals(this.tasks.get(i).getId(), task.getId())) {
				this.tasks.set(i, task);
				return task;
			}
		}
		throw new RuntimeException("Taskm, not found: " + task.getId());
	}

	@Override
	public void deleteById(Long id) {
        for (int i = 0; i < this.tasks.size(); i++) {
            if (Objects.equals(this.tasks.get(i).getId(), id)) {
                this.tasks.remove(i);
            }
        }
        throw new RuntimeException("Taskm, not found: " + id);
	}

}
