package com.example.jetnote.data.database;

import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomOpenHelper;
import androidx.room.RoomOpenHelper.Delegate;
import androidx.room.RoomOpenHelper.ValidationResult;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.room.util.TableInfo.Column;
import androidx.room.util.TableInfo.ForeignKey;
import androidx.room.util.TableInfo.Index;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Callback;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration;
import com.example.jetnote.data.database.dao.ColorDao;
import com.example.jetnote.data.database.dao.ColorDao_Impl;
import com.example.jetnote.data.database.dao.NoteDao;
import com.example.jetnote.data.database.dao.NoteDao_Impl;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

@SuppressWarnings({"unchecked", "deprecation"})
public final class AppDatabase_Impl extends AppDatabase {
  private volatile NoteDao _noteDao;

  private volatile ColorDao _colorDao;

  @Override
  protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration configuration) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(configuration, new RoomOpenHelper.Delegate(1) {
      @Override
      public void createAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("CREATE TABLE IF NOT EXISTS `NoteDbModel` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `title` TEXT NOT NULL, `content` TEXT NOT NULL, `can_be_checked_off` INTEGER NOT NULL, `is_checked_off` INTEGER NOT NULL, `color_id` INTEGER NOT NULL, `in_trash` INTEGER NOT NULL)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `ColorDbModel` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `hex` TEXT NOT NULL, `name` TEXT NOT NULL)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        _db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'ecf58861f69774dde4c08f1b4a2685f7')");
      }

      @Override
      public void dropAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("DROP TABLE IF EXISTS `NoteDbModel`");
        _db.execSQL("DROP TABLE IF EXISTS `ColorDbModel`");
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onDestructiveMigration(_db);
          }
        }
      }

      @Override
      protected void onCreate(SupportSQLiteDatabase _db) {
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onCreate(_db);
          }
        }
      }

      @Override
      public void onOpen(SupportSQLiteDatabase _db) {
        mDatabase = _db;
        internalInitInvalidationTracker(_db);
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onOpen(_db);
          }
        }
      }

      @Override
      public void onPreMigrate(SupportSQLiteDatabase _db) {
        DBUtil.dropFtsSyncTriggers(_db);
      }

      @Override
      public void onPostMigrate(SupportSQLiteDatabase _db) {
      }

      @Override
      protected RoomOpenHelper.ValidationResult onValidateSchema(SupportSQLiteDatabase _db) {
        final HashMap<String, TableInfo.Column> _columnsNoteDbModel = new HashMap<String, TableInfo.Column>(7);
        _columnsNoteDbModel.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsNoteDbModel.put("title", new TableInfo.Column("title", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsNoteDbModel.put("content", new TableInfo.Column("content", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsNoteDbModel.put("can_be_checked_off", new TableInfo.Column("can_be_checked_off", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsNoteDbModel.put("is_checked_off", new TableInfo.Column("is_checked_off", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsNoteDbModel.put("color_id", new TableInfo.Column("color_id", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsNoteDbModel.put("in_trash", new TableInfo.Column("in_trash", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysNoteDbModel = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesNoteDbModel = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoNoteDbModel = new TableInfo("NoteDbModel", _columnsNoteDbModel, _foreignKeysNoteDbModel, _indicesNoteDbModel);
        final TableInfo _existingNoteDbModel = TableInfo.read(_db, "NoteDbModel");
        if (! _infoNoteDbModel.equals(_existingNoteDbModel)) {
          return new RoomOpenHelper.ValidationResult(false, "NoteDbModel(com.example.jetnote.data.database.model.NoteDbModel).\n"
                  + " Expected:\n" + _infoNoteDbModel + "\n"
                  + " Found:\n" + _existingNoteDbModel);
        }
        final HashMap<String, TableInfo.Column> _columnsColorDbModel = new HashMap<String, TableInfo.Column>(3);
        _columnsColorDbModel.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsColorDbModel.put("hex", new TableInfo.Column("hex", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsColorDbModel.put("name", new TableInfo.Column("name", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysColorDbModel = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesColorDbModel = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoColorDbModel = new TableInfo("ColorDbModel", _columnsColorDbModel, _foreignKeysColorDbModel, _indicesColorDbModel);
        final TableInfo _existingColorDbModel = TableInfo.read(_db, "ColorDbModel");
        if (! _infoColorDbModel.equals(_existingColorDbModel)) {
          return new RoomOpenHelper.ValidationResult(false, "ColorDbModel(com.example.jetnote.data.database.model.ColorDbModel).\n"
                  + " Expected:\n" + _infoColorDbModel + "\n"
                  + " Found:\n" + _existingColorDbModel);
        }
        return new RoomOpenHelper.ValidationResult(true, null);
      }
    }, "ecf58861f69774dde4c08f1b4a2685f7", "a7df819c1b1f773ca39f2645bcd1ac5e");
    final SupportSQLiteOpenHelper.Configuration _sqliteConfig = SupportSQLiteOpenHelper.Configuration.builder(configuration.context)
        .name(configuration.name)
        .callback(_openCallback)
        .build();
    final SupportSQLiteOpenHelper _helper = configuration.sqliteOpenHelperFactory.create(_sqliteConfig);
    return _helper;
  }

  @Override
  protected InvalidationTracker createInvalidationTracker() {
    final HashMap<String, String> _shadowTablesMap = new HashMap<String, String>(0);
    HashMap<String, Set<String>> _viewTables = new HashMap<String, Set<String>>(0);
    return new InvalidationTracker(this, _shadowTablesMap, _viewTables, "NoteDbModel","ColorDbModel");
  }

  @Override
  public void clearAllTables() {
    super.assertNotMainThread();
    final SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
    try {
      super.beginTransaction();
      _db.execSQL("DELETE FROM `NoteDbModel`");
      _db.execSQL("DELETE FROM `ColorDbModel`");
      super.setTransactionSuccessful();
    } finally {
      super.endTransaction();
      _db.query("PRAGMA wal_checkpoint(FULL)").close();
      if (!_db.inTransaction()) {
        _db.execSQL("VACUUM");
      }
    }
  }

  @Override
  protected Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
    final HashMap<Class<?>, List<Class<?>>> _typeConvertersMap = new HashMap<Class<?>, List<Class<?>>>();
    _typeConvertersMap.put(NoteDao.class, NoteDao_Impl.getRequiredConverters());
    _typeConvertersMap.put(ColorDao.class, ColorDao_Impl.getRequiredConverters());
    return _typeConvertersMap;
  }

  @Override
  public NoteDao noteDao() {
    if (_noteDao != null) {
      return _noteDao;
    } else {
      synchronized(this) {
        if(_noteDao == null) {
          _noteDao = new NoteDao_Impl(this);
        }
        return _noteDao;
      }
    }
  }

  @Override
  public ColorDao colorDao() {
    if (_colorDao != null) {
      return _colorDao;
    } else {
      synchronized(this) {
        if(_colorDao == null) {
          _colorDao = new ColorDao_Impl(this);
        }
        return _colorDao;
      }
    }
  }
}
