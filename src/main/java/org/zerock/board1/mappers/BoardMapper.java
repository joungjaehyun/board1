package org.zerock.board1.mappers;

import java.util.List;

import org.zerock.board1.dto.BoardDTO;

public interface BoardMapper {
    
    // 모든 리스트를 가져오는 맵퍼
    List<BoardDTO> getList();
    // 1개의 게시글을 가져오는 맵퍼
    BoardDTO getOne(Integer bno);
    // 게시글을 추가하는 맵퍼
    int insertOne(BoardDTO boardDTO);
    // 게시글을 삭제하는 맵퍼
    int deleteOne(Integer bno);
    // 게시글을 수정하는 맵퍼
    int modifyOne(BoardDTO boardDTO);
}
