package eu.karols.services.post;

import java.util.Collection;
import java.util.List;

import eu.karols.domain.Post;
import eu.karols.domain.User;
import eu.karols.forms.PostCreateForm;

public interface PostService {
	List<Post> findAll();
	List<Post> findLatest5();
	Post findById(Long id);
	Post create(PostCreateForm post);
	Post edit(Post post);
	Collection<Post> getAllPosts();

	void deleteById(Long id);
}
