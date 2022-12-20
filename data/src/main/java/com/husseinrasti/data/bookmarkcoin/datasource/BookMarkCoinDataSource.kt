package com.husseinrasti.data.bookmarkcoin.datasource

import com.husseinrasti.data.bookmarkcoin.dao.BookMarkCoinDao
import com.husseinrasti.domain.bookmark.entity.BookmarkCoinEntity
import javax.inject.Inject

class BookMarkCoinDataSource @Inject constructor(private val dao:BookMarkCoinDao) {

    suspend fun insertBookMarkId(bookmarkCoinEntity: BookmarkCoinEntity){
        dao.insertBookMarkId(bookmarkCoinEntity)
    }

    suspend fun delete(id:String){
        dao.delete(id)
    }

    suspend fun deleteAllBookmarks(){
       dao.deleteAllBookmarks()
    }

    suspend fun selectBookMarkId(id: String): String?{
       return dao.selectBookMarkId(id)
    }

    suspend fun selectAllBookMarksIds():List<String>{
        return dao.selectAllBookMarksIds()
    }
}