// Generated by Dagger (https://dagger.dev).
package com.etu.bookcrossing.di;

import com.etu.bookcrossing.database.AppDatabase;
import com.etu.bookcrossing.database.repository.IBookRepository;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata("javax.inject.Singleton")
@QualifierMetadata
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes",
    "KotlinInternal",
    "KotlinInternalInJava"
})
public final class DatabaseModule_ProvideBookRepositoryFactory implements Factory<IBookRepository> {
  private final DatabaseModule module;

  private final Provider<AppDatabase> appDatabaseProvider;

  public DatabaseModule_ProvideBookRepositoryFactory(DatabaseModule module,
      Provider<AppDatabase> appDatabaseProvider) {
    this.module = module;
    this.appDatabaseProvider = appDatabaseProvider;
  }

  @Override
  public IBookRepository get() {
    return provideBookRepository(module, appDatabaseProvider.get());
  }

  public static DatabaseModule_ProvideBookRepositoryFactory create(DatabaseModule module,
      Provider<AppDatabase> appDatabaseProvider) {
    return new DatabaseModule_ProvideBookRepositoryFactory(module, appDatabaseProvider);
  }

  public static IBookRepository provideBookRepository(DatabaseModule instance,
      AppDatabase appDatabase) {
    return Preconditions.checkNotNullFromProvides(instance.provideBookRepository(appDatabase));
  }
}
