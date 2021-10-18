package demo.mysqldemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class JdbcEmoteRepository implements EmoteRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public int count() {
        return jdbcTemplate.queryForObject("select count(*) from emotes", Integer.class);
    }

    @Override
    public int save(Emote emote) {
        return 0;
    }

    @Override
    public int update(Emote emote) {
        return 0;
    }

    @Override
    public int deleteById(int id) {
        return 0;
    }

    @Override
    public List<Emote> findAll() {
        return jdbcTemplate.query("select * from emotes",(rs,rowNum) -> new Emote(rs.getInt("idemotes"),rs.getString("name")));
    }
}
