package com.etu.bookcrossing.worker;

import androidx.hilt.work.WorkerAssistedFactory;
import androidx.work.ListenableWorker;
import dagger.Binds;
import dagger.Module;
import dagger.hilt.InstallIn;
import dagger.hilt.codegen.OriginatingElement;
import dagger.hilt.components.SingletonComponent;
import dagger.multibindings.IntoMap;
import dagger.multibindings.StringKey;

@Module
@InstallIn(SingletonComponent.class)
@OriginatingElement(
    topLevelClass = SeedDatabaseWorker.class
)
public interface SeedDatabaseWorker_HiltModule {
  @Binds
  @IntoMap
  @StringKey("com.etu.bookcrossing.worker.SeedDatabaseWorker")
  WorkerAssistedFactory<? extends ListenableWorker> bind(
      SeedDatabaseWorker_AssistedFactory factory);
}
