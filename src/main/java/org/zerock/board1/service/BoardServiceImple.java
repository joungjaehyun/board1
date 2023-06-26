package org.zerock.board1.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.zerock.board1.dto.BoardDTO;
import org.zerock.board1.mappers.BoardMapper;

import lombok.RequiredArgsConstructor;
@Service
@RequiredArgsConstructor
public class BoardServiceImple implements BoardService{

    private final BoardMapper boardMapper;

    @Override
    public List<BoardDTO> getList() {
        
        return boardMapper.getList();
    }

    @Override
    public BoardDTO getOne(Integer bno) {
        
        return boardMapper.getOne(bno);
    }

    @Override
    public void insertOne(BoardDTO boardDTO) {

        boardMapper.insertOne(boardDTO);
    }

    @Override
    public void deleteOne(Integer bno) {
       boardMapper.deleteOne(bno);
    }

    @Override
    public void modifyOne(BoardDTO boardDTO) {
        boardMapper.modifyOne(boardDTO);
    }
    
}
