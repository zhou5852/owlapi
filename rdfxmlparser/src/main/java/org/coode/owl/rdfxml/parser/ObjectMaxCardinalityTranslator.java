package org.coode.owl.rdfxml.parser;

import org.semanticweb.owl.model.OWLClassExpression;
import org.semanticweb.owl.model.OWLException;
import org.semanticweb.owl.model.OWLObjectPropertyExpression;
import org.semanticweb.owl.vocab.OWLRDFVocabulary;

import java.net.URI;

/*
 * Copyright (C) 2006, University of Manchester
 *
 * Modifications to the initial code base are copyright of their
 * respective authors, or their employers as appropriate.  Authorship
 * of the modifications may be determined from the ChangeLog placed at
 * the end of this file.
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.

 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.

 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA  02110-1301  USA
 */


/**
 * Author: Matthew Horridge<br>
 * The University Of Manchester<br>
 * Bio-Health Informatics Group<br>
 * Date: 08-Dec-2006<br><br>
 */
public class ObjectMaxCardinalityTranslator extends AbstractObjectCardinalityTranslator {

    public ObjectMaxCardinalityTranslator(OWLRDFConsumer consumer) {
        super(consumer);
    }


    protected OWLClassExpression createRestriction(OWLObjectPropertyExpression prop, int cardi) throws OWLException {
        return getDataFactory().getObjectMaxCardinality(prop, cardi);
    }


    protected OWLClassExpression createRestriction(OWLObjectPropertyExpression prop, int cardi,
                                                   OWLClassExpression filler) throws OWLException {
        return getDataFactory().getObjectMaxCardinality(prop, cardi, filler);
    }


    protected URI getCardinalityTriplePredicate() throws OWLException {
        return OWLRDFVocabulary.OWL_MAX_CARDINALITY.getURI();
    }

    protected URI getQualifiedCardinalityTriplePredicate() throws OWLException {
        return OWLRDFVocabulary.OWL_MAX_QUALIFIED_CARDINALITY.getURI();
    }
}
