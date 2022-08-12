package ssf.assessment.day20.repositories;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.ListOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class NewsRepo {
    

    @Autowired
    private RedisTemplate<String, Object> redisTemplate;

    public void save (String news) {
        ListOperations<String, Object> valueOp = redisTemplate.opsForList();

        
        
    }
}
