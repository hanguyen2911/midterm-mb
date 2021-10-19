package com.example.jetnote.data.database.dao;

import android.database.Cursor;
import androidx.lifecycle.LiveData;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.example.jetnote.data.database.model.ColorDbModel;
import java.lang.Class;
import java.lang.Exception;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;

@SuppressWarnings({"unchecked", "deprecation"})
public final class ColorDao_Impl implements ColorDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<ColorDbModel> __insertionAdapterOfColorDbModel;

  public ColorDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfColorDbModel = new EntityInsertionAdapter<ColorDbModel>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR ABORT INTO `ColorDbModel` (`id`,`hex`,`name`) VALUES (nullif(?, 0),?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, ColorDbModel value) {
        stmt.bindLong(1, value.getId());
        if (value.getHex() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getHex());
        }
        if (value.getName() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getName());
        }
      }
    };
  }

  @Override
  public void insertAll(final ColorDbModel... colorDbModels) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfColorDbModel.insert(colorDbModels);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public LiveData<List<ColorDbModel>> getAll() {
    final String _sql = "SELECT * FROM ColorDbModel";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return __db.getInvalidationTracker().createLiveData(new String[]{"ColorDbModel"}, false, new Callable<List<ColorDbModel>>() {
      @Override
      public List<ColorDbModel> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfHex = CursorUtil.getColumnIndexOrThrow(_cursor, "hex");
          final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
          final List<ColorDbModel> _result = new ArrayList<ColorDbModel>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final ColorDbModel _item;
            final long _tmpId;
            _tmpId = _cursor.getLong(_cursorIndexOfId);
            final String _tmpHex;
            if (_cursor.isNull(_cursorIndexOfHex)) {
              _tmpHex = null;
            } else {
              _tmpHex = _cursor.getString(_cursorIndexOfHex);
            }
            final String _tmpName;
            if (_cursor.isNull(_cursorIndexOfName)) {
              _tmpName = null;
            } else {
              _tmpName = _cursor.getString(_cursorIndexOfName);
            }
            _item = new ColorDbModel(_tmpId,_tmpHex,_tmpName);
            _result.add(_item);
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
  public List<ColorDbModel> getAllSync() {
    final String _sql = "SELECT * FROM ColorDbModel";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
      final int _cursorIndexOfHex = CursorUtil.getColumnIndexOrThrow(_cursor, "hex");
      final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
      final List<ColorDbModel> _result = new ArrayList<ColorDbModel>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final ColorDbModel _item;
        final long _tmpId;
        _tmpId = _cursor.getLong(_cursorIndexOfId);
        final String _tmpHex;
        if (_cursor.isNull(_cursorIndexOfHex)) {
          _tmpHex = null;
        } else {
          _tmpHex = _cursor.getString(_cursorIndexOfHex);
        }
        final String _tmpName;
        if (_cursor.isNull(_cursorIndexOfName)) {
          _tmpName = null;
        } else {
          _tmpName = _cursor.getString(_cursorIndexOfName);
        }
        _item = new ColorDbModel(_tmpId,_tmpHex,_tmpName);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public LiveData<ColorDbModel> findById(final long id) {
    final String _sql = "SELECT * FROM ColorDbModel WHERE id LIKE ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, id);
    return __db.getInvalidationTracker().createLiveData(new String[]{"ColorDbModel"}, false, new Callable<ColorDbModel>() {
      @Override
      public ColorDbModel call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfHex = CursorUtil.getColumnIndexOrThrow(_cursor, "hex");
          final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
          final ColorDbModel _result;
          if(_cursor.moveToFirst()) {
            final long _tmpId;
            _tmpId = _cursor.getLong(_cursorIndexOfId);
            final String _tmpHex;
            if (_cursor.isNull(_cursorIndexOfHex)) {
              _tmpHex = null;
            } else {
              _tmpHex = _cursor.getString(_cursorIndexOfHex);
            }
            final String _tmpName;
            if (_cursor.isNull(_cursorIndexOfName)) {
              _tmpName = null;
            } else {
              _tmpName = _cursor.getString(_cursorIndexOfName);
            }
            _result = new ColorDbModel(_tmpId,_tmpHex,_tmpName);
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
  public ColorDbModel findByIdSync(final long id) {
    final String _sql = "SELECT * FROM ColorDbModel WHERE id LIKE ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, id);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
      final int _cursorIndexOfHex = CursorUtil.getColumnIndexOrThrow(_cursor, "hex");
      final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
      final ColorDbModel _result;
      if(_cursor.moveToFirst()) {
        final long _tmpId;
        _tmpId = _cursor.getLong(_cursorIndexOfId);
        final String _tmpHex;
        if (_cursor.isNull(_cursorIndexOfHex)) {
          _tmpHex = null;
        } else {
          _tmpHex = _cursor.getString(_cursorIndexOfHex);
        }
        final String _tmpName;
        if (_cursor.isNull(_cursorIndexOfName)) {
          _tmpName = null;
        } else {
          _tmpName = _cursor.getString(_cursorIndexOfName);
        }
        _result = new ColorDbModel(_tmpId,_tmpHex,_tmpName);
      } else {
        _result = null;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
