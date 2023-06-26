package org.zerock.board1.service;

import java.util.List;

import org.zerock.board1.dto.BoardDTO;

public interface BoardService {
    
    List<BoardDTO> getList();
    BoardDTO getOne(Integer bno);
    void insertOne(BoardDTO boardDTO);
    void deleteOne(Integer bno);
    void modifyOne(BoardDTO boardDTO);
}
