package com.example.jetnote.data.database.dao;

import android.database.Cursor;
import androidx.lifecycle.LiveData;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.room.util.StringUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.example.jetnote.data.database.model.NoteDbModel;
import java.lang.Class;
import java.lang.Exception;
import java.lang.Long;
import java.lang.Override;
import java.lang.String;
import java.lang.StringBuilder;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;

@SuppressWarnings({"unchecked", "deprecation"})
public final class NoteDao_Impl implements NoteDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<NoteDbModel> __insertionAdapterOfNoteDbModel;

  private final EntityInsertionAdapter<NoteDbModel> __insertionAdapterOfNoteDbModel_1;

  private final SharedSQLiteStatement __preparedStmtOfDelete;

  public NoteDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfNoteDbModel = new EntityInsertionAdapter<NoteDbModel>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `NoteDbModel` (`id`,`title`,`content`,`can_be_checked_off`,`is_checked_off`,`color_id`,`in_trash`) VALUES (nullif(?, 0),?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, NoteDbModel value) {
        stmt.bindLong(1, value.getId());
        if (value.getTitle() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getTitle());
        }
        if (value.getContent() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getContent());
        }
        final int _tmp;
        _tmp = value.getCanBeCheckedOff() ? 1 : 0;
        stmt.bindLong(4, _tmp);
        final int _tmp_1;
        _tmp_1 = value.isCheckedOff() ? 1 : 0;
        stmt.bindLong(5, _tmp_1);
        stmt.bindLong(6, value.getColorId());
        final int _tmp_2;
        _tmp_2 = value.isInTrash() ? 1 : 0;
        stmt.bindLong(7, _tmp_2);
      }
    };
    this.__insertionAdapterOfNoteDbModel_1 = new EntityInsertionAdapter<NoteDbModel>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR ABORT INTO `NoteDbModel` (`id`,`title`,`content`,`can_be_checked_off`,`is_checked_off`,`color_id`,`in_trash`) VALUES (nullif(?, 0),?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, NoteDbModel value) {
        stmt.bindLong(1, value.getId());
        if (value.getTitle() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getTitle());
        }
        if (value.getContent() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getContent());
        }
        final int _tmp;
        _tmp = value.getCanBeCheckedOff() ? 1 : 0;
        stmt.bindLong(4, _tmp);
        final int _tmp_1;
        _tmp_1 = value.isCheckedOff() ? 1 : 0;
        stmt.bindLong(5, _tmp_1);
        stmt.bindLong(6, value.getColorId());
        final int _tmp_2;
        _tmp_2 = value.isInTrash() ? 1 : 0;
        stmt.bindLong(7, _tmp_2);
      }
    };
    this.__preparedStmtOfDelete = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM NoteDbModel WHERE id LIKE ?";
        return _query;
      }
    };
  }

  @Override
  public void insert(final NoteDbModel noteDbModel) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfNoteDbModel.insert(noteDbModel);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void insertAll(final NoteDbModel... noteDbModel) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfNoteDbModel_1.insert(noteDbModel);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void delete(final long id) {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfDelete.acquire();
    int _argIndex = 1;
    _stmt.bindLong(_argIndex, id);
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfDelete.release(_stmt);
    }
  }

  @Override
  public List<NoteDbModel> getAllSync() {
    final String _sql = "SELECT * FROM NoteDbModel";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
      final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
      final int _cursorIndexOfContent = CursorUtil.getColumnIndexOrThrow(_cursor, "content");
      final int _cursorIndexOfCanBeCheckedOff = CursorUtil.getColumnIndexOrThrow(_cursor, "can_be_checked_off");
      final int _cursorIndexOfIsCheckedOff = CursorUtil.getColumnIndexOrThrow(_cursor, "is_checked_off");
      final int _cursorIndexOfColorId = CursorUtil.getColumnIndexOrThrow(_cursor, "color_id");
      final int _cursorIndexOfIsInTrash = CursorUtil.getColumnIndexOrThrow(_cursor, "in_trash");
      final List<NoteDbModel> _result = new ArrayList<NoteDbModel>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final NoteDbModel _item;
        final long _tmpId;
        _tmpId = _cursor.getLong(_cursorIndexOfId);
        final String _tmpTitle;
        if (_cursor.isNull(_cursorIndexOfTitle)) {
          _tmpTitle = null;
        } else {
          _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
        }
        final String _tmpContent;
        if (_cursor.isNull(_cursorIndexOfContent)) {
          _tmpContent = null;
        } else {
          _tmpContent = _cursor.getString(_cursorIndexOfContent);
        }
        final boolean _tmpCanBeCheckedOff;
        final int _tmp;
        _tmp = _cursor.getInt(_cursorIndexOfCanBeCheckedOff);
        _tmpCanBeCheckedOff = _tmp != 0;
        final boolean _tmpIsCheckedOff;
        final int _tmp_1;
        _tmp_1 = _cursor.getInt(_cursorIndexOfIsCheckedOff);
        _tmpIsCheckedOff = _tmp_1 != 0;
        final long _tmpColorId;
        _tmpColorId = _cursor.getLong(_cursorIndexOfColorId);
        final boolean _tmpIsInTrash;
        final int _tmp_2;
        _tmp_2 = _cursor.getInt(_cursorIndexOfIsInTrash);
        _tmpIsInTrash = _tmp_2 != 0;
        _item = new NoteDbModel(_tmpId,_tmpTitle,_tmpContent,_tmpCanBeCheckedOff,_tmpIsCheckedOff,_tmpColorId,_tmpIsInTrash);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public List<NoteDbModel> getNotesByIdsSync(final List<Long> noteIds) {
    StringBuilder _stringBuilder = StringUtil.newStringBuilder();
    _stringBuilder.append("SELECT * FROM NoteDbModel WHERE id IN (");
    final int _inputSize = noteIds.size();
    StringUtil.appendPlaceholders(_stringBuilder, _inputSize);
    _stringBuilder.append(")");
    final String _sql = _stringBuilder.toString();
    final int _argCount = 0 + _inputSize;
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, _argCount);
    int _argIndex = 1;
    for (Long _item : noteIds) {
      if (_item == null) {
        _statement.bindNull(_argIndex);
      } else {
        _statement.bindLong(_argIndex, _item);
      }
      _argIndex ++;
    }
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
      final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
      final int _cursorIndexOfContent = CursorUtil.getColumnIndexOrThrow(_cursor, "content");
      final int _cursorIndexOfCanBeCheckedOff = CursorUtil.getColumnIndexOrThrow(_cursor, "can_be_checked_off");
      final int _cursorIndexOfIsCheckedOff = CursorUtil.getColumnIndexOrThrow(_cursor, "is_checked_off");
      final int _cursorIndexOfColorId = CursorUtil.getColumnIndexOrThrow(_cursor, "color_id");
      final int _cursorIndexOfIsInTrash = CursorUtil.getColumnIndexOrThrow(_cursor, "in_trash");
      final List<NoteDbModel> _result = new ArrayList<NoteDbModel>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final NoteDbModel _item_1;
        final long _tmpId;
        _tmpId = _cursor.getLong(_cursorIndexOfId);
        final String _tmpTitle;
        if (_cursor.isNull(_cursorIndexOfTitle)) {
          _tmpTitle = null;
        } else {
          _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
        }
        final String _tmpContent;
        if (_cursor.isNull(_cursorIndexOfContent)) {
          _tmpContent = null;
        } else {
          _tmpContent = _cursor.getString(_cursorIndexOfContent);
        }
        final boolean _tmpCanBeCheckedOff;
        final int _tmp;
        _tmp = _cursor.getInt(_cursorIndexOfCanBeCheckedOff);
        _tmpCanBeCheckedOff = _tmp != 0;
        final boolean _tmpIsCheckedOff;
        final int _tmp_1;
        _tmp_1 = _cursor.getInt(_cursorIndexOfIsCheckedOff);
        _tmpIsCheckedOff = _tmp_1 != 0;
        final long _tmpColorId;
        _tmpColorId = _cursor.getLong(_cursorIndexOfColorId);
        final boolean _tmpIsInTrash;
        final int _tmp_2;
        _tmp_2 = _cursor.getInt(_cursorIndexOfIsInTrash);
        _tmpIsInTrash = _tmp_2 != 0;
        _item_1 = new NoteDbModel(_tmpId,_tmpTitle,_tmpContent,_tmpCanBeCheckedOff,_tmpIsCheckedOff,_tmpColorId,_tmpIsInTrash);
        _result.add(_item_1);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public LiveData<NoteDbModel> findById(final long id) {
    final String _sql = "SELECT * FROM NoteDbModel WHERE id LIKE ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, id);
    return __db.getInvalidationTracker().createLiveData(new String[]{"NoteDbModel"}, false, new Callable<NoteDbModel>() {
      @Override
      public NoteDbModel call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
          final int _cursorIndexOfContent = CursorUtil.getColumnIndexOrThrow(_cursor, "content");
          final int _cursorIndexOfCanBeCheckedOff = CursorUtil.getColumnIndexOrThrow(_cursor, "can_be_checked_off");
          final int _cursorIndexOfIsCheckedOff = CursorUtil.getColumnIndexOrThrow(_cursor, "is_checked_off");
          final int _cursorIndexOfColorId = CursorUtil.getColumnIndexOrThrow(_cursor, "color_id");
          final int _cursorIndexOfIsInTrash = CursorUtil.getColumnIndexOrThrow(_cursor, "in_trash");
          final NoteDbModel _result;
          if(_cursor.moveToFirst()) {
            final long _tmpId;
            _tmpId = _cursor.getLong(_cursorIndexOfId);
            final String _tmpTitle;
            if (_cursor.isNull(_cursorIndexOfTitle)) {
              _tmpTitle = null;
            } else {
              _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
            }
            final String _tmpContent;
            if (_cursor.isNull(_cursorIndexOfContent)) {
              _tmpContent = null;
            } else {
              _tmpContent = _cursor.getString(_cursorIndexOfContent);
            }
            final boolean _tmpCanBeCheckedOff;
            final int _tmp;
            _tmp = _cursor.getInt(_cursorIndexOfCanBeCheckedOff);
            _tmpCanBeCheckedOff = _tmp != 0;
            final boolean _tmpIsCheckedOff;
            final int _tmp_1;
            _tmp_1 = _cursor.getInt(_cursorIndexOfIsCheckedOff);
            _tmpIsCheckedOff = _tmp_1 != 0;
            final long _tmpColorId;
            _tmpColorId = _cursor.getLong(_cursorIndexOfColorId);
            final boolean _tmpIsInTrash;
            final int _tmp_2;
            _tmp_2 = _cursor.getInt(_cursorIndexOfIsInTrash);
            _tmpIsInTrash = _tmp_2 != 0;
            _result = new NoteDbModel(_tmpId,_tmpTitle,_tmpContent,_tmpCanBeCheckedOff,_tmpIsCheckedOff,_tmpColorId,_tmpIsInTrash);
          } else {
            _result = null;
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public NoteDbModel findByIdSync(final long id) {
    final String _sql = "SELECT * FROM NoteDbModel WHERE id LIKE ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, id);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
      final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
      final int _cursorIndexOfContent = CursorUtil.getColumnIndexOrThrow(_cursor, "content");
      final int _cursorIndexOfCanBeCheckedOff = CursorUtil.getColumnIndexOrThrow(_cursor, "can_be_checked_off");
      final int _cursorIndexOfIsCheckedOff = CursorUtil.getColumnIndexOrThrow(_cursor, "is_checked_off");
      final int _cursorIndexOfColorId = CursorUtil.getColumnIndexOrThrow(_cursor, "color_id");
      final int _cursorIndexOfIsInTrash = CursorUtil.getColumnIndexOrThrow(_cursor, "in_trash");
      final NoteDbModel _result;
      if(_cursor.moveToFirst()) {
        final long _tmpId;
        _tmpId = _cursor.getLong(_cursorIndexOfId);
        final String _tmpTitle;
        if (_cursor.isNull(_cursorIndexOfTitle)) {
          _tmpTitle = null;
        } else {
          _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
        }
        final String _tmpContent;
        if (_cursor.isNull(_cursorIndexOfContent)) {
          _tmpContent = null;
        } else {
          _tmpContent = _cursor.getString(_cursorIndexOfContent);
        }
        final boolean _tmpCanBeCheckedOff;
        final int _tmp;
        _tmp = _cursor.getInt(_cursorIndexOfCanBeCheckedOff);
        _tmpCanBeCheckedOff = _tmp != 0;
        final boolean _tmpIsCheckedOff;
        final int _tmp_1;
        _tmp_1 = _cursor.getInt(_cursorIndexOfIsCheckedOff);
        _tmpIsCheckedOff = _tmp_1 != 0;
        final long _tmpColorId;
        _tmpColorId = _cursor.getLong(_cursorIndexOfColorId);
        final boolean _tmpIsInTrash;
        final int _tmp_2;
        _tmp_2 = _cursor.getInt(_cursorIndexOfIsInTrash);
        _tmpIsInTrash = _tmp_2 != 0;
        _result = new NoteDbModel(_tmpId,_tmpTitle,_tmpContent,_tmpCanBeCheckedOff,_tmpIsCheckedOff,_tmpColorId,_tmpIsInTrash);
      } else {
        _result = null;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public void delete(final List<Long> noteIds) {
    __db.assertNotSuspendingTransaction();
    StringBuilder _stringBuilder = StringUtil.newStringBuilder();
    _stringBuilder.append("DELETE FROM NoteDbModel WHERE id IN (");
    final int _inputSize = noteIds.size();
    StringUtil.appendPlaceholders(_stringBuilder, _inputSize);
    _stringBuilder.append(")");
    final String _sql = _stringBuilder.toString();
    final SupportSQLiteStatement _stmt = __db.compileStatement(_sql);
    int _argIndex = 1;
    for (Long _item : noteIds) {
      if (_item == null) {
        _stmt.bindNull(_argIndex);
      } else {
        _stmt.bindLong(_argIndex, _item);
      }
      _argIndex ++;
    }
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
