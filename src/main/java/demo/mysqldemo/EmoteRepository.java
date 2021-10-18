package demo.mysqldemo;

import java.util.List;

public interface EmoteRepository {
    int count();
    int save(Emote emote);
    int update(Emote emote);
    int deleteById(int id);
    List<Emote> findAll();
}
