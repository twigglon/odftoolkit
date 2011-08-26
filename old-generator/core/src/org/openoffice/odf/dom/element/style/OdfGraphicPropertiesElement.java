/************************************************************************
 *
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER
 *
 * Copyright 2008 Sun Microsystems, Inc. All rights reserved.
 *
 * Use is subject to license terms.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy
 * of the License at http://www.apache.org/licenses/LICENSE-2.0. You can also
 * obtain a copy of the License at http://odftoolkit.org/docs/license.txt
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 ************************************************************************/

/*
 * This file is automatically generated.
 * Don't edit manually.
 */    

package org.openoffice.odf.dom.element.style;

import org.openoffice.odf.dom.OdfName;
import org.openoffice.odf.dom.OdfNamespace;
import org.openoffice.odf.doc.OdfFileDom;
import org.openoffice.odf.dom.element.OdfStylePropertiesBase;
import org.openoffice.odf.dom.style.props.OdfStyleProperty;
import org.openoffice.odf.dom.style.props.OdfStylePropertiesSet;


/**
 * ODF DOM Element implementation for element "<style:graphic-properties>".
 */
public abstract class OdfGraphicPropertiesElement extends OdfStylePropertiesBase
{        
    public static final OdfName ELEMENT_NAME = OdfName.get( OdfNamespace.STYLE, "graphic-properties" );

    public OdfGraphicPropertiesElement( OdfFileDom _aOwnerDoc )
    {
        super( _aOwnerDoc, ELEMENT_NAME );
    }

    public OdfName getOdfName()
    {
        return ELEMENT_NAME;
    }

    public final static OdfStyleProperty Stroke = 
        OdfStyleProperty.get(OdfStylePropertiesSet.GraphicProperties, OdfName.get(OdfNamespace.DRAW, "stroke"));
    public final static OdfStyleProperty StrokeDash = 
        OdfStyleProperty.get(OdfStylePropertiesSet.GraphicProperties, OdfName.get(OdfNamespace.DRAW, "stroke-dash"));
    public final static OdfStyleProperty StrokeDashNames = 
        OdfStyleProperty.get(OdfStylePropertiesSet.GraphicProperties, OdfName.get(OdfNamespace.DRAW, "stroke-dash-names"));
    public final static OdfStyleProperty StrokeWidth = 
        OdfStyleProperty.get(OdfStylePropertiesSet.GraphicProperties, OdfName.get(OdfNamespace.SVG, "stroke-width"));
    public final static OdfStyleProperty StrokeColor = 
        OdfStyleProperty.get(OdfStylePropertiesSet.GraphicProperties, OdfName.get(OdfNamespace.SVG, "stroke-color"));
    public final static OdfStyleProperty MarkerStart = 
        OdfStyleProperty.get(OdfStylePropertiesSet.GraphicProperties, OdfName.get(OdfNamespace.DRAW, "marker-start"));
    public final static OdfStyleProperty MarkerEnd = 
        OdfStyleProperty.get(OdfStylePropertiesSet.GraphicProperties, OdfName.get(OdfNamespace.DRAW, "marker-end"));
    public final static OdfStyleProperty MarkerStartWidth = 
        OdfStyleProperty.get(OdfStylePropertiesSet.GraphicProperties, OdfName.get(OdfNamespace.DRAW, "marker-start-width"));
    public final static OdfStyleProperty MarkerEndWidth = 
        OdfStyleProperty.get(OdfStylePropertiesSet.GraphicProperties, OdfName.get(OdfNamespace.DRAW, "marker-end-width"));
    public final static OdfStyleProperty MarkerStartCenter = 
        OdfStyleProperty.get(OdfStylePropertiesSet.GraphicProperties, OdfName.get(OdfNamespace.DRAW, "marker-start-center"));
    public final static OdfStyleProperty MarkerEndCenter = 
        OdfStyleProperty.get(OdfStylePropertiesSet.GraphicProperties, OdfName.get(OdfNamespace.DRAW, "marker-end-center"));
    public final static OdfStyleProperty StrokeOpacity = 
        OdfStyleProperty.get(OdfStylePropertiesSet.GraphicProperties, OdfName.get(OdfNamespace.SVG, "stroke-opacity"));
    public final static OdfStyleProperty StrokeLinejoin = 
        OdfStyleProperty.get(OdfStylePropertiesSet.GraphicProperties, OdfName.get(OdfNamespace.DRAW, "stroke-linejoin"));
    public final static OdfStyleProperty SymbolColor = 
        OdfStyleProperty.get(OdfStylePropertiesSet.GraphicProperties, OdfName.get(OdfNamespace.DRAW, "symbol-color"));
    public final static OdfStyleProperty Animation = 
        OdfStyleProperty.get(OdfStylePropertiesSet.GraphicProperties, OdfName.get(OdfNamespace.TEXT, "animation"));
    public final static OdfStyleProperty AnimationDirection = 
        OdfStyleProperty.get(OdfStylePropertiesSet.GraphicProperties, OdfName.get(OdfNamespace.TEXT, "animation-direction"));
    public final static OdfStyleProperty AnimationStartInside = 
        OdfStyleProperty.get(OdfStylePropertiesSet.GraphicProperties, OdfName.get(OdfNamespace.TEXT, "animation-start-inside"));
    public final static OdfStyleProperty AnimationStopInside = 
        OdfStyleProperty.get(OdfStylePropertiesSet.GraphicProperties, OdfName.get(OdfNamespace.TEXT, "animation-stop-inside"));
    public final static OdfStyleProperty AnimationRepeat = 
        OdfStyleProperty.get(OdfStylePropertiesSet.GraphicProperties, OdfName.get(OdfNamespace.TEXT, "animation-repeat"));
    public final static OdfStyleProperty AnimationDelay = 
        OdfStyleProperty.get(OdfStylePropertiesSet.GraphicProperties, OdfName.get(OdfNamespace.TEXT, "animation-delay"));
    public final static OdfStyleProperty AnimationSteps = 
        OdfStyleProperty.get(OdfStylePropertiesSet.GraphicProperties, OdfName.get(OdfNamespace.TEXT, "animation-steps"));
    public final static OdfStyleProperty AutoGrowWidth = 
        OdfStyleProperty.get(OdfStylePropertiesSet.GraphicProperties, OdfName.get(OdfNamespace.DRAW, "auto-grow-width"));
    public final static OdfStyleProperty AutoGrowHeight = 
        OdfStyleProperty.get(OdfStylePropertiesSet.GraphicProperties, OdfName.get(OdfNamespace.DRAW, "auto-grow-height"));
    public final static OdfStyleProperty FitToSize = 
        OdfStyleProperty.get(OdfStylePropertiesSet.GraphicProperties, OdfName.get(OdfNamespace.DRAW, "fit-to-size"));
    public final static OdfStyleProperty FitToContour = 
        OdfStyleProperty.get(OdfStylePropertiesSet.GraphicProperties, OdfName.get(OdfNamespace.DRAW, "fit-to-contour"));
    public final static OdfStyleProperty TextareaVerticalAlign = 
        OdfStyleProperty.get(OdfStylePropertiesSet.GraphicProperties, OdfName.get(OdfNamespace.DRAW, "textarea-vertical-align"));
    public final static OdfStyleProperty TextareaHorizontalAlign = 
        OdfStyleProperty.get(OdfStylePropertiesSet.GraphicProperties, OdfName.get(OdfNamespace.DRAW, "textarea-horizontal-align"));
    public final static OdfStyleProperty WrapOption = 
        OdfStyleProperty.get(OdfStylePropertiesSet.GraphicProperties, OdfName.get(OdfNamespace.FO, "wrap-option"));
    public final static OdfStyleProperty ColorMode = 
        OdfStyleProperty.get(OdfStylePropertiesSet.GraphicProperties, OdfName.get(OdfNamespace.DRAW, "color-mode"));
    public final static OdfStyleProperty ColorInversion = 
        OdfStyleProperty.get(OdfStylePropertiesSet.GraphicProperties, OdfName.get(OdfNamespace.DRAW, "color-inversion"));
    public final static OdfStyleProperty Luminance = 
        OdfStyleProperty.get(OdfStylePropertiesSet.GraphicProperties, OdfName.get(OdfNamespace.DRAW, "luminance"));
    public final static OdfStyleProperty Contrast = 
        OdfStyleProperty.get(OdfStylePropertiesSet.GraphicProperties, OdfName.get(OdfNamespace.DRAW, "contrast"));
    public final static OdfStyleProperty Gamma = 
        OdfStyleProperty.get(OdfStylePropertiesSet.GraphicProperties, OdfName.get(OdfNamespace.DRAW, "gamma"));
    public final static OdfStyleProperty Red = 
        OdfStyleProperty.get(OdfStylePropertiesSet.GraphicProperties, OdfName.get(OdfNamespace.DRAW, "red"));
    public final static OdfStyleProperty Green = 
        OdfStyleProperty.get(OdfStylePropertiesSet.GraphicProperties, OdfName.get(OdfNamespace.DRAW, "green"));
    public final static OdfStyleProperty Blue = 
        OdfStyleProperty.get(OdfStylePropertiesSet.GraphicProperties, OdfName.get(OdfNamespace.DRAW, "blue"));
    public final static OdfStyleProperty ImageOpacity = 
        OdfStyleProperty.get(OdfStylePropertiesSet.GraphicProperties, OdfName.get(OdfNamespace.DRAW, "image-opacity"));
    public final static OdfStyleProperty ShadowDraw = 
        OdfStyleProperty.get(OdfStylePropertiesSet.GraphicProperties, OdfName.get(OdfNamespace.DRAW, "shadow"));
    public final static OdfStyleProperty ShadowOffsetX = 
        OdfStyleProperty.get(OdfStylePropertiesSet.GraphicProperties, OdfName.get(OdfNamespace.DRAW, "shadow-offset-x"));
    public final static OdfStyleProperty ShadowOffsetY = 
        OdfStyleProperty.get(OdfStylePropertiesSet.GraphicProperties, OdfName.get(OdfNamespace.DRAW, "shadow-offset-y"));
    public final static OdfStyleProperty ShadowColor = 
        OdfStyleProperty.get(OdfStylePropertiesSet.GraphicProperties, OdfName.get(OdfNamespace.DRAW, "shadow-color"));
    public final static OdfStyleProperty ShadowOpacity = 
        OdfStyleProperty.get(OdfStylePropertiesSet.GraphicProperties, OdfName.get(OdfNamespace.DRAW, "shadow-opacity"));
    public final static OdfStyleProperty StartLineSpacingHorizontal = 
        OdfStyleProperty.get(OdfStylePropertiesSet.GraphicProperties, OdfName.get(OdfNamespace.DRAW, "start-line-spacing-horizontal"));
    public final static OdfStyleProperty StartLineSpacingVertical = 
        OdfStyleProperty.get(OdfStylePropertiesSet.GraphicProperties, OdfName.get(OdfNamespace.DRAW, "start-line-spacing-vertical"));
    public final static OdfStyleProperty EndLineSpacingHorizontal = 
        OdfStyleProperty.get(OdfStylePropertiesSet.GraphicProperties, OdfName.get(OdfNamespace.DRAW, "end-line-spacing-horizontal"));
    public final static OdfStyleProperty EndLineSpacingVertical = 
        OdfStyleProperty.get(OdfStylePropertiesSet.GraphicProperties, OdfName.get(OdfNamespace.DRAW, "end-line-spacing-vertical"));
    public final static OdfStyleProperty LineDistance = 
        OdfStyleProperty.get(OdfStylePropertiesSet.GraphicProperties, OdfName.get(OdfNamespace.DRAW, "line-distance"));
    public final static OdfStyleProperty GuideOverhang = 
        OdfStyleProperty.get(OdfStylePropertiesSet.GraphicProperties, OdfName.get(OdfNamespace.DRAW, "guide-overhang"));
    public final static OdfStyleProperty GuideDistance = 
        OdfStyleProperty.get(OdfStylePropertiesSet.GraphicProperties, OdfName.get(OdfNamespace.DRAW, "guide-distance"));
    public final static OdfStyleProperty StartGuide = 
        OdfStyleProperty.get(OdfStylePropertiesSet.GraphicProperties, OdfName.get(OdfNamespace.DRAW, "start-guide"));
    public final static OdfStyleProperty EndGuide = 
        OdfStyleProperty.get(OdfStylePropertiesSet.GraphicProperties, OdfName.get(OdfNamespace.DRAW, "end-guide"));
    public final static OdfStyleProperty Placing = 
        OdfStyleProperty.get(OdfStylePropertiesSet.GraphicProperties, OdfName.get(OdfNamespace.DRAW, "placing"));
    public final static OdfStyleProperty Parallel = 
        OdfStyleProperty.get(OdfStylePropertiesSet.GraphicProperties, OdfName.get(OdfNamespace.DRAW, "parallel"));
    public final static OdfStyleProperty MeasureAlign = 
        OdfStyleProperty.get(OdfStylePropertiesSet.GraphicProperties, OdfName.get(OdfNamespace.DRAW, "measure-align"));
    public final static OdfStyleProperty MeasureVerticalAlign = 
        OdfStyleProperty.get(OdfStylePropertiesSet.GraphicProperties, OdfName.get(OdfNamespace.DRAW, "measure-vertical-align"));
    public final static OdfStyleProperty Unit = 
        OdfStyleProperty.get(OdfStylePropertiesSet.GraphicProperties, OdfName.get(OdfNamespace.DRAW, "unit"));
    public final static OdfStyleProperty ShowUnit = 
        OdfStyleProperty.get(OdfStylePropertiesSet.GraphicProperties, OdfName.get(OdfNamespace.DRAW, "show-unit"));
    public final static OdfStyleProperty DecimalPlaces = 
        OdfStyleProperty.get(OdfStylePropertiesSet.GraphicProperties, OdfName.get(OdfNamespace.DRAW, "decimal-places"));
    public final static OdfStyleProperty CaptionType = 
        OdfStyleProperty.get(OdfStylePropertiesSet.GraphicProperties, OdfName.get(OdfNamespace.DRAW, "caption-type"));
    public final static OdfStyleProperty CaptionAngleType = 
        OdfStyleProperty.get(OdfStylePropertiesSet.GraphicProperties, OdfName.get(OdfNamespace.DRAW, "caption-angle-type"));
    public final static OdfStyleProperty CaptionAngle = 
        OdfStyleProperty.get(OdfStylePropertiesSet.GraphicProperties, OdfName.get(OdfNamespace.DRAW, "caption-angle"));
    public final static OdfStyleProperty CaptionGap = 
        OdfStyleProperty.get(OdfStylePropertiesSet.GraphicProperties, OdfName.get(OdfNamespace.DRAW, "caption-gap"));
    public final static OdfStyleProperty CaptionEscapeDirection = 
        OdfStyleProperty.get(OdfStylePropertiesSet.GraphicProperties, OdfName.get(OdfNamespace.DRAW, "caption-escape-direction"));
    public final static OdfStyleProperty CaptionEscape = 
        OdfStyleProperty.get(OdfStylePropertiesSet.GraphicProperties, OdfName.get(OdfNamespace.DRAW, "caption-escape"));
    public final static OdfStyleProperty CaptionLineLength = 
        OdfStyleProperty.get(OdfStylePropertiesSet.GraphicProperties, OdfName.get(OdfNamespace.DRAW, "caption-line-length"));
    public final static OdfStyleProperty CaptionFitLineLength = 
        OdfStyleProperty.get(OdfStylePropertiesSet.GraphicProperties, OdfName.get(OdfNamespace.DRAW, "caption-fit-line-length"));
    public final static OdfStyleProperty HorizontalSegments = 
        OdfStyleProperty.get(OdfStylePropertiesSet.GraphicProperties, OdfName.get(OdfNamespace.DR3D, "horizontal-segments"));
    public final static OdfStyleProperty VerticalSegments = 
        OdfStyleProperty.get(OdfStylePropertiesSet.GraphicProperties, OdfName.get(OdfNamespace.DR3D, "vertical-segments"));
    public final static OdfStyleProperty EdgeRounding = 
        OdfStyleProperty.get(OdfStylePropertiesSet.GraphicProperties, OdfName.get(OdfNamespace.DR3D, "edge-rounding"));
    public final static OdfStyleProperty EdgeRoundingMode = 
        OdfStyleProperty.get(OdfStylePropertiesSet.GraphicProperties, OdfName.get(OdfNamespace.DR3D, "edge-rounding-mode"));
    public final static OdfStyleProperty BackScale = 
        OdfStyleProperty.get(OdfStylePropertiesSet.GraphicProperties, OdfName.get(OdfNamespace.DR3D, "back-scale"));
    public final static OdfStyleProperty Depth = 
        OdfStyleProperty.get(OdfStylePropertiesSet.GraphicProperties, OdfName.get(OdfNamespace.DR3D, "depth"));
    public final static OdfStyleProperty BackfaceCulling = 
        OdfStyleProperty.get(OdfStylePropertiesSet.GraphicProperties, OdfName.get(OdfNamespace.DR3D, "backface-culling"));
    public final static OdfStyleProperty EndAngle = 
        OdfStyleProperty.get(OdfStylePropertiesSet.GraphicProperties, OdfName.get(OdfNamespace.DR3D, "end-angle"));
    public final static OdfStyleProperty CloseFront = 
        OdfStyleProperty.get(OdfStylePropertiesSet.GraphicProperties, OdfName.get(OdfNamespace.DR3D, "close-front"));
    public final static OdfStyleProperty CloseBack = 
        OdfStyleProperty.get(OdfStylePropertiesSet.GraphicProperties, OdfName.get(OdfNamespace.DR3D, "close-back"));
    public final static OdfStyleProperty LightingMode = 
        OdfStyleProperty.get(OdfStylePropertiesSet.GraphicProperties, OdfName.get(OdfNamespace.DR3D, "lighting-mode"));
    public final static OdfStyleProperty NormalsKind = 
        OdfStyleProperty.get(OdfStylePropertiesSet.GraphicProperties, OdfName.get(OdfNamespace.DR3D, "normals-kind"));
    public final static OdfStyleProperty NormalsDirection = 
        OdfStyleProperty.get(OdfStylePropertiesSet.GraphicProperties, OdfName.get(OdfNamespace.DR3D, "normals-direction"));
    public final static OdfStyleProperty TextureGenerationModeX = 
        OdfStyleProperty.get(OdfStylePropertiesSet.GraphicProperties, OdfName.get(OdfNamespace.DR3D, "texture-generation-mode-x"));
    public final static OdfStyleProperty TextureGenerationModeY = 
        OdfStyleProperty.get(OdfStylePropertiesSet.GraphicProperties, OdfName.get(OdfNamespace.DR3D, "texture-generation-mode-y"));
    public final static OdfStyleProperty TextureKind = 
        OdfStyleProperty.get(OdfStylePropertiesSet.GraphicProperties, OdfName.get(OdfNamespace.DR3D, "texture-kind"));
    public final static OdfStyleProperty TextureFilter = 
        OdfStyleProperty.get(OdfStylePropertiesSet.GraphicProperties, OdfName.get(OdfNamespace.DR3D, "texture-filter"));
    public final static OdfStyleProperty TextureMode = 
        OdfStyleProperty.get(OdfStylePropertiesSet.GraphicProperties, OdfName.get(OdfNamespace.DR3D, "texture-mode"));
    public final static OdfStyleProperty AmbientColor = 
        OdfStyleProperty.get(OdfStylePropertiesSet.GraphicProperties, OdfName.get(OdfNamespace.DR3D, "ambient-color"));
    public final static OdfStyleProperty EmissiveColor = 
        OdfStyleProperty.get(OdfStylePropertiesSet.GraphicProperties, OdfName.get(OdfNamespace.DR3D, "emissive-color"));
    public final static OdfStyleProperty SpecularColor = 
        OdfStyleProperty.get(OdfStylePropertiesSet.GraphicProperties, OdfName.get(OdfNamespace.DR3D, "specular-color"));
    public final static OdfStyleProperty DiffuseColor = 
        OdfStyleProperty.get(OdfStylePropertiesSet.GraphicProperties, OdfName.get(OdfNamespace.DR3D, "diffuse-color"));
    public final static OdfStyleProperty Shininess = 
        OdfStyleProperty.get(OdfStylePropertiesSet.GraphicProperties, OdfName.get(OdfNamespace.DR3D, "shininess"));
    public final static OdfStyleProperty Shadow3d = 
        OdfStyleProperty.get(OdfStylePropertiesSet.GraphicProperties, OdfName.get(OdfNamespace.DR3D, "shadow"));
    public final static OdfStyleProperty Width = 
        OdfStyleProperty.get(OdfStylePropertiesSet.GraphicProperties, OdfName.get(OdfNamespace.SVG, "width"));
    public final static OdfStyleProperty Height = 
        OdfStyleProperty.get(OdfStylePropertiesSet.GraphicProperties, OdfName.get(OdfNamespace.SVG, "height"));
    public final static OdfStyleProperty RelWidth = 
        OdfStyleProperty.get(OdfStylePropertiesSet.GraphicProperties, OdfName.get(OdfNamespace.STYLE, "rel-width"));
    public final static OdfStyleProperty RelHeight = 
        OdfStyleProperty.get(OdfStylePropertiesSet.GraphicProperties, OdfName.get(OdfNamespace.STYLE, "rel-height"));
    public final static OdfStyleProperty MinWidth = 
        OdfStyleProperty.get(OdfStylePropertiesSet.GraphicProperties, OdfName.get(OdfNamespace.FO, "min-width"));
    public final static OdfStyleProperty MinHeight = 
        OdfStyleProperty.get(OdfStylePropertiesSet.GraphicProperties, OdfName.get(OdfNamespace.FO, "min-height"));
    public final static OdfStyleProperty MaxHeight = 
        OdfStyleProperty.get(OdfStylePropertiesSet.GraphicProperties, OdfName.get(OdfNamespace.FO, "max-height"));
    public final static OdfStyleProperty MaxWidth = 
        OdfStyleProperty.get(OdfStylePropertiesSet.GraphicProperties, OdfName.get(OdfNamespace.FO, "max-width"));
    public final static OdfStyleProperty MarginLeft = 
        OdfStyleProperty.get(OdfStylePropertiesSet.GraphicProperties, OdfName.get(OdfNamespace.FO, "margin-left"));
    public final static OdfStyleProperty MarginRight = 
        OdfStyleProperty.get(OdfStylePropertiesSet.GraphicProperties, OdfName.get(OdfNamespace.FO, "margin-right"));
    public final static OdfStyleProperty MarginTop = 
        OdfStyleProperty.get(OdfStylePropertiesSet.GraphicProperties, OdfName.get(OdfNamespace.FO, "margin-top"));
    public final static OdfStyleProperty MarginBottom = 
        OdfStyleProperty.get(OdfStylePropertiesSet.GraphicProperties, OdfName.get(OdfNamespace.FO, "margin-bottom"));
    public final static OdfStyleProperty Margin = 
        OdfStyleProperty.get(OdfStylePropertiesSet.GraphicProperties, OdfName.get(OdfNamespace.FO, "margin"));
    public final static OdfStyleProperty PrintContent = 
        OdfStyleProperty.get(OdfStylePropertiesSet.GraphicProperties, OdfName.get(OdfNamespace.STYLE, "print-content"));
    public final static OdfStyleProperty Protect = 
        OdfStyleProperty.get(OdfStylePropertiesSet.GraphicProperties, OdfName.get(OdfNamespace.STYLE, "protect"));
    public final static OdfStyleProperty HorizontalPos = 
        OdfStyleProperty.get(OdfStylePropertiesSet.GraphicProperties, OdfName.get(OdfNamespace.STYLE, "horizontal-pos"));
    public final static OdfStyleProperty X = 
        OdfStyleProperty.get(OdfStylePropertiesSet.GraphicProperties, OdfName.get(OdfNamespace.SVG, "x"));
    public final static OdfStyleProperty HorizontalRel = 
        OdfStyleProperty.get(OdfStylePropertiesSet.GraphicProperties, OdfName.get(OdfNamespace.STYLE, "horizontal-rel"));
    public final static OdfStyleProperty VerticalPos = 
        OdfStyleProperty.get(OdfStylePropertiesSet.GraphicProperties, OdfName.get(OdfNamespace.STYLE, "vertical-pos"));
    public final static OdfStyleProperty Y = 
        OdfStyleProperty.get(OdfStylePropertiesSet.GraphicProperties, OdfName.get(OdfNamespace.SVG, "y"));
    public final static OdfStyleProperty VerticalRel = 
        OdfStyleProperty.get(OdfStylePropertiesSet.GraphicProperties, OdfName.get(OdfNamespace.STYLE, "vertical-rel"));
    public final static OdfStyleProperty AnchorType = 
        OdfStyleProperty.get(OdfStylePropertiesSet.GraphicProperties, OdfName.get(OdfNamespace.TEXT, "anchor-type"));
    public final static OdfStyleProperty AnchorPageNumber = 
        OdfStyleProperty.get(OdfStylePropertiesSet.GraphicProperties, OdfName.get(OdfNamespace.TEXT, "anchor-page-number"));
    public final static OdfStyleProperty Border = 
        OdfStyleProperty.get(OdfStylePropertiesSet.GraphicProperties, OdfName.get(OdfNamespace.FO, "border"));
    public final static OdfStyleProperty BorderTop = 
        OdfStyleProperty.get(OdfStylePropertiesSet.GraphicProperties, OdfName.get(OdfNamespace.FO, "border-top"));
    public final static OdfStyleProperty BorderBottom = 
        OdfStyleProperty.get(OdfStylePropertiesSet.GraphicProperties, OdfName.get(OdfNamespace.FO, "border-bottom"));
    public final static OdfStyleProperty BorderLeft = 
        OdfStyleProperty.get(OdfStylePropertiesSet.GraphicProperties, OdfName.get(OdfNamespace.FO, "border-left"));
    public final static OdfStyleProperty BorderRight = 
        OdfStyleProperty.get(OdfStylePropertiesSet.GraphicProperties, OdfName.get(OdfNamespace.FO, "border-right"));
    public final static OdfStyleProperty BorderLineWidth = 
        OdfStyleProperty.get(OdfStylePropertiesSet.GraphicProperties, OdfName.get(OdfNamespace.STYLE, "border-line-width"));
    public final static OdfStyleProperty BorderLineWidthTop = 
        OdfStyleProperty.get(OdfStylePropertiesSet.GraphicProperties, OdfName.get(OdfNamespace.STYLE, "border-line-width-top"));
    public final static OdfStyleProperty BorderLineWidthBottom = 
        OdfStyleProperty.get(OdfStylePropertiesSet.GraphicProperties, OdfName.get(OdfNamespace.STYLE, "border-line-width-bottom"));
    public final static OdfStyleProperty BorderLineWidthLeft = 
        OdfStyleProperty.get(OdfStylePropertiesSet.GraphicProperties, OdfName.get(OdfNamespace.STYLE, "border-line-width-left"));
    public final static OdfStyleProperty BorderLineWidthRight = 
        OdfStyleProperty.get(OdfStylePropertiesSet.GraphicProperties, OdfName.get(OdfNamespace.STYLE, "border-line-width-right"));
    public final static OdfStyleProperty Padding = 
        OdfStyleProperty.get(OdfStylePropertiesSet.GraphicProperties, OdfName.get(OdfNamespace.FO, "padding"));
    public final static OdfStyleProperty PaddingTop = 
        OdfStyleProperty.get(OdfStylePropertiesSet.GraphicProperties, OdfName.get(OdfNamespace.FO, "padding-top"));
    public final static OdfStyleProperty PaddingBottom = 
        OdfStyleProperty.get(OdfStylePropertiesSet.GraphicProperties, OdfName.get(OdfNamespace.FO, "padding-bottom"));
    public final static OdfStyleProperty PaddingLeft = 
        OdfStyleProperty.get(OdfStylePropertiesSet.GraphicProperties, OdfName.get(OdfNamespace.FO, "padding-left"));
    public final static OdfStyleProperty PaddingRight = 
        OdfStyleProperty.get(OdfStylePropertiesSet.GraphicProperties, OdfName.get(OdfNamespace.FO, "padding-right"));
    public final static OdfStyleProperty Shadow = 
        OdfStyleProperty.get(OdfStylePropertiesSet.GraphicProperties, OdfName.get(OdfNamespace.STYLE, "shadow"));
    public final static OdfStyleProperty BackgroundColor = 
        OdfStyleProperty.get(OdfStylePropertiesSet.GraphicProperties, OdfName.get(OdfNamespace.FO, "background-color"));
    public final static OdfStyleProperty Editable = 
        OdfStyleProperty.get(OdfStylePropertiesSet.GraphicProperties, OdfName.get(OdfNamespace.STYLE, "editable"));
    public final static OdfStyleProperty Wrap = 
        OdfStyleProperty.get(OdfStylePropertiesSet.GraphicProperties, OdfName.get(OdfNamespace.STYLE, "wrap"));
    public final static OdfStyleProperty WrapDynamicThreshold = 
        OdfStyleProperty.get(OdfStylePropertiesSet.GraphicProperties, OdfName.get(OdfNamespace.STYLE, "wrap-dynamic-threshold"));
    public final static OdfStyleProperty NumberWrappedParagraphs = 
        OdfStyleProperty.get(OdfStylePropertiesSet.GraphicProperties, OdfName.get(OdfNamespace.STYLE, "number-wrapped-paragraphs"));
    public final static OdfStyleProperty WrapContour = 
        OdfStyleProperty.get(OdfStylePropertiesSet.GraphicProperties, OdfName.get(OdfNamespace.STYLE, "wrap-contour"));
    public final static OdfStyleProperty WrapContourMode = 
        OdfStyleProperty.get(OdfStylePropertiesSet.GraphicProperties, OdfName.get(OdfNamespace.STYLE, "wrap-contour-mode"));
    public final static OdfStyleProperty RunThrough = 
        OdfStyleProperty.get(OdfStylePropertiesSet.GraphicProperties, OdfName.get(OdfNamespace.STYLE, "run-through"));
    public final static OdfStyleProperty FlowWithText = 
        OdfStyleProperty.get(OdfStylePropertiesSet.GraphicProperties, OdfName.get(OdfNamespace.STYLE, "flow-with-text"));
    public final static OdfStyleProperty OverflowBehavior = 
        OdfStyleProperty.get(OdfStylePropertiesSet.GraphicProperties, OdfName.get(OdfNamespace.STYLE, "overflow-behavior"));
    public final static OdfStyleProperty Mirror = 
        OdfStyleProperty.get(OdfStylePropertiesSet.GraphicProperties, OdfName.get(OdfNamespace.STYLE, "mirror"));
    public final static OdfStyleProperty Clip = 
        OdfStyleProperty.get(OdfStylePropertiesSet.GraphicProperties, OdfName.get(OdfNamespace.FO, "clip"));
    public final static OdfStyleProperty WrapInfluenceOnPosition = 
        OdfStyleProperty.get(OdfStylePropertiesSet.GraphicProperties, OdfName.get(OdfNamespace.DRAW, "wrap-influence-on-position"));
    public final static OdfStyleProperty WritingMode = 
        OdfStyleProperty.get(OdfStylePropertiesSet.GraphicProperties, OdfName.get(OdfNamespace.STYLE, "writing-mode"));
    public final static OdfStyleProperty FrameDisplayScrollbar = 
        OdfStyleProperty.get(OdfStylePropertiesSet.GraphicProperties, OdfName.get(OdfNamespace.DRAW, "frame-display-scrollbar"));
    public final static OdfStyleProperty FrameDisplayBorder = 
        OdfStyleProperty.get(OdfStylePropertiesSet.GraphicProperties, OdfName.get(OdfNamespace.DRAW, "frame-display-border"));
    public final static OdfStyleProperty FrameMarginHorizontal = 
        OdfStyleProperty.get(OdfStylePropertiesSet.GraphicProperties, OdfName.get(OdfNamespace.DRAW, "frame-margin-horizontal"));
    public final static OdfStyleProperty FrameMarginVertical = 
        OdfStyleProperty.get(OdfStylePropertiesSet.GraphicProperties, OdfName.get(OdfNamespace.DRAW, "frame-margin-vertical"));
    public final static OdfStyleProperty VisibleAreaLeft = 
        OdfStyleProperty.get(OdfStylePropertiesSet.GraphicProperties, OdfName.get(OdfNamespace.DRAW, "visible-area-left"));
    public final static OdfStyleProperty VisibleAreaTop = 
        OdfStyleProperty.get(OdfStylePropertiesSet.GraphicProperties, OdfName.get(OdfNamespace.DRAW, "visible-area-top"));
    public final static OdfStyleProperty VisibleAreaWidth = 
        OdfStyleProperty.get(OdfStylePropertiesSet.GraphicProperties, OdfName.get(OdfNamespace.DRAW, "visible-area-width"));
    public final static OdfStyleProperty VisibleAreaHeight = 
        OdfStyleProperty.get(OdfStylePropertiesSet.GraphicProperties, OdfName.get(OdfNamespace.DRAW, "visible-area-height"));
    public final static OdfStyleProperty OleDrawAspect = 
        OdfStyleProperty.get(OdfStylePropertiesSet.GraphicProperties, OdfName.get(OdfNamespace.DRAW, "ole-draw-aspect"));
    public final static OdfStyleProperty Fill = 
        OdfStyleProperty.get(OdfStylePropertiesSet.GraphicProperties, OdfName.get(OdfNamespace.DRAW, "fill"));
    public final static OdfStyleProperty FillColor = 
        OdfStyleProperty.get(OdfStylePropertiesSet.GraphicProperties, OdfName.get(OdfNamespace.DRAW, "fill-color"));
    public final static OdfStyleProperty SecondaryFillColor = 
        OdfStyleProperty.get(OdfStylePropertiesSet.GraphicProperties, OdfName.get(OdfNamespace.DRAW, "secondary-fill-color"));
    public final static OdfStyleProperty FillGradientName = 
        OdfStyleProperty.get(OdfStylePropertiesSet.GraphicProperties, OdfName.get(OdfNamespace.DRAW, "fill-gradient-name"));
    public final static OdfStyleProperty GradientStepCount = 
        OdfStyleProperty.get(OdfStylePropertiesSet.GraphicProperties, OdfName.get(OdfNamespace.DRAW, "gradient-step-count"));
    public final static OdfStyleProperty FillHatchName = 
        OdfStyleProperty.get(OdfStylePropertiesSet.GraphicProperties, OdfName.get(OdfNamespace.DRAW, "fill-hatch-name"));
    public final static OdfStyleProperty FillHatchSolid = 
        OdfStyleProperty.get(OdfStylePropertiesSet.GraphicProperties, OdfName.get(OdfNamespace.DRAW, "fill-hatch-solid"));
    public final static OdfStyleProperty FillImageName = 
        OdfStyleProperty.get(OdfStylePropertiesSet.GraphicProperties, OdfName.get(OdfNamespace.DRAW, "fill-image-name"));
    public final static OdfStyleProperty Repeat = 
        OdfStyleProperty.get(OdfStylePropertiesSet.GraphicProperties, OdfName.get(OdfNamespace.STYLE, "repeat"));
    public final static OdfStyleProperty FillImageWidth = 
        OdfStyleProperty.get(OdfStylePropertiesSet.GraphicProperties, OdfName.get(OdfNamespace.DRAW, "fill-image-width"));
    public final static OdfStyleProperty FillImageHeight = 
        OdfStyleProperty.get(OdfStylePropertiesSet.GraphicProperties, OdfName.get(OdfNamespace.DRAW, "fill-image-height"));
    public final static OdfStyleProperty FillImageRefPointX = 
        OdfStyleProperty.get(OdfStylePropertiesSet.GraphicProperties, OdfName.get(OdfNamespace.DRAW, "fill-image-ref-point-x"));
    public final static OdfStyleProperty FillImageRefPointY = 
        OdfStyleProperty.get(OdfStylePropertiesSet.GraphicProperties, OdfName.get(OdfNamespace.DRAW, "fill-image-ref-point-y"));
    public final static OdfStyleProperty FillImageRefPoint = 
        OdfStyleProperty.get(OdfStylePropertiesSet.GraphicProperties, OdfName.get(OdfNamespace.DRAW, "fill-image-ref-point"));
    public final static OdfStyleProperty TileRepeatOffset = 
        OdfStyleProperty.get(OdfStylePropertiesSet.GraphicProperties, OdfName.get(OdfNamespace.DRAW, "tile-repeat-offset"));
    public final static OdfStyleProperty Opacity = 
        OdfStyleProperty.get(OdfStylePropertiesSet.GraphicProperties, OdfName.get(OdfNamespace.DRAW, "opacity"));
    public final static OdfStyleProperty OpacityName = 
        OdfStyleProperty.get(OdfStylePropertiesSet.GraphicProperties, OdfName.get(OdfNamespace.DRAW, "opacity-name"));
    public final static OdfStyleProperty FillRule = 
        OdfStyleProperty.get(OdfStylePropertiesSet.GraphicProperties, OdfName.get(OdfNamespace.SVG, "fill-rule"));

}