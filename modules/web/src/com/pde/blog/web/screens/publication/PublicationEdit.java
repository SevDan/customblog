/*
 * Copyright 2020 CustomBlog
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.pde.blog.web.screens.publication;

import com.haulmont.cuba.gui.screen.*;
import com.pde.blog.entity.Author;
import com.pde.blog.entity.Publication;

@UiController("blog_Publication.edit")
@UiDescriptor("publication-edit.xml")
@EditedEntityContainer("publicationDc")
@LoadDataBeforeShow
public class PublicationEdit extends StandardEditor<Publication> {

    private Author author;

    @Subscribe
    public void onBeforeShow(BeforeShowEvent event) {
        if (author != null) {
            getEditedEntity().setAuthor(author);
        }
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }
}