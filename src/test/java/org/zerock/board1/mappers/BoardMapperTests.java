package org.zerock.board1.mappers;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.zerock.board1.dto.BoardDTO;

import lombok.extern.log4j.Log4j2;

@SpringBootTest
@Log4j2
public class BoardMapperTests {
    
    @Autowired(required = false)
    private BoardMapper mapper;

    @Test
    public void testList(){
        List<BoardDTO> list = mapper.getList();
        log.info(list);
    }
}
