// Generated by Dagger (https://dagger.dev).
package com.etu.bookcrossing.viewmodel;

import com.etu.bookcrossing.database.repository.IBookRepository;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata
@QualifierMetadata
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes",
    "KotlinInternal",
    "KotlinInternalInJava"
})
public final class BookListViewModel_Factory implements Factory<BookListViewModel> {
  private final Provider<IBookRepository> bookRepositoryProvider;

  public BookListViewModel_Factory(Provider<IBookRepository> bookRepositoryProvider) {
    this.bookRepositoryProvider = bookRepositoryProvider;
  }

  @Override
  public BookListViewModel get() {
    return newInstance(bookRepositoryProvider.get());
  }

  public static BookListViewModel_Factory create(Provider<IBookRepository> bookRepositoryProvider) {
    return new BookListViewModel_Factory(bookRepositoryProvider);
  }

  public static BookListViewModel newInstance(IBookRepository bookRepository) {
    return new BookListViewModel(bookRepository);
  }
}
